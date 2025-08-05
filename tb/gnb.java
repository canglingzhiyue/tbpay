package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* loaded from: classes5.dex */
public class gnb extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CARTWRITEBACK = 7001061658296939571L;

    static {
        kge.a(1273969792);
    }

    public static /* synthetic */ Object ipc$super(gnb gnbVar, String str, Object... objArr) {
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
        IDMComponent b;
        JSONObject fields;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length != 0 && (b = bdn.b(dXRuntimeContext)) != null && (fields = b.getFields()) != null) {
            JSONObject jSONObject = null;
            if (objArr.length > 1) {
                String valueOf = String.valueOf(objArr[1]);
                if (valueOf.contains(".")) {
                    obj = fields;
                    for (String str : valueOf.split("\\.")) {
                        obj = a(str, obj);
                    }
                } else {
                    obj = fields.get(valueOf);
                }
                if (objArr.length > 2 && obj != null) {
                    Integer valueOf2 = Integer.valueOf(Integer.parseInt(String.valueOf(objArr[2])));
                    if (obj instanceof JSONArray) {
                        jSONObject = ((JSONArray) obj).getJSONObject(valueOf2.intValue());
                    }
                }
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof JSONObject)) {
                return;
            }
            if (jSONObject != null) {
                jSONObject.putAll((Map) obj2);
            } else {
                fields.putAll((Map) obj2);
            }
        }
    }

    private Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (obj != null && (obj instanceof JSONObject)) {
            return ((JSONObject) obj).get(str);
        }
        return null;
    }
}
