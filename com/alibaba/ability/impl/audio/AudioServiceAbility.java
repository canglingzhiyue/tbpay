package com.alibaba.ability.impl.audio;

import android.content.Context;
import com.alibaba.ability.impl.audio.AudioService;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ariver.kernel.RVConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.media.MessageID;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.alm;
import tb.aln;
import tb.als;
import tb.cpe;
import tb.kge;

/* loaded from: classes2.dex */
public final class AudioServiceAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1847a;
    private AudioService.a b;
    private aln c;
    private final c d = new c();

    /* loaded from: classes2.dex */
    public static final class a implements j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f1848a;

        public a(aln alnVar) {
            this.f1848a = alnVar;
        }

        @Override // com.alibaba.ability.impl.audio.j
        public void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa4386b1", new Object[]{this, hVar});
            } else {
                this.f1848a.a((ExecuteResult) new FinishResult(hVar != null ? hVar.a() : null, "onData"));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f1849a;

        public b(aln alnVar) {
            this.f1849a = alnVar;
        }

        @Override // com.alibaba.ability.impl.audio.g
        public void a(f properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa429df3", new Object[]{this, properties});
                return;
            }
            q.d(properties, "properties");
            this.f1849a.a((ExecuteResult) new FinishResult(properties.a(), "onData"));
        }
    }

    static {
        kge.a(766158089);
    }

    public static /* synthetic */ Object ipc$super(AudioServiceAbility audioServiceAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ aln access$getCurCallback$p(AudioServiceAbility audioServiceAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aln) ipChange.ipc$dispatch("dd8150fb", new Object[]{audioServiceAbility}) : audioServiceAbility.c;
    }

    public static final /* synthetic */ void access$setCurCallback$p(AudioServiceAbility audioServiceAbility, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4907e7a9", new Object[]{audioServiceAbility, alnVar});
        } else {
            audioServiceAbility.c = alnVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements k {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private als b;

        public c() {
        }

        public final void a(als alsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0423430", new Object[]{this, alsVar});
            } else {
                this.b = alsVar;
            }
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void a(i info, l statusInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1f73cd5", new Object[]{this, info, statusInfo});
                return;
            }
            q.d(info, "info");
            q.d(statusInfo, "statusInfo");
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(statusInfo.a(true), MessageID.onSeekComplete));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void a(i info) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa43fb10", new Object[]{this, info});
                return;
            }
            q.d(info, "info");
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(info.a(), "onPlay"));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void a(i info, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e3c19c4", new Object[]{this, info, new Boolean(z)});
                return;
            }
            q.d(info, "info");
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(null, "onPause"));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void b(i info) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c344f251", new Object[]{this, info});
                return;
            }
            q.d(info, "info");
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(null, "onResume"));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void c(i info) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c45e992", new Object[]{this, info});
                return;
            }
            q.d(info, "info");
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(info.a(), "onEnd"));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void d(i info) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5546e0d3", new Object[]{this, info});
                return;
            }
            q.d(info, "info");
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new FinishResult(null, MessageID.onStop));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa45582d", new Object[]{this, lVar});
                return;
            }
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(lVar != null ? lVar.a(true) : null, "onTimeUpdate"));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(null, "onTapNext"));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ExecutingResult(null, "onTapPrev"));
        }

        @Override // com.alibaba.ability.impl.audio.k
        public void a(String code, String msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, code, msg});
                return;
            }
            q.d(code, "code");
            q.d(msg, "msg");
            aln access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p == null) {
                return;
            }
            access$getCurCallback$p.a((ExecuteResult) new ErrorResult(code, msg, (Map) null, 4, (o) null));
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            return a$a.Companion.b("NoAppCtx");
        }
        if (!this.f1847a) {
            String d = context.f().d();
            String str = d;
            if (str == null || n.a((CharSequence) str)) {
                return new ErrorResult("unsupportedContainer", "当前容器不支持播放", (Map) null, 4, (o) null);
            }
            this.d.a(context);
            this.b = new AudioService.a(d);
            AudioService.a aVar = this.b;
            if (aVar == null) {
                q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
            }
            aVar.a(this.d);
        }
        this.f1847a = true;
        switch (api.hashCode()) {
            case -934426579:
                if (api.equals("resume")) {
                    a(context, f);
                    return null;
                }
                return a$a.Companion.a(api + " not found");
            case -449670347:
                if (api.equals("setProperties")) {
                    AudioService.a aVar2 = this.b;
                    if (aVar2 == null) {
                        q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
                    }
                    aVar2.a(params);
                    return null;
                }
                return a$a.Companion.a(api + " not found");
            case 3443508:
                if (api.equals("play")) {
                    try {
                        Map<String, Object> e = context.e();
                        Object obj = e != null ? e.get(RVConstants.EXTRA_APPINFO) : null;
                        if (!(obj instanceof Map)) {
                            obj = null;
                        }
                        return a(context, f, new e(params, (Map) obj));
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                return a$a.Companion.a(api + " not found");
            case 3526264:
                if (api.equals("seek")) {
                    Integer a2 = com.alibaba.ability.e.a(params, "position", (Integer) 0);
                    q.a(a2);
                    a(context, f, a2.intValue());
                    return null;
                }
                return a$a.Companion.a(api + " not found");
            case 3540994:
                if (api.equals("stop")) {
                    c(context, f);
                    return null;
                }
                return a$a.Companion.a(api + " not found");
            case 106440182:
                if (api.equals("pause")) {
                    b(context, f);
                    return null;
                }
                return a$a.Companion.a(api + " not found");
            case 338146594:
                if (api.equals("requestProperties")) {
                    AudioService.a aVar3 = this.b;
                    if (aVar3 == null) {
                        q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
                    }
                    aVar3.a(new b(callback));
                    return null;
                }
                return a$a.Companion.a(api + " not found");
            case 783057964:
                if (api.equals("setEventListener")) {
                    this.c = callback;
                    return new FinishResult(null, null, 3, null);
                }
                return a$a.Companion.a(api + " not found");
            case 1149758429:
                if (api.equals("requestInfo")) {
                    a(context, new a(callback));
                    return null;
                }
                return a$a.Companion.a(api + " not found");
            default:
                return a$a.Companion.a(api + " not found");
        }
    }

    private final ExecuteResult a(als alsVar, Context context, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("bb1ed0bb", new Object[]{this, alsVar, context, eVar});
        }
        AudioService.a aVar = this.b;
        if (aVar == null) {
            q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
        }
        aVar.a(context, eVar);
        return new FinishResult(null, null, 3, null);
    }

    private final void a(als alsVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63e4537", new Object[]{this, alsVar, jVar});
            return;
        }
        AudioService.a aVar = this.b;
        if (aVar == null) {
            q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
        }
        aVar.a(jVar);
    }

    private final void a(als alsVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4e6d98", new Object[]{this, alsVar, context});
            return;
        }
        AudioService.a aVar = this.b;
        if (aVar == null) {
            q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
        }
        aVar.b(context);
    }

    private final void b(als alsVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa10a37", new Object[]{this, alsVar, context});
            return;
        }
        AudioService.a aVar = this.b;
        if (aVar == null) {
            q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
        }
        aVar.a(context);
    }

    private final ExecuteResult c(als alsVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("3131c4e9", new Object[]{this, alsVar, context});
        }
        AudioService.a aVar = this.b;
        if (aVar == null) {
            q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
        }
        aVar.c(context);
        return new FinishResult(null, null, 3, null);
    }

    private final ExecuteResult a(als alsVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("9a94bef4", new Object[]{this, alsVar, context, new Integer(i)});
        }
        AudioService.a aVar = this.b;
        if (aVar == null) {
            q.b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
        }
        aVar.a(context, i);
        return new FinishResult(null, null, 3, null);
    }
}
