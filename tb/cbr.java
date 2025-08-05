package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class cbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public interface a {
        void a(WXSDKInstance wXSDKInstance, String str, String str2);
    }

    static {
        kge.a(-1488385759);
    }

    public static /* synthetic */ void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else {
            b(jSONObject, jSONObject2);
        }
    }

    public static void a(RenderContainer renderContainer, WXSDKInstance wXSDKInstance, String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a8b4cf", new Object[]{renderContainer, wXSDKInstance, str, aVar});
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("renderStart", (Object) Long.valueOf(System.currentTimeMillis()));
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        wXSDKInstance.a(renderContainer);
        wXSDKInstance.c(true);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", str);
        wXSDKInstance.c("TRWidgetMiniAppEmbedView", str, hashMap, null, WXRenderStrategy.APPEND_ASYNC);
        wXSDKInstance.a(new d() { // from class: tb.cbr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance2, new Integer(i), new Integer(i2)});
                }
            }

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance2, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance2, view});
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance2, new Integer(i), new Integer(i2)});
                    return;
                }
                jSONObject2.put("renderSuccess", (Object) Long.valueOf(System.currentTimeMillis()));
                cbr.a(jSONObject, jSONObject2);
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance2, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance2, str2, str3});
                    return;
                }
                a aVar2 = a.this;
                if (aVar2 != null) {
                    aVar2.a(wXSDKInstance2, str2, str3);
                }
                jSONObject2.put("renderError", (Object) Long.valueOf(System.currentTimeMillis()));
                cbr.a(jSONObject, jSONObject2);
            }
        });
    }

    private static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{jSONObject, jSONObject2});
            return;
        }
        try {
            a("Triver", "WeexWidgetLaunch", jSONObject, jSONObject2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04f5c7c", new Object[]{str, str2, jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject.size() > 0 && jSONObject2 != null) {
            DimensionSet create = DimensionSet.create();
            DimensionValueSet create2 = DimensionValueSet.create();
            for (String str3 : jSONObject.keySet()) {
                create.addDimension(new Dimension(str3));
                create2.setValue(str3, jSONObject.getString(str3));
            }
            MeasureSet create3 = MeasureSet.create();
            MeasureValueSet create4 = MeasureValueSet.create();
            for (String str4 : jSONObject2.keySet()) {
                create3.addMeasure(new Measure(str4));
                create4.setValue(str4, jSONObject2.getDoubleValue(str4));
            }
            AppMonitor.register(str, str2, create3, create, true);
            AppMonitor.Stat.commit(str, str2, create2, create4);
        }
    }
}
