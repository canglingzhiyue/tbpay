package com.taobao.android.tbsku.container;

import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.Map;
import tb.kge;
import tb.noa;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1681776957);
    }

    public static Intent a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("667f488b", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        String string = jSONObject.getString("itemId");
        String string2 = jSONObject.getString("skuId");
        String string3 = jSONObject.getString("sourceType");
        String string4 = jSONObject.getString("bizName");
        JSONObject jSONObject2 = jSONObject.getJSONObject("exParams");
        return a(string, string2, a(string3, jSONObject2), a((Map<String, Object>) jSONObject2), b((Map<String, Object>) jSONObject2), b(string3, jSONObject2), string4, b(jSONObject2), c(jSONObject2), d(jSONObject2));
    }

    private static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
        }
        if (i == 1) {
            return "ADDCART";
        }
        if (i == 2) {
            return "BUYNOW";
        }
        if (i != 3) {
            if (i == 5) {
                return "ADDCART";
            }
            if (i == 6) {
                return "BUYNOW";
            }
            if (i != 11 || jSONObject == null) {
                return "ADDCART_AND_BUYNOW";
            }
        }
        return "CONFIRM";
    }

    private static String a(Map<String, Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get(noa.KEY_MSOA_TRANS_KEY)) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!StringUtils.isEmpty(valueOf) && (split = valueOf.split(",")) != null && split.length != 0) {
            String str = "";
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!StringUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (StringUtils.isEmpty(str)) {
                return str;
            }
            return str + "&transparent_key=" + valueOf;
        }
        return null;
    }

    private static String b(Map<String, Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get("request_key")) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!StringUtils.isEmpty(valueOf) && (split = valueOf.split(",")) != null && split.length != 0) {
            String str = "";
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!StringUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (StringUtils.isEmpty(str)) {
                return str;
            }
            return str + "&request_key=" + valueOf;
        }
        return null;
    }

    private static String b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("657dfa63", new Object[]{str, jSONObject});
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        if (i == 1) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.container.MsoaDataConverter$1
                {
                    put("addCartText", "确认");
                }
            });
        } else if (i == 2) {
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.container.MsoaDataConverter$2
                {
                    put("buyNowText", "确认");
                }
            });
        } else if (i == 11 && jSONObject != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("leftButton");
            final String str2 = ILocalizationService.CONFIRM;
            if (jSONObject3 != null) {
                String string = jSONObject3.getString("title");
                if (!StringUtils.isEmpty(string)) {
                    str2 = string;
                }
            }
            jSONObject2.put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.container.MsoaDataConverter$3
                {
                    put("comfirText", (Object) str2);
                }
            });
        }
        return "&extInput=" + jSONObject2.toJSONString();
    }

    private static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject.getString("depressTBCartRefresh"));
    }

    private static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String str = "&sku_forbidH5=" + jSONObject.getString("sku_forbidH5");
        String string = jSONObject.getString("sku_forbidH5_toast");
        if (StringUtils.isEmpty(string)) {
            return str;
        }
        return str + "&sku_forbidH5_toast=" + string;
    }

    private static String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91c579db", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String str = "&sku_forbid_redirect=" + jSONObject.getString("sku_forbid_redirect");
        String string = jSONObject.getString("sku_forbid_redirect_toast");
        if (StringUtils.isEmpty(string)) {
            return str;
        }
        return str + "&sku_forbid_redirect_toast=" + string;
    }

    private static Intent a(String str, String str2, String str3, String str4, String str5, String str6, final String str7, boolean z, String str8, String str9) {
        String str10;
        String str11;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("68f1eb99", new Object[]{str, str2, str3, str4, str5, str6, str7, new Boolean(z), str8, str9});
        }
        if (!StringUtils.isEmpty(str7)) {
            String jSONString = new JSONObject() { // from class: com.taobao.android.tbsku.container.MsoaDataConverter$4
                {
                    put("bizName", (Object) str7);
                }
            }.toJSONString();
            str11 = "&skuUT=" + URLEncoder.encode(jSONString);
            str10 = "&skuInnerBizName=" + str7;
        } else {
            str10 = "";
            str11 = str10;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://sku.taobao.com/index.htm?itemId=");
        sb.append(str);
        sb.append("&skuId=");
        sb.append(str2);
        sb.append("&bottomMode=");
        sb.append(str3);
        if (StringUtils.isEmpty(str4)) {
            str4 = "";
        }
        sb.append(str4);
        if (StringUtils.isEmpty(str5)) {
            str5 = "";
        }
        sb.append(str5);
        sb.append("&ignore_toast=true");
        sb.append(str6);
        sb.append(str11);
        sb.append(str10);
        sb.append("&depressTBCartRefresh=");
        sb.append(z);
        sb.append(str8);
        sb.append(str9);
        return new Intent().setData(Uri.parse(sb.toString()));
    }
}
