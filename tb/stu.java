package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.k;
import com.taobao.utils.Global;
import java.io.File;

/* loaded from: classes7.dex */
public class stu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-345431214);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            stv.a(k.TAG, "getUrlLocalPathInBootImage url=" + str);
            String c = keo.c(str);
            stv.a(k.TAG, "getUrlLocalPathInBootImage fileName=" + c);
            if (!TextUtils.isEmpty(c)) {
                File file = new File(keo.d(tiq.BIZ_CODE), c);
                if (!file.exists()) {
                    stv.a(k.TAG, "getUrlLocalPathInBootImage file not exist, fileName=" + c);
                    return null;
                }
                return file.getAbsolutePath();
            }
        } catch (Throwable th) {
            stv.a(k.TAG, "getUrlLocalPathInBootImage error=", th);
        }
        return null;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        try {
            String c = keo.c(str);
            if (!TextUtils.isEmpty(c)) {
                return new File(keo.d(tiq.BIZ_CODE), c).exists();
            }
        } catch (Throwable th) {
            stv.a(k.TAG, "isResourceExist error=", th);
        }
        return false;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            stv.a(k.TAG, "getUrlLocalPath url=" + str);
            String c = keo.c(str);
            stv.a(k.TAG, "getUrlLocalPath fileName=" + c);
            if (!TextUtils.isEmpty(c)) {
                File file = new File(a(), c);
                if (!file.exists()) {
                    stv.a(k.TAG, "getUrlLocalPath file not exist, fileName=" + c);
                    file = new File(keo.d(tiq.BIZ_CODE), c);
                    if (!file.exists()) {
                        stv.a(k.TAG, "getUrlLocalPath file not exist in bootImage, fileName=" + c);
                        return null;
                    }
                }
                return file.getAbsolutePath();
            }
        } catch (Throwable th) {
            stv.a(k.TAG, "getUrlLocalPath error=", th);
        }
        return null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        File filesDir = Global.getApplication().getFilesDir();
        if (filesDir == null) {
            return null;
        }
        File file = new File(filesDir, File.separator + "mmadbiz");
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        stv.a(k.TAG, "localResourcesRootPath rootPath=" + absolutePath);
        return absolutePath;
    }
}
