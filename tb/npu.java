package tb;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.e;
import com.taobao.tao.Globals;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: classes7.dex */
public class npu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f31635a;

    static {
        kge.a(-943933142);
    }

    private static synchronized void a() {
        synchronized (npu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (f31635a) {
            } else {
                q.i("SearchFileCacheUtil", "init");
                b();
                f31635a = true;
                q.i("SearchFileCacheUtil", "init completed!");
            }
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        File c = c();
        if (c.exists()) {
            return;
        }
        boolean mkdir = c.mkdir();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("success", String.valueOf(mkdir));
        e.a("SearchCacheCreate", (ArrayMap<String, String>) arrayMap);
        q.i("SearchFileCacheUtil", "create search dir:" + mkdir);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (r.n()) {
            q.e("SearchFileCacheUtil", "search history is disabled");
            return false;
        }
        q.i("SearchFileCacheUtil", "save file " + str);
        if (!StringUtils.isEmpty(str) && str2 != null) {
            a();
            if (!f31635a) {
                q.e("SearchFileCacheUtil", "search file cache is not inited!");
                return false;
            }
            File c = c(str);
            if (c == null) {
                q.e("SearchFileCacheUtil", "target file is null");
                return false;
            }
            try {
                q.i("SearchFileCacheUtil", "file path:" + c);
                FileOutputStream fileOutputStream = new FileOutputStream(c, false);
                fileOutputStream.write(str2.getBytes("UTF-8"));
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                q.a("SearchFileCacheUtil", "save file error:" + str, th);
            }
        }
        return false;
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (r.n()) {
            q.e("SearchFileCacheUtil", "search history is disabled");
            return "";
        }
        q.i("SearchFileCacheUtil", "load file " + str);
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        a();
        if (!f31635a) {
            q.e("SearchFileCacheUtil", "search file cache is not inited!");
            return "";
        }
        File c = c(str);
        if (c == null) {
            q.e("SearchFileCacheUtil", "target file is null");
            return "";
        } else if (!c.exists()) {
            q.i("SearchFileCacheUtil", "target file does not exists");
            return "";
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(c);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            } catch (Throwable th) {
                q.a("SearchFileCacheUtil", "load file error:" + str, th);
                str2 = null;
            }
            return StringUtils.isEmpty(str2) ? "" : str2;
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (r.n()) {
            q.e("SearchFileCacheUtil", "search history is disabled");
            return false;
        }
        q.i("SearchFileCacheUtil", "delete file " + str);
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        a();
        if (!f31635a) {
            q.e("SearchFileCacheUtil", "search file cache is not inited!");
            return false;
        }
        File c = c(str);
        if (c == null) {
            q.e("SearchFileCacheUtil", "target file is null");
            return false;
        }
        return c.delete();
    }

    private static File c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        File c = c();
        if (c.exists()) {
            return new File(c, str);
        }
        return null;
    }

    private static File c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("298485e3", new Object[0]) : new File(Globals.getApplication().getFilesDir(), "search");
    }
}
