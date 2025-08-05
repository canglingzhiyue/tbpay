package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public final class gnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(573963062);
    }

    public static String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            return "";
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        String str = null;
        if (headerFields != null && headerFields.get(HttpConstant.EAGLE_EYE_ID_2) != null) {
            str = headerFields.get(HttpConstant.EAGLE_EYE_ID_2).get(0);
        }
        return str == null ? "" : str;
    }
}
