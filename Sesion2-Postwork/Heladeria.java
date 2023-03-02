public class Heladeria {

    public static void main(String [] args) {
        Helado suave = new HeladoSuave();

        // Se modificaron las salidas a pantalla del proyecto original para identificar
        // más claramente el funcionamiento del patrón Decorator

        System.out.println("[Lista de precios:]");

        // primera salida sin el uso de Decorator
        System.out.println(suave.getDescription() + " $" + suave.getPrice());

        suave = new CoberturaDecorator(suave);
        System.out.println(suave.getDescription() + " $" + suave.getPrice());

        suave = new GranolaDecorator(suave);
        System.out.println(suave.getDescription() + " $" + suave.getPrice());

        suave = new ToppingDecorator(suave);
        System.out.println(suave.getDescription() + " $" + suave.getPrice());

        suave = new MermeladaDecorator(suave);
        System.out.println(suave.getDescription() + " $" + suave.getPrice());

        suave = new GalletaDecorator(suave);
        System.out.println(suave.getDescription() + " $" + suave.getPrice());
    }
}
