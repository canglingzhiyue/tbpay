package com.taobao.android.tscheduleprotocol;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public interface ScheduleProtocolCallback extends Serializable {
    public static final String MERGE_TIME = "mergeTime";

    /* loaded from: classes6.dex */
    public enum ScheduleProtocolCallbackType {
        TYPE_HIT,
        TYPE_MISS,
        TYPE_EXPIRE,
        TYPE_CLEAR,
        TYPE_FULL,
        TYPE_OUT_OF_SERVICE,
        TYPE_NOT_READY,
        TYPE_SRC_NOT_EQUAL
    }

    void onPreload(ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap);

    boolean resolveParameter(String str, Map<String, String> map);

    boolean resolveType(ScheduleProtocolCallbackType scheduleProtocolCallbackType);
}
