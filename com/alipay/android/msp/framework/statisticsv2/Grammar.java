package com.alipay.android.msp.framework.statisticsv2;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.Constants;
import tb.riy;

/* loaded from: classes3.dex */
public class Grammar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String ATTR_DEFAULT_VALUE = "-";
    public static final String[] RECORD_START = {riy.ARRAY_START_STR, "【"};
    public static final String[] RECORD_END = {riy.ARRAY_END_STR, "】"};
    public static final String[] CONTAINER_START = {riy.BRACKET_START_STR, "（"};
    public static final String[] CONTAINER_END = {riy.BRACKET_END_STR, "）"};
    public static final String[] CONTAINER_SEPARATOR = {",", "，"};
    public static final String[] CONTAINER_ARRAY_SEPARATOR = {"^", Constants.WAVE_SEPARATOR};
    public static final String[] FIELD_SEPARATOR = {",", "，"};
    public static final String[] FIELD_SEPARATOR_ARRAY = {"#", "井"};

    public static String filter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee9ccbb7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArr = RECORD_START;
        String replace = str.replace(strArr[0], strArr[1]);
        String[] strArr2 = RECORD_END;
        String replace2 = replace.replace(strArr2[0], strArr2[1]);
        String[] strArr3 = CONTAINER_START;
        String replace3 = replace2.replace(strArr3[0], strArr3[1]);
        String[] strArr4 = CONTAINER_END;
        String replace4 = replace3.replace(strArr4[0], strArr4[1]);
        String[] strArr5 = CONTAINER_SEPARATOR;
        String replace5 = replace4.replace(strArr5[0], strArr5[1]);
        String[] strArr6 = CONTAINER_ARRAY_SEPARATOR;
        String replace6 = replace5.replace(strArr6[0], strArr6[1]);
        String[] strArr7 = FIELD_SEPARATOR;
        String replace7 = replace6.replace(strArr7[0], strArr7[1]);
        String[] strArr8 = FIELD_SEPARATOR_ARRAY;
        return replace7.replace(strArr8[0], strArr8[1]);
    }
}
