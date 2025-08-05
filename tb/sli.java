package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.datamodel.b;
import java.util.List;
import java.util.Map;
import tb.slk;

/* loaded from: classes5.dex */
public interface sli {
    void a(boolean z, boolean z2);

    boolean enableRecommendMtopNew();

    int getLastDataSequenceNumber();

    boolean getLoadingState(boolean z);

    String getNoMoreMsg();

    String getNoMoreMsgUp();

    int getNoRecReason();

    String getRecommendRequestId();

    List<a> getRelatedCollectionData();

    String getRequestRetCode();

    long getStartRecommendtime();

    Map<String, Object> getTransmission();

    Map<String, Object> getTransmissionUP();

    boolean isDownNoMoreData();

    boolean isHasShowNoMoreMsg();

    boolean isLoadingMore();

    boolean isLoadingUp();

    boolean isNoMoreData();

    boolean isNoMoreDataUp();

    boolean isUpNoMoreData();

    boolean ismHasShowNoMoreMsgUp();

    void postLoadDownRunnable();

    void postLoadMoreRunnable(int i, Map map, com.taobao.android.fluid.core.a<slk.a> aVar);

    void postLoadUpRunnable();

    void postLoadUpRunnable(int i, com.taobao.android.fluid.core.a<slk.a> aVar);

    void removeLoadingRequestCallback(boolean z);

    void requestDetailDataAndRefresh(skd skdVar);

    void requestForCommendData(boolean z, boolean z2, boolean z3, int i, String str, b bVar, com.taobao.android.fluid.core.a<slk.a> aVar);

    void requestListForCollectionPaging(boolean z, int i, Map map, com.taobao.android.fluid.core.a<slk.a> aVar);

    void requestListInternal(boolean z, Map map, com.taobao.android.fluid.core.a<slk.a> aVar);

    void resetNoMoreDataFlag();

    void setHasShowNoMoreMsg(boolean z);

    void setHasShowNoMoreMsgUp(boolean z);

    void setTransmission(Map<String, Object> map);

    void setTransmissionUp(Map<String, Object> map);

    void updateAppendRecommenParams(JSONObject jSONObject);
}
