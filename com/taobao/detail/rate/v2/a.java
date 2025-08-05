package com.taobao.detail.rate.v2;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import com.taobao.detail.rate.v2.PreviewItemV2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.sur;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0014\u0010\u001d\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\tJ\u0010\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u000eJ \u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/taobao/detail/rate/v2/CommonPageAdapterV2;", "Landroid/support/v4/view/PagerAdapter;", "activity", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/support/v4/app/FragmentActivity;)V", sur.CALLBACK_DATA_LIST, "", "Lcom/taobao/detail/rate/v2/PreviewItemV2;", "defaultIndex", "", "imageViewPool", "Ljava/util/Queue;", "Landroid/view/View;", "perfTracker", "Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "videoViewPool", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "obj", "", "getCount", "getData", "instantiateItem", "isViewFromObject", "", "p0", "setData", "data", "setDefaultIndex", "index", "setPerfTracker", "tracker", "setPrimaryItem", "statViewGet", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class a extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<PreviewItemV2> f17024a = new ArrayList();
    private final Queue<View> b = new LinkedList();
    private final Queue<View> c = new LinkedList();
    private f d;
    private int e;
    private FragmentActivity f;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(FragmentActivity fragmentActivity) {
        this.f = fragmentActivity;
    }

    public final void a(List<PreviewItemV2> data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, data});
            return;
        }
        q.d(data, "data");
        this.f17024a = data;
    }

    public final List<PreviewItemV2> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f17024a;
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
            this.d = fVar;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f17024a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View p0, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, p0, obj})).booleanValue();
        }
        q.d(p0, "p0");
        q.d(obj, "obj");
        return q.a(p0, obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup container, int i) {
        h hVar;
        View view;
        b bVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, container, new Integer(i)});
        }
        q.d(container, "container");
        if (this.f17024a.get(i).getVideo() == null) {
            z = false;
        }
        if (!z) {
            if (this.b.size() > 0) {
                view = this.b.poll();
                q.b(view, "view");
                Object tag = view.getTag();
                if (tag == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.ImageViewHolder");
                }
                bVar = (b) tag;
            } else {
                bVar = new b(container);
                bVar.a(this.e);
                bVar.a(this.d);
                view = bVar.a();
                if (view != null) {
                    view.setTag(bVar);
                }
            }
            bVar.a(i, this.f17024a.get(i));
        } else {
            if (this.c.size() > 0) {
                view = this.c.poll();
                q.b(view, "view");
                Object tag2 = view.getTag();
                if (tag2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.VideoViewHolder");
                }
                hVar = (h) tag2;
            } else {
                hVar = new h(this.f, container);
                hVar.a(this.e);
                hVar.a(this.d);
                view = hVar.a();
                if (view != null) {
                    view.setTag(hVar);
                }
            }
            hVar.a(i, this.f17024a.get(i));
        }
        container.addView(view);
        b(i);
        if (view == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        return view;
    }

    private final void b(int i) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i != this.e || (fVar = this.d) == null) {
        } else {
            fVar.c();
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup container, int i, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, container, new Integer(i), obj});
            return;
        }
        q.d(container, "container");
        q.d(obj, "obj");
        View view = (View) obj;
        container.removeView(view);
        Object tag = view.getTag();
        if (tag != null ? tag instanceof b : true) {
            this.b.offer(view);
            return;
        }
        Object tag2 = view.getTag();
        if (tag2 != null) {
            z = tag2 instanceof h;
        }
        if (!z) {
            return;
        }
        this.c.offer(view);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup container, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, container, new Integer(i), obj});
            return;
        }
        q.d(container, "container");
        q.d(obj, "obj");
        super.setPrimaryItem(container, i, obj);
        u.d("CommonPageAdapterV2", "setPrimaryItem " + i);
        if (!(obj instanceof View)) {
            return;
        }
        View view = (View) obj;
        if (!(view.getTag() instanceof h)) {
            return;
        }
        PreviewItemV2.VideoInfo video = this.f17024a.get(i).getVideo();
        Object tag = view.getTag();
        if (tag == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.VideoViewHolder");
        }
        ((h) tag).b(video);
    }
}
