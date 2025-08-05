package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagRequest;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagResponse;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes9.dex */
public class rkm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(692589484);
    }

    public void a(MtopTradeAddBagRequest mtopTradeAddBagRequest, IRemoteBaseListener iRemoteBaseListener, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3a06a0", new Object[]{this, mtopTradeAddBagRequest, iRemoteBaseListener, context, str, new Integer(i)});
        } else {
            a((IMTOPDataObject) mtopTradeAddBagRequest, iRemoteBaseListener, context, str, i).startRequest(MtopTradeAddBagResponse.class);
        }
    }

    private MtopBusiness a(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("74a769ed", new Object[]{this, iMTOPDataObject, iRemoteBaseListener, context, str, new Integer(i)}) : b(iMTOPDataObject, iRemoteBaseListener, context, str, i).mo1305reqMethod(MethodEnum.POST).mo1328setUnitStrategy("UNIT_TRADE");
    }

    private MtopBusiness b(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("82bb144c", new Object[]{this, iMTOPDataObject, iRemoteBaseListener, context, str, new Integer(i)}) : MtopBusiness.build(Mtop.instance(context), iMTOPDataObject, str).registerListener((IRemoteListener) iRemoteBaseListener).mo1339retryTime(1).mo1340setBizId(i).mo1328setUnitStrategy("UNIT_TRADE");
    }
}
