package com.taobao.search.mmd.datasource.bean;

import java.io.Serializable;

/* loaded from: classes7.dex */
public enum ListStyle implements Serializable {
    LIST("list"),
    WATERFALL("mid");
    
    private String value;

    ListStyle(String str) {
        this.value = str;
    }

    public static ListStyle convertFromSFStyle(com.taobao.android.searchbaseframe.util.ListStyle listStyle) {
        return listStyle == com.taobao.android.searchbaseframe.util.ListStyle.LIST ? LIST : WATERFALL;
    }

    public String getValue() {
        return this.value;
    }

    public com.taobao.android.searchbaseframe.util.ListStyle toSFStyle() {
        return this == LIST ? com.taobao.android.searchbaseframe.util.ListStyle.LIST : com.taobao.android.searchbaseframe.util.ListStyle.WATERFALL;
    }
}
