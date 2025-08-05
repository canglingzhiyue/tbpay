package com.taobao.bootimage.data;

import java.util.UUID;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageBrandHubRequest implements IMTOPDataObject {
    public String itemIds;
    public String userNick;
    public String API_NAME = "mtop.wireless.artisan.brandhub.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;
    public String sceneId = "5775";
    public String pageNum = "0";
    public String refreshNum = "0";
    public String tabId = "0";
    public String pvId = UUID.randomUUID().toString();
    public String st = "android";

    static {
        kge.a(123543908);
        kge.a(-350052935);
    }
}
