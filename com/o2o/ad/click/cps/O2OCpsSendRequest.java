package com.o2o.ad.click.cps;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OCpsSendRequest implements Serializable, IMTOPDataObject {
    public final String API_NAME = "mtop.alimama.adsdk.customize.cps.track";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(1322390434);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
