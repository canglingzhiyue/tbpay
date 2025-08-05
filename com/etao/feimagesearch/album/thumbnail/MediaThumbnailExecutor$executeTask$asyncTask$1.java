package com.etao.feimagesearch.album.thumbnail;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class MediaThumbnailExecutor$executeTask$asyncTask$1 extends Lambda implements rul<e, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e $task;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaThumbnailExecutor$executeTask$asyncTask$1(b bVar, e eVar) {
        super(1);
        this.this$0 = bVar;
        this.$task = eVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(e eVar) {
        invoke2(eVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(e it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30cbe8bb", new Object[]{this, it});
            return;
        }
        q.c(it, "it");
        b bVar = this.this$0;
        b.$ipChange.remove(this.$task);
    }
}
