package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.x;
import com.taobao.android.dinamicx.widget.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fyf implements fxz<fxw, fym> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<Class<? extends DXWidgetNode>>> f28214a;

    static {
        kge.a(1411223770);
        kge.a(-1301422368);
    }

    public fyf(Map<String, List<Class<? extends DXWidgetNode>>> map) {
        this.f28214a = map;
    }

    @Override // tb.fxz
    public Collection<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.f28214a.keySet();
    }

    @Override // tb.fxz
    public List<fym> a(fxw fxwVar, String str) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fa0f26ca", new Object[]{this, fxwVar, str});
        }
        View c = fxwVar.c();
        if (c == null || (a2 = a(c, new Class[]{DXRootView.class, DXRootNativeFrameLayout.class})) == null) {
            return null;
        }
        if (bx.p()) {
            return a(a2, str);
        }
        DXWidgetNode a3 = a(a2);
        if (a3 != null) {
            return a(a3, str);
        }
        return null;
    }

    public List<fym> a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ddf04d13", new Object[]{this, view, str});
        }
        z a2 = gbh.a(view);
        if (a2 != null) {
            return a(a2, str);
        }
        return null;
    }

    private List<fym> a(z zVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dd827988", new Object[]{this, zVar, str});
        }
        DXWidgetNode e = zVar.e();
        ArrayList arrayList = new ArrayList();
        if (b(e, str)) {
            arrayList.add((fym) e);
        }
        List<z> f = zVar.f();
        if (f == null || f.size() == 0) {
            a(e, arrayList, str);
        } else {
            for (z zVar2 : f) {
                arrayList.addAll(a(zVar2, str));
            }
        }
        return arrayList;
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

    private DXWidgetNode a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ff356489", new Object[]{this, view});
        }
        if (view instanceof DXRootView) {
            return ((DXRootView) view).getFlattenWidgetNode();
        }
        DXWidgetNode b = gbh.b(view);
        if (!(b instanceof DXWidgetNode)) {
            return null;
        }
        return b;
    }

    private List<fym> a(DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31c27c56", new Object[]{this, dXWidgetNode, str});
        }
        ArrayList arrayList = new ArrayList();
        if (b(dXWidgetNode, str)) {
            if (fqi.f(dXWidgetNode.getDXRuntimeContext().A()) && dXWidgetNode.isFlatten()) {
                DXWidgetNode referenceNode = dXWidgetNode.getReferenceNode();
                if (referenceNode != null) {
                    arrayList.add((fym) referenceNode);
                }
            } else {
                arrayList.add((fym) dXWidgetNode);
            }
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null || children.size() == 0) {
            a(dXWidgetNode, arrayList, str);
        } else {
            for (DXWidgetNode dXWidgetNode2 : children) {
                arrayList.addAll(a(dXWidgetNode2, str));
            }
        }
        return arrayList;
    }

    private void a(DXWidgetNode dXWidgetNode, List<fym> list, String str) {
        ArrayList<DXWidgetNode> _getItemWidgetNodes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0afe82", new Object[]{this, dXWidgetNode, list, str});
        } else if (!fqi.bm() || !(dXWidgetNode instanceof x) || (_getItemWidgetNodes = ((x) dXWidgetNode)._getItemWidgetNodes()) == null) {
        } else {
            Iterator<DXWidgetNode> it = _getItemWidgetNodes.iterator();
            while (it.hasNext()) {
                list.addAll(a(it.next(), str));
            }
        }
    }

    private boolean b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f26bde13", new Object[]{this, obj, str})).booleanValue();
        }
        List<Class<? extends DXWidgetNode>> list = this.f28214a.get(str);
        if (!(obj instanceof fym) || list == null) {
            return false;
        }
        for (Class<? extends DXWidgetNode> cls : list) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
