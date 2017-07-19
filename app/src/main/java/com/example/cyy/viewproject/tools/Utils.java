package com.example.cyy.viewproject.tools;

/**
 * Created by cyy on 2017/7/19.
 *
 * 工具类
 */

public class Utils {
    public static final String EVENT_TAG = "event_tag";

    /**
     * 把事件的int类型的acition转换为String类型
     *
     * @param action
     * @return
     */
    public static final String actionToStr(int action){
        switch(action){
            case 0:
                return "ACTION_DOWN";
            case 1:
                return "ACTION_UP";
            case 2:
                return "ACTION_MOVE";
        }
        return "";
    }
}
