package com.alipay.security.mobile.module.http.v2;

import android.content.Context;
import com.alipay.security.mobile.module.http.IUpload;
import com.alipay.security.mobile.module.http.UploadFactory;
import com.alipay.security.mobile.module.http.model.ConvertUtil;
import com.alipay.security.mobile.module.http.model.DeviceDataReponseModel;
import com.alipay.security.mobile.module.http.model.DeviceDataRequestModel;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RPCUploadV2Impl implements IUploadV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IUpload uploadProxy;
    private static IUploadV2 uploadV2;

    public static IUploadV2 getInstance(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUploadV2) ipChange.ipc$dispatch("9fc4925", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        if (uploadV2 == null) {
            uploadProxy = UploadFactory.create(context, str);
            uploadV2 = new RPCUploadV2Impl();
        }
        return uploadV2;
    }

    @Override // com.alipay.security.mobile.module.http.v2.IUploadV2
    public boolean logCollect(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2d435b", new Object[]{this, str})).booleanValue() : uploadProxy.logCollect(str);
    }

    @Override // com.alipay.security.mobile.module.http.v2.IUploadV2
    public DeviceDataReponseModel updateStaticData(DeviceDataRequestModel deviceDataRequestModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceDataReponseModel) ipChange.ipc$dispatch("80960a57", new Object[]{this, deviceDataRequestModel}) : ConvertUtil.convertFrom(uploadProxy.updateStaticData(ConvertUtil.convertFrom(deviceDataRequestModel)));
    }

    @Override // com.alipay.security.mobile.module.http.v2.IUploadV2
    public int uploadRiskData(ReportPbRequest reportPbRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22bb88d", new Object[]{this, reportPbRequest})).intValue() : uploadProxy.uploadRiskData(reportPbRequest);
    }
}
