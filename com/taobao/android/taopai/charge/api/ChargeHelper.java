package com.taobao.android.taopai.charge.api;

import com.taobao.android.taopai.charge.data.TpChargeBean;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.izd;
import tb.kge;

/* loaded from: classes6.dex */
public class ChargeHelper implements Serializable, IMTOPDataObject {
    private static final String TAG = "ChargeHelper";

    static {
        kge.a(1003564460);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public static void commitBillingInfo(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        log(str, strArr, strArr2, strArr3);
        izd.a().a(new TpChargeBean.a().a(arrayToList(strArr)).a(arrayToMap(strArr2)).a(str).a());
    }

    public static void commitBillingInfoWithBizLine(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3) {
        log(str3 + " " + str + " " + str2, strArr, strArr2, strArr3);
        izd.a().a(new TpChargeBean.a().a(arrayToList(strArr)).a(arrayToMap(strArr2)).a(str3).e(str).f(str2).a(str3).a());
    }

    private static void log(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            sb.append("materialId = ");
            for (String str2 : strArr) {
                sb.append(str2 + " ;");
            }
        }
        if (strArr2 != null) {
            sb.append("detail = ");
            for (String str3 : strArr2) {
                sb.append(str3 + " ;");
            }
        }
        if (strArr3 != null) {
            sb.append("extend = ");
            for (String str4 : strArr3) {
                sb.append(str4 + " ;");
            }
        }
        String str5 = "commitBillingInfo " + str + ", content = " + sb.toString();
    }

    private static Map<String, String> arrayToMap(String[] strArr) {
        HashMap hashMap = new HashMap();
        if (strArr == null) {
            return hashMap;
        }
        int length = strArr.length / 2;
        for (int i = 0; i < length; i += 2) {
            hashMap.put(strArr[i], strArr[1]);
        }
        return hashMap;
    }

    private static List<String> arrayToList(String[] strArr) {
        if (strArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(strArr);
    }
}
