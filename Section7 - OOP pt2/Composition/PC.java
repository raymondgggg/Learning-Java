public class PC {
    private Case theCase;//<--- Composition
    private Monitor monitor;//<---Composition 
    private Motherboard motherboard;// <----Composition //Did this for BST, but didn't know topic name was called composition

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        this.theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        this.monitor.drawPixelAt(1200, 50, "Yellow");
    }

  
}