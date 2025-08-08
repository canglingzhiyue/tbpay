package com.huawei.hms.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import mtopsdk.common.util.StringUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class HmsMessageService extends Service {
    public static final String PROXY_TYPE = "proxy_type";
    public static final String SUBJECT_ID = "subject_id";

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f7511a = new Messenger(new e(new b()));

    /* loaded from: classes4.dex */
    private class b implements e.a {
        private b() {
        }

        @Override // com.huawei.hms.push.e.a
        public void a(Message message) {
            if (message == null) {
                HMSLog.e("HmsMessageService", "receive message is null");
                return;
            }
            HMSLog.i("HmsMessageService", "handle message start...");
            Bundle data = Message.obtain(message).getData();
            if (data == null) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtras(data);
            intent.putExtra(RemoteMessageConst.INPUT_TYPE, data.getInt(RemoteMessageConst.INPUT_TYPE, -1));
            HmsMessageService.this.handleIntentMessage(intent);
        }
    }

    private Bundle a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString(Constant.PROP_MESSAGE_ID, intent.getStringExtra(Constant.PROP_MESSAGE_ID));
        bundle.putByteArray(RemoteMessageConst.MSGBODY, intent.getByteArrayExtra(RemoteMessageConst.MSGBODY));
        bundle.putString(RemoteMessageConst.DEVICE_TOKEN, intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN));
        if (intent.getIntExtra(RemoteMessageConst.INPUT_TYPE, -1) == 1) {
            bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
        }
        return bundle;
    }

    private synchronized void a(Intent intent, Bundle bundle, String str) {
        String stringExtra = intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN);
        a(stringExtra, str);
        Context applicationContext = getApplicationContext();
        boolean z = !StringUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
        if (bundle.isEmpty() && z) {
            HMSLog.i("HmsMessageService", "onNewToken to host app.");
            onNewToken(stringExtra);
            BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
        }
        if (!StringUtils.isEmpty(str)) {
            HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + str);
            onNewToken(stringExtra, bundle);
            return;
        }
        String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
        if (subjectIds == null || subjectIds.length == 0) {
            HMSLog.i("HmsMessageService", "onNewToken to host app with bundle.");
            bundle.putString("belongId", intent.getStringExtra("belongId"));
            onNewToken(stringExtra, bundle);
            return;
        }
        for (int i = 0; i < subjectIds.length; i++) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(SUBJECT_ID, subjectIds[i]);
            HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + subjectIds[i]);
            onNewToken(stringExtra, bundle2);
            a(stringExtra, subjectIds[i]);
        }
        BaseUtils.clearSubjectIds(applicationContext);
    }

    private synchronized void a(Intent intent, Bundle bundle, String str, int i) {
        Context applicationContext = getApplicationContext();
        boolean z = !StringUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
        if (bundle.isEmpty() && z) {
            HMSLog.i("HmsMessageService", "onTokenError to host app.");
            onTokenError(new BaseException(i));
            BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
        }
        if (!StringUtils.isEmpty(str)) {
            HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + str);
            onTokenError(new BaseException(i), bundle);
            return;
        }
        String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
        if (subjectIds == null || subjectIds.length == 0) {
            HMSLog.i("HmsMessageService", "onTokenError to host app with bundle.");
            onTokenError(new BaseException(i), bundle);
            return;
        }
        for (int i2 = 0; i2 < subjectIds.length; i2++) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(SUBJECT_ID, subjectIds[i2]);
            HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + subjectIds[i2]);
            onTokenError(new BaseException(i), bundle2);
        }
        BaseUtils.clearSubjectIds(applicationContext);
    }

    private void a(Intent intent, String str) {
        int intExtra = intent.getIntExtra("error", ErrorEnum.SUCCESS.getInternalCode());
        a(PushNaming.GETTOKEN_ASYNC_RSP, str, intExtra);
        String stringExtra = intent.getStringExtra("subjectId");
        String stringExtra2 = intent.getStringExtra("message_proxy_type");
        HMSLog.i("HmsMessageService", "doOnNewToken:transactionId = " + str + " , internalCode = " + intExtra + ",subjectId:" + stringExtra + ",proxyType:" + stringExtra2);
        Bundle bundle = new Bundle();
        if (!StringUtils.isEmpty(stringExtra)) {
            bundle.putString(SUBJECT_ID, stringExtra);
        }
        if (!StringUtils.isEmpty(stringExtra2)) {
            bundle.putString(PROXY_TYPE, stringExtra2);
        }
        if (intExtra == ErrorEnum.SUCCESS.getInternalCode()) {
            HMSLog.i("HmsMessageService", "Apply token OnNewToken, subId: " + stringExtra);
            a(intent, bundle, stringExtra);
            return;
        }
        HMSLog.i("HmsMessageService", "Apply token failed, subId: " + stringExtra);
        a(intent, bundle, stringExtra, intExtra);
    }

    private void a(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = getApplicationContext();
        if (!str.equals(BaseUtils.getLocalToken(applicationContext, str2))) {
            HMSLog.i("HmsMessageService", "receive a new token, refresh the local token");
            BaseUtils.saveToken(applicationContext, str2, str);
        }
        if (!StringUtils.isEmpty(str2)) {
            return;
        }
        BaseUtils.reportAaidToken(applicationContext, str);
    }

    private void a(String str, String str2, int i) {
        if (StringUtils.isEmpty(str2)) {
            str2 = "null";
        }
        PushBiUtil.reportExit(getApplicationContext(), str, str2, i);
    }

    private void b(Intent intent) {
        HMSLog.i("HmsMessageService", "parse batch response.");
        String stringExtra = intent.getStringExtra("batchMsgbody");
        if (StringUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("transactionId");
                String optString2 = jSONObject.optString(RemoteMessageConst.MSGID);
                int optInt = jSONObject.optInt(com.taobao.mtop.wvplugin.a.RESULT_KEY, ErrorEnum.ERROR_UNKNOWN.getInternalCode());
                if (ErrorEnum.SUCCESS.getInternalCode() == optInt) {
                    b(optString, optString2);
                } else {
                    b(optString, optString2, optInt);
                }
            }
        } catch (JSONException unused) {
            HMSLog.w("HmsMessageService", "parse batch response failed.");
        }
    }

    private void b(String str, String str2) {
        HMSLog.i("HmsMessageService", "onMessageSent, message id:" + str2 + ", transactionId: " + str);
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, ErrorEnum.SUCCESS.getInternalCode());
        onMessageSent(str2);
    }

    private void b(String str, String str2, int i) {
        HMSLog.i("HmsMessageService", "onSendError, message id:" + str2 + " error:" + i + ", transactionId: " + str);
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, i);
        onSendError(str2, new SendException(i));
    }

    protected void doMsgReceived(Intent intent) {
        onMessageReceived(new RemoteMessage(a(intent)));
    }

    public void handleIntentMessage(Intent intent) {
        StringBuilder sb;
        String message;
        String sb2;
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(Constant.PROP_MESSAGE_ID);
                String stringExtra2 = intent.getStringExtra("message_type");
                String stringExtra3 = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
                if ("new_token".equals(stringExtra2)) {
                    HMSLog.i("HmsMessageService", "onNewToken");
                    a(intent, stringExtra3);
                    return;
                } else if ("received_message".equals(stringExtra2)) {
                    HMSLog.i("HmsMessageService", "onMessageReceived, message id:" + stringExtra);
                    a(PushNaming.RECEIVE_MSG_RSP, stringExtra, ErrorEnum.SUCCESS.getInternalCode());
                    doMsgReceived(intent);
                    return;
                } else if ("sent_message".equals(stringExtra2)) {
                    b(stringExtra3, stringExtra);
                    return;
                } else if ("send_error".equals(stringExtra2)) {
                    b(stringExtra3, stringExtra, intent.getIntExtra("error", ErrorEnum.ERROR_UNKNOWN.getInternalCode()));
                    return;
                } else if (ShippingNode.TAG.equals(stringExtra2)) {
                    int intExtra = intent.getIntExtra("error", ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode());
                    HMSLog.i("HmsMessageService", "onMessageDelivery, message id:" + stringExtra + ", status:" + intExtra + ", transactionId: " + stringExtra3);
                    a(PushNaming.UPSEND_RECEIPT, stringExtra3, intExtra);
                    onMessageDelivered(stringExtra, new SendException(intExtra));
                    return;
                } else if ("server_deleted_message".equals(stringExtra2)) {
                    HMSLog.i("HmsMessageService", "delete message, message id:" + stringExtra);
                    onDeletedMessages();
                    return;
                } else if ("batchSent".equals(stringExtra2)) {
                    b(intent);
                    return;
                } else {
                    HMSLog.e("HmsMessageService", "Receive unknown message: " + stringExtra2);
                    return;
                }
            } catch (RuntimeException e) {
                sb = new StringBuilder();
                sb.append("handle intent RuntimeException: ");
                message = e.getMessage();
                sb.append(message);
                sb2 = sb.toString();
                HMSLog.e("HmsMessageService", sb2);
            } catch (Exception e2) {
                sb = new StringBuilder();
                sb.append("handle intent exception: ");
                message = e2.getMessage();
                sb.append(message);
                sb2 = sb.toString();
                HMSLog.e("HmsMessageService", sb2);
            }
        }
        sb2 = "receive message is null";
        HMSLog.e("HmsMessageService", sb2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.i("HmsMessageService", "start to bind");
        return this.f7511a.getBinder();
    }

    public void onDeletedMessages() {
    }

    @Override // android.app.Service
    public void onDestroy() {
        HMSLog.i("HmsMessageService", "start to destroy");
        super.onDestroy();
    }

    public void onMessageDelivered(String str, Exception exc) {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onNewToken(String str, Bundle bundle) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        HMSLog.i("HmsMessageService", "start to command , startId = " + i2);
        handleIntentMessage(intent);
        return 2;
    }

    public void onTokenError(Exception exc) {
    }

    public void onTokenError(Exception exc, Bundle bundle) {
    }
}
