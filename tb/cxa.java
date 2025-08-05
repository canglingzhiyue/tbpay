package tb;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class cxa {
    public static final String DEFAULT_NAME = "DEFAULT_INSTANCE";

    public static String a(InputStream inputStream, String str) throws UnsupportedEncodingException, IOException {
        StringWriter stringWriter = new StringWriter();
        a(new InputStreamReader(inputStream, str), stringWriter);
        return stringWriter.toString();
    }

    public static String a(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return "/" + str.substring(i);
    }

    public static Map<String, String> a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(a(entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public static cwr a(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return cwr.CHINA;
                }
                if (str2.contains("connect-dre")) {
                    return cwr.GERMANY;
                }
                if (str2.contains("connect-drru")) {
                    return cwr.RUSSIA;
                }
                if (str2.contains("connect-dra")) {
                    return cwr.SINGAPORE;
                }
            }
            return cwr.UNKNOWN;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 2155) {
            if (hashCode != 2177) {
                if (hashCode != 2627) {
                    if (hashCode == 2644 && str.equals("SG")) {
                        c = 3;
                    }
                } else if (str.equals("RU")) {
                    c = 2;
                }
            } else if (str.equals("DE")) {
                c = 1;
            }
        } else if (str.equals("CN")) {
            c = 0;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? cwr.UNKNOWN : cwr.SINGAPORE : cwr.RUSSIA : cwr.GERMANY : cwr.CHINA;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
        }
    }

    public static void a(Reader reader, Writer writer) throws IOException {
        a(reader, writer, new char[4096]);
    }

    public static void a(Reader reader, Writer writer, char[] cArr) throws IOException {
        while (true) {
            int read = reader.read(cArr);
            if (-1 != read) {
                writer.write(cArr, 0, read);
            } else {
                return;
            }
        }
    }
}
