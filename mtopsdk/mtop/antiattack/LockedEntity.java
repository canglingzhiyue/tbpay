package mtopsdk.mtop.antiattack;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class LockedEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String key;
    public long lockInterval;
    public long lockStartTime;

    static {
        kge.a(1229063592);
    }

    public LockedEntity(String str, long j, long j2) {
        this.key = str;
        this.lockStartTime = j;
        this.lockInterval = j2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("LockedEntity [key=");
        sb.append(this.key);
        sb.append(", lockStartTime=");
        sb.append(this.lockStartTime);
        sb.append(", lockInterval=");
        sb.append(this.lockInterval);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
