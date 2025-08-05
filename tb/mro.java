package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import com.taobao.tbliveinteractive.view.right_component.c;
import java.util.List;

/* loaded from: classes5.dex */
public class mro extends mrn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-625821909);
    }

    public static /* synthetic */ Object ipc$super(mro mroVar, String str, Object... objArr) {
        if (str.hashCode() == 1651902687) {
            return super.a();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.mrn, tb.mri
    public List<FluidTaskConfig> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<FluidTaskConfig> a2 = super.a();
        a2.add(new FluidTaskConfig("dynamic_h5_sdk", 0L, "main"));
        a2.add(new FluidTaskConfig(c.TAG, 0L, "main"));
        return a2;
    }
}
