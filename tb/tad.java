package tb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.home.component.utils.h;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.homepage.windvane.b;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tbpoplayer.view.c;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class tad extends oqk implements b, a.InterfaceC0864a, a.b, a.c, a.InterfaceC0865a, TBSwipeRefreshLayout.OnPullRefreshListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final kvw b;
    private final i c;
    private JSONObject d;
    private String e;
    private boolean h;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f33981a = Arrays.asList("tryShowTabTips", "showDownPanelTips");
    private long f = 0;
    private int g = 0;
    private final Handler i = new Handler(Looper.getMainLooper()) { // from class: tb.tad.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            tad.a(tad.this);
        }
    };

    static {
        kge.a(-299194154);
        kge.a(1899295032);
        kge.a(1859269034);
        kge.a(1169888983);
        kge.a(-488705348);
        kge.a(-1272151845);
        kge.a(-1531379759);
    }

    public static /* synthetic */ Object ipc$super(tad tadVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
        }
    }

    public static /* synthetic */ void a(tad tadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73e1", new Object[]{tadVar});
        } else {
            tadVar.f();
        }
    }

    public tad(kvw kvwVar, i iVar) {
        this.b = kvwVar;
        this.c = iVar;
        com.taobao.tao.homepage.windvane.a.a(this);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f33981a;
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, "tryShowTabTips")) {
            return a(this.d, wVCallBackContext);
        }
        if (!StringUtils.equals(str, "showDownPanelTips")) {
            return false;
        }
        a("multiTabEditPanelShow", a("userManually"));
        return b(str2);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.InterfaceC0864a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        g.a("TabBarGuidePopLayerManager", "onScrollStopped ");
        a(300L);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.InterfaceC0864a
    public void l_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d8e1c9", new Object[]{this, new Integer(i)});
        } else {
            a("tabSlided", a("tab"));
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.b
    public void a(int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8252c2bf", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
            return;
        }
        g.a("TabBarGuidePopLayerManager", "onTabSelected ");
        a(300L);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.b
    public void b(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787bdf6", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        g.a("TabBarGuidePopLayerManager", "onTabUnselected ");
        a("tabSlided", a("page"));
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a("multiTabEditPanelShow", a("userManually"));
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void n_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa5584b", new Object[]{this, new Integer(i)});
            return;
        }
        g.a("TabBarGuidePopLayerManager", "onPageScrollStateChanged ");
        this.e = "scroll";
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.InterfaceC0865a
    public void a(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26181c1e", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        g.a("TabBarGuidePopLayerManager", "onPageScrolled send pop event tabSlided");
        a("tabSlided", a("page"));
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        g.a("TabBarGuidePopLayerManager", "onPageScrolled send pop event dataRefresh");
        a("dataRefresh", a("pullDown"));
    }

    private JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        return jSONObject;
    }

    private boolean b(String str) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        String b = e.b(str);
        if (StringUtils.isEmpty(b) || (c = e.c(this.d, "3")) == null) {
            return false;
        }
        JSONObject jSONObject = c.getJSONObject("ext");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            c.put("ext", (Object) jSONObject);
        }
        jSONObject.put(e.KEY_TAB_ID, (Object) b);
        g.a("TabBarGuidePopLayerManager", "triggerCustomPanelShow :");
        ((com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.b.a(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY)).a(c);
        a(this.d);
        return true;
    }

    private r a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("bffa7092", new Object[]{this, str, str2, str3, str4, str5});
        }
        r rVar = new r();
        rVar.a("tips", str);
        rVar.a("buttonText", str3);
        rVar.a("anchorPointX", str4);
        rVar.a("anchorPointY", str5);
        rVar.a(e.KEY_TAB_ID, str2);
        rVar.a("passParams", "");
        return rVar;
    }

    private boolean a(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8d2ec9", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String a2 = a(jSONObject, e.KEY_TAB_ID);
        if (StringUtils.isEmpty(a2)) {
            g.a("TabBarGuidePopLayerManager", "renderGuidePopView tabId null");
            return false;
        } else if (!b(jSONObject, a2)) {
            g.a("TabBarGuidePopLayerManager", "check show page fail");
            return false;
        } else if (!c(a2)) {
            g.a("TabBarGuidePopLayerManager", "check view visible fail");
            return false;
        } else {
            int i = 8;
            try {
                i = Integer.parseInt(a(jSONObject, "guideArrowOffset"));
            } catch (Exception e) {
                g.a("TabBarGuidePopLayerManager", "parseInt arrowOffset error", e);
            }
            float[] a3 = a(a2, i);
            if (a3.length < 2) {
                return false;
            }
            wVCallBackContext.success(a(a(jSONObject, "0", "text"), a2, a(jSONObject, "1", "buttonText"), String.valueOf(a3[0]), String.valueOf(a3[1])));
            d(jSONObject, a2);
            return true;
        }
    }

    private float[] a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a351f5f0", new Object[]{this, str, new Integer(i)});
        }
        int[] c = ((com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.b.a(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY)).c(str);
        lbq b = oiy.a().b();
        if (b == null) {
            return new float[0];
        }
        return b.getHomePageManager() == null ? new float[0] : new float[]{HomePageUtility.a(c[0] - i), HomePageUtility.a(c[1] - sfm.STATUS_HEIGHT_PX)};
    }

    private String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 != null) {
            return jSONObject2.getString(str);
        }
        return null;
    }

    private boolean b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("493da635", new Object[]{this, jSONObject, str})).booleanValue() : Boolean.parseBoolean(a(jSONObject, "enableShowAtRecommend")) ? this.c.h() == this.c.c() : this.c.h() == this.c.a(str) && c(jSONObject, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[LOOP:0: B:21:0x0051->B:26:0x0062, LOOP_START, PHI: r0 
      PHI: (r0v6 int) = (r0v5 int), (r0v7 int) binds: [B:19:0x004e, B:26:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(com.alibaba.fastjson.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.tad.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            java.lang.String r6 = "4a73f914"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1f:
            java.lang.String r0 = "startPos"
            java.lang.String r0 = r5.a(r6, r0)
            java.lang.String r1 = "endPos"
            java.lang.String r6 = r5.a(r6, r1)
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L67
            boolean r1 = android.text.StringUtils.isEmpty(r6)
            if (r1 == 0) goto L39
            goto L67
        L39:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L44
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L42
            goto L4e
        L42:
            r6 = move-exception
            goto L46
        L44:
            r6 = move-exception
            r0 = 0
        L46:
            java.lang.String r1 = "TabBarGuidePopLayerManager"
            java.lang.String r4 = "checkRangeAvailable parseIntError"
            com.taobao.tao.infoflow.multitab.g.a(r1, r4, r6)
            r6 = 0
        L4e:
            if (r6 > r0) goto L51
            return r3
        L51:
            int r1 = r6 + 1
            if (r0 >= r1) goto L65
            com.taobao.tao.infoflow.multitab.i r1 = r5.c
            java.lang.String r1 = r1.n(r0)
            boolean r1 = android.text.StringUtils.equals(r1, r7)
            if (r1 == 0) goto L62
            goto L66
        L62:
            int r0 = r0 + 1
            goto L51
        L65:
            r2 = 0
        L66:
            return r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tad.c(com.alibaba.fastjson.JSONObject, java.lang.String):boolean");
    }

    private boolean c(String str) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.b.a(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null && (a2 = aVar.a(str)) != null) {
            return a2.getGlobalVisibleRect(new Rect());
        }
        return false;
    }

    private void d(JSONObject jSONObject, String str) {
        JSONObject c;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4baa4bef", new Object[]{this, jSONObject, str});
            return;
        }
        int a2 = this.c.a(str);
        if (a2 == -1 || (c = e.c(jSONObject, "0")) == null || (jSONObject2 = c.getJSONObject(h.TRACK_EXPOSURE_PARAM)) == null) {
            return;
        }
        e.a(jSONObject2, a2);
        c.put("isTracked", (Object) false);
        kss.b(c);
    }

    private void a(JSONObject jSONObject) {
        int a2;
        JSONObject c;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.d == null || (a2 = this.c.a(a(jSONObject, e.KEY_TAB_ID))) == -1 || (c = e.c(jSONObject, "1")) == null || (jSONObject2 = c.getJSONObject("clickParam")) == null) {
        } else {
            c.put("isTracked", (Object) false);
            e.a(jSONObject2, a2);
            kss.a(c);
        }
    }

    private String a(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f883384", new Object[]{this, jSONObject, str, str2});
        }
        JSONObject c = e.c(jSONObject, str);
        if (c != null && (jSONObject2 = c.getJSONObject("content")) != null) {
            return jSONObject2.getString(str2);
        }
        return null;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        g.a("TabBarGuidePopLayerManager", "execTriggerPopShow");
        this.i.removeCallbacksAndMessages(null);
        this.d = e.a();
        JSONObject jSONObject = this.d;
        if (jSONObject == null) {
            g.a("TabBarGuidePopLayerManager", "execTriggerPopShow GuidePopData null");
            return;
        }
        try {
            this.g = Integer.parseInt(a(jSONObject, "delayDisplayInterval")) * 1000;
        } catch (Exception e) {
            g.a("TabBarGuidePopLayerManager", "execTriggerPopShow parse time error", e);
        }
        this.i.sendEmptyMessageDelayed(1, this.g + j);
    }

    private void f() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        int h = this.c.h();
        String n = this.c.n(h);
        if (h == this.c.c()) {
            sb = new StringBuilder();
            sb.append(kss.f30292a);
            sb.append("_Recommend");
        } else {
            sb = new StringBuilder();
            sb.append(this.c.b(h));
            sb.append("_");
            sb.append(n);
        }
        String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(e.KEY_TAB_ID, (Object) n);
        jSONObject.put("tabIndex", (Object) Integer.valueOf(h));
        jSONObject.put("enterType", (Object) (StringUtils.isEmpty(this.e) ? "click" : this.e));
        try {
            g.a("TabBarGuidePopLayerManager", "execTriggerPopShow sendUCPEvent:");
            this.f = System.currentTimeMillis();
            UCPManager.a(sb2, shc.SCENE_TAP, "PageHomeTabEnter", jSONObject);
        } catch (Exception e) {
            g.a("TabBarGuidePopLayerManager", "sendUCPEvent error", e);
        }
        this.e = null;
        this.h = false;
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (System.currentTimeMillis() - this.f < 300) {
            g.a("TabBarGuidePopLayerManager", "triggerPopRemove 保护时间内不触发移除");
        } else if (this.h) {
        } else {
            this.i.removeCallbacksAndMessages(null);
            c.a().a("PageTaoHome", str, jSONObject, (JSONObject) null);
            this.h = true;
        }
    }
}
