package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class CountObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String arg;
    public String module;
    public String modulePoint;
    public double value;

    static {
        kge.a(-1223175882);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("[module:");
        sb.append(this.module);
        sb.append(" modulePoint:");
        sb.append(this.modulePoint);
        sb.append(" arg:");
        sb.append(this.arg);
        sb.append(" value:");
        sb.append(this.value);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
