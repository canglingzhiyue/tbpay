package com.taobao.android.middleware.compat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import java.io.Serializable;
import mtopsdk.common.util.TBSdkLog;

/* loaded from: classes.dex */
public class AusInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "aus.AusInitializer";
    private static String currentUserId;
    private static final BroadcastReceiver loginReceiver = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.AusInitializer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || (valueOf = LoginAction.valueOf((action = intent.getAction()))) == null) {
            } else {
                TBSdkLog.e(AusInitializer.TAG, "loginAction=" + action);
                int i = AnonymousClass3.f14310a[valueOf.ordinal()];
                if (i == 1) {
                    AusInitializer.access$002(Login.getUserId());
                } else if (i != 2) {
                } else {
                    AusInitializer.access$002(null);
                }
            }
        }
    };

    /* renamed from: com.taobao.android.middleware.compat.AusInitializer$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14310a = new int[LoginAction.values().length];

        static {
            try {
                f14310a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14310a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : currentUserId;
    }

    public static /* synthetic */ String access$002(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        currentUserId = str;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.app.Application r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) {
        /*
            r10 = this;
            java.lang.String r0 = "aus.AusInitializer"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.middleware.compat.AusInitializer.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1a
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r10
            r0[r4] = r11
            r0[r3] = r12
            java.lang.String r11 = "dddb138b"
            r1.ipc$dispatch(r11, r0)
            return
        L1a:
            r1 = 0
            java.lang.String r2 = "envIndex"
            java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.Exception -> L75
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L75
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L75
            java.lang.String r6 = "onlineAppKey"
            java.lang.Object r6 = r12.get(r6)     // Catch: java.lang.Exception -> L71
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L71
            java.lang.String r7 = "dailyAppkey"
            java.lang.Object r7 = r12.get(r7)     // Catch: java.lang.Exception -> L6f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = "userId"
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L73
            com.taobao.android.middleware.compat.AusInitializer.currentUserId = r1     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = "isDebuggable"
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Exception -> L73
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L73
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L73
            mtopsdk.common.util.TBSdkLog$LogEnable r8 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable     // Catch: java.lang.Exception -> L79
            boolean r8 = mtopsdk.common.util.TBSdkLog.isLogEnable(r8)     // Catch: java.lang.Exception -> L79
            if (r8 == 0) goto L8e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79
            r8.<init>()     // Catch: java.lang.Exception -> L79
            java.lang.String r9 = "parse ParamsMap succeed.params="
            r8.append(r9)     // Catch: java.lang.Exception -> L79
            r8.append(r12)     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L79
            mtopsdk.common.util.TBSdkLog.i(r0, r8)     // Catch: java.lang.Exception -> L79
            goto L8e
        L6f:
            r7 = r1
            goto L73
        L71:
            r6 = r1
            r7 = r6
        L73:
            r1 = 0
            goto L79
        L75:
            r6 = r1
            r7 = r6
            r1 = 0
            r2 = 0
        L79:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "parse ParamsMap error.params="
            r8.append(r9)
            r8.append(r12)
            java.lang.String r12 = r8.toString()
            mtopsdk.common.util.TBSdkLog.e(r0, r12)
        L8e:
            com.uploader.export.UploaderGlobal.a(r11)
            if (r2 != 0) goto L98
            com.uploader.export.UploaderGlobal.a(r5, r6)
            r3 = 0
            goto La2
        L98:
            if (r2 != r4) goto L9f
            com.uploader.export.UploaderGlobal.a(r4, r6)
            r3 = 1
            goto La2
        L9f:
            com.uploader.export.UploaderGlobal.a(r3, r7)
        La2:
            android.content.Context r11 = com.uploader.export.UploaderGlobal.a()
            com.taobao.android.middleware.compat.AusInitializer$2 r12 = new com.taobao.android.middleware.compat.AusInitializer$2
            r12.<init>(r11)
            android.content.BroadcastReceiver r0 = com.taobao.android.middleware.compat.AusInitializer.loginReceiver
            com.taobao.login4android.broadcast.LoginBroadcastHelper.registerLoginReceiver(r11, r0)
            r12.a(r3)
            if (r1 == 0) goto Lcb
            tb.rpe r0 = new tb.rpe
            r0.<init>()
            r0.a(r5)
            tb.rpb r1 = new tb.rpb
            tb.rpf r2 = new tb.rpf
            r2.<init>()
            r1.<init>(r11, r12, r0, r2)
            com.uploader.export.UploaderGlobal.a(r1)
            return
        Lcb:
            tb.rpb r0 = new tb.rpb
            r0.<init>(r11, r12)
            com.uploader.export.UploaderGlobal.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.AusInitializer.init(android.app.Application, java.util.HashMap):void");
    }
}
