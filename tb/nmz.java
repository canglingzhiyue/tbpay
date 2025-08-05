package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nmz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL_IN = 2;
    public static final int PART_IN = 1;
    public static final int SKIP = 0;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i == 1 ? "PART_IN" : i == 2 ? "ALL_IN" : "SKIP";
    }
}
