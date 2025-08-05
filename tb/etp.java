package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class etp<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f27568a;

    static {
        kge.a(502629335);
    }

    public etp() {
        tpc.a("com.taobao.android.detail.kit.view.widget.base.uikit.feature.features.AbsFeature");
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, t});
        } else {
            this.f27568a = t;
        }
    }
}
