package com.taobao.android.tbsku.channel;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.a;
import tb.fgl;
import tb.kge;

/* loaded from: classes6.dex */
public class SkuBizWvPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "SkuCenter";
    public static final String SKU_SET_DATA = "sku_set_data";
    public static final String SKU_UPDATE_DATA = "sku_update_data";

    static {
        kge.a(706054375);
    }

    public static /* synthetic */ Object ipc$super(SkuBizWvPlugin skuBizWvPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (SKU_SET_DATA.equals(str)) {
            return dealWithSubPageSetData(str2, wVCallBackContext);
        }
        if (SKU_UPDATE_DATA.equals(str)) {
            return dealWithSubPageUpdateData(str2, wVCallBackContext);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(new r("HY_FAILED"));
        }
        return false;
    }

    private boolean dealWithSubPageUpdateData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabf3482", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean sendUpdateBroadcast = sendUpdateBroadcast(JSON.parseObject(str));
            if (sendUpdateBroadcast) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(new r("HY_SUCCESS"));
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.error(new r("HY_FAILED"));
            }
            return sendUpdateBroadcast;
        } catch (Throwable unused) {
            if (wVCallBackContext != null) {
                wVCallBackContext.error(new r("HY_FAILED"));
            }
            return false;
        }
    }

    private boolean dealWithSubPageSetData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e928bc1", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean sendSetDataBroadCast = sendSetDataBroadCast(JSON.parseObject(str));
            if (sendSetDataBroadCast) {
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(new r("HY_SUCCESS"));
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.error(new r("HY_FAILED"));
            }
            return sendSetDataBroadCast;
        } catch (Throwable unused) {
            if (wVCallBackContext != null) {
                wVCallBackContext.error(new r("HY_FAILED"));
            }
            return false;
        }
    }

    private boolean sendUpdateBroadcast(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a21cabfd", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.mContext == null || jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("sku_token");
        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
        if (StringUtils.isEmpty(string) || jSONObject2 == null || jSONObject2.isEmpty()) {
            return false;
        }
        skuTokenFix(jSONObject);
        Intent intent = new Intent();
        intent.setAction(a.SKU_ACTION_UPDATE_DATA);
        intent.putExtra(fgl.ORIGINALITEMID, jSONObject2.getString(fgl.ORIGINALITEMID));
        intent.putExtra(fgl.TARGETITEMID, jSONObject2.getString(fgl.TARGETITEMID));
        intent.putExtra("skuToken", string);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        return true;
    }

    private boolean sendSetDataBroadCast(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd35d2b0", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.mContext == null || jSONObject == null || jSONObject.isEmpty() || StringUtils.isEmpty(jSONObject.getString("sku_token")) || StringUtils.isEmpty(jSONObject.getString("action"))) {
            return false;
        }
        JSONObject skuTokenFix = skuTokenFix(jSONObject);
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.transferData");
        intent.putExtra("stringifyData", skuTokenFix.toJSONString());
        intent.addCategory("android.intent.category.DEFAULT");
        this.mContext.sendBroadcast(intent);
        return true;
    }

    private JSONObject skuTokenFix(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c7696a70", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (string = jSONObject.getString("sku_token")) != null) {
            jSONObject.put("skuToken", (Object) string);
            jSONObject.remove("sku_token");
        }
        return jSONObject;
    }
}
