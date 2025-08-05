package com.taobao.android.autosize;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes4.dex */
public class e implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TBAutoSizeNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return true;
        }
        if (!l.d(dVar.a()) && !l.b(dVar.a())) {
            return true;
        }
        ComponentName component = intent.getComponent();
        if (!dVar.h() || !(dVar.a() instanceof Activity) || component == null || !component.equals(((Activity) dVar.a()).getComponentName())) {
            return !d.a(dVar.a(), dVar.m(), intent, dVar.f(), false);
        }
        TLog.loge("TBAutoSize.NavProcessor", "Pad mode pae open fail. disallowLoopback=true.");
        return true;
    }
}
