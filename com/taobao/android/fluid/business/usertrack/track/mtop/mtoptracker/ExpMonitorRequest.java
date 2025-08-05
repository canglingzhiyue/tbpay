package com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public final class ExpMonitorRequest implements IMTOPDataObject {
    public String sid;
    public String source;
    public String type;
    private final String API_NAME = "mtop.mediainteraction.video.experience.report";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String body = null;

    static {
        kge.a(1114628310);
        kge.a(-350052935);
    }

    public String getApi() {
        return "mtop.mediainteraction.video.experience.report";
    }
}
