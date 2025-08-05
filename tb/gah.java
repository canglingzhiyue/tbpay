package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.exception.a;

/* loaded from: classes5.dex */
public class gah {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REBUILD_ALL = 0;
    public static final int REBUILD_CONTAINER = 2;
    public static final int REBUILD_NONE = 1;
    public static final int REFRESH_TYPE_LAYOUT = 1;
    public static final int REFRESH_TYPE_PARSE = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f28249a = 0;
    public int b = 0;

    static {
        kge.a(-969578651);
    }

    private gah() {
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f28249a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public static gah a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gah) ipChange.ipc$dispatch("29011cf0", new Object[]{jSONObject});
        }
        gah gahVar = new gah();
        if (jSONObject == null) {
            return gahVar;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("originParams");
            if (jSONObject2 == null) {
                return gahVar;
            }
            String string = jSONObject2.getString("refreshStrategy");
            if (TextUtils.isEmpty(string)) {
                return gahVar;
            }
            if (string.toLowerCase().equals("rebuildcontainer")) {
                gahVar.f28249a = 2;
            } else if (string.equalsIgnoreCase("rebuildall")) {
                gahVar.f28249a = 0;
            } else if (string.equalsIgnoreCase("rebuildnone")) {
                gahVar.f28249a = 1;
            } else {
                gahVar.f28249a = 0;
            }
            String string2 = jSONObject2.getString("refreshType");
            if (TextUtils.isEmpty(string2)) {
                return gahVar;
            }
            if (string2.equalsIgnoreCase("layout")) {
                gahVar.b = 1;
            } else {
                gahVar.b = 0;
            }
            return gahVar;
        } catch (Exception e) {
            a.b(e);
            return gahVar;
        }
    }
}
