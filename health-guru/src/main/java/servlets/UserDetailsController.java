package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import enums.Diet;
import models.User;

@WebServlet("/userDetails")
@MultipartConfig
public class UserDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserDetailsController() {
    }
    
    private void saveUserDetails(User u) {
    	MongoClientURI uri = new MongoClientURI(
				"mongodb://dev:123@cluster0-shard-00-00-gepbo.mongodb.net:27017,cluster0-shard-00-01-gepbo.mongodb.net:27017,cluster0-shard-00-02-gepbo.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("HealthGuru");
		MongoCollection<Document> collection =  database.getCollection("Users");
		Document doc = new Document("username",u.getUsername())
				.append("password",u.getPassword())
				.append("height",u.getHeight())
				.append("weightGoal", u.getWeightGoal())
				.append("currentWeight", u.getCurrentWeight())
				.append("startingWeight", u.getStartingWeight())
				.append("allergies", u.getFoodRestrictions())
				.append("diet", u.getDiet());
		  BasicDBObject whereQuery = new BasicDBObject();
		    whereQuery.put("username", u.getUsername());
		    collection.findOneAndDelete(whereQuery);
		    collection.insertOne(doc);
				
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("UserDetails.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		
		User user = new User();
		
//		List<String> strings = new ArrayList();
//		user.setFoodRestrictions(strings);
		
		user.setUsername((String)session.getAttribute("username"));
		user.setPassword((String)session.getAttribute("password"));
		
		String dietValue = request.getParameter("dietSelection");
		String heightValue = request.getParameter("height");
		String weightGoalValue = request.getParameter("weightGoal");
		String currentWeightValue = request.getParameter("currentWeight");
		String allergiesValue = request.getParameter("allergies");
//		System.out.println(dietValue);
//		System.out.println(heightValue);
//		System.out.println(weightGoalValue);
//		System.out.println(currentWeightValue);
//		System.out.println(allergiesValue);
		
		float currentWeight = Float.parseFloat(currentWeightValue);
		System.out.println("Line 67 "+ currentWeight);
		float weightGoal = Float.parseFloat(weightGoalValue);
		System.out.println("Line 69 "+weightGoal);
		float height = Float.parseFloat(heightValue);
		System.out.println("Line 72 "+height);
		
		String[] allergyVals = allergiesValue.split(",");
		
		for(int i = 0; i < allergyVals.length; i++) {
//			System.out.println(user.getFoodRestrictions());
			System.out.println(allergyVals[i]);
			user.foodRestrictions.add(allergyVals[i]);
		}
		user.setCurrentWeight(currentWeight);
		user.setWeightGoal(weightGoal);
		user.setHeight(height);
		user.setStartingWeight(currentWeight);
		
		Diet[] diets = Diet.values();
		for(Diet die : diets) {
			if(die.equals(dietValue)) {
				user.setDiet(die);
			}
		}
		
		
		
		session.setAttribute("user", user);
		
		response.sendRedirect("/guru/meals");
	}

}
