package onlyjavatechAnupam;

import onlyjavatechAnupam.dao.UserRepository;
import onlyjavatechAnupam.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@ComponentScan(basePackages = {"controllers", "onlyjavatechAnupam","tycontroller" ,"services","dao","helper"})
@SpringBootApplication
@EntityScan(basePackages = {"onlyjavatechAnupam.entities","entities "})  // Specify the package where entities are located
@EnableJpaRepositories(basePackages = "dao")  // Specify the package where repositories are located
public class  SpringBootProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);

		// Fetching the UserRepository bean
//		UserRepository userRepository = context.getBean(UserRepository.class);

		// Create and save a new User entity
//		User user = new User();
//		user.setName("Anupam Sharma");
//		user.setCity("Gorakhpur");
//		user.setStatus("I am a Java developer");
//
//		User user1 = userRepository.save(user);
//		System.out.println(user1);

		User user = new User();
		user.setName("Anupam Sharma");
		user.setCity("Gorakhpur");
		user.setStatus("I am a Java developer");

//		User user1 = userRepository.save(user);
//		System.out.println(user1);

//		User user2=new User();
//		user2.setName("Shaad");
//		user2.setCity("Deoria");
//		user2.setStatus("Pro Coder");
//
//		List<User> userList=new ArrayList<>();
//		userList.add(user);
//		userList.add(user2);
//
//		Iterable<User> newUserList=userRepository.saveAll(userList);
//
//		newUserList.forEach(userr->{
//			System.out.println(userr);
//		});
//

		//Update
//       Optional<User> val =userRepository.findById(1);
//	   User u1=val.get();
//	   u1.setName("Anupam Akki");
//	   userRepository.save(u1);
//	   System.out.println(u1);
//

		// Read all user

//		Iterable<User> itr=userRepository.findAll();
//		Iterator<User> it=itr.iterator();
//		while (it.hasNext()){
//			User u=it.next();
//			System.out.println(u);
//		}

		//deletion

//		userRepository.deleteById(1);
//		System.out.println("user of id 1 is deleted");

		//custum finder method

//		List<User> u=userRepository.findByName("Anupam Sharma");
//		System.out.println("The user by custom finder");
//
//		u.forEach(us-> System.out.println(us));


	}
}
