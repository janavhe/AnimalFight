package PokemonGame;

    public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected Integer vida;
    protected Integer ataque;

        public Pokemon() {
        }

        public Pokemon(String nombre, String tipo, Integer vida, Integer ataque) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.vida = vida;
            this.ataque = ataque;
        }

        public void pelea (Pokemon defensor){
            if (defensor instanceof Bicho && this instanceof Fuego){
                ((Bicho) defensor).debilContraFuego((Fuego) this);
            }else if (defensor instanceof Planta && this instanceof Fuego){
                ((Planta) defensor).debilContraFuego((Fuego) this);
            }else if (defensor instanceof Fuego && this instanceof Agua){
                ((Fuego) defensor).debilContraAgua((Agua) this);
            }else if (defensor instanceof Agua && this instanceof Planta){
                ((Agua) defensor).debilContraPlanta((Planta) this);
            }
            else {
                defensor.setVida(defensor.getVida() - this.ataque);
                System.out.println("La vida de "+defensor.nombre+" bajo a "+defensor.getVida());
            }

        }


    //setter and getters


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Integer getVida() {
            return vida;
        }

        public void setVida(Integer vida) {
            this.vida = vida;
        }

        public Integer getAtaque() {
            return ataque;
        }

        public void setAtaque(Integer ataque) {
            this.ataque = ataque;
        }
    }