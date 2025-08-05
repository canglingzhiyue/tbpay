package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class fyd<Data> implements fyc<Data> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<Integer> f28202a;
    private Set<Integer> b;
    private int[] c;
    private final Map<Integer, Data> d;
    private final Map<Integer, Integer> e;
    private int f;

    static {
        kge.a(-1235951366);
        kge.a(-219645472);
    }

    public fyd() {
        this(10);
    }

    public fyd(int i) {
        this.f28202a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.d = new HashMap();
        this.e = new HashMap();
        this.c = new int[i];
    }

    @Override // tb.fyc
    public void a(int i, List<Data> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52638a8c", new Object[]{this, new Integer(i), list});
            return;
        }
        f(this.f + list.size());
        for (Data data : list) {
            b(i, data);
        }
    }

    @Override // tb.fyc
    public Data a() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        int g = g() - 1;
        if (g < 0 || (iArr = this.c) == null) {
            return null;
        }
        return this.d.get(Integer.valueOf(iArr[g]));
    }

    @Override // tb.fyc
    public Data a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i <= this.f - 1) {
            return this.d.get(Integer.valueOf(this.c[i]));
        }
        return null;
    }

    @Override // tb.fyc
    public Data c(Data data) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("45d4372c", new Object[]{this, data}) : d(d((fyd<Data>) data));
    }

    public Data d(int i) {
        Data remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("7c3698ba", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i > this.f - 1 || (remove = this.d.remove(Integer.valueOf(this.c[i]))) == null) {
            return null;
        }
        int i2 = (this.f - i) - 1;
        this.f28202a.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
        this.e.remove(Integer.valueOf(remove.hashCode()));
        if (i2 > 0) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i + 1, iArr, i, i2);
            for (Map.Entry<Integer, Integer> entry : this.e.entrySet()) {
                if (entry.getValue().intValue() > i) {
                    this.e.put(entry.getKey(), Integer.valueOf(entry.getValue().intValue() - 1));
                }
            }
            this.f28202a = a(this.f28202a, i);
            this.b = a(this.b, i);
        }
        int[] iArr2 = this.c;
        int i3 = this.f - 1;
        this.f = i3;
        iArr2[i3] = 0;
        return remove;
    }

    @Override // tb.fyc
    public Data a(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("9798556e", new Object[]{this, data});
        }
        int d = d((fyd<Data>) data);
        if (d < 0) {
            return null;
        }
        this.f28202a.remove(Integer.valueOf(d));
        return e(d + 1);
    }

    @Override // tb.fyc
    public Data b(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("eeb6464d", new Object[]{this, data});
        }
        int d = d((fyd<Data>) data);
        if (d >= 0) {
            return e(d + 1);
        }
        return null;
    }

    @Override // tb.fyc
    public List<Data> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f28202a) {
            Data a2 = a(num.intValue());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @Override // tb.fyc
    public List<Data> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.b) {
            Data a2 = a(num.intValue());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @Override // tb.fyc
    public int d(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84b9ddfa", new Object[]{this, data})).intValue();
        }
        Integer num = this.e.get(Integer.valueOf(data.hashCode()));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // tb.fyc
    public boolean e(Data data) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ceeb774c", new Object[]{this, data})).booleanValue() : d((fyd<Data>) data) >= 0;
    }

    @Override // tb.fyc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i > this.f - 1 || this.b.contains(Integer.valueOf(i))) {
        } else {
            this.f28202a.add(Integer.valueOf(i));
            this.b.add(Integer.valueOf(i));
        }
    }

    @Override // tb.fyc
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i > this.f - 1 || !this.f28202a.contains(Integer.valueOf(i))) {
        } else {
            this.f28202a.remove(Integer.valueOf(i));
        }
    }

    @Override // tb.fyc
    public void f(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, data});
            return;
        }
        int d = d((fyd<Data>) data);
        if (d < 0) {
            return;
        }
        this.f28202a.remove(Integer.valueOf(d));
        this.b.add(Integer.valueOf(d));
    }

    public void a(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b.clear();
        this.f28202a.clear();
        if (list == null) {
            return;
        }
        for (Integer num : list) {
            Integer valueOf = Integer.valueOf(Math.max(num.intValue(), 0));
            this.f28202a.add(valueOf);
            this.b.add(valueOf);
        }
    }

    @Override // tb.fyc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a((List<Integer>) null);
        }
    }

    @Override // tb.fyc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b.clear();
        this.b.addAll(this.f28202a);
    }

    @Override // tb.fyc
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f == 0;
    }

    @Override // tb.fyc
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f;
    }

    @Override // tb.fyc
    public List<Data> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            Data data = this.d.get(Integer.valueOf(i));
            if (data != null) {
                arrayList.add(data);
            }
        }
        return arrayList;
    }

    @Override // tb.fyc
    public Integer g(Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("c3c92a71", new Object[]{this, data});
        }
        Integer num = this.e.get(Integer.valueOf(data.hashCode()));
        if (num == null || num.intValue() < 0 || num.intValue() > this.f - 1) {
            return null;
        }
        return Integer.valueOf(a((fyd<Data>) data, this.c[num.intValue()]));
    }

    public int a(int i, Data data) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d36ff2aa", new Object[]{this, new Integer(i), data})).intValue() : data.hashCode() * (i + 1);
    }

    public int a(Data data, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e7da932", new Object[]{this, data, new Integer(i)})).intValue() : (i / data.hashCode()) - 1;
    }

    private Set<Integer> a(Set<Integer> set, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9d66bf7b", new Object[]{this, set, new Integer(i)});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Integer num : set) {
            int intValue = num.intValue();
            if (intValue > i) {
                intValue--;
            }
            linkedHashSet.add(Integer.valueOf(intValue));
        }
        return linkedHashSet;
    }

    private Data e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("c66831fb", new Object[]{this, new Integer(i)});
        }
        while (this.b.contains(Integer.valueOf(i)) && i < this.f) {
            i++;
        }
        Data a2 = a(i);
        if (a2 != null) {
            this.b.add(Integer.valueOf(i));
            this.f28202a.add(Integer.valueOf(i));
        }
        return a2;
    }

    private void b(int i, Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), data});
            return;
        }
        this.d.put(Integer.valueOf(a(i, (int) data)), data);
        this.e.put(Integer.valueOf(data.hashCode()), Integer.valueOf(this.f));
        int[] iArr = this.c;
        int i2 = this.f;
        this.f = i2 + 1;
        iArr[i2] = a(i, (int) data);
    }

    private void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else if (i - this.c.length <= 0) {
        } else {
            g(i);
        }
    }

    private void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        int length = this.c.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = h(i);
        }
        this.c = Arrays.copyOf(this.c, i2);
    }

    private static int h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4137fe7", new Object[]{new Integer(i)})).intValue();
        }
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        return i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
    }
}
