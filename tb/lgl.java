package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.lang.ref.WeakReference;
import tb.lks;

/* loaded from: classes.dex */
public class lgl implements lgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<llb> f30570a;
    private WeakReference<lld> b;
    private final IMainLifecycleService c;
    private final IMainFeedsViewService<?> d;
    private final IMainFeedsLoopStartStopService.a e;
    private lks.b f;

    static {
        kge.a(1431920340);
        kge.a(1227300292);
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a a(lgl lglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("1e1778da", new Object[]{lglVar}) : lglVar.e;
    }

    public static /* synthetic */ IMainFeedsViewService b(lgl lglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("a940f790", new Object[]{lglVar}) : lglVar.d;
    }

    public static /* synthetic */ IMainLifecycleService c(lgl lglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainLifecycleService) ipChange.ipc$dispatch("f01891a1", new Object[]{lglVar}) : lglVar.c;
    }

    public lgl(ljs ljsVar, IMainFeedsLoopStartStopService.a aVar) {
        this.e = aVar;
        this.c = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        this.d = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
    }

    @Override // tb.lgn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService == null) {
            return;
        }
        a(iMainLifecycleService);
        c(this.c);
        a(this.d);
    }

    @Override // tb.lgn
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService == null) {
            return;
        }
        b(iMainLifecycleService);
        d(this.c);
        b(this.d);
    }

    @Override // tb.lgn
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c.isVisible();
    }

    private void a(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("102fba20", new Object[]{this, iMainLifecycleService});
            return;
        }
        llb d = d();
        this.f30570a = new WeakReference<>(d);
        iMainLifecycleService.getPageLifeCycleRegister().a(d);
    }

    private void b(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29310bbf", new Object[]{this, iMainLifecycleService});
            return;
        }
        WeakReference<llb> weakReference = this.f30570a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.f30570a.get());
    }

    private void c(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42325d5e", new Object[]{this, iMainLifecycleService});
            return;
        }
        lld e = e();
        iMainLifecycleService.getTabLifeCycleRegister().a(e);
        this.b = new WeakReference<>(e);
    }

    private void d(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b33aefd", new Object[]{this, iMainLifecycleService});
            return;
        }
        WeakReference<lld> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        iMainLifecycleService.getTabLifeCycleRegister().b(this.b.get());
    }

    private llb d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("261c4e99", new Object[]{this}) : new llb() { // from class: tb.lgl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.llb
            public void onActivityResult(int i, int i2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                }
            }

            @Override // tb.llb
            public void onColdStartResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("45e9b853", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onDestroyView() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b8f9ee7", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onNewIntent(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b57eb01", new Object[]{this, intent});
                }
            }

            @Override // tb.llb
            public void onRestart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c630bb7", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onStop() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onWillExit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bc02c16", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                } else {
                    lgl.a(lgl.this).a(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
                }
            }

            @Override // tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                } else if (lgl.b(lgl.this) == null) {
                } else {
                    lgl.b(lgl.this).forceExposure();
                }
            }
        };
    }

    private lld e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lld) ipChange.ipc$dispatch("2dcdf436", new Object[]{this}) : new lld() { // from class: tb.lgl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lld
            public void onPageScrolled(float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
                }
            }

            @Override // tb.lld
            public void onPageSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90abdd0", new Object[]{this});
                } else {
                    lgl.a(lgl.this).a(IMainFeedsLoopStartStopService.a.TAB_SWITCH);
                }
            }

            @Override // tb.lld
            public void onPageUnSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dadaf89", new Object[]{this});
                } else {
                    lgl.a(lgl.this).b(IMainFeedsLoopStartStopService.a.TAB_SWITCH);
                }
            }
        };
    }

    private void a(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5d7190", new Object[]{this, iMainFeedsViewService});
        } else if (iMainFeedsViewService == null) {
        } else {
            this.f = f();
            iMainFeedsViewService.mo1084getLifeCycleRegister().a(this.f);
        }
    }

    private void b(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85ec32f", new Object[]{this, iMainFeedsViewService});
        } else if (iMainFeedsViewService == null || this.f == null) {
        } else {
            iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.f);
        }
    }

    private lks.b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.b) ipChange.ipc$dispatch("d3f7f827", new Object[]{this}) : new lks.b() { // from class: tb.lgl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.b
            public void dM_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32a48a9d", new Object[]{this});
                }
            }

            @Override // tb.lks.b
            public void dT_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e9676f6", new Object[]{this});
                } else if (!ldj.a("enableFixInfoFlowUnselectStartSlider", true)) {
                    ldf.d("PageLevelStartStopDetectorImpl", "!isResponseDataChangeLayoutFinish");
                } else if (lgl.c(lgl.this) == null || lgl.c(lgl.this).isSelect()) {
                } else {
                    lgl.a(lgl.this).b(IMainFeedsLoopStartStopService.a.TAB_SWITCH);
                }
            }
        };
    }
}
