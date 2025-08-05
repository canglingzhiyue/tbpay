package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static jfv a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfv) ipChange.ipc$dispatch("9917aa4d", new Object[]{file});
        }
        String name = file.getName();
        if (name.endsWith("java.log")) {
            return new jfv(file, "java");
        }
        if (name.endsWith("anr.log")) {
            return new jfv(file, "anr");
        }
        if (!name.endsWith("native.log") && !name.endsWith("jni.log")) {
            jfj.b("TCrashReportFactory", "not support file", file.getAbsolutePath());
            return null;
        }
        return new jfv(file, "native");
    }

    public static jfv a(File file, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfv) ipChange.ipc$dispatch("b53adb03", new Object[]{file, str}) : new jfv(file, str);
    }
}
