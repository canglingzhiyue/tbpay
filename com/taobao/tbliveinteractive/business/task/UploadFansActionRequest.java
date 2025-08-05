package com.taobao.tbliveinteractive.business.task;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class UploadFansActionRequest implements INetDataObject {
    public String action;
    public String params;
    public String scopeId;
    public String subScope;
    public String trackParams;
    private String API_NAME = "mtop.taobao.iliad.task.action";
    private String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        kge.a(-384535869);
        kge.a(-540945145);
    }
}
