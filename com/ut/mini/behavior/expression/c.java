package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(90827539);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "eq";
    }

    @Override // com.ut.mini.behavior.expression.a
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        if (!(obj instanceof String)) {
            return false;
        }
        return e.a(obj).equals(e.a(obj2));
    }
}
