package com.taobao.taolive.sdk.business.interact.favor;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class FavorRequest implements INetDataObject {
    public String extraFlag;
    private String API_NAME = "mtop.taobao.iliad.recommend.publish";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public long count = 0;
    public String topic = null;
    public String relatedTopic = null;

    static {
        kge.a(1197021109);
        kge.a(-540945145);
    }
}
