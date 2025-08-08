package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fec implements eoq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-971245006);
        kge.a(-1930527164);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.datasdk.model.viewmodel.main.b, tb.epi] */
    @Override // tb.eop
    public /* synthetic */ epi b(ComponentModel componentModel, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("a3661b0d", new Object[]{this, componentModel, bVar}) : a(componentModel, bVar);
    }

    public fec() {
        emu.a("com.taobao.android.detail.wrapper.ext.factory.TBWidgetViewModelFactory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1.equals("bottom_bar_fav") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epi a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r9, com.taobao.android.detail.datasdk.model.datamodel.node.b r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fec.$ipChange
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
            java.lang.String r9 = "e466d9b6"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            tb.epi r9 = (tb.epi) r9
            return r9
        L1b:
            r0 = 0
            if (r9 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r1 = r9.key
            boolean r5 = android.text.StringUtils.isEmpty(r1)
            if (r5 == 0) goto L28
            return r0
        L28:
            r5 = -1
            int r6 = r1.hashCode()
            r7 = 261060933(0xf8f7945, float:1.41476E-29)
            if (r6 == r7) goto L50
            r7 = 606371237(0x24247da5, float:3.5668256E-17)
            if (r6 == r7) goto L46
            r7 = 1534974683(0x5b7ddadb, float:7.1453803E16)
            if (r6 == r7) goto L3d
            goto L5a
        L3d:
            java.lang.String r6 = "bottom_bar_fav"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L5a
            goto L5b
        L46:
            java.lang.String r2 = "bottom_bar_sm_cart"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r2 = 2
            goto L5b
        L50:
            java.lang.String r2 = "bottom_bar_remind"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r2 = 1
            goto L5b
        L5a:
            r2 = -1
        L5b:
            if (r2 == 0) goto L6e
            if (r2 == r4) goto L68
            if (r2 == r3) goto L62
            return r0
        L62:
            tb.fah r0 = new tb.fah
            r0.<init>(r9, r10)
            return r0
        L68:
            tb.fag r0 = new tb.fag
            r0.<init>(r9, r10)
            return r0
        L6e:
            tb.faf r0 = new tb.faf
            r0.<init>(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fec.a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epi");
    }
}
