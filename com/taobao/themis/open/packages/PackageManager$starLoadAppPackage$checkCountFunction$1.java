package com.taobao.themis.open.packages;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.extension.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PackageManager$starLoadAppPackage$checkCountFunction$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c.a $appPackageDownloadCallback;
    public final /* synthetic */ Ref.IntRef $finishCount;
    public final /* synthetic */ int $size;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageManager$starLoadAppPackage$checkCountFunction$1(a aVar, Ref.IntRef intRef, int i, c.a aVar2) {
        super(0);
        this.this$0 = aVar;
        this.$finishCount = intRef;
        this.$size = i;
        this.$appPackageDownloadCallback = aVar2;
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
        } else if (this.$finishCount.element < this.$size) {
        } else {
            TMSLogger.d(a.a(this.this$0), "load all package finish");
            c.a aVar = this.$appPackageDownloadCallback;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }
}
