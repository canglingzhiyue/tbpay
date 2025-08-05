package com.alibaba.triver.triver_shop.shop2023.nativeview;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class Shop2023PullDownHelper$attachTo$2 extends Lambda implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023PullDownHelper$attachTo$2(g gVar) {
        super(1);
        this.this$0 = gVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, bool});
        }
        invoke(bool.booleanValue());
        return t.INSTANCE;
    }

    public final void invoke(boolean z) {
        TUrlImageView b;
        TUrlImageView l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.this$0;
        TUrlImageView tUrlImageView = g.$ipChange;
        String str = null;
        if (tUrlImageView == null) {
            q.b("ivBack");
            throw null;
        }
        b a2 = this.this$0.a();
        tUrlImageView.setImageUrl((a2 == null || (b = a2.b()) == null) ? null : b.getImageUrl());
        g gVar2 = this.this$0;
        TUrlImageView tUrlImageView2 = g.$ipChange;
        if (tUrlImageView2 == null) {
            q.b("ivMore");
            throw null;
        }
        b a3 = this.this$0.a();
        if (a3 != null && (l = a3.l()) != null) {
            str = l.getImageUrl();
        }
        tUrlImageView2.setImageUrl(str);
    }
}
