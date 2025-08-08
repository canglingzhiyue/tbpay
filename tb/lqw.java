package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* loaded from: classes.dex */
public class lqw implements lac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IHostService f30841a;

    static {
        kge.a(-651579878);
        kge.a(-1974047270);
    }

    public void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
        } else if (ljsVar == null) {
        } else {
            this.f30841a = (IHostService) ljsVar.a(IHostService.class);
        }
    }

    @Override // tb.lab
    public boolean a(View view) {
        ljy f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        IHostService iHostService = this.f30841a;
        if (iHostService != null && (f = iHostService.getInvokeCallback().f()) != null) {
            return f.a(view, new ViewGroup.LayoutParams(-1, -1));
        }
        return false;
    }

    @Override // tb.lac
    public boolean a() {
        lkg h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.f30841a;
        if (iHostService != null && (h = iHostService.getInvokeCallback().h()) != null) {
            return StringUtils.equals(h.a(), h.b());
        }
        return false;
    }

    @Override // tb.lac
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        lkb c = this.f30841a.getInvokeCallback().c();
        if (c != null) {
            return (int) c.a();
        }
        return 0;
    }

    @Override // tb.lac
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.f30841a;
        if (iHostService != null) {
            return iHostService.getInvokeCallback().a().d();
        }
        return false;
    }

    @Override // tb.lac
    public View a(String str) {
        ljy f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fef0fbf4", new Object[]{this, str});
        }
        if (this.f30841a != null && !StringUtils.isEmpty(str) && (f = this.f30841a.getInvokeCallback().f()) != null) {
            return f.a(str);
        }
        return null;
    }
}
