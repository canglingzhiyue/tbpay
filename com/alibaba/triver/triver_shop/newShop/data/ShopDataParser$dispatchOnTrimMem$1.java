package com.alibaba.triver.triver_shop.newShop.data;

import android.content.ComponentCallbacks2;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopDataParser$dispatchOnTrimMem$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $level;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDataParser$dispatchOnTrimMem$1(d dVar, int i) {
        super(0);
        this.this$0 = dVar;
        this.$level = i;
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
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        d dVar = this.this$0;
        int i = this.$level;
        try {
            Result.a aVar = Result.Companion;
            Iterator it = d.$ipChange.iterator();
            while (it.hasNext()) {
                ComponentCallbacks2 componentCallbacks2 = (ComponentCallbacks2) it.next();
                Result.a aVar2 = Result.Companion;
                componentCallbacks2.onTrimMemory(i);
                Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(Result.m2371constructorimpl(t.INSTANCE));
                if (m2374exceptionOrNullimpl != null) {
                    ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
                }
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl2 = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl2 == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl2);
    }
}
