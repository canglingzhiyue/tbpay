package com.taobao.homepage.utils;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class NewRangerOptions implements Serializable {
    public JSONObject commParams;
    public String rangerBucketsAlias;
    public String trackGroup;
    public String bizName = "ranger";
    public boolean isNative = true;

    static {
        kge.a(-220189515);
        kge.a(1028243835);
    }
}
