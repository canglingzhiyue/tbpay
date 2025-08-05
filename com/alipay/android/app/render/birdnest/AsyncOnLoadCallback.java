package com.alipay.android.app.render.birdnest;

import com.alipay.android.app.render.birdnest.utils.Compatibility;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.OnLoadCallback;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class AsyncOnLoadCallback implements OnLoadCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.app.template.OnLoadCallback
    public void onLoadFinish(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d080b39", new Object[]{this, obj, new Boolean(z)});
        } else if (!(obj instanceof FBContext)) {
        } else {
            FBContext fBContext = (FBContext) obj;
            if (!fBContext.isOnloadFinish()) {
                return;
            }
            LogUtils.record(2, "AsyncOnLoadCallback:onLoadFinish", obj + " " + z);
            Compatibility.adapter(fBContext);
        }
    }
}
