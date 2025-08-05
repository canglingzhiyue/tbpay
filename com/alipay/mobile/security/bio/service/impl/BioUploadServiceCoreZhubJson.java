package com.alipay.mobile.security.bio.service.impl;

import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.model.upload.BisJsonUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimDispatchJsonGwFacade;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateJsonGwRequest;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.impl.AsyncUploadService;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.mobile.security.bio.service.msgchannel.json.BioUploadServiceCoreMessageChannel;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.biz.ZimPlatform;
import com.alipay.mobile.security.zim.gw.BioUploadServiceCoreZhub;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioUploadServiceCoreZhubJson extends BioUploadServiceCoreZhub<BisJsonUploadGwRequest> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BioUploadServiceCoreMessageChannel c;

    public static /* synthetic */ Object ipc$super(BioUploadServiceCoreZhubJson bioUploadServiceCoreZhubJson, String str, Object... objArr) {
        if (str.hashCode() == 1069961007) {
            super.setExtParams((String) objArr[0], (Map) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.security.zim.gw.BioUploadServiceCoreZhub
    public void setExtParams(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc64f2f", new Object[]{this, str, map});
            return;
        }
        super.setExtParams(str, map);
        ZimMessageChannel zimMessageChannel = (ZimMessageChannel) map.get(ZIMFacade.KEY_ZIM_MSG_CHANNEL);
        if (zimMessageChannel == null) {
            return;
        }
        this.c = new BioUploadServiceCoreMessageChannel(str, zimMessageChannel);
    }

    @Override // com.alipay.mobile.security.zim.gw.BioUploadServiceCoreZhub
    public BioUploadResult doUpload(BisJsonUploadGwRequest bisJsonUploadGwRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("881d19af", new Object[]{this, bisJsonUploadGwRequest, new Boolean(z)});
        }
        if (z && this.c != null) {
            BioLog.d("to call BioUploadServiceCoreMessageChannel.doUpload()");
            return this.c.doUpload(bisJsonUploadGwRequest);
        }
        BioUploadResult bioUploadResult = new BioUploadResult();
        if (z || this.c == null) {
            try {
                ZimDispatchJsonGwFacade zimDispatchJsonGwFacade = (ZimDispatchJsonGwFacade) ((BioRPCService) this.e.getBioService(BioRPCService.class)).getRpcProxy(ZimDispatchJsonGwFacade.class);
                ZimValidateJsonGwRequest zimValidateJsonGwRequest = new ZimValidateJsonGwRequest();
                zimValidateJsonGwRequest.zimId = this.f5849a;
                zimValidateJsonGwRequest.zimData = JSON.toJSONString(bisJsonUploadGwRequest);
                if (this.b != null && !this.b.isEmpty()) {
                    zimValidateJsonGwRequest.bizData = new HashMap();
                    Object obj = this.b.get(ZIMFacade.KEY_CERT_NAME);
                    if (obj != null && (obj instanceof String)) {
                        zimValidateJsonGwRequest.bizData.put(ZIMFacade.KEY_CERT_NAME, (String) obj);
                    }
                    Object obj2 = this.b.get(ZIMFacade.KEY_CERT_NO);
                    if (obj2 != null && (obj2 instanceof String)) {
                        zimValidateJsonGwRequest.bizData.put(ZIMFacade.KEY_CERT_NO, (String) obj2);
                    }
                }
                BioLog.w("upload(): request= " + bisJsonUploadGwRequest);
                ZimValidateGwResponse validateStandard = zimDispatchJsonGwFacade.validateStandard(zimValidateJsonGwRequest);
                BioLog.w("upload(): response= " + validateStandard);
                if (validateStandard == null) {
                    bioUploadResult.validationRetCode = 1001;
                    bioUploadResult.productRetCode = 3002;
                    bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                    bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
                } else {
                    bioUploadResult.productRetCode = validateStandard.productRetCode;
                    bioUploadResult.validationRetCode = validateStandard.validationRetCode;
                    bioUploadResult.hasNext = validateStandard.hasNext;
                    bioUploadResult.nextProtocol = validateStandard.nextProtocol;
                    bioUploadResult.extParams = validateStandard.extParams;
                    bioUploadResult.subCode = validateStandard.retCodeSub;
                    bioUploadResult.subMsg = validateStandard.retMessageSub;
                }
            } catch (Exception e) {
                BioLog.w(e);
                if (e instanceof IRpcException) {
                    int code = ((IRpcException) e).getCode();
                    if (code == 4001 || code == 5 || code == 16 || code == 2) {
                        bioUploadResult.validationRetCode = 3001;
                        bioUploadResult.productRetCode = 3002;
                        bioUploadResult.subCode = CodeConstants.NETWORK_ERROR;
                        bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.NETWORK_ERROR);
                    } else {
                        bioUploadResult.validationRetCode = 1001;
                        bioUploadResult.productRetCode = 3002;
                        bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                        bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
                    }
                } else {
                    bioUploadResult.validationRetCode = 1001;
                    bioUploadResult.productRetCode = 3002;
                    bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                    bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
                }
            }
        } else {
            AsyncUploadService.AsyncUploadItem asyncUploadItem = new AsyncUploadService.AsyncUploadItem();
            asyncUploadItem.zimId = this.f5849a;
            asyncUploadItem.zimData = JSON.toJSONString(bisJsonUploadGwRequest);
            if (this.b != null) {
                asyncUploadItem.params = new HashMap();
                if (this.b.containsKey(ZimPlatform.KYE_REMOTESERVER)) {
                    asyncUploadItem.params.put(ZimPlatform.KYE_REMOTESERVER, this.b.get(ZimPlatform.KYE_REMOTESERVER));
                }
                if (this.b.containsKey(ZIMFacade.KEY_CERT_NAME)) {
                    asyncUploadItem.params.put(ZIMFacade.KEY_CERT_NAME, this.b.get(ZIMFacade.KEY_CERT_NAME));
                }
                if (this.b.containsKey(ZIMFacade.KEY_CERT_NO)) {
                    asyncUploadItem.params.put(ZIMFacade.KEY_CERT_NO, this.b.get(ZIMFacade.KEY_CERT_NO));
                }
            } else {
                asyncUploadItem.params = null;
            }
            AsyncUploadService asyncUploadService = AsyncUploadService.getInstance(null);
            if (asyncUploadService != null) {
                asyncUploadService.addAsyncUploadItem(asyncUploadItem);
            }
        }
        return bioUploadResult;
    }
}
