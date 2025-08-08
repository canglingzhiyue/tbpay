package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame;
import com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame;
import com.taobao.taolive.movehighlight.utils.b;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.u;
import tb.pgu;

/* loaded from: classes8.dex */
public class pgw extends pgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(509664571);
    }

    public pgw(BaseFrame baseFrame, ViewGroup viewGroup, VideoFrame2 videoFrame2, Context context, TBLiveDataModel tBLiveDataModel, boolean z, pgu.a aVar) {
        super(baseFrame, viewGroup, videoFrame2, context, tBLiveDataModel, z, aVar);
    }

    public pgw a(final pgu.a aVar) {
        PlayerController2 playerController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgw) ipChange.ipc$dispatch("fc3d429", new Object[]{this, aVar});
        }
        if (this.d != null && (playerController = this.d.getPlayerController()) != null) {
            playerController.setToggleScreenListener(new PlayerController2.f() { // from class: tb.pgw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.f
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.f
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                    }
                    return true;
                }
            });
        }
        return this;
    }

    public pgw c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgw) ipChange.ipc$dispatch("1e6c6a7c", new Object[]{this});
        }
        if (this.d != null) {
            PlayerController2 playerController = this.d.getPlayerController();
            if (u.ad() && playerController != null) {
                playerController.hideController();
            }
        }
        return this;
    }

    public pgw b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgw) ipChange.ipc$dispatch("a937122a", new Object[]{this, aVar});
        }
        if (u.ae()) {
            this.f32644a = this.h.a();
            if (this.f32644a != null && (!(this.f32644a instanceof HighlightFullScreenFrame) || this.f32644a.isLandscape())) {
                this.b.deleteComponent(this.f32644a);
                this.f32644a.onDestroy();
                this.f32644a = null;
                this.c.removeAllViews();
            }
            if (this.f32644a == null) {
                this.f32644a = new HighlightFullScreenFrame(this.e, false, this.f, aVar);
                this.f32644a.onCreateView2(this.c);
                this.b.addComponent(this.f32644a);
            }
            this.h.a(this.f32644a);
        }
        return this;
    }

    @Override // tb.pgu
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else if (this.f32644a == null || this.h == null) {
        } else {
            this.h.a(true);
            if (u.ae() && this.d != null) {
                int a2 = a();
                final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a2);
                int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
                VideoInfo a3 = k.a(this.f);
                if (a3 != null) {
                    a3.positionForVideo = "0.2";
                    if (!StringUtils.isEmpty(a3.positionForVideo)) {
                        int c = (int) (b.c() * l.c(a3.positionForVideo));
                        if (a2 + c + poy.aq(aVar) <= b.c()) {
                            dimensionPixelSize = c;
                        }
                    }
                }
                layoutParams.topMargin = dimensionPixelSize;
                this.c.post(new Runnable() { // from class: tb.pgw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            pgw.this.d.updateLayout(layoutParams);
                        }
                    }
                });
                if (this.f32644a instanceof FullScreenFrame) {
                    ((FullScreenFrame) this.f32644a).setBackView(this.d.getContentView());
                }
                if (a3 != null) {
                    this.h.a(a3.backgroundImageURL);
                }
            } else if (this.d != null) {
                this.d.toHalfscreen(a());
            }
            a(false, aVar);
            this.h.a(this.f32644a);
        }
    }
}
