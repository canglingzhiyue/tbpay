package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.tao.Globals;
import java.util.Map;

/* loaded from: classes7.dex */
public class lsn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f30897a = Globals.getApplication();
    private final lsr b;

    static {
        kge.a(-370720583);
    }

    public lsn(lsr lsrVar) {
        this.b = lsrVar;
    }

    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 需要塞入的广告底纹词是：" + jSONObject);
        lsr lsrVar = this.b;
        if (lsrVar == null) {
            return false;
        }
        if (a(lsrVar.b(), jSONObject)) {
            this.b.e();
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 底纹词刷新成功————————————");
            return true;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 获取搜索框数据异常，更新数据失败。naviBarData 为空，或者没有subSection字段");
        return false;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("subSection")) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "keepAdSearchData-> subTabSearchBarData———————————— searchBoxData is null");
            return false;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("subSection");
        if (jSONObject3 == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "keepAdSearchData-> subTabSearchBarData———————————— oldSearchBarSubData is null");
            return false;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("0", (Object) jSONObject2);
        try {
            int i = 1;
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                Object value = entry.getValue();
                if (!JSONObject.parseObject(value.toString()).containsKey("traceId")) {
                    jSONObject4.put(String.valueOf(i), value);
                    i++;
                }
            }
            jSONObject.put("subSection", (Object) jSONObject4);
            return true;
        } catch (NumberFormatException e) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 处理搜索框原始数据时发生异常，更新数据失败。具体异常为：" + Log.getStackTraceString(e));
            return false;
        }
    }

    public InteractLocationData a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractLocationData) ipChange.ipc$dispatch("97539adf", new Object[]{this, str, str2});
        }
        if (this.b == null) {
            return null;
        }
        if (!"DXSearchBar".equals(str) || TextUtils.isEmpty(str2)) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 必传参数有误，获取搜索栏坐标失败。bizCode:" + str + " viewTag:" + str2);
            return null;
        }
        Map<String, Integer> a2 = this.b.a("DXSearchBar", str2);
        if (a2 != null) {
            InteractLocationData interactLocationData = new InteractLocationData();
            Integer num = a2.get("width");
            if (num == null) {
                return null;
            }
            interactLocationData.width = num.intValue();
            Integer num2 = a2.get("height");
            if (num2 == null) {
                return null;
            }
            interactLocationData.height = num2.intValue();
            Integer num3 = a2.get("positionX");
            if (num3 == null) {
                return null;
            }
            interactLocationData.positionX = num3.intValue();
            Integer num4 = a2.get("positionY");
            if (num4 == null) {
                return null;
            }
            interactLocationData.positionY = num4.intValue();
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 搜索框坐标信息：" + a2);
            return interactLocationData;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 没有找到搜索框坐标信息！！！");
        return null;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : gbg.a(this.f30897a, 17.5f);
    }

    public JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        if (this.b == null) {
            return null;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "keepAdSearchData-> 新手村保护的广告底纹词是：" + jSONObject);
        JSONObject a2 = this.b.a();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("keepAdSearchData-> subTabSearchBarData———————————— size  = ");
        sb.append(a2 == null ? 0 : a2.size());
        strArr[0] = sb.toString();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr);
        JSONObject b = this.b.b();
        String[] strArr2 = new String[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("keepAdSearchData-> subTabSearchBarData searchBoxSubData———————————— size  = ");
        sb2.append(b == null ? 0 : b.size());
        strArr2[0] = sb2.toString();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr2);
        boolean a3 = a(b, jSONObject);
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "keepAdSearchData-> 底纹词保持首位结果————————————" + a3);
        if (!a3) {
            return null;
        }
        return a2;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        lsr lsrVar = this.b;
        if (lsrVar != null) {
            return lsrVar.c();
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        lsr lsrVar = this.b;
        if (lsrVar != null) {
            return lsrVar.d();
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        lsr lsrVar = this.b;
        if (lsrVar != null) {
            return lsrVar.g();
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        lsr lsrVar = this.b;
        if (lsrVar != null) {
            return lsrVar.h();
        }
        return false;
    }
}
