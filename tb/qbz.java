package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes8.dex */
public class qbz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(215754130);
    }

    public static String a(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return "";
        }
        for (File file2 : listFiles) {
            if (StringUtils.equals("material.json", file2.getName()) || StringUtils.equals("config.json", file2.getName())) {
                return file2.getAbsolutePath();
            }
        }
        return "";
    }
}
