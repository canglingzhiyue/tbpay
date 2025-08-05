package com.taobao.android.home.component.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f12725a;
    private static Context b;
    private static final Map<String, String> c;

    /* loaded from: classes.dex */
    public static class b {
        public static final c instance;

        static {
            kge.a(-209153243);
            instance = new c();
        }
    }

    public static /* synthetic */ Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[0]) : b;
    }

    static {
        kge.a(-672936366);
        f12725a = "__NULL__";
        c = new ConcurrentHashMap();
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1a728103", new Object[0]) : b.instance;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            b = context;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SharedPreferences a2 = a.a("homepage_switch");
        if (a2 == null) {
            return;
        }
        for (String str : g.f12727a) {
            c.put(str, a2.getString(str, f12725a));
        }
    }

    public String a(String str, String str2) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Map<String, String> map = c;
        if (map != null && map.containsKey(str)) {
            a2 = c.get(str);
        } else {
            a2 = a.a("homepage_switch", str, str2);
        }
        return TextUtils.equals(a2, f12725a) ? str2 : a2;
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.equals("homepage_switch", str)) {
            return a(str2, str3);
        }
        String a2 = a.a(str, str2, str3);
        return TextUtils.equals(a2, f12725a) ? str3 : a2;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        SharedPreferences a2 = a.a("homepage_switch");
        if (a2 == null) {
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        for (String str : g.f12727a) {
            String str2 = map.containsKey(str) ? map.get(str) : f12725a;
            edit.putString(str, str2);
            Map<String, String> map2 = c;
            if (map2 != null) {
                map2.put(str, str2);
            }
        }
        edit.apply();
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1665710942);
        }

        public static /* synthetic */ SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str}) : b(str);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : c(str, str2, str3);
        }

        public static boolean a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : c(str, str2, z);
        }

        public static void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            } else {
                d(str, str2, str3);
            }
        }

        public static void b(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("552009f7", new Object[]{str, str2, new Boolean(z)});
            } else {
                d(str, str2, z);
            }
        }

        private static SharedPreferences b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("7aae7987", new Object[]{str});
            }
            Context c = c.c();
            if (c == null) {
                c = Globals.getApplication();
            }
            if (c == null) {
                return null;
            }
            return c.getSharedPreferences(str, 0);
        }

        private static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{str, str2, str3});
            }
            SharedPreferences b = b(str);
            return b != null ? b.getString(str2, str3) : str3;
        }

        private static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences b = b(str);
            if (b == null) {
                return;
            }
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str2, str3);
            edit.apply();
        }

        private static boolean c(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c853f1a", new Object[]{str, str2, new Boolean(z)})).booleanValue();
            }
            SharedPreferences b = b(str);
            return b != null ? b.getBoolean(str2, z) : z;
        }

        private static void d(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63ea7435", new Object[]{str, str2, new Boolean(z)});
                return;
            }
            SharedPreferences b = b(str);
            if (b == null) {
                return;
            }
            SharedPreferences.Editor edit = b.edit();
            edit.putBoolean(str2, z);
            edit.apply();
        }
    }
}
