package com.huawei.hms.support.api.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.push.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.g;
import com.huawei.hms.push.r;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.Objects;

/* loaded from: classes4.dex */
public class HmsMsgService extends Service {

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Context f7555a;

        a(Context context) {
            this.f7555a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            Bundle data = message.getData();
            if (Objects.equals(this.f7555a.getApplicationContext().getPackageManager().getNameForUid(message.sendingUid), HMSPackageManager.getInstance(this.f7555a).getHMSPackageName()) && data != null) {
                if (HMSPackageManager.getInstance(this.f7555a).getHMSPackageStates() != PackageManagerHelper.PackageStates.ENABLED) {
                    HMSLog.i("HmsMsgService", "service not start by hms");
                } else {
                    HMSLog.i("HmsMsgService", "chose push type");
                    if (Objects.equals(b.b(data, "push_action"), "com.huawei.push.msg.NOTIFY_MSG")) {
                        if (ResourceLoaderUtil.getmContext() == null) {
                            ResourceLoaderUtil.setmContext(this.f7555a.getApplicationContext());
                        }
                        HMSLog.i("HmsMsgService", "invokeSelfShow");
                        HmsMsgService.c(this.f7555a, data);
                    } else if (Objects.equals(b.b(data, "push_action"), "com.huawei.push.msg.PASSBY_MSG")) {
                        HMSLog.i("HmsMsgService", "sendBroadcastToHms");
                        HmsMsgService.d(this.f7555a, data);
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, Bundle bundle) {
        String str;
        if (!g.a(context)) {
            str = context.getPackageName() + " disable display notification.";
        } else {
            Intent intent = new Intent();
            intent.setAction("com.huawei.push.msg.NOTIFY_MSG");
            intent.putExtra("selfshow_info", b.a(bundle, "selfshow_info"));
            intent.putExtra("selfshow_token", b.a(bundle, "selfshow_token"));
            intent.setPackage(b.c(bundle, "push_package"));
            r.a(context, intent);
            str = "invokeSelfShow done";
        }
        HMSLog.i("HmsMsgService", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, Bundle bundle) {
        String str;
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.android.push.intent.RECEIVE");
            intent.putExtra("msg_data", b.a(bundle, "msg_data"));
            intent.putExtra(RemoteMessageConst.DEVICE_TOKEN, b.a(bundle, RemoteMessageConst.DEVICE_TOKEN));
            intent.putExtra("msgIdStr", b.c(bundle, "msgIdStr"));
            intent.setFlags(32);
            intent.setPackage(b.c(bundle, "push_package"));
            context.sendBroadcast(intent, context.getPackageName() + ".permission.PROCESS_PUSH_MSG");
            HMSLog.i("HmsMsgService", "send broadcast passby done");
        } catch (SecurityException unused) {
            str = "send broadcast SecurityException";
            HMSLog.i("HmsMsgService", str);
        } catch (Exception unused2) {
            str = "send broadcast Exception";
            HMSLog.i("HmsMsgService", str);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.i("HmsMsgService", "onBind");
        return new Messenger(new a(this)).getBinder();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        HMSLog.i("HmsMsgService", "Enter onStartCommand.");
        return 2;
    }
}
