package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.log.statistics.d;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class iar extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_NEXT_EVENTS = "nextEvents";
    public static final String FIELD_OLD_DATA = "oldData";
    public static final String NEXT_TAG_FINISH = "finish";
    public static final String SUBSCRIBER_ID = "unionOrderConverterV2";

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f28882a;
    private static final String[] b;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;

    public static /* synthetic */ Object ipc$super(iar iarVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-1819325845950889468";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (e(eVar) == null || !(e(eVar).get(FIELD_OLD_DATA) instanceof JSONObject) || !(e(eVar).get(FIELD_NEXT_EVENTS) instanceof JSONObject) || (a2 = a(e(eVar).getJSONObject(FIELD_OLD_DATA), e(eVar).getJSONObject(FIELD_NEXT_EVENTS), eVar.d())) == null) {
        } else {
            a(eVar, "finish", a2);
        }
    }

    static {
        kge.a(-961178054);
        f28882a = new String[]{"babel_orderdetail_unionpay_title", "4", "https://ossgw.alicdn.com/rapid-oss-bucket/publish/1699951192210/babel_orderdetail_unionpay_title.zip"};
        b = new String[]{"babel_orderdetail_unionpay_body", "4", "https://ossgw.alicdn.com/rapid-oss-bucket/publish/1699951239526/babel_orderdetail_unionpay_body.zip"};
        l = new String[]{"babel_orderdetail_unionpay_tail", "7", "https://dinamicx.alibabausercontent.com/pub/babel_orderdetail_unionpay_tail/1699953946811/babel_orderdetail_unionpay_tail.zip"};
        m = new String[]{"overseas_babel_orderdetail_unionpay_title", "2", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_orderdetail_unionpay_title/1723044196091/overseas_babel_orderdetail_unionpay_title.zip"};
        n = new String[]{"overseas_babel_orderdetail_unionpay_body", "2", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_orderdetail_unionpay_body/1723089887530/overseas_babel_orderdetail_unionpay_body.zip"};
        o = new String[]{"overseas_babel_orderdetail_unionpay_tail", "9", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_orderdetail_unionpay_tail/1723102536297/overseas_babel_orderdetail_unionpay_tail.zip"};
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, IDMComponent iDMComponent) {
        String format;
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("96297f0c", new Object[]{this, jSONObject, jSONObject2, iDMComponent});
        }
        if (iDMComponent == null || !(jSONObject.get("data") instanceof JSONObject) || !(jSONObject.getJSONObject("data").get("title") instanceof String) || !(jSONObject.getJSONObject("data").get("multiDetailInfo") instanceof JSONArray) || !(jSONObject.getJSONObject("data").get(fne.KEY_OP) instanceof JSONArray)) {
            return null;
        }
        if (b.c()) {
            String[] strArr = m;
            String[] strArr2 = n;
            String[] strArr3 = o;
            format = String.format("{\n    \"data\":{\n        \"container\": {\n            \"data\": [\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"%s\",\n                    \"type\": [\n                        \"dinamicx$unionordertitle\"\n                    ],\n                    \"version\": \"%s\",\n                    \"url\": \"%s\",\n                    \"md5\": \"fb78b2e75f737992d2d20ecb261b79bf\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"%s\",\n                    \"type\": [\n                        \"dinamicx$unionorderbody\"\n                    ],\n                    \"version\": \"%s\",\n                    \"url\": \"%s\",\n                    \"md5\": \"411fca69a51849b8cb6a54ae946e6ffd\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"%s\",\n                    \"type\": [\n                        \"dinamicx$unionorderbuttons\"\n                    ],\n                    \"version\": \"%s\",\n                    \"url\": \"%s\",\n                    \"md5\": \"9b285cb1130e0537129528215ea169fe\"\n                }\n            ]\n        },\n        \"endpoint\": {\n            \"protocolVersion\": \"3.0\",\n            \"ultronage\": \"true\"\n        },\n        \"reload\": \"true\",\n        \"data\": {\n            \"popTitle\": {\n                \"id\": \"1\",\n                \"position\": \"header\",\n                \"type\": \"dinamicx$unionordertitle\",\n                \"fields\": {\n                    \"title\": \"\"\n                }\n            },\n            \"opButtons\": {\n                \"id\": \"1\",\n                \"position\": \"footer\",\n                \"type\": \"dinamicx$unionorderbuttons\",\n                \"fields\": {\n                    \"leftButtonEvent\": \"\",\n                    \"leftButtonText\": \"\",\n                    \"rightButtonText\": \"\",\n                    \"rightButtonEvent\": \"\",\n                    \"cancelOrderDowngrade\":{\n                        \n                    }\n                },\n                \"events\": {\n                }\n            },\n            \"popBody\": {\n                \"id\": \"1\",\n                \"type\": \"dinamicx$unionorderbody\",\n                \"fields\": {\n                    \"warnTips\": {\n                        \"desc\": \"\"\n                    },\n                    \"multiDetailInfo\": [\n                        {\n                            \"highLight\": \"true\",\n                            \"name\": \"\",\n                            \"nameTips\": \"\",\n                            \"value\": \"\"\n                        }\n                    ],\n                    \"detailInfo\": [\n                        {\n                            \"name\": \"\",\n                            \"value\": \"\"\n                        }\n                    ]\n                }\n            },\n            \"unionOrderPop\": {\n                \"type\": \"block$emptyBlock\",\n                \"tag\": \"bodyBlock\"\n            }\n        },\n        \"hierarchy\": {\n            \"root\": \"unionOrderPop\",\n            \"structure\": {\n                \"unionOrderPop\": [\n                    \"popTitle\",\n                    \"popBody\",\n                    \"opButtons\"\n                ]\n            }\n        },\n        \"linkage\": {}\n    }\n}", strArr[0], strArr[1], strArr[2], strArr2[0], strArr2[1], strArr2[2], strArr3[0], strArr3[1], strArr3[2]);
        } else {
            String[] strArr4 = f28882a;
            String[] strArr5 = b;
            String[] strArr6 = l;
            format = String.format("{\n    \"data\":{\n        \"container\": {\n            \"data\": [\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"%s\",\n                    \"type\": [\n                        \"dinamicx$unionordertitle\"\n                    ],\n                    \"version\": \"%s\",\n                    \"url\": \"%s\",\n                    \"md5\": \"fb78b2e75f737992d2d20ecb261b79bf\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"%s\",\n                    \"type\": [\n                        \"dinamicx$unionorderbody\"\n                    ],\n                    \"version\": \"%s\",\n                    \"url\": \"%s\",\n                    \"md5\": \"411fca69a51849b8cb6a54ae946e6ffd\"\n                },\n                {\n                    \"containerType\": \"dinamicx\",\n                    \"name\": \"%s\",\n                    \"type\": [\n                        \"dinamicx$unionorderbuttons\"\n                    ],\n                    \"version\": \"%s\",\n                    \"url\": \"%s\",\n                    \"md5\": \"9b285cb1130e0537129528215ea169fe\"\n                }\n            ]\n        },\n        \"endpoint\": {\n            \"protocolVersion\": \"3.0\",\n            \"ultronage\": \"true\"\n        },\n        \"reload\": \"true\",\n        \"data\": {\n            \"popTitle\": {\n                \"id\": \"1\",\n                \"position\": \"header\",\n                \"type\": \"dinamicx$unionordertitle\",\n                \"fields\": {\n                    \"title\": \"\"\n                }\n            },\n            \"opButtons\": {\n                \"id\": \"1\",\n                \"position\": \"footer\",\n                \"type\": \"dinamicx$unionorderbuttons\",\n                \"fields\": {\n                    \"leftButtonEvent\": \"\",\n                    \"leftButtonText\": \"\",\n                    \"rightButtonText\": \"\",\n                    \"rightButtonEvent\": \"\",\n                    \"cancelOrderDowngrade\":{\n                        \n                    }\n                },\n                \"events\": {\n                }\n            },\n            \"popBody\": {\n                \"id\": \"1\",\n                \"type\": \"dinamicx$unionorderbody\",\n                \"fields\": {\n                    \"warnTips\": {\n                        \"desc\": \"\"\n                    },\n                    \"multiDetailInfo\": [\n                        {\n                            \"highLight\": \"true\",\n                            \"name\": \"\",\n                            \"nameTips\": \"\",\n                            \"value\": \"\"\n                        }\n                    ],\n                    \"detailInfo\": [\n                        {\n                            \"name\": \"\",\n                            \"value\": \"\"\n                        }\n                    ]\n                }\n            },\n            \"unionOrderPop\": {\n                \"type\": \"block$emptyBlock\",\n                \"tag\": \"bodyBlock\"\n            }\n        },\n        \"hierarchy\": {\n            \"root\": \"unionOrderPop\",\n            \"structure\": {\n                \"unionOrderPop\": [\n                    \"popTitle\",\n                    \"popBody\",\n                    \"opButtons\"\n                ]\n            }\n        },\n        \"linkage\": {}\n    }\n}", strArr4[0], strArr4[1], strArr4[2], strArr5[0], strArr5[1], strArr5[2], strArr6[0], strArr6[1], strArr6[2]);
        }
        JSONObject parseObject = JSON.parseObject(format);
        parseObject.getJSONObject("data").getJSONObject("data").getJSONObject("popTitle").getJSONObject("fields").put("title", (Object) jSONObject.getJSONObject("data").getString("title"));
        JSONObject jSONObject3 = parseObject.getJSONObject("data").getJSONObject("data").getJSONObject("popBody").getJSONObject("fields");
        if (jSONObject.getJSONObject("data").get("detailInfo") instanceof JSONArray) {
            jSONObject3.put("detailInfo", (Object) jSONObject.getJSONObject("data").getJSONArray("detailInfo"));
        }
        jSONObject3.put("multiDetailInfo", (Object) jSONObject.getJSONObject("data").getJSONArray("multiDetailInfo"));
        JSONObject jSONObject4 = parseObject.getJSONObject("data").getJSONObject("data").getJSONObject("opButtons").getJSONObject("fields");
        JSONObject jSONObject5 = parseObject.getJSONObject("data").getJSONObject("data").getJSONObject("opButtons").getJSONObject("events");
        Iterator<Object> it = jSONObject.getJSONObject("data").getJSONArray(fne.KEY_OP).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                String str2 = (String) next;
                if (i > 1) {
                    break;
                } else if ((jSONObject2.get(str2) instanceof JSONObject) && (jSONObject2.getJSONObject(str2).get("text") instanceof String)) {
                    if (i == 0) {
                        jSONObject4.put("leftButtonEvent", (Object) str2);
                        jSONObject4.put("leftButtonText", (Object) jSONObject2.getJSONObject(str2).getString("text"));
                        str = "leftButtonEvent";
                    } else {
                        jSONObject4.put("rightButtonEvent", (Object) str2);
                        jSONObject4.put("rightButtonText", (Object) jSONObject2.getJSONObject(str2).getString("text"));
                        str = "rightButtonEvent";
                    }
                    if (iDMComponent.getFields() != null && iDMComponent.getFields().getJSONObject(bki.EVENT_CODE_CANCEL_ORDER_DOWNGRADE) != null && TextUtils.equals(iDMComponent.getFields().getJSONObject(bki.EVENT_CODE_CANCEL_ORDER_DOWNGRADE).getString(d.PARAM_OP_CODE), str2)) {
                        jSONObject4.put(bki.EVENT_CODE_CANCEL_ORDER_DOWNGRADE, (Object) iDMComponent.getFields().getJSONObject(bki.EVENT_CODE_CANCEL_ORDER_DOWNGRADE));
                        jSONObject4.put(str, (Object) bki.a(iDMComponent, str2));
                    } else {
                        jSONObject5.put(str2, (Object) bkg.a(jSONObject2.getJSONObject(str2).getJSONArray("event")));
                    }
                    i++;
                }
            }
        }
        return parseObject;
    }
}
