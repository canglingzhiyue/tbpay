package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;

/* loaded from: classes7.dex */
public class lhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-255884328);
    }

    public static boolean a(IContainerDataModel iContainerDataModel) {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
            return base.isAbandoned();
        }
        return true;
    }
}
