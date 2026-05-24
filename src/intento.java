
import java.util.ArrayList;
//"Ejercicio incorrecto"


/*
public class usuario {
    private String nombre;
    private String email;


    public usurio(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    // necesito metodo para guardar en la base de datos el nombre de usuario y el email
    void save_to_database(String nombre){
        //mi codigo para guardar el usuario
    }
    void save_email( String email){
        //mi codigo para guardar el email

    }
    // no deberia guardar usuario por usuario si no la responsabilidad unica es que toda la clase hago lo suyo?


    }
//manera correcta
// mi clase
    class user{
    public user(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }
}
//delego la respoonsabilidad a la otra clase
    class userservice{
    void save_database( String user){

    }


    }
    */
//GESTION DE BILBIOTECA
class library {
    ArrayList<String[]> books;
    ArrayList<String> user;
    ArrayList<String> leans;

    //funcionalidades
    //registro de libros
    //
    public library(ArrayList<String[]> books, ArrayList<String> user, ArrayList<String> leans) {
        this.user = user;
        this.leans = leans;
        this.books = books;
    }

    //anadir libros
    public void add_book(String title, String author, String copias) {
        String[] book = new String[3];
        book[0] = title;
        book[1] = author;
        book[2] = copias;
        books.add(book);
    }
public void lean_book(String user_id, String book_title){
        for ( int i = 0; i<books.size();i++){
            int copias = Integer.parseInt(books.get(i)[2]);
            if (copias >0){
                books.get(i)[2] =  String.valueOf(copias - 1);
                System.out.println("Libro prestado");
            }



    }
}
}


