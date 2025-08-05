package tb;

import com.alibaba.android.ultron.trade.presenter.c;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bed;

/* loaded from: classes2.dex */
public class bdm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EVENT_DATA_RESPONSE = "mtopResponse";
    public static final String KEY_EVENT_DOWNGRADE_TYPE = "downgradeType";
    public static final String TYPE_OLD_CART_DOWNGRADE = "oldCartDowngrade";
    public static final String TYPE_PROTOCOL_DOWNGRADE = "protocolDowngrade";
    public static final String TYPE_RENDER_ERROR_DOWNGRADE = "renderErrorDowngrade";

    /* renamed from: a  reason: collision with root package name */
    private float f25816a = 3.0f;

    static {
        kge.a(493108219);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            float parseFloat = Float.parseFloat(str);
            bdx.a("CartDowngradeManager", "downgrade", "needDowngrade", parseFloat + "");
            return parseFloat < this.f25816a;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void a(c cVar, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6761cf", new Object[]{this, cVar, mtopResponse, str});
        } else if (cVar == null) {
        } else {
            bmz a2 = cVar.F().a();
            a2.a("mtopResponse", mtopResponse);
            a2.a("downgradeType", str);
            a2.a("downgrade");
            cVar.F().a(a2);
            b(str);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae440380", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            bmz a2 = cVar.F().a();
            a2.a("undowngrade");
            cVar.F().a(a2);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (TYPE_OLD_CART_DOWNGRADE.equals(str)) {
            bed.a(bed.a.b("DegradeH5").a("非iCart降级").a(1).a(1.0f));
        } else {
            bed.a(bed.a.b("DegradeH5").a("老奥创协议降级").a(2).a(1.0f));
        }
        bed.a(bed.a.b("DegradeH5").a("购物车降级H5").b(true).a(1.0f));
    }
}
