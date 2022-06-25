/* public class Java
//  {
//     public static int plusMethod(int x, int y);
//     return x+y;
//     public static void main(String[] args) {
//         int x = 4;
//         int y =5;
//         System.out.println(plusMethod(x, y));
// }
}*/ 

DVD[] dvdCollection = new DVD[15];

public class DVD{
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name,int releaseYear,String director)
    {
        this.name= name;
        this.releaseYear= releaseYear;
        this.director=director;
    }
    // randomcomment
public String toString(){
    return this.name + ", directed by" + this.director + ", released in" + this.releaseYear;
}

public static void main(String[] args) {
    System.out.println(dvdCollection.DVD[]);
}
    }
