package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class kci {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1788632335);
    }

    public static StringBuilder a(long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("71beeb77", new Object[]{new Long(j)});
        }
        StringBuilder sb = new StringBuilder(32);
        long j2 = j / 100000000;
        if (j2 >= 1) {
            sb.append(j2);
            long j3 = (j % 100000000) / 10000000;
            if (j3 > 0) {
                sb.append(".");
                sb.append(j3);
            }
            str = "亿";
        } else {
            long j4 = j / 10000;
            if (j4 < 1) {
                sb.append(j);
                return sb;
            }
            sb.append(j4);
            long j5 = (j % 10000) / 1000;
            if (j5 > 0) {
                sb.append(".");
                sb.append(j5);
            }
            str = "万";
        }
        sb.append(str);
        return sb;
    }
}
