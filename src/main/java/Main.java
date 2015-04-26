
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author Daniel Anderson de Freitas
 */
public class Main {

    public static void main(String[] args) {
 
        Date inicio = new Date();
        
        String meuNome = "Daniel Anderson de Freitas";
        
        System.out.println(meuNome.toUpperCase());   
        System.out.println(meuNome.substring(16) + ", " + meuNome.charAt(0) + ". " + meuNome.charAt(7) + ".\n");
        
        GregorianCalendar dataNascimento = new GregorianCalendar(1988, Calendar.AUGUST, 12);
        GregorianCalendar hoje = new GregorianCalendar();
                
        System.out.println((hoje.getTimeInMillis() - dataNascimento.getTimeInMillis()) / (24 * 60 * 60 * 1000));
        
        Date fim = new Date();
        
        System.out.println(fim.getTime() - inicio.getTime());
    }
}
