package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.utils.b;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class sdg implements ktx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1289250355);
        kge.a(1692916670);
    }

    @Override // tb.ktx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "deviceInfo";
    }

    @Override // tb.ktx
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (b.c()) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "foldPhone");
            boolean b = b.b(Globals.getApplication());
            jSONObject.put("foldStatus", (Object) (b ? itk.TYPE_FOLD : AbsListWidgetInstance.KEY_SECTION_EXPAND));
            e.e("DeviceInfoBizParams", "折叠屏手机上行机型参数, 折叠态：" + b);
            return jSONObject.toJSONString();
        } else if (b.b()) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "androidPad");
            e.e("DeviceInfoBizParams", "Pad上行机型参数");
            return jSONObject.toJSONString();
        } else {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "phone");
            e.e("DeviceInfoBizParams", "Phone上行机型参数");
            return jSONObject.toJSONString();
        }
    }
}
