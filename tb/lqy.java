package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* loaded from: classes.dex */
public class lqy implements lae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f30844a;
    private lkc b;

    static {
        kge.a(1649448017);
        kge.a(2068603921);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f30844a = context;
        }
    }

    public void a(ljs ljsVar) {
        lju invokeCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService == null || (invokeCallback = iHostService.getInvokeCallback()) == null) {
            return;
        }
        this.b = invokeCallback.i();
    }

    @Override // tb.lab
    public boolean a(View view) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        lkc lkcVar = this.b;
        Context b = lkcVar == null ? this.f30844a : lkcVar.b();
        if (b == null) {
            b = this.f30844a;
        }
        if (!(b instanceof Activity) || ((WindowManager) b.getSystemService(a.ATOM_EXT_window)) == null || (viewGroup = (ViewGroup) ((Activity) b).getWindow().getDecorView().findViewById(16908290)) == null) {
            return false;
        }
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return true;
    }
}
