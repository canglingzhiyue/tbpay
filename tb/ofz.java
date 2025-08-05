package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public abstract class ofz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f32022a;

    static {
        kge.a(1440629593);
    }

    public abstract View a();

    public abstract View a(Context context);

    public abstract void a(Object obj, String str);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean dH_();

    public abstract void e();

    public View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        if (this.f32022a == null) {
            this.f32022a = a(context);
        }
        return this.f32022a;
    }
}
