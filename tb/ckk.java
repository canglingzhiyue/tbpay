package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ckk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f26336a = "";
    private static String b = "";
    private static String c = "";

    public static synchronized void a(String str) {
        synchronized (ckk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a(arrayList);
        }
    }

    public static synchronized void a(String str, String str2, String str3) {
        synchronized (ckk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
                return;
            }
            f26336a = str;
            b = str2;
            c = str3;
        }
    }

    public static synchronized void a(Throwable th) {
        String str;
        synchronized (ckk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str = stringWriter.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
            a(arrayList);
        }
    }

    private static synchronized void a(List<String> list) {
        synchronized (ckk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{list});
                return;
            }
            if (!cjw.a(b) && !cjw.a(c)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(c);
                for (String str : list) {
                    stringBuffer.append(", ".concat(String.valueOf(str)));
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f26336a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f26336a, b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        }
    }
}
