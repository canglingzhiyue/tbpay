package com.taobao.android.sku.dinamicx.preview;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.android.sku.c;
import tb.kge;

/* loaded from: classes6.dex */
public class SkuPreview implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2074030419);
        kge.a(1293529562);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
        } else {
            c.a(bdVar);
        }
    }
}
