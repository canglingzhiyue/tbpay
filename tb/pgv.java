package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame;
import com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame;
import com.taobao.taolive.movehighlight.utils.b;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import tb.pgu;

/* loaded from: classes8.dex */
public class pgv extends pgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2050882711);
    }

    public pgv(BaseFrame baseFrame, ViewGroup viewGroup, VideoFrame2 videoFrame2, Context context, TBLiveDataModel tBLiveDataModel, boolean z, pgu.a aVar) {
        super(baseFrame, viewGroup, videoFrame2, context, tBLiveDataModel, z, aVar);
    }

    public pgu b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgu) ipChange.ipc$dispatch("a93711ec", new Object[]{this, aVar});
        }
        this.f32644a = this.h.a();
        if (this.f32644a != null && (!(this.f32644a instanceof HighlightFullScreenFrame) || this.f32644a.isLandscape() != this.g)) {
            this.b.deleteComponent(this.f32644a);
            this.f32644a.onDestroy();
            this.f32644a = null;
            this.c.removeAllViews();
        }
        if (this.f32644a == null) {
            this.f32644a = new HighlightFullScreenFrame(this.e, this.g, this.f, aVar);
            this.f32644a.onCreateView2(this.c);
            this.b.addComponent(this.f32644a);
        }
        this.h.a(this.f32644a);
        return this;
    }

    @Override // tb.pgu
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else if (this.f32644a == null || this.h == null) {
        } else {
            poy.a(this.g, aVar);
            this.h.a(false);
            VideoInfo a2 = k.a(this.f);
            if (this.d != null) {
                if (b.a(this.e, aVar) && !this.g) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((b.e() * 9) / 16, -1);
                    layoutParams.gravity = 17;
                    this.d.updateLayout(layoutParams);
                    if (a2 != null) {
                        this.h.a(a2.backgroundImageURL);
                    }
                } else {
                    this.d.toFullscreen();
                }
                if (this.f32644a instanceof FullScreenFrame) {
                    ((FullScreenFrame) this.f32644a).setBackView(this.d.getContentView());
                }
            }
            a(this.g, aVar);
            this.h.a(this.f32644a);
        }
    }
}
