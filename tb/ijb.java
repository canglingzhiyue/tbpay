package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* loaded from: classes.dex */
public class ijb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> T a(ijd ijdVar, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac1b00f4", new Object[]{ijdVar, str, cls});
        }
        try {
            String a2 = a(ijdVar, str);
            if (!ikw.b((CharSequence) a2)) {
                return null;
            }
            RSoLog.d("config helper -> readFromCustomIndex = " + a2);
            return (T) JSON.parseObject(a2, cls);
        } catch (Throwable th) {
            ikq.a("index->readData", th);
            return null;
        }
    }

    public static String a(ijd ijdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bceb2f61", new Object[]{ijdVar, str});
        }
        if (!ijdVar.a("switch_remote_index_enabled3", true)) {
            RSoLog.c("config -> readCustomContent, enabled = false");
            return null;
        }
        String d = ijdVar.d(null);
        if (ikw.b((CharSequence) d)) {
            try {
                return JSON.parseObject(d).getString(str);
            } catch (Throwable th) {
                ikq.a("index->readData", th);
            }
        }
        return null;
    }
}
