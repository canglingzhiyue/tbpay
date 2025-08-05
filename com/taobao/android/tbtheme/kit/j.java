package com.taobao.android.tbtheme.kit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbtheme.kit.i;
import com.taobao.orange.OrangeConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_THEME_CHANGE = "com.taobao.android.action.THEME_CHANGE";

    /* renamed from: a */
    private static volatile j f15443a;
    private BroadcastReceiver c;
    private final List<WeakReference<ThemeFrameLayout>> b = new CopyOnWriteArrayList();
    private i d = new i();

    static {
        kge.a(-883958364);
    }

    public static /* synthetic */ void a(j jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed4cb17", new Object[]{jVar, str});
        } else {
            jVar.c(str);
        }
    }

    private j() {
        OrangeConfig.getInstance().getConfigs(f.MODULE_NAME);
        OrangeConfig.getInstance().registerListener(new String[]{f.MODULE_NAME}, new d(), true);
        g();
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("61023853", new Object[0]);
        }
        if (f15443a == null) {
            synchronized (j.class) {
                if (f15443a == null) {
                    f15443a = new j();
                }
            }
        }
        return f15443a;
    }

    public ThemeFrameLayout a(Context context, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeFrameLayout) ipChange.ipc$dispatch("bbf71beb", new Object[]{this, context, gVar});
        }
        if (gVar == null) {
            m.a("ThemeManager", "createThemeView", "config is null");
            return null;
        } else if (!f.a() && !f.a(gVar.f15437a)) {
            m.a("ThemeManager", "createThemeView", "canUseTheme=" + f.a() + ",biz=" + gVar.f15437a);
            return null;
        } else {
            ThemeFrameLayout themeFrameLayout = new ThemeFrameLayout(context, gVar);
            themeFrameLayout.loadData(b(gVar.f15437a));
            this.b.add(new WeakReference<>(themeFrameLayout));
            return themeFrameLayout;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new BroadcastReceiver() { // from class: com.taobao.android.tbtheme.kit.ThemeManager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                    } else {
                        j.a(j.this, (String) null);
                        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(j.ACTION_THEME_CHANGE));
                    }
                }
            };
        }
        b.a(true, this.c, FestivalMgr.ACTION_FESTIVAL_CHANGE);
    }

    public void a(String str, ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b1c9ae", new Object[]{this, str, themeData});
        } else if (TextUtils.isEmpty(str) || themeData == null) {
        } else {
            this.d.a(str, themeData);
            c(str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        ThemeData a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (TextUtils.isEmpty(str) || jSONObject == null || (a2 = l.a(jSONObject)) == null) {
        } else {
            a(str, a2);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.d.b(str);
            c(str);
        }
    }

    public void a(String str, i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58913d9b", new Object[]{this, str, aVar});
        } else {
            this.d.a(str, aVar);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        for (WeakReference<ThemeFrameLayout> weakReference : this.b) {
            ThemeFrameLayout themeFrameLayout = weakReference.get();
            if (themeFrameLayout == null) {
                this.b.remove(weakReference);
            } else if (str == null || themeFrameLayout.getBizName().equals(str)) {
                themeFrameLayout.loadData(b(themeFrameLayout.getBizName()));
            }
        }
    }

    public ThemeData b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeData) ipChange.ipc$dispatch("b0bf6a3f", new Object[]{this, str}) : this.d.a(str);
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : this.d.a(str, str2);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f.a();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (a() == null) {
            return false;
        }
        return "0".equalsIgnoreCase(a().d.a((String) null).naviStyle);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : e.a();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : e.c();
    }

    public static ThemeData f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("2cab3f05", new Object[0]);
        }
        if (a() != null) {
            return a().d.a((String) null);
        }
        return i.a();
    }
}
