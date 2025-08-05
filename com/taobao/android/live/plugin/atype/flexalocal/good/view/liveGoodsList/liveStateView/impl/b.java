package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.GoodsTopBannerBean;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import com.taobao.taolive.sdk.utils.l;
import java.util.List;
import tb.hiq;
import tb.his;
import tb.hjm;
import tb.kge;
import tb.pqj;

/* loaded from: classes6.dex */
public abstract class b extends f<com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f> implements com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b, com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1209085200);
        kge.a(-1438529504);
        kge.a(-608753430);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(GoodsTopBannerBean goodsTopBannerBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bef583", new Object[]{this, goodsTopBannerBean});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void a(LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f39817", new Object[]{this, liveItem, str, str2});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void al_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d8141b", new Object[]{this});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    public b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory) {
        super(cVar, itemCategory);
        if (cVar == null || cVar.x() == null || itemCategory.isIndependentTab()) {
            return;
        }
        cVar.x().a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b, tb.hgv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.d == null || this.d.x() == null) {
            return;
        }
        this.d.x().b(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void f(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45963181", new Object[]{this, goodMsgNew});
        } else {
            b(goodMsgNew, true);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void a(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30cb866", new Object[]{this, goodMsgNew});
        } else {
            b(goodMsgNew, false);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void b(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd283705", new Object[]{this, goodMsgNew});
        } else {
            b(goodMsgNew, false);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void b(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f80268", new Object[]{this, new Long(j), new Integer(i)});
        } else {
            a(j, i);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void g(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb1b020", new Object[]{this, goodMsgNew});
        } else {
            b(goodMsgNew, false);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void c(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f743b5a4", new Object[]{this, goodMsgNew});
        } else {
            b(goodMsgNew, false);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            d(jSONObject);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
    public void d(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115f3443", new Object[]{this, goodMsgNew});
        } else {
            b(goodMsgNew, false);
        }
    }

    public void a(com.taobao.taolive.sdk.goodlist.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a02491", new Object[]{this, aVar, new Boolean(z)});
        } else {
            this.l.a(this.m, aVar, false, true, z, (h) this.f13751a);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae4644", new Object[]{this, liveItem});
        } else {
            a(liveItem, true, true, false);
        }
    }

    public void a(LiveItemPersonalityGetResponseData.LiveItemPersonalityData liveItemPersonalityData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb769ca7", new Object[]{this, liveItemPersonalityData});
            return;
        }
        List a2 = ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a();
        if (a2 == null || a2.size() <= 0) {
            return;
        }
        for (int i = 0; i < a2.size(); i++) {
            com.taobao.taolive.sdk.goodlist.a a3 = ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a(i);
            if (a3 != null && a3.e.equals(liveItemPersonalityData.itemId)) {
                a3.b.put("personalityData", (Object) liveItemPersonalityData.personalityData);
                ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().notifyItemChanged(i);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (com.taobao.taolive.sdk.goodlist.a aVar : this.d.c()) {
            if (aVar != null && aVar.b != null && aVar.b.containsKey("native_vipTagsShow") && aVar.b.containsKey("native_canShowVipEntrance")) {
                aVar.b.put("native_canShowVipEntrance", (Object) false);
                this.c.a(this.d, aVar.b);
            }
        }
        List a2 = ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a();
        if (a2 == null || a2.size() <= 0) {
            return;
        }
        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().notifyDataSetChanged();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void a_(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91f6b00", new Object[]{this, liveItem});
        } else {
            a(liveItem, true, true, false);
        }
    }

    private void b(com.taobao.taolive.sdk.goodlist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331ad382", new Object[]{this, aVar});
            return;
        }
        List<com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e> l = l();
        if (aVar == null || l == null) {
            return;
        }
        for (int i = 0; i < l.size(); i++) {
            com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e eVar = l.get(i);
            if (aVar.c == eVar.b && TextUtils.equals(eVar.f, aVar.e)) {
                ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().notifyItemChanged(i);
                return;
            }
        }
    }

    private void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        com.taobao.taolive.sdk.goodlist.a a2 = this.d.a(this.m, 4, -1, Long.toString(j));
        if (a2 == null || a2.b == null) {
            his.a("GoodsLiveStatePresenter", "dxData == null");
            return;
        }
        if (a2.b.containsKey("itemExtData")) {
            JSONObject jSONObject = a2.b.getJSONObject("itemExtData");
            int intValue = jSONObject.getIntValue("itemSellingTotal");
            if (intValue >= i) {
                his.a("GoodsLiveStatePresenter", "updateItem | currTotal=" + intValue + "   total=" + i + " goodIndex=" + a2.c);
                return;
            }
            jSONObject.put("itemSellingTotal", (Object) String.valueOf(i));
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("itemSellingTotal", (Object) String.valueOf(i));
            a2.b.put("itemExtData", (Object) jSONObject2);
        }
        if (a2.b.containsKey("liveItemStatusData")) {
            JSONObject jSONObject3 = a2.b.getJSONObject("liveItemStatusData");
            if (jSONObject3.containsKey("isSpeaking") && TextUtils.equals(jSONObject3.getString("isSpeaking"), "true")) {
                his.a("GoodsLiveStatePresenter", "isSpeaking  true");
            }
        }
        b(a2);
        his.a("GoodsLiveStatePresenter", "update item");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d.k() || this.d.A()) {
        } else {
            if (!i() && !this.m.queryRights) {
                return;
            }
            his.b("GoodsLiveStatePresenter", "getRightList | isListAllTab=" + i() + " queryRights=" + this.m.queryRights);
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) this.b).b(this.m);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void a(List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) this.b).a(this.l.b(), list, this.m, false, false, "refresh");
        }
    }

    private void b(GoodMsgNew goodMsgNew, boolean z) {
        ItemSortInfo itemSortInfo;
        List<ItemIdentifier> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7df5c6f", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else if (goodMsgNew == null || goodMsgNew.liveItemDO == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.c(goodMsgNew.liveItemDO);
            if (!hiq.a(goodMsgNew.liveItemDO, this.e, this.f) || !hiq.a(this.d.g(), goodMsgNew.liveItemDO)) {
                return;
            }
            if (hiq.a(this.e, this.f)) {
                itemSortInfo = goodMsgNew.itemSortInfo;
            } else {
                itemSortInfo = goodMsgNew.categoryItemSortInfo != null ? goodMsgNew.categoryItemSortInfo.get(this.f) : null;
                if (itemSortInfo == null) {
                    this.l.a(goodMsgNew.liveItemDO.goodsIndex, Long.toString(goodMsgNew.liveItemDO.itemId));
                }
            }
            if (hiq.a(this.e, this.f) && this.d.x().f() != null && this.d.x().f().useRecommendItem) {
                a2 = this.l.a(itemSortInfo);
            } else {
                a2 = this.l.a(itemSortInfo, null, true, i());
            }
            boolean a3 = i() ? a(a2, (List<ItemlistV2ResponseData.ItemListv1>) null, goodMsgNew.liveItemDO, false) : false;
            hjm.a(this.d.a(Long.toString(goodMsgNew.liveItemDO.itemId)), goodMsgNew.liveItemDO);
            a(goodMsgNew.liveItemDO, false, true, false);
            if (this.l.a(l()) && !a3) {
                return;
            }
            this.l.b(l());
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().notifyDataSetChanged();
        }
    }

    private void d(JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            long b2 = l.b(jSONObject.getString("itemId"));
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("type");
            LiveItem liveItem = null;
            List a2 = ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a();
            if (!TextUtils.isEmpty(this.d.g()) && a2 != null && a2.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= a2.size()) {
                        break;
                    }
                    com.taobao.taolive.sdk.goodlist.a a3 = ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a(i);
                    if (((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e) a2.get(i)).f.equals(String.valueOf(b2)) && a3 != null && a3.b.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID).equals(this.d.g())) {
                        liveItem = (LiveItem) pqj.a(a3.b.toJSONString(), LiveItem.class);
                        break;
                    }
                    i++;
                }
            }
            if (liveItem == null) {
                return;
            }
            if ("2".equals(string) && "secKillSellout".equals(string2)) {
                if (liveItem.extendVal == null || liveItem.extendVal.secKillInfo == null || liveItem.itemId != b2 || (b = pqj.b(liveItem.extendVal.secKillInfo)) == null) {
                    return;
                }
                b.put("status", (Object) 2);
                liveItem.extendVal.secKillInfo = b.toJSONString();
                a(liveItem, true, true, false);
            } else if ("itemUpSelf".equals(string2)) {
                if (liveItem.liveItemStatusData == null) {
                    return;
                }
                liveItem.liveItemStatusData.put("isDownShelf", (Object) false);
                a(liveItem, true, true, false);
            } else if (!"cancelPunish".equals(string2) || liveItem.liveItemStatusData == null) {
            } else {
                liveItem.liveItemStatusData.put("isGray", (Object) false);
                a(liveItem, true, true, false);
            }
        }
    }
}
