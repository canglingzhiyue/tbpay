package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TTraceLog;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes.dex */
public class AliLogImp implements AliLogInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AliLogImp f8600a = new AliLogImp();

    private AliLogImp() {
    }

    public static AliLogImp getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliLogImp) ipChange.ipc$dispatch("e5ec300", new Object[0]) : f8600a;
    }

    @Override // com.taobao.android.AliLogInterface
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logd(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logw(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            TLog.logd(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else {
            TLog.logi(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{this, str, str2, str3});
        } else {
            TLog.logw(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc3689", new Object[]{this, str, str2, str3});
        } else {
            TLog.loge(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliLogInterface
    public void a(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28d9ec5", new Object[]{this, str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else {
            TTraceLog.event(str, str2, str3, str4, j, str5, str6, str7, i, str8, str9);
        }
    }
}
