package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.internal.b;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class jjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(545773696);
    }

    public abstract void a(jiy jiyVar);

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract Map<String, String> getExposureViewProperties(String str, View view);

    public abstract b getExposureViewTag(String str, View view);

    public abstract boolean isExposureView(String str, View view);
}
