class CalculadoraTest {

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {

        Calculadora calculadora = new Calculadora();
        List<Integer> entradas = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
        List<Integer> resultados = IntStream.range(0, 1000).map(n -> n * 2).boxed().collect(Collectors.toList());

        return entradas.stream()
                .map(numero -> DynamicTest.dynamicTest("multiplicando: " + numero,
                        () -> {
                            assertEquals(calculadora.multiplica(numero, 2), resultados.get(numero));
                        }));
    }
}