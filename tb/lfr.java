package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;

/* loaded from: classes7.dex */
public class lfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1790122324);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : bip.REQUEST_ONCE.equals(str) ? ICacheReqBizParamsService.SaveMode.DISK_AUTO_ERASED : ICacheReqBizParamsService.SaveMode.DISK_NOT_ERASED;
    }
}
