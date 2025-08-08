package tb;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.view.item.ILoadMoreItemRender;
import com.taobao.infoflow.protocol.view.item.b;
import com.taobao.infoflow.protocol.view.item.c;
import java.util.List;

/* loaded from: classes7.dex */
public class lig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final c f30650a;
    private final RecyclerView b;

    static {
        kge.a(-1528821033);
    }

    public lig(RecyclerView recyclerView, c cVar) {
        this.b = recyclerView;
        this.f30650a = cVar;
    }

    public void a(List<BaseSectionModel> list, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74a0da5", new Object[]{this, list, new Boolean(z), str});
        } else if (!a(list)) {
        } else {
            b a2 = this.f30650a.a(a.b().getSectionBizCode());
            if (!(a2 instanceof ILoadMoreItemRender)) {
                return;
            }
            ILoadMoreItemRender iLoadMoreItemRender = (ILoadMoreItemRender) a2;
            iLoadMoreItemRender.a(false, str);
            if (!z || !b(list)) {
                return;
            }
            iLoadMoreItemRender.a(true, str);
        }
    }

    private boolean a(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue() : list != null && !list.isEmpty() && list.size() > 1 && StringUtils.equals(list.get(list.size() - 1).getSectionBizCode(), "loading");
    }

    private boolean b(List<BaseSectionModel> list) {
        lib libVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
        }
        RecyclerView recyclerView = this.b;
        int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPositions(null);
        return (findLastVisibleItemPositions[0] != list.size() - 1 || (libVar = (lib) recyclerView.findViewHolderForAdapterPosition(findLastVisibleItemPositions[0])) == null || libVar.b() == null) ? false : true;
    }
}
