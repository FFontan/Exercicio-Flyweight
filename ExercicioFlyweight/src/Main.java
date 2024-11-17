public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "10,10", 5);
        formaManager.addForma("Verde", "20,20", 10);
        formaManager.addForma("Azul", "30,30", 15);
        formaManager.addForma("Vermelho", "50,50", 7);
        formaManager.addForma("Verde", "60,60", 12);

        formaManager.apresentar();
    }
}
