package tb;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.sp.framework.model.SimpleProfile;

/* loaded from: classes6.dex */
public class ine extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1764068805);
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        Context d = imp.a().d();
        Point point = new Point();
        ((WindowManager) d.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getSize(point);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) inr.a(d));
        jSONObject.put("packageType", (Object) inr.d(d));
        jSONObject.put(SimpleProfile.KEY_DISPLAYNAME, (Object) inr.b(d));
        jSONObject.put("os", (Object) "Android");
        jSONObject.put("deviceName", (Object) Build.DEVICE);
        jSONObject.put("screenHeight", (Object) String.valueOf(point.y));
        jSONObject.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) String.valueOf(point.x));
        jSONObject.put("systemVersion", (Object) Build.VERSION.RELEASE);
        jSONObject.put("isFoldable", (Object) String.valueOf(ScreenType.IS_FOLDABLE));
        jSONObject.put("isPad", (Object) String.valueOf(ScreenType.IS_PAD));
        jSONObject.put(p.KEY_DEVICE_TYPE, (Object) ScreenType.b());
        imn b = imo.b();
        if (b != null) {
            jSONObject.put("sversion", (Object) b.a().e());
            jSONObject.put("utdid", (Object) b.a().b());
        }
        return jSONObject;
    }
}
