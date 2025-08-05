package com.taobao.unit.center.mtop.sync;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopTaobaoAlimpBentleyLayoutSyncRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.alimp.bentley.layout.sync";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String groups = null;
    private long sdkVer = 0;
    private String nameSpace = null;
    private String useNewSyncLogic = "false";

    static {
        kge.a(45197519);
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

    public String getGroups() {
        return this.groups;
    }

    public void setGroups(String str) {
        this.groups = str;
    }

    public long getSdkVer() {
        return this.sdkVer;
    }

    public void setSdkVer(long j) {
        this.sdkVer = j;
    }

    public String getNameSpace() {
        return this.nameSpace;
    }

    public void setNameSpace(String str) {
        this.nameSpace = str;
    }

    public String getUseNewSyncLogic() {
        return this.useNewSyncLogic;
    }

    public void setUseNewSyncLogic(String str) {
        this.useNewSyncLogic = str;
    }
}
