package com.alibaba.security.realidentity.ui.webview.jsbridge;

import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class JsCallbackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void error();

    public abstract void error(WVResultWrapper wVResultWrapper);

    public abstract void error(String str);

    public abstract void fireEvent(String str, String str2);

    public abstract void success();

    public abstract void success(WVResultWrapper wVResultWrapper);

    public abstract void success(String str);
}
