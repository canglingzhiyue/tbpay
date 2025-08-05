package com.taobao.unit.center.mtop.sync;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopTaobaoAlimpBentleyTemplateSyncRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.alimp.bentley.template.sync";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private long count = 0;
    private long timestamp = 0;
    private String useNewSyncLogic = "false";

    static {
        kge.a(509395007);
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

    public long getCount() {
        return this.count;
    }

    public void setCount(long j) {
        this.count = j;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public String getUseNewSyncLogic() {
        return this.useNewSyncLogic;
    }

    public void setUseNewSyncLogic(String str) {
        this.useNewSyncLogic = str;
    }
}
