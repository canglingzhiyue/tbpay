package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;

/* loaded from: classes2.dex */
public final class ixm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1564018202);
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue() : (iDMComponent instanceof DMComponent) && ((DMComponent) iDMComponent).getDeltaOpType() != null;
    }
}
