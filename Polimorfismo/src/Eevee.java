public class Eevee {
    private String tipo;
    private int altura, hp;
    private double peso;


      // Método de ataque
      public String ataque() {
        return "Ataque rapido";
    }

    // Método de defesa
    public String defesa() {
        return "Desvio";
    }

    // Método especial
    public String especial() {
        return "Tri-ataque";
    }
    
    // Getter para tipo
    public String getTipo() {
        return tipo;
    }

    // Setter para tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter para altura
    public int getAltura() {
        return altura;
    }

    // Setter para altura
    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Getter para hp
    public int getHp() {
        return hp;
    }

    // Setter para hp
    public void setHp(int hp) {
        this.hp = hp;
    }

    // Getter para peso
    public double getPeso() {
        return peso;
    }

    // Setter para peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

  
    
}