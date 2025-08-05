package tb;

import com.alibaba.jsi.standard.js.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class nes implements nem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Object> f31404a;

    static {
        kge.a(976718903);
        kge.a(-904566936);
    }

    public nes(ArrayList<Object> arrayList) {
        this.f31404a = arrayList;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f31404a.size();
    }

    @Override // tb.nem
    public nej a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nej) ipChange.ipc$dispatch("e6651758", new Object[]{this, new Integer(i)});
        }
        if (a() <= i) {
            return null;
        }
        Object obj = this.f31404a.get(i);
        if (obj instanceof nej) {
            return (nej) obj;
        }
        if (!(obj instanceof b)) {
            return null;
        }
        ((b) obj).a();
        return null;
    }

    @Override // tb.nem
    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        if (a() <= i) {
            return null;
        }
        Object obj = this.f31404a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        if (!(obj instanceof b)) {
            return null;
        }
        ((b) obj).a();
        return null;
    }
}
