package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;

/* loaded from: classes.dex */
public class kzy extends kzw implements IPopMessageListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public kzy(lad ladVar) {
        super(ladVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7.equals("netWork") != false) goto L13;
     */
    @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessage(java.lang.String r7, com.taobao.homepage.pop.protocol.model.pop.IPopData r8, com.alibaba.fastjson.JSONObject r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kzy.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r5] = r7
            r1[r4] = r8
            r1[r3] = r9
            java.lang.String r7 = "b9b3eda9"
            r0.ipc$dispatch(r7, r1)
            return
        L1b:
            java.lang.String r0 = "other"
            if (r7 != r0) goto L21
            return
        L21:
            int r0 = r7.hashCode()
            r1 = -1
            switch(r0) {
                case -907680051: goto L4a;
                case 775779035: goto L3f;
                case 1340673488: goto L34;
                case 1842531918: goto L2a;
                default: goto L29;
            }
        L29:
            goto L55
        L2a:
            java.lang.String r0 = "netWork"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L55
            goto L56
        L34:
            java.lang.String r0 = "refreshCardView"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L55
            r2 = 1
            goto L56
        L3f:
            java.lang.String r0 = "fatigueReport"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L55
            r2 = 3
            goto L56
        L4a:
            java.lang.String r0 = "scroll"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L55
            r2 = 2
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L72
            if (r2 == r5) goto L67
            if (r2 == r4) goto L63
            if (r2 == r3) goto L5f
            goto L62
        L5f:
            r6.b(r8)
        L62:
            return
        L63:
            r6.a(r8)
            return
        L67:
            java.lang.String r7 = "sectionBizCode"
            java.lang.String r7 = r9.getString(r7)
            r6.a(r7)
            return
        L72:
            if (r9 == 0) goto L81
            java.lang.String r0 = "messageId"
            boolean r2 = r9.containsKey(r0)
            if (r2 == 0) goto L81
            java.lang.String r7 = r9.getString(r0)
        L81:
            r6.a(r1, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kzy.onMessage(java.lang.String, com.taobao.homepage.pop.protocol.model.pop.IPopData, com.alibaba.fastjson.JSONObject):void");
    }
}
