package tb;

import com.taobao.android.fluid.framework.data.remote.a;
import java.util.List;
import java.util.Map;
import tb.skv;

/* loaded from: classes5.dex */
public interface skx {
    void fetchContentDetail(a.C0494a c0494a, skv.a aVar);

    void fetchContentDetail(Map map, boolean z, boolean z2);

    void fetchContentDetail(Map map, boolean z, boolean z2, boolean z3, skd skdVar);

    long getBeforeDetailMtopTime();

    List<com.taobao.android.fluid.framework.data.datamodel.a> getDetailMediaSetDataList();

    long getDetailMtopCost();

    long getDetailMtopSuccessTIme();

    String getDetailRequestRefreshType();

    String getDetailRequestRetCode();

    int getDetailRequestStatus();

    slu getDetailUnlikeRecorder();

    jqu getDetailVideoPositiveFeedbackIdsModel();

    String getPreloadUseCacheValue();

    boolean isDetailLoading();

    boolean isDetailMTopSuccess();

    boolean isHasPageErrorShow();

    boolean isTab3FirstCellIconStreamRequestDetail();

    boolean isTab3LauncherHitMtopPrefetch();

    void setBeforeDetailMtopTime(long j);

    void setDetailMtopCost(long j);

    void setDetailMtopSuccessTIme(long j);

    void setPreloadUseCacheValue(String str);

    void setTab3LauncherHitMtopPrefetch(boolean z);
}
