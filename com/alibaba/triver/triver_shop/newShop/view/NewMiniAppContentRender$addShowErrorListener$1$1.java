package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class NewMiniAppContentRender$addShowErrorListener$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $code;
    public final /* synthetic */ Map<String, String> $extra;
    public final /* synthetic */ String $msg;
    public final /* synthetic */ NewMiniAppContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMiniAppContentRender$addShowErrorListener$1$1(NewMiniAppContentRender newMiniAppContentRender, String str, String str2, Map<String, String> map) {
        super(0);
        this.this$0 = newMiniAppContentRender;
        this.$code = str;
        this.$msg = str2;
        this.$extra = map;
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
        } else {
            NewMiniAppContentRender.a(this.this$0, this.$code, this.$msg, this.$extra);
        }
    }
}
