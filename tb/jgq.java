package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes6.dex */
public class jgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f29541a;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (f29541a == null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/comm")));
                f29541a = bufferedReader.readLine();
                bufferedReader.close();
            } catch (Exception unused) {
                f29541a = "";
            }
        }
        return f29541a;
    }
}
