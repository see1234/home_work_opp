package HomeWork2.Ex1;
public class Radio implements SpeakInterface {
    private ZooPark zooPark;
    private String say;
    public Radio(String say) {
        this.say = say;
    }

    public ZooPark getZooPark() {
        return zooPark;
    }


    @Override
    public String say() {
        return "GOOD NIGHT";
    }
}
