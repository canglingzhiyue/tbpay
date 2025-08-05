package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes.dex */
public class jbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static jbc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jbc) ipChange.ipc$dispatch("f065053", new Object[0]) : new jbc();
    }

    private jbc() {
    }

    public Integer a(File file) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("41faa546", new Object[]{this, file});
        }
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null && (parseInt = Integer.parseInt(readLine)) > 0 && parseInt < 3) {
                            Integer valueOf = Integer.valueOf(parseInt);
                            jaz.a(bufferedReader2);
                            return valueOf;
                        }
                        jaz.a(bufferedReader2);
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        jay.a(e);
                        jaz.a(bufferedReader);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        jaz.a(bufferedReader);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return -1;
    }
}
