package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;

@TableName("ap_alarm")
/* loaded from: classes.dex */
public class btj extends bth {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("scp")
    public int e = 0;
    @Column("fcp")
    public int f = 0;

    static {
        kge.a(397335587);
    }

    public static /* synthetic */ Object ipc$super(btj btjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean a(int i, String str, String str2, Boolean bool, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9a3b40b", new Object[]{this, new Integer(i), str, str2, bool, map})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return a(i, arrayList, bool.booleanValue());
    }

    private boolean a(int i, ArrayList<String> arrayList, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9706bc9", new Object[]{this, new Integer(i), arrayList, new Boolean(z)})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return a(i, z);
        }
        String remove = arrayList.remove(0);
        if (a(remove)) {
            return ((btj) c(remove)).a(i, arrayList, z);
        }
        return a(i, z);
    }

    private boolean a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11929d", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (z) {
            apr.a("AlarmConfig", "samplingSeed", Integer.valueOf(i), "sampling", Integer.valueOf(this.e));
            return i < this.e;
        }
        apr.a("AlarmConfig", "samplingSeed", Integer.valueOf(i), "sampling", Integer.valueOf(this.f));
        return i < this.f;
    }

    @Override // tb.bth
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        this.f = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AlarmConfig{module=" + this.b + ", monitorPoint=" + this.f26128a + ", offline=" + this.d + ", failSampling=" + this.f + ", successSampling=" + this.e + '}';
    }
}
