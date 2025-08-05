package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fuf;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpCurrentTimestamp extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPCURRENTTIMESTAMP = 111335565854380422L;
    public static final int TYPE_MS = 0;
    public static final int TYPE_S = 1;
    private String TAG = "MpCurrentTimestamp";

    static {
        kge.a(292051012);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: Throwable -> 0x0032, TryCatch #0 {Throwable -> 0x0032, blocks: (B:7:0x001b, B:9:0x001e, B:11:0x0024, B:18:0x0037, B:20:0x0044), top: B:24:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Throwable -> 0x0032, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0032, blocks: (B:7:0x001b, B:9:0x001e, B:11:0x0024, B:18:0x0037, B:20:0x0044), top: B:24:0x001b }] */
    @Override // tb.fuf, tb.fut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r5, com.taobao.android.dinamicx.DXRuntimeContext r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentTimestamp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "ccd8bd96"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            return r5
        L19:
            if (r5 == 0) goto L34
            int r6 = r5.length     // Catch: java.lang.Throwable -> L32
            if (r6 <= 0) goto L34
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L32
            boolean r6 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L34
            java.lang.String r6 = "s"
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L32
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L34
            goto L35
        L32:
            r5 = move-exception
            goto L54
        L34:
            r2 = 0
        L35:
            if (r2 != 0) goto L44
            com.taobao.message.launcher.server_time.AmpTimeStampManager r5 = com.taobao.message.launcher.server_time.AmpTimeStampManager.instance()     // Catch: java.lang.Throwable -> L32
            long r5 = r5.getCurrentTimeStamp()     // Catch: java.lang.Throwable -> L32
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L32
            return r5
        L44:
            com.taobao.message.launcher.server_time.AmpTimeStampManager r5 = com.taobao.message.launcher.server_time.AmpTimeStampManager.instance()     // Catch: java.lang.Throwable -> L32
            long r5 = r5.getCurrentTimeStamp()     // Catch: java.lang.Throwable -> L32
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L32
            return r5
        L54:
            java.lang.String r6 = r4.TAG
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            com.taobao.tao.log.TLog.loge(r6, r5)
            com.taobao.message.launcher.server_time.AmpTimeStampManager r5 = com.taobao.message.launcher.server_time.AmpTimeStampManager.instance()
            long r5 = r5.getCurrentTimeStamp()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentTimestamp.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
