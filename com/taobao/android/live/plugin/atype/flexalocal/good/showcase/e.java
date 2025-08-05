package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterLiveItemResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Response;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ddv;
import tb.ddw;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.hit;
import tb.hkk;
import tb.kge;
import tb.pox;
import tb.pqj;
import tb.qna;
import tb.tkg;
import tb.tki;
import tb.xkw;

/* loaded from: classes5.dex */
public class e implements com.taobao.taolive.sdk.core.c, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.taolive.sdk.core.b d;
    private String e;
    private List<ItemlistV2ResponseData.ItemListv1> h;
    private EnterGoodsData n;
    private JSONObject o;
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c p;
    private JSONObject t;

    /* renamed from: a */
    private List<com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b> f13783a = new CopyOnWriteArrayList();
    private List<c> b = new CopyOnWriteArrayList();
    private List<pox> c = new CopyOnWriteArrayList();
    private List<com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.a> s = new CopyOnWriteArrayList();
    private List<o> q = new CopyOnWriteArrayList();
    private g f = new g();
    private List<ItemIdentifier> g = new ArrayList();
    private a i = new a();
    private HashMap<String, com.taobao.taolive.sdk.goodlist.a> j = null;
    private List<b> k = new ArrayList();
    private BroadcastReceiver r = new BroadcastReceiver() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.LiveGoodDataCenter$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || intent.getExtras() == null) {
            } else {
                if (TextUtils.equals(intent.getExtras().getString("from"), "buyCreateOrder")) {
                    e.a(e.this).p();
                }
                his.b("LiveGoodDataCenter", "onReceive | data=" + intent.getExtras());
            }
        }
    };

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        public final int f13792a;
        public final JSONObject b;
        public String c;
        public String d;

        static {
            kge.a(-278507555);
        }

        public b(int i, JSONObject jSONObject) {
            this.f13792a = i - 1;
            this.b = jSONObject;
            if (jSONObject != null) {
                this.d = jSONObject.getString("acceleratorCode");
            }
        }
    }

    static {
        kge.a(-91244188);
        kge.a(947087257);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "getUniqueIdentification";
    }

    public static /* synthetic */ a a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1975d2db", new Object[]{eVar}) : eVar.i;
    }

    public static /* synthetic */ List a(e eVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aa998c66", new Object[]{eVar, list});
        }
        eVar.g = list;
        return list;
    }

    public static /* synthetic */ void a(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feeb1620", new Object[]{eVar, jSONObject});
        } else {
            eVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(e eVar, EnterGoodsData enterGoodsData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d224018", new Object[]{eVar, enterGoodsData, str});
        } else {
            eVar.a(enterGoodsData, str);
        }
    }

    public static /* synthetic */ void a(e eVar, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4036a91", new Object[]{eVar, cVar, str, new Boolean(z), str2, str3, str4});
        } else {
            eVar.a(cVar, str, z, str2, str3, str4);
        }
    }

    public static /* synthetic */ void a(e eVar, GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421c6f96", new Object[]{eVar, goodMsgNew, new Boolean(z)});
        } else {
            eVar.b(goodMsgNew, z);
        }
    }

    public static /* synthetic */ void a(e eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4a4be4", new Object[]{eVar, str, str2});
        } else {
            eVar.a(str, str2);
        }
    }

    public static /* synthetic */ g b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("4c17f415", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ List b(e eVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3a4d7e7", new Object[]{eVar, list});
        }
        eVar.h = list;
        return list;
    }

    public static /* synthetic */ List c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7f0cf479", new Object[]{eVar}) : eVar.g;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("ae8cda30", new Object[]{eVar}) : eVar.p;
    }

    public static /* synthetic */ List e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("eee5cf7b", new Object[]{eVar}) : eVar.s;
    }

    public static /* synthetic */ List g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5ebeaa7d", new Object[]{eVar}) : eVar.q;
    }

    public static /* synthetic */ List k(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3e706081", new Object[]{eVar}) : eVar.f13783a;
    }

    public static /* synthetic */ List l(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f65cce02", new Object[]{eVar}) : eVar.b;
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, com.taobao.taolive.sdk.core.b bVar, HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap, pox<EnterGoodsData> poxVar, com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.a<EnterGoodsData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a99086", new Object[]{this, cVar, bVar, hashMap, poxVar, aVar});
            return;
        }
        d();
        this.p = cVar;
        if (bVar != null) {
            this.d = bVar;
            bVar.registerMessageListener(this, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
                public boolean filter(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
                    }
                    return (i == 10091 || i == 10092 || i == 10096 || i == 10094 || i == 1070 || i == 10097 || i == 1071 || i == 10098 || i == 10095) || e.b(e.this).a(i);
                }
            });
        }
        ddw.a().a(this);
        this.e = cVar.g();
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.b a2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(cVar, this.e);
        if (!cVar.k()) {
            if (a2 != null && a2.d() != null) {
                this.g = new ArrayList();
                this.g.addAll(a2.d());
            }
            a(cVar, hashMap);
        }
        if (a2 != null && a2.e() != null) {
            this.t = a2.e();
        }
        if (aVar != null) {
            this.s.add(aVar);
        }
        a(cVar, poxVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("cartRefreshData");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.p.f()).registerReceiver(this.r, intentFilter);
    }

    private void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbca0dc4", new Object[]{this, cVar, hashMap});
            return;
        }
        this.j = hashMap;
        if (cVar == null || !cVar.i() || !cVar.c.g) {
            his.b("LiveGoodDataCenter", "initPcgData | disabled.");
        } else {
            new com.taobao.android.live.plugin.atype.flexalocal.good.business.e(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    ItemlistV2ResponseData mo1437getData = ((ItemlistV2Response) netBaseOutDo).mo1437getData();
                    if (mo1437getData == null) {
                        return;
                    }
                    if (mo1437getData.itemListv1 != null && mo1437getData.itemListv1.size() > 0) {
                        his.a("LiveGoodDataCenter", "initPcgData | onSuccess, size=" + mo1437getData.itemListv1.size());
                        e.b(e.this, mo1437getData.itemListv1);
                    } else {
                        his.b("LiveGoodDataCenter", "initPcgData | onSuccess, data is empty.");
                    }
                    if (e.c(e.this) != null && !e.c(e.this).isEmpty()) {
                        return;
                    }
                    if (mo1437getData.recommendItemSortInfo != null) {
                        e.a(e.this, mo1437getData.recommendItemSortInfo.sortList);
                    }
                    if (e.c(e.this) != null && !e.c(e.this).isEmpty()) {
                        return;
                    }
                    his.b("LiveGoodDataCenter", "initPcgData | rec id is empty.");
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        his.a("LiveGoodDataCenter", "initPcgData | onError");
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        his.a("LiveGoodDataCenter", "initPcgData | onSystemError");
                    }
                }
            }).a((List<ItemIdentifier>) null, (List<ItemIdentifier>) null, ItemCategory.constructDefaultCategory(), cVar, "");
        }
    }

    private void a(final com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, pox<EnterGoodsData> poxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34d5206", new Object[]{this, cVar, poxVar});
            return;
        }
        a(poxVar);
        com.taobao.taolive.sdk.core.g b2 = com.taobao.taolive.room.utils.n.b(cVar.C());
        if (b2 != null && b2.F != null && b2.F.f() && hkk.ag()) {
            b2.F.a(true, "goods", new ISmartLandingProxy.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
                public boolean a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5ca495b6", new Object[]{this, str, jSONObject, jSONObject2})).booleanValue();
                    }
                    String str2 = null;
                    String string = jSONObject == null ? null : jSONObject.getString(aw.PARAM_ITEM_HOLD_TYPE);
                    String string2 = jSONObject == null ? null : jSONObject.getString(aw.PARAM_ITEM_IDS);
                    if (jSONObject != null) {
                        str2 = jSONObject.getString(aw.PARAM_SJSD_ITEM_ID);
                    }
                    String str3 = str2;
                    his.b("LiveGoodDataCenter", "initEnterLiveData | onTaskActionListener popId " + str + " actionData " + jSONObject + " " + jSONObject2);
                    e.a(e.this, cVar, str, false, string, string2, str3);
                    return true;
                }
            });
        } else {
            a(cVar, null, true, null, null, null);
        }
    }

    private void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, final String str, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3796cdf9", new Object[]{this, cVar, str, new Boolean(z), str2, str3, str4});
        } else if (tki.a()) {
            c(str);
        } else {
            new com.taobao.android.live.plugin.atype.flexalocal.good.business.b(new pox<EnterGoodsData>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // tb.pox
                public /* synthetic */ void onResult(EnterGoodsData enterGoodsData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8251d27f", new Object[]{this, enterGoodsData});
                    } else {
                        a(enterGoodsData);
                    }
                }

                public void a(EnterGoodsData enterGoodsData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f0997166", new Object[]{this, enterGoodsData});
                    } else {
                        e.a(e.this, enterGoodsData, str);
                    }
                }

                @Override // tb.pox
                public void onError(String str5, String str6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("97d08c84", new Object[]{this, str5, str6});
                    } else {
                        e.a(e.this, str5, str6);
                    }
                }
            }).a(cVar, z, str2, str3, str4);
        }
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.p;
        com.taobao.alilive.aliliveframework.frame.a C = cVar != null ? cVar.C() : null;
        if (!(C instanceof com.taobao.taolive.sdk.core.h)) {
            return;
        }
        com.taobao.taolive.sdk.core.h hVar = (com.taobao.taolive.sdk.core.h) C;
        if (hVar.O() == null) {
            return;
        }
        hVar.O().a(new b.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // com.taobao.taolive.sdk.mergeInfo.b.a
            public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
                EnterGoodsData enterGoodsData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
                } else if (unImportantLiveInfoResponseData == null || unImportantLiveInfoResponseData.itemCardListData == null || (enterGoodsData = (EnterGoodsData) tkg.a(unImportantLiveInfoResponseData.itemCardListData, EnterGoodsData.class)) == null) {
                } else {
                    e.a(e.this, enterGoodsData, str);
                }
            }

            @Override // com.taobao.taolive.sdk.mergeInfo.b.a
            public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
                } else if (netResponse == null) {
                } else {
                    e.a(e.this, netResponse.getRetCode(), netResponse.getRetMsg());
                }
            }

            @Override // com.taobao.taolive.sdk.mergeInfo.b.a
            public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
                } else if (netResponse == null) {
                } else {
                    e.a(e.this, netResponse.getRetCode(), netResponse.getRetMsg());
                }
            }
        });
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        for (pox poxVar : this.c) {
            poxVar.onError(str, str2);
        }
    }

    private void a(EnterGoodsData enterGoodsData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6274db0", new Object[]{this, enterGoodsData, str});
            return;
        }
        this.n = enterGoodsData;
        this.n.popId = str;
        his.a("LiveGoodDataCenter", "initEnterLiveData | transferInfo=" + this.o);
        this.o = this.n.itemCardTransferInfo;
        if (this.o == null) {
            this.o = new JSONObject();
        }
        JSONObject jSONObject = this.t;
        if (jSONObject != null) {
            this.o.putAll(jSONObject);
        }
        if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.x()) {
            this.o.remove("customRulesSortDTOList");
        }
        his.a("LiveGoodDataCenter", "initEnterLiveData | new transferInfo=" + this.o);
        a(enterGoodsData);
        for (pox poxVar : this.c) {
            poxVar.onResult(this.n);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        String str2 = null;
        if ("com.taobao.taolive.goods.update.item".equals(str)) {
            if (!(obj instanceof Map)) {
                return;
            }
            Map map = (Map) obj;
            String str3 = (String) map.get("itemId");
            his.a("LiveGoodDataCenter", "onEvent | update item, itemId=" + str3 + "   from=" + ((String) map.get("from")));
            if (!TextUtils.equals(this.e, (String) map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID))) {
                return;
            }
            a(str3, (String) null, (String) null);
        } else if ("com.taobao.taolive.room.addcart".equals(str)) {
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            if (obj instanceof Long) {
                str2 = Long.toString(((Long) obj).longValue());
            }
            if (obj instanceof Integer) {
                str2 = Integer.toString(((Integer) obj).intValue());
            }
            his.b("LiveGoodDataCenter", "onReceive | addCart, itemId=" + str2);
            this.i.a(str2);
        } else if (!xkw.OPEN_INSIDE_DETAIL_EVENT.equals(str) || !(obj instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            String str4 = (String) jSONObject.get("itemId");
            if (TextUtils.isEmpty(str4)) {
                android.taobao.windvane.util.m.e("openInsideDetailPage", "itemId is null");
                hit.a("fail", jSONObject);
                return;
            }
            a(str4, jSONObject);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.goods.update.item", "com.taobao.taolive.room.addcart", xkw.OPEN_INSIDE_DETAIL_EVENT};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.p;
        if (cVar == null) {
            return null;
        }
        return cVar.D();
    }

    public List<b> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.k;
    }

    public void a(String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.j == null || TextUtils.isEmpty(str)) {
        } else {
            com.taobao.taolive.sdk.goodlist.a aVar = this.j.get(str);
            com.taobao.android.live.plugin.atype.flexalocal.good.business.e eVar = new com.taobao.android.live.plugin.atype.flexalocal.good.business.e(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i2), netResponse, obj});
                    }
                }

                {
                    e.this = this;
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    ItemlistV2ResponseData.ItemListv1 itemListv1;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    ItemlistV2ResponseData mo1437getData = ((ItemlistV2Response) netBaseOutDo).mo1437getData();
                    if (mo1437getData == null || mo1437getData.itemListv1 == null || mo1437getData.itemListv1.size() <= 0 || (itemListv1 = mo1437getData.itemListv1.get(0)) == null) {
                        return;
                    }
                    ddw.a().a("com.taobao.taolive.room.goodlist.all.refresh.item.inner", itemListv1.liveItemDO, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c.a(e.d(e.this)));
                    if (!hkk.au() || str2 == null || str3 == null) {
                        return;
                    }
                    e.a(e.this).a(itemListv1.liveItemDO, str2, str3);
                }
            });
            if (aVar != null) {
                i = aVar.c;
            }
            ItemIdentifier itemIdentifier = new ItemIdentifier(i, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(itemIdentifier);
            eVar.a((List<ItemIdentifier>) null, arrayList, (ItemCategory) null, this.p, "");
        }
    }

    public void a(String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.business.e eVar = new com.taobao.android.live.plugin.atype.flexalocal.good.business.e(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                ItemlistV2ResponseData mo1437getData = ((ItemlistV2Response) netBaseOutDo).mo1437getData();
                if (mo1437getData != null && mo1437getData.itemListv1 != null && mo1437getData.itemListv1.size() > 0) {
                    ItemlistV2ResponseData.ItemListv1 itemListv1 = mo1437getData.itemListv1.get(0);
                    if (itemListv1 != null && itemListv1.liveItemDO != null) {
                        EnterGoodsData enterGoodsData = new EnterGoodsData();
                        enterGoodsData.itemHoldType = "insideDetail";
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(itemListv1.liveItemDO);
                        enterGoodsData.curItemList = arrayList;
                        enterGoodsData.holdItemIds = String.valueOf(itemListv1.liveItemDO.itemId);
                        for (com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.a aVar : e.e(e.this)) {
                            aVar.openInsideDetail(enterGoodsData);
                        }
                        hit.a("success", jSONObject);
                        return;
                    }
                    e.a(e.this, jSONObject);
                    return;
                }
                e.a(e.this, jSONObject);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    e.a(e.this, jSONObject);
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    onError(i, netResponse, 0);
                }
            }
        });
        ItemIdentifier itemIdentifier = new ItemIdentifier(0, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(itemIdentifier);
        eVar.a((List<ItemIdentifier>) null, arrayList, (ItemCategory) null, this.p, "");
    }

    public void a(final GoodMsgNew goodMsgNew, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8b072e", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else if (goodMsgNew == null || goodMsgNew.liveItemDO == null) {
            his.a("LiveGoodDataCenter", "onMessageReceived | GoodMsgNew or liveItemDO is null");
        } else if (!goodMsgNew.callbackServer || !hir.G()) {
            his.a("LiveGoodDataCenter", "onMessageReceived | showGoodsItemCard from pm data");
            b(goodMsgNew, z);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(goodMsgNew.liveItemDO.itemId));
            new com.taobao.android.live.plugin.atype.flexalocal.good.business.m(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    LiveItem liveItem;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    EnterGoodsData mo1437getData = ((EnterLiveItemResponse) netBaseOutDo).mo1437getData();
                    if (mo1437getData != null && mo1437getData.curItemList != null && mo1437getData.curItemList.size() > 0 && (liveItem = mo1437getData.curItemList.get(0)) != null) {
                        his.a("LiveGoodDataCenter", "onMessageReceived | showGoodsItemCard from query data");
                        hiq.a(goodMsgNew, liveItem);
                        goodMsgNew.liveItemDO = liveItem;
                    }
                    his.a("LiveGoodDataCenter", "onMessageReceived | showGoodsItemCard from pm data");
                    e.a(e.this, goodMsgNew, z);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    if (netResponse != null) {
                        his.a("LiveGoodDataCenter", "onMessageReceived | showGoodsItemCard from pm data,query data error. msg=" + netResponse.getRetMsg());
                    }
                    e.a(e.this, goodMsgNew, z);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, 0);
                    }
                }
            }).a(this.p, JSONObject.toJSONString(arrayList), qna.a(goodMsgNew.liveItemDO));
        }
    }

    private void b(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7df5c6f", new Object[]{this, goodMsgNew, new Boolean(z)});
            return;
        }
        a aVar = this.i;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.f(goodMsgNew);
        } else {
            aVar.b(goodMsgNew);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        for (com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.a aVar : this.s) {
            aVar.openGoodsPackage();
        }
        hit.a("fail", jSONObject);
    }

    public List<ItemIdentifier> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.g;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        List<ItemIdentifier> list = this.g;
        return (list == null || list.size() <= 0) ? "" : this.g.get(0).itemId;
    }

    public List<ItemlistV2ResponseData.ItemListv1> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.h;
    }

    public void a(List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
            this.g.clear();
        } else {
            this.g = list;
        }
    }

    public EnterGoodsData f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnterGoodsData) ipChange.ipc$dispatch("8a004387", new Object[]{this}) : this.n;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        return jSONObject == null ? this.t : jSONObject;
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        GoodsMsgNewForAddProduct goodsMsgNewForAddProduct;
        GoodMsgNew goodMsgNew;
        JSONObject b2;
        GoodMsgNew goodMsgNew2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 10092 || i == 10091) {
            if (!(obj instanceof TLiveMsg) || (goodsMsgNewForAddProduct = (GoodsMsgNewForAddProduct) JSON.parseObject(new String(((TLiveMsg) obj).data), GoodsMsgNewForAddProduct.class)) == null || goodsMsgNewForAddProduct.goodsList == null || goodsMsgNewForAddProduct.goodsList.isEmpty()) {
                return;
            }
            goodsMsgNewForAddProduct.liveItemDO = goodsMsgNewForAddProduct.goodsList.get(0);
            goodsMsgNewForAddProduct.liveItemDO.goodsIndex = goodsMsgNewForAddProduct.goodsIndex;
            his.a("LiveGoodDataCenter", "onMessageReceived | onMessageProductList, index=" + goodsMsgNewForAddProduct.liveItemDO.goodsIndex);
            a((GoodMsgNew) goodsMsgNewForAddProduct, true);
        } else if (i == 10096) {
            if (!(obj instanceof String) || (goodMsgNew2 = (GoodMsgNew) pqj.a((String) obj, GoodMsgNew.class)) == null || goodMsgNew2.liveItemDO == null) {
                return;
            }
            his.a("LiveGoodDataCenter", "onMessageReceived | onMessageExplanation, index=" + goodMsgNew2.liveItemDO.goodsIndex);
            a(goodMsgNew2, false);
        } else if (i == 10094) {
            if (!(obj instanceof String)) {
                return;
            }
            JSONObject b3 = pqj.b((String) obj);
            ItemSortInfo itemSortInfo = (ItemSortInfo) pqj.a(b3.getString("itemSortInfo"), ItemSortInfo.class);
            LiveItem liveItem = (LiveItem) pqj.a(b3.getString("liveItemDO"), LiveItem.class);
            if (liveItem == null || itemSortInfo == null) {
                return;
            }
            GoodMsgNew goodMsgNew3 = new GoodMsgNew();
            goodMsgNew3.liveItemDO = liveItem;
            goodMsgNew3.itemSortInfo = itemSortInfo;
            his.a("LiveGoodDataCenter", "onMessageReceived | onMessageStopExplanation, index=" + goodMsgNew3.liveItemDO.goodsIndex);
            this.i.a(goodMsgNew3);
        } else if (i == 1070) {
            if (!(obj instanceof String) || (b2 = pqj.b((String) obj)) == null) {
                return;
            }
            long longValue = b2.getLongValue("itemId");
            int intValue = b2.getIntValue("total");
            his.a("LiveGoodDataCenter", "onMessageReceived | onMessageGoodHot, itemid=" + longValue + "    total=" + intValue);
            this.i.b(longValue, intValue);
        } else if (i == 10097) {
            if (!(obj instanceof String) || (goodMsgNew = (GoodMsgNew) pqj.a((String) obj, GoodMsgNew.class)) == null || goodMsgNew.liveItemDO == null) {
                return;
            }
            his.a("LiveGoodDataCenter", "onMessageReceived | onMessageExplanationDelete, index=" + goodMsgNew.liveItemDO.goodsIndex);
            this.i.c(goodMsgNew);
        } else if (i == 1071) {
            if (!(obj instanceof JSONObject)) {
                return;
            }
            this.i.a((JSONObject) obj);
        } else if (i == 10098) {
            GoodMsgNew goodMsgNew4 = (GoodMsgNew) pqj.a((String) obj, GoodMsgNew.class);
            if (goodMsgNew4 == null || goodMsgNew4.liveItemDO == null) {
                return;
            }
            his.a("LiveGoodDataCenter", "onMessageReceived | onUpdateItemFromPM, index=" + goodMsgNew4.liveItemDO.goodsIndex);
            this.i.d(goodMsgNew4);
        } else if (i == 10095) {
            GoodMsgNew goodMsgNew5 = (GoodMsgNew) pqj.a((String) obj, GoodMsgNew.class);
            if (goodMsgNew5 == null || goodMsgNew5.liveItemDO == null) {
                return;
            }
            his.a("LiveGoodDataCenter", "onMessageReceived | onMessageGoodHot, index=" + goodMsgNew5.liveItemDO.goodsIndex);
            this.i.g(goodMsgNew5);
        } else if (!(obj instanceof String)) {
        } else {
            this.f.a((String) obj, i, this.i);
        }
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d50e1b3", new Object[]{this, bVar});
        } else if (bVar == null || this.f13783a.contains(bVar)) {
        } else {
            this.f13783a.add(bVar);
        }
    }

    public void b(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76314252", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.f13783a.remove(bVar);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d515612", new Object[]{this, cVar});
        } else if (cVar == null || this.b.contains(cVar)) {
        } else {
            this.b.add(cVar);
        }
    }

    public void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7631b6b1", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.b.remove(cVar);
        }
    }

    public void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d56ca86", new Object[]{this, oVar});
        } else if (oVar == null || this.q.contains(oVar)) {
        } else {
            this.q.add(oVar);
        }
    }

    public void b(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76372b25", new Object[]{this, oVar});
        } else if (oVar == null) {
        } else {
            this.q.remove(oVar);
        }
    }

    public void a(pox<EnterGoodsData> poxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0771df", new Object[]{this, poxVar});
        } else if (poxVar == null) {
        } else {
            EnterGoodsData enterGoodsData = this.n;
            if (enterGoodsData != null) {
                poxVar.onResult(enterGoodsData);
            } else {
                this.c.add(poxVar);
            }
        }
    }

    public void b(pox<EnterGoodsData> poxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88a7860", new Object[]{this, poxVar});
        } else if (poxVar == null) {
        } else {
            this.c.remove(poxVar);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        his.a("LiveGoodDataCenter", "destroy");
        com.taobao.taolive.sdk.core.b bVar = this.d;
        if (bVar != null) {
            bVar.unRegisterMessageListener(this);
        }
        ddw.a().b(this);
        List<ItemIdentifier> list = this.g;
        if (list != null) {
            list.clear();
        }
        this.h = null;
        this.n = null;
        this.o = null;
        this.t = null;
        this.k.clear();
        this.f13783a.clear();
        this.b.clear();
        this.q.clear();
        this.c.clear();
        this.s.clear();
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.p;
        if (cVar == null) {
            return;
        }
        LocalBroadcastManager.getInstance(cVar.f()).unregisterReceiver(this.r);
    }

    /* loaded from: classes5.dex */
    public class a implements com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b, c, o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1983646296);
            kge.a(-608753430);
            kge.a(496465222);
            kge.a(1196508128);
        }

        public a() {
            e.this = r1;
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void f(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45963181", new Object[]{this, goodMsgNew});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.f(goodMsgNew);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void a(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c30cb866", new Object[]{this, goodMsgNew});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.a(goodMsgNew);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void b(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd283705", new Object[]{this, goodMsgNew});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.b(goodMsgNew);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void c(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f743b5a4", new Object[]{this, goodMsgNew});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.c(goodMsgNew);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void b(long j, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f80268", new Object[]{this, new Long(j), new Integer(i)});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.b(j, i);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void g(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fb1b020", new Object[]{this, goodMsgNew});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.g(goodMsgNew);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.a(jSONObject);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void d(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("115f3443", new Object[]{this, goodMsgNew});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.d(goodMsgNew);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b
        public void a(LiveItem liveItem, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3f39817", new Object[]{this, liveItem, str, str2});
                return;
            }
            for (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.b bVar : e.k(e.this)) {
                bVar.a(liveItem, str, str2);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.c
        public void e(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b7ab2e2", new Object[]{this, goodMsgNew});
                return;
            }
            for (c cVar : e.l(e.this)) {
                cVar.e(goodMsgNew);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.o
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            for (o oVar : e.g(e.this)) {
                oVar.a(str);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.o
        public void p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63fccf7", new Object[]{this});
                return;
            }
            for (o oVar : e.g(e.this)) {
                oVar.p();
            }
        }
    }

    private void a(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0997166", new Object[]{this, enterGoodsData});
        } else if (enterGoodsData == null) {
        } else {
            a(enterGoodsData.expansionRedPacketList);
        }
    }

    public void a(JSONArray jSONArray) {
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.u() || (cVar = this.p) == null || cVar.k()) {
        } else {
            this.k.clear();
            if (jSONArray == null) {
                return;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    this.k.add(new b(jSONObject.getIntValue("index"), jSONObject));
                }
            }
        }
    }

    public void b(List<ItemIdentifier> list) {
        ItemIdentifier itemIdentifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.p;
        if (cVar == null || cVar.k() || list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (b bVar : this.k) {
            bVar.c = "";
            if (list.size() > bVar.f13792a && bVar.f13792a >= 0 && (itemIdentifier = list.get(bVar.f13792a)) != null) {
                bVar.c = itemIdentifier.itemId;
                sb.append("   " + bVar.f13792a + "/" + itemIdentifier.itemId + "/" + itemIdentifier.goodsIndex);
            }
        }
        his.b("LiveGoodDataCenter", "refreshExpandAward | info=" + sb.toString());
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("acceleratorCode");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Iterator<b> it = this.k.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().d, string)) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
