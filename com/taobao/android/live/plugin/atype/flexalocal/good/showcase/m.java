package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import java.util.HashMap;
import java.util.List;
import tb.ddw;
import tb.ecd;
import tb.fxr;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.hiu;
import tb.hkk;
import tb.kge;
import tb.kre;
import tb.pqj;
import tb.tqa;

/* loaded from: classes5.dex */
public class m extends com.taobao.android.live.plugin.atype.flexalocal.good.showcase.a implements b, com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOWCASE_SOURCE_DETAIL_DEFAULT = "detailDefault";
    public static final String SHOWCASE_SOURCE_HOLD = "hold";
    public static final String SHOWCASE_SOURCE_PM = "pm";
    public static final String SHOWCASE_SOURCE_STASH_POP = "stashpop";
    private final int h;
    private k i;
    private r j;
    private int k;
    private int l;
    private int m;
    private a n;
    private com.taobao.alilive.aliliveframework.frame.a o;
    private kre p;
    private boolean q;
    private boolean r;
    private LiveItem s;
    private final Handler t;

    /* loaded from: classes5.dex */
    public interface a {
        void a(LiveItem liveItem);
    }

    static {
        kge.a(-834996350);
        kge.a(-1905361424);
        kge.a(-608753430);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void g(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb1b020", new Object[]{this, goodMsgNew});
        }
    }

    public static /* synthetic */ k a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("dfbbeeea", new Object[]{mVar}) : mVar.i;
    }

    public static /* synthetic */ void a(m mVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882ccced", new Object[]{mVar, liveItem, str});
        } else {
            mVar.c(liveItem, str);
        }
    }

    public static /* synthetic */ void a(m mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d670a0c", new Object[]{mVar, new Boolean(z)});
        } else {
            mVar.b(z);
        }
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a b(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("2c760a9c", new Object[]{mVar}) : mVar.o;
    }

    public static /* synthetic */ void b(m mVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f8b58c", new Object[]{mVar, liveItem, str});
        } else {
            mVar.a(liveItem, str);
        }
    }

    public static /* synthetic */ void c(m mVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c49e2b", new Object[]{mVar, liveItem, str});
        } else {
            mVar.b(liveItem, str);
        }
    }

    public m(FrameLayout frameLayout, VideoInfo videoInfo, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        super(frameLayout, videoInfo, cVar);
        com.taobao.alilive.aliliveframework.frame.a aVar;
        boolean z = true;
        this.h = 1;
        this.k = 10;
        this.l = 15;
        this.m = 600;
        this.t = new Handler(Looper.getMainLooper());
        this.o = cVar.C();
        if (hir.o().booleanValue() && !hkk.b(this.o)) {
            this.p = new kre(cVar, cVar.f(), (FrameLayout) ((LinearLayout) frameLayout.getParent()).findViewById(R.id.view_hot_atmosphere), 0);
        }
        if (this.b == null || this.b.itemConfigInfo == null || this.b.itemConfigInfo.getIntValue("sabItemHitResult") != 1 || ((aVar = this.o) != null && aVar.o() != null && TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.o.o().bizCode))) {
            z = false;
        }
        this.q = z;
    }

    public void a(List<LiveItem> list, List<LiveItem> list2, com.taobao.taolive.sdk.core.b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52aacb37", new Object[]{this, list, list2, bVar, aVar});
            return;
        }
        this.n = aVar;
        c();
        if (hiq.a(this.b)) {
            this.j = new s(list2, list, this.b, this.m, this.f.c.f13839a);
        } else {
            this.j = new n(list2, this.m, this.f.c.f13839a, this.f.c.e);
        }
        a(list, bVar);
        this.f.x().a(this);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!hir.x()) {
        } else {
            this.g = z;
            if (this.g) {
                return;
            }
            b(false);
        }
    }

    public void a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1232883", new Object[]{this, liveItem});
        } else if (liveItem == null || this.i == null || liveItem.itemId != this.i.f13803a) {
        } else {
            b(liveItem);
            this.c.a(this.f13782a, liveItem, this.i);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void f(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45963181", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null) {
        } else {
            a(goodMsgNew.liveItemDO, "pm");
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void a(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30cb866", new Object[]{this, goodMsgNew});
            return;
        }
        this.j.a();
        e(goodMsgNew);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void b(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd283705", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null) {
        } else {
            a(goodMsgNew.liveItemDO, "pm");
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void b(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f80268", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        k kVar = this.i;
        if (kVar == null || kVar.b != ShowcaseType.TYPE_EXPLAININT) {
            return;
        }
        his.a("SingleGoodPlayer", "onMessageGoodHot | itemid=" + j + "   total=" + i);
        if (j != this.i.f13803a || hiq.e(this.i.c)) {
            return;
        }
        if (this.i.c.itemExtData != null) {
            int intValue = this.i.c.itemExtData.getIntValue("itemSellingTotal");
            if (intValue >= i) {
                his.a("SingleGoodPlayer", "updateItem | currTotal=" + intValue + "   total=" + i + " itemId=" + j);
                return;
            }
            this.i.c.itemExtData.put("itemSellingTotal", (Object) String.valueOf(i));
        } else {
            this.i.c.itemExtData = new JSONObject();
            this.i.c.itemExtData.put("itemSellingTotal", (Object) String.valueOf(i));
        }
        kre kreVar = this.p;
        if (kreVar != null) {
            kreVar.a(this.i.c.itemId, this.i.c.itemExtData.getIntValue("itemSellingTotal"));
        }
        if (hkk.T() && this.f != null && this.f.C() != null && this.f.C().z() != null) {
            if (i > 0) {
                z = true;
            }
            this.f.C().z().a("showHotAtmosphere", Boolean.valueOf(z));
        }
        a(this.i.c, "pm", true);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void c(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f743b5a4", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null || goodMsgNew.liveItemDO == null) {
        } else {
            this.j.a(goodMsgNew.liveItemDO);
            e(goodMsgNew);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void a(JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            long b2 = com.taobao.taolive.sdk.utils.l.b(jSONObject.getString("itemId"));
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("type");
            k kVar = this.i;
            if (kVar == null || kVar.c == null || this.i.b != ShowcaseType.TYPE_SECKILL || this.i.f13803a != b2 || !"2".equals(string) || !"secKillSellout".equals(string2) || this.i.c.extendVal == null || (b = pqj.b(this.i.c.extendVal.secKillInfo)) == null) {
                return;
            }
            b.put("status", (Object) string);
            this.i.c.extendVal.secKillInfo = b.toJSONString();
            a(this.i.c, "pm", false);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void d(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115f3443", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null) {
        } else {
            a(goodMsgNew.liveItemDO, "pm");
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void a(LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f39817", new Object[]{this, liveItem, str, str2});
            return;
        }
        a(liveItem);
        this.s = liveItem;
        ddw.a().a("com.taobao.taolive.room.hot_item_subscribe_success", new String[]{pqj.a(liveItem), str, str2}, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c.a(this.f));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Message message = new Message();
        message.what = 1;
        if (!hiq.a(this.b)) {
            i = 1;
        }
        message.arg1 = i;
        this.e.sendMessage(message);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f13782a.setVisibility(8);
        kre kreVar = this.p;
        if (kreVar != null) {
            kreVar.h();
        }
        if (!z) {
            this.j.d();
        }
        this.i = null;
        final k b = this.j.b();
        if (!z || b == null) {
            return;
        }
        if (hiq.n(b.a()) && hiq.a(this.b) && this.j.c() != null) {
            this.t.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.m.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (m.a(m.this) == null) {
                    } else {
                        m.b(m.this, b.a(), "stashpop");
                    }
                }
            }, this.j.c().delayTime * 1000);
        } else {
            a(b.a(), "stashpop");
        }
    }

    private void a(final LiveItem liveItem, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9e578d", new Object[]{this, liveItem, str});
        } else if (!this.g) {
            his.a("SingleGoodPlayer", "showProducts | showProducts=false");
        } else if (!a(this.b, liveItem, this.f)) {
        } else {
            his.a("SingleGoodPlayer", "showProducts | id=" + liveItem.itemId + " goodIndx=" + liveItem.goodsIndex + "  name=" + liveItem.itemName);
            int intValue = liveItem.itemExtData.getIntValue("itemSellingTotal");
            kre kreVar = this.p;
            if (kreVar != null) {
                kreVar.a(liveItem.itemId, intValue);
            }
            boolean z = this.i != null;
            k kVar = this.i;
            boolean z2 = kVar != null && kVar.f13803a == liveItem.itemId;
            if (!z2 && liveItem.extendVal != null && Boolean.parseBoolean(liveItem.extendVal.closePopItem)) {
                his.a("SingleGoodPlayer", "showProducts | item is filter, itemId=" + liveItem.goodsIndex);
                return;
            }
            if (hkk.P() && this.q && ((liveItem.sabItemAtmosphere != null || liveItem.sabItemAtmospherePreHeat != null) && !hkk.b(this.o))) {
                ddw.a().a("com.taobao.taolive.room.init_sab_atmosphere", liveItem);
            }
            if (hkk.ab() && liveItem.itemExtData != null && TextUtils.equals(liveItem.itemExtData.getString("smallCardItemType"), "itemZone")) {
                ad.a("new_user_zone_card_show_count", ad.b("new_user_zone_card_show_count", 0) + 1);
                ad.a("new_user_zone_card_show_time", System.currentTimeMillis());
            }
            if (!z) {
                b(liveItem, str);
                h.a(this.f13782a, null);
                ddw a2 = ddw.a();
                com.taobao.alilive.aliliveframework.frame.a aVar = this.o;
                a2.a("good.showcase.appear", null, aVar == null ? null : aVar.G());
                this.f.c(true);
                c(liveItem, str);
            } else if (z && !z2) {
                if (!a(this.i.c, liveItem)) {
                    return;
                }
                h.b(this.f13782a, new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.m.2
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
                        } else {
                            ddw.a().a(tqa.EVENT_DISMISS_SAB_ATMOSHPERE);
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                            return;
                        }
                        m.this.c.a(m.this.f13782a);
                        m.c(m.this, liveItem, str);
                        m.a(m.this, liveItem, str);
                        h.a(m.this.f13782a, null);
                    }
                });
            } else {
                a(liveItem, str, false);
                this.s = liveItem;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.m.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r6
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            r1[r2] = r3
            java.lang.String r7 = "ab8b84aa"
            r0.ipc$dispatch(r7, r1)
            return
        L1a:
            com.taobao.taolive.sdk.model.common.LiveItem r0 = r6.s
            if (r0 != 0) goto L1f
            return
        L1f:
            boolean r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q.b(r0)
            if (r0 == 0) goto L2a
            com.taobao.taolive.sdk.model.common.LiveItem r0 = r6.s
            com.taobao.taolive.sdk.model.common.LiveItem$SabItemAtmosphere r0 = r0.sabItemAtmospherePreHeat
            goto L2e
        L2a:
            com.taobao.taolive.sdk.model.common.LiveItem r0 = r6.s
            com.taobao.taolive.sdk.model.common.LiveItem$SabItemAtmosphere r0 = r0.sabItemAtmosphere
        L2e:
            if (r0 == 0) goto L95
            com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c r1 = r6.f
            if (r1 == 0) goto L95
            com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c r1 = r6.f
            boolean r1 = r1.F()
            if (r1 != 0) goto L3d
            goto L95
        L3d:
            r6.r = r7
            tb.kre r1 = r6.p
            if (r1 == 0) goto L7c
            if (r7 == 0) goto L79
            java.lang.String r7 = r0.rightType
            java.lang.String r1 = "item_soldQuantity"
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            if (r7 != 0) goto L70
            java.lang.String r7 = r0.rightType
            java.lang.String r5 = "item_rankAtmosphere"
            boolean r7 = android.text.TextUtils.equals(r7, r5)
            if (r7 != 0) goto L70
            java.lang.String r7 = r0.subRightType
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            if (r7 != 0) goto L70
            java.lang.String r7 = r0.subRightType
            boolean r7 = android.text.TextUtils.equals(r7, r5)
            if (r7 == 0) goto L6a
            goto L70
        L6a:
            tb.kre r7 = r6.p
            r7.d(r4)
            goto L7d
        L70:
            tb.kre r7 = r6.p
            r0 = 8
            r7.d(r0)
            r2 = 2
            goto L7d
        L79:
            r1.d(r4)
        L7c:
            r2 = 0
        L7d:
            com.taobao.taolive.sdk.model.common.LiveItem r7 = r6.s
            com.alibaba.fastjson.JSONObject r7 = r7.nativeConfigInfos
            if (r7 == 0) goto L90
            com.taobao.taolive.sdk.model.common.LiveItem r7 = r6.s
            com.alibaba.fastjson.JSONObject r7 = r7.nativeConfigInfos
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "sabItemAtmosphereState"
            r7.put(r1, r0)
        L90:
            com.taobao.taolive.sdk.model.common.LiveItem r7 = r6.s
            r6.a(r7)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.m.c(boolean):void");
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        final boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message == null || message.what != 1) {
        } else {
            kre kreVar = this.p;
            if (kreVar != null) {
                kreVar.h();
            }
            if (message.arg1 != 1) {
                z = true;
            }
            h.b(this.f13782a, new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.m.3
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
                    } else {
                        ddw.a().a(tqa.EVENT_DISMISS_SAB_ATMOSHPERE);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    m.this.c.a(m.this.f13782a);
                    ddw.a().a("good.showcase.disappear", null, m.b(m.this) == null ? null : m.b(m.this).G());
                    m.this.f.c(false);
                    m.a(m.this, z);
                }
            });
        }
    }

    public void e(GoodMsgNew goodMsgNew) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7ab2e2", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null || goodMsgNew.liveItemDO == null || (kVar = this.i) == null || !hiq.h(kVar.c) || goodMsgNew.liveItemDO.itemId != this.i.f13803a) {
        } else {
            a(0);
        }
    }

    private void b(LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fefe70e", new Object[]{this, liveItem, str});
            return;
        }
        b(liveItem);
        this.e.removeCallbacksAndMessages(null);
        a aVar = this.n;
        if (aVar != null) {
            aVar.a(liveItem);
        }
        this.f13782a.setVisibility(0);
        boolean a2 = hiu.a(liveItem);
        if (TextUtils.equals(str, "detailDefault") || TextUtils.equals(str, "hold")) {
            z = true;
        }
        this.j.a(liveItem, z);
        boolean h = hiq.h(liveItem);
        this.c.a(this.f13782a, liveItem);
        if (a2) {
            this.i = new k(liveItem, liveItem.itemId, ShowcaseType.TYPE_SECKILL);
            this.e.sendEmptyMessageDelayed(1, (h ? this.m : this.l) * 1000);
        } else {
            this.i = new k(liveItem, liveItem.itemId, h ? ShowcaseType.TYPE_EXPLAININT : ShowcaseType.TYPE_NORMAL);
            this.e.sendEmptyMessageDelayed(1, h ? this.m * 1000 : c(liveItem));
        }
        this.i.d = hiq.a();
    }

    private void c(LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5141768f", new Object[]{this, liveItem, str});
            return;
        }
        this.s = liveItem;
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", str);
        com.taobao.android.live.plugin.atype.flexalocal.good.track.b.a(this.f, liveItem, this.b, "", hashMap);
    }

    private void a(LiveItem liveItem, String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652d4ce7", new Object[]{this, liveItem, str, new Boolean(z)});
            return;
        }
        b(liveItem);
        boolean a2 = hiu.a(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", str);
        if (!z) {
            com.taobao.android.live.plugin.atype.flexalocal.good.track.b.a(this.f, liveItem, this.b, "", hashMap);
        }
        k kVar = this.i;
        if (TextUtils.equals(str, "detailDefault") || TextUtils.equals(str, "hold")) {
            z2 = true;
        }
        this.j.a(liveItem, z2);
        boolean h = hiq.h(liveItem);
        if (a2) {
            this.i = new k(liveItem, liveItem.itemId, ShowcaseType.TYPE_SECKILL);
            this.c.a(this.f13782a, liveItem, kVar);
            if (!z) {
                this.e.removeCallbacksAndMessages(null);
                this.e.sendEmptyMessageDelayed(1, (h ? this.m : this.l) * 1000);
            }
        } else {
            this.i = new k(liveItem, liveItem.itemId, h ? ShowcaseType.TYPE_EXPLAININT : ShowcaseType.TYPE_NORMAL);
            this.c.a(this.f13782a, liveItem, kVar);
            if (!z) {
                this.e.removeCallbacksAndMessages(null);
                this.e.sendEmptyMessageDelayed(1, h ? this.m * 1000 : c(liveItem));
            }
        }
        this.i.d = hiq.a();
    }

    private void a(List<LiveItem> list, com.taobao.taolive.sdk.core.b bVar) {
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8845ad", new Object[]{this, list, bVar});
        } else if (list == null || list.isEmpty() || (liveItem = list.get(0)) == null) {
        } else {
            String l = Long.toString(liveItem.itemId);
            his.a("SingleGoodPlayer", "checkIsNeedShow | id=" + l + "    name=" + liveItem.itemName + "  index=" + liveItem.goodsIndex);
            a(liveItem, TextUtils.equals(com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD, this.b.itemHoldType) ? SHOWCASE_SOURCE_HOLD : SHOWCASE_SOURCE_DETAIL_DEFAULT);
            if (liveItem.extendVal == null || TextUtils.isEmpty(liveItem.extendVal.msgUuid)) {
                return;
            }
            his.a("SingleGoodPlayer", "checkIsNeedShow | msgId=" + liveItem.extendVal.msgUuid);
            bVar.addItemUUid(liveItem.extendVal.msgUuid);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.g = true;
        this.i = null;
        this.n = null;
        this.s = null;
        this.q = false;
        this.r = false;
        this.f.x().b(this);
        this.c.a(this.f13782a);
        kre kreVar = this.p;
        if (kreVar != null) {
            kreVar.i();
        }
        r rVar = this.j;
        if (rVar != null) {
            rVar.d();
        }
        hiq.c();
    }

    private void b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae4644", new Object[]{this, liveItem});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.c(liveItem);
        this.d.a(this.f, liveItem, this.b, "");
        com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.a(liveItem, hiq.a());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        JSONObject parseObject = JSON.parseObject(hir.q());
        if (parseObject == null) {
            return;
        }
        if (parseObject.containsKey("normal")) {
            this.k = parseObject.getIntValue("normal");
        }
        if (parseObject.containsKey(ecd.V_EFFECT_ACTION_SECKILL)) {
            this.l = parseObject.getIntValue(ecd.V_EFFECT_ACTION_SECKILL);
        }
        if (parseObject.containsKey("speaking")) {
            this.m = parseObject.getIntValue("speaking");
        }
        his.a("SingleGoodPlayer", "initShowTime | normal=" + this.k + "  seckill=" + this.l + "    speaking=" + this.m);
    }

    public static boolean a(LiveItem liveItem, LiveItem liveItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e652ed62", new Object[]{liveItem, liveItem2})).booleanValue();
        }
        if (liveItem == null || liveItem2 == null) {
            return true;
        }
        int i = Integer.MAX_VALUE;
        if (liveItem.itemExtData != null && liveItem.itemExtData.containsKey("showPriority")) {
            i = fxr.a("showPriority", liveItem.itemExtData, Integer.MAX_VALUE);
        }
        int i2 = Integer.MIN_VALUE;
        if (liveItem2.itemExtData != null && liveItem2.itemExtData.containsKey("showPriority")) {
            i2 = fxr.a("showPriority", liveItem2.itemExtData, Integer.MIN_VALUE);
        }
        return i2 <= i;
    }

    public long c(LiveItem liveItem) {
        int i;
        r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("783963f9", new Object[]{this, liveItem})).longValue();
        }
        if (hiq.n(liveItem) && hiq.a(this.b) && (rVar = this.j) != null && rVar.c() != null && this.j.c().showTime > 0) {
            i = this.j.c().showTime;
        } else {
            i = this.k;
        }
        return i * 1000;
    }
}
