package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.awc;

/* loaded from: classes2.dex */
public class awf extends bqy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_AURA_EXPOSURE = 536060492787593232L;

    static {
        kge.a(-459392350);
    }

    public static /* synthetic */ Object ipc$super(awf awfVar, String str, Object... objArr) {
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

    @Override // tb.bqy
    public boolean a(brh brhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e24699c4", new Object[]{this, brhVar})).booleanValue();
        }
        Object[] e = brhVar.e();
        if (e.length <= 0) {
            return false;
        }
        Object obj = e[0];
        if (!(obj instanceof String)) {
            return false;
        }
        AURARenderComponent d = brhVar.d();
        Object a2 = brhVar.c().a();
        if (!(a2 instanceof q) || d == null) {
            return false;
        }
        awc.b(new awc.a(((q) a2).b(), d, (String) obj, null));
        return true;
    }
}
