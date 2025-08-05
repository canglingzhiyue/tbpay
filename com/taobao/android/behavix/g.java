package com.taobao.android.behavix;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.feature.IPVBaseFeature;
import com.taobao.android.behavix.utils.b;
import com.taobao.android.behavix.utils.f;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;
import tb.dsd;
import tb.kge;

/* loaded from: classes.dex */
public class g extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9186a;

    static {
        kge.a(-194617239);
        f9186a = false;
    }

    private g(String str) {
        super(str);
    }

    @Override // com.taobao.android.behavix.utils.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.behavix.behavixswitch.b.a().b();
        BXBRBridge.b();
        JsBridgeBehaviXConfig.initPersistScriptConfig();
        IPVBaseFeature.b();
        if (!a.a("enableCrashReport", true)) {
            return;
        }
        TCrashSDK.instance().addJvmUncaughtCrashListener(new dsd());
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (f9186a && a.a("bxInitOnce", true)) {
        } else {
            f9186a = true;
            f.a().a(new g(str));
        }
    }
}
