package com.example.CRUD;




import jakarta.persistence.*;
import lombok.AllArgsConstructor; //making constructor
import lombok.Data; //all geter seter make
import lombok.NoArgsConstructor; //


// this is a entity class and it represents a table in database
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users") //give table name as users if not give it take class name
public class User {
    @Id //Need Primery Key
   @GeneratedValue(strategy = GenerationType.IDENTITY)//genrate id
   private long id ;

   @Column(unique = true , nullable = false)//unique and non null
   private String username ;

   @Column(nullable = false)
    private String password;

   @Column(nullable = false , unique = true)
   private String email;

}
