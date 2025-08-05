package com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.itk;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lli;

/* loaded from: classes7.dex */
public class a implements IContainerDataService.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IFoldDeviceAndPadService f17487a;

    static {
        kge.a(1051963597);
        kge.a(-2045124568);
    }

    public a(ljs ljsVar) {
        this.f17487a = (IFoldDeviceAndPadService) ljsVar.a(IFoldDeviceAndPadService.class);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.d
    public Map<String, String> a(lli lliVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (b.b()) {
            boolean b = b.b(Globals.getApplication());
            IFoldDeviceAndPadService iFoldDeviceAndPadService = this.f17487a;
            boolean z = iFoldDeviceAndPadService != null && iFoldDeviceAndPadService.isAdaptHudScreen();
            jSONObject.put("foldStatus", (Object) (b ? itk.TYPE_FOLD : AbsListWidgetInstance.KEY_SECTION_EXPAND));
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "foldPhone");
            jSONObject.put("isHudScreenData", (Object) String.valueOf(z));
            ldf.d("DeviceInfoParamCreator", "折叠屏手机上行机型参数: " + b + " 当前是否是大屏数据: " + z);
        } else if (b.a()) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "androidPad");
            IFoldDeviceAndPadService iFoldDeviceAndPadService2 = this.f17487a;
            boolean z2 = iFoldDeviceAndPadService2 != null && iFoldDeviceAndPadService2.isAdaptHudScreen();
            jSONObject.put("isHudScreenData", (Object) String.valueOf(z2));
            ldf.d("DeviceInfoParamCreator", "Pad上行机型参数, 当前是否是大屏数据: " + z2);
        } else {
            ldf.d("DeviceInfoParamCreator", "普通手机上行机型参数");
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "phone");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceInfo", jSONObject.toJSONString());
        return hashMap;
    }
}
