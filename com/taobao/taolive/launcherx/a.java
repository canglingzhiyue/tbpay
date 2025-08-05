package com.taobao.taolive.launcherx;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f21430a;
    private static final AtomicBoolean b;

    static {
        kge.a(1315742374);
        f21430a = new AtomicBoolean(false);
        b = new AtomicBoolean(false);
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_dx_preload", "liveDXPreloadEnable", "true"));
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_dx_preload", "channelDXPreloadEnable", "true"));
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_dx_preload", "enableTaoLiveGoodsPreload", "true"));
    }

    public static void a() {
        if (!c()) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "liveDXPreload, orange upgrade! ");
        } else if (f21430a.compareAndSet(false, true)) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "liveDXPreload, running! ");
            try {
                Class<?> cls = Class.forName("com.taobao.taolive.room.dx.b");
                cls.getMethod("init", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), com.taobao.appbundle.c.Companion.a().a());
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "liveDXPreload, success! ");
            } catch (Throwable th) {
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "liveDXPreload, error: " + th.getMessage());
            }
        } else {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "liveDXPreload, done! ");
        }
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else if (!e()) {
        } else {
            Coordinator.execute(new b(application));
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else if (!d()) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "channelImagePreload, orange upgrade! ");
        } else if (b.compareAndSet(false, true)) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "channelImagePreload, running! ");
            try {
                new c().a(application);
            } catch (Throwable th) {
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "channelImagePreload, error: " + th.getMessage());
            }
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "channelImagePreload success! ");
        } else {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "TaoLiveDXPreloadX", "channelImagePreload, done! ");
        }
    }
}
