package com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.sku.utils.o;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.n;
import com.taobao.zcache.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.alz;
import tb.jqg;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OrangeEnablePrefetch = "enable_zcache_prefetch";
    public static final String OrangeNameSpace = "trade_zcache";

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f2686a;
    private static final List<String> b;
    private static final List<String> c;
    private static final List<String> d;
    private static final List<String> e;
    private static final List<String> f;
    private static final List<String> g;
    private static final List<String> h;
    private static final List<String> i;
    private static final List<String> j;
    private static final List<String> k;
    private static final List<String> l;
    private static final List<String> m;
    private static final List<List<String>> n;
    private static final List<String> o;
    private static final List<String> p;
    private static final List<String> q;

    static {
        kge.a(-473727655);
        f2686a = Arrays.asList("pay-success-v3", "odetail4", "refund_list_weex", "tbsuperbuy");
        b = Arrays.asList(new String[0]);
        c = Arrays.asList("pay-success-v3", "tbsuperbuy");
        d = Arrays.asList("odetail4", "pay-success-v3", "refund_list_weex", "new_osearch");
        e = Arrays.asList("tbsuperbuy");
        f = Arrays.asList(new String[0]);
        g = Arrays.asList("tbsuperbuy");
        h = Arrays.asList("pay-success-v3");
        i = Arrays.asList("odetail4");
        j = Arrays.asList("refund_list_weex");
        k = Arrays.asList("tbsuperbuy");
        l = Arrays.asList("tbsuperbuy");
        m = Arrays.asList("tbsuperbuy");
        o = Arrays.asList(new String[0]);
        p = Arrays.asList(new String[0]);
        q = Arrays.asList("odetail4");
        n = new ArrayList(Arrays.asList(f2686a, b, c, d, e, f, g, h, i, j, k, l, m, o, p, q));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str) {
        char c2;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        switch (str.hashCode()) {
            case -708204916:
                if (str.equals(o.DEFAULT_BIZ_NAME)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -390864660:
                if (str.equals(OrderBizCode.orderList)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3046176:
                if (str.equals("cart")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3322092:
                if (str.equals("live")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 99062569:
                if (str.equals("iCart")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 120528346:
                if (str.equals("mytaobao")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1557721601:
                if (str.equals("detail2")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1743324417:
                if (str.equals("purchase")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2103471391:
                if (str.equals(OrderBizCode.orderDetail)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 10;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 9;
                break;
            case '\b':
                i2 = 11;
                break;
        }
        a(i2);
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else if (!Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(OrangeNameSpace, OrangeEnablePrefetch, "true"))) {
        } else {
            if (i2 >= n.size()) {
                jqg.b("Trade_ZCache", i2 + " invalid bizType");
                return;
            }
            List<String> a2 = a(alz.BizNames.get(i2), n.get(i2));
            if (a2.size() == 0) {
                jqg.b("Trade_ZCache", i2 + " bizPrefetchList is empty");
                return;
            }
            jqg.b("Trade_ZCache", i2 + " prefetch: " + a2.toString());
            b(a2);
        }
    }

    private static List<String> a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bf7c52c4", new Object[]{str, list});
        }
        String a2 = spk.a(OrangeNameSpace, str, (String) null);
        if (a2 == null) {
            jqg.b("Trade_ZCache", str + " orange load error");
            return list;
        }
        try {
            return JSON.parseArray(a2, String.class);
        } catch (Exception unused) {
            jqg.b("Trade_ZCache", "JSONArray parse error");
            return list;
        }
    }

    private static void b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{list});
        } else if (list == null || list.isEmpty()) {
        } else {
            if (TextUtils.equals("true", OrangeConfig.getInstance().getConfig(OrangeNameSpace, "enable_zcache_setup", "false")) && n.a() == null) {
                r.a();
                jqg.b("Trade_ZCache", "上下文为空，执行ZCache初始化操作！" + list.toString());
            }
            n.a(list);
        }
    }
}
