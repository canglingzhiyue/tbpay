package com.taobao.search.sf.detailpre;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.preload.h;
import com.taobao.android.preload.i;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.task.Coordinator;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.kge;
import tb.nog;

/* loaded from: classes8.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0785a Companion;
    public static final String PAGE_CONFIG_DETAIL_PRE_REQUEST_PAGE_TYPE = "detail_pre_request_page";
    public static final String TYPE_PAGE_IN_SHOP_SEARCH = "in_shop_search";
    public static final String TYPE_PAGE_MAIN_SEARCH = "main_search";

    /* renamed from: a  reason: collision with root package name */
    private static final d f19444a;

    /* loaded from: classes8.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CommonSearchResult b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;

        public b(CommonSearchResult commonSearchResult, String str, boolean z, String str2) {
            this.b = commonSearchResult;
            this.c = str;
            this.d = z;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (BaseCellBean baseCellBean : new ArrayList(this.b.getCells())) {
                if (q.a((Object) "item", (Object) baseCellBean.cardType) && (a2 = a.a(a.this, baseCellBean, this.c, this.d)) != null) {
                    jSONArray.add(a2);
                }
            }
            if (jSONArray.size() <= 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "bizName", "page_detail");
            jSONObject2.put((JSONObject) "sourceFrom", this.d ? "shopsearch" : "search");
            jSONObject2.put((JSONObject) "items", (String) jSONArray);
            jSONObject2.put((JSONObject) MtopModule.KEY_PAGE_INDEX, (String) Integer.valueOf(this.b.getPageNo()));
            jSONObject2.put((JSONObject) "pageToken", this.e);
            String jSONString = jSONObject.toJSONString();
            Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
            intent.setPackage("com.taobao.taobao");
            intent.putExtra("updatePreloadDataSource", jSONString);
            Globals.getApplication().sendBroadcast(intent);
        }
    }

    /* loaded from: classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f19447a;

        public c(boolean z) {
            this.f19447a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "bizName", "page_detail");
            String str = "shopsearch";
            jSONObject2.put((JSONObject) "sourceFrom", this.f19447a ? str : "search");
            if (!this.f19447a) {
                str = "search";
            }
            jSONObject2.put((JSONObject) "bucketId", str);
            Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
            intent.setPackage("com.taobao.taobao");
            intent.putExtra("updateBucketId", jSONObject.toJSONString());
            Globals.getApplication().sendBroadcast(intent);
        }
    }

    public static final a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3b805c40", new Object[0]) : Companion.a();
    }

    public final String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{this, new Boolean(z)}) : z ? TYPE_PAGE_IN_SHOP_SEARCH : TYPE_PAGE_MAIN_SEARCH;
    }

    public static final /* synthetic */ JSONObject a(a aVar, BaseTypedBean baseTypedBean, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7d386b96", new Object[]{aVar, baseTypedBean, str, new Boolean(z)}) : aVar.a(baseTypedBean, str, z);
    }

    public static final /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : f19444a;
    }

    /* renamed from: com.taobao.search.sf.detailpre.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0785a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ k[] f19445a;

        static {
            kge.a(46129836);
            f19445a = new k[]{t.a(new PropertyReference1Impl(t.b(C0785a.class), "instance", "getInstance()Lcom/taobao/search/sf/detailpre/DetailPreRequestUtil;"))};
        }

        public final a a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("da2dbfa1", new Object[]{this});
            } else {
                d a2 = a.a();
                C0785a c0785a = a.Companion;
                value = a2.getValue();
            }
            return (a) value;
        }

        private C0785a() {
        }

        public /* synthetic */ C0785a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-612948892);
        Companion = new C0785a(null);
        f19444a = e.a(LazyThreadSafetyMode.SYNCHRONIZED, DetailPreRequestUtil$Companion$instance$2.INSTANCE);
    }

    public final void a(List<? extends MuiseCellBean> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        List<? extends MuiseCellBean> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (z) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (MuiseCellBean muiseCellBean : list) {
            JSONObject a2 = a(muiseCellBean);
            if (a2 != null) {
                jSONArray.add(a2);
            }
        }
        if (jSONArray.size() <= 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "bizName", "new_detail");
        jSONObject2.put((JSONObject) "sourceFrom", "search");
        jSONObject2.put((JSONObject) "items", (String) jSONArray);
        Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
        intent.setPackage("com.taobao.taobao");
        intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, jSONObject.toJSONString());
        h a3 = i.a("new_detail");
        if (a3 == null) {
            return;
        }
        q.a((Object) a3, "PreloadTaskLoaderFactory…r(\"new_detail\") ?: return");
        a3.a(jSONObject.toString());
    }

    public final void a(String str, List<? extends BaseTypedBean> list, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc78bc47", new Object[]{this, str, list, str2, new Boolean(z)});
            return;
        }
        String str3 = str;
        if (str3 != null && str3.length() != 0) {
            z2 = false;
        }
        if (z2 || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (BaseTypedBean baseTypedBean : list) {
            JSONObject a2 = a(baseTypedBean, str2, z);
            if (a2 != null) {
                jSONArray.add(a2);
            }
        }
        if (jSONArray.size() <= 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "bizName", "page_detail");
        jSONObject2.put((JSONObject) "sourceFrom", z ? "shopsearch" : "search");
        jSONObject2.put((JSONObject) "items", (String) jSONArray);
        jSONObject2.put((JSONObject) "pageToken", str);
        Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
        intent.setPackage("com.taobao.taobao");
        intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, jSONObject.toJSONString());
        Globals.getApplication().sendBroadcast(intent);
    }

    public final void a(String str, CommonSearchResult commonSearchResult, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c953d9b", new Object[]{this, str, commonSearchResult, str2, new Boolean(z)});
            return;
        }
        String str3 = str;
        if (str3 != null && str3.length() != 0) {
            z2 = false;
        }
        if (z2 || commonSearchResult == null || commonSearchResult.getCells().isEmpty()) {
            return;
        }
        Coordinator.execute(new b(commonSearchResult, str2, z, str));
    }

    public final void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "bizName", "page_detail");
        jSONObject2.put((JSONObject) "sourceFrom", z ? "shopsearch" : "search");
        jSONObject2.put((JSONObject) "pageToken", str);
        String jSONString = jSONObject.toJSONString();
        Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
        intent.setPackage("com.taobao.taobao");
        intent.putExtra("clearPreloadDataSource", jSONString);
        Globals.getApplication().sendBroadcast(intent);
    }

    public final void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
        } else {
            Coordinator.execute(new c(z));
        }
    }

    public final String b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c557ff5", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return "MainSrp_" + System.currentTimeMillis();
        }
        return "ShopSrp_" + System.currentTimeMillis();
    }

    private final JSONObject a(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("98d2a67f", new Object[]{this, muiseCellBean});
        }
        if (TextUtils.isEmpty(muiseCellBean.ndPreviewUrl)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "url", muiseCellBean.ndPreviewUrl);
        return jSONObject;
    }

    private final JSONObject a(BaseTypedBean baseTypedBean, String str, boolean z) {
        JSONObject jSONObject;
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f9a4ba9", new Object[]{this, baseTypedBean, str, new Boolean(z)});
        }
        if (baseTypedBean == null) {
            return null;
        }
        JSONObject jSONObject2 = null;
        String str2 = "search";
        if (baseTypedBean instanceof MuiseCellBean) {
            JSONObject jSONObject3 = ((MuiseCellBean) baseTypedBean).mMuiseBean.model;
            q.a((Object) jSONObject3, "cellBean.mMuiseBean.model");
            jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                obj2 = "title";
                JSONObject jSONObject4 = jSONObject;
                jSONObject4.put((JSONObject) Constants.KEY_SEARCH_KEYWORD, str);
                jSONObject4.put((JSONObject) "list_param", str + "_" + baseTypedBean.abtest + "_" + baseTypedBean.rn);
            } else {
                obj2 = "title";
            }
            JSONObject jSONObject5 = jSONObject;
            jSONObject5.put((JSONObject) "list_type", str2);
            if (z) {
                str2 = "shopsearch";
            }
            jSONObject5.put((JSONObject) "from", str2);
            jSONObject5.put((JSONObject) "itemId", (String) jSONObject3.get("item_id"));
            jSONObject5.put((JSONObject) "id", (String) jSONObject3.get("item_id"));
            jSONObject5.put((JSONObject) nog.PRD_PICURL, (String) jSONObject3.get(nog.PRD_PICURL));
            JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject3, nog.PRICE_BLOCK);
            if (b2 != null) {
                jSONObject5.put((JSONObject) "price", (String) b2.get("price"));
            }
            Object obj3 = obj2;
            jSONObject5.put((JSONObject) obj3, jSONObject3.get(obj3));
            JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(jSONObject3, "extraParams");
            if (b3 != null) {
                for (String str3 : b3.keySet()) {
                    jSONObject5.put((JSONObject) str3, (String) b3.get(str3));
                }
            }
        } else if (baseTypedBean instanceof SFAuctionBaseCellBean) {
            AuctionBaseBean auctionBaseBean = ((SFAuctionBaseCellBean) baseTypedBean).auctionBaseBean;
            if (auctionBaseBean == null) {
                return null;
            }
            jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                obj = "title";
                JSONObject jSONObject6 = jSONObject;
                jSONObject6.put((JSONObject) Constants.KEY_SEARCH_KEYWORD, str);
                jSONObject6.put((JSONObject) "list_param", str + "_" + baseTypedBean.abtest + "_" + baseTypedBean.rn);
            } else {
                obj = "title";
            }
            JSONObject jSONObject7 = jSONObject;
            jSONObject7.put((JSONObject) "list_type", str2);
            if (z) {
                str2 = "shopsearch";
            }
            jSONObject7.put((JSONObject) "from", str2);
            jSONObject7.put((JSONObject) "itemId", auctionBaseBean.itemId);
            jSONObject7.put((JSONObject) "id", auctionBaseBean.itemId);
            jSONObject7.put((JSONObject) nog.PRD_PICURL, auctionBaseBean.picUrl);
            jSONObject7.put((JSONObject) "price", auctionBaseBean.price);
            jSONObject7.put((JSONObject) obj, (Object) auctionBaseBean.title);
            Map<String, String> map = auctionBaseBean.extraParams;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        jSONObject7.put((JSONObject) key, value);
                    }
                }
            }
        } else if (baseTypedBean instanceof M3CellBean) {
            JSONObject jSONObject8 = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject9 = jSONObject8;
                jSONObject9.put((JSONObject) Constants.KEY_SEARCH_KEYWORD, str);
                jSONObject9.put((JSONObject) "list_param", str + "_" + baseTypedBean.abtest + "_" + baseTypedBean.rn);
            }
            JSONObject jSONObject10 = jSONObject8;
            jSONObject10.put((JSONObject) "list_type", str2);
            if (z) {
                str2 = "shopsearch";
            }
            jSONObject10.put((JSONObject) "from", str2);
            M3CellBean m3CellBean = (M3CellBean) baseTypedBean;
            jSONObject10.put((JSONObject) "itemId", m3CellBean.itemId);
            jSONObject10.put((JSONObject) "id", m3CellBean.itemId);
            JSONObject originData = m3CellBean.getOriginData();
            jSONObject10.put((JSONObject) nog.PRD_PICURL, originData != null ? originData.getString(nog.PRD_PICURL) : null);
            com.taobao.search.m3.price.e priceInfo = m3CellBean.getPriceInfo();
            jSONObject10.put((JSONObject) "price", priceInfo != null ? priceInfo.c() : null);
            jSONObject10.put((JSONObject) "title", m3CellBean.getTitle());
            jSONObject = jSONObject8;
        } else {
            jSONObject = jSONObject2;
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject11 = new JSONObject();
        JSONObject jSONObject12 = jSONObject11;
        jSONObject12.put((JSONObject) "itemId", (String) jSONObject.get("itemId"));
        jSONObject12.put((JSONObject) "queryParams", (String) jSONObject);
        return jSONObject11;
    }
}
