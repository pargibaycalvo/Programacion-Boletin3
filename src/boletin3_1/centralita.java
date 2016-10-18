
package boletin3_1;

public class centralita {
    private float km, litros, vMed, pgas;
    
    public centralita (){
    } 
    public centralita (float setKms, float setLitros, float setvMed, float setPGas){
        km = setKms;
        litros = setLitros;
        vMed = setvMed;
        pgas = setPGas;    
            
    }
    public float consumomedio(){
        return litros*100/km;
    }
    public float consumoeuros(){
        return pgas*consumomedio();
    }
    public float getTempo(){
        return vMed/km;
    }
    public void setKms(float kms){
        km = kms;
    }
    public void setLitros(float lit){
        litros = lit;
    }
    public void setvMed (float veloMed){
        vMed = veloMed;
    }
    public void setPGas (float preGas){
        pgas = preGas;
    }
    public float getvMed(){
        return vMed;
    }
    }
    
  
    

