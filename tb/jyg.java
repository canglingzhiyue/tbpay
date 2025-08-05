package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.jarvis.utils.FixedSizeLinkedHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class jyg implements jyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f29861a;
    private jxs b;
    private volatile FixedSizeLinkedHashMap<String, BaseCellBean> c;
    private volatile FixedSizeLinkedHashMap<String, BaseCellBean> d;
    private volatile FixedSizeLinkedHashMap<String, BaseCellBean> e;
    private volatile List<String> f = new ArrayList();
    private volatile List<String> g = new ArrayList();
    private final Object h = new Object();
    private final Object i = new Object();
    private final Object j = new Object();

    static {
        kge.a(-1375325857);
        kge.a(-567624131);
    }

    public jyg(jxs jxsVar, int i) {
        this.f29861a = i;
        this.b = jxsVar;
        this.c = new FixedSizeLinkedHashMap<>(i);
        this.d = new FixedSizeLinkedHashMap<>(i);
        this.e = new FixedSizeLinkedHashMap<>(i);
    }

    @Override // tb.jyh
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f29861a = i;
        this.c.setMaxSize(i);
        this.d.setMaxSize(i);
        this.e.setMaxSize(i);
    }

    @Override // tb.jyh
    public Map<String, BaseCellBean> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.c;
    }

    @Override // tb.jyh
    public Map<String, BaseCellBean> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.d;
    }

    @Override // tb.jyh
    public void a(Collection<BaseCellBean> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
            return;
        }
        synchronized (this.h) {
            FixedSizeLinkedHashMap<String, BaseCellBean> a2 = a(this.c, this.b);
            for (BaseCellBean baseCellBean : collection) {
                a2.remove(baseCellBean.itemId);
                a2.put(baseCellBean.itemId, baseCellBean);
            }
            this.c = a2;
        }
        k.d("[XSearchJarvis]", "当前自然结果buffer个数：" + this.c.size(), new Object[0]);
    }

    @Override // tb.jyh
    public void b(Collection<BaseCellBean> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd58cda", new Object[]{this, collection});
            return;
        }
        synchronized (this.i) {
            FixedSizeLinkedHashMap<String, BaseCellBean> a2 = a(this.d, this.b);
            for (BaseCellBean baseCellBean : collection) {
                a2.remove(baseCellBean.itemId);
                a2.put(baseCellBean.itemId, baseCellBean);
            }
            this.d = a2;
        }
        k.d("[XSearchJarvis]", "当前广告结果buffer个数：" + this.d.size(), new Object[0]);
    }

    @Override // tb.jyh
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        e();
        f();
    }

    @Override // tb.jyh
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this.h) {
            this.c = new FixedSizeLinkedHashMap<>(this.f29861a);
        }
    }

    @Override // tb.jyh
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.i) {
            this.d = new FixedSizeLinkedHashMap<>(this.f29861a);
        }
    }

    @Override // tb.jyh
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        synchronized (this.j) {
            this.e = new FixedSizeLinkedHashMap<>(this.f29861a);
        }
    }

    @Override // tb.jyh
    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    @Override // tb.jyh
    public void b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.g = list;
        }
    }

    @Override // tb.jyh
    public List<String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.f;
    }

    @Override // tb.jyh
    public List<String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.g;
    }

    private FixedSizeLinkedHashMap<String, BaseCellBean> a(Map<String, BaseCellBean> map, jxs jxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FixedSizeLinkedHashMap) ipChange.ipc$dispatch("8bf63a64", new Object[]{this, map, jxsVar});
        }
        FixedSizeLinkedHashMap<String, BaseCellBean> fixedSizeLinkedHashMap = new FixedSizeLinkedHashMap<>(this.f29861a);
        for (Map.Entry<String, BaseCellBean> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!jxsVar.a(key)) {
                fixedSizeLinkedHashMap.put(key, entry.getValue());
            } else {
                k.d("[XSearchJarvis]", "buffer中的" + key + "已曝光，移除", new Object[0]);
            }
        }
        return fixedSizeLinkedHashMap;
    }
}
