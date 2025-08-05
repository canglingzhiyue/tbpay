package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class epw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str == null ? "" : str;
    }

    static {
        kge.a(183193377);
        emu.a("com.taobao.android.detail.datasdk.utils.DetailModelUtils");
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> ArrayList<T> a(JSONArray jSONArray, epy<T> epyVar) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f7766ec", new Object[]{jSONArray, epyVar});
        }
        if (jSONArray == null) {
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            try {
                t = epyVar.b(it.next());
            } catch (Throwable th) {
                Log.e("DetailModel", "error", th);
                t = null;
            }
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <V> HashMap<String, V> a(JSONObject jSONObject, epy<V> epyVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9811a4ed", new Object[]{jSONObject, epyVar});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        HashMap<String, V> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            V v = null;
            try {
                str = entry.getKey();
                v = epyVar.b(entry.getValue());
            } catch (Throwable unused) {
                str = null;
            }
            if (v != null) {
                hashMap.put(str, v);
            }
        }
        return hashMap;
    }

    /* loaded from: classes4.dex */
    public static class a implements epy<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-448064126);
            kge.a(-349622218);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
        @Override // tb.epy
        public /* synthetic */ String b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
        }

        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
            }
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        }
    }
}
