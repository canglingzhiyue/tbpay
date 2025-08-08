package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes5.dex */
public class ior {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29193a;

    static {
        kge.a(180984447);
        f29193a = "umi_pub_session";
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null) {
            return UUID.randomUUID().toString();
        }
        String queryParameter = uri.getQueryParameter(f29193a);
        return !StringUtils.isEmpty(queryParameter) ? queryParameter : UUID.randomUUID().toString();
    }
}
