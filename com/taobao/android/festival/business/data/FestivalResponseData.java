package com.taobao.android.festival.business.data;

import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes.dex */
public class FestivalResponseData implements IMTOPDataObject {
    public Map<String, Map<String, FestivalValueData[]>> data;
    public String modified;
    public String version;

    static {
        kge.a(-196191171);
        kge.a(-350052935);
    }
}
