package com.taobao.search.mmd.datasource.bean;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class SearchListBaseBean implements Serializable {
    public String abtest;
    public int page;
    public int pagePos;
    public String rn;
    public boolean itemDisappearTracked = false;
    public boolean itemAppearTracked = false;

    static {
        kge.a(1838901723);
        kge.a(1028243835);
    }
}
