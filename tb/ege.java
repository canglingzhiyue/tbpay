package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes4.dex */
public class ege implements eoq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-677078257);
        kge.a(-1930527164);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.datasdk.model.viewmodel.main.b, tb.epi] */
    @Override // tb.eop
    public /* synthetic */ epi b(ComponentModel componentModel, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("a3661b0d", new Object[]{this, componentModel, bVar}) : a(componentModel, bVar);
    }

    public ege() {
        emu.a("com.taobao.android.detail.core.factory.impl.WidgetViewModelFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r1.equals("bottom_bar_presale") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epi a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r11, com.taobao.android.detail.datasdk.model.datamodel.node.b r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ege.$ipChange
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
            java.lang.String r11 = "e466d9b6"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            tb.epi r11 = (tb.epi) r11
            return r11
        L1b:
            r0 = 0
            if (r11 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r1 = r11.key
            boolean r6 = android.text.StringUtils.isEmpty(r1)
            if (r6 == 0) goto L28
            return r0
        L28:
            r6 = -1
            int r7 = r1.hashCode()
            r8 = 5
            r9 = 4
            switch(r7) {
                case -1906976470: goto L65;
                case -1589392973: goto L5b;
                case -963205637: goto L51;
                case -892365596: goto L47;
                case 339666105: goto L3d;
                case 745672716: goto L33;
                default: goto L32;
            }
        L32:
            goto L6e
        L33:
            java.lang.String r2 = "navi_item"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            r2 = 4
            goto L6f
        L3d:
            java.lang.String r2 = "bottom_bar_icon"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            r2 = 3
            goto L6f
        L47:
            java.lang.String r2 = "sys_button"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            r2 = 2
            goto L6f
        L51:
            java.lang.String r2 = "shop_info_item"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            r2 = 5
            goto L6f
        L5b:
            java.lang.String r2 = "bottom_bar_timing_shelves"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            r2 = 1
            goto L6f
        L65:
            java.lang.String r7 = "bottom_bar_presale"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L6e
            goto L6f
        L6e:
            r2 = -1
        L6f:
            if (r2 == 0) goto L9a
            if (r2 == r4) goto L94
            if (r2 == r3) goto L8e
            if (r2 == r5) goto L88
            if (r2 == r9) goto L82
            if (r2 == r8) goto L7c
            return r0
        L7c:
            com.taobao.android.detail.core.model.viewmodel.main.f r0 = new com.taobao.android.detail.core.model.viewmodel.main.f
            r0.<init>(r11, r12)
            return r0
        L82:
            tb.egp r0 = new tb.egp
            r0.<init>(r11, r12)
            return r0
        L88:
            tb.egr r0 = new tb.egr
            r0.<init>(r11, r12)
            return r0
        L8e:
            com.taobao.android.detail.core.model.viewmodel.main.g r0 = new com.taobao.android.detail.core.model.viewmodel.main.g
            r0.<init>(r11, r12)
            return r0
        L94:
            tb.egu r0 = new tb.egu
            r0.<init>(r11, r12)
            return r0
        L9a:
            tb.egs r0 = new tb.egs
            r0.<init>(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ege.a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epi");
    }
}
