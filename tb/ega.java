package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.u;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class ega implements eom, eou {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1963117924);
        kge.a(207642385);
        kge.a(1006789066);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.datasdk.model.viewmodel.main.b, tb.epf] */
    @Override // tb.eop
    public /* synthetic */ epf b(ComponentModel componentModel, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("a3661b0d", new Object[]{this, componentModel, bVar}) : a(componentModel, bVar);
    }

    @Override // tb.eov
    public /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b b(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("be501f9", new Object[]{this, iDMComponent, bVar}) : a(iDMComponent, bVar);
    }

    public ega() {
        emu.a("com.taobao.android.detail.core.factory.impl.DescViewModelFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r0.equals("desc_single_image") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epf a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r8, com.taobao.android.detail.datasdk.model.datamodel.node.b r9) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ega.a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epf");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r1.equals("desc_single_image") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epf a(com.taobao.android.ultron.common.model.IDMComponent r9, com.taobao.android.detail.datasdk.model.datamodel.node.b r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ega.$ipChange
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
            java.lang.String r9 = "1cc01c85"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            tb.epf r9 = (tb.epf) r9
            return r9
        L1b:
            r0 = 0
            if (r9 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r1 = tb.eoy.a(r9)
            boolean r5 = android.text.StringUtils.isEmpty(r1)
            if (r5 == 0) goto L2a
            return r0
        L2a:
            r5 = -1
            int r6 = r1.hashCode()
            r7 = -2089442515(0xffffffff8375a32d, float:-7.2186346E-37)
            if (r6 == r7) goto L52
            r7 = -824161250(0xffffffffcee04c1e, float:-1.8815424E9)
            if (r6 == r7) goto L48
            r7 = 964270482(0x39799992, float:2.38037E-4)
            if (r6 == r7) goto L3f
            goto L5c
        L3f:
            java.lang.String r6 = "desc_single_image"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L5c
            goto L5d
        L48:
            java.lang.String r2 = "desc_pic_jumper"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
            r2 = 1
            goto L5d
        L52:
            java.lang.String r2 = "desc_hot_area"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
            r2 = 2
            goto L5d
        L5c:
            r2 = -1
        L5d:
            if (r2 == 0) goto L70
            if (r2 == r4) goto L6a
            if (r2 == r3) goto L64
            return r0
        L64:
            com.taobao.android.detail.core.model.viewmodel.desc.c r0 = new com.taobao.android.detail.core.model.viewmodel.desc.c
            r0.<init>(r9, r10)
            return r0
        L6a:
            com.taobao.android.detail.core.model.viewmodel.desc.i r0 = new com.taobao.android.detail.core.model.viewmodel.desc.i
            r0.<init>(r9, r10)
            return r0
        L70:
            com.taobao.android.detail.core.model.viewmodel.desc.g r0 = new com.taobao.android.detail.core.model.viewmodel.desc.g
            r0.<init>(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ega.a(com.taobao.android.ultron.common.model.IDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epf");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        AliUserTrackerInterface a2 = u.a();
        if (a2 == null) {
            return;
        }
        a2.a("Page_Detail", 2201, "desc_model_create", null, null, "type=" + str);
    }
}
