package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.af;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes4.dex */
public class ezk implements bn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;

    /* renamed from: a  reason: collision with root package name */
    public Context f27692a;
    public eyx b;

    @Override // com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        }
    }

    static {
        kge.a(-452303181);
        kge.a(600646234);
        DX_EVENT_ID = fxa.a("uTap");
    }

    public ezk(Context context, eyx eyxVar) {
        this.f27692a = context;
        this.b = eyxVar;
    }

    @Override // com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0 || (e = dXRuntimeContext.e()) == null) {
        } else {
            this.b.c().a(new eyy(e, this.b.c().a()).a((String) objArr[0]), af.a(objArr, dXRuntimeContext, this.b));
        }
    }
}
