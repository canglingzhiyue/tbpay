package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.good.a;
import tb.hhu;

/* loaded from: classes5.dex */
public class hhq implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1599215818);
        kge.a(-2111475067);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hgz.DX_PARSER_JSONARRAYSTR2TEXTBYKEY, new hgz());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2379a", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hha.DX_PARSER_TBLIVE_GETSERVERTIME, new hha());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366bd19b", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hgy.DX_PARSER_CALLFUN, new hgy());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f56b9c", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hhi.DX_EVENT_TBLIVE_ADDTOCART, new hhi());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void e(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357f059d", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hhf.DX_EVENT_TBLIVEGOTODETAIL, new hhf());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void h(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341bd3a0", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hhn.DX_EVENT_TBLIVEGOODCASEGOTODETAIL, new hhn());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void i(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a56da1", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hhg.DX_EVENT_TBLIVEROOMACTION, new hhg());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void j(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332f07a2", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hhh.DX_EVENT_TBLIVESENDDYNAMICMESSAGE, new hhh());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void k(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b8a1a3", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hhk.DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD, new hhk());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.a
    public void l(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32423ba4", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.a(hhu.DXTBLTIMER_TBLTIMER, new hhu.a());
        }
    }
}
