package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.net.pojo.request.SendCpmInfoRequest;
import com.taobao.alimama.net.pojo.response.P4pCpmInfoResponse;
import com.taobao.business.mtop.MunionRemoteBusiness;

@Deprecated
/* loaded from: classes6.dex */
public class kfe extends MunionRemoteBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int REQ_TYPE_SEND_P4P_INFO = 0;

    static {
        kge.a(-30346061);
    }

    public kfe(Application application) {
        super(application);
    }

    public void a(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812f174a", new Object[]{this, obj, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        SendCpmInfoRequest sendCpmInfoRequest = new SendCpmInfoRequest();
        sendCpmInfoRequest.setCna(str);
        sendCpmInfoRequest.setUtdid(str2);
        sendCpmInfoRequest.setE(str3);
        sendCpmInfoRequest.setExt(str4);
        sendCpmInfoRequest.setReferer(str5);
        sendCpmInfoRequest.setAccept(str6);
        sendCpmInfoRequest.setUseragent(str7);
        startRequest(0, sendCpmInfoRequest, P4pCpmInfoResponse.class);
    }
}
