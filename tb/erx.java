package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.bi;

/* loaded from: classes5.dex */
public class erx extends eru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(459526512);
    }

    public static /* synthetic */ Object ipc$super(erx erxVar, String str, Object... objArr) {
        if (str.hashCode() == -869053031) {
            super.a((bi) objArr[0], (bi) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eru
    public void a(bi biVar, bi biVar2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc334d99", new Object[]{this, biVar, biVar2, dXRuntimeContext});
        } else {
            super.a(biVar, biVar2, dXRuntimeContext);
        }
    }
}
