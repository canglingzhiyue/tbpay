package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.AttributionReportTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.AttributionReportReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.utils.JsonUtil;
import tb.cxr;
import tb.cxs;

/* loaded from: classes4.dex */
public class AttributionReporter {
    public static final String APP_VERSION = "appVersion";
    public static final String SYSTEM_PERMISSION = "permission";

    /* renamed from: a  reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f7508a;
    private Context b;

    private AttributionReporter(Context context) {
        Preconditions.checkNotNull(context);
        this.b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        this.f7508a = context instanceof Activity ? new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder()) : new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        this.f7508a.setKitSdkVersion(61000300);
    }

    private AttributionReportReq a(AttributionEvent attributionEvent, SafeBundle safeBundle) throws ApiException {
        Bundle bundle = safeBundle.getBundle().getBundle("analysisExt");
        if (bundle == null || bundle.isEmpty()) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String string = bundle.getString(RemoteMessageConst.MSGID);
        if (TextUtils.isEmpty(string)) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String string2 = bundle.getString("hsId");
        if (TextUtils.isEmpty(string2)) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        AttributionReportReq attributionReportReq = new AttributionReportReq();
        attributionReportReq.setCampaignId(bundle.getString("cid"));
        attributionReportReq.setMsgId(string);
        attributionReportReq.setHaStorageId(string2);
        attributionReportReq.setEventId(attributionEvent.getEventId());
        attributionReportReq.setPkgName(this.b.getPackageName());
        if (attributionEvent.equals(AttributionEvent.PERMISSION_GRANTED) || attributionEvent.equals(AttributionEvent.PERMISSION_DENIED)) {
            String string3 = safeBundle.getString(SYSTEM_PERMISSION);
            if (TextUtils.isEmpty(string3) || !string3.startsWith("android.permission")) {
                throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
            }
            attributionReportReq.setReqPermission(string3);
        }
        attributionReportReq.setTimeStamp(System.currentTimeMillis());
        attributionReportReq.setAppVersion(safeBundle.getString("appVersion"));
        return attributionReportReq;
    }

    private cxr<Void> a(AttributionEvent attributionEvent, Bundle bundle) {
        cxs cxsVar;
        int externalCode;
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_ANALYSIS_REPORT);
        if (bundle == null || attributionEvent == null) {
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_ANALYSIS_REPORT, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("AttributionReporter", "Invalid argument: argument should not be null");
            throw new IllegalArgumentException("Invalid argument: argument should not be null");
        }
        try {
            if (!c.d(this.b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            long j = new PushPreferences(this.b, "hwpush_local_config").getLong("analysis_last_failed_time");
            if (j > 0 && System.currentTimeMillis() - j < 86400000) {
                throw ErrorEnum.ERROR_NOT_IN_SERVICE.toApiException();
            }
            return this.f7508a.doWrite(new AttributionReportTask(PushNaming.PUSH_ANALYSIS_REPORT, JsonUtil.createJsonString(a(attributionEvent, new SafeBundle(bundle))), reportEntry));
        } catch (ApiException e) {
            cxs cxsVar2 = new cxs();
            cxsVar2.a((Exception) e);
            externalCode = e.getStatusCode();
            cxsVar = cxsVar2;
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_ANALYSIS_REPORT, reportEntry, externalCode);
            return cxsVar.a();
        } catch (Exception unused) {
            cxsVar = new cxs();
            cxsVar.a((Exception) ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            externalCode = ErrorEnum.ERROR_INTERNAL_ERROR.getExternalCode();
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_ANALYSIS_REPORT, reportEntry, externalCode);
            return cxsVar.a();
        }
    }

    public static AttributionReporter getInstance(Context context) {
        return new AttributionReporter(context);
    }

    public cxr<Void> report(AttributionEvent attributionEvent, Bundle bundle) {
        return a(attributionEvent, bundle);
    }
}
