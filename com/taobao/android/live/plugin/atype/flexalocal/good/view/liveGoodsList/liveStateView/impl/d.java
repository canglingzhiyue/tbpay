package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.GoodsTopBannerBean;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.hgw;
import tb.hir;
import tb.his;
import tb.hiw;
import tb.kas;
import tb.kcg;
import tb.kge;
import tb.qna;

/* loaded from: classes6.dex */
public class d extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean w_;

    static {
        kge.a(-303177628);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -336626560) {
            super.a((hgw) objArr[0]);
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f
    public com.taobao.taolive.sdk.goodlist.a a(ItemlistV2ResponseData.TopCardItem topCardItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.goodlist.a) ipChange.ipc$dispatch("af3ad29d", new Object[]{this, topCardItem});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ hgw a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgw) ipChange.ipc$dispatch("806910fc", new Object[]{dVar}) : dVar.f13751a;
    }

    public d(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory) {
        super(cVar, itemCategory);
        this.w_ = hir.y();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b, tb.hgv
    public void a(hgw hgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebef7c80", new Object[]{this, hgwVar});
            return;
        }
        super.a(hgwVar);
        if (this.d == null || this.d.E() == null) {
            return;
        }
        this.d.E().d().a((kcg) ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f, com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.n || !com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.w()) {
        } else {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) this.b).d();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.b, com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void d() {
        GoodsTopBannerBean e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!hiw.j()) {
            his.a("ListAllPresenter", "enableGoodsTopInteractBanner false return");
        } else if (!"全部".equals(this.e) || !"0".equals(this.f) || this.d == null || (e = this.d.e()) == null) {
        } else {
            if (TextUtils.equals(e.visible, "show")) {
                a(e);
            } else {
                j();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.b, com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.e
    public void al_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d8141b", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.b a2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(this.d, this.d.g());
        List<com.taobao.taolive.sdk.goodlist.a> c = a2 == null ? null : a2.c();
        if (c == null || c.isEmpty()) {
            his.a("ListAllPresenter", "recoverFromCache | cache is empty.");
            return;
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("cacheSize", Integer.toString(c.size()));
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("kandianGLRecover", hashMap);
        }
        this.l.a(this.m, c, false, false, (h) this.f13751a);
        this.j = a2.b();
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(this.d, (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.b) null);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f
    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (TextUtils.isEmpty(this.j) || !com.taobao.taolive.sdk.goodlist.d.c()) {
            if (j <= 0) {
                return false;
            }
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).moveToTargetItem(Long.toString(j));
            return true;
        }
        boolean m = m();
        final String str = this.j;
        if (m) {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getRecyclerView().postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) d.a(d.this)).moveToTargetItem(str);
                    }
                }
            }, 500L);
        } else {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).moveToTargetItem(this.j);
        }
        this.j = null;
        return true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.b
    public void a(GoodsTopBannerBean goodsTopBannerBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bef583", new Object[]{this, goodsTopBannerBean});
        } else if (goodsTopBannerBean == null) {
            his.a("ListAllPresenter", "showTopBanner data is null");
        } else {
            a(new com.taobao.taolive.sdk.goodlist.a("2topBannerInteractive", 2, goodsTopBannerBean.data, 1000000, 0L), false);
            his.a("ListAllPresenter", "showTopBanner:" + goodsTopBannerBean.type + " " + goodsTopBannerBean.liveId + " " + goodsTopBannerBean.timestamp);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.b
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            a(new com.taobao.taolive.sdk.goodlist.a("2topBannerInteractive", 2, null, 1000000, 0L));
        }
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        if (!hir.s()) {
            return false;
        }
        List<ItemIdentifier> b = this.l.b(l(), 50);
        if (b == null || b.isEmpty()) {
            his.a("ListAllPresenter", "checkNeedDeepCompensate | not need.");
            return false;
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("size", Integer.toString(b.size()));
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("GLCompensate", hashMap);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b.size(); i++) {
            if (i % 15 == 0 && arrayList.size() > 0) {
                ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) this.b).a(this.l.b(), arrayList, this.m, false, false, "");
                arrayList = new ArrayList();
            }
            arrayList.add(b.get(i));
        }
        if (arrayList.size() > 0) {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) this.b).a(this.l.b(), arrayList, this.m, false, false, "");
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f
    public boolean a(ItemSortInfo itemSortInfo, ArrayList<com.taobao.taolive.sdk.goodlist.a> arrayList) {
        List<ItemCategory> a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1839f8b", new Object[]{this, itemSortInfo, arrayList})).booleanValue();
        }
        if (!this.w_ || (a2 = qna.a(this.d)) == null || a2.isEmpty()) {
            return false;
        }
        Iterator<ItemCategory> it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ItemCategory next = it.next();
            if (next != null && next.isPreheatTab()) {
                z = true;
                break;
            }
        }
        if (!z) {
            return ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a(false);
        }
        if (arrayList == null || arrayList.isEmpty() || itemSortInfo == null || itemSortInfo.sortList == null || itemSortInfo.sortList.isEmpty()) {
            his.a("ListAllPresenter", "checkoutToBottom | add bottom button 1.");
            return ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a(false);
        }
        ItemIdentifier itemIdentifier = itemSortInfo.sortList.get(itemSortInfo.sortList.size() - 1);
        com.taobao.taolive.sdk.goodlist.a aVar = arrayList.get(arrayList.size() - 1);
        if (itemIdentifier == null || aVar == null || !itemIdentifier.equals(aVar.c, aVar.e)) {
            return false;
        }
        his.a("ListAllPresenter", "checkoutToBottom | add bottom button 2.");
        return ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.f) this.f13751a).getAdapter().a(true);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.b, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b, tb.hgv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.d == null || this.d.E() == null) {
            return;
        }
        this.d.E().d().a((kas) null);
    }
}
