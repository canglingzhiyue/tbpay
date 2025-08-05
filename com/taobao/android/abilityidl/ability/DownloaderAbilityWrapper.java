package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ff;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class DownloaderAbilityWrapper extends AbsAbilityWrapper<AbsDownloaderAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1324213480);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloaderAbilityWrapper(AbsDownloaderAbility impl) {
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
        int hashCode = api.hashCode();
        if (hashCode != -1367724422) {
            if (hashCode != 1427818632 || !api.equals("download")) {
                return null;
            }
            try {
                getAbilityImpl().download(context, new fb(params), new a(callback));
                return null;
            } catch (Throwable th) {
                return a$a.Companion.b(th.getMessage());
            }
        } else if (!api.equals("cancel")) {
            return null;
        } else {
            getAbilityImpl().cancel(context, new ify(callback));
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements ff {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8649a;

        public a(aln alnVar) {
            this.f8649a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.ff
        public void a(DownloaderProgressResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf57bcbe", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8649a.a(new FinishResult((JSONObject) json, "onProgress"));
        }

        @Override // com.taobao.android.abilityidl.ability.ff
        public void a(DownloaderCompleteResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0e57b32", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8649a.a(new FinishResult((JSONObject) json, "onComplete"));
        }

        @Override // com.taobao.android.abilityidl.ability.ff
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8649a.a(new FinishResult(null, "onCancel"));
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
            ff.a.a(this, result);
            this.f8649a.a(result);
        }
    }
}
