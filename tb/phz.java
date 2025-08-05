package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import tb.phx;

/* loaded from: classes8.dex */
public class phz extends phx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(475505189);
    }

    public static /* synthetic */ void lambda$OWWZfDYMC92ilo1CEtkELNfr6Ww(phz phzVar) {
        phzVar.f();
    }

    public phz(BaseFrame baseFrame, ViewGroup viewGroup, VideoFrame2 videoFrame2, Context context, TBLiveDataModel tBLiveDataModel, boolean z, a aVar, phx.a aVar2) {
        super(baseFrame, viewGroup, videoFrame2, context, tBLiveDataModel, z, aVar, aVar2);
    }

    public phx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phx) ipChange.ipc$dispatch("f09239e", new Object[]{this});
        }
        this.f32670a = this.h.c();
        if (this.f32670a != null && (!f.u().isInstanceOfFullScreenLiveFrame2(this.f32670a) || this.f32670a.isLandscape() != this.g)) {
            this.b.deleteComponent(this.f32670a);
            this.f32670a.onDestroy();
            this.f32670a = null;
            try {
                this.c.removeAllViews();
            } catch (Exception e) {
                ab.b("TaoliveFullRoomScreen", "setupLiveRoomScreen EXP: " + e.getMessage());
            }
        }
        if (this.f32670a == null) {
            this.f32670a = f.u().createFullScreenLiveFrame2(this.e, this.g, this.f, this.i);
            if (this.f32670a != null) {
                this.f32670a.onCreateView2(this.c);
                this.b.addComponent(this.f32670a);
            }
        }
        this.h.a(this.f32670a);
        ADaemon.postMainLooper(new Runnable() { // from class: tb.-$$Lambda$phz$OWWZfDYMC92ilo1CEtkELNfr6Ww
            @Override // java.lang.Runnable
            public final void run() {
                phz.lambda$OWWZfDYMC92ilo1CEtkELNfr6Ww(phz.this);
            }
        }, new long[0]);
        return this;
    }

    public /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        PlayerController2 playerController2 = null;
        if (this.d != null) {
            playerController2 = this.d.getPlayerController();
        }
        if (playerController2 == null) {
            return;
        }
        playerController2.setDefaultControllerHolder(this.i);
        playerController2.hideController();
    }

    public phx b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phx) ipChange.ipc$dispatch("16bac8fd", new Object[]{this});
        }
        this.f32670a = this.h.c();
        if (this.f32670a != null && (!f.u().isInstanceOfFullScreenReplayFrame2(this.f32670a) || this.f32670a.isLandscape() != this.g)) {
            this.b.deleteComponent(this.f32670a);
            this.f32670a.onDestroy();
            this.f32670a = null;
            try {
                this.c.removeAllViews();
            } catch (Exception e) {
                ab.b("TaoliveFullRoomScreen", "setupReplayRoomScreen EXP: " + e.getMessage());
            }
        }
        if (this.f32670a == null) {
            this.f32670a = f.u().createFullScreenReplayFrame2(this.e, this.g, this.f, this.i);
            if (this.f32670a != null) {
                this.f32670a.onCreateView2(this.c);
                this.b.addComponent(this.f32670a);
            }
        }
        this.h.a(this.f32670a);
        return this;
    }

    @Override // tb.phx
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f32670a == null || this.h == null) {
        } else {
            poy.a(this.g, this.i);
            this.h.a(false);
            VideoInfo a2 = k.a(this.f);
            if (this.d != null) {
                if (d.d(this.e) && !this.g) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((d.f() * 9) / 16, -1);
                    layoutParams.gravity = 17;
                    this.d.updateLayout(layoutParams);
                    if (a2 != null) {
                        this.h.a(a2.backgroundImageURL);
                    }
                } else {
                    this.d.toFullscreen();
                }
                if (this.f32670a instanceof ppy) {
                    ((ppy) this.f32670a).setBackView(this.d.getContentView());
                }
            }
            if (!aa.bH()) {
                a(this.g);
            }
            this.h.a(this.f32670a);
            poy.a(this.g, this.i);
        }
    }
}
