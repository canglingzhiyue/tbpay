package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import java.util.HashMap;
import java.util.Map;
import tb.lmj;

/* loaded from: classes7.dex */
public class lmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f30712a;
    private lmj b;
    private final lmk c;
    private lmj.a f;
    private final IVideoPlayControllerService.b g;
    private DXRuntimeContext i;
    private Handler j;
    private boolean d = false;
    private boolean e = false;
    private final Handler h = new Handler(Looper.getMainLooper());

    static {
        kge.a(-2044273034);
    }

    public static /* synthetic */ void a(lmm lmmVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fac641", new Object[]{lmmVar, new Integer(i), str});
        } else {
            lmmVar.a(i, str);
        }
    }

    public static /* synthetic */ void a(lmm lmmVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39c1abd", new Object[]{lmmVar, dXRuntimeContext});
        } else {
            lmmVar.a(dXRuntimeContext);
        }
    }

    public static /* synthetic */ void a(lmm lmmVar, IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469e8c04", new Object[]{lmmVar, aVar});
        } else {
            lmmVar.a(aVar);
        }
    }

    public static /* synthetic */ boolean a(lmm lmmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f312e050", new Object[]{lmmVar})).booleanValue() : lmmVar.d;
    }

    public static /* synthetic */ void b(lmm lmmVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451e77e", new Object[]{lmmVar, dXRuntimeContext});
        } else {
            lmmVar.h(dXRuntimeContext);
        }
    }

    public static /* synthetic */ boolean b(lmm lmmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e195e6d1", new Object[]{lmmVar})).booleanValue() : lmmVar.e;
    }

    public static /* synthetic */ void c(lmm lmmVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e507b43f", new Object[]{lmmVar, dXRuntimeContext});
        } else {
            lmmVar.f(dXRuntimeContext);
        }
    }

    public lmm(lmk lmkVar, IVideoPlayControllerService.b bVar) {
        this.c = lmkVar;
        this.g = bVar;
    }

    public void a(DXEvent dXEvent, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d3ed1b", new Object[]{this, dXEvent, dXRuntimeContext});
        } else if (d(dXRuntimeContext)) {
            ldf.d("LiveCardPlayControlByService", "播控场景以下事件不需要响应");
        } else {
            long eventId = dXEvent.getEventId();
            if (eventId == 7952648158329995189L) {
                ldf.d("LiveCardPlayControlByService", "receive on scroll start event");
                this.e = true;
            } else if (eventId == -7968002352509477560L) {
                ldf.d("LiveCardPlayControlByService", "receive on scroll stop event");
                this.e = false;
            } else if (eventId == 5288671110273408574L) {
                ldf.d("LiveCardPlayControlByService", "receive on appear event");
                this.d = true;
            } else if (eventId == 5388973340095122049L) {
                ldf.d("LiveCardPlayControlByService", "receive on disappear event");
                this.d = false;
                b(dXRuntimeContext);
            }
            this.h.removeCallbacksAndMessages(null);
            this.h.post(new Runnable() { // from class: tb.lmm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!lmm.a(lmm.this) || lmm.b(lmm.this)) {
                    } else {
                        lmm.a(lmm.this, dXRuntimeContext);
                    }
                }
            });
        }
    }

    public void a(IVideoPlayControllerService.a aVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0d5fd9", new Object[]{this, aVar, dXRuntimeContext});
        } else if (!d(dXRuntimeContext)) {
            ldf.d("LiveCardPlayControlByService", "不是播控场景以下事件不需要响应");
        } else {
            c(aVar, dXRuntimeContext);
            a(dXRuntimeContext);
            aVar.a(this.g);
        }
    }

    public void b(IVideoPlayControllerService.a aVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3f5778", new Object[]{this, aVar, dXRuntimeContext});
        } else if (!d(dXRuntimeContext)) {
            ldf.d("LiveCardPlayControlByService", "不是播控场景以下事件不需要响应");
        } else {
            b(dXRuntimeContext);
            f(dXRuntimeContext);
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else {
            c(dXRuntimeContext).a(dXRuntimeContext, this.c);
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, lmj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e67bc3", new Object[]{this, dXRuntimeContext, aVar});
        } else {
            c(dXRuntimeContext).a(aVar);
        }
    }

    private void b(final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07f39a", new Object[]{this, dXRuntimeContext});
            return;
        }
        int a2 = ldj.a("key_live_transition_delay_default_time", 300);
        if (a2 > 0 && dXRuntimeContext != null && (dXRuntimeContext.m() instanceof Activity)) {
            long j = a2;
            if (System.currentTimeMillis() - ((Activity) dXRuntimeContext.m()).getIntent().getLongExtra("transition_jump_start_time", -1L) < j) {
                if (this.j == null) {
                    this.j = new Handler(Looper.getMainLooper());
                }
                ldf.d("LiveCardPlayControlByService", "stopVideo , hit transition_jump_start_time.");
                this.j.postDelayed(new Runnable() { // from class: tb.lmm.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ldf.d("LiveCardPlayControlByService", "stopVideo , real run stop . ");
                        try {
                            lmm.b(lmm.this, dXRuntimeContext);
                        } catch (Exception e) {
                            ldf.a("LiveCardPlayControlByService", "directStopPlayer with Error", e);
                        }
                    }
                }, j);
                return;
            }
        }
        h(dXRuntimeContext);
    }

    private void h(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214aa620", new Object[]{this, dXRuntimeContext});
        } else {
            c(dXRuntimeContext).a(dXRuntimeContext);
        }
    }

    private lmj c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lmj) ipChange.ipc$dispatch("899dd6e2", new Object[]{this, dXRuntimeContext});
        }
        lmj lmjVar = this.b;
        if (lmjVar != null) {
            return lmjVar;
        }
        this.i = dXRuntimeContext;
        if (d(dXRuntimeContext)) {
            this.b = new lmp(dXRuntimeContext);
        } else {
            this.b = new lmo();
        }
        return this.b;
    }

    private boolean d(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("131e2f20", new Object[]{this, dXRuntimeContext})).booleanValue() : e(dXRuntimeContext) && this.c.a();
    }

    private boolean e(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56a94ce1", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        Boolean bool = this.f30712a;
        if (bool != null) {
            return bool.booleanValue();
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 == null) {
            ldf.d("LiveCardPlayControlByService", "isEnableVideoPlayControl infoFlowContext == null");
            this.f30712a = true;
            return this.f30712a.booleanValue();
        }
        IVideoPlayControllerService iVideoPlayControllerService = (IVideoPlayControllerService) a2.a(IVideoPlayControllerService.class);
        this.f30712a = Boolean.valueOf(iVideoPlayControllerService != null && iVideoPlayControllerService.isEnable());
        ldf.d("LiveCardPlayControlByService", "isEnableVideoPlayControl:" + this.f30712a);
        return this.f30712a.booleanValue();
    }

    private void c(IVideoPlayControllerService.a aVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61714f17", new Object[]{this, aVar, dXRuntimeContext});
        } else {
            a(dXRuntimeContext, d(aVar, dXRuntimeContext));
        }
    }

    private void f(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a346a9e", new Object[]{this, dXRuntimeContext});
        } else {
            a(dXRuntimeContext, (lmj.a) null);
        }
    }

    private lmj.a d(final IVideoPlayControllerService.a aVar, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lmj.a) ipChange.ipc$dispatch("d0f9fd0a", new Object[]{this, aVar, dXRuntimeContext});
        }
        if (this.f == null) {
            this.f = new lmj.a() { // from class: tb.lmm.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lmj.a
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else if (i != 1 && i != 2 && i != 3) {
                    } else {
                        lmm.c(lmm.this, dXRuntimeContext);
                        lmm.a(lmm.this, aVar);
                        lmm.a(lmm.this, i, str);
                    }
                }
            };
        }
        return this.f;
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        ldf.d("LiveCardPlayControlByService", "errorCode : " + i + ", errorMsg : " + str);
        if (i == 1) {
            Map<String, String> g = g(this.i);
            g.put("errorMsg", str);
            ldk.b("live", "live_prepareToPlayFail", "", "Page_Home_VideoPlayer_Count", "", g);
        } else if (i == 2) {
            ldk.a("live", "live_playFail", "", "Page_Home_VideoPlayer", "", g(this.i), String.valueOf(i), str);
        } else if (i != 4) {
        } else {
            ldk.a("live", "live_playMediaFail", "", "Page_Home_VideoPlayer", "", g(this.i), String.valueOf(i), str);
        }
    }

    private void a(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe7668", new Object[]{this, aVar});
            return;
        }
        aVar.d(this.g);
        ldf.d("LiveCardPlayControlByService", "播放器出现错误");
    }

    private Map<String, String> g(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c2100854", new Object[]{this, dXRuntimeContext});
        }
        HashMap hashMap = new HashMap(8);
        DXTemplateItem c = dXRuntimeContext == null ? null : dXRuntimeContext.c();
        if (c != null) {
            hashMap.put("template", c.f11925a + "_" + c.b);
        }
        return hashMap;
    }
}
