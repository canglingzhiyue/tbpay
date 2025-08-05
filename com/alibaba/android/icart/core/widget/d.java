package com.alibaba.android.icart.core.widget;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.bed;
import tb.jao;
import tb.jqh;
import tb.jzb;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/alibaba/android/icart/core/widget/CartToast;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "doShow", "", "context", "Landroid/content/Context;", "message", "show", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/alibaba/android/icart/core/widget/CartToast$doShow$1$1", "Lcom/taobao/android/abilityidl/callback/IMegaAbilityCallback;", "onError", "", "result", "Lcom/alibaba/ability/result/ErrorResult;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements jzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jzb, tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            bed.a("CartToast", "MegaToast出错:" + result.b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2379a;
        public final /* synthetic */ String b;

        public b(Context context, String str) {
            this.f2379a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.INSTANCE, this.f2379a, this.b);
            }
        }
    }

    static {
        kge.a(1271176773);
        INSTANCE = new d();
    }

    private d() {
    }

    public static final /* synthetic */ void a(d dVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9480fb", new Object[]{dVar, context, str});
        } else {
            dVar.b(context, str);
        }
    }

    @JvmStatic
    public static final void a(Context context, String message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, message});
            return;
        }
        q.d(context, "context");
        q.d(message, "message");
        jqh.a(new b(context, message), 0L);
    }

    private final void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
            return;
        }
        try {
            jao.a().a(str, new a());
            t tVar = t.INSTANCE;
        } catch (Throwable th) {
            bed.a("CartToast", "MegaToast出错:" + th.getMessage());
            t tVar2 = t.INSTANCE;
        }
    }
}
