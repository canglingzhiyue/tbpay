package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jhf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f29552a;

    static {
        kge.a(1198350193);
        f29552a = "TLOG.Protocol.UploadDataBuilder";
    }

    public static String a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : jhw.c(str.getBytes());
    }
}
