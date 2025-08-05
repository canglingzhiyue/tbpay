package com.taobao.taolive.movehighlight.dx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.taolive.dinamicext.dinamicx.DXTBLFllowContentWidgetNode;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import tb.kge;
import tb.pfs;
import tb.pfz;
import tb.pga;
import tb.pgb;
import tb.pgc;
import tb.pgd;
import tb.pgg;
import tb.pgk;

/* loaded from: classes8.dex */
public class DXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2137480661);
        kge.a(1293529562);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
            return;
        }
        bdVar.a(pfz.DX_EVENT_HIGHLIGHTSCROLLABLEONLOADMORE, new pfz());
        bdVar.a(DXHighlightScrollableLayoutWidgetNode.DXHIGHLIGHTSCROLLABLELAYOUT_HIGHLIGHTSCROLLABLELAYOUT, new DXHighlightScrollableLayoutWidgetNode.a());
        bdVar.a(pgg.DXHIGHLIGHTSTRUCTLISTVIEW_HIGHLIGHTSTRUCTLISTVIEW, new pgg.a());
        bdVar.a(pgd.DXHIGLIGHTPLAYERCONTROLLERNEW_HIGLIGHTPLAYERCONTROLLERNEW, new pgd.a());
        bdVar.a(DXTBLFllowContentWidgetNode.DXTBLFLLOWCONTENT_TBLFLLOWCONTENT, new DXTBLFllowContentWidgetNode.a());
        bdVar.a(pgk.DX_PARSER_HIGHLIGHT_STRUCT_JSON_STR, new pgk());
        bdVar.a(pgb.DX_EVENT_TBLIVE_TIMESHIFT_CUSTOM, new pgb());
        bdVar.a(pga.DX_EVENT_HIGHLIGHTTRACKUTILS, new pga());
        bdVar.a(pgc.DX_EVENT_TBLIVE_TIMEMOVE_SECKILL_ITEM_ADD, new pgc());
        bdVar.a(pfs.DXHIGHLIGHTCONTENTVIEW_HIGHLIGHTCONTENTVIEW, new pfs.a());
        bdVar.a(b.DX_PARSER_HIGHLIGHTSTRTOMAP, new b());
        bdVar.a(a.DX_PARSER_HIGHLIGHTABCONFIG, new a());
        f.m().getGoodHandlerProxy().c(bdVar.d());
        f.m().getGoodHandlerProxy().b(bdVar.d());
        f.m().getGoodHandlerProxy().a(bdVar.d());
        f.m().getGoodHandlerProxy().l(bdVar.d());
    }
}
