package com.huawei.hms.push.plugin.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.NotificationEnableReq;
import com.huawei.hms.support.api.entity.push.NotificationEnableResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import tb.cxs;

/* loaded from: classes4.dex */
public class b extends TaskApiCall<PushClient, NotificationStatus> {

    /* renamed from: a  reason: collision with root package name */
    private Context f7532a;
    private NotificationEnableReq b;

    public b(String str, NotificationEnableReq notificationEnableReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(notificationEnableReq), str2);
        this.f7532a = context;
        this.b = notificationEnableReq;
    }

    private Intent a(ResponseErrorCode responseErrorCode) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (parcelable != null && (parcelable instanceof Intent)) {
            return (Intent) parcelable;
        }
        return new Intent();
    }

    private void a(ResponseErrorCode responseErrorCode, cxs<NotificationStatus> cxsVar) {
        ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
            cxsVar.a(fromCode.toApiException());
        } else {
            cxsVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, cxs<NotificationStatus> cxsVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e("HmsNotificationManagerEx", "Notification Enable failed, ErrorCode:" + responseErrorCode.getErrorCode());
            a(responseErrorCode, cxsVar);
            return;
        }
        ErrorEnum fromCode = ErrorEnum.fromCode(((NotificationEnableResp) JsonUtil.jsonToEntity(str, new NotificationEnableResp())).getRetCode());
        if (fromCode != ErrorEnum.SUCCESS) {
            cxsVar.a(fromCode.toApiException());
            HMSLog.e("HmsNotificationManagerEx", "Notification Enable failed, StatusCode:" + fromCode.getExternalCode());
            return;
        }
        NotificationStatus notificationStatus = new NotificationStatus();
        notificationStatus.setRetCode(fromCode.getExternalCode());
        notificationStatus.getStatus().setIntent(a(responseErrorCode));
        cxsVar.a((cxs<NotificationStatus>) notificationStatus);
        new PushPreferences(this.f7532a, "hwpush_local_config").saveLong("notification_request_time", Long.valueOf(System.currentTimeMillis()));
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 5;
    }
}
