package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes6.dex */
public class jgo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f29539a = Process.myPid();
    private static final String[] b = {"FDSize", "VmPeak", "VmSize", "VmHWM", "VmRSS", "VmData", "VmStk", "VmExe", "VmLib", "VmSwap", "Threads"};

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + f29539a + "/status")));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (a(readLine)) {
                        String replace = readLine.replace("\t", "").replace(" ", "");
                        sb.append(" ,");
                        sb.append(replace);
                        if (replace.startsWith("Threads")) {
                            String[] split = replace.split(":");
                            if (split.length > 1 && Integer.parseInt(split[1]) > 1000) {
                                sb.append(jgs.a());
                            }
                        }
                    }
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
            }
        } catch (Throwable th) {
            jfj.b(th);
            return null;
        }
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        for (String str2 : b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
