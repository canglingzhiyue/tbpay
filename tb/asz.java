package tb;

import android.content.Context;
import android.view.View;
import android.widget.Space;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class asz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2036104556);
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context}) : new Space(context);
    }
}
