package com.taobao.android.searchbaseframe.context;

import java.util.Map;

/* loaded from: classes6.dex */
public interface a {
    boolean getBooleanParam(String str);

    String getParam(String str);

    String getParam(String str, String str2);

    Map<String, String> getParamsSnapshot();

    void setParam(String str, String str2);
}
