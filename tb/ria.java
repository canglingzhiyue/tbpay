package tb;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ria {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "olFirstScreen";

    /* renamed from: a  reason: collision with root package name */
    private boolean f33159a;
    private final Context c;
    private boolean i;
    private Runnable j;
    private String k;
    private boolean l;
    private final Map<String, Long> b = new HashMap();
    private int d = -1;
    private final int e = 3;
    private int f = 0;
    private long g = -1;
    private long h = -1;

    static {
        kge.a(2131986587);
    }

    public static /* synthetic */ void a(ria riaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd12218e", new Object[]{riaVar});
        } else {
            riaVar.h();
        }
    }

    public static /* synthetic */ void a(ria riaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a532c306", new Object[]{riaVar, new Boolean(z)});
        } else {
            riaVar.a(z);
        }
    }

    public ria(String str, Context context) {
        this.k = str;
        this.c = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f33159a) {
        } else {
            this.f++;
            this.g = System.currentTimeMillis();
            this.h = SystemClock.uptimeMillis();
            int i = this.f;
            if (i == 1) {
                this.b.put("first_img_load_end_time", Long.valueOf(this.g));
            } else if (i == 3) {
                a(false, true, "图片上屏，3张");
            }
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.j != null) {
        } else {
            jqh.b(new Runnable() { // from class: tb.ria.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ria.a(ria.this);
                    }
                }
            }, 150L);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public Map<String, Long> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f33159a) {
        } else {
            if (this.g > 0) {
                a(false, true, "二刷：图片已上屏," + this.f + "张");
                return;
            }
            a(true, false, "二刷图片未上屏");
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.g = System.currentTimeMillis();
        this.h = SystemClock.currentThreadTimeMillis();
        a(false, true, "地图上屏");
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f == 3) {
        } else {
            a(false, true, "延时触发：图片已上屏，小于3张");
        }
    }

    public void a(boolean z, final boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c0cb2", new Object[]{this, new Boolean(z), new Boolean(z2), str});
        } else if (this.f33159a) {
        } else {
            this.f33159a = true;
            Context context = this.c;
            if (context instanceof tey) {
                ((tey) context).a("isOLFirstScreen", false);
            }
            jqg.b(TAG, "load end: " + this.g + ", msg: " + str);
            if (z) {
                jpo.b(this.c).b(this.k, true, (Map<String, String>) null);
            } else if (jqh.a()) {
                jqh.a(new Runnable() { // from class: tb.ria.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ria.a(ria.this, z2);
                        }
                    }
                });
            } else {
                a(z2);
            }
        }
    }

    private void a(boolean z) {
        String str;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        jpo b = jpo.b(this.c);
        Long l = this.b.get(dtz.STAGE_KEY_CLICK_START);
        Long l2 = this.b.get("on_create_time");
        Long l3 = this.b.get("on_Resume_end_time");
        Long l4 = this.b.get("response_render_start_time");
        Long l5 = this.b.get("response_render_end_time");
        Long l6 = this.b.get("cache_img_load_end_time");
        Long l7 = this.b.get("first_img_load_end_time");
        Long l8 = this.b.get("delay_finish_time");
        Long l9 = this.b.get("up_nav_start_time");
        if (l == null || l.longValue() <= 0 || l2 == null) {
            b.b(this.k, true, (Map<String, String>) null);
            return;
        }
        long longValue = l2.longValue() - l.longValue();
        float longValue2 = ((float) longValue) / ((float) (this.g - l.longValue()));
        if (longValue >= 10000 || longValue <= 0 || longValue2 > bxd.a("navTimeProportion", 0.5f)) {
            b.b(this.k, true, (Map<String, String>) null);
            return;
        }
        if (l3 != null && l3.longValue() - l.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("transitionStage");
            ultronPerformanceStageModel.setStartMills(l.longValue());
            ultronPerformanceStageModel.setEndMills(l3.longValue());
            b.a(ultronPerformanceStageModel, (String) null, false);
        }
        if (l4 != null && l5 != null && l5.longValue() - l4.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel2 = new UltronPerformanceStageModel("responseRenderStage");
            ultronPerformanceStageModel2.setStartMills(l4.longValue());
            ultronPerformanceStageModel2.setEndMills(l5.longValue());
            b.a(ultronPerformanceStageModel2, (String) null, false);
        }
        if (l7 != null && l7.longValue() - l.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel3 = new UltronPerformanceStageModel("firstImageLoadStage");
            ultronPerformanceStageModel3.setStartMills(l.longValue());
            ultronPerformanceStageModel3.setEndMills(l7.longValue());
            b.a(ultronPerformanceStageModel3, (String) null, false);
        }
        if (l8 != null && l8.longValue() - l.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel4 = new UltronPerformanceStageModel("delayFinishStage");
            ultronPerformanceStageModel4.setStartMills(l.longValue());
            ultronPerformanceStageModel4.setEndMills(l8.longValue());
            b.a(ultronPerformanceStageModel4, (String) null, false);
        }
        if (l9 != null && this.h - l9.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel5 = new UltronPerformanceStageModel("upTimeFullStage");
            ultronPerformanceStageModel5.setStartMills(l9.longValue());
            ultronPerformanceStageModel5.setEndMills(this.h);
            b.a(ultronPerformanceStageModel5, (String) null, false);
        }
        if (l6 == null || l6.longValue() - l.longValue() < 0) {
            str = null;
            z2 = false;
        } else {
            UltronPerformanceStageModel ultronPerformanceStageModel6 = new UltronPerformanceStageModel("cacheImageLoadStage");
            ultronPerformanceStageModel6.setStartMills(l.longValue());
            ultronPerformanceStageModel6.setEndMills(l6.longValue());
            str = null;
            z2 = false;
            b.a(ultronPerformanceStageModel6, (String) null, false);
        }
        UltronPerformanceStageModel ultronPerformanceStageModel7 = new UltronPerformanceStageModel("onCreateToRenderEnd");
        ultronPerformanceStageModel7.setStartMills(l2.longValue());
        ultronPerformanceStageModel7.setEndMills(this.g);
        b.a(ultronPerformanceStageModel7, str, z2);
        b.a("d3", "isImageLoaded", String.valueOf(z));
        b.a("d6", "isImageHitCache", String.valueOf(this.l));
        b.a("d7", "isCodeStart", String.valueOf(this.i));
        jqg.b(TAG, this.l ? "图片命中缓存" : "图片未命中缓存");
        b.b(rrv.UPLOAD_TIME, String.valueOf(System.currentTimeMillis()));
        b.a("apmClientContainerRender", this.g, false, (Map<String, String>) null);
        b.a("apmClientFullStageProcess", this.g, false, (Map<String, String>) null);
        b.a(this.k, false, bxd.a("forceFinishOrderPerformance", false), (Map<String, String>) null);
    }

    public Long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("4fdf5f88", new Object[]{this}) : Long.valueOf(this.g);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }
}
