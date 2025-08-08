package com.alibaba.android.split.scene;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes2.dex */
public class c implements i<InputStream> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2008812328);
        kge.a(1491265212);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.io.InputStream] */
    @Override // com.alibaba.android.split.scene.i
    public /* synthetic */ InputStream b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2ae23249", new Object[]{this, context, str}) : a(context, str);
    }

    public InputStream a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("1634b82d", new Object[]{this, context, str});
        }
        if (context == null || StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return AssetsDelegate.proxy_open(context.getAssets(), "feature_resource.json");
        } catch (Exception unused) {
            return null;
        }
    }
}
