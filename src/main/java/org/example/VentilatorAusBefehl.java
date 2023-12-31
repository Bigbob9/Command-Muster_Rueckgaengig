package org.example;

public class VentilatorAusBefehl implements Befehl{

    Ventilator ventilator;
    int letzteGeschwindigkeit;

    public VentilatorAusBefehl(Ventilator ventilator){
    this.ventilator = ventilator;

    }

    public void ausfuehren(){
        letzteGeschwindigkeit = ventilator.getStufe();
        ventilator.aus();
    }

    public void rueckgaengig() {
        if(letzteGeschwindigkeit == ventilator.SCHNELL){
            ventilator.schnell();
        } else if(letzteGeschwindigkeit == ventilator.MITTEL){
            ventilator.mittel();
        } else if(letzteGeschwindigkeit == ventilator.LANGSAM){
            ventilator.langsam();
        }else if(letzteGeschwindigkeit == ventilator.AUS){
            ventilator.aus();
        }


    }
}