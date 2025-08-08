package com.taobao.taolive.room.controller2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.nav.Nav;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.room.business.goodcard.GoodCardItemTppBean;
import com.taobao.taolive.room.business.goodcard.c;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.SlideMonitorFrameLayout;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.w;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.uc.webview.export.media.MessageID;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import tb.ddw;
import tb.gbg;
import tb.hjs;
import tb.kge;
import tb.pkf;
import tb.plf;
import tb.plg;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class i implements com.taobao.taolive.sdk.adapter.network.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f21595a;
    private com.taobao.taolive.sdk.controller.e b;
    private Context c;
    private plf d;
    private TBLiveRecEngineV2.RecModel e;
    private RecyclerView.ViewHolder f;
    private DXRuntimeContext g;
    private ATaoLiveOpenEntity h;
    private JSONObject i;
    private FrameLayout j;

    static {
        kge.a(-153397570);
        kge.a(-797454141);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ DXRuntimeContext a(i iVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("3c05fd8d", new Object[]{iVar, dXRuntimeContext});
        }
        iVar.g = dXRuntimeContext;
        return dXRuntimeContext;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.controller.e a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("502c729f", new Object[]{iVar}) : iVar.b;
    }

    public static /* synthetic */ String a(i iVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59d3ced", new Object[]{iVar, str}) : iVar.a(str);
    }

    public static /* synthetic */ void a(i iVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb46987", new Object[]{iVar, jSONObject});
        } else {
            iVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(i iVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06adf91", new Object[]{iVar, jSONObject, str});
        } else {
            iVar.a(jSONObject, str);
        }
    }

    public static /* synthetic */ void a(i iVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99493d", new Object[]{iVar, str, jSONObject});
        } else {
            iVar.a(str, jSONObject);
        }
    }

    public static /* synthetic */ void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ceefe8", new Object[]{iVar});
        } else {
            iVar.o();
        }
    }

    public static /* synthetic */ TBLiveRecEngineV2.RecModel c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("6f6d4fb", new Object[]{iVar}) : iVar.e;
    }

    public static /* synthetic */ Context d(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("23600f9e", new Object[]{iVar}) : iVar.c;
    }

    public static /* synthetic */ void e(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79942c05", new Object[]{iVar});
        } else {
            iVar.q();
        }
    }

    public static /* synthetic */ FrameLayout f(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("f9e934f5", new Object[]{iVar}) : iVar.j;
    }

    public void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof SlideMonitorFrameLayout)) {
        } else {
            this.f21595a = (FrameLayout) view;
            this.c = view.getContext();
            ((SlideMonitorFrameLayout) view).setSlideListener(new SlideMonitorFrameLayout.a() { // from class: com.taobao.taolive.room.controller2.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.ui.SlideMonitorFrameLayout.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (!(view.getContext() instanceof Activity) || !w.a(i.a(i.this))) {
                    } else {
                        ((Activity) view.getContext()).finish();
                        com.taobao.taolive.sdk.utils.q.a("TaoLiveGoodCardController", "onLeftSlideListener finish activity");
                    }
                }
            });
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.d = new plf() { // from class: com.taobao.taolive.room.controller2.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.plf
            public void a(String str, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                } else if ("com.taobao.taolive.room.recommend.good.card.update".equals(str)) {
                    if (!(obj instanceof DXRuntimeContext)) {
                        return;
                    }
                    i.a(i.this, (DXRuntimeContext) obj);
                    i.b(i.this);
                } else if (!"com.taobao.taolive.room.good.card.subscribe".equals(str) || !(obj instanceof JSONObject)) {
                } else {
                    i.a(i.this, (JSONObject) obj);
                }
            }
        };
        plg.a().a(this.d);
        ddw.a().a("com.taobao.taolive.room.recommend.good.card.did.appear", null, null);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        plg.a().b(this.d);
        ddw.a().a("com.taobao.taolive.room.recommend.good.card.did.disappear", null, null);
    }

    public void a(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{this, eVar});
            return;
        }
        this.b = eVar;
        if (eVar == null || !(eVar.f() instanceof ATaoLiveOpenEntity)) {
            return;
        }
        this.h = (ATaoLiveOpenEntity) eVar.f();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onWillAppear");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onWillDisappear");
        }
    }

    public void a(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b29f74", new Object[]{this, recModel});
            return;
        }
        this.e = recModel;
        com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onBindView");
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = null;
        if (recModel != null && recModel.recommendCardInfo != null) {
            recommendCardInfo = recModel.recommendCardInfo;
        } else if (recModel != null && recModel.reserveItemCardInfo != null && recModel.reserveItemCardInfo.cardInfo != null) {
            recommendCardInfo = recModel.reserveItemCardInfo.cardInfo;
        }
        if (recommendCardInfo == null) {
            return;
        }
        a(recommendCardInfo.dxTemplateName, recommendCardInfo.dxData);
    }

    private void a(String str, JSONObject jSONObject) {
        pkf a2;
        Float aR_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        int max = Math.max(com.taobao.taolive.room.c.b, com.taobao.taolive.room.c.c);
        int f = com.taobao.taolive.room.utils.d.f();
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.h;
        if (aTaoLiveOpenEntity != null && aTaoLiveOpenEntity.uiCompontent != null && (a2 = this.h.uiCompontent.a()) != null && (aR_ = a2.aR_()) != null && aR_.floatValue() > 0.0f) {
            max = aR_.intValue();
        }
        if (jSONObject != null) {
            jSONObject.put("topOffset", (Object) String.valueOf(gbg.c(this.c, max)));
            jSONObject.put("height", (Object) String.valueOf(gbg.c(this.c, f) + 200));
        }
        DXRootView a3 = com.taobao.taolive.room.dx.b.c().a(this.c, str);
        if (a3 != null && jSONObject != null) {
            this.i = jSONObject;
            com.taobao.taolive.room.dx.b.c().a(a3, (JSONObject) jSONObject.clone());
        }
        FrameLayout frameLayout = this.f21595a;
        if (frameLayout == null || a3 == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f21595a.addView(a3, new ViewGroup.LayoutParams(-1, -1));
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        l();
        n();
        p();
        com.taobao.taolive.sdk.controller.e eVar = this.b;
        if (eVar instanceof c) {
            if (RecModel.MEDIA_TYPE_TIMEMOVE.equals(((c) eVar).f)) {
                HashMap hashMap = new HashMap();
                hashMap.put("direction", "goodCard");
                if (pmd.a().e() != null) {
                    pmd.a().e().a("Page_TaobaoLiveWatch", "jiangjie_slide", hashMap);
                }
            }
            ((c) this.b).f = "goodCard";
        }
        if (com.taobao.taolive.room.utils.n.a() != null) {
            com.taobao.taolive.room.utils.n.a().h(true);
        }
        com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onDidAppear");
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.h;
        if (aTaoLiveOpenEntity == null || this.i == null) {
            return;
        }
        aTaoLiveOpenEntity.accessListener(AccessListenerEnum.onRecieveDetailResponse, this.i);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        TBLiveRecEngineV2.RecModel recModel = this.e;
        if (recModel != null && recModel.recommendCardInfo != null) {
            LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.e.recommendCardInfo;
            c(recommendCardInfo);
            b(recommendCardInfo);
            a(recommendCardInfo);
            return;
        }
        TBLiveRecEngineV2.RecModel recModel2 = this.e;
        if (recModel2 == null || recModel2.reserveItemCardInfo == null || this.e.reserveItemCardInfo.cardInfo == null) {
            return;
        }
        e(this.e.reserveItemCardInfo.cardInfo);
        d(this.e.reserveItemCardInfo.cardInfo);
    }

    private void a(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7c43eb", new Object[]{this, recommendCardInfo});
        } else if (recommendCardInfo != null && recommendCardInfo.dxData != null && recommendCardInfo.dxData.containsKey("goodsList") && (jSONArray = recommendCardInfo.dxData.getJSONArray("goodsList")) != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String string = jSONObject.getString("itemId");
                    String string2 = jSONObject.getString("type");
                    String string3 = jSONObject.getString("eventId");
                    String string4 = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemid", string);
                    a(string, string4);
                    hashMap.put("type", string2);
                    hashMap.put(UserTrackDO.COLUMN_EVENT_ID, string3);
                    hashMap.put("spm-cnt", ai.d(com.taobao.taolive.room.utils.n.a()));
                    hashMap.put("spm-url", poy.K(com.taobao.taolive.room.utils.n.a()));
                    if (pmd.a().e() != null) {
                        pmd.a().e().b("Page_TaobaoLiveWatch", "carditem_expo", hashMap);
                    }
                }
            }
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        GoodCardItemTppBean goodCardItemTppBean = new GoodCardItemTppBean();
        goodCardItemTppBean.liveId = str2;
        goodCardItemTppBean.enter = String.valueOf(System.currentTimeMillis());
        goodCardItemTppBean.itemId = str;
        com.taobao.taolive.sdk.controller.e eVar = this.b;
        if (!(eVar instanceof c)) {
            return;
        }
        ((c) eVar).t_.add(goodCardItemTppBean);
    }

    private void b(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d127a06c", new Object[]{this, recommendCardInfo});
            return;
        }
        HashMap hashMap = new HashMap();
        if (recommendCardInfo != null && recommendCardInfo.dxData != null) {
            hashMap.put("type", recommendCardInfo.dxData.getString("bottomType"));
            hashMap.put("spm-cnt", ai.d(com.taobao.taolive.room.utils.n.a()));
            hashMap.put("spm-url", poy.K(com.taobao.taolive.room.utils.n.a()));
        }
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().b("Page_TaobaoLiveWatch", "cardbottombtn_expo", hashMap);
    }

    private HashMap<String, String> c(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d2e3b110", new Object[]{this, recommendCardInfo});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (recommendCardInfo != null && recommendCardInfo.dxData != null) {
            int i = -1;
            RecyclerView.ViewHolder viewHolder = this.f;
            if (viewHolder != null) {
                i = viewHolder.getLayoutPosition();
            }
            hashMap.put("position", String.valueOf(i));
            hashMap.put("type", StringUtils.isEmpty(recommendCardInfo.dxData.getString("bizType")) ? "1" : recommendCardInfo.dxData.getString("bizType"));
            hashMap.put("spm-cnt", ai.d(com.taobao.taolive.room.utils.n.a()));
            hashMap.put("spm-url", poy.K(com.taobao.taolive.room.utils.n.a()));
        }
        if (pmd.a().e() != null) {
            pmd.a().e().b("Page_TaobaoLiveWatch", "itemflowcard_expo", hashMap);
        }
        return hashMap;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        m();
        if (com.taobao.taolive.room.utils.n.a() != null) {
            com.taobao.taolive.room.utils.n.a().h(false);
        }
        com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onDidDisappear");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onPause");
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onStart");
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onResume");
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", MessageID.onStop);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(null);
        }
        com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", MessageID.onDestroy);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", "onScrollStateChanged newState:" + i);
    }

    public void a(TaoLiveGoodCardVH taoLiveGoodCardVH) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c35b565", new Object[]{this, taoLiveGoodCardVH});
        } else {
            this.f = taoLiveGoodCardVH;
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.business.goodcard.a aVar = new com.taobao.taolive.room.business.goodcard.a(this);
        com.taobao.taolive.sdk.controller.e eVar = this.b;
        if (!(eVar instanceof c)) {
            return;
        }
        aVar.a(((c) eVar).d);
    }

    private void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if ("2".equals(jSONObject.getString("subscribeStatus"))) {
            Nav.from(this.c).toUri(jSONObject.getString("jumpUrl"));
        } else if ("1".equals(jSONObject.getString("subscribeStatus"))) {
            com.taobao.taolive.sdk.utils.w.a(this.c, "你已经预约过啦");
            a(jSONObject, "yiyuyue");
        } else {
            new com.taobao.taolive.room.business.goodcard.c().a(this.c, jSONObject.getString("eventId"), this.e.accountId, jSONObject, new c.a() { // from class: com.taobao.taolive.room.controller2.i.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.business.goodcard.c.a
                public void a(org.json.JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject2});
                    } else if (i.c(i.this) == null || i.c(i.this).reserveItemCardInfo == null || i.c(i.this).reserveItemCardInfo.cardInfo == null || i.c(i.this).reserveItemCardInfo.cardInfo.dxData == null || StringUtils.isEmpty(i.c(i.this).reserveItemCardInfo.cardInfo.dxTemplateName)) {
                    } else {
                        try {
                            JSONObject jSONObject3 = i.c(i.this).reserveItemCardInfo.cardInfo.dxData;
                            if (jSONObject3.getJSONArray("goodsList") != null) {
                                JSONArray jSONArray = jSONObject3.getJSONArray("goodsList");
                                if (jSONArray.size() > 0) {
                                    Iterator<Object> it = jSONArray.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        if (next instanceof JSONObject) {
                                            String string = ((JSONObject) next).getString("eventId");
                                            String string2 = jSONObject2.getString("activityDetailId");
                                            String string3 = jSONObject2.getString("hasSubsidy");
                                            String string4 = jSONObject2.getString("amount");
                                            if (string != null && string2 != null && string2.equals(string) && "true".equals(string3) && !StringUtils.isEmpty(string4)) {
                                                ((JSONObject) next).put("customizedItemRights", (Object) String.format("下单立减%s元", i.a(i.this, jSONObject2.getString("amount"))));
                                                ((JSONObject) next).put("subscribeStatus", (Object) "1");
                                                ((JSONObject) next).put("subscribeLabel", (Object) "已预约");
                                            }
                                        }
                                    }
                                }
                            }
                            i.a(i.this, i.c(i.this).reserveItemCardInfo.cardInfo.dxTemplateName, jSONObject3);
                            JSONObject parseObject = JSONObject.parseObject(jSONObject2.toString());
                            if (parseObject.containsKey("amount")) {
                                parseObject.put("amount", (Object) i.a(i.this, parseObject.getString("amount")));
                            }
                            if (parseObject == null) {
                                return;
                            }
                            i.this.a(i.d(i.this), parseObject);
                            i.a(i.this, jSONObject, "succ");
                        } catch (Throwable th) {
                            com.taobao.taolive.sdk.utils.q.b("TaoLiveGoodCardController", th.getMessage());
                        }
                    }
                }

                @Override // com.taobao.taolive.room.business.goodcard.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        i.a(i.this, jSONObject, "fail");
                    }
                }
            });
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : StringUtils.isEmpty(str) ? "0" : BigDecimal.valueOf(Integer.parseInt(str)).divide(BigDecimal.valueOf(100.0d)).stripTrailingZeros().toPlainString();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo != null && (netBaseOutDo.mo1437getData() instanceof LiveDetailMessinfoResponseData.RecommendCardInfo)) {
            LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = (LiveDetailMessinfoResponseData.RecommendCardInfo) netBaseOutDo.mo1437getData();
            int max = Math.max(com.taobao.taolive.room.c.b, com.taobao.taolive.room.c.c);
            int f2 = com.taobao.taolive.room.utils.d.f();
            Context context = null;
            DXRuntimeContext dXRuntimeContext = this.g;
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.m();
            }
            if (recommendCardInfo != null && context != null) {
                JSONObject jSONObject = recommendCardInfo.dxData;
                if (jSONObject == null) {
                    if (!com.taobao.taolive.room.utils.d.a()) {
                        return;
                    }
                    com.taobao.taolive.sdk.utils.w.a(this.c, "没有更多商品");
                    return;
                }
                if (jSONObject != null) {
                    jSONObject.put("topOffset", (Object) String.valueOf(gbg.c(context, max)));
                    jSONObject.put("height", (Object) String.valueOf(gbg.c(context, f2) + 200));
                    ab.b("TaoLiveGoodCardController", "height:" + String.valueOf(gbg.c(context, f)));
                }
                JSONArray jSONArray = jSONObject.getJSONArray("goodsList");
                if (jSONArray != null && jSONArray.size() > 0) {
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        Object obj2 = jSONArray.get(i2);
                        if (obj2 instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) obj2;
                            a(jSONObject2.getString("itemId"), jSONObject2.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID));
                        }
                    }
                }
            }
            if (this.g != null && recommendCardInfo != null) {
                com.taobao.taolive.room.dx.b.c().a(this.g.s(), recommendCardInfo.dxData);
            }
            p();
            a(recommendCardInfo);
        }
    }

    private void p() {
        com.taobao.taolive.sdk.controller.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.controller.e eVar2 = this.b;
        if (!(eVar2 instanceof c) || ((c) eVar2).e == null || (eVar = this.b) == null || ((c) eVar).t_ == null || ((c) this.b).t_.size() <= 0) {
            return;
        }
        ((c) this.b).e.put(hjs.UNDER_TAKE_GOODS_LIST, JSONObject.toJSONString(((c) this.b).t_));
        com.taobao.taolive.sdk.controller.e eVar3 = this.b;
        ((c) eVar3).d = JSON.toJSONString(((c) eVar3).e);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            com.taobao.taolive.sdk.utils.w.a(this.c, "网络出小差了");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            com.taobao.taolive.sdk.utils.w.a(this.c, "网络出小差了");
        }
    }

    public void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONObject("displayInfo") == null || StringUtils.isEmpty(jSONObject.getJSONObject("displayInfo").getString("dxName"))) {
        } else {
            DXRootView a2 = com.taobao.taolive.room.dx.b.c().a(context, jSONObject.getJSONObject("displayInfo").getString("dxName"));
            if (a2 != null) {
                com.taobao.taolive.room.dx.b.c().a(a2, jSONObject);
            }
            this.j = new FrameLayout(this.c);
            if (this.f21595a != null && a2 != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, android.taobao.windvane.util.c.a(228.0f));
                layoutParams.gravity = 80;
                this.j.addView(a2);
                this.f21595a.removeView(this.j);
                this.f21595a.addView(this.j, layoutParams);
            }
            this.j.setVisibility(0);
            this.j.animate().translationY(0.0f).setDuration(300L).start();
            this.j.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.controller2.i.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.e(i.this);
                    }
                }
            }, 3000L);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "translationY", frameLayout.getHeight());
        ofFloat.setDuration(300L);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.taolive.room.controller2.i.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    i.f(i.this).setVisibility(8);
                }
            }
        });
        ofFloat.start();
    }

    private void d(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7e596e", new Object[]{this, recommendCardInfo});
            return;
        }
        HashMap hashMap = new HashMap();
        if (recommendCardInfo != null && recommendCardInfo.dxData != null) {
            hashMap.put("item_type", StringUtils.isEmpty(recommendCardInfo.dxData.getString("bizType")) ? "default" : recommendCardInfo.dxData.getString("bizType"));
            hashMap.put("spm-cnt", ai.d(com.taobao.taolive.room.utils.n.a()));
            hashMap.put("spm-url", poy.K(com.taobao.taolive.room.utils.n.a()));
        }
        ai.a(com.taobao.taolive.room.utils.n.a(), "Show-page_guideCard", (HashMap<String, String>) hashMap);
    }

    private void e(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8229b5ef", new Object[]{this, recommendCardInfo});
        } else if (recommendCardInfo != null && recommendCardInfo.dxData != null && recommendCardInfo.dxData.containsKey("goodsList") && (jSONArray = recommendCardInfo.dxData.getJSONArray("goodsList")) != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String string = jSONObject.getString("itemId");
                    String string2 = StringUtils.isEmpty(recommendCardInfo.dxData.getString("bizType")) ? "default" : recommendCardInfo.dxData.getString("bizType");
                    String string3 = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                    String string4 = jSONObject.getString("anchorId");
                    String string5 = jSONObject.getString("subscribeStatus");
                    HashMap hashMap = new HashMap();
                    hashMap.put("item_id", string);
                    hashMap.put("item_type", string2);
                    hashMap.put("item_status", string5);
                    hashMap.put("feed_id", string3);
                    hashMap.put("account_id", string4);
                    hashMap.put("spm-cnt", ai.d(com.taobao.taolive.room.utils.n.a()));
                    hashMap.put("spm-url", poy.K(com.taobao.taolive.room.utils.n.a()));
                    ai.a(com.taobao.taolive.room.utils.n.a(), "Show-guideItem", (HashMap<String, String>) hashMap);
                }
            }
        }
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("itemId");
            String string2 = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            String string3 = jSONObject.getString("anchorId");
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", string);
            TBLiveRecEngineV2.RecModel recModel = this.e;
            if (recModel != null && recModel.reserveItemCardInfo != null && this.e.reserveItemCardInfo.cardInfo != null && this.e.reserveItemCardInfo.cardInfo.dxData != null) {
                hashMap.put("item_type", this.e.reserveItemCardInfo.cardInfo.dxData.getString("bizType"));
            }
            hashMap.put("clickSource", "1");
            hashMap.put("feed_id", string2);
            hashMap.put("account_id", string3);
            hashMap.put("pop_status", str);
            hashMap.put("spm-cnt", ai.d(com.taobao.taolive.room.utils.n.a()));
            hashMap.put("spm-url", poy.K(com.taobao.taolive.room.utils.n.a()));
            ai.a(com.taobao.taolive.room.utils.n.a(), "Show-reservationPop", (HashMap<String, String>) hashMap);
        }
    }
}
