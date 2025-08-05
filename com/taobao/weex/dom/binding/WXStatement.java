package com.taobao.weex.dom.binding;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.SimpleArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class WXStatement extends ArrayMap<String, Object> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WX_FOR = "[[repeat]]";
    public static final String WX_FOR_INDEX = "@index";
    public static final String WX_FOR_ITEM = "@alias";
    public static final String WX_FOR_LIST = "@expression";
    public static final String WX_IF = "[[match]]";
    public static final String WX_ONCE = "[[once]]";

    static {
        kge.a(-1777434020);
        kge.a(-723128125);
    }

    public WXStatement() {
    }

    public WXStatement(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    /* renamed from: clone */
    public WXStatement m1586clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXStatement) ipChange.ipc$dispatch("c9ad52b9", new Object[]{this}) : new WXStatement(this);
    }
}
