package com.taobao.taolive.room.controller2;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class j implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LIVEHOMEMIX = "liveHomeMix";
    public static final String PARAM_LIVEHOME_SPM = "livehomeSpm";

    /* renamed from: a  reason: collision with root package name */
    public static String f21601a;
    private static String f;
    private static String g;
    private static int h;
    private Activity b;
    private FrameLayout c;
    private FrameLayout d;
    private String e = aa.bI();
    private DXRootView i;

    static {
        kge.a(-1930386318);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveHomePageTab";
    }

    public j(Activity activity, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.b = activity;
        this.c = frameLayout;
        this.d = frameLayout2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (StringUtils.isEmpty(this.e) || this.c == null || this.d == null || !c()) {
        } else {
            this.c.setBackgroundResource(0);
            this.i = com.taobao.taolive.room.dx.b.c().a(this.b, this.e);
            if (this.i != null) {
                com.taobao.taolive.room.dx.b.c().a(this.i, new JSONObject());
                this.d.addView(this.i);
                ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                layoutParams.width = -1;
                layoutParams.height = h;
                this.d.setLayoutParams(layoutParams);
                HashMap hashMap = new HashMap();
                hashMap.put("spm", "a2141.b52810609.topbar.hometab");
                ai.a("Show-Hometab", (HashMap<String, String>) hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("spm", "a2141.b52810609.topbar.followtab");
                ai.a("Show-Followtab", (HashMap<String, String>) hashMap2);
            }
            if (pmd.a().c() != null && pmd.a().c().a() != null) {
                pmd.a().c().a().put("changeLandscapeBtn", false);
            }
            ddw.a().a(this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        f21601a = "";
        f = "";
        g = "";
        if (pmd.a().c() == null || pmd.a().c().a() == null || pmd.a().c().a().get("changeLandscapeBtn") == null) {
            return;
        }
        pmd.a().c().a().remove("changeLandscapeBtn");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "true".equals(f21601a) && aa.bG();
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        int b = com.taobao.taolive.room.utils.d.b(aa.bJ());
        h = b;
        return b;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        f = str;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        g = str;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        String str = f;
        if (StringUtils.isEmpty(str)) {
            str = g;
        }
        return StringUtils.isEmpty(str) ? "a2141.8001249" : str;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : "true".equals(pmd.a().d().a("tblive", "enableLiveAndHomeMixSPMOrange", "true")) && c() && !StringUtils.isEmpty(e());
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!"com.taobao.taolive.room.hometab.click".equals(str) || !(obj instanceof Object[])) {
        } else {
            Object[] objArr = (Object[]) obj;
            if (!"btnClick".equals(objArr[0])) {
                return;
            }
            if ("backBtn".equals(objArr[1])) {
                this.b.finish();
            } else if ("followBtn".equals(objArr[1])) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm", "a2141.b52810609.topbar.followtab");
                ai.a("Followtab", (Map<String, String>) hashMap);
                com.taobao.taolive.room.utils.s.a(this.b, "http://h5.m.taobao.com/taolive/main.html?channelType=jingxuan,followTab");
                this.b.finish();
                this.b.overridePendingTransition(0, 0);
            } else if (!"jingxuanBtn".equals(objArr[1])) {
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("spm", "a2141.b52810609.topbar.hometab");
                ai.a("Hometab", (Map<String, String>) hashMap2);
                com.taobao.taolive.room.utils.s.a(this.b, "http://h5.m.taobao.com/taolive/main.html?channelType=jingxuan,jingxuan");
                this.b.finish();
                this.b.overridePendingTransition(0, 0);
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.hometab.click"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (com.taobao.taolive.room.utils.n.a() == null) {
            return null;
        }
        return com.taobao.taolive.room.utils.n.a().G();
    }
}
