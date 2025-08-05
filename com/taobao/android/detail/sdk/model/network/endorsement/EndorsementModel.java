package com.taobao.android.detail.sdk.model.network.endorsement;

import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class EndorsementModel implements IMTOPDataObject {
    public ArrayList<EndorsementItem> endorsements;
    public String icon;
    public String instruction;

    /* loaded from: classes4.dex */
    public static class EndorsementItem implements Serializable, IMTOPDataObject {
        public String filePath;
        public String language;
        public String title;

        static {
            kge.a(-712850944);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1995713437);
        kge.a(-350052935);
    }

    public EndorsementModel() {
        tpc.a("com.taobao.android.detail.sdk.model.network.endorsement.EndorsementModel");
    }
}
