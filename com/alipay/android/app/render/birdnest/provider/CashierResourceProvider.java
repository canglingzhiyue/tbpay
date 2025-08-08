package com.alipay.android.app.render.birdnest.provider;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alipay.android.app.cctemplate.storage.TemplateAssetsStorage;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.friend.a;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierResourceProvider implements BirdNestEngine.ResourceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ICashierProvider f4371a;

    public CashierResourceProvider(ICashierProvider iCashierProvider) {
        this.f4371a = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider
    public Object getResource(Context context, String str, String str2, String str3) {
        String str4;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5495057", new Object[]{this, context, str, str2, str3});
        }
        try {
            String[] split = str.split("/");
            if (StringUtils.equals(str3, a.CONTACTS_INFO_NOT_EMPTY_STATUS)) {
                if (split.length > 2) {
                    str4 = split[2];
                } else if (split.length > 1) {
                    str4 = split[1];
                } else {
                    str4 = split[0];
                }
                if (str4 != null && (indexOf = str4.indexOf("")) > 0) {
                    str4 = str4.substring(0, indexOf);
                }
                return context.getResources().getDrawable(ResUtils.getDrawableId(str4));
            }
            AssetManager assets = context.getAssets();
            if (split.length > 1) {
                str = split[1];
            }
            return TemplateAssetsStorage.readAssetsFile(str, assets, context);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return null;
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider
    public Object getResourceAsync(View view, String str, int i, int i2, Drawable drawable, Drawable drawable2, int i3, boolean z, BirdNestEngine.ResourceProvider.Callback callback, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8625300e", new Object[]{this, view, str, new Integer(i), new Integer(i2), drawable, drawable2, new Integer(i3), new Boolean(z), callback, bundle}) : this.f4371a.getResourceAsync(view, str, i, i2, drawable, drawable2, i3, z, callback, bundle);
    }
}
