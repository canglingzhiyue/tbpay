package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fee implements eow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-912063795);
        kge.a(405199445);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.datasdk.model.viewmodel.main.b, tb.epi] */
    @Override // tb.eov
    public /* synthetic */ epi b(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("be501f9", new Object[]{this, iDMComponent, bVar}) : a(iDMComponent, bVar);
    }

    public fee() {
        emu.a("com.taobao.android.detail.wrapper.ext.factory.ultron.TBWidgetUltronViewModelFactory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r1.equals("bottom_bar_fav") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epi a(com.taobao.android.ultron.common.model.IDMComponent r9, com.taobao.android.detail.datasdk.model.datamodel.node.b r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fee.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r1[r4] = r9
            r1[r3] = r10
            java.lang.String r9 = "1cc01ce2"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            tb.epi r9 = (tb.epi) r9
            return r9
        L1b:
            r0 = 0
            if (r9 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r1 = tb.eoy.a(r9)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L2a
            return r0
        L2a:
            r5 = -1
            int r6 = r1.hashCode()
            r7 = 261060933(0xf8f7945, float:1.41476E-29)
            if (r6 == r7) goto L52
            r7 = 606371237(0x24247da5, float:3.5668256E-17)
            if (r6 == r7) goto L48
            r7 = 1534974683(0x5b7ddadb, float:7.1453803E16)
            if (r6 == r7) goto L3f
            goto L5c
        L3f:
            java.lang.String r6 = "bottom_bar_fav"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L5c
            goto L5d
        L48:
            java.lang.String r2 = "bottom_bar_sm_cart"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
            r2 = 2
            goto L5d
        L52:
            java.lang.String r2 = "bottom_bar_remind"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
            r2 = 1
            goto L5d
        L5c:
            r2 = -1
        L5d:
            if (r2 == 0) goto L70
            if (r2 == r4) goto L6a
            if (r2 == r3) goto L64
            return r0
        L64:
            tb.fah r0 = new tb.fah
            r0.<init>(r9, r10)
            return r0
        L6a:
            tb.fag r0 = new tb.fag
            r0.<init>(r9, r10)
            return r0
        L70:
            tb.faf r0 = new tb.faf
            r0.<init>(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fee.a(com.taobao.android.ultron.common.model.IDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epi");
    }
}
