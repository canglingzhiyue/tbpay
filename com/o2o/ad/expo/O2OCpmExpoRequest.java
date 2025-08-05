package com.o2o.ad.expo;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OCpmExpoRequest implements Serializable, IMTOPDataObject {
    public final String API_NAME = O2OExpoCommitter.API_NAME;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(946546663);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
