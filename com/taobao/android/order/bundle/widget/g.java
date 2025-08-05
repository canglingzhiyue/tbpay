package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.weex2.Weex2ContainerFrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.dcn;
import tb.hyk;
import tb.hyo;
import tb.kge;
import tb.ria;

/* loaded from: classes6.dex */
public class g implements f, com.taobao.android.order.core.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f14596a;
    private ria b;
    private String c;

    /* loaded from: classes6.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void a(TBSwipeRefreshLayout tBSwipeRefreshLayout);

        void b(TBSwipeRefreshLayout tBSwipeRefreshLayout);

        void b(String str);

        String g();

        Context getContainerContext();

        void h();

        void updateCurrentContainView(View view);
    }

    static {
        kge.a(-384171703);
        kge.a(1245873222);
        kge.a(-1696314990);
    }

    @Override // com.taobao.android.order.core.d
    public LinearLayout d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("7379c0de", new Object[]{this, view});
        }
        return null;
    }

    public static /* synthetic */ a a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("326643d1", new Object[]{gVar}) : gVar.f14596a;
    }

    public g(a aVar) {
        this.f14596a = aVar;
    }

    @Override // com.taobao.android.order.core.d
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_order_list, (ViewGroup) null, false);
        RecyclerView recyclerView = (OrderRecyclerView) inflate.findViewById(R.id.recycler_view);
        if (recyclerView != null) {
            com.taobao.android.order.bundle.widget.recycle.e eVar = new com.taobao.android.order.bundle.widget.recycle.e(context);
            eVar.a(recyclerView);
            ria riaVar = this.b;
            if (riaVar != null) {
                eVar.a(riaVar);
            }
            recyclerView.setLayoutManager(eVar);
            hyo.a(recyclerView);
            if (hyk.P()) {
                recyclerView.setItemAnimator(null);
            }
        }
        final TBSwipeRefreshLayout tBSwipeRefreshLayout = (TBSwipeRefreshLayout) inflate.findViewById(R.id.order_list_uikit);
        tBSwipeRefreshLayout.enablePullRefresh(true);
        tBSwipeRefreshLayout.enableLoadMore(true);
        tBSwipeRefreshLayout.setDragRate(0.5f);
        String[] strArr = {com.alibaba.ability.localization.b.a(R.string.order_biz_reload_page), com.alibaba.ability.localization.b.a(R.string.order_biz_release_to_refresh), com.alibaba.ability.localization.b.a(R.string.order_biz_loading_progress), com.alibaba.ability.localization.b.a(R.string.order_biz_load_completed)};
        TBRefreshHeader refresHeader = tBSwipeRefreshLayout.getRefresHeader();
        refresHeader.setRefreshTips(strArr);
        refresHeader.setRefreshTipColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
        if (refresHeader instanceof TBOldRefreshHeader) {
            ((TBOldRefreshHeader) refresHeader).setRefreshTipSize(this.f14596a.getContainerContext().getResources().getDimensionPixelSize(R.dimen.order_refresh_head_tips_size));
        }
        TBLoadMoreFooter loadMoreFooter = tBSwipeRefreshLayout.getLoadMoreFooter();
        loadMoreFooter.setLoadMoreTips(new String[]{com.alibaba.ability.localization.b.a(R.string.order_biz_load_more), com.alibaba.ability.localization.b.a(R.string.order_biz_release_to_load_next2), com.alibaba.ability.localization.b.a(R.string.order_biz_loading_progress), com.alibaba.ability.localization.b.a(R.string.order_biz_load_completed)});
        loadMoreFooter.setLoadMoreTipColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
        tBSwipeRefreshLayout.setOnPullRefreshListener(new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.android.order.bundle.widget.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onPullDistance(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                } else {
                    g.a(g.this).a(tBSwipeRefreshLayout);
                }
            }
        });
        tBSwipeRefreshLayout.setOnPushLoadMoreListener(new TBSwipeRefreshLayout.OnPushLoadMoreListener() { // from class: com.taobao.android.order.bundle.widget.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onLoadMore() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4a87be1", new Object[]{this});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("78cecfe0", new Object[]{this, loadMoreState, loadMoreState2});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onPushDistance(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b554b6e", new Object[]{this, new Integer(i)});
                }
            }
        });
        inflate.setTag(R.id.bottom_layout, (LinearLayout) inflate.findViewById(R.id.bottom_layout));
        inflate.setTag(R.id.order_list_uikit, tBSwipeRefreshLayout);
        inflate.setTag(R.id.recycler_view, recyclerView);
        inflate.setTag(R.id.foreground, (ViewGroup) inflate.findViewById(R.id.foreground));
        return inflate;
    }

    @Override // com.taobao.android.order.core.d
    public ViewGroup a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        return (ViewGroup) view.getTag(R.id.order_list_uikit);
    }

    @Override // com.taobao.android.order.core.d
    public RecyclerView b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("45b7b65b", new Object[]{this, view});
        }
        if (view.getTag(R.id.order_list_uikit) instanceof TBSwipeRefreshLayout) {
            this.f14596a.b((TBSwipeRefreshLayout) view.getTag(R.id.order_list_uikit));
        }
        this.f14596a.updateCurrentContainView(view);
        return (RecyclerView) view.getTag(R.id.recycler_view);
    }

    @Override // com.taobao.android.order.core.d
    public ViewGroup e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cc91986f", new Object[]{this, view});
        }
        if (dcn.a() || view == null) {
            return null;
        }
        return (ViewGroup) view.getTag(R.id.foreground);
    }

    @Override // com.taobao.android.order.core.d
    public LinearLayout c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("45a1267f", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        return (LinearLayout) view.getTag(R.id.bottom_layout);
    }

    @Override // com.taobao.android.order.core.d
    public void a(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1260263", new Object[]{this, view, new Integer(i), str});
        } else if (view == null) {
        } else {
            this.c = null;
            this.f14596a.updateCurrentContainView(view);
            OrderRecyclerView g = g(view);
            if (d(view) != null) {
                d(view).removeAllViews();
            }
            if (c(view) != null) {
                c(view).removeAllViews();
            }
            ViewGroup e = e(view);
            if (e != null && !this.f14596a.g().equals(str)) {
                e.removeAllViews();
            }
            if (g != null) {
                g.removeAllEndViews();
            }
            this.f14596a.b(str);
        }
    }

    @Override // com.taobao.android.order.core.d
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        a aVar = this.f14596a;
        if (aVar == null) {
            return;
        }
        aVar.a(jSONObject);
    }

    @Override // com.taobao.android.order.core.d
    public void b(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6677124", new Object[]{this, view, new Integer(i), str});
            return;
        }
        a aVar = this.f14596a;
        if (aVar != null) {
            aVar.h();
        }
        a(view, i, str);
    }

    private OrderRecyclerView g(View view) {
        OrderRecyclerView orderRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderRecyclerView) ipChange.ipc$dispatch("a99047dd", new Object[]{this, view});
        }
        if (view != null && (orderRecyclerView = (OrderRecyclerView) view.findViewById(R.id.recycler_view)) != null) {
            return orderRecyclerView;
        }
        return null;
    }

    @Override // com.taobao.android.order.core.d
    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
            return;
        }
        OrderRecyclerView g = g(view);
        if (g == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = g.getLayoutManager();
        if (!(layoutManager instanceof com.taobao.android.order.bundle.widget.recycle.e)) {
            return;
        }
        ((com.taobao.android.order.bundle.widget.recycle.e) layoutManager).a(z);
    }

    @Override // com.taobao.android.order.bundle.widget.f
    public void a(RecyclerView recyclerView, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef49307", new Object[]{this, recyclerView, view, new Integer(i)});
        } else if (i != 0) {
        } else {
            h(view);
        }
    }

    @Override // com.taobao.android.order.bundle.widget.f
    public void a(RecyclerView recyclerView, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9e40dc", new Object[]{this, recyclerView, view, new Integer(i), new Integer(i2)});
        } else {
            a(view, i2);
        }
    }

    public void a(ria riaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd12218e", new Object[]{this, riaVar});
        } else {
            this.b = riaVar;
        }
    }

    private void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790ccb83", new Object[]{this, view});
            return;
        }
        MUSDKInstance f = f(view);
        if (f == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "idle");
        this.c = "idle";
        f.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "orderList.endScroll", jSONObject);
    }

    private void a(View view, int i) {
        MUSDKInstance f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (Math.abs(i) <= 3 || (f = f(view)) == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (i > 0) {
                if ("scrollToTop".equals(this.c)) {
                    return;
                }
                this.c = "scrollToTop";
                jSONObject.put("direction", "top");
            } else if (i < 0) {
                if ("scrollToBottom".equals(this.c)) {
                    return;
                }
                this.c = "scrollToBottom";
                jSONObject.put("direction", "bottom");
            }
            f.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "orderList.beginScroll", jSONObject);
        }
    }

    public MUSDKInstance f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("a548dd6b", new Object[]{this, view});
        }
        ViewGroup e = e(view);
        if (e == null || e.getChildCount() == 0) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) e.getChildAt(0);
        if (!(viewGroup instanceof Weex2ContainerFrameLayout)) {
            return null;
        }
        return ((Weex2ContainerFrameLayout) viewGroup).getMUSInstance();
    }
}
