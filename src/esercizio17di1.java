
    class Animal {
        public void hazSonido() {
            System.out.println("Hace un sonido genérico de animal.");
        }
    }

    class Gato extends Animal {
        @Override
        public void hazSonido() {
            System.out.println("El gato maúlla.");
        }
    }

    public class esercizio17di1  {
        public static void main(String[] args) {
            Animal animal = new Animal();
            Gato gato = new Gato();

            System.out.println("Sonido del animal:");
            animal.hazSonido();

            System.out.println("Sonido del gato:");
            gato.hazSonido();
        }
    }

