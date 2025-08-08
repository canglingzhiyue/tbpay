package com.taobao.android.order.bundle.helper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.TabType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_ORDER_LIST_TYPE = "OrderListType";
    public static final String IN_PARAM_TAB_CODE = "tabCode";
    public static final String ORDER_ID = "orderId";
    public static final String QUERY_WORD = "queryWord";
    public static final String SEARCH_KEY = "searchKey";
    public static final String SEARCH_TEXT = "searchText";
    public static final String WORD_TERM = "wordTerm";
    public static final String WORD_TYPE = "wordType";

    static {
        kge.a(1457075932);
    }

    public static Map a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String stringExtra = intent.getStringExtra("from");
            String stringExtra2 = intent.getStringExtra("pageFrom");
            if (stringExtra != null) {
                hashMap.put("from", stringExtra);
            }
            if (stringExtra2 != null) {
                hashMap.put("pageFrom", stringExtra2);
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static String b(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent}) : intent == null ? "" : intent.getStringExtra("from");
    }

    public static String a(Intent intent, String str) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0dec1d1", new Object[]{intent, str});
        }
        if (intent == null) {
            return "";
        }
        String stringExtra = intent.getStringExtra(str);
        return (!StringUtils.isEmpty(stringExtra) || intent.getData() == null || (queryParameter = intent.getData().getQueryParameter(str)) == null) ? stringExtra : queryParameter.trim();
    }

    public static String c(Intent intent) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("249b0259", new Object[]{intent});
        }
        if (intent == null) {
            return "";
        }
        String stringExtra = intent.getStringExtra("isSearch");
        return (!StringUtils.isEmpty(stringExtra) || intent.getData() == null || (queryParameter = intent.getData().getQueryParameter("isSearch")) == null) ? stringExtra : queryParameter.trim();
    }

    public static String d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de128ff8", new Object[]{intent});
        }
        String str = "";
        if (intent == null) {
            return str;
        }
        try {
            str = intent.getStringExtra(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
            if (StringUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_PAY_ORDER_ID);
                if (StringUtils.isEmpty(str)) {
                    str = intent.getStringExtra("orderId");
                    if (StringUtils.isEmpty(str)) {
                        str = intent.getStringExtra("orderID");
                    }
                }
            }
        } catch (Exception e) {
            hyn.a("ParamsHelper", "getOrderId", "get orderId  error= " + e.toString());
        }
        Uri data = intent.getData();
        if (data != null && StringUtils.isEmpty(str)) {
            String queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_PAY_ORDER_ID);
            if (StringUtils.isEmpty(queryParameter)) {
                queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_BIZ_ORDER_ID);
            }
            str = StringUtils.isEmpty(queryParameter) ? data.getQueryParameter("orderId") : queryParameter;
            if (StringUtils.isEmpty(str)) {
                str = data.getQueryParameter("orderID");
            }
        }
        hyn.a("ParamsHelper", "getOrderId", "orderId =" + str);
        return str;
    }

    public static String e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978a1d97", new Object[]{intent});
        }
        String str = "";
        if (intent == null) {
            return str;
        }
        try {
            str = intent.getStringExtra(CoreConstants.IN_PARAM_ARCHIVE);
            if (StringUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER);
            }
        } catch (Exception e) {
            hyn.a("ParamsHelper", "getIsArchive", "get mArchive  error= " + e.toString());
        }
        if (intent.getData() != null && StringUtils.isEmpty(str)) {
            str = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_ARCHIVE);
            if (StringUtils.isEmpty(str)) {
                str = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER);
            }
        }
        hyn.a("ParamsHelper", "getIsArchive", "mArchive = " + str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Intent r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "ParamsHelper"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.order.bundle.helper.g.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r8
            r0[r3] = r9
            java.lang.String r8 = "6f3fc5b0"
            java.lang.Object r8 = r1.ipc$dispatch(r8, r0)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L1a:
            java.lang.String r1 = ""
            if (r8 == 0) goto L85
            boolean r2 = android.text.StringUtils.isEmpty(r9)
            if (r2 == 0) goto L25
            goto L85
        L25:
            java.lang.String r2 = r8.getStringExtra(r9)     // Catch: java.lang.Exception -> L40
            boolean r5 = android.text.StringUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L3e
            if (r5 == 0) goto L66
            android.net.Uri r5 = r8.getData()     // Catch: java.lang.Exception -> L3e
            if (r5 == 0) goto L66
            android.net.Uri r8 = r8.getData()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r8.getQueryParameter(r9)     // Catch: java.lang.Exception -> L3e
            goto L66
        L3e:
            r8 = move-exception
            goto L42
        L40:
            r8 = move-exception
            r2 = r1
        L42:
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = " error= "
            r6.append(r7)
            java.lang.String r8 = r8.toString()
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            r5[r4] = r8
            tb.hyn.a(r0, r9, r5)
        L66:
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r5 = " = "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r8[r4] = r3
            tb.hyn.a(r0, r9, r8)
            if (r2 != 0) goto L84
            return r1
        L84:
            return r2
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.helper.g.b(android.content.Intent, java.lang.String):java.lang.String");
    }

    public static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        String str = "";
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (String str2 : list) {
                size--;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (size > 0) {
                    str2 = str2 + ";";
                }
                sb.append(str2);
                str = sb.toString();
            }
        }
        hyn.a("ParamsHelper", "generateOrderIds", "orderIds = " + str);
        return str;
    }

    public static void a(HashMap<String, String> hashMap, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999d308", new Object[]{hashMap, intent});
        } else if (intent != null && (data = intent.getData()) != null) {
            for (String str : data.getQueryParameterNames()) {
                if (str != null && str.startsWith("test")) {
                    hashMap.put(str, data.getQueryParameter(str));
                }
            }
        }
    }

    public static String f(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5101ab36", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        for (String str : data.getQueryParameterNames()) {
            if (str != null && str.startsWith("debug_autotest")) {
                return data.getQueryParameter(str);
            }
        }
        return null;
    }

    public static String g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7938d5", new Object[]{intent});
        }
        if (intent == null) {
            return TabType.ALL.getValue();
        }
        Bundle extras = intent.getExtras();
        String a2 = a(intent.getData());
        if (!StringUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = a(extras);
        return !StringUtils.isEmpty(a3) ? a3 : TabType.ALL.getValue();
    }

    private static String a(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e16eaab4", new Object[]{bundle});
        }
        if (bundle == null) {
            return null;
        }
        try {
            Serializable serializable = bundle.getSerializable(IN_PARAM_ORDER_LIST_TYPE);
            if (serializable != null) {
                if (serializable instanceof CoreConstants.OrderListType) {
                    str = a((CoreConstants.OrderListType) bundle.getSerializable(IN_PARAM_ORDER_LIST_TYPE));
                } else {
                    str = serializable instanceof String ? a(bundle.getString(IN_PARAM_ORDER_LIST_TYPE)) : null;
                }
                try {
                    if (!StringUtils.isEmpty(str)) {
                        com.taobao.android.order.bundle.base.parallelbiz.a.a(ParallelBizValueHelper.PageType.order_list, "_OrderListType", null);
                        return str;
                    }
                } catch (Exception unused) {
                    return str;
                }
            } else {
                str = null;
            }
            Object obj = bundle.get("tabCode");
            if (!(obj instanceof String)) {
                return str;
            }
            String c = c((String) obj);
            try {
                if (StringUtils.isEmpty(c)) {
                    return c;
                }
                com.taobao.android.order.bundle.base.parallelbiz.a.a(ParallelBizValueHelper.PageType.order_list, "_tabCode", null);
                return c;
            } catch (Exception unused2) {
                return c;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    private static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String a2 = a(uri.getQueryParameter(IN_PARAM_ORDER_LIST_TYPE));
        if (!StringUtils.isEmpty(a2)) {
            com.taobao.android.order.bundle.base.parallelbiz.a.a(ParallelBizValueHelper.PageType.order_list, "_OrderListType", null);
            return a2;
        }
        String c = c(uri.getQueryParameter("tabCode"));
        if (StringUtils.isEmpty(c)) {
            return c;
        }
        com.taobao.android.order.bundle.base.parallelbiz.a.a(ParallelBizValueHelper.PageType.order_list, "_tabCode", null);
        return c;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String b = b(str.trim());
        if (CoreConstants.OrderListType.WAIT_TO_PAY.toString().equals(b)) {
            return TabType.WAIT_PAY.getValue();
        }
        if (CoreConstants.OrderListType.WAIT_TO_SHIPMENTS.toString().equals(b)) {
            return TabType.WAIT_SEND.getValue();
        }
        if (CoreConstants.OrderListType.WAIT_TO_CONFIRM.toString().equals(b)) {
            return TabType.WAIT_CONFIRM.getValue();
        }
        if (CoreConstants.OrderListType.WAIT_TO_EVALUATE.toString().equals(b)) {
            return TabType.WAIT_RATE.getValue();
        }
        if (CoreConstants.OrderListType.ALLSPAEK_SENDFINISHED_ORDERS.toString().equals(b) || CoreConstants.OrderListType.TOTAL_ORDERS.toString().equals(b)) {
            return TabType.ALL.getValue();
        }
        if (!CoreConstants.OrderListType.REFUND.toString().equalsIgnoreCase(b)) {
            return null;
        }
        return TabType.REFUND.getValue();
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLowerCase(charAt)) {
                stringBuffer.append(Character.toUpperCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    private static String a(CoreConstants.OrderListType orderListType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ca2540", new Object[]{orderListType});
        }
        if (orderListType == null) {
            return null;
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_PAY) {
            return TabType.WAIT_PAY.getValue();
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_SHIPMENTS) {
            return TabType.WAIT_SEND.getValue();
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_CONFIRM) {
            return TabType.WAIT_CONFIRM.getValue();
        }
        if (orderListType == CoreConstants.OrderListType.WAIT_TO_EVALUATE) {
            return TabType.WAIT_RATE.getValue();
        }
        if (CoreConstants.OrderListType.ALLSPAEK_SENDFINISHED_ORDERS == orderListType || CoreConstants.OrderListType.TOTAL_ORDERS == orderListType) {
            return TabType.ALL.getValue();
        }
        if (CoreConstants.OrderListType.REFUND != orderListType) {
            return null;
        }
        return TabType.REFUND.getValue();
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        TabType[] values = TabType.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue().equals(str)) {
                return values[i].getValue();
            }
        }
        return null;
    }

    public static String h(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3f0c674", new Object[]{intent});
        }
        if (intent != null && (data = intent.getData()) != null) {
            return data.getQueryParameter("refundUrl");
        }
        return null;
    }
}
