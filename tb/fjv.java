package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.d;
import com.taobao.android.dinamicx.eventchain.j;

/* loaded from: classes2.dex */
public class fjv extends hta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-72159997);
    }

    public static /* synthetic */ Object ipc$super(fjv fjvVar, String str, Object... objArr) {
        if (str.hashCode() == -160778260) {
            super.a((String) objArr[0], (j) objArr[1], (d) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.eventchain.f
    public void a(String str, j jVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66ab7ec", new Object[]{this, str, jVar, dVar});
            return;
        }
        if (dVar != null) {
            fkg.a(str, dVar.a());
        }
        super.a(str, jVar, dVar);
    }
}
