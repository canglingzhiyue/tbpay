package android.taobao.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import tb.kge;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-268523744);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(c.HTML40, str);
    }

    public static String a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3d14894", new Object[]{cVar, str});
        }
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length());
            if (a(cVar, str, stringWriter)) {
                return stringWriter.toString();
            }
        } catch (IOException unused) {
        }
        return str;
    }

    private static boolean a(c cVar, String str, Writer writer) throws IOException {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27d981f0", new Object[]{cVar, str, writer})).booleanValue();
        }
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        }
        if (str == null) {
            return false;
        }
        boolean z = false;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt == '&') {
                i = i3 + 1;
                int indexOf = str.indexOf(59, i);
                if (indexOf == -1 || i >= indexOf - 1) {
                    writer.write(charAt);
                } else {
                    if (str.charAt(i) == '#') {
                        int i4 = i3 + 2;
                        int i5 = 10;
                        if (i4 >= i2) {
                            writer.write(charAt);
                            writer.write(35);
                        } else {
                            char charAt2 = str.charAt(i4);
                            if (charAt2 == 'x' || charAt2 == 'X') {
                                i4++;
                                i5 = 16;
                                if (i4 >= i2) {
                                    writer.write(charAt);
                                    writer.write(35);
                                }
                            }
                            try {
                                writer.write(Integer.parseInt(str.substring(i4, indexOf), i5));
                            } catch (NumberFormatException unused) {
                                writer.write(charAt);
                                writer.write(35);
                            }
                        }
                        i3 = i + 1;
                    } else {
                        String substring = str.substring(i, indexOf);
                        int a2 = cVar != null ? cVar.a(substring) : -1;
                        if (a2 == -1) {
                            writer.write(38);
                            writer.write(substring);
                            writer.write(59);
                            i = indexOf;
                            i3 = i + 1;
                        } else {
                            writer.write(a2);
                        }
                    }
                    z = true;
                    i = indexOf;
                    i3 = i + 1;
                }
            } else {
                writer.write(charAt);
            }
            i = i3;
            i3 = i + 1;
        }
        return z;
    }
}
