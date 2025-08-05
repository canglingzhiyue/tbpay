package com.alibaba.ability.impl.app;

import android.content.Context;
import android.content.Intent;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAppAbility;
import com.taobao.android.abilityidl.ability.AppGetInfoResult;
import com.taobao.android.launcher.common.c;
import com.taobao.application.common.d;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.alx$a;
import tb.amg;
import tb.gml;
import tb.hsy;
import tb.kge;

/* loaded from: classes2.dex */
public final class AppAbility extends AbsAppAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final alx$a Companion;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1837a;
        public final /* synthetic */ gml b;

        public a(Context context, gml gmlVar) {
            this.f1837a = context;
            this.b = gmlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Context context = this.f1837a;
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addFlags(268435456);
                intent.addCategory("android.intent.category.HOME");
                t tVar = t.INSTANCE;
                context.startActivity(intent);
            } catch (Exception e) {
                TLog.loge(amg.MODULE_NAME, "AppAbility", "suspend error: " + e);
                this.b.a(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (o) null));
            }
        }
    }

    static {
        kge.a(436042304);
        Companion = new alx$a(null);
    }

    public static /* synthetic */ Object ipc$super(AppAbility appAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<AppGetInfoResult, ErrorResult> getInfo(als abilityContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e238fa77", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        AppGetInfoResult appGetInfoResult = new AppGetInfoResult();
        appGetInfoResult.version = (String) c.a("appVersion", "unknown");
        appGetInfoResult.utdid = (String) c.a("deviceId", "unknown");
        appGetInfoResult.ttid = (String) c.a("ttid", "unknown");
        d a2 = com.taobao.application.common.c.a();
        if (a2 != null ? a2.a("isInBackground", false) : false) {
            z = false;
        }
        appGetInfoResult.isForeground = Boolean.valueOf(z);
        appGetInfoResult.navBarHeight = Double.valueOf(hsy.a(f, 44.0f));
        appGetInfoResult.bottomBarHeight = Double.valueOf(hsy.a(f, 48.0f));
        appGetInfoResult.targetSDKVersion = Integer.valueOf(f.getApplicationInfo().targetSdkVersion);
        appGetInfoResult.env = a();
        t tVar = t.INSTANCE;
        return new g<>(appGetInfoResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<String, ErrorResult> getVersion(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("7fbff4b9", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        return new g<>(c.a("appVersion", "unknown"), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<String, ErrorResult> getUTDID(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("1f645e91", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        return new g<>(c.a("deviceId", "unknown"), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<String, ErrorResult> getTTID(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("84b52a4a", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        return new g<>(c.a("ttid", "unknown"), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<Boolean, ErrorResult> isForeground(als abilityContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("98eebbae", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        d a2 = com.taobao.application.common.c.a();
        if (a2 != null ? a2.a("isInBackground", false) : false) {
            z = false;
        }
        return new g<>(Boolean.valueOf(z), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<Double, ErrorResult> getNavBarHeight(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("69bf760e", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        return new g<>(Double.valueOf(hsy.a(f, 44.0f)), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<Double, ErrorResult> getBottomBarHeight(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4c9f2442", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        return new g<>(Double.valueOf(hsy.a(f, 48.0f)), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public void suspend(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b10d4f5", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("Context 为空"));
        } else {
            e.a(new a(f, callback), 0L, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public g<String, ErrorResult> getEnv(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("cd988f44", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        return new g<>(a(), null, 2, null);
    }

    private final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        int a2 = EnvironmentSwitcher.a();
        return a2 == EnvironmentSwitcher.EnvType.OnLINE.getValue() ? "release" : a2 == EnvironmentSwitcher.EnvType.PRE.getValue() ? "pre" : "daily";
    }
}
