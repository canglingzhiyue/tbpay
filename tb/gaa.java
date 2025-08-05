package tb;

import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public class gaa implements gad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f28245a;
    private b b;
    private List<Object> c;
    private List<Long> d;
    private final int e;
    private final AtomicLong f = new AtomicLong(0);

    /* loaded from: classes5.dex */
    public interface b {
        boolean a(Long l, DXWidgetNode dXWidgetNode);
    }

    static {
        kge.a(683704455);
        kge.a(672283899);
    }

    public gaa(int i) {
        this.e = i;
    }

    public List<DXWidgetNode> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        a aVar = this.f28245a;
        if (aVar != null) {
            return new ArrayList(aVar.snapshot().values());
        }
        return null;
    }

    public void a(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            int max = Math.max(this.e, list.size());
            this.d = new ArrayList();
            this.f28245a = new a(max, h());
            for (int i = 0; i < list.size(); i++) {
                Long d = d(i, list.get(i));
                this.d.add(d);
                this.f28245a.a(d, list.get(i));
            }
        }
    }

    public List<Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
    }

    public void b(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    @Override // tb.gad
    public DXWidgetNode b(int i) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("55a70d59", new Object[]{this, new Integer(i)});
        }
        if (this.f28245a == null || i < 0 || i >= this.d.size() || (l = this.d.get(i)) == null) {
            return null;
        }
        return this.f28245a.get(l);
    }

    @Override // tb.gad
    public void a(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7041c4f4", new Object[]{this, new Integer(i), dXWidgetNode});
        } else if (this.f28245a == null || this.d == null) {
        } else {
            Long d = d(i, dXWidgetNode);
            if (i < 0 || i > this.d.size()) {
                fux.b("DXRecyclerLayout(LRU) appendItem indexOutOfBounds: " + i + " size: " + this.d.size());
                return;
            }
            this.d.add(i, d);
            this.f28245a.a(d, dXWidgetNode);
        }
    }

    public boolean b(int i, DXWidgetNode dXWidgetNode) {
        List<Long> list;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99961a39", new Object[]{this, new Integer(i), dXWidgetNode})).booleanValue();
        }
        if (this.f28245a == null || (list = this.d) == null || i < 0 || i >= list.size() || (l = this.d.get(i)) == null) {
            return false;
        }
        this.f28245a.a(l, dXWidgetNode);
        return true;
    }

    @Override // tb.gad
    public void a(int i, Collection<DXWidgetNode> collection) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b3eb0c", new Object[]{this, new Integer(i), collection});
        } else if (collection != null && !collection.isEmpty() && this.f28245a != null && this.d != null) {
            for (DXWidgetNode dXWidgetNode : collection) {
                int i3 = i + i2;
                Long d = d(i3, dXWidgetNode);
                if (i3 < 0 || i3 > this.d.size()) {
                    return;
                }
                this.d.add(i3, d);
                this.f28245a.a(d, dXWidgetNode);
                i2++;
            }
        }
    }

    @Override // tb.gad
    public int a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("613bf3ba", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (dXWidgetNode != null && this.c != null && dXWidgetNode.getDXRuntimeContext().f() != null) {
            return this.c.indexOf(dXWidgetNode.getDXRuntimeContext().f());
        }
        return -1;
    }

    @Override // tb.gad
    public DXWidgetNode c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6fc28bf8", new Object[]{this, new Integer(i)});
        }
        if (this.f28245a == null) {
            return null;
        }
        List<Long> list = this.d;
        Long remove = (list == null || i < 0 || i >= list.size()) ? null : this.d.remove(i);
        if (remove == null) {
            return null;
        }
        return this.f28245a.remove(remove);
    }

    @Override // tb.gad
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        a aVar = this.f28245a;
        return aVar == null || aVar.size() <= 0;
    }

    @Override // tb.gad
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f28245a == null;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        a aVar = this.f28245a;
        if (aVar != null) {
            return aVar.size();
        }
        return 0;
    }

    @Override // tb.gad
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        List<Object> list = this.c;
        if (list != null && !list.isEmpty()) {
            return this.c.size();
        }
        return 0;
    }

    @Override // tb.gad
    public void c(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ea6f76", new Object[]{this, new Integer(i), dXWidgetNode});
        } else if (this.f28245a == null) {
        } else {
            Long l = null;
            List<Long> list = this.d;
            if (list != null && i >= 0 && i < list.size()) {
                l = this.d.get(i);
            }
            if (l == null) {
                return;
            }
            this.f28245a.remove(l);
            Long d = d(i, dXWidgetNode);
            this.d.set(i, d);
            this.f28245a.a(d, dXWidgetNode);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.f28245a;
        if (aVar == null || aVar.size() == 0) {
            return;
        }
        for (Map.Entry<Long, DXWidgetNode> entry : this.f28245a.snapshot().entrySet()) {
            if ((entry.getValue() instanceof ac) && !((ac) entry.getValue()).s()) {
                this.f28245a.remove(entry.getKey());
            }
        }
    }

    public Long d(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("e4ec4f7e", new Object[]{this, new Integer(i), dXWidgetNode}) : Long.valueOf(this.f.getAndIncrement());
    }

    public b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8e963692", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new b() { // from class: tb.gaa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gaa.b
                public boolean a(Long l, DXWidgetNode dXWidgetNode) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("554e6d6c", new Object[]{this, l, dXWidgetNode})).booleanValue() : (dXWidgetNode instanceof ac) && ((ac) dXWidgetNode).s();
                }
            };
        }
        return this.b;
    }

    /* loaded from: classes5.dex */
    public static class a extends LruCache<Long, DXWidgetNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<Long, DXWidgetNode> f28247a;
        public final b b;

        static {
            kge.a(-1184590237);
        }

        @Override // android.support.v4.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, Long l, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), l, dXWidgetNode, dXWidgetNode2});
            } else {
                a(z, l, dXWidgetNode, dXWidgetNode2);
            }
        }

        public a(int i, b bVar) {
            super(i);
            this.f28247a = new HashMap();
            this.b = bVar;
        }

        public DXWidgetNode a(Long l, DXWidgetNode dXWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("a572ba87", new Object[]{this, l, dXWidgetNode});
            }
            DXWidgetNode put = put(l, dXWidgetNode);
            if (!this.f28247a.isEmpty()) {
                resize(maxSize() + this.f28247a.size());
                for (Map.Entry<Long, DXWidgetNode> entry : this.f28247a.entrySet()) {
                    put(entry.getKey(), entry.getValue());
                }
                this.f28247a.clear();
            }
            return put;
        }

        public void a(boolean z, Long l, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ce810cb", new Object[]{this, new Boolean(z), l, dXWidgetNode, dXWidgetNode2});
            } else if (!z) {
            } else {
                b(l, dXWidgetNode);
            }
        }

        public void b(Long l, DXWidgetNode dXWidgetNode) {
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e2ece07", new Object[]{this, l, dXWidgetNode});
            } else if (dXWidgetNode == null || (bVar = this.b) == null || !bVar.a(l, dXWidgetNode)) {
            } else {
                Long l2 = null;
                Iterator<Map.Entry<Long, DXWidgetNode>> it = snapshot().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<Long, DXWidgetNode> next = it.next();
                    Long key = next.getKey();
                    if (!this.b.a(key, next.getValue())) {
                        l2 = key;
                        break;
                    }
                }
                if (l2 != null) {
                    remove(l2);
                    put(l, dXWidgetNode);
                    return;
                }
                this.f28247a.put(l, dXWidgetNode);
            }
        }
    }
}
