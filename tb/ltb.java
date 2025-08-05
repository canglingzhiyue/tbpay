package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.z;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ltb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<Class<? extends DXWidgetNode>> f30911a;

    static {
        kge.a(1603890326);
    }

    public ltb(List<Class<? extends DXWidgetNode>> list) {
        this.f30911a = list;
    }

    public List<IVideoPlayControllerService.b> a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a7876d9d", new Object[]{this, view});
        }
        View a2 = a(view, new Class[]{DXRootView.class, DXRootNativeFrameLayout.class});
        if (a2 == null) {
            return null;
        }
        if (d(a2)) {
            return c(a2);
        }
        DXWidgetNode b = b(a2);
        if (b != null) {
            return a(b);
        }
        return null;
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

    private DXWidgetNode b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("81801968", new Object[]{this, view});
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

    private List<IVideoPlayControllerService.b> a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("afe8f7a0", new Object[]{this, dXWidgetNode});
        }
        ArrayList arrayList = new ArrayList();
        if (a((Object) dXWidgetNode)) {
            arrayList.add((IVideoPlayControllerService.b) dXWidgetNode);
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null) {
            return arrayList;
        }
        for (DXWidgetNode dXWidgetNode2 : children) {
            arrayList.addAll(a(dXWidgetNode2));
        }
        return arrayList;
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof IVideoPlayControllerService.b)) {
            return false;
        }
        for (Class<? extends DXWidgetNode> cls : this.f30911a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public List<IVideoPlayControllerService.b> c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39895c1f", new Object[]{this, view});
        }
        z a2 = gbh.a(view);
        if (a2 != null) {
            return a(a2);
        }
        return null;
    }

    private List<IVideoPlayControllerService.b> a(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9c983d52", new Object[]{this, zVar});
        }
        DXWidgetNode e = zVar.e();
        ArrayList arrayList = new ArrayList();
        if (a((Object) e)) {
            arrayList.add((IVideoPlayControllerService.b) e);
        }
        List<z> f = zVar.f();
        if (f == null) {
            return arrayList;
        }
        for (z zVar2 : f) {
            arrayList.addAll(a(zVar2));
        }
        return arrayList;
    }

    private boolean d(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8906900b", new Object[]{this, view})).booleanValue() : gbh.a(view) != null;
    }
}
