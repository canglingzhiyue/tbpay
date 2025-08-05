package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class smm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2055645244);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r5.equals("play") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.smm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "9f352ae"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            r0 = 0
            r1 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1965178660: goto L5a;
                case -791304882: goto L50;
                case -673660814: goto L46;
                case 3443508: goto L3d;
                case 106440182: goto L33;
                case 802293009: goto L29;
                case 1971785539: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L64
        L1f:
            java.lang.String r2 = "seekEnd"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L64
            r2 = 5
            goto L65
        L29:
            java.lang.String r2 = "seekBegin"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L64
            r2 = 4
            goto L65
        L33:
            java.lang.String r2 = "pause"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L64
            r2 = 1
            goto L65
        L3d:
            java.lang.String r3 = "play"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L64
            goto L65
        L46:
            java.lang.String r2 = "finished"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L64
            r2 = 6
            goto L65
        L50:
            java.lang.String r2 = "clickPause"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L64
            r2 = 3
            goto L65
        L5a:
            java.lang.String r2 = "clickPlay"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L64
            r2 = 2
            goto L65
        L64:
            r2 = -1
        L65:
            switch(r2) {
                case 0: goto L7b;
                case 1: goto L78;
                case 2: goto L75;
                case 3: goto L72;
                case 4: goto L6f;
                case 5: goto L6c;
                case 6: goto L69;
                default: goto L68;
            }
        L68:
            goto L7d
        L69:
            java.lang.String r0 = "VSMSG_videoStateFinished"
            goto L7d
        L6c:
            java.lang.String r0 = "VSMSG_videoStateSeekEnd"
            goto L7d
        L6f:
            java.lang.String r0 = "VSMSG_videoStateSeekBegin"
            goto L7d
        L72:
            java.lang.String r0 = "VSMSG_videoStateClickPause"
            goto L7d
        L75:
            java.lang.String r0 = "VSMSG_videoStateClickPlay"
            goto L7d
        L78:
            java.lang.String r0 = "VSMSG_videoStatePause"
            goto L7d
        L7b:
            java.lang.String r0 = "VSMSG_videoStatePlay"
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.smm.a(java.lang.String):java.lang.String");
    }
}
