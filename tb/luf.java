package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class luf extends lua implements ljy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(237601874);
        kge.a(1714535729);
    }

    public luf(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.ljy
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            e().c(z);
        }
    }

    @Override // tb.ljy
    public boolean a(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8549977", new Object[]{this, view, layoutParams})).booleanValue() : e().a(view, layoutParams);
    }

    @Override // tb.ljy
    public View a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fef0fbf4", new Object[]{this, str}) : e().a(str);
    }
}
