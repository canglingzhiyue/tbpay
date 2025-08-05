package com.taobao.common.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1910552803);
    }

    public static int[] a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("81233af2", new Object[]{str}) : a(c(str).split(" "));
    }

    public static int[] a(String str, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a351f5f3", new Object[]{str, new Integer(i)});
        }
        String[] d = d(str);
        for (int i2 = 0; i2 < d.length; i2++) {
            d[i2] = d[i2].split(" ")[i];
        }
        return a(d);
    }

    public static String b(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            String a2 = a(fileInputStream, StandardCharsets.US_ASCII);
            fileInputStream.close();
            return a2;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String a(InputStream inputStream, Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("353bb007", new Object[]{inputStream, charset});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[40960];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), charset);
            }
        }
    }

    public static String c(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            String readLine = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.US_ASCII)).readLine();
            fileInputStream.close();
            return readLine;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String[] d(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("52e2b884", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.US_ASCII));
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    arrayList.add(readLine);
                } else {
                    fileInputStream.close();
                    return (String[]) arrayList.toArray(new String[0]);
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int[] a(String[] strArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("729b880d", new Object[]{strArr});
        }
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = Integer.parseInt(strArr[i]);
        }
        return iArr;
    }

    public static int b(String str, int i) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue() : Integer.parseInt(c(str), i);
    }

    public static String a(String[] strArr, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5318d4ff", new Object[]{strArr, str});
        }
        for (String str2 : strArr) {
            if (str2.startsWith(str)) {
                return str2;
            }
        }
        return null;
    }
}
