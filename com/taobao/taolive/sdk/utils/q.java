package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2063304085);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
            TLog.logi(MediaConstant.LBLIVE_SOURCE, str, str2);
        } else {
            pmd.a().m().b(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, str, str2);
        } else {
            pmd.a().m().a(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
            TLog.logv(MediaConstant.LBLIVE_SOURCE, str, str2);
        } else {
            pmd.a().m().e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
            TLog.logd(MediaConstant.LBLIVE_SOURCE, str, str2);
        } else {
            pmd.a().m().c(str, str2);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
            TLog.logw(MediaConstant.LBLIVE_SOURCE, str, str2);
        } else {
            pmd.a().m().d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (pmd.a().m() == null) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, str, str2, th);
        } else {
            pmd.a().m().a(str, str2, th);
        }
    }
}
