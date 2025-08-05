package com.taobao.android.engine.expression;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double EPSINON = 1.0E-8d;
    public static final int VALUE_TYPE_BOOL_BOXED = 16;
    public static final int VALUE_TYPE_BOOL_PRI = 15;
    public static final int VALUE_TYPE_BYTE_BOXED = 5;
    public static final int VALUE_TYPE_BYTE_PRI = 1;
    public static final int VALUE_TYPE_CHAR_BOXED = 7;
    public static final int VALUE_TYPE_CHAR_PRI = 3;
    public static final int VALUE_TYPE_DOUBLE_BOXED = 14;
    public static final int VALUE_TYPE_DOUBLE_PRI = 12;
    public static final int VALUE_TYPE_FLOAT_BOXED = 13;
    public static final int VALUE_TYPE_FLOAT_PRI = 11;
    public static final int VALUE_TYPE_INT_BOXED = 8;
    public static final int VALUE_TYPE_INT_PRI = 4;
    public static final int VALUE_TYPE_LONG_BOXED = 10;
    public static final int VALUE_TYPE_LONG_PRI = 9;
    public static final int VALUE_TYPE_NULL = 19;
    public static final int VALUE_TYPE_OBJECT = 18;
    public static final int VALUE_TYPE_SHORT_BOXED = 6;
    public static final int VALUE_TYPE_SHORT_PRI = 2;
    public static final int VALUE_TYPE_STRING = 17;

    /* renamed from: a  reason: collision with root package name */
    private Object f12308a;

    static {
        kge.a(-1782941932);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f12308a;
    }
}
