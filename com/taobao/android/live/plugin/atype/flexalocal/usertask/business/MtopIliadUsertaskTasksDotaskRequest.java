package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopIliadUsertaskTasksDotaskRequest implements INetDataObject {
    public String appVersion;
    private String API_NAME = "mtop.iliad.usertask.tasks.dotask";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public long deliveryId = 0;
    public String liveSource = null;
    public String entryLiveSource = null;
    public String userTaskParams = null;

    static {
        kge.a(-824409882);
        kge.a(-540945145);
    }
}
