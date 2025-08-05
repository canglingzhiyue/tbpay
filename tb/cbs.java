package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.weex.common.Constants;
import java.io.File;

/* loaded from: classes3.dex */
public class cbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(196841873);
    }

    public static Boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("cdaba030", new Object[]{str}) : Boolean.valueOf(new File("/data/local/tmp/", str).exists());
    }

    public static boolean a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cb6e294", new Object[]{context, jSONObject})).booleanValue();
        }
        if (!b(".useThemisWidget").booleanValue()) {
            return TMSSwitchUtils.useThemisWidget(context, jSONObject);
        }
        return true;
    }

    public static Boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("410b752f", new Object[]{str});
        }
        try {
            if (Integer.parseInt(str) > 0) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null) {
            return i;
        }
        try {
            if (str.endsWith("rpx")) {
                str = str.substring(0, str.length() - 3);
            }
            return Integer.parseInt(str);
        } catch (Exception e) {
            RVLogger.e(e.getMessage());
            return i;
        }
    }

    public static WidgetRenderContainer.GestureMode a(WidgetStartParams widgetStartParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetRenderContainer.GestureMode) ipChange.ipc$dispatch("c1895355", new Object[]{widgetStartParams});
        }
        if (widgetStartParams == null) {
            return WidgetRenderContainer.GestureMode.DEFAULT;
        }
        JSONObject jSONObject = null;
        String sceneParams = widgetStartParams.getSceneParams();
        if (!TextUtils.isEmpty(sceneParams)) {
            try {
                jSONObject = JSON.parseObject(sceneParams);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (jSONObject == null || jSONObject.getString("gestureMode") == null) {
            return WidgetRenderContainer.GestureMode.DEFAULT;
        }
        String string = jSONObject.getString("gestureMode");
        char c = 65535;
        switch (string.hashCode()) {
            case -1984141450:
                if (string.equals("vertical")) {
                    c = 1;
                    break;
                }
                break;
            case 96673:
                if (string.equals("all")) {
                    c = 3;
                    break;
                }
                break;
            case 3387192:
                if (string.equals("none")) {
                    c = 0;
                    break;
                }
                break;
            case 1387629604:
                if (string.equals(Constants.Value.HORIZONTAL)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return WidgetRenderContainer.GestureMode.NONE;
        }
        if (c == 1) {
            return WidgetRenderContainer.GestureMode.VERTICAL;
        }
        if (c == 2) {
            return WidgetRenderContainer.GestureMode.HORIZONTAL;
        }
        if (c == 3) {
            return WidgetRenderContainer.GestureMode.ALL;
        }
        return WidgetRenderContainer.GestureMode.DEFAULT;
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
        return applicationContext == null ? i2 : (i * applicationContext.getResources().getDisplayMetrics().widthPixels) / 750;
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i > 0) {
            return (i2 * i) / 750;
        }
        return a(i2, i3);
    }
}
