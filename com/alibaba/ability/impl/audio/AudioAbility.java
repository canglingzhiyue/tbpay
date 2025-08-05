package com.alibaba.ability.impl.audio;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAudioContextAbility;
import com.taobao.android.abilityidl.ability.AudioContextStatusInfo;
import com.taobao.android.abilityidl.ability.AudioContextTimeUpdateInfo;
import com.taobao.android.abilityidl.ability.bf;
import com.taobao.android.abilityidl.ability.m;
import com.taobao.android.abilityidl.ability.n;
import com.taobao.avplayer.am;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes2.dex */
public final class AudioAbility extends AbsAudioContextAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private am f1838a;
    private String b;
    private bf c;

    static {
        kge.a(-2102720682);
    }

    public static /* synthetic */ Object ipc$super(AudioAbility audioAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void prepare(als abilityContext, m params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b8e5e2", new Object[]{this, abilityContext, params, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
            return;
        }
        am a2 = a(f);
        String str = this.b;
        if (str != null) {
            a2.l(str);
        }
        String a3 = a2.a("", params.f8888a);
        if (a3 == null) {
            callback.a(new ErrorResult("PREPARE_FAILED", "播放器准备失败", (Map) null, 4, (o) null));
            return;
        }
        this.b = a3;
        a2.i(this.b);
        a2.b(this.b, 1000L);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void play(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbd93ed", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        String str = this.b;
        if (str == null) {
            callback.a(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (o) null));
            return;
        }
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else {
            a(f).j(str);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void pause(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa39af", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        String str = this.b;
        if (str == null) {
            callback.a(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (o) null));
            return;
        }
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else {
            a(f).k(str);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void seek(als abilityContext, n params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3551af70", new Object[]{this, abilityContext, params, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = this.b;
        if (str == null) {
            callback.a(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (o) null));
            return;
        }
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else {
            a(f).a(str, params.f8889a);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void stop(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e9dbb", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        String str = this.b;
        if (str == null) {
            callback.a(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (o) null));
            return;
        }
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
            return;
        }
        a(f).l(str);
        bf bfVar = this.c;
        if (bfVar != null) {
            bfVar.e();
        }
        this.b = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setEventListener(als abilityContext, bf events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ad4ecc", new Object[]{this, abilityContext, events});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(events, "events");
        Context f = abilityContext.f().f();
        if (f == null) {
            events.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
            return;
        }
        am a2 = a(f);
        a2.a(new a(a2, events));
        this.c = events;
    }

    /* loaded from: classes2.dex */
    public static final class a implements am.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ am f1839a;
        public final /* synthetic */ bf b;

        public a(am amVar, bf bfVar) {
            this.f1839a = amVar;
            this.b = bfVar;
        }

        @Override // com.taobao.avplayer.am.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.b.f();
            }
        }

        @Override // com.taobao.avplayer.am.a
        public void a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            bf bfVar = this.b;
            bfVar.a(new ErrorResult("PLAYER_ERROR", "播放器错误, " + i + ", " + i2, (Map) null, 4, (o) null));
        }

        @Override // com.taobao.avplayer.am.a
        public void a(long j, long j2, long j3, Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31f52582", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj, str});
                return;
            }
            bf bfVar = this.b;
            AudioContextTimeUpdateInfo audioContextTimeUpdateInfo = new AudioContextTimeUpdateInfo();
            audioContextTimeUpdateInfo.currentTime = Integer.valueOf((int) this.f1839a.n(str));
            audioContextTimeUpdateInfo.duration = Integer.valueOf((int) this.f1839a.m(str));
            t tVar = t.INSTANCE;
            bfVar.a(audioContextTimeUpdateInfo);
        }

        @Override // com.taobao.avplayer.am.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.b.g();
            }
        }

        @Override // com.taobao.avplayer.am.a
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.b.f();
            }
        }

        @Override // com.taobao.avplayer.am.a
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
                return;
            }
            bf bfVar = this.b;
            AudioContextStatusInfo audioContextStatusInfo = new AudioContextStatusInfo();
            audioContextStatusInfo.currentTime = Integer.valueOf((int) this.f1839a.n(str));
            audioContextStatusInfo.duration = Integer.valueOf((int) this.f1839a.m(str));
            t tVar = t.INSTANCE;
            bfVar.a(audioContextStatusInfo);
        }

        @Override // com.taobao.avplayer.am.a
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            } else {
                this.b.d();
            }
        }

        @Override // com.taobao.avplayer.am.a
        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            } else {
                this.b.b();
            }
        }

        @Override // com.taobao.avplayer.am.a
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            } else {
                this.b.c();
            }
        }

        @Override // com.taobao.avplayer.am.a
        public void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            } else {
                this.b.a();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setLoop(als abilityContext, com.taobao.android.abilityidl.ability.k params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f6d665", new Object[]{this, abilityContext, params, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = this.b;
        if (str == null) {
            callback.a(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (o) null));
            return;
        }
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else {
            a(f).a(str, params.f8886a);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setMuted(als abilityContext, com.taobao.android.abilityidl.ability.k params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b5e942", new Object[]{this, abilityContext, params, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = this.b;
        if (str == null) {
            callback.a(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (o) null));
            return;
        }
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else {
            a(f).b(str, params.f8886a);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setVolume(als abilityContext, com.taobao.android.abilityidl.ability.l params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9032d78e", new Object[]{this, abilityContext, params, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = this.b;
        if (str == null) {
            callback.a(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (o) null));
            return;
        }
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else {
            a(f).a(str, (float) params.f8887a, (float) params.f8887a);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setPauseInBackground(als abilityContext, com.taobao.android.abilityidl.ability.k params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34118724", new Object[]{this, abilityContext, params, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
        } else {
            a(f).a(params.f8886a);
        }
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        am amVar = this.f1838a;
        if (amVar != null) {
            amVar.a();
            this.f1838a = null;
        }
        this.c = null;
        this.b = null;
    }

    private final am a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am) ipChange.ipc$dispatch("cc835ff3", new Object[]{this, context});
        }
        am amVar = this.f1838a;
        if (amVar != null) {
            return amVar;
        }
        am amVar2 = new am(context);
        this.f1838a = amVar2;
        return amVar2;
    }
}
