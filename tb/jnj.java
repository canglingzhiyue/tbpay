package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.taobao.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class jnj extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final long DX_EVENT_ABILITYEVENTHANDLER = 162776508113905857L;

    static {
        kge.a(799241932);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(jnj jnjVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] args, DXRuntimeContext runtimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, args, runtimeContext});
            return;
        }
        q.d(args, "args");
        q.d(runtimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(args, runtimeContext);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXRootView s;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        String str = null;
        Object tag = (dXRuntimeContext == null || (s = dXRuntimeContext.s()) == null) ? null : s.getTag(R.id.mega_dx_widget_id);
        if (!(tag instanceof dls)) {
            tag = null;
        }
        dls dlsVar = (dls) tag;
        if (dlsVar == null) {
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            str = obj;
        }
        dlsVar.onEvent(str);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-837397740);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
