package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class mzb implements mza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f31329a;

    static {
        kge.a(873745435);
        kge.a(-507322220);
    }

    public mzb(Map<String, String> map) {
        this.f31329a = map;
    }

    @Override // tb.mza, java.lang.Iterable
    public Iterator<Map.Entry<String, String>> iterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this}) : this.f31329a.entrySet().iterator();
    }
}
