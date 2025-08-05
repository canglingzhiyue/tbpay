package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bh;
import com.taobao.android.abilityidl.ability.bi;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class ContactsAbilityWrapper extends AbsAbilityWrapper<AbsContactsAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(248525366);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsAbilityWrapper(AbsContactsAbility impl) {
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
        if (hashCode == -1361218025) {
            if (!api.equals("choose")) {
                return null;
            }
            getAbilityImpl().choose(context, new a(callback));
            return null;
        } else if (hashCode != 107944136 || !api.equals("query")) {
            return null;
        } else {
            try {
                getAbilityImpl().query(context, new r(params), new b(callback));
                return null;
            } catch (Throwable th) {
                return a$a.Companion.b(th.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements bh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8637a;

        public a(aln alnVar) {
            this.f8637a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bh
        public void a(ContactsResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4517124d", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8637a.a(new FinishResult((JSONObject) json, "onChosen"));
        }

        @Override // com.taobao.android.abilityidl.ability.bh
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8637a.a(new FinishResult(null, "onCancelled"));
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
            bh.a.a(this, result);
            this.f8637a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements bi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8638a;

        public b(aln alnVar) {
            this.f8638a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bi
        public void a(ContactsQueryResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af071221", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8638a.a(new FinishResult((JSONObject) json, "onFound"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bi.a.a(this, result);
            this.f8638a.a(result);
        }
    }
}
