package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.ContractSelectedRet;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.model.datamodel.node.ContractNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fdg implements j<enx> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27825a;
    private Map<String, ContractSelectedRet> b = new Hashtable();

    static {
        kge.a(-1918475996);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(fdg fdgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("3653a71a", new Object[]{fdgVar}) : fdgVar.f27825a;
    }

    public static /* synthetic */ Map b(fdg fdgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("407dcb85", new Object[]{fdgVar}) : fdgVar.b;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(enx enxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enxVar}) : a(enxVar);
    }

    public fdg(DetailCoreActivity detailCoreActivity) {
        this.f27825a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.contract.OpenContractSubscriber");
    }

    public i a(enx enxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("6bc206c6", new Object[]{this, enxVar});
        }
        if (1 != enxVar.a()) {
            return a.SUCCESS;
        }
        dya y = this.f27825a.y();
        if (y == null) {
            return a.SUCCESS;
        }
        c cVar = y.t;
        if (cVar == null || cVar.f10055a == null) {
            return a.SUCCESS;
        }
        b bVar = cVar.f10055a;
        if (eqb.t(bVar) == null) {
            return a.SUCCESS;
        }
        List<ContractNode> list = eqb.t(bVar).contractNode;
        if (list == null || list.isEmpty()) {
            return a();
        }
        ContractNode contractNode = null;
        String str = enxVar.f27482a instanceof String ? (String) enxVar.f27482a : null;
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        for (ContractNode contractNode2 : list) {
            if (str.equals(contractNode2.version.versionCode)) {
                contractNode = contractNode2;
            }
        }
        if (contractNode == null) {
            return a();
        }
        dwd.b(this.f27825a, new com.taobao.android.detail.alicom.widget.a() { // from class: tb.fdg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.alicom.widget.a
            public void a(ContractSelectedRet contractSelectedRet) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d209380a", new Object[]{this, contractSelectedRet});
                } else if (fdg.a(fdg.this) == null || fdg.a(fdg.this).isFinishing()) {
                } else {
                    fdg.b(fdg.this).put(contractSelectedRet.versionCode, contractSelectedRet);
                    SkuPageModel h = fdg.a(fdg.this).y().h();
                    if (h == null) {
                        return;
                    }
                    h.setExtComponentComplete(contractSelectedRet.isSelectedComplete);
                    h.updateExtComponentParams(contractSelectedRet.selectedRetMap);
                    h.updateExtComponentCaption(eqh.a(contractSelectedRet.cityName, contractSelectedRet.planName, contractSelectedRet.phoneNumber));
                }
            }
        }, a(contractNode), cVar.i(), y.h().getSkuId(), this.b.get(str));
        return a.SUCCESS;
    }

    private com.taobao.android.detail.sdk.model.node.ContractNode a(ContractNode contractNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.sdk.model.node.ContractNode) ipChange.ipc$dispatch("6c565d4e", new Object[]{this, contractNode}) : new com.taobao.android.detail.sdk.model.node.ContractNode(contractNode.getData());
    }

    private i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("1cc17dc7", new Object[]{this});
        }
        epo.a("数据异常");
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
