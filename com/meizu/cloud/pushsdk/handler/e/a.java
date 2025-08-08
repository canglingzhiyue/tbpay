package com.meizu.cloud.pushsdk.handler.e;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.e.j.e;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.util.b;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a<T> implements com.meizu.cloud.pushsdk.handler.c {

    /* renamed from: a  reason: collision with root package name */
    private com.meizu.cloud.pushsdk.handler.a f7978a;
    private Context b;
    private SparseArray<String> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        if (context != null) {
            this.b = context.getApplicationContext();
            this.f7978a = aVar;
            SparseArray<String> sparseArray = new SparseArray<>();
            this.c = sparseArray;
            sparseArray.put(2, "MESSAGE_TYPE_PUSH_SERVICE_V2");
            this.c.put(4, "MESSAGE_TYPE_PUSH_SERVICE_V3");
            this.c.put(16, "MESSAGE_TYPE_REGISTER");
            this.c.put(32, "MESSAGE_TYPE_UNREGISTER");
            this.c.put(8, "MESSAGE_TYPE_THROUGH");
            this.c.put(64, "MESSAGE_TYPE_NOTIFICATION_CLICK");
            this.c.put(128, "MESSAGE_TYPE_NOTIFICATION_DELETE");
            this.c.put(256, "MESSAGE_TYPE_PUSH_SWITCH_STATUS");
            this.c.put(512, "MESSAGE_TYPE_PUSH_REGISTER_STATUS");
            this.c.put(2048, "MESSAGE_TYPE_PUSH_SUBTAGS_STATUS");
            this.c.put(1024, "MESSAGE_TYPE_PUSH_UNREGISTER_STATUS");
            this.c.put(4096, "MESSAGE_TYPE_PUSH_SUBALIAS_STATUS");
            this.c.put(8192, "MESSAGE_TYPE_SCHEDULE_NOTIFICATION");
            this.c.put(16384, "MESSAGE_TYPE_RECEIVE_NOTIFY_MESSAGE");
            this.c.put(32768, "MESSAGE_TYPE_NOTIFICATION_STATE");
            this.c.put(65536, "MESSAGE_TYPE_UPLOAD_FILE_LOG");
            this.c.put(131072, "MESSAGE_TYPE_NOTIFICATION_ARRIVED");
            this.c.put(262144, "MESSAGE_TYPE_NOTIFICATION_WITHDRAW");
            this.c.put(524288, "MESSAGE_TYPE_BRIGHT_NOTIFICATION");
            this.c.put(1048576, "MESSAGE_TYPE_NOTIFICATION_CLOSE");
            return;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    private String a(int i) {
        return this.c.get(i);
    }

    public static boolean a(Context context, String str) {
        try {
            return ((Boolean) Class.forName("com.meizu.cloud.utils.ProcessUtils").getDeclaredMethod("isRunningProcess", Context.class, String.class).invoke(null, context, str)).booleanValue();
        } catch (Exception e) {
            DebugLogger.e("AbstractMessageHandler", "getDeviceId error " + e.getMessage());
            return true;
        }
    }

    private boolean a(String str, MessageV3 messageV3, String str2) {
        if (StringUtils.isEmpty(str)) {
            DebugLogger.e("AbstractMessageHandler", "security check fail, public key is null");
            return false;
        }
        String a2 = com.meizu.cloud.pushsdk.util.c.a(str, str2);
        DebugLogger.i("AbstractMessageHandler", "decrypt sign: " + a2);
        boolean a3 = com.meizu.cloud.pushsdk.handler.e.j.e.a(a2, messageV3);
        DebugLogger.i("AbstractMessageHandler", "check public key result: " + a3);
        return a3;
    }

    private boolean b(String str, MessageV3 messageV3, String str2) {
        String str3;
        if (!StringUtils.isEmpty(str)) {
            str3 = "sa, public key not empty";
        } else if (!"private".equals(str2)) {
            str3 = "sa, message not click method";
        } else if (b.d(c(), messageV3.getPackageName())) {
            b.a(c(), messageV3.getPackageName(), false);
            return true;
        } else {
            str3 = "sa, not first request";
        }
        DebugLogger.i("AbstractMessageHandler", str3);
        return false;
    }

    private String d() {
        String str = null;
        for (int i = 0; i < 2; i++) {
            str = e();
            if (!StringUtils.isEmpty(str)) {
                break;
            }
        }
        return str;
    }

    public String a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("launcher");
            if (jSONObject.has("pkg") && !StringUtils.isEmpty(jSONObject.getString("pkg"))) {
                return jSONObject.getString("pkg");
            }
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse desk top json error");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.handler.e.b.a a2;
        com.meizu.cloud.pushsdk.notification.model.a b;
        if (messageV3.getAdvertisementOption() == null || StringUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage()) || (a2 = com.meizu.cloud.pushsdk.b.a(context).a()) == null || (b = com.meizu.cloud.pushsdk.notification.model.a.b(messageV3)) == null) {
            return;
        }
        a2.a(b.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(MessageV3 messageV3) {
        if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            b(messageV3);
            return;
        }
        com.meizu.cloud.pushsdk.notification.model.a b = com.meizu.cloud.pushsdk.notification.model.a.b(messageV3);
        if (b == null) {
            return;
        }
        DebugLogger.e("AbstractMessageHandler", "delete notifyId " + b.a() + " notifyKey " + b.b());
        if (!StringUtils.isEmpty(b.b())) {
            com.meizu.cloud.pushsdk.platform.c.b.a(c()).a(messageV3.getUploadDataPackageName(), b.b());
        } else {
            com.meizu.cloud.pushsdk.platform.c.b.a(c()).a(messageV3.getUploadDataPackageName(), b.a());
        }
    }

    protected void a(T t) {
    }

    protected abstract void a(T t, com.meizu.cloud.pushsdk.notification.c cVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(int i, String str) {
        boolean z = true;
        if (i == 0) {
            z = b.f(c(), str);
        } else if (i == 1) {
            z = b.k(c(), str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i == 0 ? " canNotificationMessage " : " canThroughMessage ");
        sb.append(z);
        DebugLogger.i("AbstractMessageHandler", sb.toString());
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(MessageV3 messageV3, String str) {
        String a2 = com.meizu.cloud.pushsdk.handler.e.j.e.a(messageV3);
        if (StringUtils.isEmpty(a2)) {
            DebugLogger.i("AbstractMessageHandler", "message does not contain signature field");
            return false;
        }
        String g = b.g(c(), messageV3.getPackageName());
        DebugLogger.i("AbstractMessageHandler", "local public key is: " + g);
        if (b(g, messageV3, str)) {
            DebugLogger.i("AbstractMessageHandler", "message special approval no check");
            return true;
        } else if (a(g, messageV3, a2)) {
            DebugLogger.i("AbstractMessageHandler", "security check passed");
            return true;
        } else {
            String d = d();
            DebugLogger.i("AbstractMessageHandler", "network request public key: " + d);
            if (!a(d, messageV3, a2)) {
                DebugLogger.e("AbstractMessageHandler", "security check fail");
                return false;
            }
            b.f(c(), messageV3.getPackageName(), d);
            DebugLogger.i("AbstractMessageHandler", "security check passed");
            return true;
        }
    }

    protected boolean a(T t, String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.meizu.cloud.pushsdk.handler.a b() {
        return this.f7978a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.notification.model.a b = com.meizu.cloud.pushsdk.notification.model.a.b(messageV3);
        if (b != null) {
            DebugLogger.i("AbstractMessageHandler", "delete notifyKey " + b.b() + " notifyId " + b.a());
            if (!StringUtils.isEmpty(b.b())) {
                com.meizu.cloud.pushsdk.notification.g.b.a(c(), messageV3.getUploadDataPackageName(), b.b());
            } else {
                com.meizu.cloud.pushsdk.notification.g.b.b(c(), messageV3.getUploadDataPackageName(), b.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[ADDED_TO_REGION] */
    @Override // com.meizu.cloud.pushsdk.handler.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.content.Intent r7) {
        /*
            r6 = this;
            boolean r0 = r6.a(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "current message Type "
            r0.append(r2)
            int r2 = r6.a()
            java.lang.String r2 = r6.a(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "AbstractMessageHandler"
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r0)
            java.lang.Object r0 = r6.f(r7)
            java.lang.String r7 = r6.e(r7)
            boolean r7 = r6.a(r0, r7)
            if (r7 != 0) goto L3a
            java.lang.String r7 = "invalid push message"
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r7)
            return r1
        L3a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = "current Handler message "
            r7.append(r3)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r7)
            r6.d(r0)
            int r7 = r6.f(r0)
            r3 = 1
            if (r7 == 0) goto L86
            if (r7 == r3) goto L80
            r4 = 2
            if (r7 == r4) goto L7d
            r4 = 3
            if (r7 == r4) goto L74
            r4 = 4
            if (r7 == r4) goto L6b
            r3 = 5
            if (r7 == r3) goto L68
        L66:
            r3 = 0
            goto L8c
        L68:
            java.lang.String r7 = "ad cannot show message"
            goto L82
        L6b:
            java.lang.String r7 = "bright notification"
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r7)
            r6.a(r0)
            goto L8c
        L74:
            java.lang.String r7 = "schedule notification"
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r7)
            r6.g(r0)
            goto L8c
        L7d:
            java.lang.String r7 = "notification on time ,show message"
            goto L88
        L80:
            java.lang.String r7 = "expire notification, don't show message"
        L82:
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r7)
            goto L66
        L86:
            java.lang.String r7 = "schedule send message off, send message directly"
        L88:
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r7)
            r1 = 1
        L8c:
            boolean r7 = r6.b(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "can send message "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r4)
            if (r3 == 0) goto Lb9
            if (r1 == 0) goto Lb9
            if (r7 == 0) goto Lb9
            com.meizu.cloud.pushsdk.notification.c r7 = r6.e(r0)
            r6.a(r0, r7)
            r6.c(r0)
            java.lang.String r7 = "send message end "
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r7)
        Lb9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.handler.e.a.b(android.content.Intent):boolean");
    }

    protected boolean b(T t) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(String str) {
        try {
            return c().getPackageName().equals(new JSONObject(str).getString("appId"));
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse notification error");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c(Intent intent) {
        long longExtra = intent.getLongExtra(PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, 0L);
        DebugLogger.i("AbstractMessageHandler", "receive push delayedReportMillis from pushservice " + longExtra);
        return longExtra;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || StringUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                b().b(c(), MzPushMessage.fromMessageV3(messageV3));
            } else if (!a(c(), messageV3.getUploadDataPackageName())) {
            } else {
                DebugLogger.i("AbstractMessageHandler", "send notification arrived message to " + messageV3.getUploadDataPackageName());
                Intent intent = new Intent();
                if (MinSdkChecker.isSupportTransmitMessageValue(this.b, messageV3.getUploadDataPackageName())) {
                    intent.putExtra(PushConstants.MZ_MESSAGE_VALUE, com.meizu.cloud.pushsdk.handler.d.a(messageV3));
                } else {
                    intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
                }
                intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_ARRIVED);
                MzSystemUtils.sendMessageFromBroadcast(c(), intent, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getUploadDataPackageName());
            }
        }
    }

    protected void c(T t) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY) : null;
        if (StringUtils.isEmpty(stringExtra)) {
            String a2 = com.meizu.cloud.pushsdk.d.c.a(c());
            DebugLogger.e("AbstractMessageHandler", "force get deviceId " + a2);
            return a2;
        }
        return stringExtra;
    }

    protected void d(T t) {
    }

    protected com.meizu.cloud.pushsdk.notification.c e(T t) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return new e.a((String) com.meizu.cloud.pushsdk.e.a.a(PushConstants.GET_PUBLIC_KEY).a().d().b()).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e(Intent intent) {
        return intent.getStringExtra("method");
    }

    protected int f(T t) {
        return 0;
    }

    protected abstract T f(Intent intent);

    /* JADX INFO: Access modifiers changed from: protected */
    public String g(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SERVICE_DEFAULT_PACKAGE_NAME);
        return StringUtils.isEmpty(stringExtra) ? c().getPackageName() : stringExtra;
    }

    protected void g(T t) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String h(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_TASK_TIMES_TAMP);
        DebugLogger.i("AbstractMessageHandler", "receive push timestamp from pushservice " + stringExtra);
        return StringUtils.isEmpty(stringExtra) ? String.valueOf(System.currentTimeMillis() / 1000) : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String i(Intent intent) {
        return intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String j(Intent intent) {
        return intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_TASK_ID);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(PushConstants.MZ_PUSH_WHITE_LIST, false);
        DebugLogger.i("AbstractMessageHandler", "receive push whiteList from pushservice " + booleanExtra);
        return booleanExtra;
    }
}
