package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import tb.phx;

/* loaded from: classes8.dex */
public class pia extends phx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1065712951);
    }

    public pia(BaseFrame baseFrame, ViewGroup viewGroup, VideoFrame2 videoFrame2, Context context, TBLiveDataModel tBLiveDataModel, boolean z, a aVar, phx.a aVar2) {
        super(baseFrame, viewGroup, videoFrame2, context, tBLiveDataModel, z, aVar, aVar2);
    }

    public pia a(final phx.a aVar) {
        PlayerController2 playerController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pia) ipChange.ipc$dispatch("bd2ab623", new Object[]{this, aVar});
        }
        if (this.d != null && (playerController = this.d.getPlayerController()) != null) {
            playerController.setToggleScreenListener(new PlayerController2.f() { // from class: tb.pia.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.f
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    if (pia.this.i != null && (pia.this.i instanceof g) && ((g) pia.this.i).o() != null && ((g) pia.this.i).o().abilityCompontent != null && !((g) pia.this.i).o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate)) {
                        return true;
                    }
                    aVar.a();
                    return true;
                }

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.f
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                    }
                    if (pia.this.i != null && (pia.this.i instanceof g) && ((g) pia.this.i).o() != null && ((g) pia.this.i).o().abilityCompontent != null && !((g) pia.this.i).o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate)) {
                        return true;
                    }
                    aVar.b();
                    return true;
                }
            });
        }
        return this;
    }

    public pia f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pia) ipChange.ipc$dispatch("35815f71", new Object[]{this});
        }
        if (this.d != null) {
            PlayerController2 playerController = this.d.getPlayerController();
            if (aa.Y() && playerController != null) {
                playerController.hideController();
            }
        }
        return this;
    }

    public pia g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pia) ipChange.ipc$dispatch("3d3304d0", new Object[]{this});
        }
        this.f32670a = this.h.c();
        if (this.f32670a != null && (!f.u().isInstanceOfFullScreenLiveFrame2(this.f32670a) || this.f32670a.isLandscape())) {
            this.b.deleteComponent(this.f32670a);
            this.f32670a.onDestroy();
            this.f32670a = null;
            this.c.removeAllViews();
        }
        if (this.f32670a == null) {
            this.i.b = false;
            this.f32670a = f.u().createFullScreenLiveFrame2(this.e, false, this.f, this.i);
            if (this.f32670a != null) {
                this.f32670a.onCreateView2(this.c);
                this.b.addComponent(this.f32670a);
            }
        }
        this.h.a(this.f32670a);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.pia.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                PlayerController2 playerController;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (pia.this.d == null || (playerController = pia.this.d.getPlayerController()) == null) {
                } else {
                    playerController.setDefaultControllerHolder(pia.this.i);
                    if (poy.at(pia.this.i)) {
                        playerController.showController(4);
                    } else {
                        playerController.showController(3);
                    }
                }
            }
        });
        return this;
    }

    public pia h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pia) ipChange.ipc$dispatch("44e4aa2f", new Object[]{this});
        }
        if (aa.X()) {
            this.f32670a = this.h.c();
            if (this.f32670a != null && (!f.u().isInstanceOfFullScreenReplayFrame2(this.f32670a) || this.f32670a.isLandscape())) {
                this.b.deleteComponent(this.f32670a);
                this.f32670a.onDestroy();
                this.f32670a = null;
                this.c.removeAllViews();
            }
            if (this.f32670a == null) {
                this.f32670a = f.u().createFullScreenReplayFrame2(this.e, false, this.f, this.i);
                if (this.f32670a != null) {
                    this.f32670a.onCreateView2(this.c);
                    this.b.addComponent(this.f32670a);
                }
            }
            this.h.a(this.f32670a);
        }
        return this;
    }

    @Override // tb.phx
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f32670a == null || this.h == null) {
        } else {
            this.h.a(true);
            if (aa.X() && this.d != null) {
                int d = d();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, d);
                int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
                VideoInfo a2 = k.a(this.f);
                if (a2 != null) {
                    a2.positionForVideo = "0.2";
                    if (!TextUtils.isEmpty(a2.positionForVideo)) {
                        int d2 = (int) (d.d() * v.d(a2.positionForVideo));
                        if (d + d2 + poy.aq(this.i) <= d.d()) {
                            dimensionPixelSize = d2;
                        }
                    }
                }
                layoutParams.topMargin = dimensionPixelSize;
                this.d.updateLayout(layoutParams);
                if (this.f32670a instanceof ppy) {
                    ((ppy) this.f32670a).setBackView(this.d.getContentView());
                }
                if (a2 != null) {
                    this.h.a(a2.backgroundImageURL);
                }
            } else if (this.d != null) {
                this.d.toHalfscreen(d());
            }
            a(false);
            this.h.a(this.f32670a);
        }
    }
}
