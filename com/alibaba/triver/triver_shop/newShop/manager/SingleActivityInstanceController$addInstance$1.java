package com.alibaba.triver.triver_shop.newShop.manager;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* JADX WARN: Incorrect field signature: TA; */
/* loaded from: classes3.dex */
public final class SingleActivityInstanceController$addInstance$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Activity $removeFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TA;)V */
    public SingleActivityInstanceController$addInstance$1(Activity activity) {
        super(0);
        this.$removeFirst = activity;
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
        Activity activity = this.$removeFirst;
        if (activity == null) {
            return;
        }
        activity.finish();
    }
}
