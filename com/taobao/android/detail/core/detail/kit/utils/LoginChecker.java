package com.taobao.android.detail.core.detail.kit.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class LoginChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LoginBroadcastReceiver f9542a;
    private static String b;
    private static String c;
    private static String d;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void a(boolean z);
    }

    public static /* synthetic */ LoginBroadcastReceiver a(LoginBroadcastReceiver loginBroadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginBroadcastReceiver) ipChange.ipc$dispatch("d46de4ac", new Object[]{loginBroadcastReceiver});
        }
        f9542a = loginBroadcastReceiver;
        return loginBroadcastReceiver;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : c;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : d;
    }

    public static /* synthetic */ LoginBroadcastReceiver d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginBroadcastReceiver) ipChange.ipc$dispatch("3d4b6e0d", new Object[0]) : f9542a;
    }

    static {
        kge.a(-449631556);
        b = com.taobao.android.ucp.util.LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS;
        c = "NOTIFY_LOGIN_FAILED";
        d = "NOTIFY_LOGIN_CANCEL";
        emu.a("com.taobao.android.detail.core.detail.kit.utils.LoginChecker");
    }

    public static void a(Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02623f6", new Object[]{context, aVar});
        } else {
            a(context, new b() { // from class: com.taobao.android.detail.core.detail.kit.utils.LoginChecker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.kit.utils.LoginChecker.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }

                @Override // com.taobao.android.detail.core.detail.kit.utils.LoginChecker.b
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (!z) {
                    } else {
                        a.this.a();
                    }
                }
            });
        }
    }

    public static void a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0269855", new Object[]{context, bVar});
        } else if (bVar == null) {
        } else {
            if (!TextUtils.isEmpty(epo.g().e()) && epo.g().b()) {
                bVar.a(true);
                return;
            }
            LoginBroadcastReceiver loginBroadcastReceiver = f9542a;
            if (loginBroadcastReceiver == null) {
                f9542a = new LoginBroadcastReceiver(bVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(b);
                intentFilter.addAction(c);
                intentFilter.addAction(d);
                intentFilter.setPriority(1000);
                try {
                    epo.a().registerReceiver(f9542a, intentFilter);
                } catch (Throwable th) {
                    com.taobao.android.detail.core.utils.i.b("LoginBroadcastHelper", "registerLoginReceiver failed");
                    th.printStackTrace();
                }
            } else {
                loginBroadcastReceiver.a(bVar);
            }
            bVar.a();
            epo.g().a(true);
        }
    }

    /* loaded from: classes4.dex */
    public static class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<b> f9544a;

        static {
            kge.a(902598767);
        }

        public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public LoginBroadcastReceiver(b bVar) {
            this.f9544a = new WeakReference<>(bVar);
        }

        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b931605d", new Object[]{this, bVar});
            } else {
                this.f9544a = new WeakReference<>(bVar);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            } else {
                String action = intent.getAction();
                b bVar = this.f9544a.get();
                if (LoginChecker.a().equalsIgnoreCase(action)) {
                    if (bVar != null) {
                        bVar.a(true);
                    }
                    a(context);
                } else if (LoginChecker.b().equals(action)) {
                    if (bVar != null) {
                        bVar.a(false);
                    }
                    a(context);
                } else if (!LoginChecker.c().equals(action)) {
                } else {
                    if (bVar != null) {
                        bVar.a(false);
                    }
                    a(context);
                }
            }
        }

        private void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
                return;
            }
            epo.a().unregisterReceiver(LoginChecker.d());
            LoginChecker.a(null);
        }
    }
}
