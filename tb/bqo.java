package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.b;
import com.alibaba.android.umf.node.service.IUMFService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class bqo<INPUT extends UMFBaseIO, OUTPUT extends UMFBaseIO> implements IUMFService<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26045a = getClass().getSimpleName();
    private Map<Class<? extends bqg>, String> b;
    private Map<String, List<bqg>> c;

    static {
        kge.a(773704559);
        kge.a(401414571);
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onAfterExecute(OUTPUT output, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdecc882", new Object[]{this, output, bVar});
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onBeforeExecute(INPUT input, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7830a121", new Object[]{this, input, bVar});
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public final void registerExtension(String str, String str2, int i, bqg bqgVar, Class<? extends bqg> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06b8759", new Object[]{this, str, str2, new Integer(i), bqgVar, cls});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            a(str, cls);
            a(str, i, bqgVar);
        }
    }

    private void a(String str, Class<? extends bqg> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, str, cls});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(cls, str);
    }

    private void a(String str, int i, bqg bqgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dc9589", new Object[]{this, str, new Integer(i), bqgVar});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        List<bqg> list = this.c.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.c.put(str, list);
        }
        list.add(Math.max(0, Math.min(i, list.size())), bqgVar);
    }

    private <Ext extends bqg> List<Ext> a(Class<Ext> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef3245d2", new Object[]{this, cls});
        }
        if (!cls.isInterface()) {
            throw new IllegalArgumentException(cls.getSimpleName() + "must be interface");
        }
        Map<Class<? extends bqg>, String> map = this.b;
        if (map != null) {
            return (List<Ext>) this.c.get(map.get(cls));
        }
        return null;
    }

    public final <Ext extends bqg> bpz<List<Ext>> a(Class<Ext> cls, bqb<Ext> bqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpz) ipChange.ipc$dispatch("3ae1eb68", new Object[]{this, cls, bqbVar});
        }
        final List<Ext> a2 = a(cls);
        if (a2 != null) {
            for (Ext ext : a2) {
                bqbVar.a(ext);
            }
        }
        return (bpz<List<Ext>>) new bpz<List<Ext>>() { // from class: tb.bqo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bpz
            public /* synthetic */ Object a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("bd3407ca", new Object[]{this}) : b();
            }

            /* JADX WARN: Unknown type variable: Ext in type: java.util.List<Ext> */
            public List<Ext> b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (List) ipChange2.ipc$dispatch("4a17df3e", new Object[]{this}) : a2;
            }
        };
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Map<Class<? extends bqg>, String> map = this.b;
        if (map != null) {
            map.clear();
        }
        Map<String, List<bqg>> map2 = this.c;
        if (map2 == null) {
            return;
        }
        map2.clear();
    }
}
