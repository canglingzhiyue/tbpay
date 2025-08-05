package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class o extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(170851748);
    }

    public abstract boolean a(double d, double d2);

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i < 0;
    }

    public abstract boolean a(BigDecimal bigDecimal, BigDecimal bigDecimal2);

    public abstract boolean a(BigInteger bigInteger, BigInteger bigInteger2);

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i == 0;
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : i > 0;
    }

    @Override // com.ut.mini.behavior.expression.a
    public boolean a(Object obj, Object obj2) throws ExpressionException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue() : e.a(obj, obj2, this);
    }
}
