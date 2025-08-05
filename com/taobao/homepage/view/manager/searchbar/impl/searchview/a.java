package com.taobao.homepage.view.manager.searchbar.impl.searchview;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.home.component.utils.e;
import tb.kge;
import tb.ksp;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(798690365);
    }

    public void a(String str, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6e7b3", new Object[]{this, str, dXRootView});
            return;
        }
        DXWidgetNode b = b(str, dXRootView);
        if (b == null) {
            ksp.c("PartialRefreshSearchBarProcessor", "partialRefreshHomeWidgetNode widgetNode null ");
            return;
        }
        DinamicXEngine engine = b.getEngine();
        if (engine == null) {
            ksp.c("PartialRefreshSearchBarProcessor", "partialRefreshSearchBarWidgetNode engine null ");
        } else {
            engine.a(b, 0, new DXWidgetRefreshOption.a().a(true).b(true).a(2).a());
        }
    }

    private DXWidgetNode b(String str, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("996f113", new Object[]{this, str, dXRootView});
        }
        if (dXRootView.getVisibility() != 0) {
            e.e("PartialRefreshSearchBarProcessor", "组件未渲染，newSearchView INVISIBLE");
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            e.e("PartialRefreshSearchBarProcessor", "组件未渲染，newSearchView dxWidgetNode null");
            return null;
        }
        return expandWidgetNode.queryWidgetNodeByUserId(str);
    }
}
