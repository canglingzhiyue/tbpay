package tb;

import android.os.Message;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseType;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.d;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.h;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.k;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.l;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.live.liveroom.good.repository.TaoLiveItemlistV2ResponseData;
import com.taobao.live.liveroom.good.showcase.model.TaoLiveShowcaseType;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.sdk.core.b;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.t;
import tb.tqg;

/* loaded from: classes5.dex */
public class tpn implements d, com.taobao.taolive.sdk.model.a, ddv, tqg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_APPEAR = "good.showcase.appear";
    public static final String EVENT_DISAPPEAR = "good.showcase.disappear";
    private tqa b;
    private FrameLayout c;
    private VideoInfo d;
    private c e;
    private a f;
    private l g;
    private b h;
    private kre i;
    private boolean j;
    private com.taobao.alilive.aliliveframework.frame.a k;
    private f l;
    private ruk<t> m;

    /* renamed from: a  reason: collision with root package name */
    private final int f34260a = 1;
    private com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b n = new com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b() { // from class: tb.tpn.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void f(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45963181", new Object[]{this, goodMsgNew});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().a(tqj.INSTANCE.c(JSON.toJSONString(goodMsgNew)));
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void a(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c30cb866", new Object[]{this, goodMsgNew});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().b(tqj.INSTANCE.c(JSON.toJSONString(goodMsgNew)));
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void b(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd283705", new Object[]{this, goodMsgNew});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().c(tqj.INSTANCE.c(JSON.toJSONString(goodMsgNew)));
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void b(long j, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f80268", new Object[]{this, new Long(j), new Integer(i)});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().a(j, i);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void g(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fb1b020", new Object[]{this, goodMsgNew});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c();
                tqj.INSTANCE.c(JSON.toJSONString(goodMsgNew));
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void c(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f743b5a4", new Object[]{this, goodMsgNew});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().d(tqj.INSTANCE.c(JSON.toJSONString(goodMsgNew)));
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().a((KMPJsonObject) jSONObject);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void d(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("115f3443", new Object[]{this, goodMsgNew});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().e(tqj.INSTANCE.c(JSON.toJSONString(goodMsgNew)));
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void a(LiveItem liveItem, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3f39817", new Object[]{this, liveItem, str, str2});
            } else if (tpn.a(tpn.this).c() == null) {
            } else {
                tpn.a(tpn.this).c().a(tqj.INSTANCE.a(JSON.toJSONString(liveItem)), str, str2);
                ddw.a().a("com.taobao.taolive.room.hot_item_subscribe_success", new String[]{pqj.a(liveItem), str, str2}, c.a(tpn.b(tpn.this)));
            }
        }
    };

    /* renamed from: tb.tpn$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34263a = new int[TaoLiveShowcaseType.values().length];

        static {
            try {
                f34263a[TaoLiveShowcaseType.TYPE_SECKILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34263a[TaoLiveShowcaseType.TYPE_EXPLAININT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34263a[TaoLiveShowcaseType.TYPE_NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(974765769);
        kge.a(-846367077);
        kge.a(1132986070);
        kge.a(191318335);
        kge.a(-1905361424);
    }

    public static /* synthetic */ tqa a(tpn tpnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqa) ipChange.ipc$dispatch("666b0e9c", new Object[]{tpnVar}) : tpnVar.b;
    }

    public static /* synthetic */ c b(tpn tpnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d5ac6376", new Object[]{tpnVar}) : tpnVar.e;
    }

    public tpn(FrameLayout frameLayout, b bVar, VideoInfo videoInfo, c cVar, EnterGoodsData enterGoodsData, LiveItem liveItem) {
        this.c = frameLayout;
        this.e = cVar;
        this.c.removeAllViews();
        this.c.clearAnimation();
        this.d = videoInfo;
        this.h = bVar;
        if (this.e == null) {
            his.b("ShowcaseControllerAdapter", "ShowcaseController | context is null.");
            return;
        }
        this.k = cVar.C();
        this.l = new f(this);
        c cVar2 = this.e;
        boolean z = false;
        if (cVar2 != null && !cVar2.k() && this.e.i() && this.e.c.f) {
            z = true;
        }
        this.g = new l(cVar, frameLayout.getContext(), z);
        k();
        l();
        this.b = new tqa(this.e.H(), tqj.INSTANCE.b(JSON.toJSONString(enterGoodsData)), tqj.INSTANCE.a(JSON.toJSONString(liveItem)), this);
        ddw.a().a(this);
        if (!com.taobao.taolive.sdk.utils.b.b() || pmd.a().u() == null || pmd.a().u().c() == null) {
            return;
        }
        Toast.makeText(pmd.a().u().c(), "命中KMP商品小卡", 1).show();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.x().a(this.n);
    }

    private void l() {
        com.taobao.alilive.aliliveframework.frame.a aVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (hir.o().booleanValue() && !hkk.b(this.k)) {
            c cVar = this.e;
            this.i = new kre(cVar, cVar.f(), (FrameLayout) ((LinearLayout) this.c.getParent()).findViewById(R.id.view_hot_atmosphere), 0);
        }
        VideoInfo videoInfo = this.d;
        if (videoInfo != null && videoInfo.itemConfigInfo != null && this.d.itemConfigInfo.getIntValue("sabItemHitResult") == 1 && ((aVar = this.k) == null || aVar.o() == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.k.o().bizCode))) {
            z = true;
        }
        this.j = z;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        tqa tqaVar = this.b;
        if (tqaVar == null) {
            return;
        }
        tqaVar.a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        tqa tqaVar = this.b;
        if (tqaVar == null) {
            return;
        }
        tqaVar.a(z);
    }

    public void a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1232883", new Object[]{this, liveItem});
        } else if (this.b == null) {
        } else {
            this.b.a(tqj.INSTANCE.a(JSON.toJSONString(liveItem)));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a(true, (a) null);
        this.f = null;
        this.c.clearAnimation();
        this.c.removeAllViews();
        this.j = false;
        tqa tqaVar = this.b;
        if (tqaVar != null) {
            tqaVar.b();
        }
        ddw.a().b(this);
        c cVar = this.e;
        if (cVar != null) {
            cVar.x().b(this.n);
        }
        f fVar = this.l;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    private void a(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341558cd", new Object[]{this, new Boolean(z), aVar});
        } else if (z && this.f == null) {
        } else {
            a aVar2 = this.f;
            String str = "-1";
            String a2 = aVar2 == null ? str : a.a(aVar2);
            if (aVar != null) {
                str = a.a(aVar);
            }
            long a3 = z ? hiq.a() : a.b(aVar);
            a aVar3 = this.f;
            long b = aVar3 == null ? -1L : a.b(aVar3);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("showCardNotifyId", a2);
            hashMap.put("hideCardNotifyId", str);
            hashMap.put("showCardTime", Long.toString(b));
            hashMap.put("hideCardTime", Long.toString(a3));
            hashMap.put("isLeave", z ? "1" : "0");
            hashMap.put("cardTime", Long.toString(a3 - b));
            his.a("ShowcaseControllerAdapter", "trackAuctionEvent | isLeave=" + z + " showCardNotifyId=" + a2 + " hideCardNotifyId=" + str + " showCardTime=" + b + " hideCardTime=" + a3);
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("GLShowcaseAuctionExclude", hashMap);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        tqa tqaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.showcase.control".equalsIgnoreCase(str)) {
            if (!(obj instanceof Map)) {
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str2 = (String) hashMap.get("liveid");
            String str3 = (String) hashMap.get("eventType");
            String str4 = (String) hashMap.get("notifyId");
            VideoInfo videoInfo = this.d;
            if (videoInfo == null || TextUtils.equals(videoInfo.liveId, str2)) {
                his.b("ShowcaseControllerAdapter", "onEvent | liveid check failed. liveId=" + str2);
                return;
            }
            his.a("ShowcaseControllerAdapter", "onEvent | eventType=" + str3);
            if (TextUtils.equals(tqa.AUCTION_CARD_SHOW, str3)) {
                this.f = new a(str3, str4);
                a(false);
            } else if (!TextUtils.equals(tqa.AUCTION_CARD_HIDE, str3)) {
            } else {
                a(true);
                a(false, new a(str3, str4));
                this.f = null;
            }
        } else if (TextUtils.equals("com.taobao.taolive.goods.showcase.close", str)) {
            a();
        } else if (TextUtils.equals("com.taobao.taolive.goods.showcase.update", str)) {
            if (!(obj instanceof LiveItem)) {
                return;
            }
            a((LiveItem) obj);
        } else if (hkk.P() && "com.taobao.taolive.room.sab_atmosphere_show".equals(str)) {
            tqa tqaVar2 = this.b;
            if (tqaVar2 == null) {
                return;
            }
            tqaVar2.b(true);
        } else if (!hkk.P() || !"com.taobao.taolive.room.sab_atmosphere_dismiss".equals(str) || (tqaVar = this.b) == null) {
        } else {
            tqaVar.b(false);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.showcase.control", "com.taobao.taolive.goods.showcase.close", "com.taobao.taolive.goods.showcase.update", "com.taobao.taolive.room.sab_atmosphere_show", "com.taobao.taolive.room.sab_atmosphere_dismiss"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        c cVar = this.e;
        if (cVar != null && cVar.C() == null) {
            return null;
        }
        return this.e.C().G();
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        c cVar = this.e;
        if (cVar != null && cVar.C() == null) {
            return null;
        }
        return this.e.C().G();
    }

    @Override // tb.tqg
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // tb.tqg
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    @Override // tb.tqg
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            h.a(this.c, null);
        }
    }

    @Override // tb.tqg
    public void a(final tqg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811635b1", new Object[]{this, aVar});
        } else {
            h.b(this.c, new Animation.AnimationListener() { // from class: tb.tpn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        return;
                    }
                    tqg.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    tqg.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.b();
                }
            });
        }
    }

    @Override // tb.tqg
    public void a(String str, com.taobao.live.liveroom.good.showcase.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63e4c2e", new Object[]{this, str, aVar});
            return;
        }
        k kVar = null;
        ShowcaseType showcaseType = null;
        if (aVar != null) {
            if (aVar.b() != null) {
                int i = AnonymousClass3.f34263a[aVar.b().ordinal()];
                if (i == 1) {
                    showcaseType = ShowcaseType.TYPE_SECKILL;
                } else if (i == 2) {
                    showcaseType = ShowcaseType.TYPE_EXPLAININT;
                } else {
                    showcaseType = ShowcaseType.TYPE_NORMAL;
                }
            }
            kVar = new k((LiveItem) pqj.a(aVar.d(), LiveItem.class), aVar.a(), showcaseType);
        }
        this.g.a(this.c, (LiveItem) pqj.a(str, LiveItem.class), kVar);
    }

    @Override // tb.tqg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.g.a(this.c, (LiveItem) pqj.a(str, LiveItem.class));
        }
    }

    @Override // tb.tqg
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.g.a(this.c);
        }
    }

    @Override // tb.tqg
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h.addItemUUid(str);
        }
    }

    @Override // tb.tqg
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        kre kreVar = this.i;
        if (kreVar == null) {
            return;
        }
        kreVar.h();
    }

    @Override // tb.tqg
    public void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        kre kreVar = this.i;
        if (kreVar == null) {
            return;
        }
        kreVar.a(j, i);
    }

    @Override // tb.tqg
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        kre kreVar = this.i;
        if (kreVar == null) {
            return;
        }
        if (z) {
            kreVar.d(0);
        } else {
            kreVar.d(8);
        }
    }

    @Override // tb.tqg
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        LiveItem liveItem = (LiveItem) pqj.a(str, LiveItem.class);
        if (hkk.P() && this.j && liveItem != null && (liveItem.sabItemAtmosphere != null || liveItem.sabItemAtmospherePreHeat != null)) {
            ddw.a().a("com.taobao.taolive.room.init_sab_atmosphere", liveItem);
        }
        if (!hkk.ab() || liveItem == null || liveItem.itemExtData == null || !TextUtils.equals(liveItem.itemExtData.getString("smallCardItemType"), "itemZone")) {
            return;
        }
        ad.a("new_user_zone_card_show_count", ad.b("new_user_zone_card_show_count", 0) + 1);
        ad.a("new_user_zone_card_show_time", System.currentTimeMillis());
    }

    @Override // tb.tqg
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            ddw.a().a(str, null, str2);
        }
    }

    @Override // tb.tqg
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.k;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    @Override // tb.tqg
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.track.b.a(this.e, (LiveItem) pqj.a(str, LiveItem.class), this.d, "", map);
        }
    }

    @Override // tb.tqg
    public List<TaoLiveItemlistV2ResponseData.ItemListv1> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        c cVar = this.e;
        if (cVar == null || cVar.x() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.e.x().c() != null && !this.e.x().c().isEmpty()) {
            for (int i = 0; i < this.e.x().c().size(); i++) {
                arrayList.add(pqj.a(JSON.toJSONString(this.e.x().c().get(i)), TaoLiveItemlistV2ResponseData.ItemListv1.class));
            }
        }
        return arrayList;
    }

    @Override // tb.tqg
    public void a(long j, ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e4be44", new Object[]{this, new Long(j), rukVar});
            return;
        }
        this.m = rukVar;
        f fVar = this.l;
        if (fVar == null) {
            return;
        }
        fVar.sendEmptyMessageDelayed(1, j);
    }

    @Override // tb.tqg
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        f fVar = this.l;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        ruk<t> rukVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message == null || message.what != 1 || (rukVar = this.m) == null) {
        } else {
            rukVar.mo2427invoke();
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f34264a;
        private String b;
        private long c;

        static {
            kge.a(-633556737);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7eeb58f7", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1fd50fe", new Object[]{aVar})).longValue() : aVar.c;
        }

        private a(String str, String str2) {
            this.f34264a = str;
            this.b = str2;
            this.c = hiq.a();
        }
    }
}
