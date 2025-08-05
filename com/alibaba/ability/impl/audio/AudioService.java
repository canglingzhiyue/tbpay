package com.alibaba.ability.impl.audio;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.an;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.bc;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.n;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.uc.webview.export.extension.UCCore;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.amg;
import tb.amh;
import tb.kge;
import tb.ruw;

/* loaded from: classes2.dex */
public final class AudioService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;
    private static com.alibaba.ability.impl.audio.e g;
    private static com.alibaba.ability.impl.audio.f h;
    private static String i;
    private static WeakReference<k> j;
    private static n k;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.ability.impl.audio.e f1840a;
    private n b;
    private WeakReference<k> c;
    private String d;
    private AudioFloatWindow e;
    private boolean f;

    /* loaded from: classes2.dex */
    public static final class c implements AudioFloatWindow.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow.a
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            } else if (i == 0) {
                n b = AudioService.b(AudioService.this);
                if (b == null) {
                    return;
                }
                b.e();
            } else if (i == 1) {
                n b2 = AudioService.b(AudioService.this);
                if (b2 == null) {
                    return;
                }
                b2.f();
            } else if (i == 2) {
                AudioService.this.stopSelf();
            } else if (i != 3) {
            } else {
                AudioService.a(AudioService.this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements bc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ n b;

        public e(n nVar) {
            this.b = nVar;
        }

        @Override // com.taobao.avplayer.bc
        public final void onSeekCompletion(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5db52709", new Object[]{this, new Integer(i)});
            } else {
                AudioService.a(AudioService.this, new AudioService$setupPlayer$3$2(this, i));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AudioService audioService, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class d<T extends com.taobao.phenix.intf.event.d> implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f1843a;
        public final /* synthetic */ n b;

        public d(i iVar, n nVar) {
            this.f1843a = iVar;
            this.b = nVar;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public final boolean a(SuccPhenixEvent event) {
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, event})).booleanValue();
            }
            Bitmap bitmap = (event == null || (drawable = event.getDrawable()) == null) ? null : drawable.getBitmap();
            q.b(event, "event");
            if (!event.isIntermediate()) {
                this.b.a(bitmap);
            }
            return true;
        }
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : i;
    }

    public static final /* synthetic */ void a(AudioService audioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a15658", new Object[]{audioService});
        } else {
            audioService.e();
        }
    }

    public static final /* synthetic */ void a(AudioService audioService, ruw ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2935b4", new Object[]{audioService, ruwVar});
        } else {
            audioService.a(ruwVar);
        }
    }

    public static final /* synthetic */ void a(AudioService audioService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328a277c", new Object[]{audioService, new Boolean(z)});
        } else {
            audioService.a(z);
        }
    }

    public static final /* synthetic */ void a(com.alibaba.ability.impl.audio.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa422994", new Object[]{eVar});
        } else {
            g = eVar;
        }
    }

    public static final /* synthetic */ void a(com.alibaba.ability.impl.audio.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa429df3", new Object[]{fVar});
        } else {
            h = fVar;
        }
    }

    public static final /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            i = str;
        }
    }

    public static final /* synthetic */ void a(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{weakReference});
        } else {
            j = weakReference;
        }
    }

    public static final /* synthetic */ com.alibaba.ability.impl.audio.e b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.ability.impl.audio.e) ipChange.ipc$dispatch("dbcac9b9", new Object[0]) : g;
    }

    public static final /* synthetic */ n b(AudioService audioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("1d162780", new Object[]{audioService}) : audioService.b;
    }

    public static final /* synthetic */ com.alibaba.ability.impl.audio.f c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.ability.impl.audio.f) ipChange.ipc$dispatch("3d1d6677", new Object[0]) : h;
    }

    public static final /* synthetic */ n d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("768ecef4", new Object[0]) : k;
    }

    private final void b(com.alibaba.ability.impl.audio.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34320d5", new Object[]{this, eVar});
            return;
        }
        i iVar = eVar.c;
        n nVar = this.b;
        if (nVar != null) {
            nVar.g();
            nVar.m();
            this.b = null;
        }
        this.f = amh.a(this.d);
        n.b d2 = new bl.a(getApplicationContext()).o(true).p(true).d("MegaBackgroundAudioService");
        n b2 = d2.f("MegaBGAudio_" + this.d).c(new HashMap<>(0)).q(this.f).b();
        this.b = b2;
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = hashMap;
        hashMap2.put("title", iVar.b);
        hashMap2.put("subtitle", iVar.c);
        t tVar = t.INSTANCE;
        b2.d(hashMap);
        b2.a(iVar.f1867a);
        b2.d(eVar.f1851a);
        b2.a(eVar.b);
        b2.a(new e(b2));
        b2.a(new f(b2));
        b2.a(new g());
        this.b = b2;
        k = b2;
        b2.c();
        try {
            com.taobao.phenix.intf.b.h().a(iVar.d).succListener(new d(iVar, b2)).fetch();
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements aw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ n b;

        @Override // com.taobao.avplayer.aw
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            }
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        public f(n nVar) {
            this.b = nVar;
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            AudioService.a(AudioService.this, AudioService$setupPlayer$4$onVideoStart$2.INSTANCE);
            com.alibaba.ability.impl.audio.f c = AudioService.c();
            n instance = this.b;
            q.b(instance, "instance");
            c.a(instance);
            AudioService.a(AudioService.this, true);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                return;
            }
            AudioService.a(AudioService.this, new AudioService$setupPlayer$4$onVideoPause$2(z));
            AudioService.a(AudioService.this, false);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            AudioService.a(AudioService.this, AudioService$setupPlayer$4$onVideoPlay$2.INSTANCE);
            AudioService.a(AudioService.this, true);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            String str = "code: " + i + ", p2: " + i2 + ", p0: " + obj;
            TLog.loge(amg.MODULE_NAME, "BackgroundAudioService", "onVideoError:" + str);
            AudioService.a(AudioService.this, new AudioService$setupPlayer$4$onVideoError$1(str));
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            AudioService.a(AudioService.this, AudioService$setupPlayer$4$onVideoComplete$2.INSTANCE);
            AudioService.a(AudioService.this, false);
        }

        @Override // com.taobao.avplayer.aw
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                AudioService.a(AudioService.this, new AudioService$setupPlayer$4$onVideoProgressChanged$2(i, i3, i2));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements an {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.avplayer.an
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                AudioService.a(AudioService.this, AudioService$setupPlayer$5$onSkipToNext$1.INSTANCE);
            }
        }

        @Override // com.taobao.avplayer.an
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                AudioService.a(AudioService.this, AudioService$setupPlayer$5$onSkipToPrevious$1.INSTANCE);
            }
        }

        @Override // com.taobao.avplayer.an
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                AudioService.a(AudioService.this);
            }
        }

        @Override // com.taobao.avplayer.an
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                AudioService.this.stopSelf();
            }
        }
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        AudioFloatWindow audioFloatWindow = this.e;
        if (audioFloatWindow == null) {
            return;
        }
        if (z) {
            audioFloatWindow.play();
        } else {
            audioFloatWindow.pause();
        }
    }

    private final void e() {
        Map<?, ?> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.alibaba.ability.impl.audio.e eVar = this.f1840a;
        if (eVar == null || (map = eVar.d) == null || (obj = map.get("url")) == null) {
            return;
        }
        try {
            Uri.Builder buildUpon = Uri.parse(obj.toString()).buildUpon();
            q.b(buildUpon, "Uri.parse(urlStr).buildUpon()");
            buildUpon.appendQueryParameter("from", "MegaBGAudio");
            Intent intentForUri = Nav.from(this).intentForUri(buildUpon.build());
            if (intentForUri == null) {
                return;
            }
            intentForUri.addFlags(268435456);
            intentForUri.addFlags(4194304);
            intentForUri.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
            startActivity(intentForUri);
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | Exception unused) {
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        String str;
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i2), new Integer(i3)})).intValue();
        }
        if (intent == null) {
            stopSelf();
            return 2;
        }
        if (intent.hasExtra("control_action_type") && this.f1840a != null) {
            int intExtra = intent.getIntExtra("control_action_type", -1);
            if (intExtra == 1) {
                n nVar2 = this.b;
                if (nVar2 != null) {
                    nVar2.f();
                }
            } else if (intExtra == 2) {
                n nVar3 = this.b;
                if (nVar3 != null) {
                    nVar3.e();
                }
            } else if (intExtra == 3) {
                stopSelf();
            } else if (intExtra == 4 && (nVar = this.b) != null) {
                nVar.e(intent.getIntExtra("seek_position", 0));
            }
        } else {
            com.alibaba.ability.impl.audio.e eVar = g;
            String str2 = i;
            WeakReference<k> weakReference = j;
            if (eVar != null) {
                if (this.f1840a != null && (str = this.d) != null && (!q.a((Object) str, (Object) str2))) {
                    a(str, "stop");
                    a(AudioService$onStartCommand$1$1$1$2.INSTANCE);
                }
                this.f1840a = eVar;
                this.c = weakReference;
                this.d = str2;
                b(eVar);
                if (str2 != null) {
                    a(str2, "start");
                }
                c(eVar);
            } else {
                stopSelf();
            }
        }
        return 2;
    }

    private final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!this.f) {
        } else {
            Intent intent = new Intent("com.taobao.taobao.mega.BACKGROUND_SERVICE");
            intent.putExtra("bizID", str);
            intent.putExtra("status", str2);
            LocalBroadcastManager.getInstance(this).sendBroadcastSync(intent);
        }
    }

    private final void c(com.alibaba.ability.impl.audio.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c441816", new Object[]{this, eVar});
        } else if (!amh.a()) {
        } else {
            AudioFloatWindow audioFloatWindow = this.e;
            if (audioFloatWindow == null) {
                audioFloatWindow = new AudioFloatWindow(this, new c(), null, 0, 12, null);
                this.e = audioFloatWindow;
            }
            audioFloatWindow.play(eVar);
            com.alibaba.ability.impl.audio.floatwindow.b.Companion.a().a(this, audioFloatWindow);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        q.d(intent, "intent");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        n nVar = this.b;
        if (nVar != null) {
            nVar.g();
            nVar.m();
            this.b = null;
        }
        String str = this.d;
        if (str != null) {
            a(str, "stop");
        }
        a(AudioService$onDestroy$4.INSTANCE);
        k = null;
        g = null;
        i = null;
        AudioFloatWindow audioFloatWindow = this.e;
        if (audioFloatWindow != null) {
            com.alibaba.ability.impl.audio.floatwindow.b.Companion.a().b(this, audioFloatWindow);
        }
        super.onDestroy();
    }

    private final void a(ruw<? super k, ? super i, t> ruwVar) {
        k it;
        com.alibaba.ability.impl.audio.e eVar;
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, ruwVar});
            return;
        }
        WeakReference<k> weakReference = this.c;
        if (weakReference == null || (it = weakReference.get()) == null || (eVar = this.f1840a) == null || (iVar = eVar.c) == null) {
            return;
        }
        q.b(it, "it");
        ruwVar.mo2423invoke(it, iVar);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.alibaba.ability.impl.audio.f f1841a;
        private k b;
        private final String c;

        static {
            kge.a(-86471410);
        }

        public a(String bizId) {
            q.d(bizId, "bizId");
            this.c = bizId;
            this.f1841a = new com.alibaba.ability.impl.audio.f();
        }

        public static /* synthetic */ void a(a aVar, Context context, int i, Bundle bundle, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d798741", new Object[]{aVar, context, new Integer(i), bundle, new Integer(i2), obj});
                return;
            }
            if ((i2 & 4) != 0) {
                bundle = null;
            }
            aVar.a(context, i, bundle);
        }

        private final void a(Context context, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1350951", new Object[]{this, context, new Integer(i), bundle});
            } else if (!q.a((Object) this.c, (Object) AudioService.a())) {
                k kVar = this.b;
                if (kVar == null) {
                    return;
                }
                if (AudioService.a() == null) {
                    kVar.a("noPlayingAudio", "当前页面没有正在播放的音频");
                } else {
                    kVar.a("controlForbidden", "不支持操作非当前业务播放的后台音频");
                }
            } else if (i == 3) {
                context.stopService(new Intent(context, AudioService.class));
            } else {
                Intent intent = new Intent(context, AudioService.class);
                if (bundle != null) {
                    intent.replaceExtras(bundle);
                }
                intent.putExtra("control_action_type", i);
                t tVar = t.INSTANCE;
                context.startService(intent);
            }
        }

        public final void a(k listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa44e3ce", new Object[]{this, listener});
                return;
            }
            q.d(listener, "listener");
            this.b = listener;
            if (!q.a((Object) this.c, (Object) AudioService.a())) {
                return;
            }
            AudioService.a(new WeakReference(listener));
        }

        public final void a(Context ctx, com.alibaba.ability.impl.audio.e params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29ef238c", new Object[]{this, ctx, params});
                return;
            }
            q.d(ctx, "ctx");
            q.d(params, "params");
            AudioService.a(params);
            AudioService.a(this.c);
            AudioService.a(new WeakReference(this.b));
            AudioService.a(this.f1841a);
            ctx.startService(new Intent(ctx, AudioService.class));
        }

        public final void a(Context ctx) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, ctx});
                return;
            }
            q.d(ctx, "ctx");
            a(this, ctx, 1, null, 4, null);
        }

        public final void b(Context ctx) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{this, ctx});
                return;
            }
            q.d(ctx, "ctx");
            a(this, ctx, 2, null, 4, null);
        }

        public final void c(Context ctx) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, ctx});
                return;
            }
            q.d(ctx, "ctx");
            a(this, ctx, 3, null, 4, null);
        }

        public final void a(Context ctx, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("258f9aa3", new Object[]{this, ctx, new Integer(i)});
                return;
            }
            q.d(ctx, "ctx");
            Bundle bundle = new Bundle();
            bundle.putInt("seek_position", i);
            t tVar = t.INSTANCE;
            a(ctx, 4, bundle);
        }

        public final void a(com.alibaba.ability.impl.audio.g propCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa431252", new Object[]{this, propCallback});
                return;
            }
            q.d(propCallback, "propCallback");
            if (q.a((Object) this.c, (Object) AudioService.a())) {
                propCallback.a(AudioService.c());
            } else {
                propCallback.a(this.f1841a);
            }
        }

        public final void a(Map<String, ? extends Object> properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, properties});
                return;
            }
            q.d(properties, "properties");
            this.f1841a.a(properties);
            if (!q.a((Object) this.c, (Object) AudioService.a())) {
                return;
            }
            n d = AudioService.d();
            if (d != null) {
                this.f1841a.a(d);
            }
            AudioService.a(this.f1841a);
        }

        public final void a(j callback) {
            i iVar;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa446f6f", new Object[]{this, callback});
                return;
            }
            q.d(callback, "callback");
            if (!q.a((Object) this.c, (Object) AudioService.a())) {
                callback.a(null);
            }
            com.alibaba.ability.impl.audio.e b = AudioService.b();
            if (b != null && (iVar = b.c) != null) {
                h hVar = new h();
                hVar.b = iVar;
                n d = AudioService.d();
                if (d != null && d.i() == 1) {
                    z = true;
                }
                l lVar = new l(z);
                n d2 = AudioService.d();
                long j = 0;
                lVar.b = d2 != null ? d2.j() : 0L;
                n d3 = AudioService.d();
                if (d3 != null) {
                    j = d3.q();
                }
                lVar.d = j;
                t tVar = t.INSTANCE;
                hVar.f1866a = lVar;
                t tVar2 = t.INSTANCE;
                callback.a(hVar);
                return;
            }
            callback.a(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        static {
            kge.a(1401954025);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    static {
        kge.a(1081940193);
        Companion = new b(null);
        h = new com.alibaba.ability.impl.audio.f();
    }
}
