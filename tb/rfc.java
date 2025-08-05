package tb;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;

/* loaded from: classes9.dex */
public class rfc implements ret {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1133484041);
        kge.a(-65251872);
    }

    @Override // tb.ret
    public void toast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            Toast.makeText(UpdateRuntime.getContext(), str, 1).show();
        }
    }
}
