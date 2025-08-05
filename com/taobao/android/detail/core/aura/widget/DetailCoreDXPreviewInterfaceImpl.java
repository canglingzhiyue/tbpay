package com.taobao.android.detail.core.aura.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import tb.dxh;
import tb.ebj;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailCoreDXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(834144313);
        kge.a(1293529562);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
            return;
        }
        bdVar.a(ebj.DXXSHADOWTEXTVIEW_XSHADOWTEXTVIEW, new ebj.a());
        bdVar.a(dxh.DX_PARSER_CANSHOWINSINGLELINE, new dxh());
    }
}
