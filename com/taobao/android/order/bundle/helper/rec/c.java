package com.taobao.android.order.bundle.helper.rec;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.monitor.procedure.v;
import com.taobao.search.infoflow.SearchChildRecyclerView;
import com.taobao.search.infoflow.a;
import tb.jqg;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_CHANNEL_SRP = "channelSrp";
    public static final String PARAM_REC_QUERY = "param_rec_query";

    /* renamed from: a  reason: collision with root package name */
    private Context f14556a;
    private int b;
    private OrderRecyclerView c;
    private com.taobao.search.infoflow.a d;
    private View e;
    private SearchChildRecyclerView f;
    private long g;

    static {
        kge.a(1740991860);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ SearchChildRecyclerView a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchChildRecyclerView) ipChange.ipc$dispatch("c1dee091", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ SearchChildRecyclerView a(c cVar, SearchChildRecyclerView searchChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchChildRecyclerView) ipChange.ipc$dispatch("5448235b", new Object[]{cVar, searchChildRecyclerView});
        }
        cVar.f = searchChildRecyclerView;
        return searchChildRecyclerView;
    }

    public static /* synthetic */ OrderRecyclerView b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderRecyclerView) ipChange.ipc$dispatch("9f5a0c25", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ View c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("12ab181f", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ int d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("115bcad1", new Object[]{cVar})).intValue() : cVar.b;
    }

    public c(OrderRecyclerView orderRecyclerView, Context context, JSONObject jSONObject) {
        this.c = orderRecyclerView;
        this.f14556a = context;
        this.b = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        a(context, jSONObject);
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        try {
            if (this.d == null) {
                return;
            }
            if (System.currentTimeMillis() - this.g < 100) {
                return;
            }
            this.d.a(a(jSONObject), true);
        } finally {
            this.g = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.search.infoflow.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.e;
    }

    private void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
            return;
        }
        this.d = com.taobao.search.infoflow.b.a("orderList_search", context);
        JSONObject a2 = a(jSONObject);
        this.g = System.currentTimeMillis();
        this.e = this.d.a(a2, new a.InterfaceC0760a() { // from class: com.taobao.android.order.bundle.helper.rec.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.search.infoflow.a.InterfaceC0760a
            public void a(SearchChildRecyclerView searchChildRecyclerView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9dd555e", new Object[]{this, searchChildRecyclerView});
                    return;
                }
                c.a(c.this, searchChildRecyclerView);
                c.b(c.this).setNestedScrollChild(c.a(c.this));
                searchChildRecyclerView.setNestedScrollParent(c.b(c.this));
                if (c.c(c.this) == null) {
                    return;
                }
                c.c(c.this).setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
            }

            @Override // com.taobao.search.infoflow.a.InterfaceC0760a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (c.c(c.this) == null) {
                    jqg.b("OrderSearchRecommend", "初始化失败");
                } else {
                    c.b(c.this).post(new Runnable() { // from class: com.taobao.android.order.bundle.helper.rec.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (c.b(c.this).hasEndView(c.c(c.this))) {
                            } else {
                                ViewGroup.LayoutParams layoutParams = c.c(c.this).getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = c.d(c.this);
                                } else {
                                    layoutParams = new RecyclerView.LayoutParams(-1, c.d(c.this));
                                }
                                c.c(c.this).setLayoutParams(layoutParams);
                                c.b(c.this).addEndView(c.c(c.this));
                                c.b(c.this).resetScroll();
                            }
                        }
                    });
                    jqg.b("OrderSearchRecommend", "初始化成功");
                }
            }

            @Override // com.taobao.search.infoflow.a.InterfaceC0760a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    jqg.a("OrderSearchRecommend", "初始化失败：", str);
                }
            }
        });
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            String string = jSONObject.getString(PARAM_REC_QUERY);
            if (string == null) {
                string = "";
            }
            jSONObject2.put("q", (Object) string);
        }
        jSONObject2.put("channelSrp", (Object) "gouhou_searchnew");
        return jSONObject2;
    }
}
