package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.flexbox.layoutmanager.container.dx.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;
import tb.rva;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DxContainer$createViewInner$4 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a.b $customParams;
    public final /* synthetic */ rul $downloadCallBak;
    public final /* synthetic */ DXTemplateItem $dxTemplateItem;
    public final /* synthetic */ int $height;
    public final /* synthetic */ rva $renderCallback;
    public final /* synthetic */ int $width;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$createViewInner$4(a aVar, int i, int i2, DXTemplateItem dXTemplateItem, a.b bVar, rul rulVar, rva rvaVar) {
        super(0);
        this.this$0 = aVar;
        this.$height = i;
        this.$width = i2;
        this.$dxTemplateItem = dXTemplateItem;
        this.$customParams = bVar;
        this.$downloadCallBak = rulVar;
        this.$renderCallback = rvaVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        a aVar = this.this$0;
        int i = this.$height;
        int i2 = this.$width;
        String str = this.$dxTemplateItem.f11925a;
        q.b(str, "dxTemplateItem.name");
        long j = this.$dxTemplateItem.b;
        String str2 = this.$dxTemplateItem.c;
        q.b(str2, "dxTemplateItem.templateUrl");
        aVar.a(i, i2, str, j, str2, this.$customParams, this.$downloadCallBak, this.$renderCallback);
    }
}
