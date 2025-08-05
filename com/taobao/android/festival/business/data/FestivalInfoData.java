package com.taobao.android.festival.business.data;

import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class FestivalInfoData implements IMTOPDataObject {
    public Map<String, Map<String, FestivalValueData[]>> content;
    public boolean enable;
    public String version;

    static {
        kge.a(-655960278);
        kge.a(-350052935);
    }
}
