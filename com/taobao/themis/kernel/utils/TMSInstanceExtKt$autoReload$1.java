package com.taobao.themis.kernel.utils;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import tb.qqp;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSInstanceExtKt$autoReload$1 extends Lambda implements ruk<kotlin.t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ com.taobao.themis.kernel.f $this_autoReload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSInstanceExtKt$autoReload$1(com.taobao.themis.kernel.f fVar) {
        super(0);
        this.$this_autoReload = fVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ kotlin.t mo2427invoke() {
        mo2427invoke();
        return kotlin.t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            com.taobao.themis.kernel.f fVar = this.$this_autoReload;
            qqp qqpVar = new qqp();
            qqpVar.f33036a = Uri.parse(this.$this_autoReload.g()).buildUpon().appendQueryParameter("tms_auto_reload", "true").build().toString();
            kotlin.t tVar = kotlin.t.INSTANCE;
            fVar.a(qqpVar);
            Result.m2371constructorimpl(kotlin.t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }
}
