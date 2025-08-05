package com.taobao.taobao.scancode.barcode.object.recommend;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetMedicineUrlRequest implements IMTOPDataObject {
    public String code;
    public String API_NAME = "mtop.alijk.code.search.getshowurl";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(-2062689741);
        kge.a(-350052935);
    }
}
