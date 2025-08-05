package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class tiw<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private T f34138a;
    private tiu b;

    static {
        kge.a(-1392570255);
    }

    public tiw(T t, tiu tiuVar) {
        this.f34138a = t;
        this.b = tiuVar;
    }

    public T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f34138a;
    }

    public tiu b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiu) ipChange.ipc$dispatch("16bc9ddd", new Object[]{this}) : this.b;
    }
}
