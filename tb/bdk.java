package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.trade.presenter.b;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdk extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ISSHOWCALCULATEBTN = -1361341155730694591L;

    static {
        kge.a(-229505267);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        bbz bbzVar = (bbz) ((Map) dXRuntimeContext.a()).get(b.DINAMIC_CONTEXT_KEY_PRESENTER);
        DMComponent dMComponent = (DMComponent) ((Map) dXRuntimeContext.a()).get(d.TAG_DINAMICX_VIEW_COMPONENT);
        try {
            JSONObject jSONObject = (JSONObject) bei.a((IDMComponent) dMComponent, (Class<Object>) JSONObject.class, "pay");
            boolean z = dMComponent.getFields() != null && dMComponent.getFields().getBooleanValue("isHideCalculateBtn");
            String str = null;
            String string = jSONObject != null ? jSONObject.getString("detailInfoText") : null;
            JSONObject otherParams = bbzVar.n().m().getFeature().getOtherParams();
            if (otherParams != null) {
                str = otherParams.getString("calculatorTips");
            }
            Long l = (Long) bei.a((IDMComponent) dMComponent, (Class<Object>) Long.class, "quantity");
            if ((!StringUtils.isEmpty(str) || !StringUtils.isEmpty(string)) && l.longValue() > 0 && !z) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
