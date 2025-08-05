package com.taobao.android.remoteso.log;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.Map;
import tb.ikn;

/* loaded from: classes6.dex */
public class a implements b, ikn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14816a;

    @Override // tb.ikn
    public void a(ikn.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f5d0ef", new Object[]{this, aVar});
        }
    }

    public a(String str) {
        this.f14816a = str;
    }

    @Override // com.taobao.android.remoteso.log.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            Log.e(this.f14816a, str);
        }
    }

    @Override // com.taobao.android.remoteso.log.b
    public void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{this, str, th});
        } else {
            Log.e(this.f14816a, str, th);
        }
    }

    @Override // com.taobao.android.remoteso.log.b
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            Log.e(this.f14816a, str);
        }
    }

    @Override // com.taobao.android.remoteso.log.b
    public void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1040462", new Object[]{this, str, th});
        } else {
            Log.e(this.f14816a, str, th);
        }
    }

    @Override // com.taobao.android.remoteso.log.b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            Log.e(this.f14816a, str);
        }
    }

    @Override // com.taobao.android.remoteso.log.b
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            Log.e(this.f14816a, str);
        }
    }

    @Override // tb.ikn
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("args:");
        sb.append(map != null ? map.toString() : "null");
        c(sb.toString());
    }

    @Override // tb.ikn
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("args:");
        sb.append(map != null ? map.toString() : "null");
        c(sb.toString());
    }

    @Override // tb.ikn
    public void a(String str, Map<String, Object> map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3556ef2", new Object[]{this, str, map, rSoException});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("args:");
        sb.append(map != null ? map.toString() : "null");
        a(sb.toString(), rSoException);
    }
}
