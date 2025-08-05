package com.taobao.android.detail.core.aura.broadcast;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dxu;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAliDetailUIRefreshBroadcastReceiver extends AbsAliDetailBroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f9383a;
    public dxu b;
    public AURAGlobalData c;

    static {
        kge.a(1483160027);
    }

    public abstract UMFRuleIO a(Context context, Intent intent);

    public AbsAliDetailUIRefreshBroadcastReceiver(Context context, dxu dxuVar) {
        super(context, dxuVar);
        this.f9383a = context;
        this.b = dxuVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        UMFRuleIO a2 = a(context, intent);
        if (a2 == null) {
            return;
        }
        this.b.a(a2);
    }

    @Override // com.taobao.android.detail.core.aura.broadcast.AbsAliDetailBroadcastReceiver
    public void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{this, aURAGlobalData});
        } else {
            this.c = aURAGlobalData;
        }
    }

    public static void a(Context context, AbsAliDetailUIRefreshBroadcastReceiver absAliDetailUIRefreshBroadcastReceiver, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0e94de", new Object[]{context, absAliDetailUIRefreshBroadcastReceiver, str});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).registerReceiver(absAliDetailUIRefreshBroadcastReceiver, intentFilter);
    }

    public static void a(Context context, AbsAliDetailUIRefreshBroadcastReceiver absAliDetailUIRefreshBroadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5bc814", new Object[]{context, absAliDetailUIRefreshBroadcastReceiver});
        } else {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(absAliDetailUIRefreshBroadcastReceiver);
        }
    }
}
