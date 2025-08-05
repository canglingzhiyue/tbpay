package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.utils.b;
import com.taobao.android.festival.utils.c;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class gjb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BUFFER_SIZE = 2048;
    public static final String SP_KEY_CACHED_SKIN_MAP = "cached_skins";
    public static final String SP_KEY_CURRENT_SKIN_CODE = "current_skin_code";
    public static final String SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN = "is_default_village_skin";
    public static final String SP_KEY_IGNORE_FESTIVAL_END_TIME = "ignore_festival_end_time";
    public static final String SP_KEY_IGNORE_FESTIVAL_VESION = "ignore_festival_version";
    public static final String SP_KEY_ZIP_MAP = "downloaded_zips";

    /* renamed from: a  reason: collision with root package name */
    private static File f28338a;
    private static volatile SharedPreferences b;

    static {
        kge.a(588431033);
        b = null;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        if (!b.a(f28338a)) {
            File a2 = b.a(Globals.getApplication().getApplicationContext());
            if (a2 == null) {
                return;
            }
            f28338a = new File(a2, "festival");
        }
        if (f28338a.exists()) {
            return;
        }
        f28338a.mkdirs();
    }

    public static File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{str});
        }
        a();
        return new File(f28338a, str);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        a();
        if (f28338a == null) {
            return null;
        }
        return f28338a + File.separator + "pic_cache" + File.separator + str + File.separator;
    }

    public static boolean c(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        File file = new File(b(str));
        return file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0;
    }

    public static byte[] d(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7527e788", new Object[]{str});
        }
        File a2 = a(str);
        if (a2.exists()) {
            return c.a(new FileInputStream(a2));
        }
        return null;
    }

    public static boolean a(String str, byte[] bArr) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a35a7c7d", new Object[]{str, bArr})).booleanValue();
        }
        File a2 = a(str);
        File file = new File(a2.getAbsolutePath() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            z = c.a(new FileOutputStream(file), bArr);
            if (z) {
                try {
                    if (a2.exists()) {
                        a2.delete();
                    }
                    file.renameTo(a2);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TLog.loge("SkinCache", str + th.getMessage());
                        if (!z) {
                            file.delete();
                        }
                        return false;
                    } finally {
                        if (!z) {
                            file.delete();
                        }
                    }
                }
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public static void b(String str, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278ac97a", new Object[]{str, bArr});
            return;
        }
        a();
        if (c(str)) {
            return;
        }
        String b2 = b(str);
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                    String replaceAll = (b2 + name).replaceAll("\\*", "/");
                    if (!replaceAll.contains("../")) {
                        File file = new File(replaceAll.substring(0, replaceAll.lastIndexOf(47)));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        if (!new File(replaceAll).isDirectory()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(replaceAll);
                            byte[] bArr2 = new byte[2048];
                            while (true) {
                                int read = zipInputStream.read(bArr2);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr2, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                        }
                    }
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }

    public static void a(byte[] bArr, String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c168fcd", new Object[]{bArr, str, str2, str3});
            return;
        }
        a();
        File file = new File(b(str) + str2 + File.separator + str3 + ".png");
        if (file.exists()) {
            return;
        }
        file.getParentFile().mkdirs();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr2 = new byte[2048];
        while (true) {
            int read = byteArrayInputStream.read(bArr2);
            if (read != -1) {
                fileOutputStream.write(bArr2, 0, read);
            } else {
                byteArrayInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        a();
        File file = new File(b(str));
        if (!file.exists()) {
            return;
        }
        a(file);
    }

    private static void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
            file.delete();
        } else {
            file.delete();
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue();
        }
        File a2 = a(str);
        File file = new File(a2.getAbsolutePath() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
        return a2.delete();
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        b();
        return b.getString(str, "");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        b();
        SharedPreferences.Editor edit = b.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (b != null) {
        } else {
            synchronized (gjb.class) {
                if (b == null) {
                    b = kgo.a(Globals.getApplication(), "festival_zip", 0);
                }
            }
        }
    }
}
