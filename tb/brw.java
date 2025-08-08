package tb;

import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class brw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26074a = "UMFRenderContainerViewTypeTransformer";
    private int b = 1;
    private final SparseIntArray c = new SparseIntArray();
    private final Map<String, Integer> d = new HashMap();
    private final SparseArray<String> e = new SparseArray<>();
    private final SparseArray<AURARenderComponentContainer> f = new SparseArray<>();
    private final Map<String, brj> g = new HashMap();

    static {
        kge.a(-100933620);
    }

    public void a(brj brjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e247827e", new Object[]{this, brjVar});
        } else {
            this.g.put(brjVar.a(), brjVar);
        }
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

    private String b(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer a2;
        brj b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9aaefeae", new Object[]{this, aURARenderComponent}) : (aURARenderComponent == null || (a2 = a(aURARenderComponent)) == null || (b = b(a2.containerType)) == null) ? "" : b.a(aURARenderComponent);
    }

    private void a(int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a14e240", new Object[]{this, new Integer(i), aURARenderComponent});
            return;
        }
        String b = b(aURARenderComponent);
        a(b);
        a(i, aURARenderComponent, b);
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
            AURARenderComponentContainer a2 = a(aURARenderComponent);
            if (a2 == null) {
                this.c.put(i, -2147483647);
                return;
            }
            brj b = b(a2.containerType);
            if (b == null) {
                this.c.put(i, -2147483647);
                return;
            }
            if (StringUtils.isEmpty(str)) {
                bqe.a().c("UMFRenderContainerViewTypeTransformer", "the itemViewType generated from componentCreator[" + b + "] is empty");
            }
            Integer num = this.d.get(str);
            if (num == null) {
                this.c.put(i, -2147483646);
                String str2 = "cannot find viewType from itemViewType " + str + " generated from componentCreator[" + b + riy.ARRAY_END_STR;
                bqe.a().c("UMFRenderContainerViewTypeTransformer", str2);
                bsu.a("UMFFramework", "RENDER_TRANSFORMER_ERROR", "UMF_RENDER_TRANSFORMER", str2);
                return;
            }
            this.c.put(i, num.intValue());
            this.e.put(num.intValue(), b.a());
            this.f.put(num.intValue(), a2);
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

    public brj b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("d4e2da32", new Object[]{this, new Integer(i)});
        }
        String str = this.e.get(i);
        if (str == null) {
            str = this.e.get(-i);
        }
        if (str != null) {
            return this.g.get(str);
        }
        return null;
    }

    public brj c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("c365e0b3", new Object[]{this, new Integer(i)});
        }
        String str = this.e.get(a(i, Integer.MIN_VALUE));
        if (str != null) {
            return this.g.get(str);
        }
        return null;
    }

    public brj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("f02ea44", new Object[]{this});
        }
        brj brjVar = this.g.get(a.b.d);
        if (brjVar != null) {
            return brjVar;
        }
        bro broVar = new bro();
        this.g.put(a.b.d, broVar);
        return broVar;
    }

    public AURARenderComponentContainer a(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("44fc6b97", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null) {
            return aURARenderComponentData.container;
        }
        return null;
    }

    private brj b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (brj) ipChange.ipc$dispatch("7d1a3ed9", new Object[]{this, str}) : this.g.get(str);
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
