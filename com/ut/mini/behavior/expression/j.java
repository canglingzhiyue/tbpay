package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class j extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-293943600);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        if (str.hashCode() == 407533860) {
            return new Boolean(super.a(objArr[0], objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "<=";
    }

    @Override // com.ut.mini.behavior.expression.o
    public boolean a(double d, double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0efa2c", new Object[]{this, new Double(d), new Double(d2)})).booleanValue() : d <= d2;
    }

    @Override // com.ut.mini.behavior.expression.o, com.ut.mini.behavior.expression.a
    public boolean a(Object obj, Object obj2) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return super.a(obj, obj2);
        }
        return false;
    }

    @Override // com.ut.mini.behavior.expression.o
    public boolean a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6070f4", new Object[]{this, bigDecimal, bigDecimal2})).booleanValue() : a(bigDecimal.compareTo(bigDecimal2)) || b(bigDecimal.compareTo(bigDecimal2));
    }

    @Override // com.ut.mini.behavior.expression.o
    public boolean a(BigInteger bigInteger, BigInteger bigInteger2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c55ec69a", new Object[]{this, bigInteger, bigInteger2})).booleanValue() : a(bigInteger.compareTo(bigInteger2)) || b(bigInteger.compareTo(bigInteger2));
    }
}
