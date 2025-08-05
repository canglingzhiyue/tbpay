package com.taobao.android;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.alr;
import tb.dkt;
import tb.dlf;
import tb.kge;

/* loaded from: classes.dex */
public final class af implements dlf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-278721924);
        kge.a(1720182865);
    }

    @Override // tb.dlf
    public String a(dkt dktVar) {
        Context f;
        Class<?> cls;
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9728ad15", new Object[]{this, dktVar});
        }
        String str = null;
        alr a2 = dktVar != null ? dktVar.a() : null;
        if (a2 != null) {
            str = a2.d();
        }
        if (str == null || q.a((Object) str, (Object) "AbilityKit")) {
            com.ut.mini.l lVar = com.ut.mini.l.getInstance();
            q.b(lVar, "UTPageHitHelper.getInstance()");
            str = lVar.getCurrentPageName();
        }
        if (TextUtils.isEmpty(str)) {
            str = (a2 == null || (f = a2.f()) == null || (cls = f.getClass()) == null || (name = cls.getName()) == null) ? "AbilityKit" : name;
        }
        q.a((Object) str);
        return str;
    }
}
