package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class BottomHotSaleDo implements INetDataObject {
    public String bizType;
    public long disappearTime;
    public List<HotSaleItem> itemsList;
    public long liveId;
    public long pullInterval;

    static {
        kge.a(852598196);
        kge.a(-540945145);
    }
}
