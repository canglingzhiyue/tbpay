package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ag;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.af;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;

/* loaded from: classes4.dex */
public class qqe extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Long DX_EVENT_ID;
    public static final String EVENT_TAG = "xCopy";

    /* renamed from: a  reason: collision with root package name */
    public Context f33034a;
    public eyx b;

    static {
        kge.a(-835172392);
        DX_EVENT_ID = 20175625671960L;
    }

    public qqe(Context context, eyx eyxVar) {
        this.f33034a = context;
        this.b = eyxVar;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext == null || dXRuntimeContext.m() == null || objArr == null || objArr.length == 0 || (e = dXRuntimeContext.e()) == null || e.getJSONObject("fields") == null) {
        } else {
            this.b.c().a(new a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.dinamicx.event.DetailDinamicCopyEventHandlerV3$1
                {
                    put("type", ag.EVENT_TYPE);
                }
            }), af.a(objArr, dXRuntimeContext, this.b));
        }
    }
}
