package com.alipay.android.app.template;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public interface FBPluginFactory {
    FBPlugin createPluginInstance(Context context, FBPluginCtx fBPluginCtx, Map<String, String> map);
}
