package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes4.dex */
public class dps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(745040386);
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, String str) throws IOException {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e750584", new Object[]{zipFile, zipEntry, str});
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                a(inputStream, fileOutputStream);
                a(inputStream);
                a(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                a(inputStream);
                a(fileOutputStream2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static void a(File file, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec608ed0", new Object[]{file, list});
        } else if (file != null && file.exists() && file.isDirectory() && list != null && !list.isEmpty()) {
            for (String str : list) {
                File file2 = new File(file, str);
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efb2add", new Object[]{inputStream, outputStream});
            return;
        }
        byte[] bArr = new byte[4092];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
