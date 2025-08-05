package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class lpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f30792a;
    private int b;
    private View c;
    private View d;

    static {
        kge.a(1237491133);
    }

    public lpc(View view) {
        this.c = view;
        if (view.getParent() != null) {
            this.f30792a = (ViewGroup) view.getParent();
            this.b = this.f30792a.indexOfChild(view);
        }
        emu.a("com.taobao.android.detail.core.pagemanager.view.ViewRestorer");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f30792a;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(this.c);
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        a();
        ViewGroup viewGroup = this.f30792a;
        if (viewGroup == null) {
            return;
        }
        viewGroup.addView(view, this.b);
        this.d = view;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f30792a;
        if (viewGroup == null) {
            return;
        }
        View view = this.d;
        if (view != null) {
            viewGroup.removeView(view);
            this.d = null;
        }
        if (this.c.getParent() != null) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        this.f30792a.addView(this.c, this.b);
    }
}
