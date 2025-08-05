package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.usertracker.a;
import java.util.Map;
import tb.hjl;
import tb.shm;
import tb.snz;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public final class kzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sic f30415a;
    private long b;
    private long c = 0;
    private long d = 0;
    private boolean e = false;
    private long f = 0;
    private final FluidContext g;

    static {
        kge.a(765251928);
    }

    public static /* synthetic */ long a(kzl kzlVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50844d3d", new Object[]{kzlVar, new Long(j)})).longValue();
        }
        kzlVar.d = j;
        return j;
    }

    public static /* synthetic */ sic a(kzl kzlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sic) ipChange.ipc$dispatch("26f6521e", new Object[]{kzlVar}) : kzlVar.f30415a;
    }

    public static /* synthetic */ long b(kzl kzlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e097cb50", new Object[]{kzlVar})).longValue() : kzlVar.b;
    }

    public static /* synthetic */ long b(kzl kzlVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("326216dc", new Object[]{kzlVar, new Long(j)})).longValue();
        }
        kzlVar.c = j;
        return j;
    }

    public static /* synthetic */ long c(kzl kzlVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("143fe07b", new Object[]{kzlVar, new Long(j)})).longValue();
        }
        kzlVar.b = j;
        return j;
    }

    public kzl(FluidContext fluidContext, sic sicVar) {
        this.g = fluidContext;
        this.f30415a = sicVar;
        e();
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        spz.c("tbVideoSdkLiveCard", "onRequestMediaPlayer 重置 业务开始 时间=" + this.b);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e) {
        } else {
            long j = this.f;
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            long j3 = this.c;
            if (j3 <= 0) {
                return;
            }
            long j4 = j3 - this.d;
            long j5 = j3 - j;
            long j6 = this.b;
            long j7 = j6 > 0 ? j3 - j6 : 0L;
            sic sicVar = this.f30415a;
            String valueOf = String.valueOf(j5);
            if (j7 >= 0) {
                j2 = j7;
            }
            d.a(sicVar, "live_start_play", valueOf, String.valueOf(j2), String.valueOf(j4), "");
            this.e = true;
            spz.c("tbVideoSdkLiveCard", "真实加载时长=" + j5 + "业务开始时间=" + this.b + " 体验时长 = " + j7 + " 渲染时长=" + j4);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f30415a.O().a(new snz.a() { // from class: tb.kzl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.snz.a, tb.snz
            public void onRequestMediaPlayer(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
                } else {
                    pil.a(kzl.a(kzl.this).y(), spj.j(kzl.a(kzl.this).z()), "gg_videoMutiTab_livePlay");
                }
            }
        });
        this.f30415a.P().a(new hjl.a() { // from class: tb.kzl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hjl.a, tb.hjl
            public boolean onInfo(psw pswVar, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("2e7af9b2", new Object[]{this, pswVar, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (3 == j) {
                    spz.a("tbVideoSdkLiveCard", "IDWVideoLifecycleListener onVideoFirstFrame ");
                    if (obj instanceof Map) {
                        try {
                            kzl.a(kzl.this, ((Long) ((Map) obj).get("RENDER_START_TIME")).longValue());
                            kzl.b(kzl.this, ((Long) ((Map) obj).get("RENDER_END_TIME")).longValue());
                            kzl.this.d();
                        } catch (Exception unused) {
                        }
                    }
                    pil.a(kzl.a(kzl.this).y(), spj.j(kzl.a(kzl.this).z()), "gg_videoMutiTab_livePlay", null);
                    a.a().b(spj.j(kzl.a(kzl.this).z()), a.FIRST_FRAME_RENDER_FINISH);
                    ljq.d(kzl.a(kzl.this), ImageLoader.Scene.FIRST_FRAME);
                    ljm.a(kzl.a(kzl.this).z(), 3, kzl.a(kzl.this).v().a());
                }
                return false;
            }
        });
        this.f30415a.P().a(new hjl.a() { // from class: tb.kzl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hjl.a, tb.hjl
            public void onPrepared(psw pswVar, IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec4c7581", new Object[]{this, pswVar, iMediaPlayer});
                } else {
                    ljq.d(kzl.a(kzl.this), "prepared");
                }
            }
        });
        this.f30415a.P().a(new hjl.a() { // from class: tb.kzl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hjl.a, tb.hjl
            public boolean onError(psw pswVar, IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("193dfed2", new Object[]{this, pswVar, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                sic a2 = kzl.a(kzl.this);
                ljq.d(a2, "error(" + i + riy.BRACKET_END_STR);
                sme.b(kzl.a(kzl.this), "finished");
                pil.a(kzl.a(kzl.this).y(), spj.j(kzl.a(kzl.this).z()), "liveError", "gg_videoMutiTab_livePlay", null);
                a.a().b(spj.j(kzl.a(kzl.this).z()), a.FIRST_FRAME_RENDER_FINISH);
                return false;
            }
        });
        this.f30415a.t().addCardLifecycleListener(new shm.a() { // from class: tb.kzl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.shm.a, tb.shm
            public void onActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                    return;
                }
                kzl.c(kzl.this, System.currentTimeMillis());
                spz.c("tbVideoSdkLiveCard", "doActive 时间=" + kzl.b(kzl.this));
                kzl.this.d();
            }
        });
    }
}
