package com.alipay.mobile.security.bio.service.msgchannel.json;

import android.os.Bundle;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateJsonGwRequest;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioUploadServiceCoreMessageChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f5819a;
    private final ZimMessageChannel b;

    public BioUploadServiceCoreMessageChannel(String str, ZimMessageChannel zimMessageChannel) {
        this.f5819a = str;
        this.b = zimMessageChannel;
    }

    public BioUploadResult doUpload(BisJsonUploadGwRequest bisJsonUploadGwRequest) {
        String str;
        int code;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("e86fd76f", new Object[]{this, bisJsonUploadGwRequest});
        }
        BioUploadResult bioUploadResult = new BioUploadResult();
        ZimValidateJsonGwRequest zimValidateJsonGwRequest = new ZimValidateJsonGwRequest();
        zimValidateJsonGwRequest.zimId = this.f5819a;
        zimValidateJsonGwRequest.zimData = JSON.toJSONString(bisJsonUploadGwRequest);
        Bundle bundle = new Bundle();
        bundle.putString("requestData", Base64.encodeToString(JSON.toJSONString(zimValidateJsonGwRequest).getBytes(), 10));
        String str2 = "upload zimId is " + this.f5819a + ", data is " + bundle.get("requestData");
        BioLog.w("upload(): request=  " + bundle.get("requestData"));
        try {
            ZimMessageChannelCallbackImpl zimMessageChannelCallbackImpl = new ZimMessageChannelCallbackImpl(this);
            this.b.onAction(bundle, zimMessageChannelCallbackImpl);
            BioLog.w(ZimMessageChannelCallbackImpl.TAG, "mZimMessageChannel.onAction() end, begin to getBioUploadResult().");
            BioUploadResult bioUploadResult2 = zimMessageChannelCallbackImpl.getBioUploadResult();
            BioLog.w(ZimMessageChannelCallbackImpl.TAG, "callBackImpl.getBioUploadResult() : " + bisJsonUploadGwRequest);
            if (bioUploadResult2 == null) {
                bioUploadResult.validationRetCode = 1001;
                bioUploadResult.productRetCode = 3002;
                bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
            } else {
                bioUploadResult = bioUploadResult2;
            }
        } catch (Throwable th) {
            BioLog.w(th);
            if (!(th instanceof IRpcException) || !((code = ((IRpcException) th).getCode()) == 4001 || code == 5 || code == 16 || code == 2)) {
                bioUploadResult.validationRetCode = 1001;
                bioUploadResult.productRetCode = 3002;
                bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                str = CodeConstants.SERVER_PARAM_ERROR;
            } else {
                bioUploadResult.validationRetCode = 3001;
                bioUploadResult.productRetCode = 3002;
                bioUploadResult.subCode = CodeConstants.NETWORK_ERROR;
                str = CodeConstants.NETWORK_ERROR;
            }
            bioUploadResult.subMsg = CodeConstants.getMessage(str);
        }
        BioLog.w("upload(): response= " + bioUploadResult);
        return bioUploadResult;
    }
}
