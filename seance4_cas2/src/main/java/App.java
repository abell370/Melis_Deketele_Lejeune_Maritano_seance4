public class App {
    public static void main(String[] args) {
        IDataSource inputDataSource = new FileDataSource("input.txt");
        DataSourceDecorator dataSourceDecorator = new DataSourceDecorator(
                                                        new WhiteSpaceDataDecorator(
                                                                new SemicolonDataDecorator(
                                                                        new DotDataDecorator(
                                                                                new FileDataSource("output.txt")
                                                                        ))));
        DataSourceDecorator dataSourceDecoratorBis = new DataSourceDecorator(
                new WhiteSpaceDataDecorator(
                                new DotDataDecorator(
                                        new FileDataSource("outputbis.txt")
                                )));
        dataSourceDecorator.writeData(inputDataSource.readData());
        dataSourceDecoratorBis.writeData(inputDataSource.readData());
    }
}
