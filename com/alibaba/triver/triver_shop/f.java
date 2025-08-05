package com.alibaba.triver.triver_shop;

import android.app.Activity;
import android.app.Application;
import com.alibaba.triver.triver_shop.newShop.ext.b;
import com.alibaba.triver.triver_shop.newShop.manager.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f3777a;
    private static final boolean b;
    private static final boolean c;
    private static final g<Activity> d;

    private f() {
    }

    static {
        kge.a(-661458606);
        INSTANCE = new f();
        Application application = Globals.getApplication();
        q.b(application, "getApplication()");
        f3777a = b.f(application);
        Application application2 = Globals.getApplication();
        q.b(application2, "getApplication()");
        b = b.e(application2);
        Application application3 = Globals.getApplication();
        q.b(application3, "getApplication()");
        c = b.d(application3);
        d = new g<>();
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : f3777a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : b;
    }

    public final g<Activity> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("f070b6d7", new Object[]{this}) : d;
    }
}
