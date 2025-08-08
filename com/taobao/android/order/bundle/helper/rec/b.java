package com.taobao.android.order.bundle.helper.rec;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.alibaba.android.ultron.vfw.listcontainer.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.monitor.procedure.v;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cts;
import tb.ept;
import tb.hyk;
import tb.hyn;
import tb.jqg;
import tb.kge;
import tb.ksk;
import tb.mya;
import tb.osc;
import tb.osd;
import tb.osm;
import tb.otf;

/* loaded from: classes6.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private OrderRecyclerView f14551a;
    private RecyclerView b;
    private boolean c;
    private osd d;
    private int e;
    private Map<String, Object> g = new HashMap();
    private osc h = new osc() { // from class: com.taobao.android.order.bundle.helper.rec.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.osc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                b.a(b.this);
            }
        }

        @Override // tb.osc
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            jqg.a("OrderGuessRecommend", "onError-猜你喜欢回调异常", "猜你喜欢入参" + b.b(b.this).toString());
        }
    };

    static {
        kge.a(-534404980);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.listcontainer.c a(b bVar, otf otfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.listcontainer.c) ipChange.ipc$dispatch("2fb4a145", new Object[]{bVar, otfVar}) : bVar.a(otfVar);
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b9fd3c", new Object[]{bVar});
        } else {
            bVar.f();
        }
    }

    public static /* synthetic */ Map b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("39d9ae72", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ OrderRecyclerView c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderRecyclerView) ipChange.ipc$dispatch("241e9f03", new Object[]{bVar}) : bVar.f14551a;
    }

    public b(OrderRecyclerView orderRecyclerView, Context context) {
        this.f14551a = orderRecyclerView;
        a(context);
        this.d = osd.a(a(""));
        osd osdVar = this.d;
        if (osdVar != null) {
            osdVar.a(this.h);
            OrderRecyclerView orderRecyclerView2 = this.f14551a;
            if (orderRecyclerView2 == null || this.b != null) {
                return;
            }
            this.b = this.d.a(orderRecyclerView2.getContext());
            this.b.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        osd osdVar = this.d;
        if (osdVar == null || this.f14551a == null) {
            return;
        }
        osdVar.a(new osm.a() { // from class: com.taobao.android.order.bundle.helper.rec.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osm.a
            public void a(otf otfVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f890e017", new Object[]{this, otfVar});
                    return;
                }
                RecyclerView.Adapter adapter = b.c(b.this).getAdapter();
                if (adapter == null) {
                    return;
                }
                com.alibaba.android.ultron.vfw.listcontainer.c a2 = b.a(b.this, otfVar);
                if (a2 == null) {
                    com.alibaba.android.ultron.vfw.listcontainer.b.a(b.c(b.this), adapter.getItemCount() - 1);
                } else {
                    com.alibaba.android.ultron.vfw.listcontainer.b.a(b.c(b.this), adapter.getItemCount() - 1, a2);
                }
            }
        });
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a(boolean z) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (!z || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            this.d.b(a(jSONObject.getString("fromPageType")));
            hyn.a("OrderGuessRecommend", "requestRecommend", ept.SUB_BIND_VIEW, "数据绑定", jSONObject.toJSONString());
            if (this.d == null) {
                return;
            }
            if (jSONObject.getString("fromPageType") == null || cts.a.BIZ_ORDER_DETAIL.equals(jSONObject.getString("fromPageType"))) {
                z = true;
            }
            boolean equals = "Page_NewLogisticsDetail".equals(jSONObject.getString("fromPageType"));
            if (z || equals) {
                JSONArray jSONArray = jSONObject.getJSONArray("subAuctionIds");
                JSONArray jSONArray2 = jSONObject.getJSONArray("subCatIds");
                String string = jSONObject.getString("mainOrderId");
                if (jSONArray == null) {
                    jqg.b("OrderGuessRecommend", "itemIdListJson is null");
                    return;
                } else if (jSONArray2 == null) {
                    jqg.b("OrderGuessRecommend", "catIdJson is null");
                    return;
                } else {
                    String a2 = a(JSONObject.parseArray(jSONArray.toJSONString(), String.class));
                    if (!StringUtils.isEmpty(a2)) {
                        this.g.put("itemIds", a2);
                    }
                    String a3 = a(JSONObject.parseArray(jSONArray2.toJSONString(), String.class));
                    if (!StringUtils.isEmpty(a3)) {
                        this.g.put("catIds", a3);
                    }
                    if (!equals) {
                        this.g.put("appid", 1639);
                    }
                    if (jSONObject.getJSONObject("data") != null) {
                        this.g.put("statusCode", jSONObject.getJSONObject("data").getString("statusCode"));
                    }
                    Map<String, Object> map = this.g;
                    if (string == null) {
                        string = "";
                    }
                    map.put("orderId", string);
                    jSONObject = new JSONObject(this.g);
                    String a4 = ParallelBizValueHelper.a(equals ? ParallelBizValueHelper.PageType.logistics_detail : ParallelBizValueHelper.PageType.order_detail);
                    jqg.b("OrderGuessRecommend", "Recommend-" + a4);
                    h();
                }
            } else {
                jSONObject.put("appid", (Object) 2497);
                if (!StringUtils.isEmpty(str)) {
                    jSONObject.put(TBSearchChiTuJSBridge.ABTEST, (Object) str);
                }
                jSONObject.remove("fromPageType");
                jSONObject.put("isNeedSubSelectionData", (Object) true);
            }
            this.d.c(jSONObject);
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        osd osdVar = this.d;
        if (osdVar == null) {
            return;
        }
        osdVar.a((osc) null);
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        osd osdVar = this.d;
        if (osdVar == null) {
            return;
        }
        osdVar.a((Map<String, Object>) null);
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        osd osdVar = this.d;
        if (osdVar == null) {
            return;
        }
        try {
            osdVar.e();
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.b;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        osd osdVar = this.d;
        if (osdVar == null) {
            return;
        }
        osdVar.a(str);
    }

    private void f() {
        OrderRecyclerView orderRecyclerView;
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        hyn.a("OrderGuessRecommend", "dealOnSuccessData", "IRecommendCallback success");
        if (this.d == null || (orderRecyclerView = this.f14551a) == null || (recyclerView = this.b) == null) {
            return;
        }
        if (!orderRecyclerView.hasEndView(recyclerView)) {
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.e;
                this.b.setLayoutParams(layoutParams);
            } else {
                this.b.setLayoutParams(new RecyclerView.LayoutParams(-1, this.e));
            }
            RecyclerView recyclerView2 = this.b;
            if (recyclerView2 instanceof ChildRecyclerView) {
                this.f14551a.setNestedScrollChild((mya) recyclerView2);
                ((ChildRecyclerView) this.b).setNestedScrollParent(this.f14551a);
            }
            this.f14551a.addEndView(this.b);
            this.f14551a.resetScroll();
        }
        RecyclerView recyclerView3 = this.b;
        if (this.c) {
            i = 8;
        }
        recyclerView3.setVisibility(i);
        this.b.getAdapter().notifyDataSetChanged();
    }

    private com.alibaba.android.ultron.vfw.listcontainer.c a(otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.listcontainer.c) ipChange.ipc$dispatch("14079099", new Object[]{this, otfVar});
        }
        if (otfVar == null) {
            return null;
        }
        com.alibaba.android.ultron.vfw.listcontainer.c cVar = new com.alibaba.android.ultron.vfw.listcontainer.c();
        cVar.a(otfVar.a());
        cVar.b(otfVar.c());
        if (otfVar.b() != null) {
            cVar.a(otfVar.b());
        }
        cVar.a(g());
        return cVar;
    }

    private d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2e835a81", new Object[]{this}) : new d() { // from class: com.taobao.android.order.bundle.helper.rec.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.listcontainer.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (b.c(b.this) == null) {
                } else {
                    b.c(b.this).stopScroll();
                }
            }
        };
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.e = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        }
    }

    private ksk a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksk) ipChange.ipc$dispatch("7c71ae71", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -754911396) {
            if (hashCode != 156718644) {
                if (hashCode == 1066906043 && str.equals("Page_OrderList_Catapult")) {
                    c = 0;
                }
            } else if (str.equals("Page_NewLogisticsDetail")) {
                c = 2;
            }
        } else if (str.equals(cts.a.BIZ_ORDER_LIST)) {
            c = 1;
        }
        if (c == 0) {
            return ksk.REC_ORDER_LIST_CATAPULT;
        }
        if (c == 1) {
            return ksk.REC_ORDER_LIST;
        }
        if (c == 2) {
            return ksk.REC_LOGISTICS;
        }
        return ksk.REC_ORDER_DETAIL;
    }

    private String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                if (!StringUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                return sb.deleteCharAt(sb.length() - 1).toString();
            }
        }
        return null;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!hyk.f() || this.f14551a == null) {
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && (recyclerView.getAdapter() instanceof h)) {
                ((h) this.b.getAdapter()).b(0);
            }
            this.f14551a.post(new Runnable() { // from class: com.taobao.android.order.bundle.helper.rec.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this);
                    }
                }
            });
        }
    }
}
