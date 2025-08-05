package com.taobao.search.mmd.datasource.bean;

import com.taobao.search.common.dynamic.bean.SearchDomBean;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class IconBean implements Serializable {
    public static final String TYPE_IMAGE = "img";
    public static final String TYPE_TEXT = "text";
    public String alias;
    public SearchDomBean darkDomBean;
    public String domClass;
    public String group;
    public String prefix;
    public SearchDomBean searchDomBean;
    public int showType;
    public String text;
    public String type;

    static {
        kge.a(-1378539523);
        kge.a(1028243835);
    }
}
