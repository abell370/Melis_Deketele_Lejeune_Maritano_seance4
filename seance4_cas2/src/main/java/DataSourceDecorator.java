public class DataSourceDecorator implements IDataSource {
    private IDataSource dataSource;

    DataSourceDecorator(IDataSource source) {
        this.dataSource = source;
    }

    @Override
    public void writeData(String data) {
        this.dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return this.dataSource.readData();
    }
}
