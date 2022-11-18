package bridge;

import java.util.ArrayList;
import java.util.List;

public class Bridge {
    private final List<String> bridgeWin;
    private final List<String> bridgeNow;
    private int countTotal = 0;

    public Bridge(List<String> bridge) {
        this.bridgeWin = bridge;
        this.bridgeNow = new ArrayList<>();
        System.out.println(bridgeWin);
    }

    public boolean applyMove(String moveTo) {
        increaseCount();
        if (moveTo.equals("U")) {
            bridgeNow.add("1");
        }
        if (moveTo.equals("D")) {
            bridgeNow.add("0");
        }
        if(!checkSucces()) {
            return false;
        }
        OutputView.printMap(bridgeNow);
//        System.out.println("======");
//        System.out.println(bridgeWin);
//        System.out.println(bridgeNow);
        return true;

    }

    private void increaseCount() {
        this.countTotal += 1;
    }

    private boolean checkSucces() {
        for (int i=0; i<bridgeNow.size(); i++) {
            if(!bridgeNow.get(i).equals(bridgeWin.get(i))) {
                return false;
            }
        }
        return true;
    }

//    public void get
}
