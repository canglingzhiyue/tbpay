package com.taobao.android.miniLive.smallwindow;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.HashMap;
import java.util.Map;
import tb.hue;
import tb.kge;
import tb.pmd;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14374a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private long j;
    private Runnable k = new Runnable() { // from class: com.taobao.android.miniLive.smallwindow.e.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.a(e.this);
            }
        }
    };
    private Handler l = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7877725", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    static {
        kge.a(1481759495);
        f14374a = e.class.getSimpleName();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        this.i = str;
        a(c(), "MiniWatch_Display");
        this.j = System.currentTimeMillis();
        this.l.removeCallbacks(this.k);
        this.l.postDelayed(this.k, 1000L);
    }

    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
            return;
        }
        String str = "close";
        if (iMediaPlayer != null) {
            if (!iMediaPlayer.x()) {
                str = "open";
            }
            this.i = str;
        } else {
            this.i = str;
        }
        b(c(), "MiniWatch_Click");
    }

    public void b(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e8cb9f", new Object[]{this, iMediaPlayer});
            return;
        }
        String str = "close";
        if (iMediaPlayer != null) {
            if (!iMediaPlayer.x()) {
                str = "open";
            }
            this.i = str;
        } else {
            this.i = str;
        }
        b(c(), "MiniWatch_Close");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z ? "close" : "open";
        b(c(), z ? "MiniWatch_VoiceClose" : "MiniWatch_VoiceOpen");
        b();
    }

    public void c(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
            return;
        }
        String str = "close";
        if (iMediaPlayer != null) {
            if (!iMediaPlayer.x()) {
                str = "open";
            }
            this.i = str;
        } else {
            this.i = str;
        }
        b(c(), "MiniWatch_QuickClose");
    }

    public void d(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daff0721", new Object[]{this, iMediaPlayer});
            return;
        }
        String str = "close";
        if (iMediaPlayer != null) {
            if (!iMediaPlayer.x()) {
                str = "open";
            }
            this.i = str;
        } else {
            this.i = str;
        }
        b(c(), "MiniWatch_HItFatigueRule");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        this.l.removeCallbacks(this.k);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l.removeCallbacks(this.k);
        this.l.postDelayed(this.k, 60000L);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.j;
        this.j = currentTimeMillis;
        Map<String, String> c = c();
        c.put("duration_time", String.valueOf(j));
        a(c, "MiniWatch_Recordtime");
    }

    private Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("interact_type", this.b);
        hashMap.put("voice_status", this.i);
        hashMap.put("instance_playid", this.c);
        hashMap.put("feed_id", this.d);
        hashMap.put("account_id", this.e);
        hashMap.put("livesource", this.f);
        hashMap.put(ag.KEY_LIVE_STATUS, this.g);
        hashMap.put("entryLiveSource", this.h);
        return hashMap;
    }

    private void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
            return;
        }
        String str2 = f14374a;
        hue.b(str2, "trackShow arg1 = " + str + " params" + map);
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().b("Page_TaobaoLiveWatch", str, map);
    }

    private void b(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39066b46", new Object[]{this, map, str});
            return;
        }
        String str2 = f14374a;
        hue.a(str2, "trackClick arg1 = " + str + " params" + map);
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a("Page_TaobaoLiveWatch", str, map);
    }
}
