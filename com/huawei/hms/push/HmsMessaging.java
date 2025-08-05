package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import com.vivo.push.PushClientConstants;
import java.util.regex.Pattern;
import tb.cxr;
import tb.cxs;
import tb.cxu;
import tb.riy;

/* loaded from: classes4.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";
    private static final Pattern c = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private Context f7513a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsMessaging(Context context) {
        Preconditions.checkNotNull(context);
        this.f7513a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        this.b = context instanceof Activity ? new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder()) : new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        this.b.setKitSdkVersion(61000300);
    }

    private cxr<Void> a(String str, String str2) {
        String reportEntry = PushBiUtil.reportEntry(this.f7513a, PushNaming.SUBSCRIBE);
        if (str == null || !c.matcher(str).matches()) {
            PushBiUtil.reportExit(this.f7513a, PushNaming.SUBSCRIBE, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
            throw new IllegalArgumentException("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        } else if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "use proxy subscribe.");
            return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.f7513a, str, reportEntry) : ProxyCenter.getProxy().unsubscribe(this.f7513a, str, reportEntry);
        } else {
            try {
                ErrorEnum a2 = t.a(this.f7513a);
                if (a2 != ErrorEnum.SUCCESS) {
                    throw a2.toApiException();
                }
                if (NetWorkUtil.getNetworkType(this.f7513a) == 0) {
                    HMSLog.e("HmsMessaging", "no network");
                    throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
                }
                SubscribeReq subscribeReq = new SubscribeReq(this.f7513a, str2, str);
                subscribeReq.setToken(BaseUtils.getLocalToken(this.f7513a, null));
                return c.b() ? this.b.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry)) : this.b.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry));
            } catch (ApiException e) {
                cxs cxsVar = new cxs();
                cxsVar.a((Exception) e);
                PushBiUtil.reportExit(this.f7513a, PushNaming.SUBSCRIBE, reportEntry, e.getStatusCode());
                return cxsVar.a();
            } catch (Exception unused) {
                cxs cxsVar2 = new cxs();
                cxsVar2.a((Exception) ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
                PushBiUtil.reportExit(this.f7513a, PushNaming.SUBSCRIBE, reportEntry, ErrorEnum.ERROR_INTERNAL_ERROR);
                return cxsVar2.a();
            }
        }
    }

    private cxr<Void> a(boolean z) {
        String reportEntry = PushBiUtil.reportEntry(this.f7513a, PushNaming.SET_NOTIFY_FLAG);
        if (!c.d(this.f7513a) || c.b()) {
            HMSLog.i("HmsMessaging", "turn on/off with AIDL");
            EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
            enableNotifyReq.setPackageName(this.f7513a.getPackageName());
            enableNotifyReq.setEnable(z);
            return this.b.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), reportEntry));
        } else if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
            HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
            cxs cxsVar = new cxs();
            cxsVar.a((Exception) ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            PushBiUtil.reportExit(this.f7513a, PushNaming.SET_NOTIFY_FLAG, reportEntry, ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED);
            return cxsVar.a();
        } else if (c.b(this.f7513a) < 90101310) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
            Context context = this.f7513a;
            Intent putExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(context, this.f7513a.getPackageName() + "#" + z));
            putExtra.setPackage("android");
            return cxu.a(new IntentCallable(this.f7513a, putExtra, reportEntry));
        } else if (c.b(this.f7513a) >= 110118300) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v3");
            if (TextUtils.isEmpty(BaseUtils.getLocalToken(this.f7513a, null))) {
                cxs cxsVar2 = new cxs();
                cxsVar2.a((Exception) ErrorEnum.ERROR_NO_TOKEN.toApiException());
                return cxsVar2.a();
            }
            new PushPreferences(this.f7513a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Intent intent = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG");
            intent.putExtra("enalbeFlag", z);
            intent.putExtra(RemoteMessageConst.DEVICE_TOKEN, BaseUtils.getLocalToken(this.f7513a, null));
            intent.putExtra(PushClientConstants.TAG_PKG_NAME, this.f7513a.getPackageName());
            intent.putExtra("uid", this.f7513a.getApplicationInfo().uid);
            intent.setPackage("android");
            return cxu.a(new IntentCallable(this.f7513a, intent, reportEntry));
        } else {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
            new PushPreferences(this.f7513a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Uri parse = Uri.parse("content://" + this.f7513a.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
            Intent intent2 = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
            intent2.putExtra("type", "enalbeFlag");
            intent2.putExtra(PushClientConstants.TAG_PKG_NAME, this.f7513a.getPackageName());
            intent2.putExtra("url", parse);
            intent2.setPackage("android");
            return cxu.a(new IntentCallable(this.f7513a, intent2, reportEntry));
        }
    }

    private void a(RemoteMessage remoteMessage) {
        String reportEntry = PushBiUtil.reportEntry(this.f7513a, PushNaming.UPSEND_MSG);
        ErrorEnum a2 = t.a(this.f7513a);
        if (a2 != ErrorEnum.SUCCESS) {
            HMSLog.e("HmsMessaging", "Message sent failed:" + a2.getExternalCode() + riy.CONDITION_IF_MIDDLE + a2.getMessage());
            PushBiUtil.reportExit(this.f7513a, PushNaming.UPSEND_MSG, reportEntry, a2);
            throw new UnsupportedOperationException(a2.getMessage());
        } else if (TextUtils.isEmpty(remoteMessage.getTo())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.f7513a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'to' missing");
        } else if (TextUtils.isEmpty(remoteMessage.getMessageId())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
            PushBiUtil.reportExit(this.f7513a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'message_id' missing");
        } else if (TextUtils.isEmpty(remoteMessage.getData())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
            PushBiUtil.reportExit(this.f7513a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'data' missing");
        } else {
            UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
            upSendMsgReq.setPackageName(this.f7513a.getPackageName());
            upSendMsgReq.setMessageId(remoteMessage.getMessageId());
            upSendMsgReq.setTo(remoteMessage.getTo());
            upSendMsgReq.setData(remoteMessage.getData());
            upSendMsgReq.setMessageType(remoteMessage.getMessageType());
            upSendMsgReq.setTtl(remoteMessage.getTtl());
            upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
            upSendMsgReq.setSendMode(remoteMessage.getSendMode());
            upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
            if (c.b()) {
                this.b.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), reportEntry));
            } else {
                a(upSendMsgReq, reportEntry);
            }
        }
    }

    private void a(UpSendMsgReq upSendMsgReq, String str) {
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.f7513a, null));
        try {
            this.b.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                PushBiUtil.reportExit(this.f7513a, PushNaming.UPSEND_MSG, str, ((ApiException) e.getCause()).getStatusCode());
            } else {
                PushBiUtil.reportExit(this.f7513a, PushNaming.UPSEND_MSG, str, ErrorEnum.ERROR_INTERNAL_ERROR);
            }
        }
    }

    public static synchronized HmsMessaging getInstance(Context context) {
        HmsMessaging hmsMessaging;
        synchronized (HmsMessaging.class) {
            hmsMessaging = new HmsMessaging(context);
        }
        return hmsMessaging;
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.f7513a);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.e("HmsMessaging", "Operation(send) unsupported");
            throw new UnsupportedOperationException("Operation(send) unsupported");
        }
        HMSLog.i("HmsMessaging", "send upstream message");
        a(remoteMessage);
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInitHelper.setAutoInitEnabled(this.f7513a, z);
    }

    public cxr<Void> subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public cxr<Void> turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.f7513a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public cxr<Void> turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.f7513a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    public cxr<Void> unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }
}
