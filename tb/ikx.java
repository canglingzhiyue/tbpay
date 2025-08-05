package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* loaded from: classes.dex */
public final class ikx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            boolean isFile = new File("/data/local/tmp/swallows", str).isFile();
            if (isFile) {
                RSoLog.c("SwitchUtils.read(" + str + ") = true");
            }
            return isFile;
        } catch (Throwable th) {
            RSoLog.a("SwitchUtils.read err", th);
            return false;
        }
    }

    public static Properties b(String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("ae3a413f", new Object[]{str});
        }
        Properties properties = new Properties();
        try {
            file = new File("/data/local/tmp/swallows", str);
        } catch (Throwable th) {
            RSoLog.a("readKV", th);
        }
        if (file.isFile() && file.length() >= 1) {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
            fileInputStream.close();
            return properties;
        }
        return properties;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            File file = new File("/data/local/tmp/swallows", str);
            if (file.isFile() && file.length() >= 1) {
                String str2 = new String(iku.e(file));
                if (ikw.b((CharSequence) str2)) {
                    RSoLog.c("SwitchUtils.readContent(" + str + ") = exist");
                }
                return str2;
            }
            return null;
        } catch (Throwable th) {
            RSoLog.a("readContent", th);
            return null;
        }
    }
}
