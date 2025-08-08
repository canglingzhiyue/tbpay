package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.f;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ats implements atv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private f g;
    private List<ath> h;

    /* renamed from: a  reason: collision with root package name */
    private final String f25596a = "AURARenderLayoutDataProcessorV2";
    private final Map<String, atw> b = new HashMap();
    private final Map<AURARenderComponent, atz> e = new HashMap();
    private final List<atu> i = new ArrayList();
    private final List<AURARenderComponent> c = new ArrayList();
    private final List<c> d = new ArrayList();
    private final List<atz> f = new ArrayList();

    static {
        kge.a(-1247666359);
        kge.a(-852159436);
    }

    public static /* synthetic */ List a(ats atsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bd7d6b0f", new Object[]{atsVar}) : atsVar.h;
    }

    public ats() {
        e();
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(new atx());
        }
    }

    @Override // tb.atv
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c68e2fc", new Object[]{this, fVar});
            return;
        }
        this.g = fVar;
        this.h = fVar.b(ath.class);
    }

    public void a(atu atuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b3d8f6", new Object[]{this, atuVar});
        } else if (atuVar == null || this.i.contains(atuVar)) {
        } else {
            this.i.add(atuVar);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            f();
        }
    }

    @Override // tb.atv
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else if (aURARenderComponent == null) {
        } else {
            a(aURARenderComponent.isRoot());
            List<AURARenderComponent> c = c(aURARenderComponent);
            List<atz> b = b(c);
            List<c> a2 = a(b);
            a(c, b, a2);
            this.c.addAll(c);
            this.d.addAll(a2);
            this.f.addAll(b);
        }
    }

    private void a(List<AURARenderComponent> list, List<atz> list2, List<c> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f509d3b", new Object[]{this, list, list2, list3});
            return;
        }
        List<atu> list4 = this.i;
        if (list4 == null) {
            return;
        }
        for (atu atuVar : list4) {
            atuVar.a(list, list2, list3);
        }
    }

    private List<AURARenderComponent> c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("73ade196", new Object[]{this, aURARenderComponent});
        }
        ArrayList arrayList = new ArrayList();
        asu.a(aURARenderComponent, arrayList, new aqx<AURARenderComponent, Boolean>() { // from class: tb.ats.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqx
            public Boolean a(AURARenderComponent aURARenderComponent2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Boolean) ipChange2.ipc$dispatch("82240690", new Object[]{this, aURARenderComponent2});
                }
                for (ath athVar : ats.a(ats.this)) {
                    athVar.b(aURARenderComponent2);
                }
                return Boolean.valueOf(aURARenderComponent2.isRenderAbleLeaf());
            }
        });
        return arrayList;
    }

    private List<c> a(List<atz> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (atz atzVar : list) {
            c h = atzVar.h();
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    private List<atz> b(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            AURARenderComponent aURARenderComponent = list.get(i);
            atz a2 = a(aURARenderComponent, aURARenderComponent);
            if (i > 0) {
                atz atzVar = null;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    atzVar = arrayList.get(size);
                }
                if (a2 != atzVar) {
                    if (arrayList.contains(a2)) {
                        AURARenderComponent f = a2.f();
                        atz a3 = a(f, true);
                        if (a3 != null) {
                            a(a3, i, aURARenderComponent, arrayList);
                            a(arrayList, f);
                        } else {
                            ard a4 = arc.a();
                            a4.c("AURARenderLayoutDataProcessorV2", "generatorRenderLayoutHelpers", "newRenderLayoutDelegate is null, no layout render helper for [" + f.key + riy.ARRAY_END_STR);
                        }
                    } else {
                        a(a2, i, aURARenderComponent, arrayList);
                    }
                } else {
                    a(a2, i, aURARenderComponent, arrayList);
                }
            } else {
                a(a2, i, aURARenderComponent, arrayList);
            }
        }
        return arrayList;
    }

    private void a(atz atzVar, int i, AURARenderComponent aURARenderComponent, List<atz> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e50e79a", new Object[]{this, atzVar, new Integer(i), aURARenderComponent, list});
            return;
        }
        if (!atzVar.i()) {
            atzVar.c(i);
            list.add(atzVar);
        }
        atzVar.d(1);
        atzVar.a(aURARenderComponent);
    }

    private void a(List<atz> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e138cc2", new Object[]{this, list, aURARenderComponent});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (atz atzVar : list) {
            if (aURARenderComponent == atzVar.f()) {
                arrayList.add(atzVar);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            atz atzVar2 = (atz) arrayList.get(i);
            atzVar2.a(i);
            atzVar2.b(size);
        }
    }

    private atz a(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atz) ipChange.ipc$dispatch("3db0cb7", new Object[]{this, aURARenderComponent, aURARenderComponent2});
        }
        atz d = d(aURARenderComponent);
        if (d == null) {
            if (aURARenderComponent != aURARenderComponent2) {
                return null;
            }
            return e(aURARenderComponent2);
        }
        atz d2 = d(aURARenderComponent.parent);
        if (d2 == null || !d.a(d2)) {
            return d;
        }
        atz a2 = a(d.f(), aURARenderComponent2);
        return a2 == null ? d2 : a2;
    }

    private atz d(AURARenderComponent aURARenderComponent) {
        AURARenderComponent aURARenderComponent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atz) ipChange.ipc$dispatch("ceec29cf", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (aURARenderComponent2 = aURARenderComponent.parent) == null) {
            return null;
        }
        atz b = b(aURARenderComponent2);
        if (b != null) {
            return b;
        }
        if (aURARenderComponent2.parent != null) {
            return d(aURARenderComponent2);
        }
        return null;
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

    private atz e(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (atz) ipChange.ipc$dispatch("29a5490", new Object[]{this, aURARenderComponent}) : new aud(aURARenderComponent);
    }

    public atz a(AURARenderComponent aURARenderComponent, boolean z) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        String str;
        atz atzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atz) ipChange.ipc$dispatch("9646083e", new Object[]{this, aURARenderComponent, new Boolean(z)});
        }
        if (!aURARenderComponent.isValidLayout() || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || (str = aURARenderComponentLayout.type) == null || StringUtils.isEmpty(str)) {
            return null;
        }
        if (!z && (atzVar = this.e.get(aURARenderComponent)) != null) {
            return atzVar;
        }
        atw atwVar = this.b.get(str.toLowerCase());
        if (atwVar == null) {
            ard a2 = arc.a();
            a2.c("AURARenderLayoutDataProcessorV2", "getRenderLayoutHelper", str + "：不存在对应的IAURARenderLayoutHelperRegister");
            return null;
        }
        atz a3 = atwVar.a(aURARenderComponent);
        this.e.put(aURARenderComponent, a3);
        return a3;
    }

    public atz b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (atz) ipChange.ipc$dispatch("678fd44d", new Object[]{this, aURARenderComponent}) : a(aURARenderComponent, false);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.putAll(att.a());
        }
    }

    @Override // tb.atv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        this.b.clear();
        this.i.clear();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.c.clear();
        this.d.clear();
        this.e.clear();
        for (atz atzVar : this.f) {
            atzVar.l();
        }
        this.f.clear();
    }
}
