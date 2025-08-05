package com.taobao.tbpoplayer.mock;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.info.frequency.b;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import org.json.JSONTokener;
import tb.bzs;
import tb.bzt;
import tb.kge;

/* loaded from: classes8.dex */
public class WVPopLayerMock extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1588945984);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if ("enableMock".equals(str)) {
                c.a("PopLayerManager.jsEnableMock.params{%s}", str2);
                org.json.JSONObject jSONObject = (org.json.JSONObject) new JSONTokener(str2).nextValue();
                bzs.a().a(jSONObject.optBoolean("enable", false), jSONObject.optString("config", ""), jSONObject.optBoolean("isPersistent", false), jSONObject.optBoolean("isConstraintMock", false), jSONObject.optLong("timeTravelSec", 0L), str2);
                wVCallBackContext.success();
                return true;
            } else if ("enableMockTimeTravelSec".equals(str)) {
                c.a("PopLayerManager.jsEnableMockTimeTravelSec.params{%s}", str2);
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) new JSONTokener(str2).nextValue();
                bzs.a().a(jSONObject2.optBoolean("enable", false), jSONObject2.optBoolean("isPersistent", false), jSONObject2.optLong("timeTravelSec", 0L));
                wVCallBackContext.success();
                return true;
            } else if ("clearCount".equals(str)) {
                int intValue = (TextUtils.isEmpty(str2) || (parseObject = JSON.parseObject(str2)) == null) ? 0 : parseObject.getInteger("clearMode").intValue();
                if (intValue == 0) {
                    bzt.a().b();
                } else if (intValue == 1) {
                    b.e().f();
                } else if (intValue == 2) {
                    bzt.a().b();
                    b.e().f();
                }
                wVCallBackContext.success();
                return true;
            } else if ("clearConfigPercentInfo".equals(str)) {
                PopMiscInfoFileHelper.a().c();
                wVCallBackContext.success();
                return true;
            } else if ("openConsole".equals(str)) {
                if (!PopLayer.DEBUG) {
                    wVCallBackContext.error("Release包不允许使用，请用Debug包调试");
                    return false;
                }
                org.json.JSONObject jSONObject3 = (org.json.JSONObject) new JSONTokener(str2).nextValue();
                String optString = jSONObject3.optString("windvane", "");
                int optInt = jSONObject3.optInt("logCacheSize", 50);
                Nav.from(this.mContext).toUri("http://tb.cn/n/poplayerdebug?windvane=" + optString + "&log_cache_size=" + optInt);
                return true;
            } else {
                wVCallBackContext.error("PopLayerManager.execute.noMethodFound");
                return false;
            }
        } catch (Throwable th) {
            c.a("PopLayerManager.execute.error", th);
            wVCallBackContext.error(th.toString() + "\n" + th.getMessage());
            return false;
        }
    }
}
