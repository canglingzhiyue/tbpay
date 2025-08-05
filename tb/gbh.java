package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ae;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bi;
import com.taobao.android.dinamicx.widget.z;

/* loaded from: classes.dex */
public class gbh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SCREEN_WIDTH = 1125;

    static {
        kge.a(-1037085465);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 51;
        }
        if (i == 1) {
            return 19;
        }
        if (i == 2) {
            return 83;
        }
        if (i == 3) {
            return 49;
        }
        if (i == 4) {
            return 17;
        }
        if (i == 5) {
            return 81;
        }
        if (i == 6) {
            return 53;
        }
        if (i == 7) {
            return 21;
        }
        return i == 8 ? 85 : 51;
    }

    public static void a(z zVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13ea65d", new Object[]{zVar, view});
        } else if (view == null || zVar == null) {
        } else {
            view.setTag(ae.d, zVar);
            a(view, (bi) zVar.e());
        }
    }

    public static z a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("897360d9", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(ae.d);
        if (!(tag instanceof z)) {
            return null;
        }
        return (z) tag;
    }

    public static boolean a(View view, bi biVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16f5487c", new Object[]{view, biVar})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.setTag(DXWidgetNode.TAG_WIDGET_NODE, biVar);
        return true;
    }

    public static DXWidgetNode b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("81801968", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (!(tag instanceof DXWidgetNode)) {
            return null;
        }
        return (DXWidgetNode) tag;
    }

    public static boolean a(View view, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21d2a909", new Object[]{view, dXWidgetNode})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.setTag(ae.f11799a, dXWidgetNode);
        return true;
    }
}
