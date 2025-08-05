package com.taobao.tao.content.modules;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.tao.content.business.b;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.odt;

/* loaded from: classes8.dex */
public class CBModudle extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1278351053);
    }

    @JSMethod
    public void addCartWithParams(HashMap<String, String> hashMap, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da9d129", new Object[]{this, hashMap, jSCallback});
        } else if (hashMap == null || this.mWXSDKInstance == null || hashMap == null || hashMap.size() <= 0) {
        } else {
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            contentBusinessModel.itemId = hashMap.get("itemId");
            contentBusinessModel.adUserId = hashMap.get(b.ACCOUNT_ID);
            contentBusinessModel.scenceId = hashMap.get(b.BIZ_TYPE);
            contentBusinessModel.contentId = hashMap.get("contentId");
            contentBusinessModel.pageName = hashMap.get("pageName");
            contentBusinessModel.source = "3";
            String str = hashMap.get("sourceType");
            if (!TextUtils.isEmpty(str)) {
                contentBusinessModel.sourceType = str;
            }
            try {
                contentBusinessModel.context = new JSONObject(hashMap.get("context"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            contentBusinessModel.tcpBid = hashMap.get(b.TCP_BID);
            if (!TextUtils.isEmpty(contentBusinessModel.tcpBid)) {
                contentBusinessModel.ct = hashMap.get(b.CT);
                if (contentBusinessModel.ct.equals("1")) {
                    contentBusinessModel.itemId = hashMap.get("itemId");
                } else if (contentBusinessModel.ct.equals("2")) {
                    contentBusinessModel.sId = hashMap.get(b.SID);
                }
            }
            try {
                String str2 = hashMap.get("hideSKULayer");
                if (!TextUtils.isEmpty(str2) && "true".equals(str2)) {
                    contentBusinessModel.source = "2";
                }
            } catch (Exception unused) {
            }
            if (odt.c()) {
                String str3 = hashMap.get("actionSource");
                if (!TextUtils.isEmpty(str3)) {
                    contentBusinessModel.actionSource = str3;
                }
                String str4 = hashMap.get("trackSource");
                if (!TextUtils.isEmpty(str4)) {
                    contentBusinessModel.trackSource = str4;
                }
                String str5 = hashMap.get("trackSubSource");
                if (!TextUtils.isEmpty(str5)) {
                    contentBusinessModel.trackSubSource = str5;
                }
            }
            if ("3".equals(contentBusinessModel.source)) {
                new b().a(this.mWXSDKInstance.O(), contentBusinessModel, 0);
            } else {
                new b().a(contentBusinessModel, jSCallback);
            }
        }
    }

    @JSMethod
    public void requestWithParams(HashMap<String, String> hashMap, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6cdd57", new Object[]{this, hashMap, jSCallback});
        } else if (hashMap == null || hashMap.size() <= 0) {
        } else {
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            contentBusinessModel.itemId = hashMap.get("itemId");
            contentBusinessModel.adUserId = hashMap.get(b.ACCOUNT_ID);
            contentBusinessModel.scenceId = hashMap.get(b.BIZ_TYPE);
            contentBusinessModel.contentId = hashMap.get("contentId");
            contentBusinessModel.pageName = hashMap.get("pageName");
            contentBusinessModel.source = "1";
            contentBusinessModel.tcpBid = hashMap.get(b.TCP_BID);
            String str = hashMap.get("sourceType");
            if (!TextUtils.isEmpty(str)) {
                contentBusinessModel.sourceType = str;
            }
            try {
                contentBusinessModel.context = new JSONObject(hashMap.get("context"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!TextUtils.isEmpty(contentBusinessModel.tcpBid)) {
                contentBusinessModel.ct = hashMap.get(b.CT);
                if (contentBusinessModel.ct.equals("1")) {
                    contentBusinessModel.itemId = hashMap.get("itemId");
                } else if (contentBusinessModel.ct.equals("2")) {
                    contentBusinessModel.sId = hashMap.get(b.SID);
                }
            }
            if (odt.c()) {
                String str2 = hashMap.get("actionSource");
                if (!TextUtils.isEmpty(str2)) {
                    contentBusinessModel.actionSource = str2;
                }
                String str3 = hashMap.get("trackSource");
                if (!TextUtils.isEmpty(str3)) {
                    contentBusinessModel.trackSource = str3;
                }
                String str4 = hashMap.get("trackSubSource");
                if (!TextUtils.isEmpty(str4)) {
                    contentBusinessModel.trackSubSource = str4;
                }
            }
            new b().a(contentBusinessModel, (IRemoteBaseListener) null);
        }
    }
}
