package frete;

public class FreteFactory {

    public static Frete obterFrete(String tipo) {
        Object objeto = null;
        try {
            Class<?> classe = Class.forName("frete.Frete" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Frete inexistente");
        }
        if (!(objeto instanceof Frete)) {
            throw new IllegalArgumentException("Frete inválido");
        }
        return (Frete) objeto;
    }
}
