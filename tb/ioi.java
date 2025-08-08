package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.event.a;

/* loaded from: classes4.dex */
public class ioi extends iog implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_ADDTOCART = "addToCart";
    public static final String EVENT_BUY_NOW = "buyNow";
    public static final String EVENT_OPENFLOATDIALOG = "openFloatDialog";
    public static final String EVENT_OPENSKU = "openSKU";
    public static final String TAG = "CommonImplementor";

    static {
        kge.a(1980017845);
        kge.a(1967244270);
    }

    public ioi(q qVar) {
        super(qVar);
        emu.a("com.taobao.android.detail.core.standard.mainscreen.implementor.CommonImplementor");
    }

    @Override // tb.ezm
    public boolean a(a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        String a2 = aVar.a();
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        d dVar = new d();
        Object[] b = b(runtimeAbilityParamArr);
        if (b != null) {
            dVar.a(b);
        }
        dVar.a(new AURARenderComponent());
        dVar.a(aVar.b());
        c.a(a().b(), a2, dVar);
        return true;
    }
}
