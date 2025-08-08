package com.alibaba.ability.impl.system;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.NotificationManagerCompat;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.abilityidl.ability.AbsSystemAbility;
import com.taobao.android.abilityidl.ability.SystemNotificationStatusResult;
import com.taobao.android.abilityidl.ability.cq;
import com.taobao.android.abilityidl.ability.ef;
import com.taobao.android.abilityidl.ability.eg;
import com.taobao.search.common.util.k;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.als;
import tb.ame;
import tb.amg;
import tb.gml;
import tb.hsx;
import tb.kge;

/* loaded from: classes2.dex */
public final class SystemAbility extends AbsSystemAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ame.a Companion;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1961a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ gml c;

        public a(Context context, Intent intent, gml gmlVar) {
            this.f1961a = context;
            this.b = intent;
            this.c = gmlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f1961a.startActivity(this.b);
            } catch (Exception e) {
                TLog.loge(amg.MODULE_NAME, "SystemAbility", "openAppSettings error: " + e);
                this.c.a(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (o) null));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1962a;
        public final /* synthetic */ gml b;

        public b(Context context, gml gmlVar) {
            this.f1962a = context;
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
                Context context = this.f1962a;
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                intent.addFlags(268435456);
                t tVar = t.INSTANCE;
                context.startActivity(intent);
            } catch (Exception e) {
                TLog.loge(amg.MODULE_NAME, "SystemAbility", "openLocationSettings error: " + e);
                this.b.a(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (o) null));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ gml c;

        public c(Context context, gml gmlVar) {
            this.b = context;
            this.c = gmlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.addFlags(268435456);
                    intent.putExtra("android.provider.extra.APP_PACKAGE", this.b.getPackageName());
                    this.b.startActivity(intent);
                } else if (Build.VERSION.SDK_INT < 21) {
                    this.b.startActivity(SystemAbility.access$getDefaultIntent(SystemAbility.this, this.b));
                } else {
                    Intent intent2 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent2.addFlags(268435456);
                    intent2.putExtra("app_package", this.b.getPackageName());
                    ApplicationInfo applicationInfo = this.b.getApplicationInfo();
                    intent2.putExtra("app_uid", applicationInfo != null ? Integer.valueOf(applicationInfo.uid) : null);
                    this.b.startActivity(intent2);
                }
            } catch (Exception e) {
                TLog.loge(amg.MODULE_NAME, "SystemAbility", "openNotificationSettings error: " + e);
                this.c.a(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (o) null));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1964a;
        public final /* synthetic */ String b;
        public final /* synthetic */ gml c;

        public d(Context context, String str, gml gmlVar) {
            this.f1964a = context;
            this.b = str;
            this.c = gmlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Context context = this.f1964a;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse(this.b));
                t tVar = t.INSTANCE;
                context.startActivity(intent);
            } catch (Exception unused) {
                this.c.a(new ErrorResult("OPEN_BROWSER_ERROR", (String) null, (Map) null, 6, (o) null));
            }
        }
    }

    static {
        kge.a(-1752451356);
        Companion = new ame.a(null);
    }

    public static /* synthetic */ Object ipc$super(SystemAbility systemAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ Intent access$getDefaultIntent(SystemAbility systemAbility, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("8fb9765a", new Object[]{systemAbility, context}) : systemAbility.a(context);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public g<String, ErrorResult> checkAppInstallStatus(als abilityContext, ef params) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5fa86853", new Object[]{this, abilityContext, params});
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        String str2 = params.f8838a;
        if (!(!StringUtils.isEmpty(str2))) {
            str2 = null;
        }
        if (str2 == null) {
            return new g<>(null, a$a.Companion.b("参数不能为空 为空"));
        }
        q.b(str2, "params.android.takeIf { …id(\"参数不能为空 为空\")\n        )");
        try {
            str = f.getPackageManager().getPackageInfo(str2, 0) != null ? "install" : "uninstall";
        } catch (Throwable unused) {
            str = "unknown";
        }
        return new g<>(str, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openAppSettings(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4138273", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("Context 为空"));
        } else {
            e.a(new a(f, a(f), callback), 0L, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openNotificationSettings(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119ce51", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("Context 为空"));
        } else {
            e.a(new c(f, callback), 0L, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public g<String, ErrorResult> checkLocation(als abilityContext) {
        String str;
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c0822ade", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        try {
            systemService = f.getSystemService("location");
        } catch (Throwable unused) {
            str = "unknown";
        }
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        }
        str = ((LocationManager) systemService).isProviderEnabled("gps") ? "enable" : "disable";
        return new g<>(str, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openLocationSettings(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252cf71b", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("Context 为空"));
        } else {
            e.a(new b(f, callback), 0L, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public g<Boolean, ErrorResult> isNFCReadingSupported(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("9fdd08b8", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        return new g<>(Boolean.valueOf(hsx.INSTANCE.b(f)), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public g<Boolean, ErrorResult> isVoiceOverOn(als abilityContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e59a6b60", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        Context f = abilityContext.f().f();
        if (f == null) {
            return new g<>(null, a$a.Companion.b("Context 为空"));
        }
        try {
            if (Settings.Secure.getInt(f.getContentResolver(), "accessibility_enabled") == 1) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return new g<>(Boolean.valueOf(z), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void requestNotificationSettings(als abilityContext, cq events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c355cad3", new Object[]{this, abilityContext, events});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(events, "events");
        Context f = abilityContext.f().f();
        if (f == null) {
            events.a(a$a.Companion.b("Context 为空"));
            return;
        }
        SystemNotificationStatusResult systemNotificationStatusResult = new SystemNotificationStatusResult();
        try {
            if (b(f)) {
                systemNotificationStatusResult.status = "AUTHORIZED";
            } else {
                systemNotificationStatusResult.status = "DENIED";
            }
        } catch (Exception unused) {
            systemNotificationStatusResult.status = "UNKNOWN";
        }
        events.a(systemNotificationStatusResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openBrowser(als abilityContext, eg params, gml callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e715ea", new Object[]{this, abilityContext, params, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("Context 为空"));
            return;
        }
        String it = params.f8839a;
        q.b(it, "it");
        if (!n.b(it, k.HTTP_PREFIX, false, 2, (Object) null) && !n.b(it, k.HTTPS_PREFIX, false, 2, (Object) null)) {
            z = false;
        }
        if (!z) {
            it = null;
        }
        if (it != null) {
            q.b(it, "params.url.takeIf { it.s…         return\n        }");
            e.a(new d(f, it, callback), 0L, 2, null);
            return;
        }
        callback.a(a$a.Companion.b("url must start with https:// or http://"));
    }

    private final Intent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("41646cb3", new Object[]{this, context});
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    private final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            return ((NotificationManager) systemService).areNotificationsEnabled();
        }
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }
}
