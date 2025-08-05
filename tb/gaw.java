package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;

/* loaded from: classes5.dex */
public class gaw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(60971368);
    }

    public static TBAbsRefreshHeader.RefreshState a(DXRefreshState dXRefreshState, TBAbsRefreshHeader.RefreshState refreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAbsRefreshHeader.RefreshState) ipChange.ipc$dispatch("ca115921", new Object[]{dXRefreshState, refreshState});
        }
        if (dXRefreshState == null) {
            return null;
        }
        return dXRefreshState == DXRefreshState.None ? TBAbsRefreshHeader.RefreshState.NONE : dXRefreshState == DXRefreshState.PullDownToRefresh ? TBAbsRefreshHeader.RefreshState.PULL_TO_REFRESH : dXRefreshState == DXRefreshState.ReleaseToRefresh ? TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH : dXRefreshState == DXRefreshState.Refreshing ? TBAbsRefreshHeader.RefreshState.REFRESHING : dXRefreshState == DXRefreshState.RefreshFinish ? TBAbsRefreshHeader.RefreshState.NONE : dXRefreshState == DXRefreshState.ReleaseToTwoLevel ? TBAbsRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR : refreshState;
    }
}
