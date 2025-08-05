package com.taobao.tao.shop.rule.data;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class TBUrlRule implements Serializable {
    public String content;
    public String name;
    public String regex;
    public ArrayList<TBUrlRule> subRules;
    @Deprecated
    public String target;
    public String type;

    static {
        kge.a(-1697929486);
        kge.a(1028243835);
    }
}
