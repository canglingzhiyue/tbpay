package com.taobao.android.tbuprofen.log;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.f;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2061443379);
    }

    @Override // com.taobao.android.tbuprofen.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c.e("DefaultMonitor", "EVENT_LOAD", new Object[0]);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c.e("DefaultMonitor", "EVENT_LOAD_SUCCESS", new Object[0]);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            c.e("DefaultMonitor", "EVENT_LOAD_ERROR. errCode=%s, errMsg=%s", str, str2);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            c.e("DefaultMonitor", "EVENT_LOAD_PLUGIN. pluginName=%s", str);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            c.e("DefaultMonitor", "EVENT_LOAD_PLUGIN_SUCCESS. pluginName=%s", str);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            c.e("DefaultMonitor", "EVENT_LOAD_PLUGIN_ERROR. pluginName=%s, errCode=%s, errMsg=%s", str, str2, str3);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            c.d("DefaultMonitor", "Mock. mockType=%s", str);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            c.d("DefaultMonitor", "Mock Success. mockType=%s", str);
        }
    }

    @Override // com.taobao.android.tbuprofen.f
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else {
            c.d("DefaultMonitor", "Mock Error. mockType=%s, errCode=%s, errMsg=%s", str, str2, str3);
        }
    }
}
