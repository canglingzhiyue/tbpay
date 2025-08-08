package com.taobao.accs.init;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_Login implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1262141599);
        kge.a(1028243835);
    }

    public void init(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        ALog.i("Launcher_Login", "login", new Object[0]);
        a.a(new Runnable() { // from class: com.taobao.accs.init.Launcher_Login.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[Catch: Throwable -> 0x00ab, TryCatch #0 {Throwable -> 0x00ab, blocks: (B:28:0x0064, B:30:0x006a, B:31:0x0074, B:27:0x005c), top: B:36:0x005c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r7 = this;
                    java.lang.String r0 = "Launcher_Login"
                    com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.accs.init.Launcher_Login.AnonymousClass1.$ipChange
                    boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L14
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r0[r4] = r7
                    java.lang.String r2 = "5c510192"
                    r1.ipc$dispatch(r2, r0)
                    return
                L14:
                    r1 = 0
                    java.util.HashMap r2 = r2     // Catch: java.lang.Throwable -> L5b
                    java.lang.String r5 = "envIndex"
                    java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L5b
                    java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L5b
                    int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L5b
                    java.util.HashMap r5 = r2     // Catch: java.lang.Throwable -> L5b
                    java.lang.String r6 = "onlineAppKey"
                    java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L5b
                    java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L5b
                    if (r2 != r3) goto L41
                    java.util.HashMap r1 = r2     // Catch: java.lang.Throwable -> L3d
                    java.lang.String r2 = "preAppKey"
                    java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3d
                L3a:
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3d
                    goto L64
                L3d:
                    r1 = move-exception
                    r2 = r1
                    r1 = r5
                    goto L5c
                L41:
                    r1 = 2
                    if (r2 != r1) goto L46
                    r1 = 1
                    goto L47
                L46:
                    r1 = 0
                L47:
                    r6 = 3
                    if (r2 != r6) goto L4c
                    r2 = 1
                    goto L4d
                L4c:
                    r2 = 0
                L4d:
                    r1 = r1 | r2
                    if (r1 == 0) goto L59
                    java.util.HashMap r1 = r2     // Catch: java.lang.Throwable -> L3d
                    java.lang.String r2 = "dailyAppkey"
                    java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3d
                    goto L3a
                L59:
                    r1 = r5
                    goto L64
                L5b:
                    r2 = move-exception
                L5c:
                    java.lang.String r5 = "login get param error"
                    java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.utl.ALog.e(r0, r5, r2, r6)     // Catch: java.lang.Throwable -> Lab
                L64:
                    boolean r2 = android.text.StringUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lab
                    if (r2 == 0) goto L74
                    java.lang.String r1 = "login get appkey null"
                    java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.utl.ALog.e(r0, r1, r2)     // Catch: java.lang.Throwable -> Lab
                    java.lang.String r1 = "21646297"
                L74:
                    android.app.Application r2 = r3     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.init.Launcher_InitAccs.mContext = r2     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.init.Launcher_InitAccs.mAppkey = r1     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.init.Launcher_InitAccs.mForceBindUser = r3     // Catch: java.lang.Throwable -> Lab
                    java.util.HashMap r1 = r2     // Catch: java.lang.Throwable -> Lab
                    java.lang.String r2 = "userId"
                    java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lab
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.init.Launcher_InitAccs.mUserId = r1     // Catch: java.lang.Throwable -> Lab
                    java.util.HashMap r1 = r2     // Catch: java.lang.Throwable -> Lab
                    java.lang.String r2 = "sid"
                    java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lab
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.init.Launcher_InitAccs.mSid = r1     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.ACCSClient r1 = com.taobao.accs.ACCSClient.getAccsClient()     // Catch: java.lang.Throwable -> Lab
                    java.util.HashMap r2 = r2     // Catch: java.lang.Throwable -> Lab
                    java.lang.String r3 = "ttid"
                    java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lab
                    java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lab
                    com.taobao.accs.IAppReceiver r3 = com.taobao.accs.init.Launcher_InitAccs.mAppReceiver     // Catch: java.lang.Throwable -> Lab
                    r1.bindApp(r2, r3)     // Catch: java.lang.Throwable -> Lab
                    return
                Lab:
                    r1 = move-exception
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    java.lang.String r3 = "login"
                    com.taobao.accs.utl.ALog.e(r0, r3, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.init.Launcher_Login.AnonymousClass1.run():void");
            }
        });
    }
}
