package com.flybird;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FontCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Typeface> f7195a = new HashMap<>();

    public static Typeface getTypeface(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("38734174", new Object[]{context, str});
        }
        Typeface typeface = f7195a.get(str);
        if (typeface == null) {
            if (context != null) {
                try {
                    context.getResources();
                } catch (Throwable th) {
                    FBLogger.e("FontCache", "TypeFace: " + str + " can't be found, extra exception message: " + th.getMessage());
                }
            }
            if ("RareWordsFont".equals(str)) {
                String str2 = Platform.f5257a;
                typeface = null;
            }
            if (typeface == null) {
                String str3 = "DINPro".equalsIgnoreCase(str) ? "AlipayNumber" : str;
                AssetManager assets = context.getAssets();
                typeface = Typeface.createFromAsset(assets, str3 + ".ttf");
            }
            if (typeface != null) {
                f7195a.put(str, typeface);
            }
        }
        return typeface;
    }
}
