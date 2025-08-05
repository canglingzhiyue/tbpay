package com.taobao.android.festival;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.taobao.TBActionBar;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.festival.b;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.festival.utils.a;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.util.StringUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.global.SDKUtils;
import tb.gjb;
import tb.gje;
import tb.kge;
import tb.nom;

/* loaded from: classes.dex */
public class FestivalMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_FESTIVAL_CHANGE = "com.taobao.android.action.FESTIVAL_CHANGE";
    public static final String ACTION_TABBAR_CHANGE_DONE = "com.taobao.android.action.FESTIVAL_TABBAR_CHANGE_DONE";
    public static final String COMMON_EXTRA_REASON = "extra-reason";
    public static final String EXTRA_FESTIVAL_CHANGE_REASON = "change-reason";
    public static final String FESTIVAL_CHANGE_REASON_CONFIG_CHANGE = "festival-config-change";
    public static final String KEY_GLOBAL_ACTIONBAR_BG = "actionBarBackgroundColor";
    @Deprecated
    public static final String KEY_GLOBAL_ACTIONBAR_BG_TYPE = "actionBarBackgroundType";
    public static final String KEY_GLOBAL_ACTIONBAR_IMG = "actionBarBackgroundImage";
    public static final String KEY_GLOBAL_ACTIONBAR_MOTION_IMG_POS = "actionbarMotionImagePos";
    public static final String KEY_GLOBAL_ACTIONBAR_UPINDICATOR = "actionBarUpIndicator";
    public static final String KEY_GLOBAL_MSGCENTER_BG = "messageBackgroundColor";
    public static final String KEY_GLOBAL_MSGCENTER_BORDER_COLOR = "messageBorderColor";
    public static final String KEY_GLOBAL_MSGCENTER_NUM_COLOR = "messageNumColor";
    public static final String MODUlE_GLOBAL = "global";
    public static final String SKIN_CHANGE_REASON_CONFIG_CHANGE = "skin-config-change";
    public static final String TAG = "festival";
    public static final int TIME_OUT_INTERVAL = 5000;

    /* renamed from: a  reason: collision with root package name */
    private static final FestivalMgr f12335a;
    private GloblaNavUIConfig d;
    private boolean e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final b b = b.a();
    private final com.taobao.android.festival.skin.b c = com.taobao.android.festival.skin.b.a();

    public static /* synthetic */ com.taobao.android.festival.skin.b a(FestivalMgr festivalMgr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.festival.skin.b) ipChange.ipc$dispatch("1774ed14", new Object[]{festivalMgr}) : festivalMgr.c;
    }

    static {
        kge.a(163482268);
        f12335a = new FestivalMgr();
    }

    public static FestivalMgr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FestivalMgr) ipChange.ipc$dispatch("8c72ff7d", new Object[0]) : f12335a;
    }

    private FestivalMgr() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f.compareAndSet(false, true)) {
        } else {
            this.b.b();
            this.c.c();
            q.a("AliFestivalWVPlugin", (Class<? extends e>) AliFestivalWVPlugin.class, true);
            IntentFilter intentFilter = new IntentFilter(a.f12369a);
            VillageBroadcastReceiver villageBroadcastReceiver = new VillageBroadcastReceiver();
            Application application = Globals.getApplication();
            if (application != null) {
                application.registerReceiver(villageBroadcastReceiver, intentFilter);
            }
            com.alibaba.ability.localization.b.a(new b.a() { // from class: com.taobao.android.festival.FestivalMgr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ability.localization.b.a
                public void a(Language language, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                    } else {
                        FestivalMgr.a(FestivalMgr.this).d();
                    }
                }
            });
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.c();
        }
    }

    public void a(Context context, TBActionBar.ActionBarStyle actionBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e07713", new Object[]{this, context, actionBarStyle});
        } else {
            a(context, (View) null, actionBarStyle);
        }
    }

    public void a(Context context, TBActionBar.ActionBarStyle actionBarStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262f1e21", new Object[]{this, context, actionBarStyle, new Boolean(z)});
        } else {
            a(context, null, actionBarStyle, z);
        }
    }

    public void a(Context context, View view, TBActionBar.ActionBarStyle actionBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87949a5", new Object[]{this, context, view, actionBarStyle});
        } else if (context == null) {
        } else {
            if (this.d == null) {
                this.d = new GloblaNavUIConfig(context);
            }
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).setIgnoreFestival(false);
            }
            this.d.a(context, view, actionBarStyle);
        }
    }

    public void a(Context context, View view, TBActionBar.ActionBarStyle actionBarStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b09dcf", new Object[]{this, context, view, actionBarStyle, new Boolean(z)});
        } else if (context == null) {
        } else {
            if (this.d == null) {
                this.d = new GloblaNavUIConfig(context);
            }
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).setIgnoreFestival(z);
            }
            this.d.a(context, view, actionBarStyle, z);
        }
    }

    public int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        if (f()) {
            return this.b.a(str, str2, i);
        }
        return this.c.a(str, str2, i);
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (f()) {
            return this.b.a(str, str2);
        }
        return this.c.a(str, str2);
    }

    public String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{this, str, str2, new Boolean(z)});
        }
        if (f()) {
            return this.b.a(str, str2);
        }
        return this.c.a(str, str2, z);
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : (!f() && d.f()) ? this.c.d(str, str2) : "";
    }

    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        if (f()) {
            return this.b.b(str, str2);
        }
        return this.c.b(str, str2);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (f()) {
            return this.b.a(str);
        }
        return this.c.b(str);
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (f()) {
            return this.b.a(str, i);
        }
        return this.c.a(str, i);
    }

    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bded401", new Object[]{this, str, str2});
        }
        if (f()) {
            return this.b.c(str, str2);
        }
        return this.c.c(str, str2);
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        if (f()) {
            return this.b.b(str);
        }
        return this.c.c(str);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : f() ? "" : this.c.a(str);
    }

    public boolean f() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.c.b()) {
            String g = gjb.g(gjb.SP_KEY_IGNORE_FESTIVAL_VESION);
            try {
                j = Long.parseLong(gjb.g(gjb.SP_KEY_IGNORE_FESTIVAL_END_TIME));
            } catch (Exception unused) {
                j = 0;
            }
            String str = com.taobao.android.festival.festival.a.a().f12349a;
            return (str == null || !str.equals(g) || "".equals(g) || "0".equals(g)) && (SDKUtils.getCorrectionTime() >= j || j == 0) && d.d() && this.b.d();
        }
        return this.b.d();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c.b();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.e;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return !(StringUtil.isEmpty(a("global", "tabbarImagesURL_home")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_home_second_selected")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_we")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_we_selected")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_community")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_community_selected")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_cart")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_cart_selected")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_my")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_my_selected")) && StringUtil.isEmpty(a("global", "tabbarTextColorSel")) && StringUtil.isEmpty(a("global", "tabbarTextColorUnsel")) && StringUtil.isEmpty(a("global", "tabbarTextColorUnSel")) && StringUtil.isEmpty(a("global", "tabbarImagesURL_tabbar_bkg")));
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (f()) {
            return "true".equals(this.b.a("global", "isTabbarTitleSeparated"));
        }
        String c = this.c.c("global", "isTabbarTitleSeparated");
        return !TextUtils.isEmpty(c) && "true".equals(c);
    }

    public Map<String, String> j() {
        com.taobao.android.festival.skin.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db121866", new Object[]{this});
        }
        String str = "0";
        String str2 = (f() || ((bVar = this.c) != null && bVar.b())) ? "1" : str;
        String a2 = a("global", nom.KEY_NAVI_STYLE);
        String str3 = "getFestivalStyle: " + a2;
        if (TextUtils.isEmpty(a2)) {
            a2 = "-1";
        }
        try {
            int parseInt = Integer.parseInt(a2);
            str = (parseInt + 1) + "";
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isFestivalOn", str2);
        hashMap.put("navStyle", str);
        return hashMap;
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        return b("global", i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "anim_tab_5" : "anim_tab_4" : "anim_tab_3" : "anim_tab_2" : "anim_tab_1");
    }

    /* loaded from: classes.dex */
    public class VillageBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-127646804);
        }

        private VillageBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            String str = "onReceive: " + action;
            if (!a.f12369a.equals(action)) {
                return;
            }
            if (com.taobao.android.tbelder.b.c()) {
                FestivalMgr.a(FestivalMgr.this).d();
                return;
            }
            SkinConfig d = gje.a().d();
            if (d != null && d.isValidConfig() && !"true".equals(gjb.g(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN))) {
                return;
            }
            gje.a().g();
            FestivalMgr.a(FestivalMgr.this).d();
        }
    }
}
