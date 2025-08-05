package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.tao.content.business.b;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes5.dex */
public class BusinessModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1189092112);
        kge.a(-818961104);
    }

    public static void reportBusiness(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a118c4", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            b bVar = new b();
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            contentBusinessModel.adUserId = jSONObject.getString(b.ACCOUNT_ID);
            contentBusinessModel.itemId = jSONObject.getString("itemId");
            contentBusinessModel.contentId = jSONObject.getString("contentId");
            contentBusinessModel.ct = jSONObject.getString(b.CT);
            contentBusinessModel.sId = jSONObject.getString(b.SID);
            contentBusinessModel.scenceId = jSONObject.getString(b.BIZ_TYPE);
            contentBusinessModel.pageName = jSONObject.getString("pageName");
            contentBusinessModel.tcpBid = jSONObject.getString(b.TCP_BID);
            contentBusinessModel.sourceType = jSONObject.getString("sourceType");
            try {
                contentBusinessModel.context = new org.json.JSONObject(jSONObject.getJSONObject("extObject").toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            bVar.a(contentBusinessModel, (IRemoteBaseListener) null);
        }
    }
}
