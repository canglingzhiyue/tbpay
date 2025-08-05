package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Response;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.HashMap;
import java.util.List;
import tb.his;
import tb.kge;
import tb.qna;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f13877a = new c(new c.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.j.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.c.a
        public void a(NetResponse netResponse, NetBaseOutDo netBaseOutDo, c.b bVar) {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e45a8a7", new Object[]{this, netResponse, netBaseOutDo, bVar});
                return;
            }
            try {
                ItemlistV2ResponseData mo1437getData = ((ItemlistV2Response) netBaseOutDo).mo1437getData();
                if (netResponse != null && netResponse.getHeaderFields() != null && (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) != null && list.size() > 0) {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().c = list.get(0);
                }
                his.a("ItemRequestModel", "onServerDataSuccess | size=" + mo1437getData.itemListv1.size());
                com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f a2 = j.a(j.this);
                long j = -1;
                long j2 = bVar != null ? bVar.c : -1L;
                if (bVar != null) {
                    j = bVar.e;
                }
                a2.a(mo1437getData, false, false, j2, j, "");
                j.a(j.this, bVar);
            } catch (Exception e) {
                his.b("ItemRequestModel", "getItemListV2: " + e.getMessage());
                j.a(j.this, (NetResponse) null, "exception", bVar);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.c.a
        public void a(NetResponse netResponse, c.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bdf2e6d", new Object[]{this, netResponse, bVar});
            } else {
                j.a(j.this, netResponse, "onError", bVar);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.c.a
        public void b(NetResponse netResponse, c.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fc14cc", new Object[]{this, netResponse, bVar});
            } else {
                j.a(j.this, netResponse, "onSystemError", bVar);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.c.a
        public void a(c.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e803ca8", new Object[]{this, bVar});
            } else {
                j.a(j.this, bVar);
            }
        }
    });
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f b;
    private String c;

    static {
        kge.a(-165177348);
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f) ipChange.ipc$dispatch("43610d3f", new Object[]{jVar}) : jVar.b;
    }

    public static /* synthetic */ void a(j jVar, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38916271", new Object[]{jVar, bVar});
        } else {
            jVar.a(bVar);
        }
    }

    public static /* synthetic */ void a(j jVar, NetResponse netResponse, String str, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43832c2c", new Object[]{jVar, netResponse, str, bVar});
        } else {
            jVar.a(netResponse, str, bVar);
        }
    }

    public j(com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.f fVar) {
        this.b = fVar;
    }

    public void a(List<ItemIdentifier> list, List<ItemIdentifier> list2, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f177dda4", new Object[]{this, list, list2, cVar, itemCategory});
            return;
        }
        this.c = cVar.g();
        this.f13877a.a(com.taobao.android.live.plugin.atype.flexalocal.good.business.e.b(list, list2, itemCategory, cVar, "", false), false);
    }

    private void a(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e803ca8", new Object[]{this, bVar});
            return;
        }
        List<com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e> l = this.b.l();
        if (l == null || bVar == null || bVar.f13867a.itemIndexIdList == null) {
            return;
        }
        for (ItemIdentifier itemIdentifier : bVar.f13867a.itemIndexIdList) {
            for (int i = 0; i < l.size(); i++) {
                com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e eVar = l.get(i);
                if (eVar.b == itemIdentifier.goodsIndex) {
                    eVar.e = false;
                }
            }
        }
    }

    private void a(NetResponse netResponse, String str, c.b bVar) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fa0923", new Object[]{this, netResponse, str, bVar});
            return;
        }
        a(bVar);
        String str2 = "onSystemError";
        String responseCode = netResponse != null ? netResponse.getResponseCode() : str2;
        if (netResponse != null) {
            str2 = netResponse.getRetMsg();
        }
        his.b("ItemRequestModel", "errorCode = " + responseCode + " , errorMsg = " + str2);
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().c = null;
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("feed_id", this.c);
            if (netResponse != null && netResponse.getHeaderFields() != null && (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) != null && list.size() > 0) {
                hashMap.put("traceId", list.get(0));
            }
            hashMap.put("itemlistType", "dx");
            hashMap.put("itemCategoryId", qna.g(this.b.n()));
            hashMap.put("mtopCode", netResponse.getResponseCode());
            hashMap.put("successCode", str);
            hashMap.put("sense", "update");
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("LiveItemCdnMonitor", hashMap);
        } catch (Exception e) {
            his.b("ItemRequestModel", "onSystemError : " + e.getMessage());
        }
    }
}
