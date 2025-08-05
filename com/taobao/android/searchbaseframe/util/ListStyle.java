package com.taobao.android.searchbaseframe.util;

import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes6.dex */
public enum ListStyle implements Serializable {
    LIST("list"),
    WATERFALL("wf");
    
    private String value;

    ListStyle(String str) {
        this.value = str;
    }

    public static ListStyle fromInt(int i) {
        return i == 0 ? LIST : WATERFALL;
    }

    public static ListStyle fromNumString(String str) {
        return TextUtils.equals("0", str) ? LIST : WATERFALL;
    }

    public static ListStyle fromString(String str) {
        return "wf".equals(str) ? WATERFALL : LIST;
    }

    public static int toNum(ListStyle listStyle) {
        return listStyle == LIST ? 0 : 1;
    }

    public String getValue() {
        return this.value;
    }
}
