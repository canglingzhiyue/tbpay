package com.taobao.umipublish.extension.windvane.abilities;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.taopai.material.a;
import com.taobao.taopai.material.bean.MaterialResource;
import com.taobao.taopai.material.request.materialdetail.b;
import tb.acg;
import tb.hdx;
import tb.kge;
import tb.qby;

/* loaded from: classes9.dex */
public class DownloadMaterialAbility extends BaseAbility implements qby {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1794037981);
        kge.a(-381653636);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("5001", "EMPTY_PARAMS");
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("materialIds");
            if (jSONArray == null || jSONArray.size() == 0) {
                errorCallback("5001", "EMPTY_DATA");
                return;
            }
            int i = hdx.LE_VERSION;
            b bVar = new b(at.a(jSONArray.getString(0), 0));
            bVar.a(true);
            bVar.a(2592000L);
            bVar.a(i);
            new a(this.mContext, "guangguang", "guangguang").a(acg.a(), bVar, this);
        }
    }

    @Override // tb.qby
    public void a(MaterialResource materialResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53722e5", new Object[]{this, materialResource});
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add((JSONObject) JSON.toJSON(materialResource));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("materialList", (Object) jSONArray);
            successCallback(jSONObject);
        } catch (Throwable th) {
            errorCallback("5001", Log.getStackTraceString(th));
        }
    }

    @Override // tb.qby
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            progressCallback(i);
        }
    }

    @Override // tb.qbu
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        errorCallback("5001", str + "," + str2);
    }
}
