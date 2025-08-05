package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/taobao/mytaobao/preload/DxPreloadHelper;", "", "()V", "hasPreload", "", "list", "", "Lcom/alibaba/fastjson/JSONObject;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "considerPreloadDx", "", "dxEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "corePreloadDx", "mainApiData", "generateType2DxDataMap", "", "", "rootData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class oby {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oby INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31905a;
    private static List<JSONObject> b;

    static {
        kge.a(-1230761029);
        INSTANCE = new oby();
        b = new ArrayList();
    }

    private oby() {
    }

    public final void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
        } else if (dinamicXEngine == null || f31905a) {
        } else {
            f31905a = true;
            nwv.a("corePreloadDx", 0);
            JSONObject g = mxe.INSTANCE.g();
            if (g == null) {
                q.a();
            }
            a(g, dinamicXEngine);
            nwv.b("corePreloadDx", 0);
        }
    }

    private final void a(JSONObject jSONObject, DinamicXEngine dinamicXEngine) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4610fcb9", new Object[]{this, jSONObject, dinamicXEngine});
            return;
        }
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("container")) != null && (jSONArray = jSONObject2.getJSONArray("data")) != null) {
                Map<String, JSONObject> a2 = a(jSONObject3);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                    if (!(!q.a((Object) jSONObject4.getString("containerType"), (Object) "dinamicx"))) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        JSONArray jSONArray2 = jSONObject4.getJSONArray("type");
                        Object a3 = jSONArray2 != null ? p.a((List<? extends Object>) jSONArray2, 0) : null;
                        if (!(a3 instanceof String)) {
                            a3 = null;
                        }
                        String str = (String) a3;
                        String string2 = jSONObject4.getString("name");
                        if (string2 != null && (string = jSONObject4.getString("url")) != null) {
                            long longValue = jSONObject4.getLongValue("version");
                            if (longValue > 0) {
                                dXTemplateItem.f11925a = string2;
                                dXTemplateItem.b = longValue;
                                dXTemplateItem.c = string;
                                DXTemplateItem a4 = dinamicXEngine.a(dXTemplateItem);
                                if (a4 != null) {
                                    dinamicXEngine.a(Globals.getApplication(), a4, a2.get(str), -1, (DXRenderOptions) null);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("preRenderTemplate, name=");
                                    sb.append(string2);
                                    sb.append(" data=");
                                    JSONObject jSONObject5 = a2.get(str);
                                    if (jSONObject5 == null) {
                                        q.a();
                                    }
                                    sb.append(jSONObject5.toJSONString());
                                    Log.e("dsw", sb.toString());
                                    JSONObject jSONObject6 = a2.get(str);
                                    if (jSONObject6 != null) {
                                        b.add(jSONObject6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "下载dx异常，throw:" + th);
        }
    }

    private final Map<String, JSONObject> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            jSONObject2 = jSONObject.getJSONObject("data");
        } catch (Throwable unused) {
        }
        if (jSONObject2 == null) {
            return linkedHashMap;
        }
        Collection<Object> values = jSONObject2.values();
        q.a((Object) values, "data.values");
        for (Object obj : values) {
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject3 = (JSONObject) obj;
            if (jSONObject3 != null && (string = jSONObject3.getString("type")) != null) {
                linkedHashMap.put(string, jSONObject3);
            }
        }
        return linkedHashMap;
    }
}
