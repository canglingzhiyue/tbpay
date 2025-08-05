package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.homepage.busniess.model.DeliverListResponse;
import com.taobao.mytaobao.ultron.model.OrderCountRequest;
import com.taobao.mytaobao.ultron.model.OrderCountResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.utils.Global;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes7.dex */
public class muf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1250770042);
    }

    public static void a(IRemoteListener iRemoteListener, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670f6086", new Object[]{iRemoteListener, map});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.delivery.list.get");
        mtopRequest.setVersion("3.1");
        try {
            mtopRequest.setData(JSONObject.toJSONString(map));
        } catch (Exception unused) {
        }
        RemoteBusiness mo1340setBizId = RemoteBusiness.build(mtopRequest, TaoHelper.getTTID()).registeListener(iRemoteListener).mo1340setBizId(99);
        mo1340setBizId.mo1341setErrorNotifyAfterCache(false);
        mo1340setBizId.mo1328setUnitStrategy("UNIT_TRADE");
        mo1340setBizId.startRequest(DeliverListResponse.class);
    }

    public static void a(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{iRemoteBaseListener});
            return;
        }
        OrderCountRequest orderCountRequest = new OrderCountRequest();
        orderCountRequest.tabCodes = OrderCountRequest.fillAllTabCodes();
        MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Global.getApplication(), TaoHelper.getTTID()), orderCountRequest, TaoHelper.getTTID()).mo1340setBizId(99).registerListener((IRemoteListener) iRemoteBaseListener).mo1341setErrorNotifyAfterCache(false).mo1328setUnitStrategy("UNIT_TRADE").startRequest(OrderCountResponse.class);
    }
}
