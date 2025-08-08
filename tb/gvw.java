package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.layoutmanager.adapter.impl.p;
import com.taobao.android.layoutmanager.container.h;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.android.tab2liveroom.liveroom.c;
import com.taobao.android.tab2liveroom.liveroom.e;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.container.p;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.y;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class gvw extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_EXTPARAMS = "extParams";
    public static final String CONFIG_ITEMIDS = "itemIds";
    public static final String CONFIG_LAUNCH = "sLaunch";
    public static final String ITEM_ID_PLACE_HOLDER = "__ITEMID__";
    public static final String RENDER_RESULT_HAS_DW_INSTANCE = "hasDWInstance";
    public static final String RENDER_RESULT_IS_FROM_CACHE = "isFromCache";
    public static final String RENDER_RESULT_IS_LOCAL_VIDEO = "isLocalVideo";
    public static final String TABID_FOLLOW = "follow";
    public static final String TABID_HOME = "home";
    public static final String TABID_INNERLIVE = "innerLive";
    public static final String TABID_NEW_FOLLOW = "newFollow";
    public static final String TABID_VIDEO = "video";
    private static boolean c;
    private static boolean h;
    private static boolean i;
    private static boolean j;

    /* renamed from: a  reason: collision with root package name */
    private boolean f28525a;
    private boolean b;
    private boolean g;
    private Drawable k;
    private boolean l;

    private Object a(Object obj, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("345891ae", new Object[]{this, obj, context}) : obj != null ? obj : context;
    }

    public static /* synthetic */ Object ipc$super(gvw gvwVar, String str, Object... objArr) {
        if (str.hashCode() == 691625481) {
            return new Boolean(super.a((TNodeView) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(gvw gvwVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce3b84c", new Object[]{gvwVar, obj});
        } else {
            gvwVar.b(obj);
        }
    }

    public static /* synthetic */ void b(Application application, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1648f1", new Object[]{application, uri});
        } else {
            c(application, uri);
        }
    }

    static {
        kge.a(-654601451);
        h = false;
        i = false;
        c = false;
        j = false;
    }

    public gvw(m.b bVar) {
        super(bVar);
        this.g = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, TNodeView tNodeView, Object obj, m.b bVar) {
        int a2;
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abedc124", new Object[]{this, context, tNodeView, obj, bVar});
            return;
        }
        ogg.a("Tab2RenderIntercept", "[preloadvideo] onInterceptStartRender");
        ogt.a(ogt.TASK_PAGE_INIT);
        this.b = a(bVar.d);
        String str = null;
        if (bVar.d != null) {
            str = bVar.d.getQueryParameter("tabid");
        }
        if (this.b) {
            i.a(str, !StringUtils.equals(bVar.d.getPath(), "/guangguang/index.htm"));
            this.f28525a = a(bVar.d, "video", true);
            if (!this.e || this.d) {
                return;
            }
            ogg.a("Tab2RenderIntercept", "pageAppearDonotSkip");
            this.d = true;
            a(context, bVar, obj);
            b(bVar);
            if (this.f28525a) {
                c(bVar.d);
                if (!a(context, obj, tNodeView, true, a(context, tNodeView, bVar.d, "video", true))) {
                    return;
                }
                a(context, obj, true);
                return;
            }
            boolean a3 = a(bVar.d, TABID_INNERLIVE, true);
            if (a3 && oeb.a("enableLiveRoomStartTrack", true)) {
                e.a(context, bVar);
            }
            a(context, tNodeView, bVar.d, TABID_INNERLIVE, a3);
        } else if (!a(context)) {
        } else {
            ogg.a("Tab2RenderIntercept", "[preloadvideo] isTab2HotLauncher true");
            Object i2 = i();
            Map instanceState = MainDexContainerFragment.getInstanceState("tab2");
            if (instanceState != null && (a2 = oec.a(instanceState.get(TabBarControllerComponent.SELECTED_INDEX_STATE_NAME), -1)) != (e = e(i2)) && a2 >= 0) {
                ogg.a("Tab2RenderIntercept", "ignore startRender for index not equal,  savedTabIndex:" + a2 + " cacheTabIndex:" + e);
                return;
            }
            ogg.a("Tab2RenderIntercept", "[preloadvideo] startRender...");
            JSONObject a4 = a(context, tNodeView, bVar.d, !StringUtils.isEmpty(str) ? str : d(i2), false);
            if (a4 == null) {
                return;
            }
            a(context, obj, false);
            if (a(context, obj, tNodeView, false, a4) || !this.l) {
                return;
            }
            a(obj, tNodeView);
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return "https://h5.m.taobao.com/tnode/index.htm?tnode=" + Uri.encode("page_guangguang?preload=true&initDataKey=guangguang&hideNav=true&pageTrack=false");
    }

    private void a(final Object obj, TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bea9a9", new Object[]{this, obj, tNodeView});
            return;
        }
        tNodeView.setUpperViewChangeCallback(new TNodeView.e() { // from class: tb.gvw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.e
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    gvw.a(gvw.this, obj);
                }
            }
        });
        oec.a(new Runnable() { // from class: tb.gvw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    gvw.a(gvw.this, obj);
                }
            }
        }, 1000L);
    }

    private static String d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb50579", new Object[]{obj});
        }
        if (obj instanceof Map) {
            int e = e(obj);
            List a2 = oec.a(((Map) obj).get("tabs"), (List) null);
            if (a2 != null && e >= 0 && e < a2.size()) {
                return oec.a(oec.a(a2.get(e), (Map) null).get("id"), (String) null);
            }
        }
        return null;
    }

    private static Object i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f161dcc2", new Object[0]);
        }
        ab b = ab.b(b());
        if (b != null && b.A() != null) {
            return b.A().D();
        }
        return ohh.c("guangguang");
    }

    private static int e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ceeb773b", new Object[]{obj})).intValue();
        }
        if (!(obj instanceof Map)) {
            return -1;
        }
        return oec.a(((Map) obj).get(g.KEY_SELECTED_INDEX), -1);
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        d b = a.a().b();
        return !this.b && b != null && b.a(context);
    }

    private String[] d(String str) {
        Object c2;
        List a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("52e2b884", new Object[]{this, str});
        }
        ab b = ab.b(b());
        if (b != null && b.A() != null) {
            c2 = b.A().D();
        } else {
            c2 = ohh.c("guangguang");
        }
        if ((c2 instanceof Map) && (a2 = oec.a(((Map) c2).get("tabs"), (List) null)) != null) {
            for (Object obj : a2) {
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (StringUtils.equals(oec.a(map.get("id"), (String) null), str)) {
                        return new String[]{oec.a(map.get("pageName"), (String) null), oec.a(map.get("spm"), (String) null)};
                    }
                }
            }
        }
        return null;
    }

    private String[] e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("df82e385", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1268958287:
                if (str.equals("follow")) {
                    c2 = 2;
                    break;
                }
                break;
            case -528197534:
                if (str.equals(TABID_INNERLIVE)) {
                    c2 = 3;
                    break;
                }
                break;
            case 3208415:
                if (str.equals("home")) {
                    c2 = 1;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c2 = 0;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return new String[]{"Page_videointeract", "a310p.13800399"};
        }
        if (c2 == 1) {
            return new String[]{"Page_GuangGuangHome", "a21afv.19776901"};
        }
        if (c2 == 2) {
            return new String[]{"Page_GuangGuangFollow", "a21afv.19776902"};
        }
        if (c2 == 3) {
            if (!oeb.a("enableLiveRoomContainerTrack", true)) {
                return null;
            }
            return d(str);
        }
        return d(str);
    }

    private void a(Context context, m.b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c29f77", new Object[]{this, context, bVar, obj});
            return;
        }
        String queryParameter = bVar.d.getQueryParameter("spm");
        String[] e = e(bVar.d.getQueryParameter("tabid"));
        if (e == null || e[0] == null || e[1] == null) {
            return;
        }
        String str = e[0];
        String str2 = e[1];
        Object a2 = a(obj, context);
        if (oeb.a("fixTab2PageAppear", true)) {
            a.a().k().d(a2, str);
        } else if (obj instanceof f) {
            a.a().k().a(obj, str);
        } else {
            a.a().k().d(context, str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str2);
        if (!StringUtils.isEmpty(queryParameter)) {
            hashMap.put("spm-url", queryParameter);
        }
        a.a().k().a(a2, hashMap);
    }

    private void d(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c194e1d9", new Object[]{this, context, obj});
            return;
        }
        View c2 = c(obj);
        if (c2 == null) {
            return;
        }
        this.k = c2.getBackground();
        c2.setBackgroundColor(-16777216);
        if (!oeb.a("interceptTabbarColor", true) || !a(context)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR, (Object) (-14540254));
        NavigationTabModule.changeTabBarColor(new g.c(null, jSONObject, null));
    }

    private void b(Object obj) {
        View c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (this.k == null || (c2 = c(obj)) == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 16) {
                c2.setBackground(this.k);
            } else {
                c2.setBackgroundDrawable(this.k);
            }
        }
    }

    private View c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a4c57788", new Object[]{this, obj});
        }
        if (obj instanceof f) {
            return ((f) obj).getContentView();
        }
        if (!(obj instanceof Fragment)) {
            return null;
        }
        return ((Fragment) obj).getView();
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            if (jSONObject.getBoolean(RENDER_RESULT_HAS_DW_INSTANCE).booleanValue()) {
                int b = p.b();
                if (b == 0) {
                    z = false;
                }
                return oeb.a("delayRenderTab2InHot" + b, z);
            }
        } catch (Exception e) {
            ogg.a("Tab2RenderIntercept", "enableDelayTab2RenderInHotLauncher error: " + e.getMessage());
        }
        return false;
    }

    private void a(Context context, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726b3e18", new Object[]{this, context, obj, new Boolean(z)});
        } else if (z) {
            boolean a2 = i.a(context, i.FEATURE_USE_LOCAL_VIDEO_PLAY, true);
            if (!(obj instanceof f) || a2) {
                return;
            }
            this.l = true;
        } else if (!oeb.a("ShortVideo.enableBlackForHot", true)) {
        } else {
            this.l = true;
        }
    }

    private boolean a(Context context, final Object obj, final TNodeView tNodeView, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc655111", new Object[]{this, context, obj, tNodeView, new Boolean(z), jSONObject})).booleanValue();
        }
        if (!(z ? a(context, i.FEATURE_DELAY_TAB2_RENDER, true) : a(jSONObject))) {
            return false;
        }
        tNodeView.setSuspendLayoutState(true);
        tNodeView.setSuspendStateChangeCallback(new TNodeView.d() { // from class: tb.gvw.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.d
            public void a(boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                } else if (z2) {
                } else {
                    gvw.a(gvw.this, obj);
                }
            }
        });
        Runnable runnable = new Runnable() { // from class: tb.gvw.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    tNodeView.setSuspendLayoutState(false);
                }
            }
        };
        int i2 = 1000;
        if (p.a()) {
            i2 = SecExceptionCode.SEC_ERROR_MALDETECT;
        }
        int b = p.b();
        oec.a(runnable, oeb.a("suspendLayoutTimeout" + b, i2));
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
        } else if (aaVar != null) {
            ogt.a(ogt.TASK_PAGE_INIT, (JSONObject) null);
        } else {
            ogt.a(ogt.TASK_PAGE_INIT, (String) null, (JSONObject) null);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public boolean a(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29395e09", new Object[]{this, tNodeView})).booleanValue();
        }
        try {
            if (super.a(tNodeView) && this.f != null) {
                if (!this.f.f()) {
                    if (this.f28525a) {
                        if (StringUtils.equals(this.f.d.getQueryParameter("source"), "outside")) {
                        }
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, aa aaVar, String str, String str2, Map map) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41dc10a9", new Object[]{this, context, aaVar, str, str2, map});
        } else if ((!StringUtils.equals(str, "Page_videointeract") && (str2 == null || !str2.startsWith("a310p.13800399"))) || (a2 = com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().a((String) null)) == null || a2.size() <= 0) {
        } else {
            try {
                map.put("subtasks", a2.toJSONString());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1434fc3c", new Object[]{this, context, obj});
            return;
        }
        if (this.l && this.g) {
            d(context, obj);
        }
        if (this.e && this.d && !this.g) {
            ogg.a("Tab2RenderIntercept", "onResumeRender");
            if (!(obj instanceof f)) {
                a.a().k().b(obj);
            }
        }
        this.g = false;
    }

    private void c(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ca3ffa", new Object[]{this, context, obj});
            return;
        }
        JSONArray a2 = com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().a("video");
        if (a2 != null && a2.size() > 0) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("subtasks", a2.toJSONString());
            } catch (Throwable unused) {
            }
            a.a().k().a(a(obj, context), hashMap);
        }
        com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().b("video");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void b(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dff9e1b", new Object[]{this, context, obj});
            return;
        }
        c(context, obj);
        if (!this.e || !this.d) {
            return;
        }
        ogg.a("Tab2RenderIntercept", "onPauseRender");
        a.a().k().a(a(obj, context));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, Object obj, Object obj2, m.b bVar) {
        Map instanceState;
        int a2;
        Map map;
        int b;
        int b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d64f513", new Object[]{this, context, obj, obj2, bVar});
        } else if (a(bVar.d, "video", true)) {
            if (!(obj2 instanceof Map)) {
                return;
            }
            Map map2 = (Map) obj2;
            if (oec.a(map2.get("tabs"), (List) null) == null || (b2 = b(map2, "video")) == -1 || !oeb.a("enableInterceptVideoIndex", false)) {
                return;
            }
            map2.put(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(b2));
        } else if (a(bVar.d, "home", true)) {
            if (!(obj2 instanceof Map) || (b = b((map = (Map) obj2), "home")) == -1 || !oeb.a("enableInterceptHomeIndex", false)) {
                return;
            }
            map.put(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(b));
        } else if (!a(context) || (instanceState = MainDexContainerFragment.getInstanceState("tab2")) == null || (a2 = oec.a(instanceState.get(TabBarControllerComponent.SELECTED_INDEX_STATE_NAME), -1)) < 0) {
        } else {
            ogg.a("Tab2RenderIntercept", "onInterceptData, update selectedIndex to " + a2);
            ((Map) obj2).put(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, Integer.valueOf(a2));
        }
    }

    private int b(Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39066b39", new Object[]{this, map, str})).intValue();
        }
        List a2 = oec.a(map.get("tabs"), (List) null);
        if (a2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (a(oec.a(a2.get(i2), (Map) null), str)) {
                return i2;
            }
        }
        return -1;
    }

    private boolean a(Map map, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7b3ceab", new Object[]{this, map, str})).booleanValue() : map != null && StringUtils.equals(oec.a(map.get("id"), (String) null), str);
    }

    private static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue() : StringUtils.equals(str, "0") && StringUtils.equals(str2, str3);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : ohg.a().a("weitao_switch", "invalidSymbols", "__GUANG_CONTENT_ID__,__ITEMID__").split(",")) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, y yVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e9584e1", new Object[]{str, str2, yVar, jSONObject})).booleanValue();
        }
        if (oeb.bB() && StringUtils.equals(str, "mtop") && StringUtils.equals(str2, com.taobao.android.layoutmanager.container.f.GUANGGUANG_DSL_KEY) && (yVar instanceof h.a)) {
            Map a2 = ((h.a) yVar).a();
            if (a(oec.a(a2.get(CONFIG_LAUNCH), (String) null), oec.a(a2.get("tabid"), (String) null), "video") && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("args")) != null && (jSONObject3 = jSONObject2.getJSONObject("data")) != null && StringUtils.equals(jSONObject3.getString("entityId"), "31331")) {
                ogg.a("Tab2RenderIntercept", "intercept Mtop Prefetch");
                return false;
            }
        }
        return true;
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue() : StringUtils.equals(str, "video") || StringUtils.equals(str, "newFollow");
    }

    private JSONObject a(Context context, TNodeView tNodeView, Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f72e1b50", new Object[]{this, context, tNodeView, uri, str, new Boolean(z)});
        }
        if (f(str)) {
            try {
                ogg.a("Tab2RenderIntercept", "[preloadvideo] start createPreloadImpl...");
                JSONObject startRender = FluidSDK.startRender(context, tNodeView, uri, str, z);
                ogg.a("Tab2RenderIntercept", "[preloadvideo] 预渲染 " + startRender);
                return startRender;
            } catch (Throwable th) {
                ogg.a("Tab2RenderIntercept", "预创建失败:" + th.getMessage());
                return null;
            }
        } else if (!StringUtils.equals(str, TABID_INNERLIVE) || !z) {
            return null;
        } else {
            a(tNodeView, uri);
            return null;
        }
    }

    private void a(final TNodeView tNodeView, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad61e2", new Object[]{this, tNodeView, uri});
        } else if (!oeb.a("enableReuseLivePlayer", true) || j) {
        } else {
            j = true;
            c cVar = new c(tNodeView, uri) { // from class: tb.gvw.5
            };
            cVar.a();
            int b = cVar.b();
            if (b == 0 || b == -1) {
                ogg.c("Tab2RenderIntercept", "state is " + b + " ignore suspendLayout");
                return;
            }
            tNodeView.setSuspendLayoutState(true);
            cVar.a(new p.a() { // from class: tb.gvw.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.container.p.a
                public void a(int i2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i2), obj});
                    } else if (i2 != -1 && i2 != 3 && i2 != 4) {
                    } else {
                        ogg.c("Tab2RenderIntercept", "onStateChanged: " + i2);
                        tNodeView.setSuspendLayoutState(false);
                    }
                }
            });
        }
    }

    private static boolean a(Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("757da0f", new Object[]{uri, str, new Boolean(z)})).booleanValue();
        }
        if (uri == null || (z && !a(uri))) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("tabid");
        if (StringUtils.equals(queryParameter, str)) {
            return true;
        }
        if (StringUtils.isEmpty(queryParameter)) {
            String d = d(i());
            if (oeb.a("enableCompareDefaultTab", true) && StringUtils.equals(d, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue();
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(CONFIG_LAUNCH);
            if (d(uri) && StringUtils.equals(queryParameter, "0")) {
                return true;
            }
        }
        return false;
    }

    public static void c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beadfb1d", new Object[]{uri});
        } else {
            a((Context) null, uri, 10000);
        }
    }

    public static void a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd717ce7", new Object[]{context, uri});
        } else {
            a(context, uri, 10000);
        }
    }

    public static void a(final Application application, final Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189c22b0", new Object[]{application, uri});
        } else if (!d(uri)) {
        } else {
            ab.a((Context) application);
            i.f();
            if (!a(uri, "video", true)) {
                return;
            }
            oec.a(new Runnable() { // from class: tb.gvw.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        gvw.b(application, uri);
                    }
                }
            }, true);
        }
    }

    private static void c(Application application, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3906f32", new Object[]{application, uri});
        } else if (a((Context) application, i.FEATURE_LINKBACK_PREFETCH, true)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) uri.toString());
            jSONObject.put("type", (Object) 10);
            jSONObject.put("duration", (Object) Integer.valueOf(oeb.bL()));
            com.taobao.android.fluid.c.d(application);
            ogg.a("Tab2RenderIntercept", "新架构 initTBVideoSDK 初始化成功");
            FluidSDK.doPreload(d(), jSONObject);
        } else {
            a(application, uri, oeb.bL());
        }
    }

    private static Activity d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("26eeb89d", new Object[0]) : com.taobao.application.common.c.b();
    }

    private static void a(Context context, Uri uri, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0be92fc", new Object[]{context, uri, new Integer(i2)});
            return;
        }
        String path = uri.getPath();
        String queryParameter = uri.getQueryParameter(CONFIG_LAUNCH);
        String queryParameter2 = uri.getQueryParameter("tabid");
        String queryParameter3 = uri.getQueryParameter("extParams");
        ogg.a("Tab2RenderIntercept", "path:" + path + " sLaunch:" + queryParameter + " tabId:" + queryParameter2 + " extParams:" + queryParameter3);
        if (a(uri)) {
            i.a(queryParameter2, !StringUtils.equals(path, "/guangguang/index.htm"));
        }
        boolean a2 = a(uri, "video", true);
        boolean a3 = a(uri, TABID_INNERLIVE, true);
        if (a2) {
            a(uri, queryParameter3, i2);
        } else if (a3) {
            b(uri, queryParameter3);
        } else if (a.a().b().a(context)) {
            if (!a(uri, "video", false)) {
                return;
            }
            FluidSDK.startWarmUp(context, uri);
        } else {
            Log.e("Tab2RenderIntercept", "skip preloadVideoMtopWithTimeOut");
        }
    }

    private static void b(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33986c8", new Object[]{uri, str});
        } else if (!oeb.a("enableLiveTabPreload", true) || c) {
        } else {
            ogg.c("Tab2RenderIntercept", "executeLiveTabPreloadTask:" + uri.toString());
            c = true;
            try {
                com.taobao.taolive.room.d.a((Application) ab.a(), e.a(uri, str));
            } catch (Throwable th) {
                ogg.c("Tab2RenderIntercept", "executeLiveTabPreloadTask:" + th.getMessage());
            }
        }
    }

    private static void a(Uri uri, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7579a3a", new Object[]{uri, str, new Integer(i2)});
        } else if (!a(str) && !h) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("startIntent", uri.toString());
                hashMap.put("prefetchTimeOut", Integer.valueOf(i2));
                com.taobao.android.fluid.c.a((Application) ab.a(), hashMap);
                ogg.a("Tab2RenderIntercept", "新架构 init 初始化成功");
                ogg.c("Tab2RenderIntercept", "preloadVideoMtop");
                h = true;
            } catch (Throwable th) {
                Log.e("Tab2RenderIntercept", "preloadVideoMtop:" + th.getMessage());
            }
        } else {
            Log.e("Tab2RenderIntercept", "skip preloadVideoMtopWithTimeOut");
        }
    }

    public static boolean i(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5d05adb", new Object[]{uri})).booleanValue();
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("tnode");
            if (!StringUtils.isEmpty(queryParameter)) {
                return StringUtils.equals("guangguang", Uri.parse(queryParameter).getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_INIT_DATA_KEY));
            }
        }
        return false;
    }

    public static boolean d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4533b5c0", new Object[]{uri})).booleanValue();
        }
        if (uri != null) {
            String path = uri.getPath();
            if (StringUtils.equals(path, "/guangguang/index.htm")) {
                return true;
            }
            if (com.taobao.android.layoutmanager.a.c(path)) {
                String queryParameter = uri.getQueryParameter("tnode");
                if (!StringUtils.isEmpty(queryParameter)) {
                    String path2 = Uri.parse(queryParameter).getPath();
                    return StringUtils.equals(com.taobao.tao.flexbox.layoutmanager.container.g.GUANGGUANG_SHORT_LINK, path2) || (path2 != null && path2.contains("/guangguang/"));
                }
            }
        }
        return false;
    }

    private static void b(m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94e8d64", new Object[]{bVar});
        } else if (i) {
        } else {
            ogg.c("Tab2RenderIntercept", "notifyAnalyticsMgr");
            AnalyticsMgr.b();
            i = true;
        }
    }

    public static Uri e(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ed7d2392", new Object[]{uri});
        }
        if (uri == null || !StringUtils.equals(uri.getPath(), "/guangguang/index.htm")) {
            return uri;
        }
        String query = uri.getQuery();
        if (!StringUtils.isEmpty(query)) {
            str = query + "&source=outside&tnode=page_guangguang%3FnavbarHide%3Dtrue%26initDataKey%3Dguangguang%26immersive%3Dtrue%26pageTrack%3Dfalse";
        } else {
            str = "source=outside&tnode=page_guangguang%3FnavbarHide%3Dtrue%26initDataKey%3Dguangguang%26immersive%3Dtrue%26pageTrack%3Dfalse";
        }
        return Uri.parse("https://h5.m.taobao.com/tnode/index.htm?" + str);
    }

    public static Uri f(Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("4ecfc031", new Object[]{uri});
        }
        if (uri == null || (queryParameter = uri.getQueryParameter("extParams")) == null || !queryParameter.contains(ITEM_ID_PLACE_HOLDER)) {
            return uri;
        }
        String queryParameter2 = uri.getQueryParameter("itemIds");
        return !StringUtils.isEmpty(queryParameter2) ? oec.a(uri, "extParams", queryParameter.replace(ITEM_ID_PLACE_HOLDER, queryParameter2)) : uri;
    }

    public static boolean a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        String queryParameter = parse.getQueryParameter(CONFIG_LAUNCH);
        String queryParameter2 = parse2.getQueryParameter(CONFIG_LAUNCH);
        String queryParameter3 = parse.getQueryParameter("extParams");
        String queryParameter4 = parse2.getQueryParameter("extParams");
        String queryParameter5 = parse.getQueryParameter("tabid");
        String queryParameter6 = parse2.getQueryParameter("tabid");
        if (!StringUtils.equals(queryParameter, queryParameter2) || !StringUtils.equals(queryParameter3, queryParameter4) || !StringUtils.equals(queryParameter5, queryParameter6)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sameUrl:");
        sb.append(z);
        if (z) {
            str3 = "";
        } else {
            str3 = "firstExtParams :" + queryParameter3 + " secondExtParams:" + queryParameter4;
        }
        sb.append(str3);
        ogg.c("Tab2RenderIntercept", sb.toString());
        return z;
    }
}
