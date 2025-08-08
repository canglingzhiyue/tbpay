package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;

/* loaded from: classes7.dex */
public class xnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1002248328);
    }

    public static String a(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e7d5430", new Object[]{new Long(j), str, str2});
        }
        String str3 = null;
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                ldf.d(str2, "getBehaviorFeature startTime : " + j);
                BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
                queryArgs.setStartTime(j);
                str3 = BUFS.getFeature(queryArgs, str, "PageHome", "Page_Home");
            } catch (InfoFlowRuntimeException e) {
                ldf.a(str2, "getBehaviorFeature error, 调度 bx 出现 crash 被捕获", e);
            }
            ldf.d(str2, "behaviorFeature : " + str3);
        }
        return str3;
    }
}
