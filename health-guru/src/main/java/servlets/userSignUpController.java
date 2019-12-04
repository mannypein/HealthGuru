package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import models.User;

@WebServlet("/signup")
@MultipartConfig
public class userSignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Create.jsp").forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		HttpSession session = request.getSession(true);		
		
		request.setAttribute("username", username);
		request.setAttribute("password", password);

		MongoClientURI uri = new MongoClientURI(
				"mongodb://dev:123@cluster0-shard-00-00-gepbo.mongodb.net:27017,cluster0-shard-00-01-gepbo.mongodb.net:27017,cluster0-shard-00-02-gepbo.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("HealthGuru");
		MongoCollection<Document> collection = database.getCollection("Users");
		Document doc = new Document("username",username)
				.append("password", password)
				.append("email", email);
		collection.insertOne(doc);
		response.sendRedirect("/guru/login");
		}
		
		
		
		
	

}
