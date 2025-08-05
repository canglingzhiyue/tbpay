package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;

/* loaded from: classes3.dex */
public class cjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-510488098);
    }

    public FactorNextResponse a(FactorNextRequest factorNextRequest, HummerGWFacade hummerGWFacade) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FactorNextResponse) ipChange.ipc$dispatch("1ee95f83", new Object[]{this, factorNextRequest, hummerGWFacade}) : hummerGWFacade.forward(factorNextRequest);
    }
}
