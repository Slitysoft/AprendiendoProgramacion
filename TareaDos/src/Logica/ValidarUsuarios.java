
package Logica;

public class ValidarUsuarios {

    final int maxUsuarios = 4;
    private String usuarios[][] = new String[maxUsuarios][3];
    private String usuarioActual;

    public ValidarUsuarios() {
        usuarios[0][0] = "Israel";
        usuarios[0][1] = "Ingenet";
        usuarios[0][2] = "Israel Rodriguez";

        usuarios[1][0] = "Ricardo";
        usuarios[1][1] = "Ingenet2015";
        usuarios[1][2] = "Ricardo Hernandez";

        usuarios[2][0] = "Uriel";
        usuarios[2][1] = "1234";
        usuarios[2][2] = "Uriel Rodriguez";

    }
    
    public boolean RevisandoUsuario(String usuario, String pass){
        
        boolean llave = false;
        for (int i = 0; i < maxUsuarios - 1; i++) {
            
            if(usuarios [i][0].equals(usuario) &&  usuarios [i][1].equals(pass)){
                   llave = true;
                   usuarioActual = usuarios[i][2];
                   break;
                 
            }
            
            Operaciones opera = new Operaciones();
                    
                   
            
        }
               
        
        return llave; 
        
           }

    
    
    
    
    
    
    public String getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(String usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    
}
