package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class riv<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<T> f33173a = new ArrayList<>(4);

    static {
        kge.a(1235597112);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f33173a.size();
    }

    public T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        ArrayList<T> arrayList = this.f33173a;
        return arrayList.remove(arrayList.size() - 1);
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else {
            this.f33173a.add(t);
        }
    }

    public T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        ArrayList<T> arrayList = this.f33173a;
        return arrayList.get(arrayList.size() - 1);
    }

    public T a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)}) : this.f33173a.get(i);
    }

    public T b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e7d36638", new Object[]{this, new Integer(i)}) : this.f33173a.remove(i);
    }

    public void a(int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), t});
        } else {
            this.f33173a.add(i, t);
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f33173a.isEmpty();
    }

    public List<T> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.f33173a;
    }
}
