package com.huawei.hms.opendevice;

import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.DeleteTokenResp;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import tb.cxs;

/* loaded from: classes4.dex */
public class e extends TaskApiCall<PushClient, Void> {

    /* renamed from: a  reason: collision with root package name */
    private DeleteTokenReq f7498a;

    public e(String str, DeleteTokenReq deleteTokenReq, String str2) {
        super(str, JsonUtil.createJsonString(deleteTokenReq), str2);
        this.f7498a = deleteTokenReq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, cxs<Void> cxsVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            ErrorEnum fromCode = ErrorEnum.fromCode(((DeleteTokenResp) JsonUtil.jsonToEntity(str, new DeleteTokenResp())).getRetCode());
            if (fromCode != ErrorEnum.SUCCESS) {
                cxsVar.a(fromCode.toApiException());
                return;
            }
            cxsVar.a((cxs<Void>) null);
            h.a(pushClient.getContext(), getUri(), responseErrorCode);
            return;
        }
        String str2 = HmsInstanceId.TAG;
        HMSLog.e(str2, "DeleteTokenTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
        ErrorEnum fromCode2 = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode2 != ErrorEnum.ERROR_UNKNOWN) {
            cxsVar.a(fromCode2.toApiException());
        } else {
            cxsVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f7498a.isMultiSender() ? 50004300 : 30000000;
    }
}
