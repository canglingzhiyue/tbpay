package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class hys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1011246697);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && activity.isDestroyed();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        byte[] b = b(str);
        if (b != null) {
            return new String(b);
        }
        return null;
    }

    public static byte[] b(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7d24c9ca", new Object[]{str});
        }
        FileInputStream fileInputStream2 = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] a2 = a(fileInputStream);
            try {
                fileInputStream.close();
            } catch (Exception unused2) {
            }
            return a2;
        } catch (Exception unused3) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            fileInputStream2 = fileInputStream;
            th = th2;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        byte[] bArr = new byte[1024];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        file.delete();
    }
}
