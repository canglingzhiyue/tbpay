package com.taobao.themis.open.packages.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.packages.downloader.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "", "downloadSize", "", "totalSize", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1 extends Lambda implements ruw<Long, Long, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a.b $downloadCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1(a.b bVar) {
        super(2);
        this.$downloadCallback = bVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Long l, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, l, l2});
        }
        invoke(l.longValue(), l2.longValue());
        return t.INSTANCE;
    }

    public final void invoke(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07061bf", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        int i = j == j2 ? 100 : (int) (((float) j) / ((float) j2));
        a.b bVar = this.$downloadCallback;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }
}
