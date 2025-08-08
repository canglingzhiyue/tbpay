package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Response;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.l;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.hgv;
import tb.hgx;
import tb.his;
import tb.kge;
import tb.pqj;
import tb.qna;
import tb.riy;

/* loaded from: classes6.dex */
public class c<T extends g> extends com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.a<T> implements com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;
    public com.taobao.android.live.plugin.atype.flexalocal.good.business.e b;
    private hgx d;
    private String f;
    private boolean g;
    private long i;
    private com.taobao.android.live.plugin.atype.flexalocal.good.business.g j;
    private l k;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List a(c cVar, List list, List list2, ItemSortInfo itemSortInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e8537777", new Object[]{cVar, list, list2, itemSortInfo}) : cVar.a(list, list2, itemSortInfo);
    }

    public static /* synthetic */ void a(c cVar, String str, String str2, boolean z, List list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc64f806", new Object[]{cVar, str, str2, new Boolean(z), list, new Long(j)});
        } else {
            cVar.a(str, str2, z, list, j);
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e731497", new Object[]{cVar})).booleanValue() : cVar.g;
    }

    public static /* synthetic */ long b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6d2d4c48", new Object[]{cVar})).longValue() : cVar.i;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : c;
    }

    public static /* synthetic */ hgv c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("c65dd85a", new Object[]{cVar}) : cVar.f13750a;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("989eac27", new Object[]{cVar}) : cVar.l;
    }

    public static /* synthetic */ String e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ceec1e9", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ hgv f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("ea40fb7", new Object[]{cVar}) : cVar.f13750a;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("fe6d8544", new Object[]{cVar}) : cVar.l;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("cb07cda3", new Object[]{cVar}) : cVar.l;
    }

    public static /* synthetic */ hgv i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("56ea4714", new Object[]{cVar}) : cVar.f13750a;
    }

    public static /* synthetic */ hgv j(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("c4570433", new Object[]{cVar}) : cVar.f13750a;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c k(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("30d6a6c0", new Object[]{cVar}) : cVar.l;
    }

    public static /* synthetic */ hgv l(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("9f307e71", new Object[]{cVar}) : cVar.f13750a;
    }

    public static /* synthetic */ hgv m(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("c9d3b90", new Object[]{cVar}) : cVar.f13750a;
    }

    public static /* synthetic */ void n(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde7e960", new Object[]{cVar});
        } else {
            cVar.c();
        }
    }

    public static /* synthetic */ hgv o(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("e776b5ce", new Object[]{cVar}) : cVar.f13750a;
    }

    static {
        kge.a(-510108194);
        kge.a(-1673130908);
        c = c.class.getSimpleName();
    }

    public c(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        super(cVar);
        this.i = 0L;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d
    public void a(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569295b5", new Object[]{this, list, list2, itemCategory, new Boolean(z), new Boolean(z2), str});
        } else {
            a(list, list2, itemCategory, z, z2, str, list2 == null || list2.isEmpty());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d
    public void a(List<ItemIdentifier> list, final List<ItemIdentifier> list2, ItemCategory itemCategory, final boolean z, boolean z2, final String str, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc0d3bf", new Object[]{this, list, list2, itemCategory, new Boolean(z), new Boolean(z2), str, new Boolean(z3)});
            return;
        }
        this.f = itemCategory.categoryId;
        this.g = z2;
        this.i = System.currentTimeMillis();
        this.b = new com.taobao.android.live.plugin.atype.flexalocal.good.business.e(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                List<String> list3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                try {
                    ItemlistV2ResponseData mo1437getData = ((ItemlistV2Response) netBaseOutDo).mo1437getData();
                    if (netResponse != null && netResponse.getHeaderFields() != null && (list3 = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) != null && list3.size() > 0) {
                        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().c = list3.get(0);
                    }
                    if (mo1437getData.useCdn && c.a(c.this)) {
                        a(i, null, null, "useCdn");
                    } else {
                        ((g) c.c(c.this)).a(mo1437getData, z, false, c.b(c.this), c.this.b.b(), str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    String b = c.b();
                    his.b(b, "getItemListV2: " + e.getMessage());
                    a(i, null, null, "exception");
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    a(i, netResponse, obj, "onError");
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    a(i, netResponse, obj, "onSystemError");
                }
            }

            private void a(int i, NetResponse netResponse, Object obj, String str2) {
                List<String> list3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c4c0ad1c", new Object[]{this, new Integer(i), netResponse, obj, str2});
                    return;
                }
                String str3 = "onSystemError";
                String responseCode = netResponse != null ? netResponse.getResponseCode() : str3;
                if (netResponse != null) {
                    str3 = netResponse.getRetMsg();
                }
                String b = c.b();
                his.b(b, "errorCode = " + responseCode + " , errorMsg = " + str3);
                if (c.a(c.this)) {
                    c cVar = c.this;
                    c.a(cVar, c.d(cVar).g(), c.e(c.this), z, list2, c.b(c.this));
                } else {
                    ((g) c.f(c.this)).h();
                }
                try {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("feed_id", c.g(c.this).g());
                    if (netResponse != null && netResponse.getHeaderFields() != null && (list3 = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) != null && list3.size() > 0) {
                        hashMap.put("traceId", list3.get(0));
                    }
                    hashMap.put("itemlistType", "dx");
                    hashMap.put("itemCategoryId", qna.e(c.h(c.this)));
                    hashMap.put("mtopCode", netResponse.getResponseCode());
                    hashMap.put("successCode", str2);
                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                        return;
                    }
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("LiveItemCdnMonitor", hashMap);
                } catch (Exception e) {
                    String b2 = c.b();
                    his.b(b2, "onSystemError : " + e.getMessage());
                }
            }
        });
        this.b.a(list, list2, itemCategory, this.l, str, z3);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.d = new hgx("http://live-spare.alicdn.com/liveitems/" + this.l.g(), ItemlistV2ResponseData.class, new hgx.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hgx.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // tb.hgx.a
            public void a(Object obj, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1e7dad00", new Object[]{this, obj, new Long(j)});
                    return;
                }
                ItemlistV2ResponseData itemlistV2ResponseData = (ItemlistV2ResponseData) obj;
                if (itemlistV2ResponseData.itemListv1 == null) {
                    return;
                }
                try {
                    com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.a(itemlistV2ResponseData);
                    ((g) c.i(c.this)).a((ItemlistV2ResponseData) obj, false, true, currentTimeMillis, j, "cdnCache");
                } catch (Exception e) {
                    String b = c.b();
                    his.b(b, "filterItemList : " + e.getMessage());
                }
            }
        });
        this.d.a();
    }

    private void a(final String str, String str2, boolean z, final List<ItemIdentifier> list, final long j) {
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac1fe1b", new Object[]{this, str, str2, new Boolean(z), list, new Long(j)});
        } else if (StringUtils.isEmpty(str)) {
            ((g) this.f13750a).h();
        } else {
            if ("0".equals(str2)) {
                format = "http://live-spare.alicdn.com/liveitems/" + str;
            } else {
                format = String.format("https://live-spare.alicdn.com/liveitem4category/%s/%s", str, str2);
            }
            this.d = new hgx(format, ItemlistV2ResponseData.class, new hgx.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.hgx.a
                public void a(Object obj, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1e7dad00", new Object[]{this, obj, new Long(j2)});
                    } else if (obj != null && (obj instanceof ItemlistV2ResponseData)) {
                        ItemlistV2ResponseData itemlistV2ResponseData = (ItemlistV2ResponseData) obj;
                        if (itemlistV2ResponseData.itemListv1 != null) {
                            try {
                                com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.a(itemlistV2ResponseData);
                                itemlistV2ResponseData.itemListv1 = c.a(c.this, list, itemlistV2ResponseData.itemListv1, itemlistV2ResponseData.itemSortInfo);
                            } catch (Exception e) {
                                String b = c.b();
                                his.b(b, "filterItemList : " + e.getMessage());
                            }
                        }
                        ((g) c.j(c.this)).a(itemlistV2ResponseData, false, true, j, j2, "cdnBack");
                        if (itemlistV2ResponseData.itemListv1 == null || itemlistV2ResponseData.itemListv1.size() <= 0) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(riy.ARRAY_START_STR);
                        for (int i = 0; i < itemlistV2ResponseData.itemListv1.size(); i++) {
                            if (i > 0) {
                                sb.append(",");
                            }
                            if (itemlistV2ResponseData.itemListv1.get(i) != null && itemlistV2ResponseData.itemListv1.get(i).liveItemDO != null) {
                                sb.append(itemlistV2ResponseData.itemListv1.get(i).liveItemDO.itemId);
                            }
                        }
                        sb.append(riy.ARRAY_END_STR);
                        c.this.a(sb, com.taobao.taolive.sdk.utils.l.b(com.taobao.android.live.plugin.atype.flexalocal.good.a.a().d(c.k(c.this))), str);
                    }
                }

                @Override // tb.hgx.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        ((g) c.l(c.this)).h();
                    }
                }
            });
            this.d.a();
        }
    }

    private List<ItemlistV2ResponseData.ItemListv1> a(List<ItemIdentifier> list, List<ItemlistV2ResponseData.ItemListv1> list2, ItemSortInfo itemSortInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9b35642", new Object[]{this, list, list2, itemSortInfo});
        }
        if (list2 == null || list2.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if ((list == null || list.isEmpty()) && itemSortInfo != null && itemSortInfo.sortList != null) {
            list = new ArrayList<>();
            for (ItemIdentifier itemIdentifier : itemSortInfo.sortList) {
                if (list.size() >= 10) {
                    break;
                }
                list.add(itemIdentifier);
            }
        }
        if (list == null || list.isEmpty()) {
            for (ItemlistV2ResponseData.ItemListv1 itemListv1 : list2) {
                if (itemListv1 != null) {
                    arrayList.add(itemListv1);
                    if (arrayList.size() >= 10) {
                        break;
                    }
                }
            }
            return arrayList;
        }
        for (ItemlistV2ResponseData.ItemListv1 itemListv12 : list2) {
            if (itemListv12 != null) {
                Iterator<ItemIdentifier> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().goodsIndex == com.taobao.taolive.sdk.utils.l.a(itemListv12.goodsIndex)) {
                        arrayList.add(itemListv12);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public void a(StringBuilder sb, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6d51eb", new Object[]{this, sb, new Long(j), str});
            return;
        }
        if (this.j == null) {
            this.j = new com.taobao.android.live.plugin.atype.flexalocal.good.business.g(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    LiveItemPersonalityGetResponseData mo1437getData = ((LiveItemPersonalityGetResponse) netBaseOutDo).mo1437getData();
                    if (mo1437getData == null || mo1437getData.personalities == null || mo1437getData.personalities.isEmpty()) {
                        return;
                    }
                    Iterator<LiveItemPersonalityGetResponseData.LiveItemPersonalityData> it = mo1437getData.personalities.iterator();
                    while (it.hasNext()) {
                        ((b) c.m(c.this)).a(it.next());
                    }
                }
            });
        }
        this.j.a(sb.toString(), j, com.taobao.taolive.sdk.utils.l.b(str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.d
    public void b(ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0ac7ac", new Object[]{this, itemCategory});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().c(this.l) == 1) {
        } else {
            if (this.k == null) {
                this.k = new l(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.c.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        }
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSystemError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        }
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                            return;
                        }
                        JSONObject jSONObject = (JSONObject) pqj.a(netResponse.getDataJsonObject().toString());
                        if (jSONObject == null || jSONObject.isEmpty()) {
                            c.n(c.this);
                        } else {
                            ((b) c.o(c.this)).a(new com.taobao.taolive.sdk.goodlist.a("999998goodsRights", 1, jSONObject, 999998, 0L), false);
                        }
                    }
                });
            }
            this.k.a(this.l, itemCategory, true);
        }
    }

    @Override // tb.hgu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.business.e eVar = this.b;
        if (eVar != null) {
            eVar.a();
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.business.g gVar = this.j;
        if (gVar != null) {
            gVar.a();
        }
        l lVar = this.k;
        if (lVar != null) {
            lVar.a();
        }
        hgx hgxVar = this.d;
        if (hgxVar == null) {
            return;
        }
        hgxVar.b();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            ((b) this.f13750a).a(new com.taobao.taolive.sdk.goodlist.a("999998goodsRights", 1, null, 999998, 0L));
        }
    }
}
