package com.taobao.taolive.room.ui.fanslevel;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MoreFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.android.live.plugin.proxy.reward.IRewardProxy;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.al;
import com.taobao.taolive.room.utils.am;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.q;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.core.j;
import com.taobao.tbliveinteractive.container.h5.e;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.phq;
import tb.pht;
import tb.plk;
import tb.plx;
import tb.pmd;
import tb.pnk;
import tb.pol;
import tb.pqj;
import tb.qnb;
import tb.tqa;
import tb.xkw;

/* loaded from: classes8.dex */
public class b implements com.taobao.tbliveinteractive.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21709a;
    private Context b;
    private com.taobao.alilive.aliliveframework.frame.a c;
    private IRewardProxy.a d;
    public String e;

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0b1b1b", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea29ab9", new Object[]{bVar, str, str2, str3});
        } else {
            bVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ Context b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("25a02894", new Object[]{bVar}) : bVar.b;
    }

    static {
        kge.a(-1831100675);
        kge.a(-270434435);
        f21709a = b.class.getSimpleName();
    }

    public b(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.e = null;
        this.b = context;
        this.c = aVar;
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.c;
        if (aVar2 != null) {
            this.e = aVar2.G();
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.taobao.tbliveinteractive.jsbridge.a
    public Boolean a(IWVWebView iWVWebView, String str, String str2, final e eVar) {
        char c;
        JSONObject b;
        pht q;
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d236b1f3", new Object[]{this, iWVWebView, str, str2, eVar});
        }
        switch (str.hashCode()) {
            case -1810455735:
                if (str.equals("joinFansClubNotify")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1778565890:
                if (str.equals("openAnchorPageCard")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1778223639:
                if (str.equals("showFarmGuide")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1620712196:
                if (str.equals("addPanelIcon")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -951156885:
                if (str.equals("openRewardPanel")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -772859263:
                if (str.equals("auctionFetchData")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -768879098:
                if (str.equals("openInsideDetailPage")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -650981635:
                if (str.equals("closeRewardPanel")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -430146909:
                if (str.equals("openNewUserPanel")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -238051800:
                if (str.equals("isRewardPanelShow")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -180090468:
                if (str.equals("sendComments")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 165243968:
                if (str.equals("auctionEventNotify")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 222710944:
                if (str.equals("addShareConfig")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 252820411:
                if (str.equals("checkResourceFileIsExist")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 331048772:
                if (str.equals("installWidgetSuccess")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 573961180:
                if (str.equals("isRewardEnable")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 628790393:
                if (str.equals("removePanelIcon")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 963853882:
                if (str.equals("refreshRewardPanel")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 970788705:
                if (str.equals("getMuteStatus")) {
                    c = JSONLexer.EOI;
                    break;
                }
                c = 65535;
                break;
            case 1087326811:
                if (str.equals("aliveLayerHeightChange")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1215347749:
                if (str.equals("resourcePrefetch")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1321206772:
                if (str.equals("sendLocalGiftMessage")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1580155909:
                if (str.equals("getSJSDPopStatus")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1623533838:
                if (str.equals("getScreenOrientation")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1626149085:
                if (str.equals("removeShareConfig")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1804502712:
                if (str.equals("sendRechargeMessage")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1844430880:
                if (str.equals("onRewardPanelOpen")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1914927727:
                if (str.equals("openWidgetInstallGuide")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                g b2 = n.b(this.c);
                if (b2 != null && b2.F != null) {
                    z = b2.F.g();
                }
                jSONObject.put("hasWYSIWYG", (Object) Boolean.valueOf(z));
                eVar.a(jSONObject.toJSONString());
                return true;
            case 1:
                Map<String, String> c2 = q.c(str2);
                HashMap hashMap = new HashMap();
                if (c2.containsKey("data")) {
                    String str3 = c2.get("data");
                    if (!TextUtils.isEmpty(str3) && (b = pqj.b(str3)) != null) {
                        hashMap.put("popviewTransParam", b.get("popviewTransParam"));
                    }
                }
                ddw.a().a(IRecommendPopProxy.EventType_SHOW_POPVIEW, hashMap, this.e);
                eVar.a();
                return true;
            case 2:
                ddw.a().a("com.taolive.taolive.room.mediaplatform_addShareConfig", q.c(str2), this.e);
                eVar.a();
                return true;
            case 3:
                ddw.a().a("com.taolive.taolive.room.mediaplatform_removeShareConfig", q.c(str2), this.e);
                eVar.a();
                return true;
            case 4:
                ddw.a().a("com.taolive.taolive.room.mediaplatform_addPanelIcon", qnb.a(str2), this.e);
                eVar.a();
                return true;
            case 5:
                ddw.a().a(MoreFrame.EVENT_MEDIAPLATFORM_REMOVE_PANEL_ICON, qnb.a(str2), this.e);
                eVar.a();
                return true;
            case 6:
                ddw.a().a("taolive.showFarmGuide", str2, this.e);
                eVar.a();
                return true;
            case 7:
                ddw.a().a(xkw.EVENT_SEND_GIFT, str2, this.e);
                return true;
            case '\b':
                ddw.a().a(xkw.EVENT_JOIN_FANS_CLUB_NOTIFY_EVENT, str2, this.e);
                return true;
            case '\t':
                try {
                } catch (Throwable th) {
                    m.e("openInsideDetailPage", th.getMessage());
                }
                if (TextUtils.isEmpty(str2)) {
                    m.e("openInsideDetailPage", "params is null");
                    return false;
                }
                JSONObject parseObject = JSON.parseObject(str2);
                if (parseObject == null) {
                    m.e("openInsideDetailPage", "jsonObject is null");
                    return false;
                }
                ddw.a().a(xkw.OPEN_INSIDE_DETAIL_EVENT, parseObject, this.e);
                return true;
            case '\n':
                ddw.a().a(xkw.EVENT_PREFETCH_GIFT_RESOURCE, str2, this.e);
                return true;
            case 11:
                try {
                    JSONObject parseObject2 = JSON.parseObject(str2);
                    String str4 = (String) parseObject2.get("url");
                    String str5 = "";
                    if (am.a() && f.x().enableMD5FileCheck()) {
                        str5 = (String) parseObject2.get("md5");
                    }
                    if (!al.a(this.b, str4, str5) || !am.a() || !f.x().enablePresaleScreenGift()) {
                        z2 = false;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) Boolean.valueOf(z2));
                    eVar.a(jSONObject2.toString());
                } catch (Exception e) {
                    m.b("checkResourceFileIsExist", e.getMessage());
                }
                return true;
            case '\f':
                try {
                } catch (Throwable th2) {
                    m.e("aliveLayerHeightChange", th2.getMessage());
                }
                if (TextUtils.isEmpty(str2)) {
                    m.e("aliveLayerHeightChange", "params is null");
                    return false;
                }
                JSONObject parseObject3 = JSON.parseObject(str2);
                if (parseObject3 == null) {
                    m.e("aliveLayerHeightChange", "jsonObject is null");
                    return false;
                }
                if ("alivemodx-reward-gift-vote".equals((String) parseObject3.get("componentName"))) {
                    int intValue = parseObject3.getIntValue("height");
                    if (am.a()) {
                        f.x().adjustSmallHeightInAliveScene(intValue);
                    }
                }
                return true;
            case '\r':
                Map<String, String> c3 = q.c(str2);
                if (str2 == null || !c3.containsKey("eventType")) {
                    return false;
                }
                String str6 = c3.get("eventType");
                if (!TextUtils.equals(tqa.AUCTION_CARD_SHOW, str6) && !TextUtils.equals(tqa.AUCTION_CARD_HIDE, str6)) {
                    return false;
                }
                ddw.a().a("com.taobao.taolive.showcase.control", c3, this.e);
                return true;
            case 14:
                Map<String, String> c4 = q.c(str2);
                if (c4 == null || c4.isEmpty()) {
                    eVar.b();
                    return false;
                } else if ("fetchBottomPosition".equals(c4.get("dataType"))) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("left", (Object) Integer.valueOf(f.k().getBottomBarLeftDP()));
                    int bottomBarBottomDP = f.k().getBottomBarBottomDP();
                    if (bottomBarBottomDP <= 0) {
                        bottomBarBottomDP = 66;
                    }
                    jSONObject4.put("bottom", (Object) Integer.valueOf(bottomBarBottomDP));
                    jSONObject3.put("data", (Object) jSONObject4);
                    eVar.a(jSONObject3.toJSONString());
                    return true;
                } else {
                    eVar.b();
                    return false;
                }
            case 15:
                JSONObject jSONObject5 = new JSONObject();
                Context context = this.b;
                jSONObject5.put(aw.PARAM_SCREEN_ORIENTATION, (Object) ((!(context instanceof Activity) || ((Activity) context).getRequestedOrientation() != 0) ? "portrait" : "landscape"));
                eVar.a(jSONObject5.toJSONString());
                return true;
            case 16:
                a(this.b, str2, new IRewardProxy.b() { // from class: com.taobao.taolive.room.ui.fanslevel.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.reward.IRewardProxy.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        b.a(b.this);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("status", (Object) "0");
                        eVar.a(jSONObject6.toJSONString());
                    }

                    @Override // com.taobao.android.live.plugin.proxy.reward.IRewardProxy.b
                    public void a(String str7, String str8, String str9) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("929ad046", new Object[]{this, str7, str8, str9});
                            return;
                        }
                        b.a(b.this, str7, str8, str9);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("status", (Object) str8);
                        jSONObject6.put("errMsg", (Object) str9);
                        jSONObject6.put("step", (Object) str7);
                        eVar.b(jSONObject6.toJSONString());
                    }
                });
                return true;
            case 17:
                b(str2, eVar);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("result", (Object) true);
                eVar.a(jSONObject6.toJSONString());
                return true;
            case 18:
            case 19:
                a(str2, eVar);
                return true;
            case 20:
                c(str2, eVar);
                return true;
            case 21:
                boolean isRewardEnable = f.l().isRewardEnable(j.c(this.c), this.c);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("result", (Object) Boolean.valueOf(isRewardEnable));
                eVar.a(jSONObject7.toJSONString());
                return true;
            case 22:
                b(str2);
                break;
            case 23:
                break;
            case 24:
                ddw.a().a("com.taobao.taolive.room.avatar_card_show", str2, this.e);
                return true;
            case 25:
                ddw.a().a("com.taobao.taolive.room.install_widget_success", str2, this.e);
                return true;
            case 26:
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("muteKey", (Object) "initMuteStatus");
                jSONObject8.put("isMuted", (Object) Boolean.valueOf(n.a().M().b()));
                eVar.a(jSONObject8.toJSONString());
                return true;
            case 27:
                ddw.a().a(xkw.EVENT_OPEN_WIDGET_INSTALL_GUIDE, str2, this.e);
                return true;
            default:
                com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
                ai.a(aVar, "runExternalApi", "action=" + str);
                return null;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.c;
        if ((aVar2 instanceof phq) && (q = ((phq) aVar2).q()) != null) {
            z = q.isPanelShowing();
        }
        JSONObject jSONObject9 = new JSONObject();
        jSONObject9.put("isRewardPanelShow", (Object) Boolean.valueOf(z));
        eVar.a(jSONObject9.toJSONString());
        return true;
    }

    private void a(Context context, String str, IRewardProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfca2d52", new Object[]{this, context, str, bVar});
            return;
        }
        if (this.d == null) {
            this.d = f.l().createRecharge();
        }
        this.d.a((Activity) context, str, bVar);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.taolive.room.ui.fanslevel.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        plk.a(b.b(b.this), "充值成功");
                    }
                }
            });
        }
    }

    private void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.taolive.room.ui.fanslevel.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str4;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (TextUtils.equals(str, IRewardProxy.b.STEP_H5CALL)) {
                        str4 = "参数异常";
                    } else if (TextUtils.equals(str, IRewardProxy.b.STEP_CREATE_ORDER)) {
                        str4 = !TextUtils.isEmpty(str3) ? str3 : "创建订单失败";
                    } else if (TextUtils.equals(str, IRewardProxy.b.STEP_RECHARGE)) {
                        str4 = "充值失败（" + str2 + "）";
                    } else {
                        str4 = "";
                    }
                    plk.a(b.b(b.this), str4);
                }
            });
        }
    }

    private void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d1eca24", new Object[]{this, str, eVar});
            return;
        }
        boolean isRewardEnable = f.l().isRewardEnable(j.c(this.c), this.c);
        if (isRewardEnable) {
            a(str);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", (Object) Boolean.valueOf(isRewardEnable));
        eVar.a(jSONObject.toJSONString());
        Map<String, String> c = q.c(str);
        String str2 = c.get("source");
        pol e = pmd.a().e();
        if (e == null || TextUtils.isEmpty(str2)) {
            return;
        }
        HashMap hashMap = new HashMap(c);
        hashMap.put("result", isRewardEnable ? "success" : "fail");
        e.a("Page_TaobaoLiveWatch", "onRewardPanelOpen", hashMap);
    }

    private void b(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98cc683", new Object[]{this, str, eVar});
        } else {
            this.c.e().a(xkw.EVENT_HIDE_REWARD_PANEL, null, this.e);
        }
    }

    private void c(final String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fac2e2", new Object[]{this, str, eVar});
            return;
        }
        pnk q = pmd.a().q();
        if (q != null) {
            if (!q.c()) {
                q.a((Activity) this.b, new pnk.a() { // from class: com.taobao.taolive.room.ui.fanslevel.b.4
                });
                return;
            } else {
                this.c.e().a(xkw.EVENT_REFRESH_REWARD_PANEL, str, this.e);
                return;
            }
        }
        plx.b(f21709a, "loginAdapter null");
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        pnk q = pmd.a().q();
        if (q != null) {
            if (!q.c()) {
                q.a((Activity) this.b, new pnk.a() { // from class: com.taobao.taolive.room.ui.fanslevel.b.5
                });
                return;
            } else {
                this.c.e().a(xkw.EVENT_SHOW_REWARD_PANEL, str, this.e);
                return;
            }
        }
        plx.b(f21709a, "loginAdapter null");
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c.e().a(xkw.EVENT_SEND_COMMENT, pqj.b(str), this.e);
        }
    }
}
