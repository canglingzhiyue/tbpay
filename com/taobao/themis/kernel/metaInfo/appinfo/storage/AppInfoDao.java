package com.taobao.themis.kernel.metaInfo.appinfo.storage;

import com.alibaba.ariver.resource.api.models.AppModel;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class AppInfoDao implements Serializable {
    public String appId;
    public AppModel appInfo;
    public String extra;
    public Long id;
    public long lastRequestTimeStamp;
    public long lastUsedTimeStamp;
    public String templateId;
    public String type;
    public String version;

    static {
        kge.a(-1261928297);
        kge.a(1028243835);
    }
}
