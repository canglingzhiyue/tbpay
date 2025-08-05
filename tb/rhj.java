package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.home.component.utils.e;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.windvane.b;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class rhj implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-784230036);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("getFoldDeviceInfo");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(str2, wVCallBackContext);
    }

    public boolean a(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            r rVar = new r();
            if (com.taobao.homepage.utils.b.c()) {
                str2 = "foldPhone";
                boolean b = com.taobao.homepage.utils.b.b(Globals.getApplication());
                jSONObject.put("foldStatus", b ? itk.TYPE_FOLD : AbsListWidgetInstance.KEY_SECTION_EXPAND);
                e.e("homepage.HomePageWVPlugin", "折叠屏手机weex折叠态判断， 折叠态：" + b);
            } else if (com.taobao.homepage.utils.b.b()) {
                str2 = "androidPad";
                e.e("homepage.HomePageWVPlugin", "Pad weex判断机型参数");
            } else {
                str2 = "phone";
            }
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, str2);
            rVar.a("deviceInfo", jSONObject);
            wVCallBackContext.success(rVar);
            lap.a("Bridge", "getFoldDeviceInfo", "homepage.HomePageWVPlugin.getFoldDeviceInfo; success");
        } catch (Throwable th) {
            lap.a("Bridge", "getFoldDeviceInfo", "homepage.HomePageWVPlugin.getFoldDeviceInfo; fail; exception: " + Log.getStackTraceString(th));
        }
        return true;
    }
}
