package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class loginController extends HttpServlet {
	private Map<String, String> users = new HashMap();

	private static final long serialVersionUID = 1L;

	public loginController() {
		fillMap();
	}

	private void fillMap() {

		MongoClientURI uri = new MongoClientURI(
				"mongodb://dev:123@cluster0-shard-00-00-gepbo.mongodb.net:27017,cluster0-shard-00-01-gepbo.mongodb.net:27017,cluster0-shard-00-02-gepbo.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("HealthGuru");
		MongoCollection<Document> collection = database.getCollection("HealthGuru");
		FindIterable<Document> docs = collection.find();
		
		for(Document document : docs) {
			String username = (String) document.get("username");
			String password = (String) document.get("password");
			
			users.put(username,password);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(password == users.get(username)) {
			response.sendRedirect("home");
		}else {
			doGet(request,response);
		}
	}

}
