public class Flareon extends Eevee { 
    
    public Flareon(String tipo, int altura, int hp, double peso) {
        super(tipo, altura, hp, peso);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
    
    @Override
    public String ataque(){
        return "Flash Fire";
    }
    @Override
    public String defesa(){
        return "Carga- Fire charge";
    }
    @Override
    public String especial(){
        return "Chama- Flame";
    }
}
