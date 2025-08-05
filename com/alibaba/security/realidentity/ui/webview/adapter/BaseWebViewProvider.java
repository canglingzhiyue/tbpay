package com.alibaba.security.realidentity.ui.webview.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseWebViewProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract BaseWebViewProxy of(Context context, String str);
}
