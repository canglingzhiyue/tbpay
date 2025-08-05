package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class atx implements atu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25598a = "AURARenderLayoutDataCardLayoutPostProcessor";

    static {
        kge.a(1795827478);
        kge.a(1119071860);
    }

    private boolean a(atz atzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b61ed5", new Object[]{this, atzVar})).booleanValue();
        }
        try {
            int c = atzVar.c();
            if (c == 0) {
                return true;
            }
            for (int i = 0; i < c; i++) {
                AURARenderComponent f = atzVar.f(i);
                if (f != null && f.data != null && f.data.fields != null && !f.data.fields.isEmpty() && (1 != f.data.fields.size() || !f.data.fields.containsKey("cornerType"))) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            jpr.a(jpu.a("AURA").c("isAllChildComponentFieldsEmptyException").b(e.getMessage()));
            return false;
        }
    }

    @Override // tb.atu
    public void a(List<AURARenderComponent> list, List<atz> list2, List<c> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f509d3b", new Object[]{this, list, list2, list3});
            return;
        }
        int i = 0;
        for (atz atzVar : list2) {
            if ("card".equalsIgnoreCase(atzVar.g()) && !a(atzVar)) {
                int j = atzVar.j() + i;
                AURARenderComponent aURARenderComponent = new AURARenderComponent();
                aURARenderComponent.key = a.b.e + j;
                AURARenderComponentData aURARenderComponentData = new AURARenderComponentData();
                aURARenderComponentData.container = new AURARenderComponentContainer(a.b.e, "", "", null, "", "");
                Map<String, Object> a2 = a(atzVar.f());
                if (a2 != null) {
                    AURARenderComponentLayout aURARenderComponentLayout = new AURARenderComponentLayout();
                    aURARenderComponentLayout.style = a2;
                    aURARenderComponentData.layout = aURARenderComponentLayout;
                }
                aURARenderComponent.data = aURARenderComponentData;
                if (j >= 0 && j <= list.size()) {
                    list.add(j, aURARenderComponent);
                } else {
                    ard a3 = arc.a();
                    a3.c("AURARenderLayoutDataCardLayoutPostProcessor", "flatRenderComponent", "error insert componentIndexToInsert=" + j);
                }
                int i2 = -1;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= list3.size()) {
                        break;
                    }
                    i4 += list3.get(i3).f();
                    if (i4 == j) {
                        i2 = i3 + 1;
                        break;
                    } else if (i4 > j) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0 && i2 <= list3.size()) {
                    atz b = b(aURARenderComponent);
                    b.e(1);
                    list3.add(i2, b.h());
                } else {
                    ard a4 = arc.a();
                    a4.c("AURARenderLayoutDataCardLayoutPostProcessor", "flatRenderComponent", "error insert insertIndex=" + i2);
                }
                i++;
            }
        }
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

    private atz b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (atz) ipChange.ipc$dispatch("678fd44d", new Object[]{this, aURARenderComponent}) : new aud(aURARenderComponent);
    }
}
