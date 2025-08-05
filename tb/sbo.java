package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public class sbo implements sbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f33459a;
    private TreeMap<String, String> b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // tb.sbn
    public Iterator<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("84a6a8ee", new Object[]{this}) : Collections.unmodifiableSet(this.b.keySet()).iterator();
    }

    @Override // tb.sbn
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String str2 = this.b.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // tb.sbn
    public byte[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[]{this}) : this.f33459a;
    }

    @Override // tb.sbk
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.b.put(str, str2);
        }
    }

    @Override // tb.sbn
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : this.b.containsKey(str);
    }
}
