package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class kqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String j;
    private static final String k;
    private static final String l;

    /* renamed from: a  reason: collision with root package name */
    private String f30241a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private JSONArray g;
    private String h;
    private JSONArray i;

    static {
        kge.a(-443936035);
        j = b.a(R.string.app_i_know);
        k = "{\n    \"container\": {\n      \"data\": [\n        {\n          \"name\": \"buy_v2_pop_bottom\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"10\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_bottom/1698133079319/buy_v2_pop_bottom.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_bottom$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"buy_v2_pop_error\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"15\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_error/1699341740087/buy_v2_pop_error.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_error$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"buy_v2_pop_item\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"18\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_item/1698132718062/buy_v2_pop_item.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_item$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"buy_v2_pop_title\",\n          \"containerType\": \"dinamicx\",\n          \"version\": \"10\",\n          \"url\": \"https://dinamicx.alibabausercontent.com/pub/buy_v2_pop_title/1698132583405/buy_v2_pop_title.zip\",\n          \"md5\": null,\n          \"type\": [\n            \"dinamicx$buy_v2_pop_title$0$generalerrorpage\"\n          ]\n        },\n        {\n          \"name\": \"popup_window\",\n          \"containerType\": \"layout\",\n          \"version\": \"0\",\n          \"url\": null,\n          \"md5\": null,\n          \"type\": [\n            \"layout$popup_window$0$0\"\n          ]\n        },\n        {\n          \"name\": \"sticky\",\n          \"containerType\": \"layout\",\n          \"version\": \"0\",\n          \"url\": null,\n          \"md5\": null,\n          \"type\": [\n            \"layout$sticky$0$0\"\n          ]\n        }\n      ]\n    },\n    \"data\": {\n      \"commonErrorPopup\": {\n        \"tag\": \"commonErrorPopup\",\n        \"type\": \"layout$popup_window$0$0\",\n        \"fields\": {\n          \"code\": \"commonErrorPopup\",\n          \"state\": \"open\",\n          \"style\": {\n            \"diablePullGesture\": \"true\",\n            \"disableTapGesture\": \"true\",\n            \"heightRatio\": \"0.5\",\n            \"needCloseButton\": \"false\",\n            \"showCloseButton\": \"false\"\n          }\n        }\n      },\n      \"commonErrorPopupTips\": {\n        \"tag\": \"commonErrorPopupTips\",\n        \"type\": \"dinamicx$buy_v2_pop_error$0$generalerrorpage\",\n        \"fields\": {\n          \"title\": \"%s\",\n          \"firstSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"icon\": \"https://img.alicdn.com/imgextra/i1/O1CN01o7ua0u1VDY4sH1hCj_!!6000000002619-2-tps-300-300.png\",\n          \"secondSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"traceInfo\": \"%s\"\n        }\n      },\n      \"commonErrorPopupFooter\": {\n        \"tag\": \"commonErrorPopupFooter\",\n        \"type\": \"layout$sticky$0$0\",\n        \"fields\": {\n          \"position\": \"bottom\"\n        }\n      },\n      \"commonErrorActionButtion\": {\n        \"tag\": \"commonErrorActionButtion\",\n        \"type\": \"dinamicx$buy_v2_pop_bottom$0$generalerrorpage\",\n        \"fields\": {\n          \"buttonText\": \"" + j + "\",\n          \"leftButton\": {\n               \"text\": \"%s\",\n               \"startGradientColor\": \"#FECB00\",\n               \"endGradientColor\": \"#FE9502\"\n          },\n          \"rightButton\": {\n               \"text\": \"%s\",\n               \"startGradientColor\": \"#FF7D00\",\n               \"endGradientColor\": \"#FF5000\"\n           }\n        },\n        \"events\": {\n          \"itemClick\": [\n            {\n              \"type\": \"pop\"\n            }\n          ],\n          \"exposureItem\": [\n            {\n              \"type\": \"userTrack\",\n              \"fields\": {\n                \"arg1\": \"Page_ConfirmOrder_Alert_New\",\n                \"arg2\": \"commonErrorPage\",\n                \"args\": {\n                  \"errorCode\": \"%s\",\n                  \"api\": \"%s\",\n                  \"errorMsg\": \"%s\"\n                },\n                \"eventId\": \"2201\",\n                \"page\": \"Page_Order\"\n              }\n            }\n          ]\n        }\n      }\n    },\n    \"endpoint\": {\n      \"protocolVersion\": \"4.0\"\n    },\n    \"hierarchy\": {\n      \"root\": \"generalErrorPage\",\n      \"structure\": {\n        \"generalErrorPage\": [\n          \"errorPopup\"\n        ],\n        \"errorPopup\": [\n          \"commonErrorPopup\"\n        ],\n        \"commonErrorPopup\": [\n          \"commonErrorPopupTips\",\n          \"commonErrorPopupFooter\"\n        ],\n        \"commonErrorPopupFooter\": [\n          \"commonErrorActionButtion\"\n        ]\n      }\n    }\n  }";
        StringBuilder sb = new StringBuilder();
        sb.append("{\n    \"data\": {\n      \"commonErrorPopup\": {\n        \"tag\": \"commonErrorPopup\",\n        \"type\": \"layout$popup_window$0$0\",\n        \"fields\": {\n          \"code\": \"commonErrorPopup\",\n          \"state\": \"open\",\n          \"style\": {\n            \"diablePullGesture\": \"true\",\n            \"disableTapGesture\": \"true\",\n            \"heightRatio\": \"0.5\",\n            \"needCloseButton\": \"false\",\n            \"showCloseButton\": \"false\"\n          }\n        }\n      },\n      \"commonErrorPopupTips\": {\n        \"tag\": \"commonErrorPopupTips\",\n        \"type\": \"dinamicx$buy_v2_pop_error$0$generalerrorpage\",\n        \"fields\": {\n          \"title\": \"%s\",\n          \"firstSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"icon\": \"https://img.alicdn.com/imgextra/i1/O1CN01o7ua0u1VDY4sH1hCj_!!6000000002619-2-tps-300-300.png\",\n          \"secondSubTitle\": {\n            \"text\": \"%s\",\n            \"textStyle\": {\n              \"textColor\": \"#999999\"\n            }\n          },\n          \"traceInfo\": \"%s\"\n        }\n      },\n      \"commonErrorPopupFooter\": {\n        \"tag\": \"commonErrorPopupFooter\",\n        \"type\": \"layout$sticky$0$0\",\n        \"fields\": {\n          \"position\": \"bottom\"\n        }\n      },\n      \"commonErrorActionButtion\": {\n        \"tag\": \"commonErrorActionButtion\",\n        \"type\": \"dinamicx$buy_v2_pop_bottom$0$generalerrorpage\",\n        \"fields\": {\n          \"buttonText\": \"");
        sb.append(j);
        sb.append("\",\n");
        sb.append("          \"leftButton\": {\n");
        sb.append("               \"text\": \"%s\",\n");
        sb.append("               \"startGradientColor\": \"#FECB00\",\n");
        sb.append("               \"endGradientColor\": \"#FE9502\"\n");
        sb.append("          },\n");
        sb.append("          \"rightButton\": {\n");
        sb.append("               \"text\": \"%s\",\n");
        sb.append("               \"startGradientColor\": \"#FF7D00\",\n");
        sb.append("               \"endGradientColor\": \"#FF5000\"\n");
        sb.append("           }\n");
        sb.append("        },\n");
        sb.append("        \"events\": {\n");
        sb.append("          \"itemClick\": [\n");
        sb.append("            {\n");
        sb.append("              \"type\": \"pop\"\n");
        sb.append("            }\n");
        sb.append("          ],\n");
        sb.append("          \"exposureItem\": [\n");
        sb.append("            {\n");
        sb.append("              \"type\": \"userTrack\",\n");
        sb.append("              \"fields\": {\n");
        sb.append("                \"arg1\": \"Page_ConfirmOrder_Alert_New\",\n");
        sb.append("                \"arg2\": \"commonErrorPage\",\n");
        sb.append("                \"args\": {\n");
        sb.append("                  \"api\": \"%s\",\n");
        sb.append("                  \"errorCode\": \"%s\",\n");
        sb.append("                  \"errorMsg\": \"%s\"\n");
        sb.append("                },\n");
        sb.append("                \"eventId\": \"2201\",\n");
        sb.append("                \"page\": \"Page_Order\"\n");
        sb.append("              }\n");
        sb.append("            }\n");
        sb.append("          ]\n");
        sb.append("        }\n");
        sb.append("      }\n");
        sb.append("    },\n");
        sb.append("    \"hierarchy\": {\n");
        sb.append("      \"delta\": [\n");
        sb.append("        {\n");
        sb.append("          \"opType\": \"replace\",\n");
        sb.append("          \"target\": \"commonErrorPopup\"\n");
        sb.append("        },\n");
        sb.append("        {\n");
        sb.append("          \"opType\": \"replace\",\n");
        sb.append("          \"target\": \"commonErrorPopupTips\"\n");
        sb.append("        },\n");
        sb.append("        {\n");
        sb.append("          \"opType\": \"replace\",\n");
        sb.append("          \"target\": \"commonErrorPopupFooter\"\n");
        sb.append("        },\n");
        sb.append("        {\n");
        sb.append("          \"opType\": \"replace\",\n");
        sb.append("          \"target\": \"commonErrorActionButtion\"\n");
        sb.append("        }\n");
        sb.append("      ]\n");
        sb.append("    },\n");
        sb.append("  }");
        l = sb.toString();
    }

    public kqu a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqu) ipChange.ipc$dispatch("7c71a825", new Object[]{this, str});
        }
        this.f30241a = str;
        return this;
    }

    public kqu b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqu) ipChange.ipc$dispatch("7d1e53c4", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public kqu a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqu) ipChange.ipc$dispatch("4edaf9fd", new Object[]{this, str, jSONArray});
        }
        this.f = str;
        this.g = jSONArray;
        return this;
    }

    public kqu b(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqu) ipChange.ipc$dispatch("e319699c", new Object[]{this, str, jSONArray});
        }
        this.h = str;
        this.i = jSONArray;
        return this;
    }

    public kqu c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqu) ipChange.ipc$dispatch("7dcaff63", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public kqu d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqu) ipChange.ipc$dispatch("7e77ab02", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public kqu e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqu) ipChange.ipc$dispatch("7f2456a1", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        String e = e();
        String str = l;
        String str2 = this.b;
        String str3 = this.e;
        JSONObject a2 = bba.a(a(str, str2, str3, "", e, this.d, this.f30241a, str3, this.f, this.h));
        if (a2 == null) {
            a2 = c();
        }
        a(a2);
        return a2;
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("commonErrorActionButtion")) == null || (jSONObject3 = jSONObject2.getJSONObject("events")) == null) {
            return;
        }
        JSONArray jSONArray = this.g;
        if (jSONArray != null) {
            jSONObject3.put("leftClick", (Object) jSONArray);
        }
        JSONArray jSONArray2 = this.i;
        if (jSONArray2 == null) {
            return;
        }
        jSONObject3.put("rightClick", (Object) jSONArray2);
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        String e = e();
        String str = k;
        String str2 = this.b;
        String str3 = this.e;
        JSONObject a2 = bba.a(a(str, str2, str3, "", e, this.d, this.f30241a, str3, this.f, this.h));
        if (a2 == null) {
            a2 = d();
        }
        a(a2);
        return a2;
    }

    private JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : JSON.parseObject(a(l, b.a(R.string.app_purchase_fail), b.a(R.string.taobao_app_3180_1_29372), "", "0000000000000", "0000000000000", "", b.a(R.string.taobao_app_3180_1_29367), null, null));
    }

    private JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : JSON.parseObject(a(k, b.a(R.string.app_purchase_fail), b.a(R.string.taobao_app_3180_1_29372), "", "0000000000000", "0000000000000", "", b.a(R.string.taobao_app_3180_1_29367), null, null));
    }

    private String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41077854", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10});
        }
        String str11 = "";
        String str12 = str2 != null ? str2 : str11;
        String str13 = str3 != null ? str3 : str11;
        String str14 = str4 != null ? str4 : str11;
        String str15 = str5 != null ? str5 : str11;
        String str16 = str6 != null ? str6 : str11;
        String str17 = str7 != null ? str7 : str11;
        String str18 = str8 != null ? str8 : str11;
        String str19 = str9 != null ? str9 : str11;
        if (str10 != null) {
            str11 = str10;
        }
        return String.format(str, str12, str13, str14, str15, str19, str11, str16, str17, str18);
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(this.d)) {
            sb.append(this.d);
        }
        if (!StringUtils.isEmpty(this.c)) {
            sb.append(" \n ");
            sb.append(this.c);
        }
        return sb.toString();
    }
}
