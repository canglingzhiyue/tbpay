package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.vessel.utils.b;

/* loaded from: classes4.dex */
public class emd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(101072457);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(k.HTTP_PREFIX) || str.startsWith(k.HTTPS_PREFIX)) {
            return str;
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            return b.HTTPS_SCHEMA + str;
        }
        return k.HTTPS_PREFIX + str;
    }
}
