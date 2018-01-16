package com.ivg.common.utils;

import java.util.List;

/**
 * 求数组的最大公约数
 *
 * @author lenovo
 */
public class GreatestCommonDivisorUtils {

    public static int getGreatestCommonDivisor(int[] ary) {
        int min = ary[0];
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < min) {
                min = ary[i];
            }
        }
        while (min >= 1) {
            boolean isCommon = true;
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] % min != 0) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                break;
            }
            min--;
        }
        return min;
    }


    public static String getSizeProportion(List<Integer> sizeCount) {
        int[] ary = new int[sizeCount.size()];
        for (int i = 0; i < sizeCount.size(); i++) {
            ary[i] = sizeCount.get(i);
        }
        int greatestCommonDivisor = getGreatestCommonDivisor(ary);
        if (0 == greatestCommonDivisor) {
            greatestCommonDivisor = 1;
        }
        String sizeProportion = "";
        for (int i = 0; i < sizeCount.size(); i++) {
            sizeProportion += sizeCount.get(i) / greatestCommonDivisor + "/";
        }
        if (!"".equals(sizeProportion)) {
            sizeProportion = sizeProportion.substring(0, sizeProportion.length() - 1);
        }

        return sizeProportion;
    }


}
