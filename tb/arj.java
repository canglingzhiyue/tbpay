package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.n;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class arj<INPUT extends Serializable, OUTPUT extends Serializable> extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(607242556);
    }

    public void a(AURAInputData<INPUT> aURAInputData, aqq<OUTPUT> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
        }
    }
}
