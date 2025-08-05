package com.taobao.android.miniLive.smallwindow;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.hue;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14372a;
    private long b;
    private String c;
    private e e;
    private IMediaPlayer f;
    private Runnable g = new Runnable() { // from class: com.taobao.android.miniLive.smallwindow.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.this.b();
            }
        }
    };
    private Handler d = new Handler(Looper.getMainLooper());

    static {
        kge.a(-350361460);
        f14372a = d.class.getSimpleName();
    }

    public d(String str) {
        this.c = str;
        hue.a(f14372a, "Constructor");
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7877725", new Object[]{this, eVar});
        } else {
            this.e = eVar;
        }
    }

    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
        } else {
            this.f = iMediaPlayer;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        hue.a(f14372a, "onWindowOpen");
        this.b = System.currentTimeMillis();
        this.d.postDelayed(this.g, 5000L);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        hue.a(f14372a, "onNotSecClose");
        ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", 0L);
        ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", 0L);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        hue.a(f14372a, "onWindowDestroy");
        this.d.removeCallbacks(this.g);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        hue.a(f14372a, "onWindowClickClose mTriggerMode = " + this.c);
        if (!ae.b("KEY_ENABLE_SHOW_AUTO", true)) {
            hue.a(f14372a, "onWindowClickClose switch close");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        hue.a(f14372a, "onWindowClickClose diff = " + currentTimeMillis);
        long c = ae.c("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE");
        long c2 = ae.c("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN");
        if (currentTimeMillis < 5000) {
            if ("SideSlip".equals(this.c)) {
                c++;
                ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", c);
                hue.a(f14372a, "onWindowClickClose SideSlip sec close count = " + c);
                e eVar = this.e;
                if (eVar != null) {
                    eVar.c(this.f);
                }
            } else if ("KeyBackDown".equals(this.c)) {
                c2++;
                ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", c2);
                hue.a(f14372a, "onWindowClickClose KeyBackDown sec close count = " + c2);
                e eVar2 = this.e;
                if (eVar2 != null) {
                    eVar2.c(this.f);
                }
            }
        } else if ("SideSlip".equals(this.c) || "KeyBackDown".equals(this.c)) {
            hue.a(f14372a, "onWindowClickClose not sec close");
            ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", 0L);
            ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", 0L);
            c = 0;
            c2 = 0;
        }
        hue.a(f14372a, "onWindowClickClose final KeyBackDown sec close count = " + c2);
        hue.a(f14372a, "onWindowClickClose final SideSlip sec close count = " + c);
        if (c <= 2 && c2 <= 2) {
            return false;
        }
        hue.a(f14372a, "onWindowClickClose sec close = 3 close switch ");
        ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_SIDE_SLIDE", 0L);
        ae.a("KEY_WINDOW_SEC_CLOSE_COUNT_KEY_BACK_DOWN", 0L);
        ae.a("KEY_ENABLE_SHOW_AUTO", false);
        return true;
    }
}
