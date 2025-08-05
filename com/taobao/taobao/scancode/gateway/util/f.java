package com.taobao.taobao.scancode.gateway.util;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.barcode.util.a;
import com.taobao.taobao.scancode.v2.result.MaResult;
import tb.css;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a f;
    public css i;

    static {
        kge.a(734766001);
    }

    public f(m mVar, FragmentActivity fragmentActivity, Intent intent, boolean z, css cssVar) {
        super(mVar, fragmentActivity, intent, z);
        this.i = cssVar;
        this.f = new a(mVar);
    }

    public boolean d(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69d97cf3", new Object[]{this, maResult})).booleanValue();
        }
        try {
            this.c.putExtra("type", maResult.getType());
            this.c.putExtra("strCode", maResult.getText());
            this.b.startActivity(this.c);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
