package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/mytaobao/pagev2/ui/RefreshHeaderUIHelper;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "refreshHeader", "Lcom/taobao/uikit/extend/component/refresh/TBOldRefreshHeader;", "refreshLayout", "Lcom/taobao/uikit/extend/component/refresh/TBSwipeRefreshLayout;", "getRefreshLayout", "()Lcom/taobao/uikit/extend/component/refresh/TBSwipeRefreshLayout;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xou {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TBSwipeRefreshLayout f34444a;
    private final TBOldRefreshHeader b;

    static {
        kge.a(-1461570927);
    }

    public xou(Context ctx) {
        q.c(ctx, "ctx");
        this.f34444a = new TBSwipeRefreshLayout(ctx);
        this.b = new TBOldRefreshHeader(ctx);
        this.f34444a.enableLoadMore(false);
        this.b.setBackground(null);
        this.f34444a.setHeaderView(this.b);
        this.f34444a.setCustomRefreshHeight(DensityUtil.dip2px(ctx, 40.0f));
        this.f34444a.enablePullRefresh(true);
        this.f34444a.setDragRate(0.75f);
    }

    public final TBSwipeRefreshLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout) ipChange.ipc$dispatch("3c0cc049", new Object[]{this}) : this.f34444a;
    }
}
