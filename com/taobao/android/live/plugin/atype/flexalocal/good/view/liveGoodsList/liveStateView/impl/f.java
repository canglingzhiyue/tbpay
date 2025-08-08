package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.j;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.hgu;
import tb.hgw;
import tb.hir;
import tb.his;
import tb.hiw;
import tb.hjm;
import tb.kge;
import tb.pmd;
import tb.pqj;
import tb.qna;

/* loaded from: classes6.dex */
public abstract class f<T extends h> extends com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b<T, com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d> implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    public String e;
    @Deprecated
    public String f;
    @Deprecated
    public String g;
    public boolean h;
    public String j;
    public boolean k;
    public hjm l;
    public ItemCategory m;
    public boolean n;
    private j o;

    static {
        kge.a(1314246921);
        kge.a(325443523);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -336626560) {
            super.a((hgw) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract boolean a(long j);

    public boolean a(ItemSortInfo itemSortInfo, ArrayList<com.taobao.taolive.sdk.goodlist.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1839f8b", new Object[]{this, itemSortInfo, arrayList})).booleanValue();
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public abstract boolean i();

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d, tb.hgu] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b
    public /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d bL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgu) ipChange.ipc$dispatch("456f4ef4", new Object[]{this}) : k();
    }

    public f(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory) {
        super(cVar);
        this.k = true;
        this.o = new j(this);
        this.h = false;
        this.m = itemCategory;
        this.l = new hjm(cVar);
        this.n = hir.a(qna.c(cVar));
    }

    public com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) ipChange.ipc$dispatch("d82c9f4f", new Object[]{this}) : new c(this.d);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b, tb.hgv
    public void a(hgw hgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebef7c80", new Object[]{this, hgwVar});
            return;
        }
        super.a(hgwVar);
        if (((h) this.f13751a).getAdapter() == null) {
            return;
        }
        ((h) this.f13751a).getAdapter().a(this.c);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    public boolean g() {
        List<ItemIdentifier> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("loadMore: tab=");
        sb.append(this.e);
        sb.append("   mIsLoading=");
        sb.append(this.h);
        sb.append(" result=");
        sb.append(!this.h);
        his.c("MultiTabBasePresenter", sb.toString());
        if (this.h || (a2 = this.l.a(((h) this.f13751a).getAdapter().a(), 0)) == null || a2.isEmpty()) {
            return false;
        }
        this.h = true;
        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) this.b).a(this.l.b(), a2, this.m, false, this.k, "");
        return true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    public void a(boolean z, List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab4085d", new Object[]{this, new Boolean(z), list});
            return;
        }
        his.c("MultiTabBasePresenter", "requestLastPage: tab=" + this.e + "    liveId=" + this.d.g() + "    mIsLoading=" + this.h);
        if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.n()) {
            try {
                List<com.taobao.taolive.sdk.goodlist.a> c = this.d.c();
                if (c != null && !c.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("switchTab", String.valueOf(z));
                    hashMap.put("topItemId", String.valueOf(this.d.L.b));
                    hashMap.put("session_id", this.d.y());
                    hashMap.put("timestampT", String.valueOf(System.currentTimeMillis()));
                    pmd.a().e().b("Page_TaobaoLiveWatch", "GoodListFirstScreenDataRender", hashMap);
                }
            } catch (Throwable th) {
                his.b("MultiTabBasePresenter", th.getMessage());
            }
        }
        if (this.h) {
            return;
        }
        ((h) this.f13751a).hideEmptyView(new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d(this.e, 0));
        ((h) this.f13751a).hideErrorView(new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d(this.e, 0));
        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d) this.b).a(this.l.b(), list, this.m, true, this.k, "showGoodsList", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d A[Catch: Exception -> 0x02e4, TryCatch #1 {Exception -> 0x02e4, blocks: (B:6:0x0048, B:8:0x0064, B:12:0x0076, B:14:0x007a, B:16:0x008a, B:18:0x00a6, B:20:0x00b0, B:22:0x00bd, B:23:0x00c0, B:25:0x00c4, B:27:0x00ca, B:28:0x00ce, B:30:0x00d4, B:32:0x00e0, B:33:0x00e4, B:35:0x00ea, B:37:0x00fc, B:46:0x0125, B:50:0x013d, B:52:0x0145, B:54:0x014f, B:55:0x0153, B:57:0x0159, B:59:0x016f, B:61:0x017f, B:64:0x019d, B:67:0x01a8, B:69:0x01ae, B:70:0x01b7, B:77:0x01c7, B:81:0x01d2, B:83:0x020d, B:84:0x0218, B:86:0x022d, B:87:0x023c), top: B:104:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022d A[Catch: Exception -> 0x02e4, TryCatch #1 {Exception -> 0x02e4, blocks: (B:6:0x0048, B:8:0x0064, B:12:0x0076, B:14:0x007a, B:16:0x008a, B:18:0x00a6, B:20:0x00b0, B:22:0x00bd, B:23:0x00c0, B:25:0x00c4, B:27:0x00ca, B:28:0x00ce, B:30:0x00d4, B:32:0x00e0, B:33:0x00e4, B:35:0x00ea, B:37:0x00fc, B:46:0x0125, B:50:0x013d, B:52:0x0145, B:54:0x014f, B:55:0x0153, B:57:0x0159, B:59:0x016f, B:61:0x017f, B:64:0x019d, B:67:0x01a8, B:69:0x01ae, B:70:0x01b7, B:77:0x01c7, B:81:0x01d2, B:83:0x020d, B:84:0x0218, B:86:0x022d, B:87:0x023c), top: B:104:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0262 A[Catch: Exception -> 0x02de, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:89:0x0259, B:91:0x0262), top: B:102:0x0259 }] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData r26, boolean r27, boolean r28, long r29, long r31, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f.a(com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData, boolean, boolean, long, long, java.lang.String):void");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ((h) this.f13751a).hideEmptyView(new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d(this.e, 0));
        ((h) this.f13751a).hideErrorView(new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d(this.e, 0));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    public boolean a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2619793f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (!this.n || i3 == 0) {
            return false;
        }
        if (i3 > 0) {
            List<ItemIdentifier> c = this.l.c(((h) this.f13751a).getAdapter().a(), i);
            if (c == null || c.isEmpty()) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < c.size(); i4++) {
                sb.append("/" + c.get(i4).goodsIndex);
            }
            his.a("MultiTabBasePresenter", "checkNeedCompensate ｜ down compensate=" + sb.toString());
            this.o.a(this.l.b(), c, this.d, this.m);
        } else {
            List<ItemIdentifier> d = this.l.d(((h) this.f13751a).getAdapter().a(), i2);
            if (d != null && !d.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                for (int i5 = 0; i5 < d.size(); i5++) {
                    sb2.append("/" + d.get(i5).itemId + "_" + d.get(i5).goodsIndex);
                }
                his.a("MultiTabBasePresenter", "checkNeedCompensate | up compensate=" + sb2.toString());
                this.o.a(this.l.b(), d, this.d, this.m);
            }
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        List a2 = ((h) this.f13751a).getAdapter().a();
        if (a2 == null || a2.isEmpty()) {
            ((h) this.f13751a).showErrorView(new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d(this.e, 0));
        }
        his.c("MultiTabBasePresenter", "itemListV2Error: | tabName=" + this.e);
        this.h = false;
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r13 == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.util.List<com.taobao.taolive.sdk.model.common.ItemIdentifier> r11, java.util.List<com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData.ItemListv1> r12, com.taobao.taolive.sdk.model.common.LiveItem r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f.a(java.util.List, java.util.List, com.taobao.taolive.sdk.model.common.LiveItem, boolean):boolean");
    }

    public boolean a(com.taobao.taolive.sdk.goodlist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbfce2a7", new Object[]{this, aVar})).booleanValue();
        }
        List a2 = ((h) this.f13751a).getAdapter().a();
        if (a2.size() > 0) {
            for (int i = 0; i < a2.size(); i++) {
                com.taobao.taolive.sdk.goodlist.a a3 = ((h) this.f13751a).getAdapter().a(i);
                if (a3 != null && a3.c == aVar.c) {
                    a2.remove(i);
                    if (((h) this.f13751a).getRecyclerView().getAdapter() != null) {
                        ((h) this.f13751a).getRecyclerView().getAdapter().notifyDataSetChanged();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        List a2 = ((h) this.f13751a).getAdapter().a();
        if (a2.size() > 0) {
            for (int i = 0; i < a2.size(); i++) {
                com.taobao.taolive.sdk.goodlist.a a3 = ((h) this.f13751a).getAdapter().a(i);
                if (a3 != null && StringUtils.equals(a3.e, str)) {
                    a2.remove(i);
                    if (((h) this.f13751a).getRecyclerView().getAdapter() != null) {
                        ((h) this.f13751a).getRecyclerView().getAdapter().notifyDataSetChanged();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public List<com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("566a3ef4", new Object[]{this});
        }
        if (((h) this.f13751a).getAdapter() != null) {
            return ((h) this.f13751a).getAdapter().a();
        }
        return null;
    }

    public boolean a(LiveItem liveItem, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d1d0cf5", new Object[]{this, liveItem, new Boolean(z), new Boolean(z2), new Boolean(z3)})).booleanValue();
        }
        if (((h) this.f13751a).getAdapter().a() != null) {
            ((h) this.f13751a).hideEmptyView(new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d(this.e, 0));
        }
        return this.l.a(this.m, a(liveItem), z, z2, z3, (h) this.f13751a);
    }

    public com.taobao.taolive.sdk.goodlist.a a(ItemlistV2ResponseData.TopCardItem topCardItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.goodlist.a) ipChange.ipc$dispatch("af3ad29d", new Object[]{this, topCardItem});
        }
        if (topCardItem == null || !hiw.e() || this.d.A()) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) pqj.b(topCardItem);
        return new com.taobao.taolive.sdk.goodlist.a(topCardItem.type + "topcard", 8, jSONObject, 999999, 0L);
    }
}
