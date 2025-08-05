package tb;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rjm {
    public static final String BETA = "beta";
    public static final String ONLINE = "m";
    public static final Map<String, String> URL_DESC_MAP;
    public static final Map<String, String> URL_MAP;
    public static final String WAPA = "wapa";
    public static final String WAPTEST = "waptest";

    /* renamed from: a  reason: collision with root package name */
    public static String f33184a;
    public static String b;
    public static String c;

    static {
        kge.a(1844690899);
        HashMap hashMap = new HashMap();
        URL_MAP = hashMap;
        hashMap.put("m", "http://hws.m.taobao.com/cache/wdetail/5.0/");
        URL_MAP.put(WAPTEST, "http://item.daily.taobao.net/modulet/v5/wdetailEsi.do");
        URL_MAP.put(WAPA, "http://hws.wapa.taobao.com/cache/wdetail/5.0/");
        URL_MAP.put("beta", "http://hwsbeta.m.taobao.com/cache/wdetail/5.0/");
        HashMap hashMap2 = new HashMap();
        URL_DESC_MAP = hashMap2;
        hashMap2.put("m", "http://hws.m.taobao.com/ds/json/wap/dwdetailDesc.do");
        URL_DESC_MAP.put(WAPTEST, "http://detailskip.daily.taobao.net/json/wap/dwdetailDesc.do");
        URL_DESC_MAP.put(WAPA, "http://hws.wapa.taobao.com/ds/json/wap/dwdetailDesc.do");
        URL_DESC_MAP.put("beta", "http://hws.m.taobao.com/ds/json/wap/dwdetailDesc.do");
        b = "m";
        c = "test_env";
    }
}
