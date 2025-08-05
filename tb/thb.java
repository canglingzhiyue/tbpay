package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.home.component.utils.e;

/* loaded from: classes7.dex */
public class thb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-556387462);
    }

    public static void a(String str, DXRootView dXRootView) {
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6e7b3", new Object[]{str, dXRootView});
        } else if (dXRootView == null || (b = b(str, dXRootView)) == null) {
        } else {
            DinamicXEngine engine = b.getEngine();
            if (engine == null) {
                ldf.d("DXRefreshUtils", "partialRefreshSearchBarWidgetNode engine null ");
            } else {
                engine.a(b, 0, new DXWidgetRefreshOption.a().a(true).b(true).a(2).a());
            }
        }
    }

    private static DXWidgetNode b(String str, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("996f113", new Object[]{str, dXRootView});
        }
        if (dXRootView.getVisibility() != 0) {
            e.e("DXRefreshUtils", "组件未渲染，newSearchView INVISIBLE");
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            e.e("DXRefreshUtils", "组件未渲染，newSearchView dxWidgetNode null");
            return null;
        }
        return expandWidgetNode.queryWidgetNodeByUserId(str);
    }
}
