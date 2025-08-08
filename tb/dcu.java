package tb;

import android.app.Application;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.login4android.api.Login;
import com.taobao.passivelocation.business.report_error.MtopLbsReportLocationErrRequest;
import com.taobao.passivelocation.business.report_error.MtopLbsReportLocationErrResponse;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceRequest;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceResponse;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dcu extends dbz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQ_TYPE_REPORT_ERROR = 3;
    public static final int REQ_TYPE_REPORT_LOCATION = 2;

    static {
        kge.a(2030719438);
    }

    public static /* synthetic */ Object ipc$super(dcu dcuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dcu(Application application) {
        super(application);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        MtopLbsPosServiceRequest mtopLbsPosServiceRequest = new MtopLbsPosServiceRequest();
        try {
            mtopLbsPosServiceRequest.setLoc(ndz.a(Globals.getApplication(), "lbsCollect", str));
            mtopLbsPosServiceRequest.setLocVersion("1.1");
            RemoteBusiness.build(this.mApplication, mtopLbsPosServiceRequest, TaoApplication.getTTID()).registeListener((IRemoteListener) this.mRemoteListener).mo1342showLoginUI(false).mo1340setBizId(75).startRequest(2, MtopLbsPosServiceResponse.class);
        } catch (Exception unused) {
        }
    }

    public void a(Map<String, String> map, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f9d205", new Object[]{this, map, lbsdto});
            return;
        }
        try {
            MtopLbsReportLocationErrRequest mtopLbsReportLocationErrRequest = new MtopLbsReportLocationErrRequest();
            mtopLbsReportLocationErrRequest.setErrorInfo(b(map, lbsdto));
            RemoteBusiness.build(this.mApplication, mtopLbsReportLocationErrRequest, TaoApplication.getTTID()).registeListener((IRemoteListener) this.mRemoteListener).mo1342showLoginUI(false).mo1340setBizId(75).startRequest(3, MtopLbsReportLocationErrResponse.class);
        } catch (Exception unused) {
        }
    }

    private String b(Map<String, String> map, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e0af7c", new Object[]{this, map, lbsdto});
        }
        HashMap hashMap = new HashMap();
        if (lbsdto == null) {
            return JSON.toJSONString(hashMap);
        }
        String str = "";
        String str2 = map == null ? str : map.get(dcq.d);
        if (StringUtils.isEmpty(str2)) {
            str2 = "12";
        }
        hashMap.put("code", str2);
        if (map != null) {
            str = map.get(dcq.e);
        }
        hashMap.put("outcode", str);
        hashMap.put("deviceid", UTDevice.getUtdid(Globals.getApplication()));
        hashMap.put("userid", Login.getUserId());
        hashMap.put("ttid", TaoPackageInfo.getTTID());
        hashMap.put("osversion", Build.VERSION.RELEASE);
        hashMap.put(c.IP, lbsdto.getIp());
        hashMap.put("appkey", "21646297");
        return JSON.toJSONString(hashMap);
    }
}
