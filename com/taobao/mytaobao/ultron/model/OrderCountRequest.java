package com.taobao.mytaobao.ultron.model;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class OrderCountRequest implements Serializable, IMTOPDataObject {
    private static final String NEW_ORDER_INTERFACE = "mtop.order.taobao.countv2";
    public String API_NAME = NEW_ORDER_INTERFACE;
    public String VERSION = "1.0";
    public String scene = "mytao";
    public String tabCodes;

    static {
        kge.a(-233174129);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public static String fillAllTabCodes() {
        return "waitPay,waitSend,waitConfirm,waitRate,refunding";
    }
}
