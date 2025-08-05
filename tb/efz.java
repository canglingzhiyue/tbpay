package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes4.dex */
public class efz implements eol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1189523038);
        kge.a(2054727245);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.datasdk.model.viewmodel.main.b, tb.epe] */
    @Override // tb.eop
    public /* synthetic */ epe b(ComponentModel componentModel, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("a3661b0d", new Object[]{this, componentModel, bVar}) : a(componentModel, bVar);
    }

    public efz() {
        emu.a("com.taobao.android.detail.core.factory.impl.ContainerViewModelFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r1.equals("detailNaviTabs") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.epe a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r9, com.taobao.android.detail.datasdk.model.datamodel.node.b r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.efz.a(com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b):tb.epe");
    }
}
