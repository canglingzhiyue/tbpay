package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;

/* loaded from: classes.dex */
public class kuz extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HOPENPOP = 3191997407944393521L;
    public static final String TAG = "DXHOpenPopEventHandler";

    static {
        kge.a(-1487322459);
    }

    public static /* synthetic */ Object ipc$super(kuz kuzVar, String str, Object... objArr) {
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        laq b = laq.a().a("DxEventHandler").b(TAG);
        if (objArr == null || objArr.length == 0) {
            b.c("args = null or args.length ==0").b();
        } else if (!(objArr[0] instanceof JSONObject)) {
            b.c("args[0] is not JSONObject").b();
        } else {
            JSONObject jSONObject = (JSONObject) objArr[0];
            String string = jSONObject.getString("popScheme");
            if (TextUtils.isEmpty(string)) {
                b.c("popScheme is empty").b();
                return;
            }
            kuk.a(string).b("com.alibaba.poplayer.PopLayer.action.POP").a(jSONObject.getJSONObject("params")).b();
            kss.b(dXRuntimeContext.e(), jSONObject);
            b.a("popScheme", string).b();
        }
    }
}
