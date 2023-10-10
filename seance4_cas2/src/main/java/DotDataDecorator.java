public class DotDataDecorator extends DataSourceDecorator {

    public DotDataDecorator(IDataSource dataSource) {
        super(dataSource);
    }
    @Override
    public void writeData(String data) {
        super.writeData(this.replaceDotByNexLineTag(data));
    }

    private String replaceDotByNexLineTag(String data) {
        return data.replaceAll("\\.", "\n");
    }

    @Override
    public String readData() {
        return null;
    }
}
