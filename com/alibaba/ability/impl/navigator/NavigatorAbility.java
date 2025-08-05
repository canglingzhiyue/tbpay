package com.alibaba.ability.impl.navigator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsNavigatorAbility;
import com.taobao.android.abilityidl.ability.Cdo;
import com.taobao.android.abilityidl.ability.NavigatorActionResult;
import com.taobao.android.abilityidl.ability.NavigatorFailureResult;
import com.taobao.android.abilityidl.ability.cd;
import com.taobao.android.abilityidl.ability.ce;
import com.taobao.android.abilityidl.ability.cf;
import com.taobao.android.abilityidl.ability.dn;
import com.taobao.android.nav.Nav;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.gml;
import tb.hsu;
import tb.hsv;
import tb.kge;

/* loaded from: classes2.dex */
public final class NavigatorAbility extends AbsNavigatorAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private hsv f1927a;

    /* loaded from: classes2.dex */
    public static final class a implements hsv.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cf f1928a;

        public a(cf cfVar) {
            this.f1928a = cfVar;
        }

        @Override // tb.hsv.d
        public boolean a(KeyEvent e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e8cd358", new Object[]{this, e})).booleanValue();
            }
            q.d(e, "e");
            if (e.getKeyCode() != 4) {
                return false;
            }
            if (e.getAction() == 1) {
                this.f1928a.a();
            }
            return true;
        }
    }

    static {
        kge.a(1931066324);
    }

    public static /* synthetic */ Object ipc$super(NavigatorAbility navigatorAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void close(als context, dn params, cd callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a143ae6", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else if (!(f instanceof Activity)) {
            callback.a(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (o) null));
        } else {
            Activity activity = (Activity) f;
            activity.finish();
            if (!params.f8819a) {
                activity.overridePendingTransition(0, 0);
            }
            NavigatorActionResult navigatorActionResult = new NavigatorActionResult();
            navigatorActionResult.result = true;
            t tVar = t.INSTANCE;
            callback.a(navigatorActionResult);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void openExternalURL(als context, Cdo params, ce callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3001a3e6", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else if (!(f instanceof Activity)) {
            callback.a(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (o) null));
        } else if (a(params, (Activity) f, true)) {
            callback.a();
        } else {
            NavigatorFailureResult navigatorFailureResult = new NavigatorFailureResult();
            navigatorFailureResult.errorMsg = "跳转失败";
            t tVar = t.INSTANCE;
            callback.a(navigatorFailureResult);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void openURL(als context, Cdo params, cd callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46f9552", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else if (!(f instanceof Activity)) {
            callback.a(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (o) null));
        } else {
            NavigatorActionResult navigatorActionResult = new NavigatorActionResult();
            navigatorActionResult.result = Boolean.valueOf(a(params, (Activity) f, false));
            t tVar = t.INSTANCE;
            callback.a(navigatorActionResult);
        }
    }

    private final boolean a(Cdo cdo, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc520fb4", new Object[]{this, cdo, activity, new Boolean(z)})).booleanValue();
        }
        Nav from = Nav.from(activity);
        if (z) {
            from.allowEscape();
        }
        String str = cdo.f8820a;
        if (cdo.b != null) {
            String str2 = cdo.f8820a;
            Map<String, ? extends Object> map = cdo.b;
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            str = hsu.a(str2, (JSONObject) map);
        }
        if (cdo.c != null) {
            Map<String, ? extends Object> map2 = cdo.c;
            if (map2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            from.withExtras(hsu.a((Bundle) null, (JSONObject) map2));
        }
        if (!cdo.d) {
            from.disableTransition();
            activity.overridePendingTransition(0, 0);
        }
        return from.toUri(str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void removeSystemBackBlockListener(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72be5860", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        hsv hsvVar = this.f1927a;
        if (hsvVar != null) {
            hsvVar.b();
        }
        this.f1927a = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void replace(als context, Cdo params, cd callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bccd41", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else if (!(f instanceof Activity)) {
            callback.a(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (o) null));
        } else {
            Activity activity = (Activity) f;
            activity.finish();
            NavigatorActionResult navigatorActionResult = new NavigatorActionResult();
            navigatorActionResult.result = Boolean.valueOf(a(params, activity, false));
            t tVar = t.INSTANCE;
            callback.a(navigatorActionResult);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void setSystemBackBlockListener(als context, cf callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c3a3ea", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        hsv hsvVar = this.f1927a;
        if (hsvVar != null) {
            if (hsvVar != null) {
                hsvVar.b();
            }
            this.f1927a = null;
        }
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            callback.a(new ErrorResult("500", "env.getContext is null or invalid", (Map) null, 4, (o) null));
            return;
        }
        Window window = ((Activity) f).getWindow();
        q.b(window, "act.window");
        hsv hsvVar2 = new hsv(window, new a(callback));
        hsvVar2.a();
        t tVar = t.INSTANCE;
        this.f1927a = hsvVar2;
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        hsv hsvVar = this.f1927a;
        if (hsvVar != null) {
            hsvVar.b();
        }
        this.f1927a = null;
    }
}
