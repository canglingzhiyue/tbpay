package com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodRecommendDO implements INetDataObject {
    public long dataSize;
    public List<ImportantEventItem> items;
    public long pullInterval;
    public long showGroupCount;
    public long showItemDelay;

    static {
        kge.a(-1203251061);
        kge.a(-540945145);
    }
}
