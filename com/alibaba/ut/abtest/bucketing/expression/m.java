package com.alibaba.ut.abtest.bucketing.expression;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class m extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1052711237);
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "$re";
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.a
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj != null && obj2 != null && (obj instanceof String)) {
            return g.a(obj).matches(g.a(obj2));
        }
        return false;
    }
}
