package com.taobao.android.dinamic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailAdaptiveTextViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailCommentTagsViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCategoryCoupon;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCouponConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXRichTextViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXSimpleTextViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXWrapTagViewConstructor;
import com.taobao.android.dinamic.constructor.DImageViewConstructor;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.dinamic.dinamic.b;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import tb.eau;
import tb.eav;
import tb.eaw;
import tb.eax;
import tb.fnl;
import tb.fnq;
import tb.fpa;
import tb.fpc;
import tb.fpt;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final c f11732a;
    private fpt.b b;
    private b c;
    private com.taobao.android.dinamic.dinamic.e d;
    private com.taobao.android.dinamic.dinamic.c e;
    private DImageViewConstructor.a f;

    static {
        kge.a(-2007255479);
        f11732a = new c();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("cb5c836d", new Object[0]) : f11732a;
    }

    public void a(String str, com.taobao.android.dinamic.dinamic.h hVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a51e58c", new Object[]{this, str, hVar});
        } else {
            DinamicViewHelper.registerViewConstructor(str, hVar);
        }
    }

    public void a(String str, fnl fnlVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cde57e", new Object[]{this, str, fnlVar});
        } else {
            fnq.a(str, fnlVar);
        }
    }

    public void a(String str, a aVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4eb6f3", new Object[]{this, str, aVar});
        } else {
            DinamicViewHelper.registerEventHandler(str, aVar);
        }
    }

    public void a(String str, String str2, com.taobao.android.dinamic.dinamic.h hVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2431df56", new Object[]{this, str, str2, hVar});
        } else if ("detail".equals(str) && (DetailAdaptiveTextViewConstructor.VIEW_TAG.equals(str2) || DetailCommentTagsViewConstructor.VIEW_TAG.equals(str2) || DetailXSimpleTextViewConstructor.VIEW_TAG.equals(str2) || DetailXRichTextViewConstructor.VIEW_TAG.equals(str2) || DetailXWrapTagViewConstructor.VIEW_TAG.equals(str2) || DetailRichTextViewByCouponConstructor.VIEW_TAG.equals(str2) || DetailRichTextViewByCategoryCoupon.VIEW_TAG.equals(str2))) {
            DinamicViewHelper.registerReplaceViewConstructor(str2, hVar);
        } else {
            DinamicViewHelper.registerViewConstructor(str2, hVar);
        }
    }

    public void a(String str, String str2, fnl fnlVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29563cc8", new Object[]{this, str, str2, fnlVar});
        } else if ("detail".equals(str) && (eaw.PARSER_TAG.equals(str2) || eav.PARSER_TAG.equals(str2) || eax.PARSER_TAG.equals(str2) || eau.PARSER_TAG.equals(str2))) {
            fnq.b(str2, fnlVar);
        } else {
            fnq.a(str2, fnlVar);
        }
    }

    public void a(String str, String str2, a aVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242eb0bd", new Object[]{this, str, str2, aVar});
            return;
        }
        if ("detail".equals(str)) {
            if ("xTap".equals(str2) || "xCopy".equals(str2)) {
                DinamicViewHelper.registerReplaceEventHandler(str2, aVar);
                return;
            }
        } else if ("mcCart".equals(str) && "mcAddCart".equals(str2)) {
            DinamicViewHelper.registerReplaceEventHandler(str2, aVar);
            return;
        }
        DinamicViewHelper.registerEventHandler(str2, aVar);
    }

    public void a(fpt.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40efab0", new Object[]{this, bVar});
        } else if (this.b != null) {
            fpa.d("registerHttpLoader failed, loader is exist", new String[0]);
        } else {
            this.b = bVar;
            DTemplateManager.a().a(bVar);
        }
    }

    public void a(fpc fpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fb875f", new Object[]{this, fpcVar});
        } else if (fpa.f28084a != null) {
            fpa.d("registerRemoteDebugLog failed, iDinamicRemoteDebugLog is exist", new String[0]);
        } else {
            fpa.a(fpcVar);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb17308", new Object[]{this, bVar});
        } else if (this.c == null) {
            this.c = bVar;
        } else {
            fpa.d("registerMonitor failed, monitor is exist", new String[0]);
        }
    }

    public void a(DImageViewConstructor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95f40e4", new Object[]{this, aVar});
        } else if (this.f != null) {
            fpa.d("registerImageInterface failed, imageInterface is exist", new String[0]);
        } else {
            this.f = aVar;
            DImageViewConstructor dImageViewConstructor = (DImageViewConstructor) e.b("DImageView");
            if (dImageViewConstructor == null) {
                return;
            }
            dImageViewConstructor.setDxWebImageInterface(aVar);
        }
    }

    public void a(com.taobao.android.dinamic.dinamic.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb1e767", new Object[]{this, cVar});
            return;
        }
        if (this.d == null) {
            this.d = new com.taobao.android.dinamic.dinamic.e(cVar);
        }
        this.e = cVar;
    }

    public com.taobao.android.dinamic.dinamic.e b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamic.dinamic.e) ipChange.ipc$dispatch("e33ab78a", new Object[]{this}) : this.d;
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ea9fec4c", new Object[]{this}) : this.c;
    }

    public com.taobao.android.dinamic.dinamic.c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamic.dinamic.c) ipChange.ipc$dispatch("f205218a", new Object[]{this}) : this.e;
    }

    public fpt.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fpt.b) ipChange.ipc$dispatch("e82404b2", new Object[]{this}) : this.b;
    }
}
