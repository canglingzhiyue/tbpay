package com.alibaba.ability.impl.screen;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsScreenAbility;
import com.taobao.android.abilityidl.ability.ScreenInfoResult;
import com.taobao.android.abilityidl.ability.ScreenSetBrightnessParams;
import com.taobao.android.abilityidl.ability.cn;
import com.taobao.android.abilityidl.ability.co;
import com.taobao.android.abilityidl.ability.dz;
import com.taobao.android.abilityidl.ability.ea;
import com.taobao.android.abilityidl.ability.eb;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.gml;
import tb.hsy;
import tb.iri;
import tb.kge;
import tb.rwf;

/* loaded from: classes2.dex */
public final class ScreenAbility extends AbsScreenAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private iri f1954a;

    static {
        kge.a(-1616414332);
    }

    public static /* synthetic */ Object ipc$super(ScreenAbility screenAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void keepOn(als context, ea params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467b91f6", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            callback.a(a$a.Companion.b("Context 为空"));
        } else if (params.f8833a) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public g<String, ErrorResult> getOrientation(als context) {
        String str;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("dd5fe7c1", new Object[]{this, context});
        }
        q.d(context, "context");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        Resources resources = activity.getResources();
        Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        if (valueOf != null && valueOf.intValue() == 2) {
            str = "landscape";
        } else {
            str = (valueOf != null && valueOf.intValue() == 1) ? "portrait" : "unknown";
        }
        return new g<>(str, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public g<ScreenInfoResult, ErrorResult> getInfo(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e238fa77", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        DisplayMetrics a2 = hsy.a(f);
        ScreenInfoResult screenInfoResult = new ScreenInfoResult();
        screenInfoResult.dpr = Double.valueOf(a2.density);
        screenInfoResult.width = Integer.valueOf(a2.widthPixels);
        screenInfoResult.height = Integer.valueOf(a2.heightPixels);
        screenInfoResult.statusBarHeight = Integer.valueOf(hsy.b(f));
        return new g<>(screenInfoResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public g<Integer, ErrorResult> getStatusBarHeight(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e82c3a49", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        return new g<>(Integer.valueOf(hsy.b(f)), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public g<Integer, ErrorResult> getBrightness(als context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("59b306b4", new Object[]{this, context});
        }
        q.d(context, "context");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        try {
            return new g<>(Integer.valueOf(a(activity)), null, 2, null);
        } catch (Exception unused) {
            return new g<>(null, new ErrorResult("500", "getBrightness 获取失败", (Map) null, 4, (o) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void requestBrightness(als context, cn events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa98259", new Object[]{this, context, events});
            return;
        }
        q.d(context, "context");
        q.d(events, "events");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            events.a(a$a.Companion.b("Context 为空"));
            return;
        }
        try {
            ScreenSetBrightnessParams screenSetBrightnessParams = new ScreenSetBrightnessParams();
            screenSetBrightnessParams.brightness = Integer.valueOf(a(activity));
            t tVar = t.INSTANCE;
            events.a(screenSetBrightnessParams);
        } catch (Exception unused) {
            events.a(new ErrorResult("500", "getBrightness 获取失败", (Map) null, 4, (o) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setBrightness(als context, ScreenSetBrightnessParams params, gml callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb5e7f6", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            callback.a(a$a.Companion.b("Context 为空"));
            return;
        }
        Integer it = params.brightness;
        if (it != null) {
            q.b(it, "it");
            int intValue = it.intValue();
            if (intValue < 0 || 100 < intValue) {
                z = false;
            }
            if (!z) {
                it = null;
            }
            if (it != null) {
                q.b(it, "params.brightness?.takeI…\"\n            )\n        )");
                float a2 = rwf.a(-1.0f, rwf.b(1.0f, it.intValue() / 100.0f));
                Window window = activity.getWindow();
                q.b(window, "activity.window");
                try {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.screenBrightness = a2;
                    window.setAttributes(attributes);
                    return;
                } catch (Exception unused) {
                    callback.a(new ErrorResult("500", "setBrightness 设置失败", (Map) null, 4, (o) null));
                    return;
                }
            }
        }
        callback.a(new ErrorResult("INVALID_BRIGHTNESS", "brightness 为空或值不合法", (Map) null, 4, (o) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setCaptureEnabledForAndroid(als context, dz params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36929c9b", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        setCaptureEnabled(context, params, callback);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setCaptureEnabled(als context, dz params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93599d5", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            callback.a(a$a.Companion.b("Context 为空"));
            return;
        }
        Boolean bool = params.f8831a;
        if (bool == null) {
            bool = false;
        }
        q.b(bool, "params.enabled ?: false");
        boolean booleanValue = bool.booleanValue();
        Window window = activity.getWindow();
        q.b(window, "activity.window");
        try {
            if (booleanValue) {
                window.clearFlags(8192);
            } else {
                window.addFlags(8192);
            }
        } catch (Exception unused) {
            callback.a(new ErrorResult("500", "setCaptureEnabled 设置失败", (Map) null, 4, (o) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setOrientation(als context, eb params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1372999f", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            callback.a(a$a.Companion.b("Context 为空"));
            return;
        }
        String str = params.f8834a;
        if (str == null) {
            str = "portrait";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1626174665) {
            if (hashCode != 729267099) {
                if (hashCode == 1430647483 && str.equals("landscape")) {
                    activity.setRequestedOrientation(0);
                    return;
                }
            } else if (str.equals("portrait")) {
                activity.setRequestedOrientation(1);
                return;
            }
        } else if (str.equals("unspecified")) {
            activity.setRequestedOrientation(-1);
            return;
        }
        callback.a(a$a.Companion.b("orientation 为空或值不合法"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setCaptureListener(als abilityContext, co events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a195d0", new Object[]{this, abilityContext, events});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(events, "events");
        Context f = abilityContext.f().f();
        if (f == null) {
            events.a(a$a.Companion.b("Context 为空"));
            return;
        }
        if (this.f1954a == null) {
            ContentResolver contentResolver = f.getContentResolver();
            q.b(contentResolver, "context.contentResolver");
            this.f1954a = new iri(contentResolver);
            iri iriVar = this.f1954a;
            if (iriVar != null) {
                iriVar.b();
            }
        }
        iri iriVar2 = this.f1954a;
        if (iriVar2 == null) {
            return;
        }
        iriVar2.a(new ScreenAbility$setCaptureListener$1(events));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void unsetCaptureListener(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eaa97ea", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        a();
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        iri iriVar = this.f1954a;
        if (iriVar != null) {
            iriVar.c();
        }
        this.f1954a = null;
    }

    private final int a(Activity activity) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{this, activity})).intValue();
        }
        Window window = activity.getWindow();
        q.b(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        Float valueOf = attributes != null ? Float.valueOf(attributes.screenBrightness) : null;
        if (valueOf == null || valueOf.floatValue() < 0.0f) {
            try {
                i = Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
            } catch (Exception unused) {
            }
            valueOf = Float.valueOf(i / 255);
        }
        return (int) (valueOf.floatValue() * 100);
    }
}
