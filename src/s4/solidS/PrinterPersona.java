package s4.solidS;

//import org.json.JSONObject;
//import org.json.XML;

public class PrinterPersona {
    private Persona persona;

    public PrinterPersona(Persona persona) {
        this.persona = persona;
    }

    public void output () {
        System.out.println(persona.getNom() + ":" + persona.getEdat());
    }

    public String toJson() {
        //JSONObject jsonObject = new JSONObject(persona);
        //return jsonObject.toString();
        return "{nom: " + persona.getNom() +
                ", edat: " + persona.getEdat() +
                "}";

    }

    public String toCSV(char sep) {

        return persona.getNom() + sep + persona.getEdat();
    }

    public String toXML() {
        //return XML.toString(new JSONObject(persona));
        return "<persona><nom>" +
                persona.getNom() +
                "</nom><edat>" +
                persona.getEdat() +
                "</edat></persona>";
    }



}
