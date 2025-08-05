package com.taobao.message.notify;

import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clazz", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MessageNotifyService$doAgooNotify$1 extends Lambda implements rul<Class<?>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ String $invokeTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageNotifyService$doAgooNotify$1(Intent intent, String str) {
        super(1);
        this.$intent = intent;
        this.$invokeTag = str;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Class<?> cls) {
        invoke2(cls);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Class<?> clazz) {
        q.c(clazz, "clazz");
        try {
            clazz.getMethod("doAgooNotify", Intent.class, String.class).invoke(null, this.$intent, this.$invokeTag);
        } catch (Throwable th) {
            TLog.loge("MessageNotifyService", Log.getStackTraceString(th));
        }
    }
}
