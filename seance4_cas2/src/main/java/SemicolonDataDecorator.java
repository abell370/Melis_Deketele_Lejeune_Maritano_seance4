public class SemicolonDataDecorator extends DataSourceDecorator {

    public SemicolonDataDecorator(IDataSource dataSource){
        super(dataSource);
    }
    @Override
    public void writeData(String data) {
        super.writeData(this.removeAllSemicolon(data));
    }

    private String removeAllSemicolon(String data) {
        return data.replaceAll(";", "");
    }

    @Override
    public String readData() {
        return null;
    }
}
