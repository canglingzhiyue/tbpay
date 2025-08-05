package com.taobao.detail.rate.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.v2.PreviewItemV2;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ept;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/taobao/detail/rate/v2/ImageViewHolder;", "", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "defaultIndex", "", "getDefaultIndex", "()I", "setDefaultIndex", "(I)V", "perfTracker", "Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "getPerfTracker", "()Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "setPerfTracker", "(Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;)V", "photoView", "Lcom/taobao/detail/rate/v2/PhotoView;", "getPhotoView", "()Lcom/taobao/detail/rate/v2/PhotoView;", "setPhotoView", "(Lcom/taobao/detail/rate/v2/PhotoView;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", ept.SUB_BIND_VIEW, "", "position", "data", "Lcom/taobao/detail/rate/v2/PreviewItemV2;", "getView", "statFirstFrameCost", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f17025a;
    private View b;
    private PhotoView c;
    private int d;
    private f e;

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
                b.a(b.this, this.b);
            }
            return false;
        }
    }

    public b(ViewGroup container) {
        q.d(container, "container");
        Context context = container.getContext();
        q.b(context, "container.context");
        this.f17025a = context;
        this.b = LayoutInflater.from(this.f17025a).inflate(R.layout.rate_preview_video_layout_v2, container, false);
        View view = this.b;
        View findViewById = view != null ? view.findViewById(R.id.rate_image_preview) : null;
        if (findViewById != null) {
            this.c = (PhotoView) findViewById;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.PhotoView");
    }

    public static final /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f0311d", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.b(i);
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b874e822", new Object[]{this, fVar});
        } else {
            this.e = fVar;
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
        PreviewItemV2.PicInfo pic = data.getPic();
        photoView.setImageUrl(pic != null ? pic.getPicUrl() : null);
        this.c.succListener(new a(i));
    }

    private final void b(int i) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i != this.d || (fVar = this.e) == null) {
        } else {
            fVar.d();
        }
    }
}
