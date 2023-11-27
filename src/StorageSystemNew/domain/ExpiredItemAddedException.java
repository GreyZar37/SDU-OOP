package StorageSystemNew.domain;

public class ExpiredItemAddedException extends Exception{
    public ExpiredItemAddedException () {
        super("Attempted to add expired product to database");
    }
}
