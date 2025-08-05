package com.taobao.themis.mix.weex_render;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWeexAPIBridge$call$1 extends Lambda implements ruk<Pair<? extends String, ? extends String>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSWeexAPIBridge$call$1 INSTANCE = new TMSWeexAPIBridge$call$1();

    public TMSWeexAPIBridge$call$1() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Pair<? extends String, ? extends String> mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c1956768", new Object[]{this});
        }
        j.a("error", "-1");
        return j.a("errorMessage", "当前环境不支持openApi");
    }
}
