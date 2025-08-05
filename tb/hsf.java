package tb;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hsf implements hsg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1570646005);
        kge.a(-1616533853);
    }

    @Override // tb.hsg
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            Toast.makeText(context, str, 0).show();
        }
    }
}
