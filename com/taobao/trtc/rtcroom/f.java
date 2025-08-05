package com.taobao.trtc.rtcroom;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.utils.TrtcLog;
import tb.kge;
import tb.ohf;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f23170a;
    private final h b;
    private boolean c = false;
    private boolean d;
    private boolean e;
    private ohf.a f;

    static {
        kge.a(740381208);
        f23170a = f.class.getName();
    }

    public f(h hVar, int i, int i2, int i3, ohf.a aVar) {
        this.b = hVar;
        this.f = aVar;
        if (i == 1) {
            aVar.setTargetScreenSize(720, 1280);
        } else {
            aVar.setTargetScreenSize(1080, 1920);
        }
        aVar.setCursorMoveAnimDuration(100L);
        aVar.setCursorThemeColor(i2, i3);
        String str = f23170a;
        TrtcLog.d(str, "ScreenInteractionAdapter - definition: " + i + ", animDuration: 100, Color: " + i2 + "/" + i3);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TrtcLog.d(f23170a, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        this.c = false;
        this.d = false;
        this.e = false;
        try {
            this.f.close();
        } catch (Throwable unused) {
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            TrtcLog.d(f23170a, "reshow");
            this.f.stop();
            this.f.show();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.trtc.rtcroom.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            r1[r3] = r4
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r2] = r6
            r6 = 3
            r1[r6] = r8
            java.lang.String r6 = "9d025a92"
            r0.ipc$dispatch(r6, r1)
            return
        L25:
            if (r6 == r3) goto L2c
            if (r6 != r2) goto L2a
            goto L2c
        L2a:
            r0 = 0
            goto L2d
        L2c:
            r0 = 1
        L2d:
            r5.c = r0
            if (r6 != 0) goto L44
            r5.d = r4     // Catch: java.lang.Throwable -> L42
            r5.e = r4     // Catch: java.lang.Throwable -> L42
            tb.ohf$a r0 = r5.f     // Catch: java.lang.Throwable -> L42
            r0.close()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = com.taobao.trtc.rtcroom.f.f23170a     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "close"
            com.taobao.trtc.utils.TrtcLog.d(r0, r1)     // Catch: java.lang.Throwable -> L42
            goto L5c
        L42:
            goto L5c
        L44:
            if (r6 != r3) goto L49
            r5.e = r3     // Catch: java.lang.Throwable -> L42
            goto L5c
        L49:
            if (r6 != r2) goto L5c
            r5.e = r4     // Catch: java.lang.Throwable -> L42
            r5.d = r4     // Catch: java.lang.Throwable -> L42
            tb.ohf$a r0 = r5.f     // Catch: java.lang.Throwable -> L42
            r0.stop()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = com.taobao.trtc.rtcroom.f.f23170a     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "stop"
            com.taobao.trtc.utils.TrtcLog.d(r0, r1)     // Catch: java.lang.Throwable -> L42
        L5c:
            com.taobao.trtc.rtcroom.h r0 = r5.b
            if (r0 == 0) goto L89
            r0.a(r6, r7, r8)
            java.lang.String r0 = com.taobao.trtc.rtcroom.f.f23170a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ScreenInteractionStatus: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ", code: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = ", action: "
            r1.append(r6)
            r1.append(r8)
            java.lang.String r6 = r1.toString()
            com.taobao.trtc.utils.h.a(r0, r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.rtcroom.f.a(int, int, java.lang.String):void");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!PermissionActivity.a(this.b.g())) {
            TrtcLog.d(f23170a, "drop cmd for no overlay permission");
        } else {
            try {
                if (!this.d && this.e) {
                    this.d = true;
                    this.f.show();
                    TrtcLog.d(f23170a, "show");
                }
                this.f.update(jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }
}
