package com.taobao.taobao.scancode.barcode.object.recommend;

import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetQRMedicineUrlRequest implements IMTOPDataObject {
    public String rowkey;
    public String API_NAME = "mtop.alihealth.trace.query.code.getScanCodeUrl";
    public String VERSION = "1.0";
    public String channel = "taobao";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(-360064044);
        kge.a(-350052935);
    }

    public static boolean isQRMedicneCode(String str) {
        return !StringUtils.isEmpty(str) && str.startsWith("6") && str.length() == 20 && StringUtils.isDigitsOnly(str);
    }
}
