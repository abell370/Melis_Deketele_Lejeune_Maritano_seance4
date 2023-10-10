import java.io.*;

public class FileDataSource implements IDataSource{
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        File file = new File(name);
        StringBuilder data = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                data.append(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return data.toString();
    }
}
