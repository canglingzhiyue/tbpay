package com.taobao.detail.rate.vivid.ability;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.dkt;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility;", "Lcom/taobao/android/abilitykit/AKBaseAbility;", "Lcom/taobao/android/dinamicx/eventchain/DXUIAbilityRuntimeContext;", "()V", "context", "Landroid/content/Context;", "receiverSet", "", "Landroid/content/BroadcastReceiver;", "getReceiverSet", "()Ljava/util/Set;", "setReceiverSet", "(Ljava/util/Set;)V", "destroyReceiver", "", "onExecuteWithData", "Lcom/taobao/android/abilitykit/AKAbilityExecuteResult;", "jsonData", "Lcom/taobao/android/abilitykit/AKBaseAbilityData;", "runtimeContext", "akiAbilityCallback", "Lcom/taobao/android/abilitykit/AKIAbilityCallback;", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class c extends dlg<com.taobao.android.dinamicx.eventchain.l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    private static final long c = -855788324222098774L;

    /* renamed from: a  reason: collision with root package name */
    private Set<BroadcastReceiver> f17041a = new LinkedHashSet();
    private Context b;

    public static final /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$Companion;", "", "()V", "REGISTERRECEIVER", "", "getREGISTERRECEIVER", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : c.e();
        }
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, final com.taobao.android.dinamicx.eventchain.l runtimeContext, dll akiAbilityCallback) {
        List<String> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, runtimeContext, akiAbilityCallback});
        }
        q.d(runtimeContext, "runtimeContext");
        q.d(akiAbilityCallback, "akiAbilityCallback");
        this.b = runtimeContext.a();
        String str = null;
        if (!StringUtils.isEmpty(dlhVar != null ? dlhVar.c("action") : null)) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.detail.rate.vivid.ability.RegisterReceiverAbility$onExecuteWithData$mLoginReceiver$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    com.taobao.android.abilitykit.ability.g b3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    q.d(context, "context");
                    q.d(intent, "intent");
                    if (StringUtils.isEmpty(intent.getAction())) {
                        return;
                    }
                    Bundle extras = intent.getExtras();
                    JSONObject jSONObject = new JSONObject();
                    if (extras != null) {
                        for (String str2 : extras.keySet()) {
                            jSONObject.put(str2, extras.get(str2));
                        }
                    }
                    dkt e = com.taobao.android.dinamicx.eventchain.l.this.e();
                    if (e == null || (b3 = e.b()) == null) {
                        return;
                    }
                    b3.a(intent.getAction(), jSONObject);
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            if (dlhVar != null) {
                str = dlhVar.c("action");
            }
            if (str != null && (b2 = n.b((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null)) != null) {
                for (String str2 : b2) {
                    intentFilter.addAction(str2);
                }
            }
            LocalBroadcastManager.getInstance(runtimeContext.a()).registerReceiver(broadcastReceiver, intentFilter);
            this.f17041a.add(broadcastReceiver);
            return new dla();
        }
        return new dkw(new dkv(-10001, "error info = action is null"), true);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Context context = this.b;
        if (context != null) {
            for (BroadcastReceiver broadcastReceiver : this.f17041a) {
                LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
            }
        }
        this.b = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$Builder;", "Lcom/taobao/android/abilitykit/AKIBuilderAbility;", "", "()V", "registerReceiverAbility", "Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility;", "getRegisterReceiverAbility", "()Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility;", "setRegisterReceiverAbility", "(Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility;)V", CartRecommendRefreshScene.build, "p0", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a implements dln<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f17042a = new c();

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public final c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("78ba6514", new Object[]{this}) : this.f17042a;
        }

        public c a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("22fd1fb8", new Object[]{this, obj}) : this.f17042a;
        }
    }
}
