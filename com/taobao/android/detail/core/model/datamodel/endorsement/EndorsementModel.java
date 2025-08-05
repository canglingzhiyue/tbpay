package com.taobao.android.detail.core.model.datamodel.endorsement;

import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

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
            kge.a(1239526676);
            kge.a(-350052935);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1135306615);
        kge.a(-350052935);
    }

    public EndorsementModel() {
        emu.a("com.taobao.android.detail.core.model.datamodel.endorsement.EndorsementModel");
    }
}
