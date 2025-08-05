package com.alibaba.ut.abtest.bucketing.expression;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class l extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1409922717);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        if (str.hashCode() == 407533860) {
            return new Boolean(super.a(objArr[0], objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.c, com.alibaba.ut.abtest.bucketing.expression.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "$ne";
    }

    @Override // com.alibaba.ut.abtest.bucketing.expression.c, com.alibaba.ut.abtest.bucketing.expression.a
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue() : !super.a(obj, obj2);
    }
}
