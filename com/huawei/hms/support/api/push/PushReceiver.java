package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alipay.tianyan.mobilesdk.coco.OreoServiceUnlimitedTracker;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.o;
import com.huawei.hms.push.p;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PushReceiver extends BroadcastReceiver {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f7553a;
        private Intent b;

        private b(Context context, Intent intent) {
            this.f7553a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            String stringExtra;
            String str = "message_proxy_type";
            Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
            intent.setPackage(this.b.getPackage());
            try {
                JSONObject b = PushReceiver.b(this.b);
                String string = JsonUtil.getString(b, AliFestivalWVPlugin.PARAMS_MODULE_NAME, "");
                int i = JsonUtil.getInt(b, "msgType", 0);
                int i2 = JsonUtil.getInt(b, "status", 0);
                if (ErrorEnum.SUCCESS.getInternalCode() != i2) {
                    i2 = ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode();
                }
                Bundle bundle = new Bundle();
                if (!OreoServiceUnlimitedTracker.BIZ_TYPE.equals(string) || i != 1) {
                    if (this.b.getExtras() != null) {
                        bundle.putAll(this.b.getExtras());
                    }
                    bundle.putString("message_type", "received_message");
                    bundle.putString(Constant.PROP_MESSAGE_ID, this.b.getStringExtra("msgIdStr"));
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, this.b.getByteArrayExtra("msg_data"));
                    bundle.putString(RemoteMessageConst.DEVICE_TOKEN, com.huawei.hms.push.a.a(this.b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN)));
                    bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
                    stringExtra = this.b.getStringExtra(str);
                } else {
                    bundle.putString("message_type", ShippingNode.TAG);
                    bundle.putString(Constant.PROP_MESSAGE_ID, JsonUtil.getString(b, RemoteMessageConst.MSGID, ""));
                    bundle.putInt("error", i2);
                    str = CommonCode.MapKey.TRANSACTION_ID;
                    stringExtra = JsonUtil.getString(b, "transactionId", "");
                }
                bundle.putString(str, stringExtra);
                if (new p().a(this.f7553a, bundle, intent)) {
                    HMSLog.i("PushReceiver", "receive " + this.b.getAction() + " and start service success");
                    return;
                }
                HMSLog.e("PushReceiver", "receive " + this.b.getAction() + " and start service failed");
            } catch (RuntimeException unused) {
                HMSLog.e("PushReceiver", "handle push message occur exception.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f7554a;
        private Intent b;

        private c(Context context, Intent intent) {
            this.f7554a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] byteArrayExtra = this.b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN);
                if (byteArrayExtra == null || byteArrayExtra.length == 0) {
                    HMSLog.i("PushReceiver", "get a deviceToken, but it is null or empty");
                    return;
                }
                HMSLog.i("PushReceiver", "receive a push token: " + this.f7554a.getPackageName());
                Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                intent.setPackage(this.b.getPackage());
                Bundle bundle = new Bundle();
                bundle.putString("message_type", "new_token");
                bundle.putString(RemoteMessageConst.DEVICE_TOKEN, com.huawei.hms.push.a.a(byteArrayExtra));
                bundle.putString(CommonCode.MapKey.TRANSACTION_ID, this.b.getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
                bundle.putString("subjectId", this.b.getStringExtra("subjectId"));
                bundle.putInt("error", this.b.getIntExtra("error", ErrorEnum.SUCCESS.getInternalCode()));
                bundle.putString("belongId", this.b.getStringExtra("belongId"));
                if (new p().a(this.f7554a, bundle, intent)) {
                    return;
                }
                HMSLog.e("PushReceiver", "receive " + this.b.getAction() + " and start service failed");
            } catch (RejectedExecutionException unused) {
                HMSLog.e("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                HMSLog.e("PushReceiver", "handle push token error");
            }
        }
    }

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }

    private static JSONObject a(byte[] bArr) {
        try {
            return new JSONObject(com.huawei.hms.push.a.a(bArr));
        } catch (JSONException unused) {
            HMSLog.w("PushReceiver", "JSONException:parse message body failed.");
            return null;
        }
    }

    private void a(Context context, Intent intent) {
        String str;
        try {
            if (intent.hasExtra("msg_data")) {
                o.a().execute(new b(context, intent));
            } else {
                HMSLog.i("PushReceiver", "This push message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            str = "handlePushMessageEvent execute task runtime exception.";
            HMSLog.e("PushReceiver", str);
        } catch (Exception unused2) {
            str = "handlePushMessageEvent execute task error";
            HMSLog.e("PushReceiver", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject b(Intent intent) throws RuntimeException {
        JSONObject a2 = a(intent.getByteArrayExtra("msg_data"));
        JSONObject a3 = a(a2);
        String string = JsonUtil.getString(a3, "data", null);
        if (com.huawei.hms.push.c.a(a3, b(a3), string)) {
            return a2;
        }
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    private void b(Context context, Intent intent) {
        String str;
        try {
            if (intent.hasExtra(RemoteMessageConst.DEVICE_TOKEN)) {
                o.a().execute(new c(context, intent));
            } else {
                HMSLog.i("PushReceiver", "This message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            str = "handlePushMessageEvent execute task runtime exception.";
            HMSLog.e("PushReceiver", str);
        } catch (Exception unused2) {
            str = "handlePushTokenEvent execute task error";
            HMSLog.e("PushReceiver", str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        HMSLog.i("PushReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.android.push.intent.REGISTRATION".equals(action)) {
                b(context, intent);
            } else if ("com.huawei.android.push.intent.RECEIVE".equals(action)) {
                a(context, intent);
            } else {
                HMSLog.i("PushReceiver", "message can't be recognised.");
            }
        } catch (Exception unused) {
            HMSLog.e("PushReceiver", "intent has some error");
        }
    }
}
