package com.alibaba.ariver.app.api.model;

import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.themis.utils.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AppConfigModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = a.ATOM_EXT_window)
    private JSONObject appLaunchParams;
    @JSONField(name = "includeFiles")
    private List<String> includeFiles;
    @JSONField(name = RVConstants.EXTRA_RES_LAUNCH_PARAMS)
    private JSONObject pageLaunchParams;
    @JSONField
    private List<String> pages;
    @JSONField
    private String useDynamicPlugins;

    public static AppConfigModel parseFromJSONObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppConfigModel) ipChange.ipc$dispatch("2d4e31c4", new Object[]{jSONObject}) : manualParseJsonObject(jSONObject);
    }

    public static AppConfigModel parseFromJSON(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppConfigModel) ipChange.ipc$dispatch("bd939232", new Object[]{bArr});
        }
        AppConfigModel appConfigModel = (AppConfigModel) i.a(bArr, AppConfigModel.class);
        return appConfigModel != null ? appConfigModel : manualParseJson(bArr);
    }

    public static AppConfigModel manualParseJson(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppConfigModel) ipChange.ipc$dispatch("f6d6bbe2", new Object[]{bArr}) : manualParseJsonObject(i.a(bArr));
    }

    public static AppConfigModel manualParseJsonObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppConfigModel) ipChange.ipc$dispatch("b5cc5614", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        AppConfigModel appConfigModel = new AppConfigModel();
        appConfigModel.appLaunchParams = i.a(jSONObject, a.ATOM_EXT_window, new JSONObject());
        appConfigModel.pageLaunchParams = i.a(jSONObject, RVConstants.EXTRA_RES_LAUNCH_PARAMS, new JSONObject());
        appConfigModel.useDynamicPlugins = i.a(jSONObject, RVStartParams.KEY_USE_DYNAMIC_PLUGIN);
        JSONArray a2 = i.a(jSONObject, "pages", (JSONArray) null);
        if (a2 != null) {
            ArrayList arrayList = new ArrayList();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(a2.getString(i));
            }
            appConfigModel.pages = arrayList;
        }
        return appConfigModel;
    }

    public JSONObject getAppLaunchParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dfe2ff4b", new Object[]{this}) : this.appLaunchParams;
    }

    public void setAppLaunchParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b886b31", new Object[]{this, jSONObject});
        } else {
            this.appLaunchParams = jSONObject;
        }
    }

    public List<String> getPages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("51843212", new Object[]{this}) : this.pages;
    }

    public void setPages(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3887efa", new Object[]{this, list});
        } else {
            this.pages = list;
        }
    }

    public JSONObject getPageLaunchParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("18184365", new Object[]{this}) : this.pageLaunchParams;
    }

    public void setPageLaunchParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58938dbf", new Object[]{this, jSONObject});
        } else {
            this.pageLaunchParams = jSONObject;
        }
    }

    public List<String> getIncludeFiles() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("93c8799b", new Object[]{this}) : this.includeFiles;
    }

    public void setIncludeFiles(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9229cd29", new Object[]{this, list});
        } else {
            this.includeFiles = list;
        }
    }

    public String getUseDynamicPlugins() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee741327", new Object[]{this}) : this.useDynamicPlugins;
    }

    public void setUseDynamicPlugins(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8d5997", new Object[]{this, str});
        } else {
            this.useDynamicPlugins = str;
        }
    }
}
