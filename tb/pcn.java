package tb;

import com.alibaba.analytics.core.sync.q;
import com.alibaba.security.realidentity.l1;
import com.alibaba.security.realidentity.l2;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmImpl;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ:\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u001c"}, d2 = {"Lcom/taobao/taolive/lpm_android/api/MediaActionObserver;", "", "()V", "onAudioFocusChange", "", "bizID", "", "iMediaPlayer", "Lcom/taobao/taolive/sdk/ui/media/IMediaPlayer;", q.MSGTYPE_INTERVAL, "", MessageID.onCompletion, "onError", "i1", "onInfo", "l", "", l1.f, l2.f3458a, o.b, "onPauseStart", "onPauseSuccess", "onPlayStart", "onPrepareStart", "onPrepareSuccess", MessageID.onSeekComplete, "onSeekStart", "onStartSuccess", "lpm-android_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes8.dex */
public final class pcn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final void a(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8b7c28", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.a(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void b(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd0ba9", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.b(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void c(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2e9b2a", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.c(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void d(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0802aab", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.d(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void e(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d1ba2c", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.e(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void f(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32349ad", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.f(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void g(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c474d92e", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.g(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void h(String bizID, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c668af", new Object[]{this, bizID, iMediaPlayer});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.h(bizID, iMediaPlayer);
        } catch (Exception unused) {
        }
    }

    public final void a(String bizID, IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ab7288", new Object[]{this, bizID, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.a(bizID, iMediaPlayer, i, i2);
        } catch (Exception unused) {
        }
    }

    public final void a(String bizID, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6241f8", new Object[]{this, bizID, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.a(bizID, iMediaPlayer, j, j2, j3, obj);
        } catch (Exception unused) {
        }
    }

    public final void a(String bizID, IMediaPlayer iMediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e47bdb", new Object[]{this, bizID, iMediaPlayer, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.c(bizID, "bizID");
        try {
            pbt a2 = pbt.a();
            kotlin.jvm.internal.q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().h.a(bizID, iMediaPlayer, i);
        } catch (Exception unused) {
        }
    }
}
