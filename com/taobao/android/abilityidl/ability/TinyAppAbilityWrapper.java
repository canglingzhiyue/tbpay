package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cr;
import com.taobao.android.abilityidl.ability.cs;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class TinyAppAbilityWrapper extends AbsAbilityWrapper<AbsTinyAppAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1771916496);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppAbilityWrapper(AbsTinyAppAbility impl) {
        super(impl);
        kotlin.jvm.internal.q.d(impl, "impl");
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        switch (api.hashCode()) {
            case -1213411207:
                if (!api.equals("removeUserActiveAddIconListener")) {
                    return null;
                }
                getAbilityImpl().removeUserActiveAddIconListener(context, new ify(callback));
                return null;
            case -1041609130:
                if (!api.equals("showICONChangeGuide")) {
                    return null;
                }
                try {
                    getAbilityImpl().showICONChangeGuide(context, new eh(params), new ify(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -440088476:
                if (!api.equals("checkAddIconButton")) {
                    return null;
                }
                getAbilityImpl().checkAddIconButton(context, new b(callback));
                return null;
            case 465996379:
                if (!api.equals("showActiveReplacePopup")) {
                    return null;
                }
                getAbilityImpl().showActiveReplacePopup(context, new ify(callback));
                return null;
            case 1474607868:
                if (!api.equals("addUserActiveAddIconListener")) {
                    return null;
                }
                getAbilityImpl().addUserActiveAddIconListener(context, new a(callback));
                return null;
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements cs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8744a;

        public a(aln alnVar) {
            this.f8744a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cs
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8744a.a(new FinishResult(null, "onAddIcon"));
            }
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cs.a.a(this, result);
            this.f8744a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements cr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8745a;

        public b(aln alnVar) {
            this.f8745a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cr
        public void a(TinyAppCheckAddIconButtonResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a40ba91", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8745a.a(new FinishResult((JSONObject) json, "onReuslt"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cr.a.a(this, result);
            this.f8745a.a(result);
        }
    }
}
