package com.taobao.search.m3.widget;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.h;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.search.common.util.k;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.util.g;
import com.taobao.search.mmd.util.j;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.util.Constants;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.dsi;
import tb.emh;
import tb.iru;
import tb.jxz;
import tb.kge;
import tb.noa;
import tb.nog;
import tb.nsp;
import tb.ntm;
import tb.rwf;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0768a Companion;
    private static final HashMap<String, String> j;
    private static final HashSet<String> k;

    /* renamed from: a  reason: collision with root package name */
    private final String f19144a;
    private final iru<com.taobao.search.sf.datasource.c> b;
    private final ListStyle c;
    private final M3CellBean d;
    private final com.taobao.search.m3.widget.b e;
    private final int f;
    private final boolean g;
    private final String h;
    private final String i;

    /* loaded from: classes7.dex */
    public static final class b implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String errCode, String errMsg, boolean z, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, errCode, errMsg, new Boolean(z), map});
                return;
            }
            q.c(errCode, "errCode");
            q.c(errMsg, "errMsg");
            q.c(map, "map");
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else {
                q.c(map, "map");
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;

        public c(List list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = hashMap2;
            hashMap3.put(com.taobao.taolive.room.ui.fanslevel.a.ICON_RENDER, a.a(a.this, this.b));
            hashMap3.put("item_id", a.a(a.this).itemId);
            hashMap3.put("index", String.valueOf(a.b(a.this)));
            iru model = a.c(a.this);
            q.a((Object) model, "model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = model.d();
            q.a((Object) d, "model.scopeDatasource");
            hashMap3.put("q", ((com.taobao.search.sf.datasource.c) d).getKeyword());
            hashMap3.put(aw.PARAM_SEARCH_KEYWORD_RN, a.a(a.this).rn);
            hashMap3.put(nog.PRD_IS_P4P, String.valueOf(a.a(a.this).isP4p));
            HashMap hashMap4 = hashMap;
            hashMap4.put("utLogMap", r.c(JSON.toJSONString(hashMap2)));
            com.taobao.search.mmd.util.e.a(a.d(a.this), "search_itemcard_icon_exposure", 2201, hashMap4);
        }
    }

    /* loaded from: classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.a(a.this, this.b);
            }
        }
    }

    public a(M3CellBean bean, com.taobao.search.m3.widget.b widget, int i, boolean z, String str, String str2) {
        q.c(bean, "bean");
        q.c(widget, "widget");
        this.d = bean;
        this.e = widget;
        this.f = i;
        this.g = z;
        this.h = str;
        this.i = str2;
        l lVar = l.getInstance();
        q.a((Object) lVar, "UTPageHitHelper.getInstance()");
        this.f19144a = lVar.getCurrentPageName();
        this.b = this.e.j();
        this.c = this.e.getContainerListStyle();
    }

    public static final /* synthetic */ M3CellBean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M3CellBean) ipChange.ipc$dispatch("11f23c72", new Object[]{aVar}) : aVar.d;
    }

    public static final /* synthetic */ String a(a aVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b6ff441", new Object[]{aVar, list}) : aVar.b(list);
    }

    public static final /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216ee798", new Object[]{aVar, str});
        } else {
            aVar.b(str);
        }
    }

    public static final /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd826da0", new Object[]{aVar})).intValue() : aVar.f;
    }

    public static final /* synthetic */ iru c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("e84f800e", new Object[]{aVar}) : aVar.b;
    }

    public static final /* synthetic */ String d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe4a5995", new Object[]{aVar}) : aVar.f19144a;
    }

    /* renamed from: com.taobao.search.m3.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0768a {
        static {
            kge.a(-33504957);
        }

        private C0768a() {
        }

        public /* synthetic */ C0768a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1010170949);
        Companion = new C0768a(null);
        j = new HashMap<>();
        k = new HashSet<>();
        j.put("s_btn_addcart", "5");
        j.put("s_btn_buy", "6");
        j.put("double_btn", "0");
        j.put("normal", "0");
        k.add("page");
        k.add("pageSize");
        k.add("pageTraceArgs");
        k.add("pageTraceName");
        k.add("rootPageName");
        k.add("sessionid");
        k.add("style");
        k.add("totalResults");
        k.add("totalPage");
    }

    public final void a(com.taobao.search.m3.widget.c view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59441e0c", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        c(this.d);
        a(this.d);
        b(view);
        m();
        try {
            b(this.d);
        } catch (Exception unused) {
        }
    }

    public final void a(List<com.taobao.search.m3.icons.c> icons) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, icons});
            return;
        }
        q.c(icons, "icons");
        if (icons.isEmpty()) {
            return;
        }
        com.taobao.search.e.a().post(new c(icons));
    }

    private final String b(List<com.taobao.search.m3.icons.c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2162506", new Object[]{this, list});
        }
        StringBuilder sb = new StringBuilder();
        for (com.taobao.search.m3.icons.c cVar : list) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(cVar.f());
        }
        String sb2 = sb.toString();
        q.a((Object) sb2, "iconsStr.toString()");
        return sb2;
    }

    private final void b(com.taobao.search.m3.widget.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd83566b", new Object[]{this, cVar});
            return;
        }
        Map<String, String> e = e();
        Map<String, String> f = f();
        List<com.taobao.search.m3.icons.c> displayIcons = cVar.getDisplayIcons();
        if (displayIcons == null || displayIcons.isEmpty()) {
            return;
        }
        f.put(com.taobao.taolive.room.ui.fanslevel.a.ICON_RENDER, b(displayIcons));
        e.put("utLogMap", r.c(JSON.toJSONString(f)));
        com.taobao.search.mmd.util.e.a(this.f19144a, "search_itemcard_icon_click", 2101, e);
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "Page_SearchItemList";
        }
        boolean exposed = this.d.getExposed();
        boolean exposed2 = this.d.getExposed();
        this.d.setExposed(true);
        if (!exposed2) {
            ntm.a(this.d.getAuctionBean());
        }
        if (exposed) {
            com.taobao.search.mmd.util.e.a(str, "Search-ItemExposure-Again", (int) UtUtils.CHANGED_UPP_EVENT_ID, a(true));
            return;
        }
        com.taobao.search.mmd.util.e.b(str, "Search-ItemExposure", a(false));
        if (str == null) {
            q.a();
        }
        c(str);
    }

    private final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!com.taobao.android.searchbaseframe.util.q.d() || ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
        } else {
            Map<String, String> a2 = a(true);
            a2.put("cardPosition", this.e.ak() == 0 ? "left" : "right");
            a2.put("slideGestureHands", dsi.a());
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str, 19997, "Search-ItemExpose-bxGesture", "", "", a2);
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        }
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!com.taobao.android.searchbaseframe.util.q.d() || ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
        } else {
            Map<String, String> a2 = a(true);
            a2.put("cardPosition", this.e.ak() == 0 ? "left" : "right");
            a2.put("slideGesture", r.c(JSON.toJSONString(dsi.a(n()))));
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(this.f19144a, 19997, "Search-ItemClick-bxGesture", "", "", a2);
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        }
    }

    private final com.taobao.android.external.d n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.external.d) ipChange.ipc$dispatch("e88d7913", new Object[]{this});
        }
        View itemView = this.e.itemView;
        int[] iArr = new int[2];
        itemView.getLocationOnScreen(iArr);
        q.a((Object) itemView, "itemView");
        float width = (itemView.getWidth() / 2.0f) + iArr[0];
        float height = (itemView.getHeight() / 2.0f) + iArr[1];
        com.taobao.android.external.d dVar = new com.taobao.android.external.d();
        dVar.c = itemView.getWidth();
        dVar.d = itemView.getHeight();
        dVar.f12313a = width;
        dVar.b = height;
        return dVar;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.isExposed = true;
        if (com.taobao.search.common.util.r.cK()) {
            l lVar = l.getInstance();
            q.a((Object) lVar, "UTPageHitHelper.getInstance()");
            com.taobao.search.e.a().post(new d(lVar.getCurrentPageName()));
            return;
        }
        try {
            b(this.f19144a);
        } catch (Exception unused) {
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Map<String, String> f = f();
        f.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_column, "0");
        f.put("style", this.c.getValue());
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(f));
    }

    private final void a() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d.isP4p || this.d.getX_qzt_ad() > 0) {
            if (!this.d.getUseAuctionURL() || StringUtils.isEmpty(this.d.getAuctionURL())) {
                str = com.etao.feimagesearch.e.DETAIL_URL_PRE_1s;
            } else {
                str = this.d.getAuctionURL();
                if (str == null) {
                    q.a();
                }
            }
            String str4 = str;
            HashMap hashMap = new HashMap();
            String str5 = this.d.itemId;
            q.a((Object) str5, "bean.itemId");
            hashMap.put("id", str5);
            String str6 = this.d.itemId;
            q.a((Object) str6, "bean.itemId");
            hashMap.put("itemId", str6);
            String title = this.d.getTitle();
            if (title == null) {
                title = "";
            }
            hashMap.put("title", title);
            com.taobao.search.m3.price.e priceInfo = this.d.getPriceInfo();
            if (priceInfo == null || (str2 = priceInfo.c()) == null) {
                str2 = "";
            }
            hashMap.put("price", str2);
            String picPath = this.d.getPicPath();
            if (picPath == null || (str3 = n.a(picPath, "_60x60.jpg", "", false, 4, (Object) null)) == null) {
                str3 = "";
            }
            hashMap.put(nog.PRD_PICURL, str3);
            String prefetchImgRatio = this.d.getPrefetchImgRatio();
            if (prefetchImgRatio != null) {
                hashMap.put("prefetchImgRatio", prefetchImgRatio);
                String picPath2 = q.a((Object) prefetchImgRatio, (Object) emh.sDefaultDimension) ? this.d.getPicPath() : this.d.getUprightImage();
                if (picPath2 == null) {
                    picPath2 = "";
                }
                hashMap.put("prefetchImg", picPath2);
            }
            JSONArray extraParams = this.d.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = extraParams.getJSONObject(i);
                    if (jSONObject != null) {
                        String key = jSONObject.getString("key");
                        String value = jSONObject.getString("value");
                        if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                            q.a((Object) key, "key");
                            q.a((Object) value, "value");
                            hashMap.put(key, value);
                        }
                    }
                }
            }
            JSONObject extDetailParams = this.d.getExtDetailParams();
            if (extDetailParams != null) {
                for (Map.Entry<String, Object> entry : extDetailParams.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        String key2 = entry.getKey();
                        q.a((Object) key2, "entry.key");
                        hashMap.put(key2, entry.getValue().toString());
                    }
                }
            }
            AlimamaAdvertising.instance().handleAdUrlForClickid(a(this.d, str4, hashMap, new HashMap(), !StringUtils.isEmpty(this.d.getAuctionBean().p4pContentUrl) || this.d.isP4p || this.d.getX_qzt_ad() > 0).toString(), false);
        }
    }

    private final void b(M3CellBean m3CellBean) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608dbb2b", new Object[]{this, m3CellBean});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(m3CellBean.getAuctionBean().p4pContentUrl)) {
            str = m3CellBean.getAuctionBean().p4pContentUrl;
            q.a((Object) str, "bean.auctionBean.p4pContentUrl");
        } else if (!StringUtils.isEmpty(m3CellBean.getFinalTargetUrl())) {
            Uri.Builder uri = Uri.parse(m3CellBean.getFinalTargetUrl()).buildUpon();
            if (m3CellBean.isP4p || m3CellBean.getX_qzt_ad() > 0) {
                q.a((Object) uri, "uri");
                a(m3CellBean, uri);
            }
            try {
                uri.appendQueryParameter("spm", d()).toString();
            } catch (Exception unused) {
            }
            c();
            Nav.from(this.e.getActivity()).toUri(uri.build());
            return;
        } else {
            if (!m3CellBean.getUseAuctionURL() || StringUtils.isEmpty(m3CellBean.getAuctionURL())) {
                str = com.etao.feimagesearch.e.DETAIL_URL_PRE_1s;
            } else {
                str = m3CellBean.getAuctionURL();
                if (str == null) {
                    q.a();
                }
            }
            HashMap hashMap2 = hashMap;
            String str4 = m3CellBean.itemId;
            q.a((Object) str4, "bean.itemId");
            hashMap2.put("id", str4);
            String str5 = m3CellBean.itemId;
            q.a((Object) str5, "bean.itemId");
            hashMap2.put("itemId", str5);
            String title = m3CellBean.getTitle();
            if (title == null) {
                title = "";
            }
            hashMap2.put("title", title);
            com.taobao.search.m3.price.e priceInfo = m3CellBean.getPriceInfo();
            if (priceInfo == null || (str2 = priceInfo.c()) == null) {
                str2 = "";
            }
            hashMap2.put("price", str2);
            String picPath = m3CellBean.getPicPath();
            if (picPath == null || (str3 = n.a(picPath, "_60x60.jpg", "", false, 4, (Object) null)) == null) {
                str3 = "";
            }
            hashMap2.put(nog.PRD_PICURL, str3);
            String prefetchImgRatio = m3CellBean.getPrefetchImgRatio();
            if (prefetchImgRatio != null) {
                hashMap2.put("prefetchImgRatio", prefetchImgRatio);
                String picPath2 = q.a((Object) prefetchImgRatio, (Object) emh.sDefaultDimension) ? m3CellBean.getPicPath() : m3CellBean.getUprightImage();
                if (picPath2 == null) {
                    picPath2 = "";
                }
                hashMap2.put("prefetchImg", picPath2);
            }
            JSONArray extraParams = m3CellBean.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = extraParams.getJSONObject(i);
                    if (jSONObject != null) {
                        String key = jSONObject.getString("key");
                        String value = jSONObject.getString("value");
                        if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                            q.a((Object) key, "key");
                            q.a((Object) value, "value");
                            hashMap2.put(key, value);
                        }
                    }
                }
            }
            JSONObject extDetailParams = m3CellBean.getExtDetailParams();
            if (extDetailParams != null) {
                for (Map.Entry<String, Object> entry : extDetailParams.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        String key2 = entry.getKey();
                        q.a((Object) key2, "entry.key");
                        hashMap2.put(key2, entry.getValue().toString());
                    }
                }
            }
        }
        String str6 = str;
        if (StringUtils.isEmpty(str6)) {
            return;
        }
        Uri a2 = a(m3CellBean, str6, hashMap, new HashMap(), !StringUtils.isEmpty(m3CellBean.getAuctionBean().p4pContentUrl) || m3CellBean.isP4p || m3CellBean.getX_qzt_ad() > 0);
        c();
        Nav.from(this.e.getActivity()).toUri(a2);
    }

    private final Uri a(M3CellBean m3CellBean, String str, Map<String, String> map, Map<String, String> map2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("43115e95", new Object[]{this, m3CellBean, str, map, map2, new Boolean(z)});
        }
        Uri.Builder uri = Uri.parse(str).buildUpon();
        q.a((Object) uri, "uri");
        a(uri, "from", "search");
        a(uri, "list_type", "search");
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        a(uri, Constants.KEY_SEARCH_KEYWORD, d2.getKeyword());
        a(uri, "store_id", m3CellBean.getAuctionBean().o2oShopId);
        StringBuilder sb = new StringBuilder();
        iru<com.taobao.search.sf.datasource.c> model2 = this.b;
        q.a((Object) model2, "model");
        com.taobao.search.sf.datasource.c d3 = model2.d();
        q.a((Object) d3, "model.scopeDatasource");
        sb.append(d3.getKeyword());
        sb.append('_');
        sb.append(m3CellBean.abtest);
        sb.append('_');
        sb.append(m3CellBean.rn);
        a(uri, "list_param", sb.toString());
        a(uri, "skuId", m3CellBean.getAuctionBean().skuId);
        a(uri, "spm", d());
        a(uri, noa.KEY_LOC_TYPE, m3CellBean.getAuctionBean().locType);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(uri, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            a(uri, entry2.getKey(), entry2.getValue());
        }
        if (z) {
            a(m3CellBean, uri);
        }
        Uri build = uri.build();
        q.a((Object) build, "uri.build()");
        return build;
    }

    private final void a(Uri.Builder builder, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebca5bc", new Object[]{this, builder, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            builder.appendQueryParameter(str, str2);
        }
    }

    public final void a(M3CellBean bean, Uri.Builder uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1905e304", new Object[]{this, bean, uri});
            return;
        }
        q.c(bean, "bean");
        q.c(uri, "uri");
        String str = bean.getAuctionBean().p4pPid;
        if (str == null) {
            str = this.f == 0 ? "430042_1006" : "430043_1006";
        }
        a(uri, com.taobao.alimama.c.E_URL, bean.getClickUrl());
        if (!StringUtils.isEmpty(bean.getEtype())) {
            a(uri, "etype", bean.getEtype());
        } else {
            a(uri, "etype", "1");
        }
        a(uri, "epid", str);
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        CommonSearchResult it = (CommonSearchResult) d2.getTotalSearchResult();
        if (it == null) {
            return "";
        }
        q.a((Object) it, "it");
        Map<String, String> map = it.getMainInfo().pageTraceArgs;
        if (map == null) {
            return "";
        }
        String str = map.get("spm-cnt");
        String str2 = str;
        if (StringUtils.isEmpty(str2)) {
            return "";
        }
        if (str == null) {
            q.a();
        }
        List b2 = n.b((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null);
        if (b2.size() < 2) {
            return "";
        }
        return ((String) b2.get(0)) + '.' + ((String) b2.get(1)) + ".itemlist." + this.f;
    }

    public final Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tItemType", this.d.type);
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, this.d.rn);
        hashMap.put(aw.PARAM_PVID, this.d.rn);
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        CommonSearchResult it = (CommonSearchResult) d2.getTotalSearchResult();
        if (it != null) {
            q.a((Object) it, "it");
            hashMap.put("sessionid", it.getMainInfo().rn);
            hashMap.put("spm", d());
        }
        hashMap.put("item_id", this.d.itemId);
        hashMap.put("page", String.valueOf(this.d.pageNo));
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(this.f));
        hashMap.put("pagePos", String.valueOf(this.d.pagePos));
        hashMap.put("pageSize", String.valueOf(this.d.pageSize));
        iru<com.taobao.search.sf.datasource.c> model2 = this.b;
        q.a((Object) model2, "model");
        com.taobao.search.sf.datasource.c d3 = model2.d();
        q.a((Object) d3, "model.scopeDatasource");
        hashMap.put("q", d3.getKeyword());
        hashMap.put("style", q.a((Object) this.c.getValue(), (Object) "wf") ? "waterfall" : "list");
        hashMap.put("longPicture", String.valueOf(this.g));
        hashMap.put("business", "all");
        if (this.c == ListStyle.LIST) {
            hashMap.put("videoId", this.d.getAuctionBean().videoId);
        } else {
            hashMap.put("videoId", this.d.getAuctionBean().wfVideoId);
        }
        return hashMap;
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tItemType", this.d.type);
        hashMap.put("x_object_type", "item");
        hashMap.put("srp_seq", String.valueOf(this.d.pageNo));
        hashMap.put("srp_pos", String.valueOf(this.d.pagePos));
        hashMap.put("index", String.valueOf(this.f));
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        CommonSearchResult it = (CommonSearchResult) d2.getTotalSearchResult();
        if (it != null) {
            q.a((Object) it, "it");
            hashMap.put(k.a.PARAM_KEY_FIRST_RN, it.getMainInfo().rn);
        }
        hashMap.put("rainbow", com.taobao.search.rainbow.a.c());
        String str = this.h;
        if (str != null) {
            hashMap.put("picRatio", str);
        }
        JSONObject utLogMap = this.d.getUtLogMap();
        if (utLogMap != null) {
            a(utLogMap, hashMap, (Set<String>) null);
        }
        JSONObject pageInfo = this.d.getPageInfo();
        if (pageInfo != null) {
            a(pageInfo, hashMap, k);
        }
        hashMap.put("pageName", this.f19144a);
        com.taobao.search.m3.interactive.b interactiveInfo = this.d.getInteractiveInfo();
        if (interactiveInfo != null) {
            StringBuilder sb = new StringBuilder();
            for (com.taobao.search.m3.interactive.c cVar : interactiveInfo.a()) {
                if (!StringUtils.isEmpty(cVar.j())) {
                    if (sb.length() > 0) {
                        sb.append("|");
                    }
                    String j2 = cVar.j();
                    if (j2 == null) {
                        q.a();
                    }
                    sb.append(j2);
                }
            }
            if (sb.length() > 0) {
                z = true;
            }
            if (z) {
                hashMap.put("jhss_tag_new", sb.toString());
            }
        }
        return hashMap;
    }

    private final void a(JSONObject jSONObject, Map<String, String> map, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd64622", new Object[]{this, jSONObject, map, set});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            q.a((Object) entry, "iterator.next()");
            Map.Entry<String, Object> entry2 = entry;
            String key = entry2.getKey();
            if (!StringUtils.isEmpty(key) && (set == null || !set.contains(key))) {
                Object value = entry2.getValue();
                String obj = value != null ? value.toString() : null;
                if (!StringUtils.isEmpty(obj)) {
                    q.a((Object) key, "key");
                    map.put(key, obj);
                }
            }
        }
    }

    private final Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("title", this.d.getTitle());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = hashMap2;
        hashMap3.put("index", String.valueOf(this.f));
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        CommonSearchResult it = (CommonSearchResult) d2.getTotalSearchResult();
        if (it != null) {
            q.a((Object) it, "it");
            hashMap3.put(k.a.PARAM_KEY_FIRST_RN, it.getMainInfo().rn);
        }
        hashMap3.put("s_isEl", "0");
        hashMap.put(nog.PRD_IS_P4P, String.valueOf(this.d.isP4p));
        hashMap.put("index", String.valueOf(this.f));
        iru<com.taobao.search.sf.datasource.c> model2 = this.b;
        q.a((Object) model2, "model");
        com.taobao.search.sf.datasource.c d3 = model2.d();
        q.a((Object) d3, "model.scopeDatasource");
        hashMap.put("query", d3.getKeyword());
        iru<com.taobao.search.sf.datasource.c> model3 = this.b;
        q.a((Object) model3, "model");
        com.taobao.search.sf.datasource.c d4 = model3.d();
        q.a((Object) d4, "model.scopeDatasource");
        CommonSearchResult it2 = (CommonSearchResult) d4.getTotalSearchResult();
        if (it2 != null) {
            q.a((Object) it2, "it");
            Map<String, String> map = it2.getMainInfo().pageTraceArgs;
            if (map != null) {
                String str = map.get("spm-cnt");
                if (!StringUtils.isEmpty(str)) {
                    hashMap.put("spm", str);
                }
            }
        }
        hashMap.put("itemId", this.d.itemId);
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, this.d.rn);
        hashMap.put("page", String.valueOf(this.d.pageNo));
        hashMap.put("utLogMap", r.c(JSON.toJSONString(hashMap2)));
        hashMap.put("tItemType", "ms_tb-webb-widget_goods_n_feedback_widget");
        String similarSameUrl = this.d.getSimilarSameUrl();
        if (similarSameUrl != null) {
            String queryParameter = Uri.parse(similarSameUrl).getQueryParameter("sellerId");
            if (!StringUtils.isEmpty(queryParameter)) {
                hashMap.put("sellerId", queryParameter);
            }
        }
        return hashMap;
    }

    public final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        Map<String, String> l = l();
        com.taobao.search.m3.feedback.a feedback = this.d.getFeedback();
        if (feedback == null) {
            q.a();
        }
        JSONObject jSONObject2 = feedback.a().getJSONObject("commonParams");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                if (!StringUtils.isEmpty(key)) {
                    Object value = entry.getValue();
                    String obj = value != null ? value.toString() : null;
                    if (!StringUtils.isEmpty(obj)) {
                        q.a((Object) key, "key");
                        l.put(key, obj);
                    }
                }
            }
        }
        l.put("feedback", str);
        if (jSONObject != null) {
            l.put("coverInfo", r.c(jSONObject.toJSONString()));
        }
        String str2 = this.f19144a;
        com.taobao.search.mmd.util.e.a(str2, this.f19144a + "_ItemFeedbackClick", 2101, l);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.search.mmd.util.e.b(this.f19144a + "_ItemFeedbackExposure", l());
    }

    public final Map<String, String> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913778a1", new Object[]{this, new Boolean(z)});
        }
        Map<String, String> e = e();
        Map<String, String> f = f();
        if (z) {
            f.remove("for_bts");
        }
        e.put("utLogMap", r.c(JSON.toJSONString(f)));
        return e;
    }

    private final void c(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e057ca", new Object[]{this, m3CellBean});
            return;
        }
        String str = m3CellBean.itemId;
        l lVar = l.getInstance();
        q.a((Object) lVar, "UTPageHitHelper.getInstance()");
        String currentPageName = lVar.getCurrentPageName();
        Map<String, String> e = e();
        e.put("utLogMap", JSON.toJSONString(f()));
        String[] a2 = com.taobao.search.jarvis.c.a(e);
        h.a(currentPageName, "Search-ItemClick", "", str, (String[]) Arrays.copyOf(a2, a2.length));
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String str = this.d.itemId;
        l lVar = l.getInstance();
        q.a((Object) lVar, "UTPageHitHelper.getInstance()");
        String currentPageName = lVar.getCurrentPageName();
        Map<String, String> e = e();
        e.put("utLogMap", JSON.toJSONString(f()));
        String[] a2 = com.taobao.search.jarvis.c.a(e);
        h.a(currentPageName, "Page_SearchItemList_Button-longpress", "", str, (String[]) Arrays.copyOf(a2, a2.length));
    }

    public final void a(String arg1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, arg1});
            return;
        }
        q.c(arg1, "arg1");
        String str = this.f19144a;
        com.taobao.search.mmd.util.e.a(str, this.f19144a + '_' + arg1, 2101, a(false));
    }

    public void a(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3b1e8c", new Object[]{this, bean});
            return;
        }
        q.c(bean, "bean");
        String itemId = bean.itemId;
        if (StringUtils.isEmpty(itemId)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "itemId", itemId);
        String str = bean.clickTrace;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((JSONObject) nog.CLICK_TRACE, str);
        JSONObject jSONObject3 = new JSONObject();
        if (bean.getBackCardRqParams() != null) {
            JSONObject backCardRqParams = bean.getBackCardRqParams();
            if (backCardRqParams == null) {
                q.a();
            }
            jSONObject3.putAll(backCardRqParams);
        }
        if (bean.getClickBackParams() != null) {
            JSONObject clickBackParams = bean.getClickBackParams();
            if (clickBackParams == null) {
                q.a();
            }
            jSONObject3.putAll(clickBackParams);
        }
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "style", this.c.getValue());
        String picPath = this.c == ListStyle.LIST ? bean.getPicPath() : bean.getUprightImage();
        if (StringUtils.isEmpty(picPath)) {
            picPath = bean.getPicPath();
        }
        jSONObject4.put((JSONObject) nog.PRD_PICURL, picPath);
        jSONObject4.put((JSONObject) aw.PARAM_SEARCH_KEYWORD_RN, bean.rn);
        jSONObject4.put((JSONObject) "itemId", itemId);
        jSONObject4.put((JSONObject) "page", String.valueOf(bean.pageNo));
        jSONObject4.put((JSONObject) "pagePos", String.valueOf(bean.pagePos));
        jSONObject2.put((JSONObject) "clickTraceParams", (String) jSONObject3);
        if (bean.getBackCardRqParams() != null) {
            jSONObject2.put((JSONObject) "uniqParams", (String) bean.getBackCardRqParams());
        }
        boolean a2 = q.a((Object) "true", (Object) com.taobao.android.searchbaseframe.util.a.a(jSONObject, "needBackInsertCard", "true"));
        Map<String, String> a3 = com.taobao.android.searchbaseframe.util.a.a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "clickTraceParams"));
        q.a((Object) a3, "FastJsonParseUtil.conver…ringMap(clickTraceObject)");
        String string = jSONObject.getString(nog.CLICK_TRACE);
        if (!StringUtils.isEmpty(string)) {
            q.a((Object) itemId, "itemId");
            a(bean, itemId, string, a2, a3);
        }
        q.a((Object) itemId, "itemId");
        a(bean, itemId);
        com.taobao.search.common.util.a a4 = com.taobao.search.common.util.a.a();
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        a4.a(d2.getTab(), itemId, String.valueOf(System.currentTimeMillis()));
        com.taobao.search.mmd.util.e.a("Item", a(false));
    }

    private final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        int i = this.f;
        return this.c == ListStyle.LIST ? i + 1 : i + 2;
    }

    private final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) d2.getTotalSearchResult();
        int i = i();
        if (commonSearchResult != null && i < commonSearchResult.getCellsCount()) {
            return commonSearchResult.getCell(i).isP4p;
        }
        return false;
    }

    private final void a(M3CellBean m3CellBean, String str) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e23d56", new Object[]{this, m3CellBean, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(this.f));
        hashMap.put("page", String.valueOf(m3CellBean.pageNo));
        hashMap.put("trigger_item_id", str);
        hashMap.put("pv_pos", String.valueOf(m3CellBean.pagePos));
        String str2 = m3CellBean.rn;
        q.a((Object) str2, "bean.rn");
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, str2);
        hashMap.put("pv_size", String.valueOf(m3CellBean.pageSize));
        hashMap.put("below_p4p", String.valueOf(j()));
        hashMap.put("below_pos", String.valueOf(i()));
        try {
            View view = this.e.itemView;
            q.a((Object) view, "widget.itemView");
            hashMap.put("bottom", String.valueOf(com.taobao.search.common.util.l.b(view.getBottom())));
            View view2 = this.e.itemView;
            q.a((Object) view2, "widget.itemView");
            parent = view2.getParent();
        } catch (Throwable unused) {
        }
        if (parent != null) {
            hashMap.put("screen_height", String.valueOf(com.taobao.search.common.util.l.b(((ViewGroup) parent).getHeight())));
            a(hashMap);
            this.e.a(new jxz(str, hashMap), "childPageWidget");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    private final void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        View view = this.e.itemView;
        q.a((Object) view, "widget.itemView");
        ViewParent parent = view.getParent();
        if (!(parent instanceof PartnerRecyclerView)) {
            parent = null;
        }
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) parent;
        if (partnerRecyclerView == null) {
            return;
        }
        int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
        View lastVisibleView = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 1);
        RecyclerView.ViewHolder childViewHolder = partnerRecyclerView.getChildViewHolder(lastVisibleView);
        q.a((Object) childViewHolder, "partnerRecyclerView.getC…ewHolder(lastVisibleView)");
        int layoutPosition = childViewHolder.getLayoutPosition() - headerViewsCount;
        q.a((Object) lastVisibleView, "lastVisibleView");
        int b2 = com.taobao.search.common.util.l.b(lastVisibleView.getTop());
        View lastTwoVisibleView = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 2);
        RecyclerView.ViewHolder childViewHolder2 = partnerRecyclerView.getChildViewHolder(lastTwoVisibleView);
        q.a((Object) childViewHolder2, "partnerRecyclerView.getC…older(lastTwoVisibleView)");
        int layoutPosition2 = childViewHolder2.getLayoutPosition() - headerViewsCount;
        q.a((Object) lastTwoVisibleView, "lastTwoVisibleView");
        int b3 = com.taobao.search.common.util.l.b(lastTwoVisibleView.getTop());
        StringBuilder sb = new StringBuilder();
        sb.append(layoutPosition2);
        sb.append(',');
        sb.append(layoutPosition);
        map.put("last_expose_pos_list", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b3);
        sb2.append(',');
        sb2.append(b2);
        map.put("last_expose_top_height_list", sb2.toString());
    }

    private final void a(M3CellBean m3CellBean, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7c5379", new Object[]{this, m3CellBean, map});
            return;
        }
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        if (d2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.mainsearch.MainSearchDatasource");
        }
        nsp nspVar = (nsp) d2;
        CommonSearchResult commonSearchResult = (CommonSearchResult) nspVar.getTotalSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        q.a((Object) commonSearchResult, "datasource.totalSearchResult ?: return");
        map.put("tab", nspVar.getTab());
        map.put(aw.PARAM_SEARCH_KEYWORD_RN, m3CellBean.rn);
        map.put(noa.KEY_EDITION_CODE, g.d());
        map.put("elderHome", String.valueOf(j.INSTANCE.a()));
        iru<com.taobao.search.sf.datasource.c> model2 = this.b;
        q.a((Object) model2, "model");
        map.put(noa.KEY_GRAY_HAIR, String.valueOf(model2.f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN)));
        int i = this.f;
        int d3 = rwf.d(commonSearchResult.getCellsCount(), i + 10);
        StringBuilder sb = new StringBuilder();
        for (int c2 = rwf.c(0, i - 10); c2 < d3; c2++) {
            BaseCellBean cell = commonSearchResult.getCell(c2);
            if (StringUtils.equals("item", cell.cardType)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(cell.itemId);
            }
        }
        map.put("nearbyItems", sb.toString());
        int i2 = i + 1;
        String str = "";
        String str2 = commonSearchResult.getCellsCount() > i2 ? commonSearchResult.getCell(i2).type : str;
        q.a((Object) str2, "if (result.cellsCount > …osition + 1).type else \"\"");
        int i3 = i + 2;
        if (commonSearchResult.getCellsCount() > i3) {
            str = commonSearchResult.getCell(i3).type;
        }
        q.a((Object) str, "if (result.cellsCount > …osition + 2).type else \"\"");
        map.put("nextItemsType", str2 + ',' + str);
        map.put("sessionid", commonSearchResult.getMainInfo().rn);
        if (!StringUtils.isEmpty(commonSearchResult.sessionId)) {
            map.put("sessionId", commonSearchResult.sessionId);
        }
        if (!StringUtils.isEmpty(commonSearchResult.spClientSession)) {
            map.put("sp_client_session", commonSearchResult.spClientSession);
        }
        map.put("jarvis_dynamic_card", String.valueOf(false));
        map.put("max_page", String.valueOf(nspVar.getCurrentPage()));
        nspVar.a(map);
        map.put(noa.KEY_P4P_S, String.valueOf(nspVar.k()));
        map.put(noa.KEY_ITEM_S, String.valueOf(nspVar.j()));
        View view = this.e.itemView;
        q.a((Object) view, "widget.itemView");
        map.put("bottom", String.valueOf(com.taobao.search.common.util.l.b(view.getBottom())));
        View view2 = this.e.itemView;
        q.a((Object) view2, "widget.itemView");
        ViewParent parent = view2.getParent();
        if (parent != null) {
            map.put("screenHeight", String.valueOf(com.taobao.search.common.util.l.b(((ViewGroup) parent).getHeight())));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    private final void a(M3CellBean m3CellBean, String str, String str2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a263d1", new Object[]{this, m3CellBean, str, str2, new Boolean(z), map});
            return;
        }
        iru<com.taobao.search.sf.datasource.c> model = this.b;
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        if (d2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.mainsearch.MainSearchDatasource");
        }
        nsp nspVar = (nsp) d2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("itemId", str);
        a(m3CellBean, hashMap2);
        if (map == null) {
            q.a();
        }
        hashMap.putAll(map);
        com.taobao.search.sf.realtimetag.d.a(str2, hashMap2, this.e.getActivity(), this.f, z, nspVar.K());
    }

    public final void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!StringUtils.isEmpty(this.d.itemId)) {
            if (com.taobao.search.common.util.r.N() && this.d.getJiaGouUt()) {
                a();
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = hashMap;
            String str2 = this.d.itemId;
            q.a((Object) str2, "bean.itemId");
            hashMap2.put("itemId", str2);
            hashMap2.put("bizName", "taobao_main_search");
            String skuSourceType = this.d.getSkuSourceType();
            if (skuSourceType == null || (str = j.get(skuSourceType)) == null) {
                str = "0";
            }
            hashMap2.put("sourceType", str);
            JSONObject jSONObject = new JSONObject();
            hashMap2.put("exParams", jSONObject);
            StringBuilder sb = new StringBuilder();
            if (!StringUtils.isEmpty(this.d.getAuctionBean().locType)) {
                jSONObject.put((JSONObject) noa.KEY_LOC_TYPE, this.d.getAuctionBean().locType);
                sb.append(noa.KEY_LOC_TYPE);
            }
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "bizName", (String) hashMap.get("bizName"));
            JSONArray extraParams = this.d.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = extraParams.getJSONObject(i);
                    if (jSONObject3 != null) {
                        String string = jSONObject3.getString("key");
                        if (!StringUtils.isEmpty(string)) {
                            String string2 = jSONObject3.getString("value");
                            if (!StringUtils.isEmpty(string2)) {
                                jSONObject2.put((JSONObject) string, string2);
                                if (sb.length() > 0) {
                                    sb.append(",");
                                }
                                sb.append(string);
                            }
                        }
                    }
                }
            }
            try {
                com.taobao.android.msoa.c.a().a(new com.taobao.android.msoa.h("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "msoa.taobao.search", hashMap2), new b());
            } catch (Exception unused) {
            }
        }
    }
}
