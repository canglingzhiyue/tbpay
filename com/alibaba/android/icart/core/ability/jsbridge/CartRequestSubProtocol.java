package com.alibaba.android.icart.core.ability.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.android.icart.core.data.config.CartRequestType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import kotlin.Metadata;
import tb.jny;
import tb.jpr;
import tb.jpu;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/alibaba/android/icart/core/ability/jsbridge/CartRequestSubProtocol;", "Landroid/taobao/windvane/jsbridge/WVApiPlugin;", "dmContext", "Lcom/taobao/android/ultron/datamodel/IDMContext;", "(Lcom/taobao/android/ultron/datamodel/IDMContext;)V", RPCDataItems.SWITCH_TAG_LOG, "", e.RECORD_EXECUTE, "", "name", "params", "callback", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class CartRequestSubProtocol extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "CartRequestSubProtocol";
    private jny dmContext;

    static {
        kge.a(32182872);
    }

    public CartRequestSubProtocol(jny jnyVar) {
        this.dmContext = jnyVar;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (this.dmContext != null && str != null) {
            String str3 = this.TAG;
            try {
                JSONObject parseObject = JSON.parseObject(str2);
                String string = parseObject.getString("type");
                if (string == null || parseObject.getString("renderRoot") == null) {
                    return false;
                }
                int hashCode = string.hashCode();
                if (hashCode == -1072896758) {
                    str3 = string.equals(CartRequestType.queryNextPage);
                } else if (hashCode != 351862722) {
                    str3 = str3;
                } else {
                    string.equals("triggerEvent");
                    str3 = str3;
                }
            } catch (Throwable th) {
                jpu c = jpu.a("Ultron").c(str3);
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                jpr.a(c.b(message));
            }
        }
        return false;
    }
}
