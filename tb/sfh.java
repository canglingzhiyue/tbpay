package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes6.dex */
public class sfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-386921214);
    }

    public static void a(String str, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934bf004", new Object[]{str, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.alibaba.emas.mpop.tcb.upload");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        mtopRequest.setData(str);
        Mtop mtop = Mtop.getInstance(Mtop.Id.INNER);
        if (mtop == null) {
            return;
        }
        MtopBusiness build = MtopBusiness.build(mtop, mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) iRemoteBaseListener).startRequest();
        String b = sfj.INSTANCE.b();
        TLog.logi(b, "TuCaoBa data upload", "Mtop upload info: " + mtopRequest);
    }
}
