package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-465930449);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (pmd.a().m() != null) {
            pmd.a().m().a(str, obj);
        } else if (!(obj instanceof String)) {
        } else {
            TLog.loge(pnj.LOG_TAG, str, (String) obj);
        }
    }

    public static void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{str, obj});
        } else if (pmd.a().m() != null) {
            pmd.a().m().c(str, obj);
        } else if (!(obj instanceof String)) {
        } else {
            TLog.logd(pnj.LOG_TAG, str, (String) obj);
        }
    }

    public static void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6a990", new Object[]{str, obj});
        } else if (pmd.a().m() != null) {
            pmd.a().m().e(str, obj);
        } else if (!(obj instanceof String)) {
        } else {
            TLog.logv(pnj.LOG_TAG, str, (String) obj);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            TLog.loge(str, str2, th);
        }
    }
}
