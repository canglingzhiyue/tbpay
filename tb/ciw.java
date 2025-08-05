package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.m;
import java.io.File;

/* loaded from: classes.dex */
public class ciw implements cix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(302037760);
        kge.a(961378442);
    }

    @Override // tb.cix
    public String a(String str, ciu ciuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("654f2b8d", new Object[]{this, str, ciuVar});
        }
        if (str.indexOf("$LAST_MODIFIED_s") >= 0) {
            str = str.replace("$LAST_MODIFIED_s", a(m.f6406a));
        }
        return ciuVar.a(str);
    }

    private String a(Application application) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16f08209", new Object[]{this, application});
        }
        try {
            String str2 = application.getApplicationInfo().sourceDir;
            if (str2 == null) {
                return str2;
            }
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    return str2;
                }
                return (file.lastModified() / 1000) + "";
            } catch (Exception unused) {
                return str;
            }
        } catch (Exception unused2) {
            return "";
        }
    }
}
