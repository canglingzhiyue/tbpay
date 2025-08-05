package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fhc implements flw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1331100761);
        kge.a(-1428709539);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r1.equals(tb.fhb.OPERATE_STORE_PLACE_HOLDER_IMAGE_MODE) != false) goto L14;
     */
    @Override // tb.flw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.android.trade.event.Event> a(com.alibaba.fastjson.JSONObject r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fhc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "3f6755bf"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.util.List r8 = (java.util.List) r8
            return r8
        L18:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r8 != 0) goto L20
            return r0
        L20:
            java.lang.String r1 = "eventKey"
            java.lang.String r1 = r8.getString(r1)
            r5 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case -2012580847: goto L76;
                case -1804140217: goto L6b;
                case -931774717: goto L61;
                case -890016359: goto L57;
                case 203287846: goto L4d;
                case 257484748: goto L44;
                case 1215098123: goto L39;
                case 1536672141: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L80
        L2f:
            java.lang.String r2 = "renderSuccess"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L80
            r2 = 0
            goto L81
        L39:
            java.lang.String r2 = "videoFirstFrameReady"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L80
            r2 = 4
            goto L81
        L44:
            java.lang.String r3 = "storePlaceHolderImageMode"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L80
            goto L81
        L4d:
            java.lang.String r2 = "pageNavStatus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L80
            r2 = 5
            goto L81
        L57:
            java.lang.String r2 = "openImmediatelyRenderSuccess"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L80
            r2 = 2
            goto L81
        L61:
            java.lang.String r2 = "autoScrollToNextFrame"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L80
            r2 = 7
            goto L81
        L6b:
            java.lang.String r2 = "videoFirstFrameOpenImmediatelyReady"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L80
            r2 = 3
            goto L81
        L76:
            java.lang.String r2 = "mediaChannelToNative"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L80
            r2 = 6
            goto L81
        L80:
            r2 = -1
        L81:
            switch(r2) {
                case 0: goto L85;
                case 1: goto L85;
                case 2: goto L85;
                case 3: goto L85;
                case 4: goto L85;
                case 5: goto L85;
                case 6: goto L85;
                case 7: goto L85;
                default: goto L84;
            }
        L84:
            return r0
        L85:
            tb.fhb r1 = new tb.fhb
            java.lang.String r2 = "uniqueId"
            java.lang.Object r2 = r8.get(r2)
            r1.<init>(r2, r8)
            r0.add(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fhc.a(com.alibaba.fastjson.JSONObject):java.util.List");
    }
}
