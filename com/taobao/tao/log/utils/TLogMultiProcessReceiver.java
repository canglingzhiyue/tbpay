package com.taobao.tao.log.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.g;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class TLogMultiProcessReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1251731778);
    }

    public static /* synthetic */ Object ipc$super(TLogMultiProcessReceiver tLogMultiProcessReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$D5QpuOh2t_b_y15SiwuLruJKbXk(TLogMultiProcessReceiver tLogMultiProcessReceiver, Intent intent) {
        tLogMultiProcessReceiver.c(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (!c.b(context)) {
            Log.e("TLogProcessReceiver", "The TLogMultiProcessNotify is disable");
        } else if (intent == null || intent.getAction() == null) {
        } else {
            d.a().a(new Runnable() { // from class: com.taobao.tao.log.utils.-$$Lambda$TLogMultiProcessReceiver$D5QpuOh2t_b_y15SiwuLruJKbXk
                {
                    TLogMultiProcessReceiver.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TLogMultiProcessReceiver.lambda$D5QpuOh2t_b_y15SiwuLruJKbXk(TLogMultiProcessReceiver.this, intent);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
        if (r1 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0071, code lost:
        if (r1 == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0074, code lost:
        b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0077, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0078, code lost:
        a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void c(android.content.Intent r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.log.utils.TLogMultiProcessReceiver.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r8 = "2aa30527"
            r0.ipc$dispatch(r8, r1)
            return
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L80
            r0.<init>()     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = "Receive action: "
            r0.append(r1)     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = r8.getAction()     // Catch: java.lang.Exception -> L80
            r0.append(r1)     // Catch: java.lang.Exception -> L80
            r0.toString()     // Catch: java.lang.Exception -> L80
            java.lang.String r0 = "tlog_pid"
            r1 = -1
            int r0 = r8.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L80
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L80
            if (r5 != r0) goto L38
            return
        L38:
            java.lang.String r0 = r8.getAction()     // Catch: java.lang.Exception -> L80
            int r5 = r0.hashCode()     // Catch: java.lang.Exception -> L80
            r6 = -836891243(0xffffffffce1e0d95, float:-6.6292256E8)
            if (r5 == r6) goto L64
            r6 = -730623461(0xffffffffd473921b, float:-4.18451318E12)
            if (r5 == r6) goto L5a
            r2 = -268762717(0xffffffffeffb01a3, float:-1.5536543E29)
            if (r5 == r2) goto L50
            goto L6d
        L50:
            java.lang.String r2 = "com.taobao.tao.log.change.modulelevel"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L6d
            r1 = 2
            goto L6d
        L5a:
            java.lang.String r5 = "com.taobao.tao.log.flush"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L6d
            r1 = 0
            goto L6d
        L64:
            java.lang.String r2 = "com.taobao.tao.log.change.loglevel"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L6d
            r1 = 1
        L6d:
            if (r1 == 0) goto L7c
            if (r1 == r3) goto L78
            if (r1 == r4) goto L74
            goto L77
        L74:
            r7.b(r8)     // Catch: java.lang.Exception -> L80
        L77:
            return
        L78:
            r7.a(r8)     // Catch: java.lang.Exception -> L80
            goto L84
        L7c:
            r7.a()     // Catch: java.lang.Exception -> L80
            goto L84
        L80:
            r8 = move-exception
            r8.printStackTrace()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.log.utils.TLogMultiProcessReceiver.c(android.content.Intent):void");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            Log.e("TLogProcessReceiver", "TLog MultiProcess flushLog");
            TLogNative.appenderFlushData(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            Log.e("TLogProcessReceiver", "TLog MultiProcess changeLogLevel");
            try {
                com.taobao.tao.log.e.a().a((LogLevel) intent.getSerializableExtra(c.PARAM_LOG_LEVEL));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            Log.e("TLogProcessReceiver", "TLog MultiProcess changeModuleLevel");
            try {
                String stringExtra = intent.getStringExtra(c.PARAM_MODULE_LEVEL);
                if ("off".equals(stringExtra)) {
                    com.taobao.tao.log.e.a().b();
                    return;
                }
                Map<String, LogLevel> a2 = g.a(stringExtra);
                if (a2 == null || a2.size() <= 0) {
                    return;
                }
                com.taobao.tao.log.e.a().a(a2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
