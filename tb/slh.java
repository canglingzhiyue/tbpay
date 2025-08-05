package tb;

import android.os.Handler;
import com.alibaba.fastjson.JSONArray;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tb.slk;
import tb.snn;
import tb.spy;

/* loaded from: classes5.dex */
public interface slh {
    int addDetailList(int i, slk.a aVar);

    void appendDetailListAtFirst(slk.a aVar);

    void appendDetailListAtLast(slk.a aVar);

    boolean canLoopOnceRequestRecommend();

    void clearListNextData();

    ArrayList<a> convertToMediaSetDataArrayList(slk.a aVar);

    LinkedList<a> convertToMediaSetDataList(List<MediaContentDetailData> list, JSONArray jSONArray);

    String getCurrentContentId();

    int getCurrentDetailSuccessMtopId();

    a.c getCurrentMediaDetail();

    int getCurrentMediaPosition();

    a getCurrentMediaSetData();

    int getIndexOfList(a aVar);

    ArrayList<a> getMediaSetList();

    snn.a getOffsetPosition();

    long getQuickSecondRefreshMd5();

    int getTotalCount();

    ArrayList<a> getUnRemoveMediaSetList();

    List<a> getUnmodifiableMediaSetList();

    Handler getmPreloadNextHandler();

    void insertDetailListAtCurrent(slk.a aVar);

    void refreshCurrentData(a aVar, spy.a aVar2, ptk ptkVar);

    void removeDetailListAtIndex(int i);

    void removeDetailListByIds(List<String> list);

    void removeDetailListWithAuthor(String str);

    void replaceDetail(slk.a aVar, String str);

    void setAutoSlideForNextVideo(FluidContext fluidContext);

    void setLoopOnceRequestRecommend(boolean z);

    void setMediaSet(List<a> list);

    void updateMediaSet(List<a> list);
}
