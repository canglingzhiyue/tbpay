package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(634334006);
        kge.a(661086928);
    }

    public static jre a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jre) ipChange.ipc$dispatch("f068ca1", new Object[0]) : new jre();
    }

    private jre() {
    }

    public Map<String, String> a(File file) {
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b928ffd4", new Object[]{this, file});
        }
        BufferedReader bufferedReader2 = null;
        HashMap hashMap = new HashMap();
        try {
            try {
                if (file.exists()) {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            jrk.b("File2MapTransfer", readLine);
                            if (!readLine.startsWith("#")) {
                                String[] split = readLine.split("=");
                                if (split.length == 2) {
                                    hashMap.put(split[0].trim(), split[1].trim());
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader2 = bufferedReader;
                            jrk.a(e);
                            jrf.a(bufferedReader2);
                            return hashMap;
                        } catch (Throwable th) {
                            th = th;
                            jrf.a(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedReader2 = bufferedReader;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        jrf.a(bufferedReader2);
        return hashMap;
    }

    public void a(Map<String, String> map, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4aa4d4", new Object[]{this, map, file});
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bufferedWriter.append((CharSequence) String.valueOf(entry.getKey())).append((CharSequence) "=").append((CharSequence) entry.getValue()).append((CharSequence) "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            jrk.a(e);
        }
    }
}
