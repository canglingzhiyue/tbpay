package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class egk extends eox {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(325822560);
    }

    public static /* synthetic */ Object ipc$super(egk egkVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -64139400) {
            if (hashCode != 15106615) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.a((eov) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        return super.a((IDMComponent) objArr[0], (b) objArr[1]);
    }

    public egk() {
        a(new egi(), 5);
        a(new egg(), 5);
        a(new egj(), 5);
        a(new ega(), 5);
        a(new egh(), 5);
        emu.a("com.taobao.android.detail.core.factory.ultron.manager.UltronViewModelFactoryManager");
    }

    @Override // tb.eox
    public void a(eov eovVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68237", new Object[]{this, eovVar, new Integer(i)});
        } else {
            super.a(eovVar, i);
        }
    }

    @Override // tb.eox
    public com.taobao.android.detail.datasdk.model.viewmodel.main.b a(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("fc2d4f78", new Object[]{this, iDMComponent, bVar}) : super.a(iDMComponent, bVar);
    }
}
