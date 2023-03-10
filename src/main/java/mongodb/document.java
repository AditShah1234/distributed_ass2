package mongodb;
import org.bson.Document;
public class document {
    private Integer year;
    private String state;

    private String type;

    private String length;

    private String expense;

    private Integer value;

    public document(Integer year, String state, String type, String length, String expense, Integer value) {
        this.year = year;
        this.state = state;
        this.type = type;
        this.length = length;
        this.expense = expense;
        this.value = value;
    }


    @Override
    public String toString() {
        return "document{" +
                "year='" + year + '\'' +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", length='" + length + '\'' +
                ", expense='" + expense + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public Document getDoc() {
        Document newDoc = new Document("year", year)
                .append("state", state)
                .append("type", type)
                .append("length", length)
                .append("expense", expense)
                .append("value", value);

        return newDoc;
    }
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
