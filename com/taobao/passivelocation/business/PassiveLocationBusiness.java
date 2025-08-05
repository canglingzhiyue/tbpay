package com.taobao.passivelocation.business;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceRequest;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceResponse;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import tb.dbz;
import tb.kge;
import tb.ndz;

/* loaded from: classes7.dex */
public class PassiveLocationBusiness extends dbz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_RESULT_STATUS = "failed";
    public static final int REQ_TYPE_QUERY_LBS_SWITCH = 1;
    public static final int REQ_TYPE_REPORT_LOCATION = 2;

    static {
        kge.a(-1724199309);
    }

    public PassiveLocationBusiness(Application application) {
        super(application);
    }

    public void reportLbsData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecc2184", new Object[]{this, str});
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
}
