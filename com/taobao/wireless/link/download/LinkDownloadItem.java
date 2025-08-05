package com.taobao.wireless.link.download;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class LinkDownloadItem implements Serializable {
    private static final long serialVersionUID = -2300913511434654718L;
    public String businessId;
    public String downloadUrl;
    public String fileMd5;
    public String fileName;
    public String filePath;
    public String notificationUrl;
    public String packageName;
    public String title;
    public boolean visibilityNotification;

    static {
        kge.a(1965666501);
        kge.a(1028243835);
    }
}
