package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class UTAnalyticsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_SHARE = "Page_Share";
    public static final int PAGE_SHARE_EVENT_ID = 19999;

    static {
        kge.a(113271528);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r5.equals(org.android.agoo.common.AgooConstants.ACK_PACK_NOBIND) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getContactClickEventName(com.taobao.tao.friends.model.a r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.util.UTAnalyticsHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "7a64c8e4"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            com.taobao.tao.friends.model.SourceType r0 = r5.j()
            com.taobao.tao.friends.model.SourceType r1 = com.taobao.tao.friends.model.SourceType.RECOMMEND
            if (r0 != r1) goto L20
            java.lang.String r5 = "Page_Share_Contact_Recommend-Share-Click"
            return r5
        L20:
            com.taobao.tao.friends.model.b r5 = r5.i()
            com.taobao.tao.friends.model.ContactType r0 = r5.c
            com.taobao.tao.friends.model.ContactType r1 = com.taobao.tao.friends.model.ContactType.MORE_CONTACT
            if (r0 != r1) goto L2d
            java.lang.String r5 = "Page_Contacts_Button-IntoList"
            return r5
        L2d:
            java.lang.String r5 = r5.d
            r0 = -1
            int r1 = r5.hashCode()
            r4 = 48
            if (r1 == r4) goto L8a
            r3 = 1571(0x623, float:2.201E-42)
            if (r1 == r3) goto L81
            r2 = 46730169(0x2c90bb9, float:2.9541024E-37)
            if (r1 == r2) goto L77
            switch(r1) {
                case 46730162: goto L6d;
                case 46730163: goto L63;
                case 46730164: goto L59;
                case 46730165: goto L4f;
                case 46730166: goto L45;
                default: goto L44;
            }
        L44:
            goto L94
        L45:
            java.lang.String r1 = "10005"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            r2 = 6
            goto L95
        L4f:
            java.lang.String r1 = "10004"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            r2 = 5
            goto L95
        L59:
            java.lang.String r1 = "10003"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            r2 = 4
            goto L95
        L63:
            java.lang.String r1 = "10002"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            r2 = 3
            goto L95
        L6d:
            java.lang.String r1 = "10001"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            r2 = 2
            goto L95
        L77:
            java.lang.String r1 = "10008"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            r2 = 7
            goto L95
        L81:
            java.lang.String r1 = "14"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            goto L95
        L8a:
            java.lang.String r1 = "0"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L94
            r2 = 1
            goto L95
        L94:
            r2 = -1
        L95:
            switch(r2) {
                case 0: goto La3;
                case 1: goto La0;
                case 2: goto L9d;
                case 3: goto L9d;
                case 4: goto L9a;
                case 5: goto L9a;
                case 6: goto L9a;
                case 7: goto L9a;
                default: goto L98;
            }
        L98:
            r5 = 0
            return r5
        L9a:
            java.lang.String r5 = "Page_Share_Contact_Temporary-Click"
            return r5
        L9d:
            java.lang.String r5 = "Page_Share_Contact_Friends-Click"
            return r5
        La0:
            java.lang.String r5 = "Page_Share_Contact_Group-Click"
            return r5
        La3:
            java.lang.String r5 = "Page_Share_Contact_Team-Click"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.UTAnalyticsHelper.getContactClickEventName(com.taobao.tao.friends.model.a):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
        if (r5.equals(org.android.agoo.common.AgooConstants.ACK_PACK_NOBIND) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getContactShowEventName(com.taobao.tao.friends.model.a r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.util.UTAnalyticsHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "5ac3d16d"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            com.taobao.tao.friends.model.SourceType r0 = r5.j()
            com.taobao.tao.friends.model.SourceType r1 = com.taobao.tao.friends.model.SourceType.RECOMMEND
            if (r0 != r1) goto L20
            java.lang.String r5 = "Page_Share_Contact_Recommend-Share-Show"
            return r5
        L20:
            com.taobao.tao.friends.model.b r5 = r5.i()
            com.taobao.tao.friends.model.ContactType r0 = r5.c
            com.taobao.tao.friends.model.ContactType r1 = com.taobao.tao.friends.model.ContactType.MORE_CONTACT
            if (r0 != r1) goto L2d
            java.lang.String r5 = "Page_Share_Contact_More-Show"
            return r5
        L2d:
            java.lang.String r0 = r5.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L38
            java.lang.String r5 = "Page_Share_Contact_NullBizSubType"
            return r5
        L38:
            java.lang.String r5 = r5.d
            r0 = -1
            int r1 = r5.hashCode()
            r4 = 48
            if (r1 == r4) goto L95
            r3 = 1571(0x623, float:2.201E-42)
            if (r1 == r3) goto L8c
            r2 = 46730169(0x2c90bb9, float:2.9541024E-37)
            if (r1 == r2) goto L82
            switch(r1) {
                case 46730162: goto L78;
                case 46730163: goto L6e;
                case 46730164: goto L64;
                case 46730165: goto L5a;
                case 46730166: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L9f
        L50:
            java.lang.String r1 = "10005"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            r2 = 6
            goto La0
        L5a:
            java.lang.String r1 = "10004"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            r2 = 5
            goto La0
        L64:
            java.lang.String r1 = "10003"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            r2 = 4
            goto La0
        L6e:
            java.lang.String r1 = "10002"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            r2 = 3
            goto La0
        L78:
            java.lang.String r1 = "10001"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            r2 = 2
            goto La0
        L82:
            java.lang.String r1 = "10008"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            r2 = 7
            goto La0
        L8c:
            java.lang.String r1 = "14"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            goto La0
        L95:
            java.lang.String r1 = "0"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L9f
            r2 = 1
            goto La0
        L9f:
            r2 = -1
        La0:
            switch(r2) {
                case 0: goto Lae;
                case 1: goto Lab;
                case 2: goto La8;
                case 3: goto La8;
                case 4: goto La5;
                case 5: goto La5;
                case 6: goto La5;
                case 7: goto La5;
                default: goto La3;
            }
        La3:
            r5 = 0
            return r5
        La5:
            java.lang.String r5 = "Page_Share_Contact_Temporary-Show"
            return r5
        La8:
            java.lang.String r5 = "Page_Share_Contact_Friends-Show"
            return r5
        Lab:
            java.lang.String r5 = "Page_Share_Contact_Group-Show"
            return r5
        Lae:
            java.lang.String r5 = "Page_Share_Contact_Team-Show"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.UTAnalyticsHelper.getContactShowEventName(com.taobao.tao.friends.model.a):java.lang.String");
    }
}
