package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class beb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-51925128);
    }

    public static Map<String, String> a(IDMComponent iDMComponent, bbz bbzVar, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a589f172", new Object[]{iDMComponent, bbzVar, strArr}) : a(iDMComponent, bbzVar, bex.a(strArr));
    }

    public static Map<String, String> a(IDMComponent iDMComponent, bbz bbzVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be133c58", new Object[]{iDMComponent, bbzVar, map});
        }
        HashMap hashMap = new HashMap();
        if (iDMComponent == null) {
            return hashMap;
        }
        JSONObject fields = iDMComponent.getFields();
        hashMap.put("wakeupType", fields.getString("wakeupType"));
        hashMap.put("shopId", fields.getString("shopId"));
        IDMComponent a2 = bei.a(iDMComponent, "shop");
        if (a2 != null) {
            hashMap.put("shopIndex", a(a2, bbzVar) + "");
        }
        hashMap.put("itemId", fields.getString("itemId"));
        if ("item".equals(iDMComponent.getTag())) {
            hashMap.put("itemIndex", String.valueOf(a(iDMComponent, bbzVar)));
        }
        hashMap.put("bizCodes", fields.getString("bizCodes"));
        if (fields.getJSONObject("sku") != null) {
            hashMap.put("isSKUInvalid", fields.getJSONObject("sku").getString("skuInvalid"));
        }
        hashMap.put("isInvalid", fields.getString("titleInCheckBox"));
        hashMap.put("invalidMessage", fields.getString("codeMsg"));
        hashMap.put("isManaging", bbzVar.n().j() + "");
        hashMap.put("currentFilterItem", bbzVar.n().b());
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static Map<String, String> b(IDMComponent iDMComponent, bbz bbzVar, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c4442933", new Object[]{iDMComponent, bbzVar, strArr}) : b(iDMComponent, bbzVar, bex.a(strArr));
    }

    public static Map<String, String> b(IDMComponent iDMComponent, bbz bbzVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e6597c99", new Object[]{iDMComponent, bbzVar, map});
        }
        HashMap hashMap = new HashMap();
        if (iDMComponent == null) {
            return hashMap;
        }
        IDMComponent a2 = bei.a(iDMComponent, "shop");
        JSONObject fields = a2 != null ? a2.getFields() : null;
        if (fields == null) {
            return hashMap;
        }
        hashMap.put("wakeupType", fields.getString("wakeupType"));
        hashMap.put("shopId", fields.getString("shopId"));
        hashMap.put("shopIndex", String.valueOf(a(a2, bbzVar)));
        hashMap.put("showSubTitle", fields.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE));
        hashMap.put("currentFilterItem", bbzVar.n().b());
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static int a(IDMComponent iDMComponent, bbz bbzVar) {
        jny H;
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d68487d5", new Object[]{iDMComponent, bbzVar})).intValue();
        }
        if (iDMComponent == null || (H = bbzVar.H()) == null) {
            return -1;
        }
        if (bbzVar.n().d()) {
            b = bbzVar.n().q();
        } else {
            b = H.b();
        }
        if (b == null) {
            return -1;
        }
        String tag = iDMComponent.getTag();
        if (TextUtils.isEmpty(tag)) {
            return -1;
        }
        for (IDMComponent iDMComponent2 : b) {
            if (iDMComponent2 != null && tag.equals(iDMComponent2.getTag())) {
                if (iDMComponent2.equals(iDMComponent)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
