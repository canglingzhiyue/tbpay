package com.taobao.tao.content.business;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import org.json.JSONObject;
import tb.kge;
import tb.odt;

/* loaded from: classes8.dex */
public class WVBusinessSDKBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1983924715);
    }

    public static /* synthetic */ Object ipc$super(WVBusinessSDKBridge wVBusinessSDKBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"request".equals(str)) {
            return false;
        }
        doMyHandler(str2, wVCallBackContext);
        return true;
    }

    private void doMyHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d30b741", new Object[]{this, str, wVCallBackContext});
        } else if (odt.b()) {
            wVCallBackContext.error();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
                if (jSONObject.has(b.ACCOUNT_ID)) {
                    contentBusinessModel.adUserId = jSONObject.getString(b.ACCOUNT_ID);
                }
                if (jSONObject.has("contentId")) {
                    contentBusinessModel.contentId = jSONObject.getString("contentId");
                }
                if (jSONObject.has(b.BIZ_TYPE)) {
                    contentBusinessModel.scenceId = jSONObject.getString(b.BIZ_TYPE);
                }
                if (jSONObject.has("pageName")) {
                    contentBusinessModel.pageName = jSONObject.getString("pageName");
                }
                if (jSONObject.has(b.TCP_BID)) {
                    contentBusinessModel.tcpBid = jSONObject.getString(b.TCP_BID);
                }
                if (jSONObject.has(b.CT)) {
                    contentBusinessModel.ct = jSONObject.getString(b.CT);
                }
                if (jSONObject.has("sellerId")) {
                    contentBusinessModel.sId = jSONObject.getString("sellerId");
                }
                if (jSONObject.has("itemId")) {
                    contentBusinessModel.itemId = jSONObject.getString("itemId");
                }
                if (jSONObject.has("sourceType")) {
                    String string = jSONObject.getString("sourceType");
                    if (!StringUtils.isEmpty(string)) {
                        contentBusinessModel.sourceType = string;
                    }
                }
                if (odt.c()) {
                    if (jSONObject.has("actionSource")) {
                        String string2 = jSONObject.getString("actionSource");
                        if (!StringUtils.isEmpty(string2)) {
                            contentBusinessModel.actionSource = string2;
                        }
                    }
                    if (jSONObject.has("trackSource")) {
                        String string3 = jSONObject.getString("trackSource");
                        if (!StringUtils.isEmpty(string3)) {
                            contentBusinessModel.trackSource = string3;
                        }
                    }
                    if (jSONObject.has("trackSubSource")) {
                        String string4 = jSONObject.getString("trackSubSource");
                        if (!StringUtils.isEmpty(string4)) {
                            contentBusinessModel.trackSubSource = string4;
                        }
                    }
                }
                if (jSONObject.has("context")) {
                    String string5 = jSONObject.getString("context");
                    if (!StringUtils.isEmpty(string5)) {
                        contentBusinessModel.context = new JSONObject(string5);
                    }
                }
                new b().a(contentBusinessModel, (IRemoteBaseListener) null);
                wVCallBackContext.success();
            } catch (Exception e) {
                e.printStackTrace();
                wVCallBackContext.error();
            }
        }
    }
}
