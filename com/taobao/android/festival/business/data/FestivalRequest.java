package com.taobao.android.festival.business.data;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class FestivalRequest implements IMTOPDataObject {
    public String version;
    public String API_NAME = "mtop.taobao.wireless.homepage.loadAtmosphere";
    public String VERSION = "3.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        kge.a(-1840685411);
        kge.a(-350052935);
    }
}
