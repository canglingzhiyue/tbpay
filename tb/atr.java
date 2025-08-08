package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class atr implements atv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<Pair<Integer, c>> f25593a = new ArrayList();
    private final Map<Integer, auh<?>> b = new HashMap();
    private final Map<String, auh> e = new HashMap();
    private final boolean g = baz.a("enableNewCornerProcessor", true);
    private final int f = -1;
    private final List<AURARenderComponent> c = new ArrayList();
    private final List<c> d = new ArrayList();

    static {
        kge.a(847862765);
        kge.a(-852159436);
    }

    @Override // tb.atv
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c68e2fc", new Object[]{this, fVar});
        }
    }

    public static /* synthetic */ List a(atr atrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("efd3094e", new Object[]{atrVar}) : atrVar.c;
    }

    public static /* synthetic */ boolean a(atr atrVar, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cee6e9b5", new Object[]{atrVar, new Integer(i), aURARenderComponent})).booleanValue() : atrVar.a(i, aURARenderComponent);
    }

    public atr() {
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a(new auj());
        a(new aul());
        a(new aui());
        a(new auk());
    }

    @Override // tb.atv
    public List<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.d;
    }

    @Override // tb.atv
    public List<AURARenderComponent> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
    }

    @Override // tb.atv
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
            return;
        }
        b(aURARenderComponent.isRoot());
        asu.a(aURARenderComponent, this.c, new aqx<AURARenderComponent, Boolean>() { // from class: tb.atr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqx
            public Boolean a(AURARenderComponent aURARenderComponent2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    return (Boolean) ipChange2.ipc$dispatch("82240690", new Object[]{this, aURARenderComponent2});
                }
                atr atrVar = atr.this;
                if (atr.a(atrVar, atr.a(atrVar).size(), aURARenderComponent2) || !aURARenderComponent2.isRenderAbleLeaf()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        g();
        f();
        if (!aURARenderComponent.isRoot()) {
            return;
        }
        a(false);
        a(this.c, this.d);
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.d.isEmpty()) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i = 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                c cVar = this.d.get(i2);
                int f = cVar.f();
                i += f;
                if (cVar instanceof auv) {
                    auv auvVar = (auv) cVar;
                    if ("card".equals(auvVar.c()) && auvVar.a() == 0 && (this.c.size() < i || a(i - f, f, true) != null)) {
                        sparseIntArray.put(sparseIntArray.size() + i2, (i - f) + sparseIntArray.size());
                    }
                }
            }
            for (int i3 = 0; i3 < sparseIntArray.size(); i3++) {
                AURARenderComponent aURARenderComponent = new AURARenderComponent();
                AURARenderComponentData aURARenderComponentData = new AURARenderComponentData();
                aURARenderComponentData.container = new AURARenderComponentContainer(a.b.e, "", "", null, "", "");
                aURARenderComponent.data = aURARenderComponentData;
                this.d.add(sparseIntArray.keyAt(i3), h().a(1, null));
                this.c.add(sparseIntArray.valueAt(i3), aURARenderComponent);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a(true);
        for (Pair<Integer, c> pair : this.f25593a) {
            c cVar = (c) pair.second;
            if (1 != cVar.f()) {
                Integer num = (Integer) pair.first;
                int intValue = ((Integer) pair.first).intValue() + cVar.f();
                int i = 0;
                for (int intValue2 = num.intValue(); intValue2 < intValue; intValue2++) {
                    if (num.intValue() == b(intValue2)) {
                        i++;
                    }
                }
                cVar.b_(i);
            }
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a(true);
        ArrayList<Pair> arrayList = new ArrayList();
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        for (int i = 0; i < this.c.size(); i++) {
            int b = b(i);
            if (i != b && -1 != b && b != a(i)) {
                auh<?> auhVar = this.b.get(Integer.valueOf(b));
                Object a2 = auhVar.a(1, d(this.c.get(i)));
                arrayList.add(Pair.create(Integer.valueOf(i), a2));
                this.b.put(Integer.valueOf(i), auhVar);
                int a3 = a(sparseIntArray, sparseIntArray2, sparseIntArray3, i, b);
                if (a2 instanceof auv) {
                    ((auv) a2).b(a3 + 1);
                }
            }
        }
        for (Pair pair : arrayList) {
            c cVar = (c) pair.second;
            if (cVar instanceof auv) {
                int i2 = sparseIntArray3.get(((Integer) pair.first).intValue());
                int i3 = sparseIntArray2.get(i2, 1);
                for (Pair<Integer, c> pair2 : this.f25593a) {
                    if (i2 == ((Integer) pair2.first).intValue()) {
                        c cVar2 = (c) pair2.second;
                        if (cVar2 instanceof auv) {
                            ((auv) cVar2).a(i3);
                        }
                    }
                }
                ((auv) cVar).a(i3);
            }
        }
        this.f25593a.addAll(arrayList);
    }

    private int a(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, SparseIntArray sparseIntArray3, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb2636f5", new Object[]{this, sparseIntArray, sparseIntArray2, sparseIntArray3, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = sparseIntArray.get(i2, 0);
        sparseIntArray.put(i2, i3 + 1);
        sparseIntArray2.put(i2, sparseIntArray2.get(i2, 1) + 1);
        sparseIntArray3.put(i, i2);
        return i3;
    }

    private void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            Collections.sort(this.f25593a, new Comparator<Pair<Integer, c>>() { // from class: tb.atr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(Pair<Integer, c> pair, Pair<Integer, c> pair2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, pair, pair2})).intValue() : a(pair, pair2);
                }

                public int a(Pair<Integer, c> pair, Pair<Integer, c> pair2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("89f26c1b", new Object[]{this, pair, pair2})).intValue() : z ? ((Integer) pair2.first).intValue() - ((Integer) pair.first).intValue() : ((Integer) pair.first).intValue() - ((Integer) pair2.first).intValue();
                }
            });
        }
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        for (Pair<Integer, c> pair : this.f25593a) {
            Integer num = (Integer) pair.first;
            if (i >= num.intValue()) {
                return num.intValue();
            }
        }
        return -1;
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        for (Pair<Integer, c> pair : this.f25593a) {
            Integer num = (Integer) pair.first;
            if (i >= num.intValue()) {
                if (i == num.intValue()) {
                    return num.intValue();
                }
                if (((c) pair.second).f() + num.intValue() > i && num.intValue() <= i) {
                    return num.intValue();
                }
            }
        }
        return -1;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            j();
        }
    }

    private boolean a(int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a14e244", new Object[]{this, new Integer(i), aURARenderComponent})).booleanValue();
        }
        auh<?> f = f(aURARenderComponent);
        if (f == null) {
            return false;
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (list != null && !list.isEmpty()) {
            int e = e(aURARenderComponent);
            int b = b(aURARenderComponent);
            if (b == 0) {
                int e2 = e(list.get(b));
                if (e == e2) {
                    return true;
                }
                i = Math.max(0, e - e2);
            }
            if (f.a()) {
                for (int i2 = 0; i2 < e; i2++) {
                    int i3 = i + i2;
                    this.f25593a.add(Pair.create(Integer.valueOf(i3), f.a(1, d(aURARenderComponent))));
                    this.b.put(Integer.valueOf(i3), f);
                }
            } else {
                this.f25593a.add(Pair.create(Integer.valueOf(i), f.a(e, d(aURARenderComponent))));
                this.b.put(Integer.valueOf(i), f);
            }
        }
        return true;
    }

    private int b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66ed2025", new Object[]{this, aURARenderComponent})).intValue();
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (bau.a(list)) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (c(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    private boolean c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b1c95", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent != null) {
            return !bau.a(aURARenderComponent.children) && f(aURARenderComponent) != null;
        }
        baw.a("when executor function isValidLayout,renderComponent is null!");
        return false;
    }

    private void a(List<AURARenderComponent> list, List<c> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
        } else if (!b(list, list2)) {
            for (int i = 0; i < this.f25593a.size(); i++) {
                Pair<Integer, c> pair = this.f25593a.get(i);
                Integer num = (Integer) pair.first;
                c cVar = (c) pair.second;
                if (cVar.f() != 0) {
                    Pair<Integer, c> c = c(i);
                    if (c == null) {
                        if (num.intValue() > 0) {
                            list2.add(h().a(num.intValue(), null));
                        }
                        list2.add(cVar);
                    } else {
                        int intValue = num.intValue() - (((c) c.second).f() + ((Integer) c.first).intValue());
                        if (intValue > 0) {
                            list2.add(h().a(intValue, null));
                            list2.add(cVar);
                        } else {
                            list2.add(cVar);
                        }
                    }
                    try {
                        a(num.intValue(), cVar);
                    } catch (Throwable th) {
                        arc.a().c(getClass().getSimpleName(), "makeupLayoutHelpers", th.getMessage());
                    }
                }
            }
        }
    }

    private void a(int i, c cVar) {
        auh<?> auhVar;
        AURARenderComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dba31e", new Object[]{this, new Integer(i), cVar});
        } else if (!(cVar instanceof auv) || (auhVar = this.b.get(Integer.valueOf(i))) == null || !"card".equals(auhVar.g())) {
        } else {
            auv auvVar = (auv) cVar;
            int max = Math.max(0, auvVar.a());
            int max2 = Math.max(1, auvVar.e_());
            int f = cVar.f();
            if (1 == max2 && 1 == f) {
                a(i, "both");
            } else if (!this.g) {
                if (1 == max2) {
                    a(i, "top");
                    a((i + f) - 1, "bottom");
                } else if (max == 0) {
                    a(i, "top");
                } else if (max != max2 - 1) {
                } else {
                    a((i + f) - 1, "bottom");
                }
            } else if (1 == max2) {
                AURARenderComponent a3 = a(i, f, true);
                if (a3 != null) {
                    a(a3, "top");
                }
                AURARenderComponent a4 = a(i, f, false);
                if (a4 != null) {
                    a(a4, "bottom");
                }
                if (a3 != a4 || a3 == null) {
                    return;
                }
                a(a3, "both");
            } else if (max == 0) {
                AURARenderComponent a5 = a(i, f, true);
                if (a5 == null) {
                    return;
                }
                a(a5, "top");
            } else if (max != max2 - 1 || (a2 = a(i, f, false)) == null) {
            } else {
                a(a2, "bottom");
            }
        }
    }

    private AURARenderComponent a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("da7e0777", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        int i3 = i2 + i;
        AURARenderComponent aURARenderComponent = null;
        if (this.c.size() <= i3) {
            return null;
        }
        while (i < i3 && this.c.size() > i) {
            AURARenderComponent aURARenderComponent2 = this.c.get(i);
            boolean z2 = !aURARenderComponent2.isInvisible();
            if (z) {
                if (z2) {
                    return aURARenderComponent2;
                }
            } else if (z2) {
                aURARenderComponent = aURARenderComponent2;
            }
            i++;
        }
        return aURARenderComponent;
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (i < 0 || i >= this.c.size()) {
        } else {
            a(this.c.get(i), str);
        }
    }

    private static void a(AURARenderComponent aURARenderComponent, String str) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a501edd", new Object[]{aURARenderComponent, str});
        } else if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null) {
        } else {
            if (aURARenderComponentData.fields == null) {
                aURARenderComponentData.fields = new HashMap();
            }
            aURARenderComponentData.fields.put("cornerType", str);
        }
    }

    private boolean b(List<AURARenderComponent> list, List<c> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b37b7cf", new Object[]{this, list, list2})).booleanValue();
        }
        if (!this.f25593a.isEmpty() || this.c.isEmpty()) {
            return false;
        }
        list2.add(h().a(list.size(), null));
        return true;
    }

    private Pair<Integer, c> c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("29d12e3", new Object[]{this, new Integer(i)});
        }
        int size = this.f25593a.size();
        if (i > 0 && i < size) {
            return this.f25593a.get(i - 1);
        }
        return null;
    }

    private Map<String, Object> d(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1164c725", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && (aURARenderComponentLayout = aURARenderComponentData.layout) != null) {
            return aURARenderComponentLayout.style;
        }
        return null;
    }

    private int e(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c371542", new Object[]{this, aURARenderComponent})).intValue();
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (list == null) {
            return 0;
        }
        for (AURARenderComponent aURARenderComponent2 : list) {
            if (aURARenderComponent2 != null) {
                if (aURARenderComponent2.isRenderAbleLeaf()) {
                    i++;
                }
                i += e(aURARenderComponent2);
            }
        }
        return i;
    }

    public void a(auh<?> auhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0bc07a4", new Object[]{this, auhVar});
        } else {
            this.e.put(auhVar.g(), auhVar);
        }
    }

    private auh<?> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (auh) ipChange.ipc$dispatch("44de0683", new Object[]{this}) : this.e.get("linear");
    }

    private final auh<?> f(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (auh) ipChange.ipc$dispatch("364880e4", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent.isValidLayout() && (aURARenderComponentData = aURARenderComponent.data) != null && (aURARenderComponentLayout = aURARenderComponentData.layout) != null && (str = aURARenderComponentLayout.type) != null && !StringUtils.isEmpty(str)) {
            return this.e.get(str);
        }
        return null;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        for (auh auhVar : this.e.values()) {
            auhVar.l();
        }
    }

    @Override // tb.atv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            j();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.c.clear();
        this.d.clear();
        this.f25593a.clear();
        this.b.clear();
        i();
    }
}
