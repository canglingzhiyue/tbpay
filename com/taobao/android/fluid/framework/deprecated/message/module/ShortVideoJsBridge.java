package com.taobao.android.fluid.framework.deprecated.message.module;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoJsBridgeProxy;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class ShortVideoJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ELEMENTS_RECTS = "elementsRects";
    private static final String POST_MESSAGE = "postMessage";
    private static final String SEND_MESSAGE = "sendMessage";
    private static final String TAG = "ShortVideoJsBridgechangfeng";
    private final ShortVideoJsBridgeProxy mFluidSDKProxy = new ShortVideoJsBridgeProxy();

    static {
        kge.a(639007385);
    }

    public static /* synthetic */ Object ipc$super(ShortVideoJsBridge shortVideoJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ShortVideoJsBridge() {
        spz.c(TAG, "初始化 ShortVideoJsBridge");
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        spz.a(TAG, "ShortVideoJsBridge 执行方法:" + str + "," + str2);
        if (str == null) {
            return false;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -47762344) {
            if (hashCode != 691453791) {
                if (hashCode == 1490029383 && str.equals(POST_MESSAGE)) {
                    c = 2;
                }
            } else if (str.equals(SEND_MESSAGE)) {
                c = 0;
            }
        } else if (str.equals(ELEMENTS_RECTS)) {
            c = 1;
        }
        if (c == 0) {
            return sendMessatge(str2, wVCallBackContext);
        }
        if (c != 1) {
            if (c == 2) {
                return postMessage(str2, wVCallBackContext);
            }
            return false;
        }
        spz.a(TAG, "execute elements rects, action: " + str + ", params: " + str2);
        return parseTrusteeshipTouchRectData(str2, wVCallBackContext);
    }

    private boolean sendMessatge(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69f8803", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        ShortVideoJsBridgeProxy shortVideoJsBridgeProxy = this.mFluidSDKProxy;
        if (shortVideoJsBridgeProxy == null) {
            return false;
        }
        return shortVideoJsBridgeProxy.sendMessage(str, wVCallBackContext);
    }

    private boolean postMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fb451d9", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        ShortVideoJsBridgeProxy shortVideoJsBridgeProxy = this.mFluidSDKProxy;
        if (shortVideoJsBridgeProxy == null) {
            return false;
        }
        return shortVideoJsBridgeProxy.postMessage(str, wVCallBackContext);
    }

    private boolean parseTrusteeshipTouchRectData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dba5935e", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        ShortVideoJsBridgeProxy shortVideoJsBridgeProxy = this.mFluidSDKProxy;
        if (shortVideoJsBridgeProxy == null) {
            return false;
        }
        return shortVideoJsBridgeProxy.parseTrusteeshipTouchRectData(str, wVCallBackContext);
    }
}
