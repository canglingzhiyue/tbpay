package com.taobao.bootimage.linked.ext;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import tb.kej;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageWVBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_NAME = "getPopLinkedData";
    private static final String BIZ_NAME = "com.taobao.tao.TBMainActivity";
    private static final String MODULE_NAME = "BootImageWVBridge";
    private static final String POINT_NAME_WVBRIDGE = "wvbridge";
    private static final String TAG = "BootImageWVBridge";

    static {
        kge.a(1671555686);
    }

    public static /* synthetic */ Object ipc$super(BootImageWVBridge bootImageWVBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            q.a("BootImageWVBridge", (Class<? extends e>) BootImageWVBridge.class);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            kej.a("BootImageWVBridge", "callback == null, action = " + str);
            return false;
        } else if (!TextUtils.equals(ACTION_NAME, str)) {
            kej.a("BootImageWVBridge", "unknown action, action = " + str);
            return false;
        } else {
            LinkedSplashData b = h.b("com.taobao.tao.TBMainActivity").b();
            if (b == null) {
                kej.a("BootImageWVBridge", "currentSplashData == null, action = " + str);
                result(wVCallBackContext, null);
                return true;
            }
            JSONObject linkedData = b.getLinkedData("popView");
            if (linkedData == null || linkedData.isEmpty()) {
                kej.a("BootImageWVBridge", "popViewJsonObj is empty, action = " + str);
                result(wVCallBackContext, null);
                return true;
            }
            kej.a("BootImageWVBridge", "return result, action = " + str + ", popViewJsonObj = " + linkedData.toJSONString());
            result(wVCallBackContext, linkedData);
            return true;
        }
    }

    private void result(WVCallBackContext wVCallBackContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785497af", new Object[]{this, wVCallBackContext, jSONObject});
            return;
        }
        r rVar = new r();
        if (jSONObject == null) {
            rVar.a("HY_FAILED");
            wVCallBackContext.error(rVar);
            return;
        }
        rVar.a("HY_SUCCESS");
        rVar.a(new org.json.JSONObject(jSONObject));
        wVCallBackContext.success(rVar);
    }
}
