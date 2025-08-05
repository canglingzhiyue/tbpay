package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lyp implements lyo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f30995a;

    static {
        kge.a(-896524127);
        kge.a(-1723848479);
    }

    @Override // tb.lab
    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        this.f30995a = view;
        return true;
    }
}
