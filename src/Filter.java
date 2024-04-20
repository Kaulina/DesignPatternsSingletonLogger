import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected Integer treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }


    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < treshold) {
                logger.data();
                logger.log("Элемент ''" + source.get(i) + "'' не проходит");
            } else {
                logger.data();
                logger.log("Элемент ''" + source.get(i) + "'' проходит");
                result.add(source.get(i));
                count++;
            }
        }
        logger.data();
        logger.log("Прошло фильтр " + count + " элемента из " + source.size());
        logger.data();
        logger.log("Выводим результат на экран");

        return result;
    }
}