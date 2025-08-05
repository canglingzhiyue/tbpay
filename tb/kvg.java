package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.tschedule.c;
import com.taobao.homepage.utils.e;
import com.taobao.homepage.utils.j;

/* loaded from: classes.dex */
public class kvg extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HTAP = 34696035233L;
    public static final String TAG = "hTap";

    static {
        kge.a(2005749609);
    }

    public static /* synthetic */ Object ipc$super(kvg kvgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(kvg kvgVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5597fe4", new Object[]{kvgVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            kvgVar.a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            dXRuntimeContext.e();
            Object obj = objArr[0];
            dXRuntimeContext.s();
            if (!(obj instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                c.a(jSONObject.getString("itemBizCode"), jSONObject.getString("targetUrl"));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(final DXEvent dXEvent, final Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            j.a(dXRuntimeContext.m(), new j.a() { // from class: tb.kvg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.utils.j.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        kvg.a(kvg.this, dXEvent, objArr, dXRuntimeContext);
                    }
                }
            });
        }
    }

    private void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd72af8", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
            ldf.d(TAG, "args == null || args.length < 1");
        } else {
            Object obj = objArr[0];
            DXRootView s = dXRuntimeContext.s();
            if (!(obj instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            gmq.a(jSONObject);
            Context a2 = e.a(s);
            e.a(dXRuntimeContext, jSONObject);
            ldf.d(TAG, "准备处理点击跳转事件");
            String string = jSONObject.getString("targetUrl");
            if (string == null) {
                string = "";
            }
            oql.a().a(string);
            boolean a3 = gmp.a(a2, jSONObject);
            if (a3) {
                onq.b(true);
            }
            oql.a().a(a3);
            lat.a(jSONObject);
            oql.a().k().a(jSONObject);
            lam.a(jSONObject);
        }
    }
}
