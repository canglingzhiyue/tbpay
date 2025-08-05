package tb;

import android.view.Menu;
import com.alibaba.aliweex.f;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* loaded from: classes2.dex */
public abstract class amu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(442290524);
    }

    public abstract f getHeight(WXSDKInstance wXSDKInstance);

    public abstract f getStatusBarHeight(WXSDKInstance wXSDKInstance);

    public abstract f hasMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract f hide(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract boolean onCreateOptionsMenu(WXSDKInstance wXSDKInstance, Menu menu);

    public abstract f setBadgeStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract f setLeftItem(WXSDKInstance wXSDKInstance, JSONObject jSONObject, a aVar);

    public abstract f setMoreItem(WXSDKInstance wXSDKInstance, JSONObject jSONObject, a aVar);

    public abstract f setRightItem(WXSDKInstance wXSDKInstance, JSONObject jSONObject, a aVar);

    public abstract f setStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract f setTitle(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract f setTransparent(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract f show(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public f showMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("ffa046e1", new Object[]{this, wXSDKInstance, jSONObject});
        }
        f fVar = new f();
        fVar.f2023a = "WX_NOT_SUPPORTED";
        fVar.b = "Only Taobao app support showMenu(), check implement in TBNavBarAdapter";
        return fVar;
    }
}
