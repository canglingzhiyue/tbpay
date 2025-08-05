package com.taobao.search.mmd.datasource.bean;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SFOnesearchBean extends BaseTypedBean {
    public String backgroundColor;
    public String bizType;
    public boolean disableHeaderScroll;
    public String expArg1;
    public int height;
    public boolean isFull;
    public boolean isNewSearch;
    public String keyword;
    public JSONObject model;
    public Map<String, String> nextPageTraceMap;
    public String sizeRation;
    public String url;
    public String utLogMap;
    public int width;
    public boolean hideNavibar = false;
    public boolean redirect = false;

    static {
        kge.a(456532535);
    }
}
