package com.taobao.android.detail2.core.framework.data;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import com.taobao.android.detail2.core.framework.data.net.recommend.a;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.android.detail2.core.framework.view.feeds.c;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager;
import com.taobao.android.preload.g;
import com.taobao.android.preload.k;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bpt;
import tb.ctu;
import tb.fhi;
import tb.fhp;
import tb.fig;
import tb.fik;
import tb.fil;
import tb.fim;
import tb.fjp;
import tb.fjt;
import tb.fjx;
import tb.fkb;
import tb.fko;
import tb.fkr;
import tb.fkt;
import tb.fkx;
import tb.fln;
import tb.flo;
import tb.flp;
import tb.flt;
import tb.fme;
import tb.fmh;
import tb.ipa;
import tb.kge;
import tb.ova;

/* loaded from: classes5.dex */
public class DetailDataManager implements j<fik> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RECOMMEND_ERROR_CODE_COMMON = 3;
    public static final int RECOMMEND_ERROR_CODE_ITEM_ID_EMPTY = 4;
    public static final int RECOMMEND_ERROR_CODE_LAST_PAGE = 1;
    public static final int RECOMMEND_ERROR_CODE_LOADING = 2;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.detail2.core.framework.b f11512a;
    private com.taobao.android.detail2.core.framework.data.net.recommend.a h;
    private a j;
    private fmh l;
    private flo n;
    private boolean b = false;
    private boolean d = false;
    public com.taobao.android.detail2.core.optimize.preload.b c = new com.taobao.android.detail2.core.optimize.preload.b();
    private HashMap<String, Integer> i = new HashMap<>();
    private flt k = new flt();
    private HashMap<String, d> m = new HashMap<>();

    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z, int i, int i2);

        void a(boolean z, String str, d dVar, boolean z2);

        boolean a(boolean z, int i, JSONObject jSONObject, List<d> list, int i2, boolean z2);

        boolean a(boolean z, String str, int i, d dVar);

        boolean b(boolean z, String str, int i, d dVar);
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11517a;
        public boolean b;

        static {
            kge.a(1116720799);
        }
    }

    static {
        kge.a(-887039379);
        kge.a(-1453870097);
    }

    public static boolean a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c190d1b", new Object[]{new Boolean(z), new Integer(i)})).booleanValue() : !z && i == 0;
    }

    public static /* synthetic */ List a(DetailDataManager detailDataManager, boolean z, JSONObject jSONObject, String str, JSONArray jSONArray, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8a47624a", new Object[]{detailDataManager, new Boolean(z), jSONObject, str, jSONArray, aVar}) : detailDataManager.a(z, jSONObject, str, jSONArray, aVar);
    }

    public static /* synthetic */ fhi a(DetailDataManager detailDataManager, JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fhi) ipChange.ipc$dispatch("f4ee9d07", new Object[]{detailDataManager, jSONObject, new Boolean(z), str}) : detailDataManager.a(jSONObject, z, str);
    }

    public static /* synthetic */ fkr a(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("57b726cf", new Object[]{detailDataManager}) : detailDataManager.j();
    }

    public static /* synthetic */ void a(DetailDataManager detailDataManager, JSONArray jSONArray, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64b8fe3", new Object[]{detailDataManager, jSONArray, list});
        } else {
            detailDataManager.a(jSONArray, list);
        }
    }

    public static /* synthetic */ void a(DetailDataManager detailDataManager, boolean z, JSONArray jSONArray, JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9b33fb", new Object[]{detailDataManager, new Boolean(z), jSONArray, jSONObject, str, new Integer(i)});
        } else {
            detailDataManager.a(z, jSONArray, jSONObject, str, i);
        }
    }

    public static /* synthetic */ void a(DetailDataManager detailDataManager, boolean z, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e287065", new Object[]{detailDataManager, new Boolean(z), str, str2, new Integer(i)});
        } else {
            detailDataManager.a(z, str, str2, i);
        }
    }

    public static /* synthetic */ boolean a(DetailDataManager detailDataManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8ae764e", new Object[]{detailDataManager, new Boolean(z)})).booleanValue();
        }
        detailDataManager.b = z;
        return z;
    }

    public static /* synthetic */ boolean b(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("989ca90f", new Object[]{detailDataManager})).booleanValue() : detailDataManager.d;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b c(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("bda9537b", new Object[]{detailDataManager}) : detailDataManager.f11512a;
    }

    public static /* synthetic */ a d(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2ec8bb2e", new Object[]{detailDataManager}) : detailDataManager.j;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fik fikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fikVar}) : a(fikVar);
    }

    public DetailDataManager(com.taobao.android.detail2.core.framework.b bVar) {
        ctu.a("init_DetailDataManager");
        this.f11512a = bVar;
        this.l = n();
        this.h = new com.taobao.android.detail2.core.framework.data.net.recommend.a(bVar);
        this.n = fko.c(j().y());
        l();
        m();
        ctu.a();
    }

    private fkr j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("544372c8", new Object[]{this}) : this.f11512a.h();
    }

    private fkt k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkt) ipChange.ipc$dispatch("5bf51865", new Object[]{this}) : j().b();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.k.a("item", fhi.p());
        this.k.a(fhp.VIEWHOLDER_KEY, fhi.p());
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            fim.a(this.f11512a.f(), j().y(), fil.a(fik.class, ""), this);
        }
    }

    private fmh n() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmh) ipChange.ipc$dispatch("730a0e90", new Object[]{this});
        }
        Activity g = this.f11512a.g();
        if (g != null && (intent = g.getIntent()) != null) {
            return flp.b(intent.getData());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.data.DetailDataManager.a():void");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.a f = this.f11512a.f();
        try {
            Activity g = this.f11512a.g();
            Intent intent = g == null ? null : g.getIntent();
            if (intent == null) {
                fjp.a(f, com.taobao.android.detail2.core.framework.c.KEY_EXTRA_FRAME_ANIM_ND_REASON, (Object) "activityIntentIsNull");
                return;
            }
            String stringExtra = intent.getStringExtra("extraFrameAnimType");
            String stringExtra2 = intent.getStringExtra("extraFrameAnimReason");
            String stringExtra3 = intent.getStringExtra("extraFrameAnimHitFixed");
            String stringExtra4 = intent.getStringExtra(com.taobao.android.detail2.core.framework.c.KEY_EXTRA_FRAME_ANIM_ND_REASON);
            if (stringExtra != null) {
                fjp.a(f, "extraFrameAnimType", (Object) stringExtra);
            }
            if (stringExtra2 != null) {
                fjp.a(f, "extraFrameAnimReason", (Object) stringExtra2);
            }
            if (stringExtra3 != null) {
                fjp.a(f, "extraFrameAnimHitFixed", (Object) stringExtra3);
            }
            if (stringExtra4 == null) {
                return;
            }
            fjp.a(f, com.taobao.android.detail2.core.framework.c.KEY_EXTRA_FRAME_ANIM_ND_REASON, (Object) stringExtra4);
        } catch (Exception e) {
            fjp.a(f, com.taobao.android.detail2.core.framework.c.KEY_EXTRA_FRAME_ANIM_ND_REASON, (Object) ("ndAddPropertyError:" + e.getCause()));
        }
    }

    /* loaded from: classes5.dex */
    public class c implements NavPreRequestManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-235475400);
            kge.a(1253932503);
        }

        private c() {
        }

        @Override // com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.a
        public void a(JSONObject jSONObject) {
            ova ovaVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            ctu.a("onOpenImmedDataSuccess");
            ctu.a();
            fjt.a(fjt.TAG_RENDER, "onOpenImmedDataSuccess");
            if (jSONObject == null) {
                fjt.a(fjt.TAG_RENDER, "onOpenImmedDataSuccess data == null return");
            } else if (DetailDataManager.a(DetailDataManager.this).S()) {
                fjt.a(fjt.TAG_RENDER, "onOpenImmedDataSuccess , but now isOpenImmediatelyMode return");
            } else if (DetailDataManager.b(DetailDataManager.this)) {
                fjt.a(fjt.TAG_RENDER, "onOpenImmedDataSuccess , 正式请求已经返回，不处理");
            } else {
                com.taobao.android.preload.j a2 = k.a("new_detail");
                String b = fjx.b(DetailDataManager.a(DetailDataManager.this).f(), DetailDataManager.a(DetailDataManager.this).k().W);
                JSONObject jSONObject2 = jSONObject.getJSONObject(DetailDataManager.a(DetailDataManager.this).f());
                a2.a(new g.a().a("preload").b("low").c(b).a((g.a) jSONObject2).d("NDNavPre").a());
                DetailDataManager detailDataManager = DetailDataManager.this;
                fhi a3 = DetailDataManager.a(detailDataManager, jSONObject2, true, DetailDataManager.a(detailDataManager).f());
                if (a3.ae != null && a3.ae.f32210a.size() > 0 && (ovaVar = a3.ae.f32210a.get(0)) != null) {
                    String a4 = fln.a(DetailDataManager.c(DetailDataManager.this).g(), ovaVar.dG_());
                    com.taobao.phenix.intf.b.h().a(a4).fetch();
                    fjt.a(fjt.TAG_RENDER, "onOpenImmedDataSuccess 发起首张图片图片预加载: " + a4);
                }
                if (DetailDataManager.d(DetailDataManager.this) == null) {
                    return;
                }
                DetailDataManager.d(DetailDataManager.this).a(true, DetailDataManager.a(DetailDataManager.this).f(), (d) a3, false);
            }
        }

        @Override // com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.a
        public void a(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
                return;
            }
            ctu.a("onRealDataSuccess");
            ctu.a();
            fjt.a(fjt.TAG_RENDER, "onRealDataSuccess");
            if (jSONObject == null) {
                return;
            }
            DetailDataManager.a(DetailDataManager.this, false, jSONObject.getJSONArray("sectionList"), jSONObject, str, 0);
        }

        @Override // com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                DetailDataManager.a(DetailDataManager.this, false, str, "", 0);
            }
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        String f = j().f();
        if (fkr.NO_ID_DEFAULT.equals(f)) {
            fjp.a(this.f11512a.f(), "immediatelyNoId", (Object) "true");
        } else if (a(f)) {
            fjp.a(this.f11512a.f(), "immediatelyDataHit", (Object) "true");
        } else {
            fjp.a(this.f11512a.f(), "immediatelyDataHit", (Object) "false");
            b(f);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.j == null) {
            return false;
        }
        String b2 = fjx.b(str, j().k().W);
        JSONObject a2 = fjx.a(b2, "generateOpenImmediatelyNodeNew");
        if (a2 == null) {
            fko.b(j().y());
            fig.a c2 = fig.c(b2);
            if (c2 != null && c2.b == 5) {
                fig.a(b2, 4);
            }
            a(c2);
            c(b2);
            return false;
        }
        if (!a2.containsKey("hasVisitPreRequest")) {
            a2.put("hasVisitPreRequest", "true");
            fjp.a("eventProcess", fjp.UMBRELLA_TAG_PRE_REQUEST_VISIT, (Map<String, String>) null);
        }
        fhi a3 = a(a2, false, str);
        c(b2);
        this.j.a(true, str, (d) a3, false);
        fjp.a(this.f11512a.f(), "InitPreRequestHit", (Object) "true");
        NavPreRequestManager.a().g(j().aq());
        fjt.a(fjt.TAG_RENDER, "generateOpenImmediatelyNodeNew,对应id: " + b2 + "首卡数据创建成功");
        return true;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        fig.a c2 = fig.c(str);
        if (c2 == null || c2.c == -1) {
            return;
        }
        fig.b(str);
        fjp.a(this.f11512a.f(), "preRequestReadNum", Integer.valueOf(c2.d));
        fjp.a(this.f11512a.f(), fjp.SECTION_START_REQUEST_TO_CLICK, fkb.a(c2.c), "");
        fjp.b(this.f11512a.f(), fjp.SECTION_START_REQUEST_TO_CLICK, "");
        fjp.b(this.f11512a.f(), fjp.SECTION_OPEN_IMMED_HP_TO_REAL_REQUEST, fkb.a(c2.c), "");
    }

    private void a(fig.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b93e777", new Object[]{this, aVar});
        } else if (aVar == null) {
            fjp.a(this.f11512a.f(), "preRequestStatus", (Object) 0);
            fjp.a(this.f11512a.f(), "preRequestPreStatus", (Object) 0);
        } else {
            fjp.a(this.f11512a.f(), "preRequestStatus", Integer.valueOf(aVar.b));
            fjp.a(this.f11512a.f(), "preRequestPreStatus", Integer.valueOf(aVar.f27972a));
        }
    }

    private fhi a(JSONObject jSONObject, boolean z, String str) {
        com.taobao.android.detail2.core.framework.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fhi) ipChange.ipc$dispatch("2228eba9", new Object[]{this, jSONObject, new Boolean(z), str});
        }
        fjt.a(fjt.TAG_RENDER, "generateFirstNode: " + j().y());
        fhi b2 = fko.b(j().y());
        if (b2 != null) {
            fjt.a(fjt.TAG_RENDER, "首卡节点拿到nav节点预加载的model");
            this.m.put(b2.k, b2);
            if (b2.o()) {
                fjp.a(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL, "瞬开首卡数据缺失weexurl", j().T());
            }
            return b2;
        }
        fhi fhiVar = null;
        if (z) {
            fjt.a(fjt.TAG_RENDER, "首卡节点没拿到nav节点预加载的model，尝试从feedsMapData中取");
            fhiVar = (fhi) this.m.get(str);
        }
        if (fhiVar == null) {
            fjt.a(fjt.TAG_RENDER, "首卡节点没拿到nav节点预加载的model，重新创建");
            fhiVar = new fhi(j());
        }
        boolean z2 = ipa.K() || (fkt.aD() && (bVar = this.f11512a) != null && bVar.k() != null && this.f11512a.k().b());
        fjt.a(fjt.TAG_RENDER, "generateFirstNodeProcessRecommendInfo");
        fhiVar.a(jSONObject, false, z2, z);
        fhiVar.y = false;
        fhiVar.f = 0;
        fhiVar.C = true;
        fhiVar.F = true;
        this.m.put(fhiVar.k, fhiVar);
        if (fhiVar.o()) {
            fjp.a(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL, "瞬开首卡数据缺失weexurl", j().T());
        }
        com.taobao.android.detail2.core.optimize.preload.a.a(j(), fhiVar, z);
        return fhiVar;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        String I = j().I();
        String c2 = j().c(I);
        fjt.a(fjt.TAG_RENDER, "预创建卡片old, cardType: " + I + ", cacheMainPicUrl: " + c2 + ", contentExp: " + j().k().F);
        if (this.j == null) {
            return;
        }
        fhi fhiVar = new fhi(j());
        fhiVar.C = true;
        fhiVar.f = 0;
        fhiVar.k = str;
        fhiVar.g = j().I();
        fhiVar.y = false;
        if (!TextUtils.isEmpty(c2)) {
            fhiVar.b(c2);
        }
        if (j().r().a(j().k().W)) {
            if (j().s() != null) {
                fjt.a(fjt.TAG_RENDER, "generateOpenImmediatelyNodeOld simpleDeliverData不为空");
                fjp.a(this.f11512a.f(), "navDeliverDataHit", (Object) "true");
                if (TextUtils.isEmpty(j().t()) || TextUtils.isEmpty(j().ak())) {
                    fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_DELIVER_DATA_ABSENT, "simpledeliverdata缺失，url: " + j().t() + ", dimension: " + j().ak(), (Map<String, String>) null);
                } else if (j().am() == null) {
                    fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_DELIVER_DATA_ABSENT, "simpledeliverdata feature缺失", (Map<String, String>) null);
                }
                fhiVar.a(j().al(), j().t(), j().ak(), j().am());
            } else {
                fjt.a(fjt.TAG_RENDER, "generateOpenImmediatelyNodeOld simpleDeliverData为空, nid: " + j().f());
            }
        }
        this.m.put(fhiVar.k, fhiVar);
        this.j.a(true, j().f(), (d) fhiVar, false);
    }

    public d a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("47efd5f0", new Object[]{this, str, str2});
        }
        d a2 = a(false, (String) null, str);
        if (a2 == null) {
            a2 = new fhi(j());
            a2.k = str;
            a2.g = str2;
            a2.f = 0;
            a2.C = false;
            a2.F = false;
            this.m.put(a2.k, a2);
        }
        JSONObject a3 = fjx.a(fjx.b(str, j().k().W), "generateFirstNodeWhenError");
        if (a3 != null) {
            a2.a(a3, false);
            a2.y = false;
            return a2;
        }
        JSONObject F = j().F();
        String c2 = j().c(str2);
        if (F != null && !TextUtils.isEmpty(c2) && !fme.EXP_ITEM_ARTICLE.equals(j().k().F)) {
            a2.a(c2, F);
            a2.y = false;
        } else {
            a2.y = true;
        }
        return a2;
    }

    private d a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("44644c6c", new Object[]{this, new Boolean(z), str, str2});
        }
        if (z) {
            d remove = this.m.remove(str);
            this.m.put(str2, remove);
            return remove;
        }
        return this.m.get(str2);
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            a(str, z, false);
        }
    }

    public void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        } else {
            a(str, z, z2, false);
        }
    }

    public void a(String str, boolean z, boolean z2, final boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f296e2", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        ctu.a("fetchRecommendListForNextPage");
        ctu.a();
        final int d = d(z2);
        if (!a(str, z2, d)) {
            return;
        }
        this.b = true;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z2 ? "up" : "down");
        final String sb2 = sb.toString();
        if (z) {
            Integer num = this.i.get(sb2);
            if (num == null) {
                this.i.put(sb2, 1);
            } else {
                this.i.put(sb2, Integer.valueOf(num.intValue() + 1));
            }
        }
        fjt.a(fjt.TAG_RENDER, "开始请求推荐列表：" + str);
        this.h.a(z2, d, com.taobao.android.detail2.core.optimize.preload.a.a(j(), this.c, z2), new a.InterfaceC0459a() { // from class: com.taobao.android.detail2.core.framework.data.DetailDataManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail2.core.framework.data.net.recommend.a.InterfaceC0459a
            public void a(final boolean z4, final JSONArray jSONArray, final JSONObject jSONObject, final MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9d65a1", new Object[]{this, new Boolean(z4), jSONArray, jSONObject, mtopResponse});
                    return;
                }
                ctu.a("onLoadSuccess");
                if (DetailDataManager.c(DetailDataManager.this) != null && DetailDataManager.c(DetailDataManager.this).k() != null && DetailDataManager.c(DetailDataManager.this).k().c() && (!z3 ? DetailDataManager.c(DetailDataManager.this).h().b().M() : DetailDataManager.c(DetailDataManager.this).h().b().at())) {
                    DetailDataManager.c(DetailDataManager.this).k().a(new NewDetailMaskFrameLayout.b() { // from class: com.taobao.android.detail2.core.framework.data.DetailDataManager.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                        public String b() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("367c9fd7", new Object[]{this}) : "DetailDataManager nextPage directProcessLoadSuccess";
                        }

                        @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            ctu.a("directProcessLoadSuccess1");
                            DetailDataManager.a(DetailDataManager.this, z4, jSONArray, jSONObject, bpt.a(mtopResponse), d);
                            ctu.a();
                        }
                    });
                } else {
                    ctu.a("directProcessLoadSuccess2");
                    DetailDataManager.a(DetailDataManager.this, z4, jSONArray, jSONObject, bpt.a(mtopResponse), d);
                    ctu.a();
                }
                ctu.a();
            }

            @Override // com.taobao.android.detail2.core.framework.data.net.recommend.a.InterfaceC0459a
            public void a(boolean z4, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8be3bf21", new Object[]{this, new Boolean(z4), new Integer(i), str2});
                } else {
                    DetailDataManager.a(DetailDataManager.this, z4, str2, sb2, d);
                }
            }
        }, k().ad(), j().r().d(j().k().W));
    }

    private void a(boolean z, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a740083", new Object[]{this, new Boolean(z), str, str2, new Integer(i)});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "列表请求失败：" + str);
        this.b = false;
        this.d = true;
        j().d(true);
        Integer num = this.i.get(str2);
        if (num != null) {
            i2 = num.intValue();
        }
        if (a(z, i)) {
            fjp.b(this.f11512a.f(), fjp.SECTION_FIRST_TPP_REQUEST_PARSE, "");
        }
        a(z, i, b(z), i2);
        this.f11512a.h().P();
    }

    private void a(boolean z, JSONArray jSONArray, JSONObject jSONObject, String str, int i) {
        int i2;
        boolean z2;
        boolean z3;
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbc9c1d", new Object[]{this, new Boolean(z), jSONArray, jSONObject, str, new Integer(i)});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "列表请求成功，个数：" + jSONArray.size());
        a(jSONObject, z);
        a(jSONObject, z, i);
        j().e((JSONObject) null);
        List<d> a2 = a(z, jSONObject, str, jSONArray, this.j);
        if (!a2.isEmpty() && (dVar = a2.get(0)) != null && dVar.l != null) {
            j().a(dVar.l.getString("uniqID"));
        }
        j().a(jSONObject.getJSONObject("utparams"));
        if (a(z, i)) {
            b(a2);
            fjp.b(this.f11512a.f(), fjp.SECTION_FIRST_TPP_REQUEST_PARSE, "");
        }
        a aVar = this.j;
        if (aVar != null) {
            z3 = true;
            z2 = false;
            i2 = i;
            if (!aVar.a(z, c(z), jSONObject, a2, -1, b(z))) {
                e(z);
            }
        } else {
            i2 = i;
            z2 = false;
            z3 = true;
        }
        if (a(z, i2)) {
            a(jSONObject);
        }
        this.c.d.resetMaxSize(j().ah());
        this.f11512a.h().P();
        this.b = z2;
        this.d = z3;
        if (!j().n() || !a(z, i2)) {
            return;
        }
        a(j().f(), z3, z3);
    }

    private void b(List<d> list) {
        d dVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        j().f(j().O());
        if (list == null) {
            return;
        }
        if (list.size() > 1) {
            j().e(true);
        }
        if (list.size() <= 0 || (dVar = list.get(0)) == null || !j().an()) {
            return;
        }
        com.taobao.android.detail2.core.framework.a f = this.f11512a.f();
        if (!j().a(0, dVar.g) && !j().b(0, dVar.g)) {
            z = false;
        }
        fjp.a(f, "halfScreenGuide", Boolean.valueOf(z));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("serverAPMParams")) != null) {
            for (String str : jSONObject2.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    fjp.a(this.f11512a.f(), str, (Object) jSONObject2.getString(str));
                }
            }
        }
    }

    private boolean a(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a35a2265", new Object[]{this, str, new Boolean(z), new Integer(i)})).booleanValue();
        }
        boolean b2 = b(z);
        if (TextUtils.isEmpty(str)) {
            fjp.a("recommend", fjp.ERROR_CODE_RECOMMEND_ITEM_ID_EMPTY, "请求推荐列表时itemid为空", j().T(), "", "");
            i2 = 4;
        } else if (!this.b) {
            i2 = b2 ? 1 : -1;
        }
        if (i2 == -1) {
            return true;
        }
        try {
            if (this.j != null) {
                this.j.a(z, i, i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public void a(RecRequestParamsV2 recRequestParamsV2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025fb3", new Object[]{this, recRequestParamsV2, aVar});
        } else {
            this.h.a(false, c(false), recRequestParamsV2, new a.InterfaceC0459a() { // from class: com.taobao.android.detail2.core.framework.data.DetailDataManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.data.net.recommend.a.InterfaceC0459a
                public void a(boolean z, JSONArray jSONArray, JSONObject jSONObject, MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9d65a1", new Object[]{this, new Boolean(z), jSONArray, jSONObject, mtopResponse});
                        return;
                    }
                    List<d> a2 = DetailDataManager.a(DetailDataManager.this, false, jSONObject, bpt.a(mtopResponse), jSONArray, aVar);
                    DetailDataManager.a(DetailDataManager.this, jSONArray, a2);
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(false, DetailDataManager.this.c(false), jSONObject, a2, -1, false);
                }

                @Override // com.taobao.android.detail2.core.framework.data.net.recommend.a.InterfaceC0459a
                public void a(boolean z, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8be3bf21", new Object[]{this, new Boolean(z), new Integer(i), str});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(false, i, 3);
                }
            }, false, false);
        }
    }

    private void a(JSONArray jSONArray, List<d> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38301281", new Object[]{this, jSONArray, list});
            return;
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        if (list != null) {
            i = list.size();
        }
        if (i == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ratio", String.valueOf(size / i));
        fjp.a("eventProcess", "Monitor_NewDetail_RealTimeRequestUseRatio_" + this.f11512a.h().W().b(), hashMap);
    }

    private void a(boolean z, int i, boolean z2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba203e06", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2)});
        } else if (this.j == null) {
        } else {
            int e = k().e();
            if (i2 < e) {
                if (z2) {
                    this.j.a(z, i, 1);
                    return;
                } else {
                    this.j.a(z, i, 3);
                    return;
                }
            }
            fjp.a("recommend", fjp.ERROR_CODE_RECOMMEND_FAIL_EXCEED_MAX_COUNT, "推荐接口请求失败次数大于" + e, j().T());
            this.j.a(z, i, 1);
        }
    }

    private void a(JSONObject jSONObject, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac5437", new Object[]{this, jSONObject, new Boolean(z), new Integer(i)});
        } else if (jSONObject == null || !a(z, i)) {
        } else {
            j().d(jSONObject.getJSONObject(AtmosParams.KEY_ATMOS_FEED_PARAMS));
        }
    }

    private void a(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("pageParams")) == null) {
        } else {
            if ("y".equalsIgnoreCase(jSONObject2.getString("isLastPage"))) {
                if (z) {
                    this.c.f11673a.b = true;
                } else {
                    this.c.b.b = true;
                }
            }
            String string = jSONObject2.getString(BioDetector.EXT_KEY_PAGENUM);
            try {
                if (z) {
                    this.c.f11673a.f11517a = Integer.parseInt(string);
                } else {
                    this.c.b.f11517a = Integer.parseInt(string);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private List<d> a(boolean z, JSONObject jSONObject, String str, JSONArray jSONArray, a aVar) {
        String str2;
        JSONObject jSONObject2;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9c11b5ec", new Object[]{this, new Boolean(z), jSONObject, str, jSONArray2, aVar});
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("weexPassList");
        JSONObject jSONObject3 = jSONObject.getJSONObject("pageParams");
        boolean equals = d.OPEN_TYPE_MVP.equals(jSONObject.getString(d.KEY_ND_OPEN_TYPE));
        if (jSONArray2 == null || aVar == null) {
            return new ArrayList();
        }
        if (jSONObject3 != null) {
            str2 = jSONObject3.getString(BioDetector.EXT_KEY_PAGENUM);
            jSONObject2 = jSONObject3.getJSONObject("pagePassExpParam");
        } else {
            str2 = "";
            jSONObject2 = null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.size()) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
            if (jSONObject4 != null) {
                String string = jSONObject4.getString("nid");
                d dVar = this.m.get(string);
                fjt.a(fjt.TAG_RENDER, "parseListDataAndBindWeexPass mFeedsMapData.get" + string + ", obj: " + dVar);
                if (dVar == null || !aVar.a(z, str2, i, this.m.get(string))) {
                    if (dVar == null) {
                        dVar = this.k.a(jSONObject4.getString("type"), this.f11512a);
                    }
                    if (dVar == null) {
                        Activity g = this.f11512a.g();
                        fjt.a(g, fjt.TAG_RENDER, "VerticalItemNode生成失败为空：" + jSONObject4.getString("nid"));
                    } else {
                        fjt.a(fjt.TAG_RENDER, "parseListDataAndBindWeexPassProcessRecommendInfo");
                        dVar.a(str);
                        dVar.a(jSONObject4, equals, false, false);
                        dVar.b(jSONObject2);
                        dVar.a(this.f11512a);
                        fjp.a(dVar, fjp.BIZ_CONTEXT_KEY_CARD_NID, dVar.k);
                        fjp.a(dVar, fjp.BIZ_CONTEXT_KEY_CARD_TYPE, dVar.g);
                        JSONObject jSONObject5 = (jSONArray3 == null || jSONArray3.size() <= i) ? null : jSONArray3.getJSONObject(i);
                        if (jSONObject5 == null) {
                            jSONObject5 = new JSONObject();
                        }
                        dVar.e(jSONObject5);
                        dVar.y = false;
                        dVar.C = false;
                        dVar.F = false;
                        if (aVar.b(z, str2, i, dVar)) {
                            this.m.put(dVar.k, dVar);
                            arrayList.add(dVar);
                            if (!this.c.c.contains(dVar.k)) {
                                this.c.c.add(dVar.k);
                                this.c.e.add(dVar.c("_"));
                            }
                            if (!this.c.d.contains(dVar.af)) {
                                this.c.d.add(dVar.af);
                            }
                            a(dVar, str2, i, str);
                        }
                        i++;
                        jSONArray2 = jSONArray;
                    }
                } else {
                    b(string, str);
                }
            }
            i++;
            jSONArray2 = jSONArray;
        }
        return arrayList;
    }

    private void a(d dVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abc0705", new Object[]{this, dVar, str, new Integer(i), str2});
        } else if (!(dVar instanceof fhi) || !((fhi) dVar).o()) {
        } else {
            if ("0".equals(str) && i == 0) {
                fjp.a(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL, "首卡服务端下发weexurl为空", this.f11512a.h().T(), "", str2);
            } else {
                fjp.a(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_SERVER_WEEX_URL_NULL, "非首卡服务端下发weexurl为空", this.f11512a.h().T(), "", str2);
            }
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        fjp.a("recommend", fjp.ERROR_CODE_RECOMMEND_SECTION_DUPLICATE_ID, "推荐数据sectionList里面有重复的id" + str, j().T(), "", str2);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.data.net.recommend.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
        this.j = null;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdfa36d", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j() == null) {
        } else {
            j().a(j);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    public i a(fik fikVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("4ea0315f", new Object[]{this, fikVar});
        }
        String str = fikVar.h;
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1720601445) {
            if (hashCode != -1670206332) {
                if (hashCode == 1156462179 && str.equals(fik.REFRESH_FEED_DATA)) {
                    c2 = 1;
                }
            } else if (str.equals(fik.OPERATE_FEED_CACHE)) {
                c2 = 0;
            }
        } else if (str.equals(fik.OPERATE_SET_RECOMMEND_REQUEST_PARAMS)) {
            c2 = 2;
        }
        if (c2 == 0) {
            c(fikVar);
        } else if (c2 == 1) {
            b(fikVar);
        } else if (c2 == 2) {
            b(fikVar.i);
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void b(fik fikVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71f8c51", new Object[]{this, fikVar});
        } else if (fikVar == null || fikVar.i == null) {
        } else {
            fkx fkxVar = new fkx(fikVar.i);
            if (!fkxVar.a()) {
                com.taobao.android.detail.core.utils.i.a("handleFeedRefresh", "parse DetailDataManagerEvent error" + fikVar.i);
                return;
            }
            this.f11512a.h().a(fkxVar);
            g();
            h();
            a(j().f(), false);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.h.a(jSONObject.getString("bizId"), jSONObject.getJSONObject("requestParams"));
        }
    }

    private void c(fik fikVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a292d2", new Object[]{this, fikVar});
        } else if (fikVar.i == null || j() == null) {
        } else {
            String string = fikVar.i.getString("operateType");
            String string2 = fikVar.i.getString("cacheKey");
            Object obj = fikVar.i.get("cacheValue");
            if (TextUtils.equals(string, "set")) {
                j().a(string2, obj);
            } else if (TextUtils.equals(string, "get")) {
                Object d = j().d(string2);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cacheKey", (Object) string2);
                if (d != null) {
                    jSONObject2.put("cacheValue", d);
                }
                jSONObject.put("feedCacheCallback", (Object) jSONObject2);
                if (fikVar.g == null) {
                    return;
                }
                fikVar.g.a(jSONObject);
            } else if (!TextUtils.equals(string, "delete")) {
            } else {
                j().e(string2);
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        fmh fmhVar = this.l;
        if (fmhVar == null) {
            return;
        }
        fmhVar.a(z);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.c.f += i;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c.f = i;
        }
    }

    public LimitedQueue<String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LimitedQueue) ipChange.ipc$dispatch("dbed384f", new Object[]{this}) : this.c.c;
    }

    public LimitedQueue<String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LimitedQueue) ipChange.ipc$dispatch("83691210", new Object[]{this}) : this.c.e;
    }

    /* loaded from: classes5.dex */
    public static class LimitedQueue<E> extends LinkedList<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mLimit;

        static {
            kge.a(-1434664818);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object ipc$super(LimitedQueue limitedQueue, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -667118713) {
                if (hashCode != 195222152) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.add(objArr[0]));
            }
            return super.remove();
        }

        public LimitedQueue(int i) {
            this.mLimit = i;
        }

        public void resetMaxSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475db5e6", new Object[]{this, new Integer(i)});
            } else {
                this.mLimit = i;
            }
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
            }
            super.add(e);
            while (size() > this.mLimit) {
                super.remove();
            }
            return true;
        }

        public String getAppendString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2e7e5f58", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    sb.append(",");
                    sb.append(next.toString());
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(0);
            }
            return sb.toString();
        }
    }

    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue() : z ? this.c.f11673a.b : this.c.b.b;
    }

    public int c(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b849d", new Object[]{this, new Boolean(z)})).intValue() : z ? this.c.f11673a.f11517a : this.c.b.f11517a;
    }

    public int d(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad405d3c", new Object[]{this, new Boolean(z)})).intValue() : z ? this.c.f11673a.f11517a + 1 : this.c.b.f11517a + 1;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.f11673a.f11517a = -1;
        this.c.f11673a.b = false;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.c.b.f11517a = -1;
        this.c.b.b = false;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.c.f11673a.f11517a--;
            this.c.f11673a.b = false;
        } else {
            this.c.b.f11517a--;
            this.c.b.b = false;
        }
    }

    public void a(List<c.C0464c> list) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            for (c.C0464c c0464c : list) {
                if (c0464c != null && c0464c.f11590a != null && c0464c.b != null && (indexOf = this.c.c.indexOf(c0464c.f11590a.k)) >= 0 && indexOf < this.c.c.size() && indexOf < this.c.e.size()) {
                    this.m.put(c0464c.b.k, c0464c.b);
                    this.m.remove(c0464c.f11590a.k);
                    this.c.c.remove(c0464c.f11590a.k);
                    this.c.c.add(indexOf, c0464c.b.k);
                    this.c.e.remove(c0464c.f11590a.h);
                    this.c.e.add(indexOf, c0464c.b.h);
                }
            }
        }
    }

    public flo i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flo) ipChange.ipc$dispatch("4c91d0cd", new Object[]{this}) : this.n;
    }
}
