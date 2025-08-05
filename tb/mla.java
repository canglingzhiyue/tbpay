package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class mla extends mkh<mkz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f31082a = 0;

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [tb.mkz, java.lang.Object] */
    @Override // tb.mkh
    public /* synthetic */ mkz a(int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8d357de8", new Object[]{this, new Integer(i), map}) : c(i, map);
    }

    @Override // tb.mkh
    public int[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ab8ad2ba", new Object[]{this}) : new int[]{0};
    }

    @Override // tb.mkh
    public void b(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
        } else {
            this.f31082a = SystemClock.uptimeMillis();
        }
    }

    public mkz c(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkz) ipChange.ipc$dispatch("d984c45e", new Object[]{this, new Integer(i), map});
        }
        long j = this.f31082a;
        if (j <= 0) {
            return new mkz();
        }
        return new mkz(j, SystemClock.uptimeMillis());
    }
}
