package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.animation.ValueAnimator;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksDotaskResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryResponseData;
import com.taobao.android.live.plugin.proxy.usertask.g;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.orq;
import tb.phq;
import tb.pmd;
import tb.pnj;
import tb.pqj;
import tb.xkz;

/* loaded from: classes6.dex */
public class a implements g, com.taobao.taolive.sdk.adapter.network.d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static float f14084a;
    private static float b;
    private static int n;
    private static String u;
    private ValueAnimator A;
    private Runnable B;
    private Runnable C;
    private com.taobao.android.live.plugin.atype.flexalocal.usertask.business.b D;
    private com.taobao.android.live.plugin.atype.flexalocal.usertask.business.c E;
    private String F;
    private String G;
    private String H;
    private String I;
    private f J;
    private phq K;
    private boolean L;
    private e M;
    private boolean N;
    private MtopIliadUsertaskTasksDotaskResponseData O;
    private MtopIliadUsertaskTasksEntryResponseData c;
    private boolean d;
    private int e;
    private String f;
    private long g;
    private long h;
    private int i;
    private String j;
    private String k;
    private String l;
    private String m;
    private JSONObject o;
    private boolean p;
    private String q;
    private String r;
    private String s;
    private boolean t;
    private String v;
    private String w;
    private boolean x;
    private boolean y;
    private boolean z;

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9577dbcd", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.e = i;
        return i;
    }

    public static /* synthetic */ f a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("d392f769", new Object[]{aVar}) : aVar.J;
    }

    public static /* synthetic */ void a(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9577d097", new Object[]{aVar, new Float(f)});
        } else {
            aVar.a(f);
        }
    }

    public static /* synthetic */ void a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9577df9b", new Object[]{aVar, new Long(j)});
        } else {
            aVar.a(j);
        }
    }

    public static /* synthetic */ void a(a aVar, MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8343b74", new Object[]{aVar, mtopIliadUsertaskTasksEntryResponseData});
        } else {
            aVar.a(mtopIliadUsertaskTasksEntryResponseData);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95781baf", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.z = z;
        return z;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdc184a", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99b904b", new Object[]{aVar});
        } else {
            aVar.k();
        }
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("175b0850", new Object[]{aVar})).booleanValue() : aVar.d;
    }

    public static /* synthetic */ long e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("651a8041", new Object[]{aVar})).longValue() : aVar.h;
    }

    public static /* synthetic */ int f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2d9f841", new Object[]{aVar})).intValue() : aVar.e;
    }

    public static /* synthetic */ String g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9b34c31", new Object[]{aVar}) : aVar.F;
    }

    public static /* synthetic */ String h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1864b650", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ String i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4716206f", new Object[]{aVar}) : aVar.m;
    }

    public static /* synthetic */ String j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75c78a8e", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ float k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37975043", new Object[]{aVar})).floatValue() : aVar.e();
    }

    public static /* synthetic */ void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8556c854", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ Runnable m(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("1e0931f", new Object[]{aVar}) : aVar.B;
    }

    public static /* synthetic */ void n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d5b856", new Object[]{aVar});
        } else {
            aVar.j();
        }
    }

    public static /* synthetic */ e o(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("5eb5867c", new Object[]{aVar}) : aVar.M;
    }

    public static /* synthetic */ String p(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8df00748", new Object[]{aVar}) : aVar.k;
    }

    public static /* synthetic */ MtopIliadUsertaskTasksDotaskResponseData q(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksDotaskResponseData) ipChange.ipc$dispatch("2b570f78", new Object[]{aVar}) : aVar.O;
    }

    public static /* synthetic */ Runnable r(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("69dd6afa", new Object[]{aVar}) : aVar.C;
    }

    public static /* synthetic */ int s(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a593104e", new Object[]{aVar})).intValue() : aVar.i;
    }

    public static /* synthetic */ MtopIliadUsertaskTasksEntryResponseData t(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksEntryResponseData) ipChange.ipc$dispatch("ca80b3e9", new Object[]{aVar}) : aVar.c;
    }

    static {
        kge.a(89636927);
        kge.a(236244065);
        kge.a(-797454141);
        kge.a(191318335);
        q.a("TBLiveBaseCommonPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) TBLiveBaseCommonPlugin.class);
    }

    public a(String str, String str2) {
        this(str, str2, null);
    }

    public a(String str, String str2, phq phqVar) {
        this.d = false;
        this.e = 0;
        this.h = orq.FRAME_CHECK_TIMEOUT;
        this.i = 5000;
        this.j = "";
        this.k = "";
        this.p = false;
        this.t = false;
        this.w = "liveroom";
        this.y = false;
        this.B = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) == null) {
                } else {
                    if (pmd.a().m() != null) {
                        pmd.a().m().c("UserTaskController", "mShowScoreRunnable");
                    }
                    a.a(a.this, 0.0f);
                    a.b(a.this);
                    a.c(a.this);
                }
            }
        };
        this.C = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                f a2;
                String h;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!a.d(a.this) || a.a(a.this) == null || a.e(a.this) <= 0) {
                } else {
                    if (a.f(a.this) == 3) {
                        if (pmd.a().m() != null) {
                            pmd.a().m().c("UserTaskController", "mShowProgressRunnable 3");
                        }
                        a.a(a.this, 0.0f);
                        a.a(a.this).setEntryText(a.g(a.this));
                        a.a(a.this).setEntryImage(a.h(a.this), "", false);
                    } else if (a.f(a.this) == 9) {
                        a.a(a.this, 0.0f);
                        a.a(a.this).setEntryText(a.i(a.this));
                        a.a(a.this).setEntryImage(a.j(a.this), "", false);
                    } else {
                        if (pmd.a().m() != null) {
                            pmd.a().m().c("UserTaskController", "mShowProgressRunnable");
                        }
                        a.a(a.this).hideEntryInnerText();
                        if (a.f(a.this) == 10) {
                            a.a(a.this).setEntryText(a.i(a.this));
                            a2 = a.a(a.this);
                            h = a.j(a.this);
                        } else {
                            a.a(a.this).setEntryText(a.g(a.this));
                            a2 = a.a(a.this);
                            h = a.h(a.this);
                        }
                        a2.setEntryImage(h, "", true);
                        long e = (((float) a.e(a.this)) * (360.0f - (a.k(a.this) % 360.0f))) / 360.0f;
                        a.a(a.this, e);
                        a.l(a.this);
                        a.a(a.this).getView().postDelayed(a.m(a.this), e);
                    }
                }
            }
        };
        this.L = true;
        this.N = true;
        this.K = phqVar;
        xkz.f34362a = 0;
        xkz.b = 0;
        this.w = str;
        this.v = str2;
        ddw.a().a(this);
    }

    private float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData != null && "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
            String str = u;
            if ((str != null && str.equals(this.c.bizId)) || u == null) {
                return b;
            }
            b = 0.0f;
            return 0.0f;
        }
        return f14084a;
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData != null && "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
            b = f;
            n = ((int) ((((float) this.h) * (f % 360.0f)) / 360.0f)) / 1000;
            return;
        }
        f14084a = f;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            a(str, str2, null, null, str3, false);
        }
    }

    public boolean a(String str, String str2) {
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        this.I = this.H;
        this.H = str;
        this.G = str2;
        if (this.L) {
            return true;
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData2 != null && mtopIliadUsertaskTasksEntryResponseData2.bizData != null && this.c.bizData.userJoin) {
            return true;
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData3 = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData3 != null && mtopIliadUsertaskTasksEntryResponseData3.bizData != null && this.c.bizData.anchorIdList != null && this.c.bizData.anchorIdList.contains(str)) {
            return true;
        }
        return (this.I == null || (mtopIliadUsertaskTasksEntryResponseData = this.c) == null || mtopIliadUsertaskTasksEntryResponseData.bizData == null || this.c.bizData.anchorIdList == null || !this.c.bizData.anchorIdList.contains(this.I)) ? false : true;
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8223ba", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        boolean z2 = !this.z || !StringUtils.equals(this.r, str2) || z;
        if (pmd.a().m() != null) {
            pnj m = pmd.a().m();
            m.c("UserTaskController", "isNeedEntryRequest:" + z2);
        }
        if (!z2) {
            return;
        }
        this.L = false;
        this.q = str;
        this.r = str2;
        this.s = str5;
        if (o.b()) {
            this.z = false;
            this.E = new com.taobao.android.live.plugin.atype.flexalocal.usertask.business.c(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (netBaseOutDo != null && (netBaseOutDo.mo1437getData() instanceof MtopIliadUsertaskTasksEntryResponseData)) {
                        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = (MtopIliadUsertaskTasksEntryResponseData) netBaseOutDo.mo1437getData();
                        if (mtopIliadUsertaskTasksEntryResponseData.showEntry) {
                            a.a(a.this, true);
                        }
                        a.a(a.this, mtopIliadUsertaskTasksEntryResponseData);
                        a.n(a.this);
                        if (a.o(a.this) != null) {
                            a.o(a.this).a(a.d(a.this));
                        }
                        if (pmd.a().m() == null) {
                            return;
                        }
                        pmd.a().m().c("UserTaskController", "EntryRequest success");
                    } else {
                        onError(i, netResponse, obj);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    if (pmd.a().m() != null) {
                        pmd.a().m().c("UserTaskController", "EntryRequest error");
                    }
                    a.a(a.this, (MtopIliadUsertaskTasksEntryResponseData) null);
                    if (a.o(a.this) == null) {
                        return;
                    }
                    a.o(a.this).a(a.d(a.this));
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }
            });
            this.E.a(str, str2, str5, str3, str4);
            return;
        }
        this.z = true;
        a((MtopIliadUsertaskTasksEntryResponseData) null);
        e eVar = this.M;
        if (eVar == null) {
            return;
        }
        eVar.a(this.d);
    }

    public void a(f fVar) {
        f fVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1ee624", new Object[]{this, fVar});
            return;
        }
        this.J = fVar;
        if (this.J == null) {
            return;
        }
        if (pmd.a().m() != null) {
            pmd.a().m().c("UserTaskController", "bindBottomUserTaskBtn");
        }
        g();
        this.J.getView().post(this.C);
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData != null && this.J != null && mtopIliadUsertaskTasksEntryResponseData.newAtmosphere != null) {
            this.J.setAtmosphere(this.c.newAtmosphere);
            if (!RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(this.c.newAtmosphere.getString("durationType"))) {
                this.c.newAtmosphere = null;
            }
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData2 != null && (fVar2 = this.J) != null) {
            fVar2.changeGoldUI(mtopIliadUsertaskTasksEntryResponseData2);
            this.J.setEntryImage(this.j, "", true);
            this.J.setEntryText(this.F);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(com.taobao.android.purchase.core.address.c.K_DELIVERY_ID, this.g + "");
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData3 = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData3 != null && mtopIliadUsertaskTasksEntryResponseData3.utParams != null) {
            hashMap.putAll(this.c.utParams);
        }
        if (pmd.a().f() == null) {
            return;
        }
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData4 = this.c;
        pmd.a().f().a((mtopIliadUsertaskTasksEntryResponseData4 == null || !"shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData4.bizType)) ? "NewTask_liveEntrance_exporsure" : "Show-rightAssembly_entrance", hashMap);
    }

    public void a(String str, String str2, phq phqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a146bd3", new Object[]{this, str, str2, phqVar});
        } else if (this.J == null) {
        } else {
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.c;
            if (mtopIliadUsertaskTasksEntryResponseData != null && "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData.bizType)) {
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.android.purchase.core.address.c.K_DELIVERY_ID, this.g + "");
                if (this.c.utParams != null) {
                    hashMap.putAll(this.c.utParams);
                }
                if (pmd.a().f() != null) {
                    pmd.a().f().a("rightAssembly_entrance", (Map<String, String>) hashMap);
                }
            }
            if (this.e == 9) {
                f();
                return;
            }
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.c;
            if (mtopIliadUsertaskTasksEntryResponseData2 != null && !StringUtils.isEmpty(mtopIliadUsertaskTasksEntryResponseData2.jumpType)) {
                if (DMComponent.RESET.equals(this.c.jumpType)) {
                    this.J.reset(this.c.entryConfig.text);
                    this.c.jumpType = "openUrl";
                } else if ("openUrl".equals(this.c.jumpType)) {
                    b(this.c.jumpData, str, str2);
                } else if ("openAliveComponent".equals(this.c.jumpType)) {
                    if (!StringUtils.isEmpty(this.c.jumpData)) {
                        JSONObject b2 = pqj.b(this.c.jumpData);
                        String string = b2.getString("aliveComponentMsgEvent");
                        JSONObject jSONObject = b2.getJSONObject("aliveComponentMsg");
                        if (jSONObject != null && jSONObject.getJSONObject("data") != null) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            long j = this.h;
                            jSONObject2.put("nativeTime", (Object) Integer.valueOf(j == 0 ? n : ((int) ((((float) j) * (e() % 360.0f)) / 360.0f)) / 1000));
                            jSONObject.put("data", (Object) jSONObject2);
                        }
                        phqVar.p().a(string, jSONObject);
                    }
                } else {
                    "openH5Layer".equals(this.c.jumpType);
                }
            } else {
                b(this.f, str, str2);
            }
            MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData3 = this.c;
            if (mtopIliadUsertaskTasksEntryResponseData3 == null || "shopTrain".equals(mtopIliadUsertaskTasksEntryResponseData3.bizType)) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put(com.taobao.android.purchase.core.address.c.K_DELIVERY_ID, this.g + "");
            if (this.c.utParams != null) {
                hashMap2.putAll(this.c.utParams);
            }
            if (pmd.a().f() == null) {
                return;
            }
            pmd.a().f().a("NewTask_liveEntrance_Click", (Map<String, String>) hashMap2);
        }
    }

    private void b(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (str.contains("?")) {
                str4 = str + "&creatorId=" + str2 + "&liveId=" + str3 + "&taskSource=liveroom&spm=" + this.v;
            } else {
                str4 = str + "?creatorId=" + str2 + "&liveId=" + str3 + "&taskSource=liveroom&spm=" + this.v;
            }
            s.a(this.J.getView().getContext(), str4);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            new com.taobao.android.live.plugin.atype.flexalocal.usertask.business.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this, 4);
                        a.a(a.this, 0.0f);
                        a.a(a.this).setEntryImage("", a.p(a.this), false);
                        a.a(a.this).setEntryText(a.g(a.this));
                        if (a.a(a.this).isNew()) {
                            a.a(a.this).changeGoldUI(a.q(a.this));
                        }
                        a.l(a.this);
                        a.a(a.this).getView().postDelayed(a.r(a.this), a.s(a.this));
                    }
                }
            }).a(this.g, this.q, this.r);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (pmd.a().m() != null) {
            pmd.a().m().c("UserTaskController", "unBindBottomUserTaskBtn");
        }
        i();
        g();
        f fVar = this.J;
        if (fVar != null && (fVar.getView().getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.J.getView().getParent()).removeView(this.J.getView());
        }
        this.J = null;
        this.o = null;
        this.M = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.x = true;
        if (this.y) {
            a(this.q, this.r, this.s);
            this.y = false;
        }
        if (this.d && this.J != null) {
            if (pmd.a().m() != null) {
                pmd.a().m().c("UserTaskController", "onResume");
            }
            g();
            this.J.getView().post(this.C);
        }
        f fVar = this.J;
        if (fVar == null) {
            return;
        }
        fVar.onResume();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.x = false;
        if (pmd.a().m() != null) {
            pmd.a().m().c("UserTaskController", "onPause");
        }
        i();
        g();
        f fVar = this.J;
        if (fVar == null) {
            return;
        }
        fVar.onPause();
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.g
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (pmd.a().m() != null) {
            pmd.a().m().c("UserTaskController", MessageID.onDestroy);
        }
        ddw.a().b(this);
        i();
        g();
        com.taobao.android.live.plugin.atype.flexalocal.usertask.business.b bVar = this.D;
        if (bVar != null) {
            bVar.a();
            this.D = null;
        }
        com.taobao.android.live.plugin.atype.flexalocal.usertask.business.c cVar = this.E;
        if (cVar != null) {
            cVar.a();
            this.E = null;
        }
        this.q = null;
        this.r = null;
        this.s = null;
        this.J = null;
        this.M = null;
        this.z = false;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        f fVar = this.J;
        if (fVar == null) {
            return;
        }
        fVar.getView().removeCallbacks(this.C);
        this.J.getView().removeCallbacks(this.B);
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A = new ValueAnimator();
        this.A.setFloatValues(e(), 360.0f);
        this.A.setDuration(j);
        this.A.setInterpolator(new LinearInterpolator());
        this.A.setRepeatCount(0);
        this.A.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                a.a(a.this, ((Float) valueAnimator2.getAnimatedValue()).floatValue() % 360.0f);
                if (a.a(a.this) == null || a.t(a.this) == null || a.t(a.this).hideProcessBar) {
                    return;
                }
                a.a(a.this).setProgress(a.k(a.this));
            }
        });
        this.A.start();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.end();
        this.A = null;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.A = null;
    }

    private void j() {
        phq phqVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        pnj m = pmd.a().m();
        StringBuilder sb = new StringBuilder();
        sb.append("sendTaskWelfarePopLayer ");
        sb.append(this.p);
        sb.append(" ");
        if (this.o != null) {
            z = true;
        }
        sb.append(z);
        m.a("UserTaskController", sb.toString());
        if (!this.p || this.o == null || (phqVar = this.K) == null) {
            return;
        }
        phqVar.p().a("TBLiveWVPlugin.Event.showTaskWelfare", this.o.toJSONString());
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 1305784707) {
            if (hashCode == 2050546469 && str.equals("com.taobao.live.usertask.permissionSuccess")) {
                c = 1;
            }
        } else if (str.equals("com.taobao.taolive.room.interactive_component_render_complete")) {
            c = 0;
        }
        if (c == 0) {
            if (!(obj instanceof InteractiveComponent) || !StringUtils.equals(((InteractiveComponent) obj).fedName, o.d()) || this.J == null) {
                return;
            }
            this.p = true;
            j();
        } else if (c != 1 || !(obj instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("bizType");
            String string2 = jSONObject.getString("action");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (this.w == null || jSONObject2 == null) {
                return;
            }
            if (this.x) {
                a(this.q, this.r, this.s);
            } else {
                this.y = true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("bizType", string);
            hashMap.put("action", string2);
            if (pmd.a().f() == null) {
                return;
            }
            pmd.a().f().a("recived_common_function_bridge", (Map<String, String>) hashMap);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.interactive_component_render_complete", "com.taobao.live.usertask.permissionSuccess"};
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7078768f", new Object[]{this, str, eVar});
            return;
        }
        if (pmd.a().m() != null) {
            pmd.a().m().c("UserTaskController", "checkUserTask");
        }
        this.q = str;
        if (this.z) {
            eVar.a(this.d);
        } else {
            this.M = eVar;
        }
    }

    private void a(MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae929f5", new Object[]{this, mtopIliadUsertaskTasksEntryResponseData});
            return;
        }
        if (pmd.a().m() != null) {
            pmd.a().m().c("UserTaskController", "setUsertaskTasksEntryData");
        }
        this.c = mtopIliadUsertaskTasksEntryResponseData;
        MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.c;
        if (mtopIliadUsertaskTasksEntryResponseData2 != null) {
            this.h = mtopIliadUsertaskTasksEntryResponseData2.countdownTime * 1000;
            this.d = this.c.showEntry;
            this.o = this.c.taskWelfarePopLayer;
            this.g = this.c.deliveryId;
            this.f = this.c.entryUrl;
            if (this.c.process != null) {
                this.e = this.c.process.status;
            }
            if (this.c.entryConfig == null) {
                return;
            }
            this.i = (this.c.entryConfig.animationDuration * 1000) - 200;
            if (this.i < 0) {
                this.i = 0;
            }
            this.j = this.c.entryConfig.normalIcon;
            this.k = this.c.entryConfig.successIcon;
            this.l = this.c.entryConfig.pauseIcon;
            this.m = this.c.entryConfig.pauseText;
            this.F = this.c.entryConfig.text;
            return;
        }
        this.d = false;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (pmd.a().m() != null) {
            pmd.a().m().c("UserTaskController", "doSendTimeUserTask");
        }
        if (this.D == null) {
            this.D = new com.taobao.android.live.plugin.atype.flexalocal.usertask.business.b(this);
        }
        if (this.t) {
            return;
        }
        this.t = true;
        JSONObject jSONObject = new JSONObject();
        String str = this.s;
        if (str != null) {
            jSONObject = pqj.b(str);
        }
        jSONObject.put("bizType", (Object) this.c.bizType);
        jSONObject.put("bizId", (Object) this.c.bizId);
        jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) this.G);
        jSONObject.put("anchorId", (Object) this.H);
        jSONObject.put("action", (Object) "stay");
        jSONObject.put("actionValue", (Object) Integer.valueOf(this.c.countdownTime));
        this.D.a(this.g, this.q, this.r, pqj.a(jSONObject));
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        this.t = false;
        this.N = true;
        if (netBaseOutDo != null && (netBaseOutDo.mo1437getData() instanceof MtopIliadUsertaskTasksDotaskResponseData)) {
            MtopIliadUsertaskTasksDotaskResponseData mtopIliadUsertaskTasksDotaskResponseData = (MtopIliadUsertaskTasksDotaskResponseData) netBaseOutDo.mo1437getData();
            this.O = mtopIliadUsertaskTasksDotaskResponseData;
            if (mtopIliadUsertaskTasksDotaskResponseData != null) {
                if (mtopIliadUsertaskTasksDotaskResponseData.countdownTime > 0) {
                    this.c.countdownTime = mtopIliadUsertaskTasksDotaskResponseData.countdownTime;
                    this.h = mtopIliadUsertaskTasksDotaskResponseData.countdownTime * 1000;
                }
                this.g = mtopIliadUsertaskTasksDotaskResponseData.deliveryId;
                if (mtopIliadUsertaskTasksDotaskResponseData.deltaPoint != null && !StringUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.deltaPoint.getString("text"))) {
                    this.F = mtopIliadUsertaskTasksDotaskResponseData.deltaPoint.getString("text");
                }
                if (mtopIliadUsertaskTasksDotaskResponseData.newAtmosphere != null && (fVar = this.J) != null) {
                    fVar.setAtmosphere(mtopIliadUsertaskTasksDotaskResponseData.newAtmosphere);
                    MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData = this.c;
                    if (mtopIliadUsertaskTasksEntryResponseData != null && mtopIliadUsertaskTasksEntryResponseData.newAtmosphere != null) {
                        this.c.newAtmosphere = mtopIliadUsertaskTasksDotaskResponseData.newAtmosphere;
                        if (this.c.newAtmosphere != null) {
                            this.c.newAtmosphere.remove("notice");
                        }
                    }
                }
                MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData2 = this.c;
                if (mtopIliadUsertaskTasksEntryResponseData2 != null) {
                    mtopIliadUsertaskTasksEntryResponseData2.utParams = mtopIliadUsertaskTasksDotaskResponseData.utParams;
                    this.c.jumpType = mtopIliadUsertaskTasksDotaskResponseData.jumpType;
                    this.c.jumpData = mtopIliadUsertaskTasksDotaskResponseData.jumpData;
                    this.c.rewards = mtopIliadUsertaskTasksDotaskResponseData.rewards;
                    if (mtopIliadUsertaskTasksDotaskResponseData.entryConfig != null && !StringUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.entryConfig.text)) {
                        MtopIliadUsertaskTasksEntryResponseData.EntryConfig entryConfig = this.c.entryConfig;
                        String str = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.text;
                        entryConfig.text = str;
                        this.F = str;
                    }
                }
                f fVar2 = this.J;
                if (fVar2 != null && !fVar2.isNew()) {
                    this.J.changeGoldUI(mtopIliadUsertaskTasksDotaskResponseData);
                }
                if (mtopIliadUsertaskTasksDotaskResponseData.entryConfig != null) {
                    if (!StringUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.entryConfig.normalIcon)) {
                        this.j = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.normalIcon;
                    }
                    if (!StringUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.entryConfig.successIcon)) {
                        this.k = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.successIcon;
                    }
                    if (mtopIliadUsertaskTasksDotaskResponseData.entryConfig.animationDuration > 0) {
                        this.i = (mtopIliadUsertaskTasksDotaskResponseData.entryConfig.animationDuration * 1000) - 200;
                        if (this.i < 0) {
                            this.i = 0;
                        }
                    }
                    if (!StringUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.entryConfig.pauseIcon)) {
                        this.l = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.pauseIcon;
                    }
                    if (!StringUtils.isEmpty(mtopIliadUsertaskTasksDotaskResponseData.entryConfig.pauseText)) {
                        this.m = mtopIliadUsertaskTasksDotaskResponseData.entryConfig.pauseText;
                    }
                }
                if (mtopIliadUsertaskTasksDotaskResponseData.process != null) {
                    this.e = mtopIliadUsertaskTasksDotaskResponseData.process.status;
                    if (this.e != 3) {
                        a(0.0f);
                        f fVar3 = this.J;
                        if (fVar3 == null) {
                            return;
                        }
                        if (this.e == 9) {
                            g();
                            this.J.setEntryText(this.m);
                            this.J.setEntryImage(this.l, "", false);
                            return;
                        }
                        if (fVar3.isNew()) {
                            this.J.changeGoldUI(mtopIliadUsertaskTasksDotaskResponseData);
                        }
                        if (this.e == 10) {
                            this.J.setEntryText(this.m);
                            this.J.setEntryImage(this.l, "", false);
                        } else {
                            this.J.setEntryImage("", this.k, false);
                            this.J.setEntryText(this.F);
                        }
                        g();
                        this.J.getView().postDelayed(this.C, this.i);
                        return;
                    }
                    a(0.0f);
                }
            }
        }
        f fVar4 = this.J;
        if (fVar4 == null) {
            return;
        }
        fVar4.setEntryText(this.F);
        this.J.setEntryImage(this.j, "", false);
        i();
        g();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.t = false;
        if (this.N) {
            this.N = false;
            k();
            return;
        }
        f fVar = this.J;
        if (fVar == null) {
            return;
        }
        fVar.setEntryText(this.F);
        this.J.setEntryImage(this.j, "", false);
        i();
        g();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }
}
