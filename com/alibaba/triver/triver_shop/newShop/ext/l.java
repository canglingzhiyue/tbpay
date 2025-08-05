package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.triver.base.taobao.TriverRemoteManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.intf.Mtop;
import tb.ceg;
import tb.grv;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class b implements ITriverRemoteProxy.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rul<Integer, t> f3863a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(rul<? super Integer, t> rulVar) {
            this.f3863a = rulVar;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.b
        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            rul<Integer, t> rulVar = this.f3863a;
            if (rulVar == null) {
                return;
            }
            rulVar.mo2421invoke(Integer.valueOf(i));
        }
    }

    static {
        kge.a(905839075);
    }

    public static final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
        q.b(a2, "getAppPreferences()");
        return a2.a("deviceLevel", -1);
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a() == 2;
    }

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a() == 0;
    }

    public static final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a() == 1;
    }

    public static final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        q.d(context, "<this>");
        if (str == null) {
            return;
        }
        Nav.from(context).toUri(str);
    }

    public static final void a(Context context) {
        Object m2371constructorimpl;
        q.d(context, "context");
        Class<?> d = com.alibaba.triver.triver_shop.newShop.ext.b.d("com.alibaba.triver.TRiverSDK");
        if (d != null) {
            try {
                Result.a aVar = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(d.getDeclaredMethod("init", Application.class).invoke(null, context.getApplicationContext()));
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            ceg.Companion.b(q.a("try to init triver error : ", (Object) m2374exceptionOrNullimpl));
        }
    }

    public static final void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{activity, new Boolean(z)});
            return;
        }
        q.d(activity, "<this>");
        try {
            Result.a aVar = Result.Companion;
            Result.m2371constructorimpl(Boolean.valueOf(new grv(activity).a(z)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public static final String b(Context context) {
        com.taobao.tao.remotebusiness.login.e loginContext;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        q.d(context, "<this>");
        com.taobao.tao.remotebusiness.login.c a2 = com.taobao.tao.remotebusiness.login.h.a(Mtop.instance(Mtop.Id.INNER, context));
        return (a2 == null || (loginContext = a2.getLoginContext()) == null || (str = loginContext.b) == null) ? "defaultUser" : str;
    }

    public static final void a(String bizType, String str, Context context, ruk<t> initSuccess, ruk<t> initFailed, rul<? super Integer, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7542e3", new Object[]{bizType, str, context, initSuccess, initFailed, rulVar});
            return;
        }
        q.d(bizType, "bizType");
        q.d(context, "context");
        q.d(initSuccess, "initSuccess");
        q.d(initFailed, "initFailed");
        TriverRemoteManager.getInstance().install(bizType, str, ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC, context, new a(initSuccess, initFailed), new b(rulVar));
    }

    /* loaded from: classes3.dex */
    public static final class a implements ITriverRemoteProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ruk<t> f3862a;
        public final /* synthetic */ ruk<t> b;

        public a(ruk<t> rukVar, ruk<t> rukVar2) {
            this.f3862a = rukVar;
            this.b = rukVar2;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f3862a.mo2427invoke();
            }
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            this.b.mo2427invoke();
            ceg.Companion.b(q.a("tRiver remote init failed : ", (Object) str));
        }
    }

    public static final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : new TriverRemoteManager().hasInstalled(ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC);
    }
}
