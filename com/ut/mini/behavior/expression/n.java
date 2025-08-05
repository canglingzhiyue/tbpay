package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class n extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-968674628);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "==";
    }

    @Override // com.ut.mini.behavior.expression.a
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (e.c(obj2)) {
            return ((BigDecimal) e.a(obj, BigDecimal.class)).equals((BigDecimal) e.a(obj2, BigDecimal.class));
        }
        if (e.d(obj2)) {
            return e.a(obj, Double.class).doubleValue() == e.a(obj2, Double.class).doubleValue();
        } else if (e.b(obj2)) {
            return ((BigInteger) e.a(obj, BigInteger.class)).equals((BigInteger) e.a(obj2, BigInteger.class));
        } else {
            if (!e.e(obj2)) {
                return Boolean.FALSE.booleanValue();
            }
            return e.a(obj, Long.class).longValue() == e.a(obj2, Long.class).longValue();
        }
    }
}
