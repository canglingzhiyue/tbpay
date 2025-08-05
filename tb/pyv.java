package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

/* loaded from: classes8.dex */
public class pyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(854339629);
    }

    public static String a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return a(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("172620d5", new Object[]{inputStream}) : a(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    }

    public static String a(Reader reader) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57564928", new Object[]{reader});
        }
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[4096];
        while (true) {
            int read = reader.read(cArr);
            if (read >= 0) {
                stringWriter.write(cArr, 0, read);
            } else {
                return stringWriter.toString();
            }
        }
    }
}
