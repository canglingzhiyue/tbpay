package com.taobao.tao.export.flickbtn.mtop;

import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoSharepasswordQueryEntryResponseData implements IMTOPDataObject {
    private Map extendMap;
    private String icon;
    private String shareChannel;
    private String shareIconType;
    private String shareUid;

    static {
        kge.a(795561525);
        kge.a(-350052935);
    }

    public String getShareUid() {
        return this.shareUid;
    }

    public void setShareUid(String str) {
        this.shareUid = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getShareIconType() {
        return this.shareIconType;
    }

    public void setShareIconType(String str) {
        this.shareIconType = str;
    }

    public String getShareChannel() {
        return this.shareChannel;
    }

    public void setShareChannel(String str) {
        this.shareChannel = str;
    }

    public Map getExtendMap() {
        return this.extendMap;
    }

    public void setExtendMap(Map map) {
        this.extendMap = map;
    }
}
