package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class k extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-731529528);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 407533860) {
            return new Boolean(super.a(objArr[0], objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ut.mini.behavior.expression.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "!ek";
    }

    @Override // com.ut.mini.behavior.expression.b, com.ut.mini.behavior.expression.a
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue() : !super.a(obj, obj2);
    }
}
