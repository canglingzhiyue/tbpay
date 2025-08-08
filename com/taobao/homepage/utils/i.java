package com.taobao.homepage.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.home.component.utils.c;
import com.taobao.login4android.api.Login;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.Globals;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.ope;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17289a;
    private static boolean b;

    static {
        kge.a(-912295274);
        b = true;
        f17289a = false;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (d(context)) {
            if (!Boolean.valueOf(com.taobao.android.home.component.utils.j.a("triggerFuse", false)).booleanValue()) {
                return;
            }
            b = false;
        } else {
            int e = e(context) + 1;
            if (e == 3) {
                c(context);
            } else {
                a(context, e);
            }
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        int e = e(context) - 1;
        if (e < 0) {
            e = 0;
        }
        a(context, e);
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        SharedPreferences.Editor edit = f(context).edit();
        edit.putBoolean("secondRefreshRollback", true);
        edit.apply();
        if (Boolean.valueOf(com.taobao.android.home.component.utils.j.a("triggerFuse", false)).booleanValue()) {
            b = false;
        }
        ope.b(context);
    }

    private static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        boolean z = f(context).getBoolean("secondRefreshRollback", false);
        s.f18233a.d().a("secondRefreshRollback", Boolean.valueOf(z));
        com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "getSecondRefreshRollback: " + z);
        return z;
    }

    private static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = f(context).edit();
        edit.putInt("coldStartErrorNum", i);
        edit.apply();
    }

    private static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        int i = f(context).getInt("coldStartErrorNum", 0);
        com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "getColdStartErrorNum: " + i);
        return i;
    }

    private static SharedPreferences f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("e6a3108f", new Object[]{context}) : context.getSharedPreferences("homepage_switch", 0);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!b) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "Home_Page_SecondRefreshOpt");
        com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "isOpenSecondRefreshOpt: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.equals(str, "coldStart")) {
            return b();
        }
        String oldUserId = Login.getOldUserId();
        c.a.b("homepage_switch", "user_id", oldUserId);
        return oldUserId;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (a()) {
            String a2 = c.a.a("homepage_switch", "user_id", "");
            if (StringUtils.isEmpty(a2)) {
                Mtop mtop = Mtop.getInstance(Mtop.Id.INNER);
                if (mtop != null) {
                    a2 = mtop.getUserId();
                    com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "mtop getUserId: " + a2);
                }
                if (StringUtils.isEmpty(a2)) {
                    a2 = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getString("UserId", "");
                    com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "sp getUserId: " + a2);
                }
            }
            com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "getUserId: " + a2);
            return a2;
        }
        return Login.getOldUserId();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (StringUtils.equals(str, "coldStart") && a()) {
            return c.a.a("homepage_switch", "user_nick", "");
        }
        String oldNick = Login.getOldNick();
        c.a.b("homepage_switch", "user_nick", oldNick);
        return oldNick;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (a()) {
            Mtop mtop = Mtop.getInstance(Mtop.Id.INNER);
            String str = null;
            if (mtop != null) {
                str = mtop.getSid();
            }
            return !StringUtils.isEmpty(str);
        }
        return Login.checkSessionValid();
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (!b || !f17289a || !StringUtils.equals(str, "coldStart") || com.taobao.tao.topmultitab.a.c()) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "Home_Page_EnableStream");
        com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "enableStream: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "Home_Page_SignFree");
        com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "homeSignFree: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        boolean z = a() && ABGlobal.isFeatureOpened(Globals.getApplication(), "Home_Page_NoUseGateWay");
        com.taobao.android.home.component.utils.e.e("SecondRefreshUtils", "noUseGateWay: " + z);
        return z;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f17289a = z;
        }
    }
}
