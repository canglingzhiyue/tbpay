package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.jfv;

/* loaded from: classes6.dex */
public class jgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static File a(jdy jdyVar, File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("229f2bd3", new Object[]{jdyVar, file, str});
        }
        String a2 = "anr".equals(str) ? jfv.a.a(jdyVar, str, "scan") : file.getName().replace("jni.log", "scan_native.log");
        File file2 = new File(new jgd(jdyVar.a(), jdyVar.c()).a(), a2);
        if (file.renameTo(file2)) {
            return file2;
        }
        jfj.b("Uc2TbUtils", "move file failed", file, a2);
        return null;
    }

    public static File a(jdy jdyVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("7b915a0", new Object[]{jdyVar, str, str2}) : a(jdyVar, new File(str), str2);
    }
}
