package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HMultiSelectView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class tgz extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HMODIFYCLICKPARAM = 2742664046862533560L;

    static {
        kge.a(-1417305610);
    }

    public static /* synthetic */ Object ipc$super(tgz tgzVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length == 0) {
        } else {
            BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
            if (!(objArr[0] instanceof JSONObject) || b == null || (jSONObject = ((JSONObject) objArr[0]).getJSONObject("clickParam")) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null) {
                return;
            }
            String a2 = lfq.a(b, HMultiSelectView.KEY_MULTI_SELECT_TEXT);
            if (StringUtils.isEmpty(a2) || (split = a2.split(",")) == null || split.length == 0) {
                return;
            }
            jSONObject2.put("reason", (Object) Arrays.asList(split).toString());
        }
    }
}
