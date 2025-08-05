package com.etao.feimagesearch.pipline.node;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.model.PhotoFrom;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.crn;
import tb.rul;

/* loaded from: classes3.dex */
public final class ImageCodeDetectNode$process$1 extends Lambda implements rul<com.etao.feimagesearch.pipline.b, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Integer $token;
    public final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCodeDetectNode$process$1(j jVar, Integer num) {
        super(1);
        this.this$0 = jVar;
        this.$token = num;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(com.etao.feimagesearch.pipline.b bVar) {
        invoke2(bVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final com.etao.feimagesearch.pipline.b pipLineEventBus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6673f", new Object[]{this, pipLineEventBus});
            return;
        }
        q.c(pipLineEventBus, "pipLineEventBus");
        com.etao.feimagesearch.capture.scan.irp.b.a().a(this.$token.intValue(), new b.c() { // from class: com.etao.feimagesearch.pipline.node.ImageCodeDetectNode$process$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.capture.scan.irp.b.c
            public final void a(List<b.a> list, PhotoFrom.Values values) {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("edf4b889", new Object[]{this, list, values});
                    return;
                }
                crn a2 = (list == null || list.isEmpty()) ? ImageCodeDetectNode$process$1.this.this$0.a((Object) null) : ImageCodeDetectNode$process$1.this.this$0.a(list);
                j jVar = ImageCodeDetectNode$process$1.this.this$0;
                if (list != null) {
                    i = list.size();
                }
                jVar.a("codeDetectCount", String.valueOf(i));
                ImageCodeDetectNode$process$1.this.this$0.d();
                if (com.taobao.android.searchbaseframe.util.g.a(com.etao.feimagesearch.config.b.k("ImgCodeDetectDelayTime"), 0L) <= 0) {
                    pipLineEventBus.a(a2);
                } else {
                    pipLineEventBus.a(a2, 5000L);
                }
                com.etao.feimagesearch.capture.scan.irp.b.a().a(ImageCodeDetectNode$process$1.this.$token.intValue());
            }
        });
    }
}
