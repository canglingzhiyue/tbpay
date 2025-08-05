package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class egj implements eow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(918241180);
        kge.a(405199445);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.datasdk.model.viewmodel.main.b, tb.epi] */
    @Override // tb.eov
    public /* synthetic */ epi b(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("be501f9", new Object[]{this, iDMComponent, bVar}) : a(iDMComponent, bVar);
    }

    public egj() {
        emu.a("com.taobao.android.detail.core.factory.ultron.impl.WidgetUltronViewModelFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
        if (r1.equals("bottom_bar_presale") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epi a(com.taobao.android.ultron.common.model.IDMComponent r11, com.taobao.android.detail.datasdk.model.datamodel.node.b r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.egj.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 3
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r2] = r10
            r1[r4] = r11
            r1[r3] = r12
            java.lang.String r11 = "1cc01ce2"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            tb.epi r11 = (tb.epi) r11
            return r11
        L1b:
            r0 = 0
            if (r11 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r1 = tb.eoy.a(r11)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L2a
            return r0
        L2a:
            r6 = -1
            int r7 = r1.hashCode()
            r8 = 5
            r9 = 4
            switch(r7) {
                case -1906976470: goto L67;
                case -1589392973: goto L5d;
                case -963205637: goto L53;
                case -892365596: goto L49;
                case 339666105: goto L3f;
                case 745672716: goto L35;
                default: goto L34;
            }
        L34:
            goto L70
        L35:
            java.lang.String r2 = "navi_item"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70
            r2 = 4
            goto L71
        L3f:
            java.lang.String r2 = "bottom_bar_icon"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70
            r2 = 3
            goto L71
        L49:
            java.lang.String r2 = "sys_button"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70
            r2 = 2
            goto L71
        L53:
            java.lang.String r2 = "shop_info_item"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70
            r2 = 5
            goto L71
        L5d:
            java.lang.String r2 = "bottom_bar_timing_shelves"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70
            r2 = 1
            goto L71
        L67:
            java.lang.String r7 = "bottom_bar_presale"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L70
            goto L71
        L70:
            r2 = -1
        L71:
            if (r2 == 0) goto L9c
            if (r2 == r4) goto L96
            if (r2 == r3) goto L90
            if (r2 == r5) goto L8a
            if (r2 == r9) goto L84
            if (r2 == r8) goto L7e
            return r0
        L7e:
            com.taobao.android.detail.core.model.viewmodel.main.f r0 = new com.taobao.android.detail.core.model.viewmodel.main.f
            r0.<init>(r11, r12)
            return r0
        L84:
            tb.egp r0 = new tb.egp
            r0.<init>(r11, r12)
            return r0
        L8a:
            tb.egr r0 = new tb.egr
            r0.<init>(r11, r12)
            return r0
        L90:
            com.taobao.android.detail.core.model.viewmodel.main.g r0 = new com.taobao.android.detail.core.model.viewmodel.main.g
            r0.<init>(r11, r12)
            return r0
        L96:
            tb.egu r0 = new tb.egu
            r0.<init>(r11, r12)
            return r0
        L9c:
            tb.egs r0 = new tb.egs
            r0.<init>(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.egj.a(com.taobao.android.ultron.common.model.IDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epi");
    }
}
