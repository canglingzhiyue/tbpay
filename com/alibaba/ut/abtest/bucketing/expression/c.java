package com.alibaba.ut.abtest.bucketing.expression;

import com.alibaba.evo.EVOExperimentCondition;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2128147062);
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : EVOExperimentCondition.OPERATOR_EQUALS;
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.a
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (g.d(obj)) {
            return ((BigDecimal) g.a(obj, BigDecimal.class)).equals((BigDecimal) g.a(obj2, BigDecimal.class));
        }
        if (g.e(obj)) {
            return g.a(obj, Double.class).doubleValue() == g.a(obj2, Double.class).doubleValue();
        } else if (g.c(obj)) {
            return ((BigInteger) g.a(obj, BigInteger.class)).equals((BigInteger) g.a(obj2, BigInteger.class));
        } else {
            if (g.f(obj)) {
                return g.a(obj, Long.class).longValue() == g.a(obj2, Long.class).longValue();
            } else if (obj instanceof Boolean) {
                return g.b(obj).booleanValue() == g.b(obj2).booleanValue();
            } else if (obj instanceof String) {
                return g.a(obj).equals(g.a(obj2));
            } else {
                try {
                    return obj.equals(obj2);
                } catch (Exception e) {
                    com.alibaba.ut.abtest.internal.util.b.a("EqualsOperator.apply", e);
                    return Boolean.FALSE.booleanValue();
                }
            }
        }
    }
}
