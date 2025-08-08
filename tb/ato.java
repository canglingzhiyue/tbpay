package tb;

import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ato {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25592a = ato.class.getSimpleName();
    private int b = 1;
    private final SparseIntArray c = new SparseIntArray();
    private final Map<String, Integer> d = new HashMap();
    private final SparseArray<String> e = new SparseArray<>();
    private final SparseArray<AURARenderComponentContainer> f = new SparseArray<>();
    private final Map<String, atc> g = new HashMap();

    static {
        kge.a(-238235197);
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c68e2fc", new Object[]{this, fVar});
            return;
        }
        List<atc> b = fVar.b(atc.class);
        if (b.isEmpty()) {
            return;
        }
        for (atc atcVar : b) {
            String a2 = atcVar.a();
            if (StringUtils.isEmpty(a2)) {
                ard a3 = arc.a();
                String str = this.f25592a;
                a3.c(str, "", "componentType of " + atcVar + " is empty!!!");
            } else {
                a(a2, atcVar);
            }
        }
        atj atjVar = new atj();
        a(atjVar.a(), atjVar);
    }

    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        b();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            a(i, list.get(i));
        }
    }

    private String a(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer b;
        atc b2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : (aURARenderComponent == null || (b = b(aURARenderComponent)) == null || (b2 = b(b.containerType)) == null) ? "" : b2.a(aURARenderComponent);
    }

    private void a(int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a14e240", new Object[]{this, new Integer(i), aURARenderComponent});
            return;
        }
        String a2 = a(aURARenderComponent);
        a(a2);
        a(i, aURARenderComponent, a2);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || this.d.containsKey(str)) {
        } else {
            this.d.put(str, Integer.valueOf(this.b));
            this.b++;
        }
    }

    private void a(int i, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bdfc0a", new Object[]{this, new Integer(i), aURARenderComponent, str});
        } else if (aURARenderComponent == null) {
            this.c.put(i, -2147483647);
        } else {
            AURARenderComponentContainer b = b(aURARenderComponent);
            if (b == null) {
                this.c.put(i, -2147483645);
                return;
            }
            atc b2 = b(b.containerType);
            if (b2 == null) {
                this.c.put(i, -2147483644);
                return;
            }
            if (StringUtils.isEmpty(str)) {
                ard a2 = arc.a();
                String str2 = this.f25592a;
                a2.c(str2, "processPosition2ViewType", "the itemViewType generated from componentCreator[" + b2 + "] is empty");
            }
            Integer num = this.d.get(str);
            if (num == null) {
                this.c.put(i, -2147483646);
                arc.a().c(this.f25592a, "processPosition2ViewType", "cannot find viewType from itemViewType " + str + " generated from componentCreator[" + b2 + riy.ARRAY_END_STR);
                return;
            }
            this.c.put(i, num.intValue());
            this.e.put(num.intValue(), b2.a());
            this.f.put(num.intValue(), b);
        }
    }

    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : this.c.get(i, i2);
    }

    public AURARenderComponentContainer a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("6be46acf", new Object[]{this, new Integer(i)});
        }
        AURARenderComponentContainer aURARenderComponentContainer = this.f.get(i);
        return aURARenderComponentContainer == null ? this.f.get(-i) : aURARenderComponentContainer;
    }

    public atc b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atc) ipChange.ipc$dispatch("d4e26c7c", new Object[]{this, new Integer(i)});
        }
        String str = this.e.get(i);
        if (str == null) {
            str = this.e.get(-i);
        }
        if (str == null) {
            ard a2 = arc.a();
            String str2 = this.f25592a;
            a2.c(str2, "getComponentCreatorOfPosition", "containerType of viewType[" + i + "] is null");
            return null;
        }
        return b(str);
    }

    public atc c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atc) ipChange.ipc$dispatch("c36572fd", new Object[]{this, new Integer(i)});
        }
        String str = this.e.get(a(i, Integer.MIN_VALUE));
        if (str == null) {
            ard a2 = arc.a();
            String str2 = this.f25592a;
            a2.c(str2, "getComponentCreatorOfPosition", "containerType of position[" + i + "] is null");
            return null;
        }
        return b(str);
    }

    public atc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atc) ipChange.ipc$dispatch("f027c8e", new Object[]{this});
        }
        atc b = b(a.b.d);
        if (b != null) {
            return b;
        }
        ati atiVar = new ati();
        a(a.b.d, atiVar);
        return atiVar;
    }

    private AURARenderComponentContainer b(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("fb40e58", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null) {
            return aURARenderComponentData.container;
        }
        return null;
    }

    private atc b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atc) ipChange.ipc$dispatch("7d19d123", new Object[]{this, str});
        }
        if (str == null) {
            arc.a().c(this.f25592a, "getComponentCreator", "containerType is null");
            return null;
        }
        return this.g.get(str.toLowerCase());
    }

    private void a(String str, atc atcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20962012", new Object[]{this, str, atcVar});
        } else if (StringUtils.isEmpty(str)) {
            arc.a().c(this.f25592a, "setComponentCreator", "containerType is empty");
        } else if (atcVar == null) {
            ard a2 = arc.a();
            String str2 = this.f25592a;
            a2.c(str2, "setComponentCreator", "componentExtension of " + str + " is null");
        } else {
            this.g.put(str.toLowerCase(), atcVar);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.clear();
        this.f.clear();
        this.e.clear();
    }
}
