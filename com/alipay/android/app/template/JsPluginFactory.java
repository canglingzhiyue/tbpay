package com.alipay.android.app.template;

import android.content.Context;
import com.alipay.android.app.template.JSPlugin;

/* loaded from: classes3.dex */
public interface JsPluginFactory {
    JSPlugin createJsPlugin(Context context, JSPlugin.FromCall fromCall, String str);
}
