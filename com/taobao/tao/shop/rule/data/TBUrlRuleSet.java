package com.taobao.tao.shop.rule.data;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class TBUrlRuleSet implements Serializable {
    public String actionAfterMatch;
    public String actionAfterMiss;
    public String handleType;
    public String name;
    public String regex;
    public ArrayList<TBUrlRule> subRules;
    public TBUrlRuleSet successor;
    public String target;
    public String type;

    static {
        kge.a(-1187389424);
        kge.a(1028243835);
    }
}
