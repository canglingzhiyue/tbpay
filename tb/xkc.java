package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

/* loaded from: classes6.dex */
public class xkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        if (file.exists()) {
            return b(file);
        }
        return null;
    }

    private static String b(File file) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa476700", new Object[]{file});
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                    if (!z && readLine.startsWith("logcat:")) {
                        sb.append(jgm.c(300));
                        z = true;
                    }
                } finally {
                }
            }
            if (!z) {
                sb.append(jgm.c(300));
            }
            bufferedReader.close();
        } catch (IOError | IOException e) {
            jfj.b(e);
        }
        return sb.toString();
    }
}
