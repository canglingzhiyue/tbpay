package com.taobao.android.detail.alittdetail.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.android.testutils.log.LogUtils;
import tb.kge;

/* loaded from: classes4.dex */
public class TTDetailDXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    static {
        kge.a(-1777934223);
        kge.a(1293529562);
        TAG = TTDetailDXPreviewInterfaceImpl.class.getSimpleName();
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
        } else {
            LogUtils.a(TAG, "反射调用previewEngineDidInitialized", new Object[0]);
        }
    }
}
