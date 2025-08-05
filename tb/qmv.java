package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class qmv extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEINTERACTCLICK = -3740188743218598360L;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f32947a;
        public int b;

        static {
            kge.a(-1995577417);
        }

        public a(Object[] objArr, int i) {
            this.f32947a = objArr;
            this.b = i;
        }
    }

    static {
        kge.a(1842692969);
    }

    public static /* synthetic */ Object ipc$super(qmv qmvVar, String str, Object... objArr) {
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
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        pmd.a().m().a("handleEvent", Arrays.toString(objArr));
        if (objArr == null || objArr.length < 2 || dXRuntimeContext == null || (e = dXRuntimeContext.e()) == null) {
            return;
        }
        if ("event".equals(objArr[0]) || "custom".equals(objArr[0])) {
            ddw.a().a("com.taobao.taolive.room.dxmanager.event", new a(objArr, dXRuntimeContext.i()), e.getString("token"));
        } else if (!"recommend_popview".equals(objArr[0])) {
        } else {
            ddw.a().a("com.taobao.taolive.room.dxmanager.event.recommend_popview", new a(objArr, dXRuntimeContext.i()), e.getString("token"));
        }
    }
}
