package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class ald {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : StringUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 0);
    }
}
