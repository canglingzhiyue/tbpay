package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.c;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_NUM = 10;

    /* renamed from: a */
    public c.b f13754a;
    private long e;

    static {
        kge.a(379269724);
    }

    public static /* synthetic */ long a(e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38f8a7bb", new Object[]{eVar, new Long(j)})).longValue();
        }
        eVar.e = j;
        return j;
    }

    public e(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
        this.c = new IRemoteExtendListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
            public void dataParseBegin(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
                } else {
                    e.a(e.this, j);
                }
            }
        };
    }

    public e(com.taobao.taolive.sdk.adapter.network.d dVar, c.b bVar) {
        super(dVar);
        this.f13754a = bVar;
        this.c = new IRemoteExtendListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
            public void dataParseBegin(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
                } else {
                    e.a(e.this, j);
                }
            }
        };
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.e;
    }

    public void a(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae8589c", new Object[]{this, list, list2, itemCategory, cVar, str});
        } else {
            a(list, list2, itemCategory, cVar, str, list2 == null || list2.isEmpty());
        }
    }

    public void a(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92236db8", new Object[]{this, list, list2, itemCategory, cVar, str, new Boolean(z)});
        } else if (cVar == null) {
        } else {
            a(1, (INetDataObject) b(list, list2, itemCategory, cVar, str, z), ItemlistV2Response.class, false, true);
        }
    }

    public static ItemlistV2Request2 b(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemlistV2Request2) ipChange.ipc$dispatch("31ee8df3", new Object[]{list, list2, itemCategory, cVar, str, new Boolean(z)});
        }
        ItemlistV2Request2 itemlistV2Request2 = new ItemlistV2Request2();
        itemlistV2Request2.liveId = cVar.l.i();
        itemlistV2Request2.creatorId = com.taobao.taolive.sdk.utils.l.b(cVar.l.b());
        itemlistV2Request2.n = 10L;
        itemlistV2Request2.includePopLayerEntance = (list2 == null || list2.isEmpty()) ? 1 : 0;
        itemlistV2Request2.transParams = cVar.w();
        itemlistV2Request2.liveSource = cVar.v();
        itemlistV2Request2.entryLiveSource = cVar.u();
        itemlistV2Request2.itemCardTransferInfo = cVar.x() == null ? null : cVar.x().e();
        if (cVar.t() != null) {
            itemlistV2Request2.itemTransferInfo = cVar.t().itemTransferInfo == null ? "" : cVar.t().itemTransferInfo.toJSONString();
        }
        if (cVar.x() != null && itemCategory != null && itemCategory.isDefaultTab() && cVar.i()) {
            List<ItemIdentifier> a2 = cVar.x().a();
            itemlistV2Request2.needRecommendItem = cVar.j() && (a2 == null || a2.isEmpty());
            if (a2 != null && a2.size() > 0) {
                if (a2.size() > 10) {
                    a2 = a2.subList(0, 10);
                }
                itemlistV2Request2.recommendItemList = a2;
            }
        }
        itemlistV2Request2.needPcg = cVar.i();
        itemlistV2Request2.matchNewVersion = com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(cVar) ? "1" : "0";
        if (itemCategory != null) {
            itemlistV2Request2.categoryId = itemCategory.categoryId;
            itemlistV2Request2.categoryBizType = itemCategory.bizType;
            if (!itemCategory.backSortList) {
                list = null;
            }
            itemlistV2Request2.sortItemList = list;
            if (TextUtils.equals(itemlistV2Request2.categoryId, cVar.L.f13852a)) {
                itemlistV2Request2.bizTopItemId = cVar.L.b;
            }
        }
        itemlistV2Request2.needSortList = true;
        itemlistV2Request2.itemIndexIdList = list2;
        itemlistV2Request2.firstPage = z;
        itemlistV2Request2.scene = str;
        return itemlistV2Request2;
    }

    public void a(ItemlistV2Request2 itemlistV2Request2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f67a5e", new Object[]{this, itemlistV2Request2});
        } else {
            a(1, (INetDataObject) itemlistV2Request2, ItemlistV2Response.class, false, true);
        }
    }
}
