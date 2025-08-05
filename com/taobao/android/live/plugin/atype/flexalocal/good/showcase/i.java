package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.m;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.hiq;
import tb.his;
import tb.hkk;
import tb.kge;
import tb.tqa;

/* loaded from: classes5.dex */
public class i implements d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_APPEAR = "good.showcase.appear";
    public static final String EVENT_DISAPPEAR = "good.showcase.disappear";

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f13798a;
    private VideoInfo b;
    private f c;
    private m d;
    private a e;
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c f;
    private p g;

    static {
        kge.a(-2095444155);
        kge.a(1132986070);
        kge.a(191318335);
    }

    public static /* synthetic */ f a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6e03fcd3", new Object[]{iVar}) : iVar.c;
    }

    public i(FrameLayout frameLayout, com.taobao.taolive.sdk.core.b bVar, VideoInfo videoInfo, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, EnterGoodsData enterGoodsData, LiveItem liveItem) {
        this.f13798a = frameLayout;
        this.f = cVar;
        this.f13798a.removeAllViews();
        this.f13798a.clearAnimation();
        this.b = videoInfo;
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar2 = this.f;
        if (cVar2 == null) {
            his.b("ShowcaseControllerCommon", "ShowcaseController | context is null.");
            return;
        }
        if (cVar2 != null && cVar2.k() && liveItem != null) {
            this.g = new p(this.f13798a, this.b, cVar);
            this.g.a(liveItem, bVar);
        } else {
            this.c = new f(this.f13798a, this.b, cVar);
            this.c.b();
            m.a aVar = new m.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.m.a
                public void a(LiveItem liveItem2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f1232883", new Object[]{this, liveItem2});
                    } else if (i.a(i.this) == null) {
                    } else {
                        i.a(i.this).a(false);
                    }
                }
            };
            this.d = new m(this.f13798a, this.b, cVar);
            if (enterGoodsData == null) {
                this.d.a(this.b.curItemList, this.b.popItemCardList, bVar, aVar);
            } else {
                this.d.a(enterGoodsData.curItemList, enterGoodsData.popItemCardList, bVar, aVar);
            }
        }
        ddw.a().a(this);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        m mVar = this.d;
        if (mVar != null) {
            mVar.a(z);
        }
        f fVar = this.c;
        if (fVar == null) {
            return;
        }
        fVar.a(z);
    }

    public void a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1232883", new Object[]{this, liveItem});
            return;
        }
        m mVar = this.d;
        if (mVar != null) {
            mVar.a(liveItem);
        }
        p pVar = this.g;
        if (pVar == null) {
            return;
        }
        pVar.a(liveItem);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        m mVar = this.d;
        if (mVar == null) {
            return;
        }
        mVar.a(1);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        m mVar;
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
            VideoInfo videoInfo = this.b;
            if (videoInfo == null || TextUtils.equals(videoInfo.liveId, str2)) {
                his.b("ShowcaseControllerCommon", "onEvent | liveid check failed. liveId=" + str2);
                return;
            }
            his.a("ShowcaseControllerCommon", "onEvent | eventType=" + str3);
            if (TextUtils.equals(tqa.AUCTION_CARD_SHOW, str3)) {
                this.e = new a(str3, str4);
                a(false);
            } else if (!TextUtils.equals(tqa.AUCTION_CARD_HIDE, str3)) {
            } else {
                a(true);
                a(false, new a(str3, str4));
                this.e = null;
            }
        } else if (TextUtils.equals("com.taobao.taolive.goods.showcase.close", str)) {
            a();
        } else if (TextUtils.equals("com.taobao.taolive.goods.showcase.update", str)) {
            if (!(obj instanceof LiveItem)) {
                return;
            }
            a((LiveItem) obj);
        } else if (hkk.P() && "com.taobao.taolive.room.sab_atmosphere_show".equals(str)) {
            m mVar2 = this.d;
            if (mVar2 == null) {
                return;
            }
            mVar2.c(true);
        } else if (!hkk.P() || !"com.taobao.taolive.room.sab_atmosphere_dismiss".equals(str) || (mVar = this.d) == null) {
        } else {
            mVar.c(false);
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
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.f;
        if (cVar != null && cVar.C() == null) {
            return null;
        }
        return this.f.C().G();
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.f;
        if (cVar != null && cVar.C() == null) {
            return null;
        }
        return this.f.C().G();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a(true, null);
        this.e = null;
        this.f13798a.clearAnimation();
        m mVar = this.d;
        if (mVar != null) {
            mVar.a();
        }
        f fVar = this.c;
        if (fVar != null) {
            fVar.a();
        }
        p pVar = this.g;
        if (pVar != null) {
            pVar.a();
        }
        this.f13798a.removeAllViews();
        ddw.a().b(this);
    }

    private void a(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d34feb", new Object[]{this, new Boolean(z), aVar});
        } else if (z && this.e == null) {
        } else {
            a aVar2 = this.e;
            String str = "-1";
            String a2 = aVar2 == null ? str : a.a(aVar2);
            if (aVar != null) {
                str = a.a(aVar);
            }
            long a3 = z ? hiq.a() : a.b(aVar);
            a aVar3 = this.e;
            long b = aVar3 == null ? -1L : a.b(aVar3);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("showCardNotifyId", a2);
            hashMap.put("hideCardNotifyId", str);
            hashMap.put("showCardTime", Long.toString(b));
            hashMap.put("hideCardTime", Long.toString(a3));
            hashMap.put("isLeave", z ? "1" : "0");
            hashMap.put("cardTime", Long.toString(a3 - b));
            his.a("ShowcaseControllerCommon", "trackAuctionEvent | isLeave=" + z + " showCardNotifyId=" + a2 + " hideCardNotifyId=" + str + " showCardTime=" + b + " hideCardTime=" + a3);
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("GLShowcaseAuctionExclude", hashMap);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f13800a;
        private String b;
        private long c;

        static {
            kge.a(-1068475781);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b837b11", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b9b0da42", new Object[]{aVar})).longValue() : aVar.c;
        }

        private a(String str, String str2) {
            this.f13800a = str;
            this.b = str2;
            this.c = hiq.a();
        }
    }
}
