package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes6.dex */
public class kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(kpq<String> kpqVar) {
        BufferedReader bufferedReader;
        String readLine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f18a1fb0", new Object[]{kpqVar})).booleanValue();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/maps")));
        } catch (Throwable th) {
            ikq.a("filterProcMaps.error", th);
        }
        do {
            readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return false;
            }
        } while (!kpqVar.a(readLine));
        bufferedReader.close();
        return true;
    }
}
