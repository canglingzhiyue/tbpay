package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* loaded from: classes5.dex */
public class sjw implements hjj, sjy, sjz, ska, skb, skc, ske {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33639a;
    private Boolean g;
    private final f<ska> b = new f<>();
    private final f<hjj> h = new f<>();
    private final f<ske> c = new f<>();
    private final f<sjz> d = new f<>();
    private final f<skc> e = new f<>();
    private final f<skb> f = new f<>();

    static {
        kge.a(-1663686436);
        kge.a(-1206122509);
        kge.a(-615793707);
        kge.a(954355535);
        kge.a(-1341864770);
        kge.a(1032455236);
        kge.a(1113596639);
        kge.a(753944543);
    }

    public sjw(FluidContext fluidContext) {
        this.f33639a = fluidContext;
    }

    @Override // tb.sjy
    public void addCardRenderListener(hjj hjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dce0ea", new Object[]{this, hjjVar});
        } else if (hjjVar == null) {
        } else {
            this.h.a(hjjVar);
        }
    }

    @Override // tb.sjy
    public void addFirstCardRenderListener(ska skaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8639c957", new Object[]{this, skaVar});
        } else if (skaVar == null) {
        } else {
            this.b.a(skaVar);
        }
    }

    public void a(sjz sjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee06ef5", new Object[]{this, sjzVar});
        } else {
            this.d.a(sjzVar);
        }
    }

    public void a(skb skbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee39d8e", new Object[]{this, skbVar});
        } else {
            this.f.a(skbVar);
        }
    }

    @Override // tb.sjy
    public void addRenderLifecycleListener(skc skcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0095f3", new Object[]{this, skcVar});
        } else {
            this.e.a(skcVar);
        }
    }

    @Override // tb.sjy
    public void addSizedChangeListener(ske skeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4926450", new Object[]{this, skeVar});
        } else {
            this.c.a(skeVar);
        }
    }

    public void a(hjj hjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec13da30", new Object[]{this, hjjVar});
        } else if (hjjVar == null) {
        } else {
            this.h.c(hjjVar);
        }
    }

    public void a(ska skaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee3292f", new Object[]{this, skaVar});
        } else if (skaVar == null) {
        } else {
            this.b.c(skaVar);
        }
    }

    public void b(sjz sjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed637576", new Object[]{this, sjzVar});
        } else {
            this.d.c(sjzVar);
        }
    }

    public void b(skb skbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed66a40f", new Object[]{this, skbVar});
        } else {
            this.f.c(skbVar);
        }
    }

    public void a(skc skcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee411ed", new Object[]{this, skcVar});
        } else {
            this.e.c(skcVar);
        }
    }

    public void a(ske skeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee4faab", new Object[]{this, skeVar});
        } else {
            this.c.c(skeVar);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // tb.hjj
    public void onCardRenderFailed(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f332645", new Object[]{this, pswVar});
        } else if (pswVar != null) {
            spz.c("ContainerListenerManager", "视频流卡片渲染成功：" + pswVar);
            for (hjj hjjVar : this.h.a()) {
                try {
                    hjjVar.onCardRenderFailed(pswVar);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f33639a, hjjVar, "onCardRenderFailed", e);
                }
            }
        }
    }

    @Override // tb.hjj
    public void onCardRenderSuccess(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f433e1", new Object[]{this, pswVar});
        } else if (pswVar != null) {
            spz.c("ContainerListenerManager", "视频流卡片渲染成功：" + pswVar);
            for (hjj hjjVar : this.h.a()) {
                try {
                    hjjVar.onCardRenderSuccess(pswVar);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f33639a, hjjVar, "onCardRenderSuccess", e);
                }
            }
        }
    }

    @Override // tb.ska
    public void onFirstCardRenderFailed(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d76177", new Object[]{this, pswVar});
        } else if (this.g == null && pswVar != null && pswVar.K()) {
            spz.c("ContainerListenerManager", "视频流首卡渲染失败：" + pswVar);
            this.g = false;
            onCardRenderFailed(pswVar);
            for (ska skaVar : this.b.a()) {
                try {
                    skaVar.onFirstCardRenderFailed(pswVar);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f33639a, skaVar, "onFirstCardRenderFailed", e);
                }
            }
        }
    }

    @Override // tb.ska
    public void onFirstCardRenderSuccess(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed75eef", new Object[]{this, pswVar});
        } else if (this.g == null && pswVar != null && pswVar.K()) {
            spz.c("ContainerListenerManager", "视频流首卡渲染成功：" + pswVar);
            this.g = true;
            onCardRenderSuccess(pswVar);
            for (ska skaVar : this.b.a()) {
                try {
                    skaVar.onFirstCardRenderSuccess(pswVar);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f33639a, skaVar, "onFirstCardRenderSuccess", e);
                }
            }
        }
    }

    @Override // tb.sjz
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c("ContainerListenerManager", "onHorizontalSlide called");
        for (sjz sjzVar : this.d.a()) {
            try {
                sjzVar.b();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33639a, sjzVar, "onHorizontalSlide", e);
            }
        }
        try {
            if (((ISceneConfigService) this.f33639a.getService(ISceneConfigService.class)).getSlidePageLockConfigure().b()) {
                spz.c("ContainerListenerManager", "MultiTab onHorizontalSlide disableSlide");
                return;
            }
            a.c a2 = ((IDataService) this.f33639a.getService(IDataService.class)).getCurrentMediaSetData().a();
            String B = a2.B();
            if (!TextUtils.isEmpty(B)) {
                ITrackService iTrackService = (ITrackService) this.f33639a.getService(ITrackService.class);
                if (iTrackService != null) {
                    Map<String, String> activeCardCommonTrack = iTrackService.getActiveCardCommonTrack();
                    activeCardCommonTrack.put("contentId", a2.g());
                    activeCardCommonTrack.put("videoId", a2.g());
                    activeCardCommonTrack.put("video_spm_cnt", activeCardCommonTrack.get("spm-cnt"));
                    activeCardCommonTrack.put("video_spm_url", activeCardCommonTrack.get("spm-url"));
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(obz.a(activeCardCommonTrack));
                    spz.c("ContainerListenerManager", "侧滑进个人页-- onHorizontalSlide ");
                }
                FluidSDK.getNavAdapter().nav(this.f33639a, this.f33639a.getContext(), B, null);
                ((IMessageService) this.f33639a.getService(IMessageService.class)).sendMessage(new spy("VSMSG_pageSlide", a2.c, null));
                b.b(this.f33639a);
                return;
            }
            spz.c("ContainerListenerManager", "MultiTab onHorizontalSlide slidePageUrl isEmpty");
        } catch (Exception e2) {
            spz.c("ContainerListenerManager", e2.toString());
        }
    }

    @Override // tb.ske
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        spz.c("ContainerListenerManager", "onSizeChanged called width:" + i + " height:" + i2);
        for (ske skeVar : this.c.a()) {
            try {
                skeVar.a(i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33639a, skeVar, "onSizeChanged", e);
            }
        }
    }

    @Override // tb.skc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        spz.c("ContainerListenerManager", "onStartRender called");
        for (skc skcVar : this.e.a()) {
            try {
                skcVar.c();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33639a, skcVar, "onStartRender", e);
            }
        }
    }

    @Override // tb.skc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        spz.c("ContainerListenerManager", "onRenderComplete called");
        for (skc skcVar : this.e.a()) {
            try {
                skcVar.d();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33639a, skcVar, "onRenderComplete", e);
            }
        }
    }
}
