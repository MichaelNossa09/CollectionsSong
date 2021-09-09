
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
   
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Canciones c1 = new Canciones("The Mother We Share", (float) 3.16, "5 ago 2013", 
        "CHVRCHES", "Grupo", "The Bones Of What You Believe", "Alternativo");
        Canciones c2 = new Canciones("Graffiti", (float) 3.46, "9 oct 2018", 
        "CHVRCHES", "Grupo", "Love Is Dead", "Alternativo");
        Canciones c3 = new Canciones("Somebody Else - (Vevo Presents: Live at The O2, London)", 
        (float) 6.33, "29 ene 2017","The 1975", "Grupo",
        "I Like It When You Sleep, for You Are So Beautiful Yet So Unaware of It","Synth pop");
        Canciones c4 = new Canciones("After Hours", (float) 6.01, "19 feb 2020", 
        "The Weeknd", "Solista", "After", "Synth pop");
        Canciones c5 = new Canciones("Colors", (float) 4.14, "25 feb 2016", 
        "Halsey", "Solista", "Badlands", "Alternativo/ElectroPop");
        
        List<Canciones> canciones = new ArrayList<>();
        canciones.add(c1);
        canciones.add(c2);
        canciones.add(c3);
        canciones.add(c4);
        canciones.add(c5);
        
        System.out.println("Ingrese el numero de canciones que desea agregar: ");
        int nroCanciones = sc.nextInt();
        sc.nextLine();
        insertarCancion(canciones, nroCanciones);
        System.out.println("\nLISTADO ORDENADO ALFABETICAMENTE");
        System.out.println("---------------------------------");
        mCanAlfabet(canciones);
    }
    
    
    public static List<Canciones> insertarCancion(List<Canciones> e, int nroCanciones){
        Scanner sc = new Scanner(System.in);
        String nombreCancion="", fechaDeLanzamiento="", nombreArtista="", 
        nombreAlbum="",generoCancion="", tipoArtista="";
        float duracionCancion=-1;
        int dato=-1;
        
        for(int i=0; i<nroCanciones; i++){
            System.out.println("Ingrese nombre de la canción "+"["+(i+1)+"] :");
            nombreCancion = sc.nextLine();
            System.out.println("Ingrese duración de la canción (minutos): ");
            duracionCancion = sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese fecha de lanzamiento(Day/Mounth/Year): ");
            fechaDeLanzamiento = sc.nextLine();
            System.out.println("Ingrese nombre del artista: ");
            nombreArtista = sc.nextLine();
            System.out.println("Ingrese tipo de artista(1 o 2):\n1.Solita \t 2.Grupo");
            do{
            dato = sc.nextInt();
            if(dato == 1){
                tipoArtista="Solista";
            }else if(dato==2){
                tipoArtista="Grupo";
            }else{
                System.out.println("Verifique el dato por favor, 1 o 2 válidos");
            }
            }while(dato != 1 && dato != 2);
            sc.nextLine();
            System.out.println("Ingrese nombre del album: ");
            nombreAlbum = sc.nextLine();
            System.out.println("Ingrese genero de la cancion: ");
            generoCancion = sc.nextLine();
            e.add(new Canciones(nombreCancion, duracionCancion, fechaDeLanzamiento, 
            nombreArtista, tipoArtista, nombreAlbum, generoCancion));   
        }
        return e;
    }
    public static void mCanAlfabet(List<Canciones> e){
        Collections.sort(e);
        
        for(Canciones cancion : e) {
            System.out.println(cancion.toString());
        }
    }
    
    
}
