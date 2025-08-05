package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionCancelRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.alimp.bentley.subscribe.center.action.cancel";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String topicId = null;
    private String activityType = null;
    private long version = 0;
    private String sdkVersion = "";
    private String subFrom = null;

    static {
        kge.a(1093785772);
        kge.a(-350052935);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public String getTopicId() {
        return this.topicId;
    }

    public void setTopicId(String str) {
        this.topicId = str;
    }

    public String getActivityType() {
        return this.activityType;
    }

    public void setActivityType(String str) {
        this.activityType = str;
    }

    public long getVersion() {
        return this.version;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public String getSubFrom() {
        return this.subFrom;
    }

    public void setSubFrom(String str) {
        this.subFrom = str;
    }
}
