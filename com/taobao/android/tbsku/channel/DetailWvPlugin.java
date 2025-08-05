package com.taobao.android.tbsku.channel;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.a;
import com.taobao.android.sku.utils.o;
import tb.fgl;
import tb.kge;
import tb.mrm;

/* loaded from: classes6.dex */
public class DetailWvPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_KEY_ORIGIN_PARAMS_DATA = "originParamsData";
    public static final String NAME = "DetailCenter";
    private static final String UPDATE_DETAIL = "update_detail";

    static {
        kge.a(994475906);
    }

    public static /* synthetic */ Object ipc$super(DetailWvPlugin detailWvPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("update_detail".equals(str)) {
            return dealwithDetailUpdate(str2, wVCallBackContext);
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error(new r("HY_FAILED"));
        }
        return false;
    }

    private boolean dealwithDetailUpdate(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dabe91e", new Object[]{this, str, wVCallBackContext})).booleanValue();
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

    private boolean sendUpdateBroadcast(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a21cabfd", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.mContext == null || jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("from");
        if (TextUtils.isEmpty(string)) {
            o.b("class:DetailWvPlugin### method:sendUpdateBroadcast from is null");
        }
        String string2 = jSONObject.getString("token");
        String string3 = jSONObject.getString(mrm.KEY_AREA_ID);
        String string4 = jSONObject.getString("addressId");
        String string5 = jSONObject.getString(fgl.ORIGINALITEMID);
        String string6 = jSONObject.getString(fgl.TARGETITEMID);
        Object obj = jSONObject.get("params");
        if (TextUtils.isEmpty(string2)) {
            o.d("DetailWvPlugin", "执行update_detail失败，token为空，业务来源：" + string);
            return false;
        } else if (TextUtils.isEmpty(string5)) {
            o.d("DetailWvPlugin", "执行update_detail失败，originalItemId为空，业务来源：" + string);
            return false;
        } else if (TextUtils.isEmpty(string6)) {
            o.d("DetailWvPlugin", "执行update_detail失败，targetItemId为空，业务来源：" + string);
            return false;
        } else {
            Intent intent = new Intent();
            intent.setAction(a.SKU_ACTION_UPDATE_DATA);
            intent.putExtra(fgl.ORIGINALITEMID, string5);
            intent.putExtra("skuToken", string2);
            intent.putExtra(fgl.TARGETITEMID, string6);
            intent.putExtra(mrm.KEY_AREA_ID, string3);
            intent.putExtra("addressId", string4);
            intent.putExtra("params", obj != null ? obj.toString() : "");
            intent.putExtra(EXTRA_KEY_ORIGIN_PARAMS_DATA, jSONObject);
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
            return true;
        }
    }
}
