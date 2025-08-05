package com.taobao.detail.rate.v2;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.ap;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.bk;
import com.taobao.detail.rate.v2.PreviewItemV2;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ept;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u0004\u0018\u000102J\u0010\u00103\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u000105J\u0010\u00106\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u000105J\u0010\u00107\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/taobao/detail/rate/v2/VideoViewHolder;", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "container", "Landroid/view/ViewGroup;", "(Landroid/support/v4/app/FragmentActivity;Landroid/view/ViewGroup;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "defaultIndex", "", "getDefaultIndex", "()I", "setDefaultIndex", "(I)V", "perfTracker", "Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "getPerfTracker", "()Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "setPerfTracker", "(Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;)V", "photoView", "Lcom/taobao/detail/rate/v2/PhotoView;", "getPhotoView", "()Lcom/taobao/detail/rate/v2/PhotoView;", "setPhotoView", "(Lcom/taobao/detail/rate/v2/PhotoView;)V", "rootView", "getRootView", "()Landroid/view/ViewGroup;", "setRootView", "(Landroid/view/ViewGroup;)V", "tbDWInstance", "Lcom/taobao/avplayer/TBDWInstance;", "getTbDWInstance", "()Lcom/taobao/avplayer/TBDWInstance;", "setTbDWInstance", "(Lcom/taobao/avplayer/TBDWInstance;)V", ept.SUB_BIND_VIEW, "", "position", "data", "Lcom/taobao/detail/rate/v2/PreviewItemV2;", "getDwFrontCover", "Lcom/taobao/avplayer/interactivelifecycle/frontcover/model/DWFrontCover;", "coverUrl", "", "getView", "Landroid/view/View;", "initVideoView", "videoInfo", "Lcom/taobao/detail/rate/v2/PreviewItemV2$VideoInfo;", "playVideo", "statFirstFrameCost", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f17030a;
    private ViewGroup b;
    private PhotoView c;
    private bk d;
    private int e;
    private f f;
    private FragmentActivity g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "succPhenixEvent", "Lcom/taobao/phenix/intf/event/SuccPhenixEvent;", "kotlin.jvm.PlatformType", "onHappen"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a<T extends com.taobao.phenix.intf.event.d> implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public final boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent != null && succPhenixEvent.getDrawable() != null) {
                h.a(h.this, this.b);
            }
            return false;
        }
    }

    public h(FragmentActivity fragmentActivity, ViewGroup container) {
        q.d(container, "container");
        this.g = fragmentActivity;
        Context context = container.getContext();
        q.b(context, "container.context");
        this.f17030a = context;
        View inflate = LayoutInflater.from(this.f17030a).inflate(R.layout.rate_preview_video_layout_v2, container, false);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.b = (ViewGroup) inflate;
        ViewGroup viewGroup = this.b;
        View findViewById = viewGroup != null ? viewGroup.findViewById(R.id.rate_image_preview) : null;
        if (findViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.PhotoView");
        }
        this.c = (PhotoView) findViewById;
    }

    public static final /* synthetic */ void a(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5644be23", new Object[]{hVar, new Integer(i)});
        } else {
            hVar.b(i);
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b874e822", new Object[]{this, fVar});
        } else {
            this.f = fVar;
        }
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public final void a(int i, PreviewItemV2 data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52f25e", new Object[]{this, new Integer(i), data});
            return;
        }
        q.d(data, "data");
        this.c.setVisibility(0);
        this.c.enable();
        this.c.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.c.disableRotate();
        this.c.setLongClickable(true);
        PhotoView photoView = this.c;
        PreviewItemV2.VideoInfo video = data.getVideo();
        photoView.setImageUrl(video != null ? video.getPicUrl() : null);
        this.c.succListener(new a(i));
    }

    private final void b(int i) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i != this.e || (fVar = this.f) == null) {
        } else {
            fVar.d();
        }
    }

    public final void a(PreviewItemV2.VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edcbacc", new Object[]{this, videoInfo});
        } else if (this.d != null || videoInfo == null) {
        } else {
            bk.a aVar = new bk.a(this.g);
            aVar.f(true).q(true).i(true);
            aVar.b(videoInfo.getVideoId()).c("TBVideo");
            aVar.c(0);
            aVar.d(ap.b(this.f17030a)).a(DWVideoScreenType.NORMAL);
            Context context = this.f17030a;
            String picUrl = videoInfo.getPicUrl();
            if (picUrl == null) {
                picUrl = "";
            }
            aVar.a(a(context, picUrl));
            aVar.a(DWAspectRatio.DW_CENTER_CROP);
            aVar.N(false);
            aVar.a(videoInfo.getVideoUrl()).e("baobeipingjia");
            aVar.c(true);
            aVar.r(true);
            aVar.s(true);
            aVar.v(true);
            aVar.t(true);
            this.d = aVar.c();
            bk bkVar = this.d;
            if (bkVar != null) {
                bkVar.hideController();
            }
            bk bkVar2 = this.d;
            if (bkVar2 != null) {
                bkVar2.setVideoBackgroundColor(0);
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup == null) {
                return;
            }
            bk bkVar3 = this.d;
            viewGroup.addView(bkVar3 != null ? bkVar3.getView() : null, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void b(PreviewItemV2.VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40130dab", new Object[]{this, videoInfo});
            return;
        }
        a(videoInfo);
        bk bkVar = this.d;
        if (bkVar != null) {
            bkVar.setVideoUrl(videoInfo != null ? videoInfo.getVideoUrl() : null);
        }
        bk bkVar2 = this.d;
        if (bkVar2 == null) {
            return;
        }
        bkVar2.start();
    }

    private final com.taobao.avplayer.interactivelifecycle.frontcover.model.a a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.avplayer.interactivelifecycle.frontcover.model.a) ipChange.ipc$dispatch("a5a40f80", new Object[]{this, context, str});
        }
        com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tUrlImageView.setImageUrl(str);
        aVar.a(tUrlImageView);
        return aVar;
    }
}
