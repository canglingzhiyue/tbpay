package com.taobao.android.tscheduleprotocol;

import java.util.Map;

/* loaded from: classes6.dex */
public interface b {
    public static final int RESULT_CANCEL = 1;
    public static final int RESULT_EXP_NOT_FOUND = 4;
    public static final int RESULT_EXP_SWITCH_OFF = 2;
    public static final int RESULT_EXP_SWITCH_OTHER = 3;
    public static final int RESULT_OK = 0;

    int a(String str, Map<String, String> map);

    int a(String str, Map<String, String> map, Object obj);
}
