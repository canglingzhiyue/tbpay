package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.view.feeds.d;

/* loaded from: classes5.dex */
public class flm implements RecyclerView.OnChildAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f28033a;

    static {
        kge.a(-1899823997);
        kge.a(-1469681034);
    }

    public flm(b bVar) {
        this.f28033a = bVar;
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517542da", new Object[]{this, view});
        } else if (view.getTag(d.TAG_VIEW_HOLDER.hashCode()) == null) {
        } else {
            ((d) view.getTag(d.TAG_VIEW_HOLDER.hashCode())).B();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
        } else if (view.getTag(d.TAG_VIEW_HOLDER.hashCode()) == null) {
        } else {
            ((d) view.getTag(d.TAG_VIEW_HOLDER.hashCode())).C();
        }
    }
}
