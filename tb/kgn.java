package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class kgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1945334538);
        kge.a(1392673936);
    }

    public static kgn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kgn) ipChange.ipc$dispatch("f06d8cc", new Object[0]) : new kgn();
    }

    private kgn() {
    }

    public Map<String, String> a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b928ffd4", new Object[]{this, file});
        }
        HashMap hashMap = new HashMap();
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    tco.c("File2MapTransfer", readLine);
                    if (!readLine.startsWith("#")) {
                        String[] split = readLine.split("=");
                        if (split.length == 2) {
                            hashMap.put(split[0].trim(), split[1].trim());
                        }
                    }
                }
                bufferedReader.close();
            } catch (Exception e) {
                tco.a(e);
            }
        }
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
            tco.a(e);
        }
    }
}
