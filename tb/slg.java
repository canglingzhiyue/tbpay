package tb;

import com.taobao.android.fluid.core.a;
import com.taobao.android.fluid.framework.data.datamodel.b;
import java.util.LinkedList;
import java.util.List;
import tb.slk;

/* loaded from: classes5.dex */
public interface slg {
    public static final int WITHOUT_COLLECTION_CONTENT_ORDER = -1;

    boolean dynamicRecommend(b bVar);

    boolean dynamicRecommend(b bVar, a<slk.a> aVar);

    boolean feedbackRequest(b bVar);

    LinkedList<slk.a> getFeedbackList();

    boolean reOrderTailUnExposeList(List<String> list);

    void updateNoDynamicRecContents(String str, boolean z);
}
