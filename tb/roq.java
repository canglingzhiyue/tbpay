package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public class roq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f33271a;
    public byte[] b;
    public int c;
    public int d;

    public String toString() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ProtocolData[");
        sb.append(hashCode());
        sb.append("] header==null:");
        if (this.f33271a == null) {
            z = true;
        }
        sb.append(z);
        sb.append(" offset:");
        sb.append(this.c);
        sb.append(" length:");
        sb.append(this.d);
        return sb.toString();
    }
}
