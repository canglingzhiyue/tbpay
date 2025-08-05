package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class bgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public interface a {
        void a(ZipEntry zipEntry);
    }

    static {
        kge.a(-75768024);
    }

    public static void a(ZipFile zipFile, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c313e97a", new Object[]{zipFile, aVar});
            return;
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (!nextElement.getName().startsWith("../") && aVar != null) {
                aVar.a(nextElement);
            }
        }
    }
}
