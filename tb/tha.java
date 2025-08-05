package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes7.dex */
public class tha extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RSATISFYEXPOSE = -1656274909162066473L;

    static {
        kge.a(-1314416954);
    }

    public static /* synthetic */ Object ipc$super(tha thaVar, String str, Object... objArr) {
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length >= 2 && (jSONObject = (JSONObject) objArr[0]) != null && (jSONObject2 = jSONObject.getJSONObject(com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM)) != null) {
            final String string = jSONObject2.getString("arg1");
            String string2 = jSONObject2.getString("arg2");
            String string3 = jSONObject2.getString("arg3");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            if (string == null || a(dXRuntimeContext, string)) {
                return;
            }
            b(dXRuntimeContext, string);
            final String str = string2 == null ? "" : string2;
            final String str2 = string3 == null ? "" : string3;
            StringBuilder sb = new StringBuilder();
            for (String str3 : jSONObject3.keySet()) {
                Object obj = jSONObject3.get(str3);
                String obj2 = obj == null ? "" : obj.toString();
                sb.append(str3);
                sb.append("=");
                sb.append(obj2);
                sb.append(", ");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 2);
            }
            final String sb2 = sb.toString();
            ljd.a().d(new Runnable() { // from class: tb.tha.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ldl.a("Page_Home", 2201, string, str, str2, sb2);
                    }
                }
            });
        }
    }

    private boolean a(DXRuntimeContext dXRuntimeContext, String str) {
        BaseSectionModel<?> b;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d039b67", new Object[]{this, dXRuntimeContext, str})).booleanValue();
        }
        if (dXRuntimeContext != null && (b = lfq.b(dXRuntimeContext)) != null && (ext = b.getExt()) != null) {
            return TextUtils.equals("true", ext.getString(str));
        }
        return false;
    }

    private void b(DXRuntimeContext dXRuntimeContext, String str) {
        BaseSectionModel<?> b;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e552ae4", new Object[]{this, dXRuntimeContext, str});
        } else if (dXRuntimeContext == null || (b = lfq.b(dXRuntimeContext)) == null || (ext = b.getExt()) == null) {
        } else {
            ext.put(str, (Object) "true");
        }
    }
}
