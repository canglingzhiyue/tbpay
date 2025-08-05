package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.biz.launcher.dz;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.TaoPackageInfo;
import java.util.HashMap;
import tb.jel;

/* loaded from: classes.dex */
public class dz extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.launcher.biz.launcher.dz$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass3 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f13041a;
        public final /* synthetic */ jel b;

        public AnonymousClass3(Application application, jel jelVar) {
            this.f13041a = application;
            this.b = jelVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LoginBroadcastHelper.registerLoginReceiver(this.f13041a, new BroadcastReceiver() { // from class: com.taobao.android.launcher.biz.launcher.InitMotuCrash$3$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                        } else {
                            int i = dz.AnonymousClass4.f13042a[LoginAction.valueOf(intent.getAction()).ordinal()];
                            if (i == 1) {
                                String nick = Login.getNick();
                                if (dz.AnonymousClass3.this.b != null && nick != null) {
                                    dz.AnonymousClass3.this.b.a("USERNICK", nick);
                                }
                                com.taobao.tao.log.f.a().g(nick);
                                LoginBroadcastHelper.unregisterLoginReceiver(dz.AnonymousClass3.this.f13041a.getApplicationContext(), this);
                            } else if (i != 2 && i != 3) {
                            } else {
                                if (dz.AnonymousClass3.this.b != null) {
                                    dz.AnonymousClass3.this.b.a("USERNICK", "");
                                }
                                com.taobao.tao.log.f.a().g(null);
                                LoginBroadcastHelper.unregisterLoginReceiver(dz.AnonymousClass3.this.f13041a.getApplicationContext(), this);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.taobao.android.launcher.biz.launcher.dz$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13042a = new int[LoginAction.values().length];

        static {
            try {
                f13042a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13042a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13042a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(dz dzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(dz dzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef78fec", new Object[]{dzVar});
        } else {
            dzVar.d();
        }
    }

    public dz(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        UncaughtCrashManager manager = TCrashSDK.instance().getManager();
        final jel jelVar = manager instanceof jel ? (jel) manager : null;
        a(new Runnable() { // from class: com.taobao.android.launcher.biz.launcher.dz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TaoPackageInfo.init();
                String str = TaoPackageInfo.sTTID;
                String version = TaoPackageInfo.getVersion();
                jel jelVar2 = jelVar;
                if (jelVar2 != null) {
                    jelVar2.a("CHANNEL", str);
                    jelVar.a("APP_VERSION", version);
                }
                com.alibaba.motu.tbrest.d.a().c(str);
                com.alibaba.motu.tbrest.d.a().a(version);
            }
        });
        a(new Runnable() { // from class: com.taobao.android.launcher.biz.launcher.dz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    dz.a(dz.this);
                }
            }
        });
        a(new AnonymousClass3(application, jelVar));
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            Log.e(getId(), "error occurred when run task", th);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader.addHeaderInfo("sLinkOptOpened", String.valueOf(LauncherRuntime.n));
        crashCaughtHeader.addHeaderInfo("diagnoseSession", String.valueOf(LauncherRuntime.f13108a));
    }
}
