package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view.InfoFlowRecyclerView;
import tb.lks;

/* loaded from: classes7.dex */
public class lhy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1657427609);
    }

    public RecyclerView a(Context context, final lkt<?> lktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("925e8889", new Object[]{this, context, lktVar});
        }
        InfoFlowRecyclerView infoFlowRecyclerView = new InfoFlowRecyclerView(context);
        infoFlowRecyclerView.setOnWindowVisibilityChangedListener(new lks.d() { // from class: tb.lhy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.d
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else {
                    lktVar.a(z);
                }
            }
        });
        infoFlowRecyclerView.setOnFeedsLayoutListener(new lks.b() { // from class: tb.lhy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.b
            public void dM_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32a48a9d", new Object[]{this});
                } else {
                    lktVar.a();
                }
            }

            @Override // tb.lks.b
            public void dT_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e9676f6", new Object[]{this});
                } else {
                    lktVar.b();
                }
            }
        });
        infoFlowRecyclerView.setFirstScreenDiffRefreshListener(new lks.e() { // from class: tb.lhy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    lktVar.e();
                }
            }
        });
        return infoFlowRecyclerView;
    }
}
