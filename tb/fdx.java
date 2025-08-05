package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.u;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fdx implements eom, eou {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(217579135);
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

    public fdx() {
        emu.a("com.taobao.android.detail.wrapper.ext.factory.TBDescViewModelFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r0.equals("desc_user_talk") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epf a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r8, com.taobao.android.detail.datasdk.model.datamodel.node.b r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fdx.a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epf");
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

    public epf a(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return (epf) ipChange.ipc$dispatch("1cc01c85", new Object[]{this, iDMComponent, bVar});
        }
        if (iDMComponent == null) {
            return null;
        }
        String a2 = eoy.a(iDMComponent);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        if (a2.hashCode() != -198916691 || !a2.equals("desc_weex_component")) {
            c = 65535;
        }
        if (c == 0) {
            return new fbj(iDMComponent, bVar);
        }
        return null;
    }
}
