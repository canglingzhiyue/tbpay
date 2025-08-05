package com.taobao.android.layoutmanager.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.oeb;

/* loaded from: classes5.dex */
public class f implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f13118a = "TNode";
    private boolean b = oeb.a("enableRVLog", true);

    static {
        kge.a(-582516645);
        kge.a(2084078247);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.k
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (this.b) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.k
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (this.b) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.k
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (this.b) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.k
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (this.b) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.k
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else if (this.b) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, "error： " + str2);
        }
    }
}
