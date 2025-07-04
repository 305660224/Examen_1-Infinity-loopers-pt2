
package Evaluciones;  
import persons.Teacher;
/**
 *
 * Isaac chaves.
 */
public class evaluacion {
    public String Teacher;
    public String Curso;
    public double Nota;
    public String Observaciones;        

    
    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }

    public String getCurso() {
        return this.Curso;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

        public evaluacion(String Teacher, String Curso, double Nota, String Observaciones) {
        this.Teacher = Teacher;
        this.Curso = Curso;
        if ( Nota >= 8.0){
           return this.Nota;
        }
        System.out.println("Reprueba"){
       }
        this.Observaciones = Observaciones;
    }
    
    @Override
    public String toString() {
        return "evaluacion{" + "Docente=" + Teacher + ", Curso=" + Curso + ", Nota=" + Nota + ", Observaciones=" + Observaciones + '}';
    }
      
}
