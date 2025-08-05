package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.z;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;

/* loaded from: classes7.dex */
public class ont {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f32220a;

    static {
        kge.a(1080554845);
        f32220a = new String[]{"recMainTitle_visible"};
    }

    public RRichTextView a(View view) {
        View a2;
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RRichTextView) ipChange.ipc$dispatch("9e087653", new Object[]{this, view});
        }
        if (view != null && (a2 = a(view, new Class[]{DXRootView.class, DXRootNativeFrameLayout.class})) != null && (b = b(a2)) != null) {
            View v = b.getDXRuntimeContext().v();
            if (v instanceof RRichTextView) {
                return (RRichTextView) v;
            }
        }
        return null;
    }

    private DXWidgetNode b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("81801968", new Object[]{this, view});
        }
        DXWidgetNode c = c(view);
        DXWidgetNode dXWidgetNode = null;
        if (c == null) {
            return null;
        }
        for (String str : f32220a) {
            dXWidgetNode = c.queryWidgetNodeByUserId(str);
            if (dXWidgetNode != null) {
                break;
            }
        }
        return dXWidgetNode;
    }

    private View a(View view, Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8db6c9f4", new Object[]{this, view, clsArr});
        }
        for (Class<?> cls : clsArr) {
            if (cls.isInstance(view)) {
                return view;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View a2 = a(viewGroup.getChildAt(i), clsArr);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private DXWidgetNode c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("3cace47", new Object[]{this, view});
        }
        if (e(view)) {
            z a2 = gbh.a(view);
            if (a2 != null) {
                return a2.e();
            }
            return null;
        }
        return d(view);
    }

    private DXWidgetNode d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("86158326", new Object[]{this, view});
        }
        if (view instanceof DXRootView) {
            return ((DXRootView) view).getFlattenWidgetNode();
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (!(tag instanceof DXWidgetNode)) {
            return null;
        }
        return (DXWidgetNode) tag;
    }

    private boolean e(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85081eea", new Object[]{this, view})).booleanValue() : gbh.a(view) != null;
    }
}
