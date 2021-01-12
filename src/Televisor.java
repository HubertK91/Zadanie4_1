class Televisor {
    private boolean tvOn;
    
    void turnOn() {
        tvOn = true;
    }

    void turnOff() {
        tvOn = false;
    }

    void showStatus() {
        System.out.println("Telewizor jest włączony: " + tvOn);
    }


}
