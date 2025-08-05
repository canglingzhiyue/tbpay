package com.taobao.message.message_open_api;

import android.content.Context;
import android.os.Handler;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "clazz", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class CallService$call$1 extends Lambda implements rul<Class<?>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $api;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ Map $ext;
    public final /* synthetic */ Handler $handler;
    public final /* synthetic */ IObserver $observer;
    public final /* synthetic */ Map $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallService$call$1(Handler handler, Context context, String str, JSONObject jSONObject, Map map, Map map2, IObserver iObserver) {
        super(1);
        this.$handler = handler;
        this.$context = context;
        this.$api = str;
        this.$data = jSONObject;
        this.$options = map;
        this.$ext = map2;
        this.$observer = iObserver;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Class<?> cls) {
        invoke2(cls);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Class<?> clazz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5e481e", new Object[]{this, clazz});
            return;
        }
        q.c(clazz, "clazz");
        CallService.access$callImpl(CallService.INSTANCE, this.$handler, clazz, this.$context, this.$api, this.$data, this.$options, this.$ext, this.$observer);
    }
}
