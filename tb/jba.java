package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static jba a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jba) ipChange.ipc$dispatch("f065015", new Object[0]) : new jba();
    }

    private jba() {
    }

    public List<String> a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bec9888", new Object[]{this, file});
        }
        ArrayList arrayList = new ArrayList();
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            } else if (!readLine.startsWith("#")) {
                                arrayList.add(readLine);
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            jay.a(e);
                            jaz.a(bufferedReader);
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            jaz.a(bufferedReader);
                            throw th;
                        }
                    }
                    jaz.a(bufferedReader2);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return arrayList;
    }
}
