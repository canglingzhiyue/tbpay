package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fdv implements eos {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUESS_YOU_LIKE = "guessYouLike";

    static {
        kge.a(-1435432717);
        kge.a(-498406012);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.datasdk.model.viewmodel.main.b, tb.epe] */
    @Override // tb.eov
    public /* synthetic */ epe b(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("be501f9", new Object[]{this, iDMComponent, bVar}) : a(iDMComponent, bVar);
    }

    public fdv() {
        emu.a("com.taobao.android.detail.wrapper.ext.factory.TBContainerUltronViewModelFactory");
    }

    public epe a(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return (epe) ipChange.ipc$dispatch("1cc01c66", new Object[]{this, iDMComponent, bVar});
        }
        if (iDMComponent == null || bVar == null || iDMComponent.getFields() == null) {
            return null;
        }
        String string = iDMComponent.getFields().getString("type");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        if (string.hashCode() != -219723137 || !string.equals("guessYouLike")) {
            c = 65535;
        }
        if (c == 0) {
            return new egx(iDMComponent, bVar);
        }
        return null;
    }
}
