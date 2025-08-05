package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.resourceguardian.data.model.b;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class pik implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f32684a;
    private final FluidContext b;
    private final Context c;
    private boolean d = false;
    private final ilb e = new ilb() { // from class: tb.pik.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ilb
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            return 402;
        }

        @Override // tb.ilb
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            return 4;
        }

        @Override // tb.ilb
        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "tab2";
        }

        @Override // tb.ilb
        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "";
        }

        @Override // tb.ilb
        public boolean a(final b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("733ff0c7", new Object[]{this, bVar})).booleanValue();
            }
            if (!pik.cb_() || !pik.a(pik.this)) {
                pik.a(pik.this, true);
                oec.a(new Runnable() { // from class: tb.pik.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String j = spj.j(pik.b(pik.this));
                        pil.a(pik.c(pik.this), j, "gg_videoTab_page_fever");
                        HashMap hashMap = new HashMap();
                        hashMap.put("category", Integer.valueOf(bVar.f14879a));
                        hashMap.put("level", bVar.c);
                        hashMap.put("value", bVar.d);
                        hashMap.put("process", bVar.g);
                        hashMap.put("type", Integer.valueOf(bVar.b));
                        hashMap.put("profileType", bVar.f);
                        hashMap.put("score", Integer.valueOf(bVar.e));
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("energy", JSON.toJSONString(hashMap));
                        pil.a(pik.c(pik.this), j, "gg_videoTab_page_fever", hashMap2);
                    }
                });
            }
            return false;
        }
    };

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean a(pik pikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9acfc0a", new Object[]{pikVar})).booleanValue() : pikVar.d;
    }

    public static /* synthetic */ boolean a(pik pikVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bf33792", new Object[]{pikVar, new Boolean(z)})).booleanValue();
        }
        pikVar.d = z;
        return z;
    }

    public static /* synthetic */ FluidContext b(pik pikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("cb8ac561", new Object[]{pikVar}) : pikVar.b;
    }

    public static /* synthetic */ Context c(pik pikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("61f6d000", new Object[]{pikVar}) : pikVar.c;
    }

    public static /* synthetic */ boolean cb_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2194146b", new Object[0])).booleanValue() : f32684a;
    }

    static {
        kge.a(655077893);
        kge.a(1755210026);
        f32684a = oeb.a("ShortVideo.reportPerformanceOnce", true);
    }

    public pik(FluidContext fluidContext) {
        this.b = fluidContext;
        ((ILifecycleService) this.b.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        this.c = fluidContext.getContext();
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c("PerformanceMonitor", "endTrackPerformance");
        ild.b(this.e);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        spz.c("PerformanceMonitor", "startTrackPerformance");
        ild.a(this.e);
    }
}
