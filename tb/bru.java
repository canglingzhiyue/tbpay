package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, auh<?>> f26071a = new HashMap();
    private final List<Pair<Integer, c>> b = new ArrayList();

    static {
        kge.a(428653033);
    }

    public bru() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        auj aujVar = new auj();
        this.f26071a.put(aujVar.g(), aujVar);
        aul aulVar = new aul();
        this.f26071a.put(aulVar.g(), aulVar);
        aui auiVar = new aui();
        this.f26071a.put(auiVar.g(), auiVar);
    }

    public void a(List<AURARenderComponent> list, List<c> list2, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6e37b1", new Object[]{this, list, list2, aURARenderComponent});
            return;
        }
        if (aURARenderComponent.isRoot()) {
            this.b.clear();
        }
        if (!a(list, aURARenderComponent) && aURARenderComponent.isRenderAbleLeaf()) {
            list.add(aURARenderComponent);
        }
        List<AURARenderComponent> list3 = aURARenderComponent.children;
        if (list3 == null) {
            return;
        }
        for (AURARenderComponent aURARenderComponent2 : list3) {
            a(list, list2, aURARenderComponent2);
        }
        if (!aURARenderComponent.isRoot()) {
            return;
        }
        a(list, list2);
    }

    private boolean a(List<AURARenderComponent> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e138cc6", new Object[]{this, list, aURARenderComponent})).booleanValue();
        }
        auh<?> c = c(aURARenderComponent);
        if (c == null) {
            return false;
        }
        this.b.add(Pair.create(Integer.valueOf(list.size()), c.a(b(aURARenderComponent), a(aURARenderComponent))));
        return true;
    }

    private void a(List<AURARenderComponent> list, List<c> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
        } else if (this.b.isEmpty()) {
            list2.add(b().a(list.size(), null));
        } else {
            Collections.sort(this.b, new Comparator<Pair<Integer, c>>() { // from class: tb.bru.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(Pair<Integer, c> pair, Pair<Integer, c> pair2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, pair, pair2})).intValue() : a(pair, pair2);
                }

                public int a(Pair<Integer, c> pair, Pair<Integer, c> pair2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("89f26c1b", new Object[]{this, pair, pair2})).intValue() : ((Integer) pair.first).intValue() - ((Integer) pair2.first).intValue();
                }
            });
            for (int i = 0; i < this.b.size(); i++) {
                Pair<Integer, c> pair = this.b.get(i);
                Integer num = (Integer) pair.first;
                c cVar = (c) pair.second;
                Pair<Integer, c> a2 = a(i);
                if (a2 == null) {
                    auh<?> b = b();
                    if (num.intValue() > 0) {
                        list2.add(b.a(num.intValue(), null));
                    }
                    list2.add(cVar);
                } else {
                    int intValue = num.intValue() - (((c) a2.second).f() + ((Integer) a2.first).intValue());
                    if (intValue > 0) {
                        list2.add(b().a(intValue, null));
                        list2.add(cVar);
                    } else {
                        list2.add(cVar);
                    }
                }
            }
        }
    }

    private Pair<Integer, c> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a99f525", new Object[]{this, new Integer(i)});
        }
        int size = this.b.size();
        if (i > 0 && i < size) {
            return this.b.get(i - 1);
        }
        return null;
    }

    private Map<String, Object> a(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("855088c8", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && (aURARenderComponentLayout = aURARenderComponentData.layout) != null) {
            return aURARenderComponentLayout.style;
        }
        return null;
    }

    private int b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66ed2025", new Object[]{this, aURARenderComponent})).intValue();
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (list == null) {
            return 0;
        }
        for (AURARenderComponent aURARenderComponent2 : list) {
            if (aURARenderComponent2.isRenderAbleLeaf()) {
                i++;
            }
        }
        return i;
    }

    private auh<?> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (auh) ipChange.ipc$dispatch("16b42649", new Object[]{this}) : this.f26071a.get("linear");
    }

    private auh<?> c(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (auh) ipChange.ipc$dispatch("9b3e00a1", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent.isValidLayout() && (aURARenderComponentData = aURARenderComponent.data) != null && (aURARenderComponentLayout = aURARenderComponentData.layout) != null && (str = aURARenderComponentLayout.type) != null && !TextUtils.isEmpty(str)) {
            return this.f26071a.get(str);
        }
        return null;
    }
}
