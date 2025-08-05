package com.taobao.taolivehome.dinamicx.sdk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import tb.kge;

/* loaded from: classes8.dex */
public class DXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1397070901);
        kge.a(1293529562);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
        } else {
            f.z().previewEngineDidInitialized(bdVar);
        }
    }
}
