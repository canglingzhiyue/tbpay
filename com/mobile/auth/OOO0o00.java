package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class OOO0o00 {
    public static String O000000o(String str, String str2) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                boolean z = true;
                for (Map.Entry<?, ?> entry : O000000o(new JSONObject(str).toString()).entrySet()) {
                    Object obj = "";
                    stringBuffer.append(z ? obj : str2);
                    stringBuffer.append((String) entry.getKey());
                    stringBuffer.append("=");
                    Object obj2 = obj;
                    if (entry.getValue() != null) {
                        obj2 = entry.getValue();
                    }
                    stringBuffer.append(obj2);
                    z = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private static TreeMap<?, ?> O000000o(String str) {
        try {
            try {
                JSONObject jSONObject = new JSONObject(str);
                TreeMap<?, ?> treeMap = new TreeMap<>();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    treeMap.put(next, jSONObject.getString(next));
                }
                return treeMap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
