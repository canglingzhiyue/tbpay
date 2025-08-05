package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubIconChangeGuide$doShowICONChangeStrongGuide$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $inputJson;
    public final /* synthetic */ dlr $runtimeContext;
    public final /* synthetic */ PubIconChangeGuide this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubIconChangeGuide$doShowICONChangeStrongGuide$1(PubIconChangeGuide pubIconChangeGuide, JSONObject jSONObject, dlr dlrVar) {
        super(0);
        this.this$0 = pubIconChangeGuide;
        this.$inputJson = jSONObject;
        this.$runtimeContext = dlrVar;
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
            return;
        }
        PubIconChangeGuide pubIconChangeGuide = this.this$0;
        Context context = PubIconChangeGuide.$ipChange;
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        if (((Activity) context).isFinishing()) {
            return;
        }
        new dkt().a(new dlh(this.$inputJson), this.$runtimeContext, AnonymousClass1.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032&\u0010\u0005\u001a\"\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0006¨\u0006\u00010\u0006¨\u0006\u0001H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "nextAbilityTypeKey", "", "kotlin.jvm.PlatformType", "result", "Lcom/taobao/android/abilitykit/AKAbilityExecuteResult;", "", "callback"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.pub_kit.guide.PubIconChangeGuide$doShowICONChangeStrongGuide$1$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static final class AnonymousClass1 implements dll {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // tb.dll
        public final void callback(String str, dkx<Object> dkxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
                return;
            }
            TMSLogger.a("iconChangeGuidePopup", str + dkxVar);
        }
    }
}
