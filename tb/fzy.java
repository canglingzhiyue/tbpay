package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fzy implements y.a, gad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public gaa f28244a;
    private List<Object> b;
    private Map<Integer, gab> c;
    private List<DXWidgetNode> d;

    static {
        kge.a(1117537587);
        kge.a(672283899);
        kge.a(-337578759);
    }

    public DXWidgetNode a(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, Object obj, List<Object> list, List<DXWidgetNode> list2, int i, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("58b9e94", new Object[]{this, dXAbsContainerBaseLayout, obj, list, list2, new Integer(i), nVar});
        }
        return null;
    }

    public ArrayList<DXWidgetNode> a(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2ac5a0f2", new Object[]{this, dXAbsContainerBaseLayout, list, list2, new Integer(i), new Integer(i2), nVar});
        }
        return null;
    }

    public fzy() {
        this(null);
    }

    public fzy(gaa gaaVar) {
        this.f28244a = gaaVar;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.widget.ac a(com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout r6, com.taobao.android.dinamicx.widget.DXWidgetNode r7, java.lang.Object r8, java.util.List<java.lang.Object> r9, int r10, com.taobao.analysis.v3.n r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fzy.a(com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode, java.lang.Object, java.util.List, int, com.taobao.analysis.v3.n, boolean):com.taobao.android.dinamicx.widget.ac");
    }

    public List<DXWidgetNode> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.a();
        }
        return this.d;
    }

    public void a(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            gaaVar.a(list);
        } else {
            this.d = list;
        }
    }

    public List<Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.b();
        }
        return this.b;
    }

    public void b(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        if (d() != list) {
            this.c = new HashMap();
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            gaaVar.b(list);
        } else {
            this.b = list;
        }
    }

    public gab a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gab) ipChange.ipc$dispatch("e661d8c3", new Object[]{this, new Integer(i)});
        }
        List<Object> d = d();
        if (d == null || this.c == null || i < 0 || i > d.size() - 1) {
            return null;
        }
        if (this.c.get(Integer.valueOf(i)) == null) {
            this.c.put(Integer.valueOf(i), new gab());
        }
        return this.c.get(Integer.valueOf(i));
    }

    @Override // tb.gad
    public DXWidgetNode b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("55a70d59", new Object[]{this, new Integer(i)});
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.b(i);
        }
        List<DXWidgetNode> list = this.d;
        if (list != null && i >= 0 && i < list.size()) {
            return this.d.get(i);
        }
        return null;
    }

    @Override // tb.gad
    public void a(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7041c4f4", new Object[]{this, new Integer(i), dXWidgetNode});
            return;
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            gaaVar.a(i, dXWidgetNode);
            return;
        }
        List<DXWidgetNode> list = this.d;
        if (list == null) {
            return;
        }
        if (i < 0 || i > list.size()) {
            fux.b("DXRecyclerLayout appendItem indexOutOfBounds: " + i + " size: " + this.d.size());
        }
        this.d.add(i, dXWidgetNode);
    }

    public boolean b(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99961a39", new Object[]{this, new Integer(i), dXWidgetNode})).booleanValue();
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.b(i, dXWidgetNode);
        }
        List<DXWidgetNode> list = this.d;
        if (list == null || i < 0 || i > list.size()) {
            return false;
        }
        this.d.add(i, dXWidgetNode);
        return true;
    }

    @Override // tb.gad
    public void a(int i, Collection<DXWidgetNode> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b3eb0c", new Object[]{this, new Integer(i), collection});
            return;
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            gaaVar.a(i, collection);
            return;
        }
        List<DXWidgetNode> list = this.d;
        if (list == null) {
            return;
        }
        list.addAll(i, collection);
    }

    @Override // tb.gad
    public int a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("613bf3ba", new Object[]{this, dXWidgetNode})).intValue();
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.a(dXWidgetNode);
        }
        List<DXWidgetNode> list = this.d;
        if (list != null) {
            return list.indexOf(dXWidgetNode);
        }
        return -1;
    }

    @Override // tb.gad
    public DXWidgetNode c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6fc28bf8", new Object[]{this, new Integer(i)});
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.c(i);
        }
        List<DXWidgetNode> list = this.d;
        if (list != null) {
            return list.remove(i);
        }
        return null;
    }

    @Override // tb.gad
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.e();
        }
        List<DXWidgetNode> list = this.d;
        if (list != null) {
            return list.isEmpty();
        }
        return true;
    }

    @Override // tb.gad
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.f();
        }
        return this.d == null;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.c();
        }
        List<DXWidgetNode> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // tb.gad
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            return gaaVar.g();
        }
        List<Object> list = this.b;
        if (list != null && !list.isEmpty()) {
            return this.b.size();
        }
        return 0;
    }

    @Override // tb.gad
    public void c(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ea6f76", new Object[]{this, new Integer(i), dXWidgetNode});
            return;
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar != null) {
            gaaVar.c(i, dXWidgetNode);
            return;
        }
        List<DXWidgetNode> list = this.d;
        if (list == null) {
            return;
        }
        list.set(i, dXWidgetNode);
    }

    @Override // com.taobao.android.dinamicx.y.a
    public void M_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b56539", new Object[]{this});
            return;
        }
        gaa gaaVar = this.f28244a;
        if (gaaVar == null) {
            return;
        }
        gaaVar.d();
    }

    @Override // com.taobao.android.dinamicx.y.a
    public String N_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0821c8", new Object[]{this});
        }
        if (!DinamicXEngine.j() || this.f28244a == null) {
            return null;
        }
        return " RecyclerLayout lruCacheSize: " + this.f28244a.c();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            DinamicXEngine.a(this);
        }
    }
}
