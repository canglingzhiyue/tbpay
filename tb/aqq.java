package tb;

import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class aqq<DATA extends Serializable> implements aqr<DATA> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(591537325);
        kge.a(-1784337646);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.aqs
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
        }
    }

    public void a(c<DATA> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
        }
    }
}
