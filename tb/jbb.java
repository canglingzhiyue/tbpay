package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class jbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static jbb a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jbb) ipChange.ipc$dispatch("f065034", new Object[0]) : new jbb();
    }

    private jbb() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public Map<String, String> a(File file) {
        BufferedReader bufferedReader;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b928ffd4", new Object[]{this, file});
        }
        HashMap hashMap = new HashMap();
        if (file.exists()) {
            BufferedReader bufferedReader2 = 0;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            bufferedReader2 = readLine.startsWith("#");
                            if (bufferedReader2 == 0 && (bufferedReader2 = (split = readLine.split("=")).length) == 2) {
                                bufferedReader2 = split[0].trim();
                                hashMap.put(bufferedReader2, split[1].trim());
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader2 = bufferedReader;
                            jay.a(e);
                            jaz.a(bufferedReader2);
                            return hashMap;
                        } catch (Throwable th) {
                            th = th;
                            jaz.a(bufferedReader);
                            throw th;
                        }
                    }
                    jaz.a(bufferedReader);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        }
        return hashMap;
    }
}
