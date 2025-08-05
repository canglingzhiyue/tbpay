package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.mtop.response.UserProfileDataResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.MtopRequest;

/* loaded from: classes7.dex */
public class ktg extends kte implements ktf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.ktf
    public void a(String str, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934bf004", new Object[]{this, str, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(TextUtils.equals(str, "mytaobao") ? "mtop.taobao.mclaren.getuserprofile.center" : "mtop.taobao.mclaren.getUserProfile");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedSession(true);
        a(mtopRequest, iRemoteBaseListener, UserProfileDataResponse.class);
    }
}
