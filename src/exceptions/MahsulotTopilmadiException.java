package exceptions;

public class MahsulotTopilmadiException extends RuntimeException {
    private final int id;

    public MahsulotTopilmadiException(int id) {
        super("Mahsulot topilmadi ID: "+id);
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
