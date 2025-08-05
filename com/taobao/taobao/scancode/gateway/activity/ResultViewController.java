package com.taobao.taobao.scancode.gateway.activity;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.taobao.R;
import java.util.concurrent.ExecutorService;
import tb.com;
import tb.cot;
import tb.kge;

/* loaded from: classes8.dex */
public class ResultViewController implements LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21250a;
    private SoundPool b;
    private LifecycleOwner c;
    private final ExecutorService d = VExecutors.newSingleThreadExecutor(new h() { // from class: com.taobao.taobao.scancode.gateway.activity.ResultViewController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "scan_sound" + hashCode();
        }
    });

    public static /* synthetic */ LifecycleOwner a(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LifecycleOwner) ipChange.ipc$dispatch("d53ddae5", new Object[]{resultViewController}) : resultViewController.c;
    }

    public static /* synthetic */ void b(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d7189c", new Object[]{resultViewController});
        } else {
            resultViewController.c();
        }
    }

    public static /* synthetic */ SoundPool c(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoundPool) ipChange.ipc$dispatch("ff48c56e", new Object[]{resultViewController}) : resultViewController.b;
    }

    public static /* synthetic */ void d(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02e7f1e", new Object[]{resultViewController});
        } else {
            resultViewController.b();
        }
    }

    static {
        kge.a(-1178469252);
        kge.a(2139684418);
        f21250a = ResultViewController.class.getSimpleName();
    }

    public ResultViewController(Activity activity) {
        if (activity instanceof LifecycleOwner) {
            this.c = (LifecycleOwner) activity;
            ad.c("addObserver", new ac() { // from class: com.taobao.taobao.scancode.gateway.activity.ResultViewController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        ResultViewController.a(ResultViewController.this).getLifecycle().addObserver(ResultViewController.this);
                    }
                }
            });
            this.d.submit(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.activity.ResultViewController.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ResultViewController.b(ResultViewController.this);
                    }
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            this.b = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
            this.b.load(com.b(), R.raw.kakalib_scan, 1);
        } catch (Exception unused) {
            this.b = null;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.submit(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.activity.ResultViewController.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ResultViewController.c(ResultViewController.this) == null) {
                    } else {
                        ResultViewController.c(ResultViewController.this).play(1, 1.0f, 1.0f, 0, 0, 1.0f);
                    }
                }
            });
        }
    }

    public void a(Activity activity, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee40d92b", new Object[]{this, activity, view, new Integer(i)});
        } else if (i == 1) {
            activity.addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } else if (view == null || view.getParent() == null) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.d.submit(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.activity.ResultViewController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ResultViewController.d(ResultViewController.this);
                    }
                }
            });
            this.c.getLifecycle().removeObserver(this);
            cot.c(f21250a, "release removeObserver");
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.b != null) {
                cot.c(f21250a, "prepare do release");
                this.b.release();
                this.b = null;
            }
        } catch (Throwable th) {
            String str = f21250a;
            cot.a("Scan", str, cot.a(str, th));
        }
        try {
            this.d.shutdown();
        } catch (Exception unused) {
        }
    }
}
