package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes2.dex */
public class boq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1882855157);
    }

    public boolean a(bny bnyVar, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75a50d00", new Object[]{this, bnyVar, list})).booleanValue();
        }
        return false;
    }

    public boolean a(bny bnyVar, List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7035fbdc", new Object[]{this, bnyVar, list, iDMComponent})).booleanValue();
        }
        return false;
    }

    public boolean b(bny bnyVar, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ef4f181", new Object[]{this, bnyVar, list})).booleanValue();
        }
        return false;
    }
}
