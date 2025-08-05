package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bf;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class AudioContextAbilityWrapper extends AbsAbilityWrapper<AbsAudioContextAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-17563812);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioContextAbilityWrapper(AbsAudioContextAbility impl) {
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
            case -430792441:
                if (!api.equals("setPauseInBackground")) {
                    return null;
                }
                try {
                    getAbilityImpl().setPauseInBackground(context, new k(params), new ify(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -318370553:
                if (!api.equals("prepare")) {
                    return null;
                }
                try {
                    getAbilityImpl().prepare(context, new m(params), new ify(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case 3443508:
                if (!api.equals("play")) {
                    return null;
                }
                getAbilityImpl().play(context, new ify(callback));
                return null;
            case 3526264:
                if (!api.equals("seek")) {
                    return null;
                }
                try {
                    getAbilityImpl().seek(context, new n(params), new ify(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            case 3540994:
                if (!api.equals("stop")) {
                    return null;
                }
                getAbilityImpl().stop(context, new ify(callback));
                return null;
            case 106440182:
                if (!api.equals("pause")) {
                    return null;
                }
                getAbilityImpl().pause(context, new ify(callback));
                return null;
            case 670514716:
                if (!api.equals(CommandID.setVolume)) {
                    return null;
                }
                try {
                    getAbilityImpl().setVolume(context, new l(params), new ify(callback));
                    return null;
                } catch (Throwable th4) {
                    return a$a.Companion.b(th4.getMessage());
                }
            case 783057964:
                if (!api.equals("setEventListener")) {
                    return null;
                }
                getAbilityImpl().setEventListener(context, new a(callback));
                return null;
            case 1398977065:
                if (!api.equals(CommandID.setMuted)) {
                    return null;
                }
                try {
                    getAbilityImpl().setMuted(context, new k(params), new ify(callback));
                    return null;
                } catch (Throwable th5) {
                    return a$a.Companion.b(th5.getMessage());
                }
            case 1984755238:
                if (!api.equals("setLoop")) {
                    return null;
                }
                try {
                    getAbilityImpl().setLoop(context, new k(params), new ify(callback));
                    return null;
                } catch (Throwable th6) {
                    return a$a.Companion.b(th6.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements bf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8633a;

        public a(aln alnVar) {
            this.f8633a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8633a.a(new FinishResult(null, "onPlay"));
            }
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void a(AudioContextStatusInfo result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ac9964", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8633a.a(new FinishResult((JSONObject) json, "onReady"));
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.f8633a.a(new FinishResult(null, "onPause"));
            }
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.f8633a.a(new FinishResult(null, "onSeeking"));
            }
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                this.f8633a.a(new FinishResult(null, MessageID.onSeekComplete));
            }
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.f8633a.a(new FinishResult(null, MessageID.onStop));
            }
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else {
                this.f8633a.a(new FinishResult(null, "onEnd"));
            }
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void a(AudioContextTimeUpdateInfo result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4833e4e0", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8633a.a(new FinishResult((JSONObject) json, "onTimeUpdate"));
        }

        @Override // com.taobao.android.abilityidl.ability.bf
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            } else {
                this.f8633a.a(new FinishResult(null, "onLoop"));
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
            bf.a.a(this, result);
            this.f8633a.a(result);
        }
    }
}
