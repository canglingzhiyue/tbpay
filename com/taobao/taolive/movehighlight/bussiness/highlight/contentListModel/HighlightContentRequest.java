package com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class HighlightContentRequest implements INetDataObject {
    public String entryLiveSource;
    public String keyPointId;
    public String liveId;
    public String liveSource;
    public String transParams;
    public String API_NAME = "mtop.tblive.timemoving.content.query.list";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public int s = 0;
    public int n = 10;

    static {
        kge.a(-2116445590);
        kge.a(-540945145);
    }
}
