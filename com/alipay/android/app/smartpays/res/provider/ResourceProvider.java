package com.alipay.android.app.smartpays.res.provider;

import android.content.Context;
import android.content.res.Resources;
import com.alipay.android.app.render.api.RenderEnv;
import com.alipay.android.app.smartpays.api.IResourceProvider;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class ResourceProvider implements IResourceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String PACKAGE_NAME = "com.alipay.android.safepaysdk";
    public static String SDK_PACKAGE_NAME = "com.alipay.android.safepaysdk";

    /* renamed from: a  reason: collision with root package name */
    private Context f4417a;

    public ResourceProvider(Context context) {
        this.f4417a = context;
    }

    @Override // com.alipay.android.app.smartpays.api.IResourceProvider
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.f4417a;
    }

    @Override // com.alipay.android.app.smartpays.api.IResourceProvider
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this}) : this.f4417a.getResources();
    }

    @Override // com.alipay.android.app.smartpays.api.IResourceProvider
    public String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        if (RenderEnv.isWallet()) {
            return PACKAGE_NAME;
        }
        return SDK_PACKAGE_NAME;
    }
}
