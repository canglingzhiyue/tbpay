package tb;

import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;

/* loaded from: classes2.dex */
public class bcz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTCHECKKEEPBUBBLESHOW = 2462128161505069073L;

    static {
        kge.a(1834482662);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        DMComponent dMComponent = (DMComponent) ((Map) dXRuntimeContext.a()).get(d.TAG_DINAMICX_VIEW_COMPONENT);
        if (dMComponent != null && (fields = dMComponent.getFields()) != null && fields.getBooleanValue("showCheckKeepBubble")) {
            return Boolean.valueOf(!bef.c(dXRuntimeContext.m()));
        }
        return false;
    }
}
