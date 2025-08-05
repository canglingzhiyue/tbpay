package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.pagev2.b;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbWeexViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "weexManager", "Lcom/taobao/mytaobao/pagev2/MtbWeexManager;", "flContainer", "Landroid/widget/FrameLayout;", "(Lcom/taobao/mytaobao/pagev2/MtbWeexManager;Landroid/widget/FrameLayout;)V", "lastUrl", "", ept.SUB_BIND_VIEW, "", "data", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "considerRemoveOldWeexView", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoa extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f34418a;
    private final b b;
    private final FrameLayout c;

    static {
        kge.a(1765664755);
    }

    public static /* synthetic */ Object ipc$super(xoa xoaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoa(b weexManager, FrameLayout flContainer) {
        super(flContainer);
        q.c(weexManager, "weexManager");
        q.c(flContainer, "flContainer");
        this.b = weexManager;
        this.c = flContainer;
    }

    public final void a(xol data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8c263", new Object[]{this, data});
            return;
        }
        q.c(data, "data");
        String a2 = xom.a(data);
        if (a2 == null || q.a((Object) a2, (Object) this.f34418a)) {
            return;
        }
        this.f34418a = a2;
        a();
        MTPtrRecyclerView a3 = this.b.a();
        if (a3 == null) {
            q.a();
        }
        int width = a3.getWidth();
        MTPtrRecyclerView a4 = this.b.a();
        if (a4 == null) {
            q.a();
        }
        int height = a4.getHeight() - mxo.g();
        Log.e("ddsw", "dstWidth=" + width + " dstHeight=" + height);
        b bVar = this.b;
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        Context context = itemView.getContext();
        q.a((Object) context, "itemView.context");
        this.c.addView(bVar.a(context, width, height, a2, data), -1, height);
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View childAt = this.c.getChildAt(0);
        if (!(childAt instanceof MTBBasementContainerView)) {
            childAt = null;
        }
        MTBBasementContainerView mTBBasementContainerView = (MTBBasementContainerView) childAt;
        if (mTBBasementContainerView == null) {
            return;
        }
        mTBBasementContainerView.onDestroy();
        this.c.removeAllViews();
    }
}
