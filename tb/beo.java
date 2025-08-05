package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class beo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(266492553);
    }

    public static boolean a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{mtopResponse})).booleanValue();
        }
        if (mtopResponse == null) {
            return false;
        }
        return mtopResponse.getResponseCode() == 420 || "ANDROID_SYS_API_FLOW_LIMIT_LOCKED".equals(mtopResponse.getRetCode());
    }

    public static String b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2ef8f2", new Object[]{mtopResponse});
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
