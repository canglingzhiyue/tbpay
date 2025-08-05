package com.taobao.android.detail.wrapper.ext.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.a;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.icart.widget.h;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import java.io.Serializable;
import tb.ebd;
import tb.ebe;
import tb.ebg;
import tb.ebh;
import tb.ebi;
import tb.ebk;
import tb.ebl;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class DXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1932978038);
        kge.a(1293529562);
        kge.a(1028243835);
    }

    public DXPreviewInterfaceImpl() {
        emu.a("com.taobao.android.detail.wrapper.ext.dinamicx.DXPreviewInterfaceImpl");
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
            return;
        }
        bdVar.a(h.DXTEXTVIEW_TEXTVIEW, new af.a());
        bdVar.a(ebi.f27168a, new ebi.a());
        bdVar.a(ebk.f27171a, new ebk.a());
        bdVar.a(ebe.f27161a, new ebe.a());
        bdVar.a(ebh.f27165a, new ebh.a());
        bdVar.a(ebg.f27163a, new ebg.a());
        bdVar.a(ebd.f27160a, new ebd.a());
        bdVar.a(ebl.f27173a, new ebl.a());
        bdVar.a(com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.a.DXXKAPVIEW, new a.C0439a());
    }
}
