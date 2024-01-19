import java.util.HashMap;

public class Flughafen {

    public static HashMap<Integer, Flughafen> flughaefen = new HashMap<>();

    private final int flughafenId;
    private String bezeichnung;
    private String straße;
    private String hausnummer;
    private int plz;
    private String ort;


    public Flughafen(int flughafenId, String bezeichnung, String straße, String hausnummer, int plz, String ort){

        this.flughafenId = flughafenId;
        this.bezeichnung = bezeichnung;
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;

        flughaefen.put(flughafenId, this);

    }

    // Getter für flughafenId
    public int getFlughafenId(){
        return this.flughafenId;
    }

    // Getter und Setter für bezeichnung
    public String getBezeichnung(){
        return this.bezeichnung;
    }
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    // Getter und Setter für straße
    public String getStraße(){
        return this.straße;
    }
    public void setStraße(String straße){
        this.straße = straße;
    }

    // Getter und Setter für hausnummer
    public String getHausnummer(){
        return this.hausnummer;
    }
    public void setHausnummer(String hausnummer){
        this.hausnummer = hausnummer;
    }

    // Getter und Setter für plz
    public int getPlz(){
        return this.plz;
    }
    public void setPlz(int plz){
        this.plz = plz;
    }

    // Getter und Setter für ort
    public String getOrt(){
        return this.ort;
    }
    public void setOrt(String ort){
        this.ort = ort;
    }

}
