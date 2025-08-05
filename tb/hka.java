package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.business.BusinessInfo;
import com.alilive.adapter.business.FissionTcpParam;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.CalendarConfig;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewClickRequest;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewClickResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewStatusResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.a;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import tb.hjz;
import tb.qmv;

/* loaded from: classes6.dex */
public class hka implements IRecommendPopProxy.a, d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f28714a;
    private String H;
    private qmp M;
    private qmn N;
    private a b;
    private Context c;
    private ViewGroup d;
    public String f;
    public String g;
    private String h;
    private String i;
    private IRecommendPopProxy.b j;
    public com.taobao.alilive.aliliveframework.frame.a k;
    public TBLiveDataModel l;
    public String m;
    public String n;
    public String o;
    private nlf p;
    private CalendarConfig q;
    private ItemInfo r;
    public String v;
    public BaseFrame w;
    private String x;
    public String s = "";
    public String t = "";
    public JSONObject u = new JSONObject();
    private boolean C = false;
    private int I = 10;
    private int J = 200;
    private int K = 0;
    private String y = null;
    private Runnable L = new Runnable() { // from class: tb.hka.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hka.a(hka.this) >= hka.b(hka.this)) {
                hka.this.i();
                hka hkaVar = hka.this;
                hka.a(hkaVar, "query_timeout", hka.g(hkaVar));
            } else if (hka.c(hka.this) == null || hka.d(hka.this) == null) {
            } else {
                hka.c(hka.this).a(hka.d(hka.this).e, hka.e(hka.this), hka.f(hka.this));
            }
        }
    };
    private String e = String.valueOf(hashCode());

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TBLiveRecommendPopViewManager";
    }

    public static /* synthetic */ int a(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec1dda4d", new Object[]{hkaVar})).intValue() : hkaVar.K;
    }

    public static /* synthetic */ void a(hka hkaVar, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982690f8", new Object[]{hkaVar, itemInfo});
        } else {
            hkaVar.a(itemInfo);
        }
    }

    public static /* synthetic */ void a(hka hkaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c6e1a4", new Object[]{hkaVar, str});
        } else {
            hkaVar.a(str);
        }
    }

    public static /* synthetic */ void a(hka hkaVar, String str, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e7f26e", new Object[]{hkaVar, str, itemInfo});
        } else {
            hkaVar.c(str, itemInfo);
        }
    }

    public static /* synthetic */ void a(hka hkaVar, String str, ItemInfo itemInfo, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf3a70", new Object[]{hkaVar, str, itemInfo, new Boolean(z), str2});
        } else {
            hkaVar.a(str, itemInfo, z, str2);
        }
    }

    public static /* synthetic */ boolean a(hka hkaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("979e23be", new Object[]{hkaVar, new Boolean(z)})).booleanValue();
        }
        hkaVar.C = z;
        return z;
    }

    public static /* synthetic */ int b(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("daa0e0ce", new Object[]{hkaVar})).intValue() : hkaVar.I;
    }

    public static /* synthetic */ a c(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("17f33bad", new Object[]{hkaVar}) : hkaVar.b;
    }

    public static /* synthetic */ nlf d(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nlf) ipChange.ipc$dispatch("391428a1", new Object[]{hkaVar}) : hkaVar.p;
    }

    public static /* synthetic */ String e(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3478802", new Object[]{hkaVar}) : hkaVar.H;
    }

    public static /* synthetic */ int f(hka hkaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94acfad2", new Object[]{hkaVar})).intValue();
        }
        int i = hkaVar.K + 1;
        hkaVar.K = i;
        return i;
    }

    public static /* synthetic */ ItemInfo g(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemInfo) ipChange.ipc$dispatch("41e788e2", new Object[]{hkaVar}) : hkaVar.r;
    }

    public static /* synthetic */ ViewGroup h(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("bfa8c514", new Object[]{hkaVar}) : hkaVar.d;
    }

    public static /* synthetic */ Context i(hka hkaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bcf5e75a", new Object[]{hkaVar}) : hkaVar.c;
    }

    static {
        kge.a(1830147435);
        kge.a(-797454141);
        kge.a(-161060553);
        kge.a(191318335);
        f28714a = hka.class.getSimpleName();
    }

    public com.taobao.alilive.aliliveframework.frame.a o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("36bc632b", new Object[]{this}) : this.k;
    }

    public CalendarConfig f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CalendarConfig) ipChange.ipc$dispatch("fc148e10", new Object[]{this}) : this.q;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.e;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.l;
        return (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) ? "" : this.l.mVideoInfo.liveId;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.l;
        return (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) ? "" : this.l.mVideoInfo.dispatchItemID;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.l;
        if (tBLiveDataModel == null) {
            return "";
        }
        if (tBLiveDataModel.mVideoInfo != null && this.l.mVideoInfo.broadCaster != null) {
            return this.l.mVideoInfo.broadCaster.accountId;
        }
        return (this.l.mFandomInfo == null || this.l.mFandomInfo.broadCaster == null) ? "" : this.l.mFandomInfo.broadCaster.accountId;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.l;
        return (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) ? "" : this.l.mVideoInfo.recExtParams;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.y = str;
        IRecommendPopProxy.b bVar = this.j;
        if (bVar != null) {
            bVar.a(j());
        }
        nlf nlfVar = this.p;
        if (nlfVar != null) {
            nlfVar.b();
            this.p = null;
        }
        a(this, "1", "10", "{}");
    }

    private void a(d dVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f2e5db", new Object[]{this, dVar, str, str2, str3});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
        this.b = new a(dVar);
        this.b.a(b(), d(), this.n, this.o, this.f, this.g, this.s, this.t, this.u.toJSONString(), this.m, e(), str, str2, str3);
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            a(z, z2, false);
        }
    }

    public void a(boolean z, final boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (!z3) {
            a(false);
        }
        a(z, new Runnable() { // from class: tb.hka.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (hka.h(hka.this) != null) {
                    hka.h(hka.this).removeAllViews();
                }
                if (hka.d(hka.this) != null) {
                    hka.d(hka.this).a(0);
                }
                if (z2) {
                    hka hkaVar = hka.this;
                    hka.a(hkaVar, "", hka.g(hkaVar), false, "close");
                }
                hka hkaVar2 = hka.this;
                hka.a(hkaVar2, hka.g(hkaVar2));
            }
        });
    }

    private void a(boolean z, final Runnable runnable) {
        nlf nlfVar;
        final View c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f0cfea", new Object[]{this, new Boolean(z), runnable});
        } else if (z && (nlfVar = this.p) != null && nlfVar.d() && (c = this.p.c()) != null) {
            c.animate().scaleX(0.0f).scaleY(0.0f).translationX(c.getMeasuredWidth() / 2.0f).translationY((c.getMeasuredHeight() / 2.0f) - this.p.h()).withEndAction(new Runnable() { // from class: tb.hka.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.post(runnable);
                    }
                }
            }).setDuration(300L).start();
        } else {
            runnable.run();
        }
    }

    private void a(ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3655a32a", new Object[]{this, itemInfo});
        } else if (this.r == null || itemInfo.item == null) {
        } else {
            String string = itemInfo.item.getString("id");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) string);
            ddu e = this.k.e();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.k;
            e.a("com.taobao.taolive.goods.preset.topitem", jSONObject, aVar == null ? null : aVar.G());
        }
    }

    private void b(ItemInfo itemInfo) {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786cd089", new Object[]{this, itemInfo});
        } else if (this.r == null) {
        } else {
            HashMap hashMap = new HashMap();
            String str2 = null;
            if (itemInfo.card == null || (jSONObject = itemInfo.card.getJSONObject("actionData")) == null) {
                str = null;
            } else {
                hashMap.put("bizTopItemId", jSONObject.getString("itemId"));
                hashMap.put(aw.PARAM_CATEGORY_ID, jSONObject.getString("pocketAnchorTab"));
                str = jSONObject.getString("glopenfrom");
            }
            if (TextUtils.isEmpty(str)) {
                str = "newUserBottomCard";
            }
            hashMap.put("glopenfrom", str);
            ddu e = this.k.e();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.k;
            if (aVar != null) {
                str2 = aVar.G();
            }
            e.a(xkw.EVENT_SHOW_GOODSPACKAGE, hashMap, str2);
            nlf nlfVar = this.p;
            if (nlfVar == null || !nlfVar.g()) {
                return;
            }
            a(false, false);
        }
    }

    public hka(Context context, ViewGroup viewGroup, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, BaseFrame baseFrame, IRecommendPopProxy.b bVar) {
        this.c = context;
        this.j = bVar;
        this.k = aVar;
        this.l = tBLiveDataModel;
        this.w = baseFrame;
        this.d = (ViewGroup) k.a(this.c, R.id.taolive_open_popview_frame);
        if (this.d == null) {
            this.d = viewGroup;
        }
        ViewGroup viewGroup2 = this.d;
        if (viewGroup2 != null) {
            viewGroup2.setPadding((y.b(this.c) || y.i(this.c)) ? com.taobao.taolive.room.utils.d.e() - y.f(this.c) : 0, 0, 0, 0);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.a
    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        this.f = str4;
        this.g = str5;
        this.v = str6;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.x = str7;
        TBLiveDataModel tBLiveDataModel = this.l;
        if (tBLiveDataModel != null && tBLiveDataModel.mInitParams != null && !TextUtils.isEmpty(this.l.mInitParams.get(aw.PARAM_INTENT_URL))) {
            this.x = this.l.mInitParams.get(aw.PARAM_INTENT_URL);
        }
        if (TextUtils.isEmpty(this.x)) {
            return;
        }
        Uri parse = Uri.parse(this.x);
        if (parse != null) {
            this.s = a(parse, c());
            this.t = parse.getQueryParameter("shareType");
            this.h = parse.getQueryParameter("outerAdUserParam");
            this.i = parse.getQueryParameter(MergeUtil.KEY_RID);
            this.u = a(parse);
            this.u.put("versionCode", (Object) "20240626");
        }
        this.k.e().a(this);
        g b = n.b(this.k);
        if (b != null && b.F != null && b.F.f()) {
            b.F.a(false, "dx", new ISmartLandingProxy.d() { // from class: tb.hka.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
                public boolean a(String str8, JSONObject jSONObject, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5ca495b6", new Object[]{this, str8, jSONObject, jSONObject2})).booleanValue();
                    }
                    String str9 = hka.f28714a;
                    q.b(str9, "initRecommendPopview onTaskActionListener popId " + str8 + " actionData " + jSONObject + " " + jSONObject2);
                    hka.a(hka.this, str8);
                    return true;
                }
            });
        } else {
            a((String) null);
        }
    }

    public static String a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7e1cdd7", new Object[]{uri, str});
        }
        String queryParameter = uri.getQueryParameter("itemIds");
        return !TextUtils.isEmpty(str) ? str : TextUtils.isEmpty(queryParameter) ? uri.getQueryParameter(aw.PARAM_SHAQRE_ITEM_ID) : queryParameter;
    }

    public static JSONObject a(Uri uri) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5579f4ff", new Object[]{uri});
        }
        JSONObject jSONObject = new JSONObject();
        String queryParameter = uri.getQueryParameter("huanduanParams");
        if (!TextUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null) {
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(str, (Object) uri.getQueryParameter(str));
                }
            }
        }
        return jSONObject;
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a(false, false, true);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.removeCallbacks(this.L);
        }
        nlf nlfVar = this.p;
        if (nlfVar != null) {
            nlfVar.b();
            this.p = null;
        }
        this.w = null;
        this.j = null;
        this.k.e().b(this);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup == null || this.b == null) {
            return;
        }
        viewGroup.removeCallbacks(this.L);
        this.d.postDelayed(this.L, this.J);
    }

    private void a(String str, ItemInfo itemInfo, boolean z, String str2) {
        nlf nlfVar;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db15ff7e", new Object[]{this, str, itemInfo, new Boolean(z), str2});
            return;
        }
        nlf nlfVar2 = this.p;
        if (nlfVar2 != null && !nlfVar2.f() && (!this.p.e() || !z)) {
            return;
        }
        BusinessInfo businessInfo = new BusinessInfo();
        if (!z || ((nlfVar = this.p) != null && !nlfVar.e())) {
            z2 = false;
        }
        businessInfo.mIsJumpGoodsDetail = z2;
        businessInfo.mJumpUrl = str;
        businessInfo.clickType = str2;
        businessInfo.actionSource = str2;
        nlf nlfVar3 = this.p;
        if (nlfVar3 == null || nlfVar3.i()) {
            businessInfo.channel = "outsideItem";
        }
        if (itemInfo != null) {
            businessInfo.tcp = (FissionTcpParam) pqj.a(itemInfo.tcp, FissionTcpParam.class);
        }
        if (businessInfo.tcp == null) {
            businessInfo.tcp = new FissionTcpParam();
            businessInfo.tcp.context = new HashMap();
            if ("close".equals(str2)) {
                businessInfo.tcp.adUserId = "-1";
                businessInfo.tcp.contentId = b();
            }
        } else if (businessInfo.tcp.context == null) {
            businessInfo.tcp.context = new HashMap();
        }
        if (businessInfo.tcp != null && businessInfo.tcp.context != null) {
            if ("close".equals(str2)) {
                businessInfo.tcp.scenceId = "";
                businessInfo.tcp.tcpBid = "";
            } else {
                a(businessInfo);
            }
            a(businessInfo, this.x);
            businessInfo.tcp.context.put("outerAdUserParam", this.h);
            if (!TextUtils.isEmpty(this.i)) {
                businessInfo.tcp.context.put(MergeUtil.KEY_RID, this.i);
            }
            businessInfo.tcp.context.put("livesource", this.f);
            businessInfo.tcp.context.put("entrylivesource", this.g);
            businessInfo.tcp.context.put("bizTraceId", pmd.a().q().a() + "_" + businessInfo.tcp.adUserId + "_" + businessInfo.tcp.contentId + "_" + businessInfo.tcp.itemId + "_" + System.currentTimeMillis());
            businessInfo.tcp.context.put("switchIndex", this.m);
            businessInfo.tcp.context.put("spm-url", this.n);
            businessInfo.tcp.context.put("entryspm", this.o);
            if (n()) {
                businessInfo.tcp.context.put("spm-cnt", this.v);
                businessInfo.tcp.context.put("entryspmpre", poy.P(this.k));
                businessInfo.tcp.context.put("entrylivesourcepre", poy.Q(this.k));
            }
        }
        com.alilive.adapter.business.a.a((Activity) this.c, businessInfo);
        if (this.M == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("liveToken=" + this.k.j());
        arrayList.add("actionSource=" + str2);
        arrayList.add("entryLiveSource=" + this.g);
        arrayList.add("liveSource=" + this.f);
        arrayList.add("context=" + pqj.a(businessInfo.tcp.context));
        arrayList.add("spm-cnt=" + this.v);
        arrayList.add("spm-url=" + this.n);
        this.M.a("outerTraceMonitor", (String[]) arrayList.toArray(new String[0]));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableSpmLiveSourceParamsRecommend", "true"));
    }

    private void a(BusinessInfo businessInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384df4d9", new Object[]{this, businessInfo, str});
        } else if (businessInfo == null || businessInfo.tcp == null || TextUtils.isEmpty(str)) {
        } else {
            businessInfo.tcp.dataAttributes = com.alilive.adapter.business.a.a(this.k, businessInfo.tcp.dataAttributes, str);
        }
    }

    private void a(BusinessInfo businessInfo) {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a633c0cf", new Object[]{this, businessInfo});
        } else if (businessInfo.tcp != null && businessInfo.tcp.context != null && (tBLiveDataModel = this.l) != null && tBLiveDataModel.mVideoInfo != null && this.l.mVideoInfo.tcpContext != null && this.l.mVideoInfo.tcpContext.size() > 0) {
            for (String str : this.l.mVideoInfo.tcpContext.keySet()) {
                businessInfo.tcp.context.put(str, this.l.mVideoInfo.tcpContext.getString(str));
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ItemInfo itemInfo = this.r;
        if (itemInfo != null && itemInfo.card != null && this.r.card.containsKey("detailUrl")) {
            String string = this.r.card.getString("detailUrl");
            if (this.r.item != null && this.r.item.getBooleanValue("enableSku")) {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", this.r.item.getString("id"));
                hashMap.put("openFrom", "tblive");
                hashMap.put("bottomMode", "BUYNOW");
                if (this.r.item.containsKey("tradeParams")) {
                    hashMap.put("exParams", this.r.item.getJSONObject("tradeParams"));
                }
                nlf nlfVar = this.p;
                if (nlfVar != null && nlfVar.e()) {
                    pha.a("taolivegoods", "openNewBuy", hashMap, this.c, null);
                }
                nlf nlfVar2 = this.p;
                if (nlfVar2 != null && nlfVar2.f()) {
                    a("", this.r, false, "gotodetail");
                }
            } else {
                a(string, this.r, true, "gotodetail");
            }
        }
        nlf nlfVar3 = this.p;
        if (nlfVar3 == null || !nlfVar3.g()) {
            return;
        }
        a(false, false);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ItemInfo itemInfo = this.r;
        if (itemInfo == null || this.p == null) {
            return;
        }
        if ("queryMtop".equals(itemInfo.actionType)) {
            a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a(this.p.e, this.r.backParams);
            b(this.p.m(), this.r);
        } else if ("goToDetail".equals(this.r.actionType)) {
            i();
            b(this.p.l(), this.r);
        } else if (!"goToGoods".equals(this.r.actionType)) {
        } else {
            b(this.r);
            b(this.p.l(), this.r);
        }
    }

    private void b(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.C && !z) {
        } else {
            hjz.a(this.c, this.q, new hjz.a() { // from class: tb.hka.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.hjz.a
                public void a(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                        return;
                    }
                    if (hka.d(hka.this) != null) {
                        hka.d(hka.this).d.put("hasCalendar", (Object) Boolean.valueOf(hka.a(hka.this, z2)));
                        hka.d(hka.this).a(false);
                    }
                    if (z2) {
                        qng.a(hka.i(hka.this), "添加日历成功");
                    } else if (z) {
                        qng.a(hka.i(hka.this), "添加日历失败");
                    }
                    hka.this.b("item_right_popview_calendar_click", null);
                }

                @Override // tb.hjz.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (!z) {
                    } else {
                        qng.a(hka.i(hka.this), "无权限，请添加日历权限");
                    }
                }
            });
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        nlf nlfVar;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (IRecommendPopProxy.EventType_SHOW_POPVIEW.equals(str)) {
            if ((obj instanceof HashMap) && (obj2 = ((HashMap) obj).get("popviewTransParam")) != null) {
                this.u.put("popviewTransParam", (Object) (obj2 instanceof JSONObject ? ((JSONObject) obj2).toJSONString() : obj2.toString()));
            }
            a((String) null);
        } else if (!"com.taobao.taolive.room.dxmanager.event.recommend_popview".equals(str) || !(obj instanceof qmv.a) || (nlfVar = this.p) == null) {
        } else {
            qmv.a aVar = (qmv.a) obj;
            this.r = nlfVar.a(aVar);
            if (this.r == null || aVar.f32947a == null || aVar.f32947a.length < 2) {
                return;
            }
            if ("buttonAction".equals(aVar.f32947a[1])) {
                k();
            } else if (aVar.f32947a.length > 2 && "goToDetail".equals(aVar.f32947a[1])) {
                i();
                b(this.p.l(), this.r);
            } else if ("close".equals(aVar.f32947a[1])) {
                a(true, true);
                b(this.p.k(), this.r);
            } else if ("detailButton".equals(aVar.f32947a[1])) {
                i();
                b(this.p.l(), this.r);
            } else if ("calendar_add".equals(aVar.f32947a[1])) {
                b(true);
            } else if ("calendar_add_buy".equals(aVar.f32947a[1])) {
                k();
                b(false);
            } else if ("goToGoods".equals(aVar.f32947a[1])) {
                b(this.r);
                b(this.p.l(), this.r);
            } else if (aVar.f32947a.length > 2 && "calendar_add_goto_detail".equals(aVar.f32947a[1])) {
                i();
                b(false);
                b(this.p.l(), this.r);
            } else if (!"calendar_remove".equals(aVar.f32947a[1])) {
            } else {
                hjz.b(this.c, this.q, new hjz.a() { // from class: tb.hka.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.hjz.a
                    public void a(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        qng.a(hka.i(hka.this), z ? "删除日历成功" : "删除日历失败");
                        if (hka.d(hka.this) != null) {
                            hka.d(hka.this).a("hasCalendar", Boolean.valueOf(hka.a(hka.this, !z)));
                            hka.d(hka.this).a(false);
                        }
                        hka.this.b("item_right_popview_calendar_click", null);
                    }

                    @Override // tb.hjz.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            qng.a(hka.i(hka.this), "无权限，请添加日历权限");
                        }
                    }
                });
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{IRecommendPopProxy.EventType_SHOW_POPVIEW, "com.taobao.taolive.room.dxmanager.event.recommend_popview"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.k;
        return aVar == null ? "" : aVar.G();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        JSONObject mo1437getData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof MtopTbliveRecommendPopviewQueryResponse) {
            a((MtopTbliveRecommendPopviewQueryResponse) netBaseOutDo);
        } else if (netBaseOutDo instanceof MtopTbliveRecommendPopviewClickResponse) {
            JSONObject mo1437getData2 = ((MtopTbliveRecommendPopviewClickResponse) netBaseOutDo).mo1437getData();
            if (mo1437getData2 == null || this.d == null) {
                return;
            }
            if ("100".equals(mo1437getData2.getString("code"))) {
                a("click", mo1437getData2.getString("text"));
                return;
            }
            this.H = mo1437getData2.getString("backParams");
            this.I = Math.max(Math.min(mo1437getData2.getIntValue("count"), 20), 1);
            this.J = Math.max(Math.min(mo1437getData2.getIntValue(Constants.Name.INTERVAL), 5000), 200);
            nlf nlfVar = this.p;
            if (nlfVar != null) {
                nlfVar.d.put("dx_buttonStatus", (Object) mo1437getData2);
            }
            nlf nlfVar2 = this.p;
            if (nlfVar2 != null) {
                nlfVar2.a(false);
            }
            this.K = 0;
            h();
        } else if (!(netBaseOutDo instanceof MtopTbliveRecommendPopviewStatusResponse) || (mo1437getData = ((MtopTbliveRecommendPopviewStatusResponse) netBaseOutDo).mo1437getData()) == null || this.d == null || this.p == null) {
        } else {
            String string = mo1437getData.getString("step");
            String string2 = mo1437getData.getString("text");
            if ("finish".equals(string)) {
                a(string, string2);
            } else if ("failed".equals(string)) {
                this.p.d.remove("dx_buttonStatus");
                this.p.a(false);
                a(string, string2);
            } else {
                h();
            }
        }
    }

    private void a(MtopTbliveRecommendPopviewQueryResponse mtopTbliveRecommendPopviewQueryResponse) {
        nlf nlfVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df70caed", new Object[]{this, mtopTbliveRecommendPopviewQueryResponse});
            return;
        }
        IRecommendPopProxy.b bVar = this.j;
        if (bVar != null) {
            bVar.b(j());
        }
        JSONObject mo1437getData = mtopTbliveRecommendPopviewQueryResponse.mo1437getData();
        if (mo1437getData != null && this.d != null) {
            IRecommendPopProxy.b bVar2 = this.j;
            if (bVar2 != null) {
                bVar2.c(j());
            }
            this.q = (CalendarConfig) pqj.a(mo1437getData.getString("calendarConfig"), CalendarConfig.class);
            boolean a2 = hjz.a(this.c, this.q);
            this.C = a2;
            mo1437getData.put("hasCalendar", (Object) Boolean.valueOf(a2));
            String string = mo1437getData.getString("dxTemplateName");
            String string2 = mo1437getData.getString("typeName");
            this.p = null;
            if (string != null) {
                char c = 65535;
                switch (string.hashCode()) {
                    case -857653560:
                        if (string.equals("taolive_newuser_list_panel")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 123987525:
                        if (string.equals("taolive_triple_gift_panel")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 237853329:
                        if (string.equals("taolive_speedbump_panel")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 380012351:
                        if (string.equals("taolive_newuser_panel")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1048603905:
                        if (string.equals("taolive_boom_panel")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2031766573:
                        if (string.equals("taolive_boom_newuser_panel")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    this.p = new ListItemPopView(this.c, this, string2);
                } else if (c == 1 || c == 2 || c == 3) {
                    this.p = new nlg(this.c, this, string2);
                } else if (c == 4) {
                    this.p = new sqm(this.c, this, string2);
                } else if (c == 5) {
                    this.p = new nle(this.c, this, string2);
                }
            }
            nlf nlfVar2 = this.p;
            if (nlfVar2 != null) {
                z = nlfVar2.a(this.d, mo1437getData);
            }
            IRecommendPopProxy.b bVar3 = this.j;
            if (bVar3 != null) {
                bVar3.d(j());
            }
            if (!z && (nlfVar = this.p) != null) {
                nlfVar.b();
                this.p = null;
            }
            if (z) {
                a(true);
            }
            pqi.a().b("userPanelShowPoint");
            return;
        }
        pqi.a().c("userPanelShowPoint");
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        c(str, this.r);
        if (!TextUtils.isEmpty(str2)) {
            qng.a(this.c, str2);
        }
        i();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (netResponse != null) {
            arrayList.add("api=" + netResponse.getApi());
            arrayList.add("ret_msg=" + netResponse.getRetMsg());
            arrayList.add("ret_code=" + netResponse.getRetCode());
            if (MtopTbliveRecommendPopviewClickRequest.API_NAME_FINAL.equals(netResponse.getApi())) {
                pqi.a().c("userPanelShowPoint");
                if (hkk.N()) {
                    i();
                }
            } else {
                i();
            }
        }
        a("item_right_popview_request_error", arrayList, this.r);
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

    public void a(String str, ItemInfo itemInfo) {
        JSONObject o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07d9c20", new Object[]{this, str, itemInfo});
        } else if (this.M == null || TextUtils.isEmpty(str)) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            nlf nlfVar = this.p;
            if (nlfVar != null) {
                hashMap.put("popCode", nlfVar.f);
                hashMap.put("typename", this.p.s);
            }
            hashMap.put("calendarStatus", String.valueOf(this.C));
            hashMap.put("time", String.valueOf(System.currentTimeMillis()));
            hashMap.put("panelTechType", "dx");
            hashMap.put("spm-cnt", this.v);
            hashMap.put("spm-url", this.n);
            hashMap.put("feeds_pos", "1");
            hashMap.put("page_mod", "zhiboliveid");
            hashMap.put("is_fp_mod", "1");
            if (itemInfo != null) {
                if (itemInfo.item != null) {
                    hashMap.put("itemPrice", itemInfo.item.getString("itemPrice"));
                    hashMap.put("promotionPrice", itemInfo.item.getString("promotionPrice"));
                    hashMap.put("restore_flag", String.valueOf(TextUtils.equals(this.s, itemInfo.item.getString("id")) ? 1 : 0));
                }
                if (itemInfo.logParams != null) {
                    hashMap.putAll(qnb.a(itemInfo.logParams));
                } else {
                    nlf nlfVar2 = this.p;
                    if (nlfVar2 != null && (o = nlfVar2.o()) != null) {
                        hashMap.putAll(qnb.a(o));
                    }
                }
            } else {
                hashMap.put("restore_flag", "1");
            }
            this.M.a(str, hashMap);
        }
    }

    public void b(String str, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803dcfbf", new Object[]{this, str, itemInfo});
        } else {
            a(str, (ArrayList<String>) null, itemInfo);
        }
    }

    private void c(String str, ItemInfo itemInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe035e", new Object[]{this, str, itemInfo});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("result=" + str);
        arrayList.add("successIndex=" + this.K);
        a("item_right_popview_query", arrayList, itemInfo);
    }

    private void a(String str, ArrayList<String> arrayList, ItemInfo itemInfo) {
        JSONObject o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d7d4da", new Object[]{this, str, arrayList, itemInfo});
        } else if (this.M != null && !TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("time=" + String.valueOf(System.currentTimeMillis()));
            arrayList2.add("panelTechType=dx");
            if (itemInfo == null || itemInfo.item == null) {
                arrayList2.add("restore_flag=1");
            } else {
                arrayList2.add("itemPrice=" + itemInfo.item.getString("itemPrice"));
                arrayList2.add("promotionPrice=" + itemInfo.item.getString("promotionPrice"));
                arrayList2.add("restore_flag=" + (TextUtils.equals(this.s, itemInfo.item.getString("id")) ? 1 : 0));
            }
            if (this.p != null) {
                arrayList2.add("popCode=" + this.p.f);
                arrayList2.add("typeName=" + this.p.s);
            }
            arrayList2.add("calendarStatus=" + this.C);
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            arrayList2.add("spm-cnt=" + this.v);
            arrayList2.add("spm-url=" + this.n);
            arrayList2.add("feeds_pos=1");
            arrayList2.add("page_mod=zhiboliveid");
            arrayList2.add("is_fp_mod=1");
            if (itemInfo != null && itemInfo.logParams != null) {
                for (String str2 : itemInfo.logParams.keySet()) {
                    arrayList2.add(str2 + "=" + itemInfo.logParams.getString(str2));
                }
            } else {
                nlf nlfVar = this.p;
                if (nlfVar != null && (o = nlfVar.o()) != null) {
                    for (String str3 : o.keySet()) {
                        arrayList2.add(str3 + "=" + o.getString(str3));
                    }
                }
            }
            this.M.a(str, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        g b = n.b(this.k);
        if (b == null || b.F == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "dx");
        ISmartLandingProxy.b bVar = b.F;
        String str = this.y;
        bVar.a(z, str, true ^ TextUtils.isEmpty(str), jSONObject);
    }

    private HashMap<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5a3abb14", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        nlf nlfVar = this.p;
        if (nlfVar != null) {
            hashMap.put("panel_type", nlfVar.e);
            hashMap.put("dx_template_name", this.p.g);
        }
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.a
    public void a(qmp qmpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9c7884", new Object[]{this, qmpVar});
        } else {
            this.M = qmpVar;
        }
    }

    public qmn l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmn) ipChange.ipc$dispatch("63abc4a1", new Object[]{this}) : this.N;
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy.a
    public void a(qmn qmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9b8fc6", new Object[]{this, qmnVar});
        } else {
            this.N = qmnVar;
        }
    }
}
