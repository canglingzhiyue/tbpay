package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.taobao.mytaobao.homepage.busniess.model.DeliverInfoBean;
import com.taobao.mytaobao.homepage.busniess.model.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class mwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1679898204);
    }

    public static void a(IDMComponent iDMComponent, List<DeliverInfoBean> list) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3e9cdd", new Object[]{iDMComponent, list});
        } else if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
        } else {
            fields.put(mtp.DELIVER_LIST, JSON.toJSON(list));
        }
    }

    public static void a(IDMComponent iDMComponent, JSONObject jSONObject) {
        JSONObject events;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1a8084", new Object[]{iDMComponent, jSONObject});
        } else if (iDMComponent != null && jSONObject != null && (events = iDMComponent.getEvents()) != null) {
            HashSet<String> hashSet = new HashSet();
            hashSet.add("scrollBarExposureItem");
            for (String str : events.keySet()) {
                if (str.startsWith("exposeScrollBar") || str.startsWith("removeScrollBar")) {
                    hashSet.add(str);
                }
            }
            for (String str2 : hashSet) {
                events.remove(str2);
            }
            events.putAll(jSONObject);
        }
    }

    public static void a(IDMComponent iDMComponent, DealInfo dealInfo) {
        JSONObject fields;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af21ebc3", new Object[]{iDMComponent, dealInfo});
        } else if (iDMComponent == null || iDMComponent.getFields() == null || dealInfo == null || (fields = iDMComponent.getFields()) == null || (jSONObject = fields.getJSONObject("orderInfo")) == null) {
        } else {
            try {
                String a2 = a(1, dealInfo);
                jSONObject.getJSONObject(a.C0733a.KEY_ORDER_PAY).put("count", (Object) a2);
                JSONObject jSONObject2 = jSONObject.getJSONObject(a.C0733a.KEY_ORDER_PAY);
                jSONObject2.put("accessbility", (Object) (jSONObject.getJSONObject(a.C0733a.KEY_ORDER_PAY).getString("name") + a2));
                String a3 = a(2, dealInfo);
                jSONObject.getJSONObject(a.C0733a.KEY_ORDER_DELIVER).put("count", (Object) a3);
                JSONObject jSONObject3 = jSONObject.getJSONObject(a.C0733a.KEY_ORDER_DELIVER);
                jSONObject3.put("accessbility", (Object) (jSONObject.getJSONObject(a.C0733a.KEY_ORDER_DELIVER).getString("name") + a3));
                String a4 = a(3, dealInfo);
                jSONObject.getJSONObject(a.C0733a.KEY_ORDER_RECEIVE).put("count", (Object) a4);
                JSONObject jSONObject4 = jSONObject.getJSONObject(a.C0733a.KEY_ORDER_RECEIVE);
                jSONObject4.put("accessbility", (Object) (jSONObject.getJSONObject(a.C0733a.KEY_ORDER_RECEIVE).getString("name") + a4));
                String a5 = a(4, dealInfo);
                jSONObject.getJSONObject(a.C0733a.KEY_ORDER_RATE).put("count", (Object) a5);
                JSONObject jSONObject5 = jSONObject.getJSONObject(a.C0733a.KEY_ORDER_RATE);
                jSONObject5.put("accessbility", (Object) (jSONObject.getJSONObject(a.C0733a.KEY_ORDER_RATE).getString("name") + a5));
                String a6 = a(5, dealInfo);
                jSONObject.getJSONObject(a.C0733a.KEY_ORDER_REFUND).put("count", (Object) a6);
                JSONObject jSONObject6 = jSONObject.getJSONObject(a.C0733a.KEY_ORDER_REFUND);
                jSONObject6.put("accessbility", (Object) (jSONObject.getJSONObject(a.C0733a.KEY_ORDER_REFUND).getString("name") + a6));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean b(IDMComponent iDMComponent, DealInfo dealInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e098a08", new Object[]{iDMComponent, dealInfo})).booleanValue();
        }
        if (iDMComponent != null && iDMComponent.getFields() != null && dealInfo != null) {
            JSONObject fields = iDMComponent.getFields();
            if (fields == null || (jSONObject = fields.getJSONObject("orderInfo")) == null) {
                return false;
            }
            try {
                Iterator<a.C0733a> it = a.C0733a.a().iterator();
                while (it.hasNext()) {
                    if (a(jSONObject, dealInfo, it.next())) {
                        z = true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    private static boolean a(JSONObject jSONObject, DealInfo dealInfo, a.C0733a c0733a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c2336c", new Object[]{jSONObject, dealInfo, c0733a})).booleanValue();
        }
        if (c0733a == null) {
            return false;
        }
        String a2 = a(c0733a.f18378a, dealInfo);
        if (TextUtils.equals(a2, jSONObject.getJSONObject(c0733a.b).getString("count"))) {
            return false;
        }
        jSONObject.getJSONObject(c0733a.b).put("count", (Object) a2);
        JSONObject jSONObject2 = jSONObject.getJSONObject(c0733a.b);
        jSONObject2.put("accessbility", (Object) (jSONObject.getJSONObject(c0733a.b).getString("name") + a2));
        return true;
    }

    private static String a(int i, DealInfo dealInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ca21bac", new Object[]{new Integer(i), dealInfo});
        }
        String str = null;
        if (dealInfo == null) {
            return "0";
        }
        if (i == 1) {
            str = dealInfo.toPayBiz;
        } else if (i == 2) {
            str = dealInfo.hasPaid;
        } else if (i == 3) {
            str = dealInfo.toConfirmBiz;
        } else if (i == 4) {
            str = dealInfo.toComment;
        } else if (i == 5) {
            str = dealInfo.refundBiz;
        }
        return str == null ? "0" : str;
    }

    public static List<DeliverInfoBean> a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c63e14db", new Object[]{iDMComponent});
        }
        if (iDMComponent != null && iDMComponent.getFields() != null && iDMComponent.getFields().containsKey(mtp.DELIVER_LIST)) {
            try {
                return JSONObject.parseArray(iDMComponent.getFields().getString(mtp.DELIVER_LIST), DeliverInfoBean.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
