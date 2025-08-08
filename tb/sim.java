package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.manager.c;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class sim extends pta implements IMediaService.a, hni, sjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sii c;
    private View d;
    private boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    static {
        kge.a(-1432440638);
        kge.a(1120919262);
        kge.a(-303938763);
        kge.a(-1772886997);
    }

    public static /* synthetic */ Object ipc$super(sim simVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1355309186) {
            super.onCreateView((psw) objArr[0], (snp) objArr[1]);
            return null;
        } else if (hashCode != -1294174408) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDisActive((psw) objArr[0]);
            return null;
        }
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "PlayButtonLayer";
    }

    @Override // tb.sjd
    public void cM_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbe4f5c", new Object[]{this});
        }
    }

    @Override // tb.hni
    public void onLoopCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0caff82", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onPreCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9060abe3", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoClose(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c366581f", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoComplete(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6169a058", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoError(psw pswVar, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.hni
    public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.hni
    public void onVideoPrepared(psw pswVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
        }
    }

    @Override // tb.hni
    public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.hni
    public void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ff74ca", new Object[]{this, pswVar, dWVideoScreenType});
        }
    }

    @Override // tb.hni
    public void onVideoSeekTo(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
        }
    }

    @Override // tb.hni
    public void onVideoStateChanged(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400dd041", new Object[]{this, pswVar, new Integer(i)});
        }
    }

    public sim(FluidContext fluidContext, sii siiVar) {
        super(fluidContext, siiVar);
        this.c = siiVar;
        int a2 = obu.a(this.f32873a.getContext(), spj.d(this.f32873a));
        this.h = obx.a(fluidContext.getContext(), 160, true);
        this.i = obx.a(fluidContext.getContext(), 160, true);
        this.f = (a2 - obx.a(fluidContext.getContext(), (int) FaceDetectionReport.NATIVE_EXTRA_FLOAT_OUT_LENGTH, true)) / 2;
        this.g = (ohd.b(fluidContext.getContext()) - this.h) / 2;
        f();
        e();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : StringUtils.equals("true", OrangeConfig.getInstance().getConfig("ShortVideo", "enableFixPause", "true"));
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : StringUtils.equals("true", FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableResumePlay", "true"));
    }

    @Override // tb.pta, tb.snd
    public void onResume() {
        sii siiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!i() || !this.e || (siiVar = this.c) == null || siiVar.k() == null || this.c.k().j() || !this.c.H()) {
            return;
        }
        spz.c("PlayButtonLayer", "onResume -- 前台，主动起播");
        h();
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else if (this.c.k().j()) {
            this.e = true;
            h();
            this.d.setVisibility(0);
            this.c.aa().c(true);
        } else {
            h();
            this.d.setVisibility(8);
            this.c.aa().c(false);
        }
    }

    @Override // tb.pta, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        this.d = this.c.B().findViewById(R.id.imv_play_public_pause);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.width = this.h;
        layoutParams.height = this.i;
        layoutParams.leftMargin = this.g;
        layoutParams.topMargin = this.f;
        this.c.p().c().a(this);
    }

    @Override // tb.sjd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c.k().f() == null || this.c.k().f().e() != 2) {
        } else {
            this.c.X().d.setVisibility(0);
        }
    }

    @Override // tb.pta, tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        super.onDisActive(pswVar);
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.c.k().j()) {
        } else {
            this.d.setVisibility(8);
            this.c.aa().c(false);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.P().a(this);
        }
    }

    @Override // tb.hni
    public void onVideoStart(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef89", new Object[]{this, pswVar});
            return;
        }
        this.e = false;
        d();
    }

    @Override // tb.hni
    public void onVideoPause(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
        } else {
            d();
        }
    }

    @Override // tb.hni
    public void onVideoPlay(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
            return;
        }
        this.e = false;
        d();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        e();
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        IMediaService iMediaService = (IMediaService) this.c.z().getService(IMediaService.class);
        if (iMediaService == null) {
            return;
        }
        iMediaService.setOnStateChangeFromSmallWindowToNormal(this);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.c.k().f() == null) {
        } else {
            if (this.c.k().f().e() == 1) {
                this.c.k().f().c();
                c.a(this.c, "clickPause");
                spz.c("PlayButtonLayer", "Cell ShortVideoCard.onPlayPauseButtonClick clickPause adFlag=" + sju.b(this.c) + ",title=" + sju.a(this.c));
                smk.a(this.c.z(), "3", null, String.valueOf(this.c.r()), null, null);
                b.c(this.c.z(), a.c.a(this.c.D()));
            } else if (com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.b(this.f32873a)) {
                spz.c("PlayButtonLayer", "VideoProcess VideoComponentsController.onPlayPauseButtonClick(), UnderageModeHelper 青少年模式时间限制，禁止播放");
            } else {
                if (this.c.k().f().e() == 2) {
                    this.c.k().f().b();
                } else {
                    d.b(this.c, "play");
                    this.c.k().f().a();
                }
                c.a(this.c, "clickPlay");
                spz.c(sii.TAG, "Cell ShortVideoCard.onPlayPauseButtonClick clickPlay adFlag=" + sju.b(this.c) + ",title=" + sju.a(this.c));
                this.c.ao();
                b.h(this.c.z());
            }
        }
    }

    public Map<String, Integer> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db121866", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x", Integer.valueOf(obx.a(this.f32873a.getContext(), this.g, true)));
        hashMap.put("y", Integer.valueOf(obx.a(this.f32873a.getContext(), this.f, true)));
        hashMap.put("width", Integer.valueOf(obx.a(this.f32873a.getContext(), this.h, true)));
        hashMap.put("height", Integer.valueOf(obx.a(this.f32873a.getContext(), this.i, true)));
        return hashMap;
    }
}
