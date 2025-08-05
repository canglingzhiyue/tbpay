package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopExtKt$startShopSubScribeDAITask$4 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.BooleanRef $alreadyPaused;
    public final /* synthetic */ Context $fragmentActivity;
    public final /* synthetic */ boolean $isSubScribe;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$startShopSubScribeDAITask$4(Ref.BooleanRef booleanRef, Context context, com.alibaba.triver.triver_shop.newShop.data.d dVar, boolean z) {
        super(0);
        this.$alreadyPaused = booleanRef;
        this.$fragmentActivity = context;
        this.$shopData = dVar;
        this.$isSubScribe = z;
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
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.$alreadyPaused.element) {
        } else {
            if ((Build.VERSION.SDK_INT >= 17 && ((FragmentActivity) this.$fragmentActivity).isDestroyed()) || ((FragmentActivity) this.$fragmentActivity).isFinishing()) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.$shopData;
            boolean z = this.$isSubScribe;
            try {
                Result.a aVar = Result.Companion;
                Pair[] pairArr = new Pair[2];
                String U = dVar.U();
                pairArr[0] = kotlin.j.a("sellerId", U == null ? null : kotlin.text.n.e(U));
                if (z) {
                    i = 1;
                }
                pairArr[1] = kotlin.j.a("isSubscribe", Integer.valueOf(i));
                DAI.runCompute("inshop_subscribe_guide", ai.c(pairArr), new DAICallback() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startShopSubScribeDAITask$4$1$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.tmall.android.dai.DAICallback
                    public void onError(DAIError dAIError) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                        } else {
                            ceg.Companion.b(q.a("inshop_subscribe_guide dai error : ", (Object) (dAIError == null ? null : Integer.valueOf(dAIError.errorCode))));
                        }
                    }

                    @Override // com.tmall.android.dai.DAICallback
                    public void onSuccess(Object... p0) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f85dc9a6", new Object[]{this, p0});
                            return;
                        }
                        q.d(p0, "p0");
                        ceg.Companion.b(q.a("inshop_subscribe_guide dai success : ", (Object) p0));
                    }
                });
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
    }
}
