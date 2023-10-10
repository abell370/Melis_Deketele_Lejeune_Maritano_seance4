public class WhiteSpaceDataDecorator extends DataSourceDecorator {

    public WhiteSpaceDataDecorator(IDataSource dataSource){
        super(dataSource);
    }
    @Override
    public void writeData(String data) {
        super.writeData(this.removeAllSpace(data));
    }

    private String removeAllSpace(String data) {
        return data.replaceAll("\\s", "");
    }

    @Override
    public String readData() {
        return null;
    }
}
