package com.alibaba.ability.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.q;
import tb.gvt;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final d f1986a;

    private final boolean b() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("57a83ed", new Object[]{this}) : f1986a.getValue())).booleanValue();
    }

    static {
        kge.a(818522831);
        INSTANCE = new b();
        f1986a = e.a(MegaTrace$isEnable$2.INSTANCE);
    }

    private b() {
    }

    public final void a(String methodName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, methodName});
            return;
        }
        q.d(methodName, "methodName");
        if (!b()) {
            return;
        }
        gvt.a(methodName);
    }

    public final void a(String methodName, String name, String api) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, methodName, name, api});
            return;
        }
        q.d(methodName, "methodName");
        q.d(name, "name");
        q.d(api, "api");
        if (!b()) {
            return;
        }
        gvt.a(methodName + ' ' + name + '.' + api);
    }

    public final void a(String methodName, String name, String api, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1617aa2", new Object[]{this, methodName, name, api, obj});
            return;
        }
        q.d(methodName, "methodName");
        q.d(name, "name");
        q.d(api, "api");
        q.d(obj, "obj");
        if (!b()) {
            return;
        }
        gvt.a(methodName + ' ' + name + '.' + api + " objName=" + obj);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!b()) {
        } else {
            gvt.a();
        }
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            return new File("/data/local/tmp/", ".trace_mega").exists();
        } catch (Exception unused) {
            return false;
        }
    }
}
