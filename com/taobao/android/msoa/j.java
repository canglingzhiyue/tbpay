package com.taobao.android.msoa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class j implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f14436a;
    private o b;
    private Object c;

    public j(String str, o oVar) {
        this.f14436a = str;
        this.b = oVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            return;
        }
        this.c = iBinder;
        o oVar = this.b;
        if (oVar == null) {
            return;
        }
        oVar.a(this.f14436a, this.c);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            return;
        }
        this.c = null;
        o oVar = this.b;
        if (oVar == null) {
            return;
        }
        oVar.a(this.f14436a, this.c);
    }
}
