package com.etao.feimagesearch;

import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.CaptureJSBridge;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import com.etao.feimagesearch.cip.capture.CaptureModule;
import com.etao.feimagesearch.result.IrpJsBridge;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.etao.feimagesearch.videosearch.result.NewIrpMuiseModule;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.tao.Globals;
import kotlin.jvm.JvmStatic;
import tb.cot;
import tb.cri;
import tb.kge;

/* loaded from: classes3.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final j INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f6731a = false;
    private static volatile boolean b = false;
    private static final String c;

    static {
        kge.a(-1901353551);
        INSTANCE = new j();
        c = c;
    }

    private j() {
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            INSTANCE.b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (f6731a) {
        } else {
            try {
                o.a();
            } catch (Throwable unused) {
            }
            f6731a = true;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (b) {
        } else {
            try {
                com.taobao.search.musie.j.a(Globals.getApplication());
                SearchXslSdk.install();
                MUSEngine.registerModule(IrpMuiseModule.NAME, NewIrpMuiseModule.class);
                MUSEngine.registerModule(CaptureModule.NAME, CaptureModule.class);
                cri.a();
                MUSEngine.registerUINode(TBAlbumImg.NODE_NAME, TBAlbumImg.class);
                q.a(IrpJsBridge.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) CaptureJSBridge.class, true);
                b = true;
            } catch (Exception e) {
                cot.a(c, "initPltModule", e);
            }
        }
    }
}
