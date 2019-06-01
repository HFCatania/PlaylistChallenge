package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int count = 0;
        int count2 = 1;

        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i] == selection) {
                break;
            }
            count++;
        }
        for (int j = startIndex; j < playList.length; j--) {
            if (j == 0) {
                j = playList.length - 1;
            }
            if (playList[j] == selection) {
                break;
            }
            count2++;
        }


        return Math.min(count, count2);
    }
}
