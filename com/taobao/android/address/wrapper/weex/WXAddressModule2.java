package com.taobao.android.address.wrapper.weex;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.core.address.c;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

/* loaded from: classes4.dex */
public class WXAddressModule2 extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "address";
    public JSCallback mFailCall;
    public JSCallback mSuccCall;

    public static /* synthetic */ Object ipc$super(WXAddressModule2 wXAddressModule2, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @JSMethod
    public void chooseAddress(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac0ad8c", new Object[]{this, jSONObject, jSCallback, jSCallback2});
            return;
        }
        this.mSuccCall = jSCallback;
        this.mFailCall = jSCallback2;
        if (this.mWXSDKInstance != null && this.mWXSDKInstance.O() != null) {
            try {
                AddressKinshipBridge.openPickPage(this.mWXSDKInstance.O(), jSONObject.toJSONString());
                return;
            } catch (Exception e) {
                onError(-1, "fail", "Exception:" + e.getMessage());
                return;
            }
        }
        onError(-1, "fail", "else");
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 700 && i2 == -1) {
            String stringExtra = intent.getStringExtra(c.K_DELIVERY_ID);
            if (this.mSuccCall != null && stringExtra != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("addressId", (Object) stringExtra);
                this.mSuccCall.invoke(jSONObject);
                return;
            }
            onError(-2, "empty address id", "EmptyAddressID");
            return;
        }
        onError(-1, "fail", "");
    }

    private void onError(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959b3927", new Object[]{this, new Integer(i), str, str2});
        } else if (this.mFailCall == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) Integer.valueOf(i));
            jSONObject.put("message", (Object) str);
            this.mFailCall.invoke(jSONObject);
        }
    }
}
