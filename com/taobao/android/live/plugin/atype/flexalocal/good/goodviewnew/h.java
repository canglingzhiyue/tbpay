package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.hin;
import tb.hiq;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CART_ANIM_DURATION = 500;

    static {
        kge.a(2051017929);
    }

    public static void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, ViewGroup viewGroup, View view, View view2, View view3) {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3657d03a", new Object[]{cVar, str, viewGroup, view, view2, view3});
        } else if (cVar == null || viewGroup == null || view == null || view2 == null || StringUtils.isEmpty(str)) {
            his.b("AddCartAnimHelper", "addCartAnim | params empty.");
        } else if (!(cVar.f() instanceof Activity)) {
        } else {
            String a2 = hiq.a(cVar.f());
            String simpleName = ((Activity) cVar.f()).getClass().getSimpleName();
            if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(simpleName)) {
                return;
            }
            if (!a2.contains(simpleName)) {
                his.b("AddCartAnimHelper", "onAddCart | currentTop=" + a2 + " curr=" + simpleName);
                return;
            }
            com.taobao.taolive.sdk.goodlist.a a3 = cVar.a(str);
            if (a3 == null || a3.b == null) {
                his.b("AddCartAnimHelper", "not have item.");
                return;
            }
            String string = a3.b.getString("itemPic");
            if (StringUtils.isEmpty(string) || (inflate = LayoutInflater.from(cVar.f()).inflate(R.layout.taolive_goods_cart_item_anim_view, (ViewGroup) null)) == null) {
                return;
            }
            int a4 = hin.a(cVar.f(), 30.0f);
            viewGroup.addView(inflate, new FrameLayout.LayoutParams(a4, a4));
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.taolive_goods_view_cart_anim_view);
            if (tUrlImageView == null) {
                return;
            }
            tUrlImageView.setVisibility(0);
            tUrlImageView.setImageUrl(string);
            com.taobao.android.live.plugin.atype.flexalocal.good.showcase.h.a(inflate, view, view2, view3, 500L);
        }
    }

    public static DXWidgetNode a(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f64012ff", new Object[]{recyclerView, str});
        }
        if (recyclerView != null && !StringUtils.isEmpty(str)) {
            try {
                int childCount = recyclerView.getLayoutManager().getChildCount();
                for (int i = 0; i < childCount; i++) {
                    DXWidgetNode a2 = a(recyclerView.getLayoutManager().getChildAt(i), str);
                    if (a2 != null) {
                        return a2;
                    }
                }
            } catch (Exception e) {
                his.b("AddCartAnimHelper", "findNodeByUserId | e=" + e.getMessage());
            }
        }
        return null;
    }

    public static DXWidgetNode a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e48cbd3", new Object[]{view, str});
        }
        if (view instanceof DXRootView) {
            return a((DXRootView) view, str);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        return a(viewGroup.getChildAt(0), str);
    }

    public static DXWidgetNode a(DXRootView dXRootView, String str) {
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("fa23e692", new Object[]{dXRootView, str});
        }
        if (dXRootView == null || StringUtils.isEmpty(str)) {
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (dXRootView == null || (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str)) == null) {
            return null;
        }
        his.a("AddCartAnimHelper", "findNodeByUserIdInDX | userId=" + str + "   dxRootView=" + dXRootView.getDxTemplateItem());
        return queryWidgetNodeByUserId;
    }

    public static View a(String str, com.taobao.android.live.plugin.atype.flexalocal.good.tab.c cVar, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar2) {
        SingleTabBaseView singleTabBaseView;
        List<IDMComponent> components;
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8fad7ce7", new Object[]{str, cVar, cVar2});
        }
        if (!StringUtils.isEmpty(str) && cVar != null && cVar2 != null) {
            if (cVar.a() == null || cVar.a().stateMultiTabView == null) {
                singleTabBaseView = null;
            } else {
                List<SingleTabBaseView> liveStateViewList = cVar.a().stateMultiTabView.getLiveStateViewList();
                if (liveStateViewList != null && liveStateViewList.size() != 0) {
                    singleTabBaseView = liveStateViewList.get(0);
                    int i = 0;
                    while (true) {
                        if (i >= liveStateViewList.size()) {
                            break;
                        }
                        SingleTabBaseView singleTabBaseView2 = liveStateViewList.get(i);
                        if (singleTabBaseView2 != null && singleTabBaseView2.getItemCategory() != null && StringUtils.equals(singleTabBaseView2.getItemCategory().categoryId, cVar2.d)) {
                            singleTabBaseView = singleTabBaseView2;
                            break;
                        }
                        i++;
                    }
                } else {
                    return null;
                }
            }
            if (singleTabBaseView != null && singleTabBaseView.getRecyclerView() != null && singleTabBaseView.getRecyclerView().getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = singleTabBaseView.getRecyclerView().getLayoutManager();
                for (int i2 = 0; i2 < layoutManager.getChildCount(); i2++) {
                    View childAt = singleTabBaseView.getRecyclerView().getLayoutManager().getChildAt(i2);
                    if ((childAt instanceof IDMComponentsFrameLayout) && (components = ((IDMComponentsFrameLayout) childAt).getComponents()) != null && components.size() != 0 && (data = components.get(0).getData()) != null && StringUtils.equals(str, com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.a.a(data))) {
                        his.b("AddCartAnimHelper", "onAddCart | find targetView, pos=" + i2);
                        return childAt;
                    }
                }
            }
        }
        return null;
    }
}
