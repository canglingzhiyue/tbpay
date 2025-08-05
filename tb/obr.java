package tb;

import com.taobao.android.fluid.core.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.slk;

/* loaded from: classes5.dex */
public interface obr {
    public static final String TAG = "CollectionPagingManager";

    boolean LoadFromCollectionPagingCache(int i, a<slk.a> aVar, boolean z);

    void checkToInsertDetailList(int i, int i2, int i3, slk.a aVar);

    void collectionPagingInsertData(int i, slk.a aVar, int i2);

    HashMap<Integer, com.taobao.android.fluid.framework.data.datamodel.a> getCollectionMap();

    HashMap<String, Integer> getContentIdMap();

    void requestCollectionList(boolean z, Map map, int i, a<slk.a> aVar);

    void scrollToIndexForPaging(String str, int i);

    ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> syncloadFromCollectionPagingCache(int i);
}
