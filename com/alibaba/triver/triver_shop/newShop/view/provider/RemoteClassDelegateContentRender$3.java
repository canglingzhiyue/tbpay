package com.alibaba.triver.triver_shop.newShop.view.provider;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.category.transformer.UpdateDownloadProgressTransformer;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public /* synthetic */ class RemoteClassDelegateContentRender$3 extends FunctionReferenceImpl implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RemoteClassDelegateContentRender$3(d dVar) {
        super(1, dVar, d.class, UpdateDownloadProgressTransformer.NAME, "updateProgress(I)V", 0);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, num});
        }
        invoke(num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else {
            d.a((d) this.receiver, i);
        }
    }
}
