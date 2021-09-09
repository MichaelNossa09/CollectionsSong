
public class Canciones implements Comparable<Canciones> {
        
    private String nombreCancion;
    private float duracionCancion;
    private String fechaDeLanzamiento;
    private String nombreArtista;
    private String tipoArtista;
    private String nombreAlbum;
    private String generoCancion;

    public Canciones(String nombreCancion, float duracionCancion, String fechaDeLanzamiento, 
    String nombreArtista, String tipoArtista, String nombreAlbum, String generoCancion){
        
        this.nombreCancion = nombreCancion;
        this.duracionCancion = duracionCancion;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.nombreArtista = nombreArtista;
        this.tipoArtista = tipoArtista;
        this.nombreAlbum = nombreAlbum;
        this.generoCancion = generoCancion;
    }
    
    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public float getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(float duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(String fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(String tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getGeneroCancion() {
        return generoCancion;
    }

    public void setGeneroCancion(String generoCancion) {
        this.generoCancion = generoCancion;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombreCancion + "\nDuracion: " 
        + duracionCancion +" Minutos."+ "\nFechaDeLanzamiento: " + fechaDeLanzamiento + "\nArtista: "
        + nombreArtista + "\nTipo de Artista: " + tipoArtista + "\nAlbum: " + nombreAlbum + 
        "\nGenero: " + generoCancion;
    }

    @Override
    public int compareTo(Canciones t) {
        return nombreCancion.compareTo(t.getNombreCancion());
    }
    
    
    
}
