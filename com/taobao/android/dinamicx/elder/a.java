package com.taobao.android.dinamicx.elder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bl;
import tb.fuw;

/* loaded from: classes.dex */
public class a implements bl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11843a;
    private boolean b;

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dff0b008", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.f11843a = z;
        return z;
    }

    public a(Context context) {
        try {
            LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.elder.DXElderImpl$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    a.a(a.this, com.taobao.android.tbelder.b.c());
                    StringBuilder sb = new StringBuilder();
                    sb.append("收到适老化的广播 isElder: ");
                    a aVar = a.this;
                    sb.append(a.$ipChange);
                    fuw.a("DXElderImpl", sb.toString());
                }
            }, new IntentFilter(com.taobao.android.tbelder.b.ACTION_TBELDER_VALUE_CHANGED));
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.dinamicx.bl
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return this.f11843a;
        }
        this.f11843a = com.taobao.android.tbelder.b.c();
        this.b = true;
        return this.f11843a;
    }
}
