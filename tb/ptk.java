package tb;

import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ.b;
import com.taobao.android.fluid.framework.data.datamodel.DelayConfig;
import com.taobao.android.fluid.framework.preload.launcher.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.monitor.procedure.v;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class ptk implements spx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    public View h;
    public final List<spy> f = new ArrayList();
    public String g = null;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f32881a = new HashSet();
    public int i = 0;
    public Collection<String> j = h();

    static {
        kge.a(1120076972);
        kge.a(-270311347);
    }

    @Override // tb.spx
    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        }
    }

    @Override // tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue();
        }
        return false;
    }

    public static Collection<String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("135e6738", new Object[0]) : son.b() ? new HashSet() : new ArrayList();
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.h = view;
        j();
        if ((this instanceof b) || view == null) {
            return;
        }
        view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.g = str;
        this.f32881a.add(str);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.f32881a.contains(str);
    }

    public List c(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b557ade9", new Object[]{this, spyVar});
        }
        Object obj = spyVar.i.get("filter");
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj == null) {
            return null;
        }
        return JSON.parseArray(obj.toString());
    }

    @Override // tb.spx, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            this.i = 4;
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.h == null) {
        } else {
            if (oeb.a("ShortVideo.fixHideHandler", false)) {
                this.h.setVisibility(4);
                this.h.setEnabled(false);
                return;
            }
            this.h.setVisibility(8);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.h == null) {
        } else {
            if (oeb.a("ShortVideo.fixHideHandler", false)) {
                this.h.setEnabled(true);
            }
            this.h.setVisibility(0);
        }
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    @Override // tb.spx
    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b;
    }

    public DelayConfig b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (DelayConfig) ipChange.ipc$dispatch("ded5d0b3", new Object[]{this, fluidContext});
        }
        if (fluidContext.getInstanceConfig().isTab3FromLauncher() && ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().g() && i.a(fluidContext.getContext(), i.FEATURE_DELAY_VIDEO_INTERACT_Layer, true)) {
            z = true;
        }
        if (z && oeb.a("ShortVideo.fixLauncherDelay", true)) {
            return new DelayConfig();
        }
        return a.a(fluidContext);
    }
}
