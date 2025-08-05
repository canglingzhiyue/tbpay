package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.a;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<IDMComponent> f26009a = new ArrayList();
    private List<IDMComponent> b = new ArrayList();
    private List<IDMComponent> c = new ArrayList();
    private List<IDMComponent> d = new ArrayList();
    private List<IDMComponent> e = new ArrayList();
    private List<IDMComponent> f = new ArrayList();
    private List<IDMComponent> g = new ArrayList();
    private List<a> h = new ArrayList();
    private b i;

    static {
        kge.a(-1169148781);
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1f4252f2", new Object[]{this}) : this.i;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a0b2", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.f26009a.clear();
            this.f26009a.addAll(list);
        }
    }

    public void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.b.clear();
            this.b.addAll(list);
        }
    }

    public void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.d.clear();
            this.d.addAll(list);
        }
    }

    public void d(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.e.clear();
            this.e.addAll(list);
        }
    }

    public void e(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968ff5d", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.c.clear();
            this.c.addAll(list);
        }
    }

    public void f(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601f4de", new Object[]{this, list});
        } else if (list == null || list.size() == 0) {
        } else {
            this.g.clear();
            this.g.addAll(list);
        }
    }

    public void g(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129aea5f", new Object[]{this, list});
        } else if (list == null || list.size() == 0) {
        } else {
            this.f.clear();
            this.f.addAll(list);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    public void h(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f33dfe0", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.h.clear();
            this.h.addAll(list);
        }
    }

    public List<IDMComponent> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f26009a);
        arrayList.addAll(this.b);
        arrayList.addAll(this.c);
        arrayList.addAll(this.d);
        arrayList.addAll(this.e);
        arrayList.addAll(this.g);
        arrayList.addAll(this.f);
        return arrayList;
    }

    public List<a> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.h;
    }

    public List<IDMComponent> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.f26009a;
    }

    public List<IDMComponent> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.b;
    }

    public List<IDMComponent> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.c;
    }

    public List<IDMComponent> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.d;
    }

    public List<IDMComponent> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.e;
    }

    public IDMComponent j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("fee63575", new Object[]{this});
        }
        if (!this.g.isEmpty()) {
            return this.g.get(0);
        }
        return null;
    }

    public IDMComponent k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("247a3e76", new Object[]{this});
        }
        if (!this.f.isEmpty()) {
            return this.f.get(0);
        }
        return null;
    }
}
