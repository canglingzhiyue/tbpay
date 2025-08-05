package com.taobao.android.middleware.compat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.ali.user.mobile.info.AppInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.SessionManager;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.TBSdkLog;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    private static String f14315a = null;
    private static String b = null;
    private static SharedPreferences c = null;
    private static final BroadcastReceiver d = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.MtopSimpleSessionManager$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                final String action = intent.getAction();
                d.a(new Runnable() { // from class: com.taobao.android.middleware.compat.MtopSimpleSessionManager$1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.a(action);
                        }
                    }
                });
            }
        }
    };
    private static final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.MtopSimpleSessionManager$2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                final String action = intent.getAction();
                d.a(new Runnable() { // from class: com.taobao.android.middleware.compat.MtopSimpleSessionManager$2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.b(action);
                        }
                    }
                });
            }
        }
    };
    private static Context f = null;
    private static long g = -1;

    /* renamed from: com.taobao.android.middleware.compat.c$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14316a = new int[LoginAction.values().length];

        static {
            try {
                f14316a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14316a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            d(str);
        }
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            c(str);
        }
    }

    private static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        String userId = Login.getUserId();
        String sid = Login.getSid();
        long sessionExpiredTime = SessionManager.getInstance(f).getSessionExpiredTime();
        TBSdkLog.e("mtopsdk.SimpleSessionManager", "loginInitReceiver action=" + str + ", userid=" + userId + ", sid=" + sid + ", expired=" + sessionExpiredTime);
        a(userId, sid, sessionExpiredTime);
        LocalBroadcastManager.getInstance(f).unregisterReceiver(e);
    }

    private static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            return;
        }
        LoginAction valueOf = LoginAction.valueOf(str);
        if (valueOf == null) {
            return;
        }
        TBSdkLog.e("mtopsdk.SimpleSessionManager", "loginAction=" + str);
        int i = AnonymousClass1.f14316a[valueOf.ordinal()];
        if (i == 1) {
            f14315a = Login.getUserId();
            b = Login.getSid();
            g = SessionManager.getInstance(f).getSessionExpiredTime();
            b(f14315a, b, g);
        } else if (i != 2) {
        } else {
            f14315a = null;
            b = null;
            g = -1L;
            g();
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        f = context;
        LoginBroadcastHelper.registerLoginReceiver(context, d);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AppInfo.INITED_ACTION);
        LocalBroadcastManager.getInstance(context).registerReceiver(e, intentFilter);
        SharedPreferences sharedPreferences = context.getSharedPreferences(ConfigStoreManager.MTOP_CONFIG_STORE, 0);
        c = sharedPreferences;
        f14315a = sharedPreferences.getString("mtop_u_i", "");
        b = c.getString("mtop_s_i", "");
        g = c.getLong("mtop_e_t", -1L);
    }

    private static void b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fcde7", new Object[]{str, str2, new Long(j)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            TBSdkLog.e("mtopsdk.SimpleSessionManager", "storeUserInfo, uid=" + str + ", sid=" + str2);
            SharedPreferences.Editor edit = c.edit();
            edit.putString("mtop_u_i", str);
            edit.putString("mtop_s_i", str2);
            edit.putLong("mtop_e_t", j);
            edit.apply();
        }
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = c.edit();
        edit.remove("mtop_u_i");
        edit.remove("mtop_s_i");
        edit.remove("mtop_e_t");
        edit.apply();
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f14315a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : !TextUtils.isEmpty(f14315a) && !TextUtils.isEmpty(b) && (g < 0 || System.currentTimeMillis() / 1000 < g);
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
        } else if (TextUtils.equals(f14315a, str) && TextUtils.equals(b, str2) && g == j) {
        } else {
            f14315a = str;
            b = str2;
            g = j;
            b(str, str2, j);
        }
    }
}
