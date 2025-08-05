package com.taobao.android.remoteso.tbadapter.ext;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes6.dex */
public class l implements com.taobao.android.remoteso.log.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14866a;
    private final boolean b;
    private final com.taobao.tao.log.f c = com.taobao.tao.log.f.a();
    private final boolean d;

    public l(String str, boolean z, boolean z2) {
        this.f14866a = str;
        this.b = z;
        this.d = z2;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.d) {
            return false;
        }
        return !this.b || this.c.d() == 0;
    }

    @Override // com.taobao.android.remoteso.log.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = this.f14866a;
        TLog.loge(str2, str2, str);
        if (!a()) {
            return;
        }
        Log.e(this.f14866a, str);
    }

    @Override // com.taobao.android.remoteso.log.b
    public void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{this, str, th});
            return;
        }
        TLog.loge(this.f14866a, str, th);
        if (!a()) {
            return;
        }
        Log.e(this.f14866a, str, th);
    }

    @Override // com.taobao.android.remoteso.log.b
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        String str2 = this.f14866a;
        TLog.loge(str2, str2, str);
        if (!a()) {
            return;
        }
        Log.e(this.f14866a, str);
    }

    @Override // com.taobao.android.remoteso.log.b
    public void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1040462", new Object[]{this, str, th});
            return;
        }
        TLog.loge(this.f14866a, str, th);
        if (!a()) {
            return;
        }
        Log.e(this.f14866a, str, th);
    }

    @Override // com.taobao.android.remoteso.log.b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        String str2 = this.f14866a;
        TLog.loge(str2, str2, str);
        if (!a()) {
            return;
        }
        Log.e(this.f14866a, str);
    }

    @Override // com.taobao.android.remoteso.log.b
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        String str2 = this.f14866a;
        TLog.loge(str2, str2, str);
        if (!a()) {
            return;
        }
        Log.e(this.f14866a, str);
    }
}
