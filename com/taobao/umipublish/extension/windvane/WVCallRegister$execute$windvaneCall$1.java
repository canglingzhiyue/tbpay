package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class WVCallRegister$execute$windvaneCall$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $actionName;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $params;
    public final /* synthetic */ WVCallBackContext $wvCallBackContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVCallRegister$execute$windvaneCall$1(String str, Context context, WVCallBackContext wVCallBackContext, JSONObject jSONObject) {
        super(0);
        this.$actionName = str;
        this.$context = context;
        this.$wvCallBackContext = wVCallBackContext;
        this.$params = jSONObject;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final t mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("a0e370c0", new Object[]{this});
        }
        WVCallRegister wVCallRegister = WVCallRegister.INSTANCE;
        String str = this.$actionName;
        Context context = this.$context;
        WVCallBackContext wVCallBackContext = this.$wvCallBackContext;
        WindvaneCall windvaneCall = WVCallRegister.$ipChange;
        if (windvaneCall == null) {
            return null;
        }
        windvaneCall.call(this.$params);
        return t.INSTANCE;
    }
}
