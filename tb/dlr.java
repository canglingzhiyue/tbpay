package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class dlr extends dle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f26838a;

    static {
        kge.a(-334836909);
    }

    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d6895230", new Object[]{this});
        }
        WeakReference<View> weakReference = this.f26838a;
        if (weakReference != null && weakReference.get() != null) {
            return this.f26838a.get();
        }
        return null;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f26838a = new WeakReference<>(view);
        }
    }
}
