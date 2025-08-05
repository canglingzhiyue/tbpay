package com.o2o.ad.click.common;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OClickSendRequest implements Serializable, IMTOPDataObject {
    public final String API_NAME = "mtop.life.ad.click.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(807202185);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
