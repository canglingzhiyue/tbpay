package com.taobao.android.diagnose.scene.engine.action;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.func.ToolConfigManager;
import tb.fmx;
import tb.fmy;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-96291715);
    }

    @Override // tb.fmu
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : a.ACTION_TOOL_CONFIG;
    }

    public c(int i, String str, int i2) {
        super(i, str, i2);
    }

    @Override // tb.fmu
    public void a(fmx fmxVar, fmy fmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c0f245", new Object[]{this, fmxVar, fmyVar});
        } else if (TextUtils.isEmpty(this.c)) {
        } else {
            ToolConfigManager.a(fmyVar.a(), fmyVar.b(), this.c);
        }
    }
}
