package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes2.dex */
public class bqz extends bra {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_URULETAP = 7023701163946200378L;

    /* renamed from: a  reason: collision with root package name */
    private final String f26054a = "UMFDXURulesTapEventHandler";

    static {
        kge.a(-1188331551);
    }

    public static /* synthetic */ Object ipc$super(bqz bqzVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -498689596) {
            if (hashCode != 1785185506) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        return new Boolean(super.a((brh) objArr[0]));
    }

    @Override // tb.bra, com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.bra, tb.bqy
    public boolean a(brh brhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e24699c4", new Object[]{this, brhVar})).booleanValue();
        }
        super.a(brhVar);
        brhVar.a("adjustRules");
        b(brhVar);
        return true;
    }
}
