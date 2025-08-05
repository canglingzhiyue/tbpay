package com.alipay.mobile.security.bio.service.msgchannel.json;

import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ZimMessageChannelCallbackImpl implements ZimMessageChannelCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ZimMessageChannel";
    public static final long timeout = 60;

    /* renamed from: a  reason: collision with root package name */
    private BioUploadResult f5820a;
    private final CountDownLatch b = new CountDownLatch(1);

    public ZimMessageChannelCallbackImpl(Object obj) {
    }

    public BioUploadResult getBioUploadResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("3c27fd02", new Object[]{this});
        }
        try {
            this.b.await(60L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            BioLog.w(TAG, e);
        }
        return this.f5820a;
    }

    @Override // com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback
    public void onResult(Bundle bundle) {
        ZimValidateGwResponse zimValidateGwResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d1d691", new Object[]{this, bundle});
            return;
        }
        this.f5820a = new BioUploadResult();
        int i = bundle.getInt(ZimMessageChannel.K_RPC_RES_CODE);
        if (i == 1000) {
            BioUploadResult bioUploadResult = this.f5820a;
            bioUploadResult.validationRetCode = 1000;
            bioUploadResult.productRetCode = 1001;
            bioUploadResult.subCode = CodeConstants.SUCCESS;
            this.f5820a.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
        } else if (i == 3000) {
            try {
                zimValidateGwResponse = (ZimValidateGwResponse) JSON.parseObject(bundle.getString(ZimMessageChannel.K_RPC_RES), ZimValidateGwResponse.class);
            } catch (Throwable th) {
                BioLog.e(TAG, th);
                zimValidateGwResponse = null;
            }
            if (zimValidateGwResponse == null) {
                BioUploadResult bioUploadResult2 = this.f5820a;
                bioUploadResult2.validationRetCode = 1001;
                bioUploadResult2.productRetCode = 3002;
                bioUploadResult2.subCode = CodeConstants.SERVER_PARAM_ERROR;
                this.f5820a.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
            } else {
                this.f5820a.productRetCode = zimValidateGwResponse.productRetCode;
                this.f5820a.validationRetCode = zimValidateGwResponse.validationRetCode;
                this.f5820a.hasNext = zimValidateGwResponse.hasNext;
                this.f5820a.nextProtocol = zimValidateGwResponse.nextProtocol;
                this.f5820a.subCode = zimValidateGwResponse.retCodeSub;
                this.f5820a.subMsg = zimValidateGwResponse.retMessageSub;
                if (zimValidateGwResponse.extParams != null && !zimValidateGwResponse.extParams.isEmpty()) {
                    this.f5820a.extParams = new HashMap(zimValidateGwResponse.extParams);
                }
            }
        } else {
            BioUploadResult bioUploadResult3 = this.f5820a;
            bioUploadResult3.validationRetCode = 2006;
            bioUploadResult3.productRetCode = 2002;
            bioUploadResult3.subCode = CodeConstants.SERVER_PARAM_ERROR;
            this.f5820a.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
        }
        BioLog.d(TAG, getClass().getSimpleName() + ".mCountDownLatch.countDown(), mUploadResult=" + this.f5820a);
        this.b.countDown();
    }
}
