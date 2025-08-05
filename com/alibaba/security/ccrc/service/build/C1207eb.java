package com.alibaba.security.ccrc.service.build;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.eb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1207eb extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcBHService f3301a;

    public C1207eb(CcrcBHService ccrcBHService) {
        this.f3301a = ccrcBHService;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        Object obj = new Object();
        if (intent.hasExtra("feature")) {
            obj = intent.getSerializableExtra("feature");
        }
        CcrcBHService.access$000(this.f3301a, obj);
    }
}
