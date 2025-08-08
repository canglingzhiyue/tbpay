package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.holder.e;
import com.taobao.android.detail.mainpic.holder.f;
import com.taobao.android.detail.mainpic.holder.j;
import com.taobao.android.detail.mainpic.holder.m;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class euq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2901b94a", new Object[]{context, str});
        }
        try {
            return JSON.parseObject(a(AssetsDelegate.proxy_open(context.getAssets(), str)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("172620d5", new Object[]{inputStream});
        }
        String str = null;
        try {
            Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static IDMComponent a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("dff6e5f0", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        return iDMComponent.getParent() != null ? a(iDMComponent.getParent()) : iDMComponent;
    }

    public static boolean a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bc096ec", new Object[]{iDMComponent, iDMComponent2})).booleanValue() : (iDMComponent == null || iDMComponent2 == null || !StringUtils.equals(iDMComponent.getFields().getString("alias"), iDMComponent2.getFields().getString("alias"))) ? false : true;
    }

    public static boolean a(String str, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("76cad266", new Object[]{str, iDMComponent})).booleanValue() : (iDMComponent == null || str == null || iDMComponent.getFields() == null || !StringUtils.equals(iDMComponent.getFields().getString("locator"), str)) ? false : true;
    }

    public static IDMComponent b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("2071fb8f", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if (iDMComponent2 != null && (m.f.equals(iDMComponent2.getType()) || f.e.equals(iDMComponent2.getType()))) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public static IDMComponent c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("60ed112e", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if (iDMComponent2 != null && (j.e.equals(iDMComponent2.getType()) || e.e.equals(iDMComponent2.getType()))) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public static boolean d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d2cad4d", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent != null && iDMComponent.getChildren() != null) {
            for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
                if (iDMComponent2 != null && StringUtils.isEmpty(iDMComponent2.getPosition())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static IDMComponent a(IDMComponent iDMComponent, String str) {
        List<IDMComponent> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("339b7bba", new Object[]{iDMComponent, str});
        }
        if (iDMComponent == null || (children = iDMComponent.getChildren()) == null) {
            return null;
        }
        for (IDMComponent iDMComponent2 : children) {
            if (str.equals(iDMComponent2.getTag())) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public static void a(IDMComponent iDMComponent, String str, String str2) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d181700", new Object[]{iDMComponent, str, str2});
        } else if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
        } else {
            fields.remove(str);
            fields.put(str, (Object) str2);
        }
    }

    public static void e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a19c468", new Object[]{iDMComponent});
        } else {
            a(iDMComponent, "isForceRenderOnce", "true");
        }
    }

    public static JSONObject a(IDMComponent iDMComponent, String str, String str2, String str3) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("571e83ea", new Object[]{iDMComponent, str, str2, str3});
        }
        if (iDMComponent != null && (jSONArray = iDMComponent.getEvents().getJSONArray(str)) != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    if (str2.equals(jSONObject2.getString("type")) && (jSONObject = jSONObject2.getJSONObject("fields")) != null && str3.equals(jSONObject.getString("arg1"))) {
                        return jSONObject2;
                    }
                }
            }
        }
        return null;
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{jSONObject, str, str2});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("fields")) == null || (jSONObject3 = jSONObject2.getJSONObject("args")) == null) {
        } else {
            jSONObject3.remove(str);
            if (str2 == null) {
                return;
            }
            jSONObject3.put(str, (Object) str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.euq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "4dcf7ed"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            r0 = 0
            if (r3 == 0) goto L62
            if (r4 == 0) goto L62
            int r1 = r4.size()
            if (r1 != 0) goto L24
            goto L62
        L24:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L56
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch: java.lang.Exception -> L56
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L54
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L54
        L34:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Exception -> L54
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Exception -> L54
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> L54
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L54
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L54
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L54
            if (r2 == 0) goto L34
            if (r1 == 0) goto L34
            r3.appendQueryParameter(r2, r1)     // Catch: java.lang.Exception -> L54
            goto L34
        L54:
            r4 = move-exception
            goto L58
        L56:
            r4 = move-exception
            r3 = r0
        L58:
            r4.printStackTrace()
        L5b:
            if (r3 == 0) goto L62
            java.lang.String r3 = r3.toString()
            return r3
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.euq.a(java.lang.String, java.util.Map):java.lang.String");
    }

    public static String a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && str != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null) {
            return jSONObject2.getString(str);
        }
        return null;
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue();
        }
        String[] split = str.split(":");
        try {
            return Integer.valueOf(split[0]).intValue() / Integer.valueOf(split[1]).intValue();
        } catch (Throwable th) {
            AdapterForTLog.loge("DataUtil", "detail.getAspectRatio error: " + th.getMessage());
            return -1.0f;
        }
    }
}
