package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.n;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class arh<INPUT extends Serializable, OUTPUT extends Serializable> extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(425609779);
    }

    public void onExecute(AURAInputData<INPUT> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd67f8c6", new Object[]{this, aURAInputData});
        }
    }

    public abstract void setCallback(aqq<OUTPUT> aqqVar);
}
