package com.etao.feimagesearch.capture.dynamic.bottom.album;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.o;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.coy;
import tb.cpk;
import tb.rul;

/* loaded from: classes3.dex */
public final class CaptureAlbumView$albumAdapter$1 extends Lambda implements rul<o, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumView$albumAdapter$1(d dVar) {
        super(1);
        this.this$0 = dVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(o oVar) {
        invoke2(oVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o it) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e441cf6e", new Object[]{this, it});
            return;
        }
        q.c(it, "it");
        if (it.c()) {
            a2 = "video";
        } else {
            if (com.etao.feimagesearch.album.q.a(it.h())) {
                a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18944);
            } else {
                a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18966);
            }
            q.a((Object) a2, "if (QueryMediaTask.isScr…1007_1_18966)\n          }");
        }
        d dVar = this.this$0;
        if (!d.$ipChange) {
            StringBuilder sb = new StringBuilder();
            sb.append("pssource=");
            com.etao.feimagesearch.model.b pageModel = this.this$0.h();
            q.a((Object) pageModel, "pageModel");
            sb.append(pageModel.getPssource());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("album_type=");
            d dVar2 = this.this$0;
            sb2.append(d.$ipChange);
            coy.b(cpk.ALBUM_PAGE_NAME, "OuterAlbumLocal", sb.toString(), "folder=" + d.d(this.this$0).getText(), "picCreateTime=" + it.f(), "picIndex=" + it.k(), "queryType=" + a2, sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("pssource=");
        com.etao.feimagesearch.model.b pageModel2 = this.this$0.h();
        q.a((Object) pageModel2, "pageModel");
        sb3.append(pageModel2.getPssource());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("album_type=");
        d dVar3 = this.this$0;
        sb4.append(d.$ipChange);
        coy.b(cpk.ALBUM_PAGE_NAME, "SelectedPhoto", sb3.toString(), "folder=" + d.d(this.this$0).getText(), "picCreateTime=" + it.f(), "picIndex=" + it.k(), "queryType=" + a2, sb4.toString());
        CaptureManager manager = this.this$0.j();
        q.a((Object) manager, "manager");
        com.etao.feimagesearch.structure.capture.b n = manager.n();
        if (n == null) {
            return;
        }
        d dVar4 = this.this$0;
        n.a(it, d.$ipChange);
    }
}
