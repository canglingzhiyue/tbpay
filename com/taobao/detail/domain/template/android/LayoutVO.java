package com.taobao.detail.domain.template.android;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class LayoutVO extends ComponentVO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ComponentVO bottom;
    public ArrayList<ComponentVO> components;
    public ComponentVO header;
    public HashMap<String, String> replaceDataset;
    public String version;

    static {
        kge.a(-1354774792);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.detail.domain.template.android.ComponentVO getChild(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.detail.domain.template.android.LayoutVO.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "7184f547"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.taobao.detail.domain.template.android.ComponentVO r5 = (com.taobao.detail.domain.template.android.ComponentVO) r5
            return r5
        L18:
            r0 = 0
            if (r5 == 0) goto L51
            int r1 = r5.length()
            if (r1 == 0) goto L51
            java.util.ArrayList<com.taobao.detail.domain.template.android.ComponentVO> r1 = r4.children
            if (r1 == 0) goto L51
            java.util.ArrayList<com.taobao.detail.domain.template.android.ComponentVO> r1 = r4.children
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2e
            goto L51
        L2e:
            java.util.ArrayList<com.taobao.detail.domain.template.android.ComponentVO> r1 = r4.children
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            com.taobao.detail.domain.template.android.ComponentVO r2 = (com.taobao.detail.domain.template.android.ComponentVO) r2
            java.lang.String r3 = r2.key
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L50
            java.lang.String r3 = r2.ID
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L34
        L50:
            return r2
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.domain.template.android.LayoutVO.getChild(java.lang.String):com.taobao.detail.domain.template.android.ComponentVO");
    }
}
