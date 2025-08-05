package com.taobao.bootimage.data;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageInfoRequest implements IMTOPDataObject {
    public int deviceScore;
    public double latitude;
    public double longitude;
    public String sid;
    public String API_NAME = "mtop.taobao.wireless.startservice.load";
    public String VERSION = "2.1";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;
    public String screen = null;
    public String extension = null;

    static {
        kge.a(-2111177180);
        kge.a(-350052935);
    }
}
