package com.taobao.android.actionservice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;

/* loaded from: classes4.dex */
public class NavModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void openUrl(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a42d156", new Object[]{json, bVar, interfaceC0830a});
            return;
        }
        String str = null;
        if (json instanceof JSONObject) {
            str = ((JSONObject) json).getString("url");
        } else if (json instanceof JSONArray) {
            str = ((JSONArray) json).getString(0);
        }
        Nav.from(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a()).toUri(str);
    }

    public static void openDialog(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f4a1450", new Object[]{json, bVar, interfaceC0830a, aVar});
            return;
        }
        if (json instanceof JSONObject) {
            string = ((JSONObject) json).getString("url");
        } else {
            string = json instanceof JSONArray ? ((JSONArray) json).getString(0) : null;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String queryParameter = Uri.parse(string).getQueryParameter("fromSeq");
        String concat = string.concat("&fromAction=TAOBAO.OCEAN.ActionServiceBC");
        if (!TextUtils.isEmpty(queryParameter)) {
            aVar.g.put(queryParameter, new a.d(bVar, interfaceC0830a, null));
        }
        Nav.from(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a()).toUri(concat);
    }

    public static void openAlert(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df99350", new Object[]{json, bVar, interfaceC0830a, aVar});
        } else if (json == null) {
        } else {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String concat = "http://h5.m.taobao.com/actionService/singleDialog.htm?".concat("from=ac&fromAction=TAOBAO.OCEAN.ActionServiceBC").concat("&seqId=").concat(valueOf);
            aVar.g.put(valueOf, new a.d(bVar, interfaceC0830a, null));
            Nav.from(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a()).toUri(concat.concat("&args=").concat(json.toJSONString()));
        }
    }

    public static void postNotify(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710916d9", new Object[]{json, bVar, interfaceC0830a, aVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        String string = jSONObject.getString("name");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Intent intent = new Intent(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 != null && jSONObject2.keySet() != null) {
            for (String str : jSONObject2.keySet()) {
                intent.putExtra(str, jSONObject2.getString(str));
            }
        }
        if (bVar == null) {
            return;
        }
        aVar.a(intent);
    }

    public static void onNotify(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d79c3a", new Object[]{json, bVar, interfaceC0830a, aVar});
            return;
        }
        String string = ((JSONObject) json).getString("name");
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (TextUtils.isEmpty(string)) {
            return;
        }
        aVar.a(string, valueOf);
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        aVar.g.put(valueOf, new a.d(bVar, interfaceC0830a, null));
    }

    public static void showToast(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5ad451", new Object[]{json, bVar, interfaceC0830a});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        String string = jSONObject.getString("msg");
        String string2 = jSONObject.getString("duration");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (!TextUtils.isEmpty(string2) && TextUtils.isDigitsOnly(string2)) {
            i = Integer.valueOf(string2).intValue() / 1000;
        }
        Toast.makeText(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a(), string, i).show();
    }

    public static void share(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b014fc", new Object[]{json, bVar, interfaceC0830a});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("businessId");
        String string3 = jSONObject.getString("contentType");
        String string4 = jSONObject.getString("desc");
        String string5 = jSONObject.getString("url");
        String string6 = jSONObject.getString("image");
        String string7 = jSONObject.getString("shareScene");
        ShareContent shareContent = new ShareContent();
        shareContent.shareScene = string7;
        shareContent.title = string;
        shareContent.imageUrl = string6;
        shareContent.businessId = string2;
        shareContent.description = string4;
        shareContent.contentType = string3;
        shareContent.url = string5;
        ShareBusiness.share((Activity) bVar.f19947a, string, shareContent);
    }
}
