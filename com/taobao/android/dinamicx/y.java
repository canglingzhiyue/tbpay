package com.taobao.android.dinamicx;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.TakePhotoApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.fuw;
import tb.kge;

/* loaded from: classes.dex */
public class y implements ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<WeakReference<a>> f12216a = new ArrayList();
    private final boolean b;

    /* loaded from: classes.dex */
    public interface a {
        void M_();

        String N_();
    }

    static {
        kge.a(-1472447372);
        kge.a(-418195541);
    }

    public y(boolean z) {
        this.b = z;
        if (DinamicXEngine.j()) {
            if (this.b) {
                fuw.d("DXConfigCenter", "全局 LowMemory 上报开");
            } else {
                fuw.d("DXConfigCenter", "全局 LowMemory 上报关");
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        a();
        if (i != 80) {
            return;
        }
        a("TRIM_MEMORY_COMPLETE");
        b();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        a(TakePhotoApi.LOW_MEMORY);
        b();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2b5b36", new Object[]{this, aVar});
        } else if (aVar != null) {
            synchronized (this.f12216a) {
                if (!this.f12216a.isEmpty()) {
                    for (WeakReference<a> weakReference : this.f12216a) {
                        if (weakReference != null && weakReference.get() == aVar) {
                            return;
                        }
                    }
                }
                this.f12216a.add(new WeakReference<>(aVar));
                a();
            }
        }
    }

    public void b(a aVar) {
        DinamicXEngine b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7df7d5", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            synchronized (this.f12216a) {
                Iterator<WeakReference<a>> it = this.f12216a.iterator();
                while (it.hasNext()) {
                    WeakReference<a> next = it.next();
                    if (next != null) {
                        a aVar2 = next.get();
                        if (aVar2 != null && aVar2 != aVar) {
                            if ((aVar instanceof DinamicXEngine) && (aVar2 instanceof DXWidgetNode)) {
                                DXWidgetNode dXWidgetNode = (DXWidgetNode) aVar2;
                                if (dXWidgetNode.getDXRuntimeContext() != null && ((b = dXWidgetNode.getDXRuntimeContext().C().b()) == null || b == aVar)) {
                                    it.remove();
                                }
                            }
                        }
                        it.remove();
                    }
                }
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.f12216a) {
            a(this.f12216a);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        synchronized (this.f12216a) {
            Iterator<WeakReference<a>> it = this.f12216a.iterator();
            while (it.hasNext()) {
                WeakReference<a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    a aVar = next.get();
                    if (aVar == null) {
                        it.remove();
                    } else {
                        aVar.M_();
                    }
                }
            }
        }
        d();
    }

    public <T> void a(List<WeakReference<T>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            Iterator<WeakReference<T>> it = list.iterator();
            while (it.hasNext()) {
                WeakReference<T> next = it.next();
                if (next == null || next.get() == null) {
                    it.remove();
                }
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!DinamicXEngine.j()) {
        } else {
            fuw.d("DXLowMemory", "Before onLowMemory: \n" + e());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!DinamicXEngine.j()) {
        } else {
            fuw.d("DXLowMemory", "After onLowMemory: \n" + e());
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Context i = DinamicXEngine.i();
        if (i == null || !this.b) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("level", str);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) i.getSystemService("activity")).getMemoryInfo(memoryInfo);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.android.diagnose.model.b.AVAIL_MEM, (Object) (((((float) memoryInfo.availMem) / 1024.0f) / 1024.0f) + "M"));
        if (Build.VERSION.SDK_INT >= 16) {
            jSONObject.put(com.taobao.android.diagnose.model.b.TOTAL_MEM, (Object) (((((float) memoryInfo.totalMem) / 1024.0f) / 1024.0f) + "M"));
        }
        jSONObject.put("threshold", (Object) (((((float) memoryInfo.threshold) / 1024.0f) / 1024.0f) + "M"));
        hashMap.put("pss", jSONObject.toJSONString());
        Runtime runtime = Runtime.getRuntime();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("totalMemory", (Object) (((((float) runtime.totalMemory()) / 1024.0f) / 1024.0f) + "M"));
        jSONObject2.put("freeMemory", (Object) (((((float) runtime.freeMemory()) / 1024.0f) / 1024.0f) + "M"));
        jSONObject2.put("maxMemory", (Object) (((((float) runtime.maxMemory()) / 1024.0f) / 1024.0f) + "M"));
        jSONObject2.put("availableProcessors", (Object) Integer.valueOf(runtime.availableProcessors()));
        hashMap.put("jvmHeap", jSONObject2.toJSONString());
        s sVar = new s("dinamicx");
        sVar.c = new ArrayList();
        s.a aVar = new s.a("DX_LowMemory", "DX_LowMemory", s.DX_LOW_MEMORY_MONITOR);
        sVar.c.add(aVar);
        aVar.e = "dx_low_memory";
        aVar.f = hashMap;
        if (DinamicXEngine.j()) {
            fuw.d("DXLowMemoryUpload", JSONObject.toJSONString(aVar.f));
        }
        com.taobao.android.dinamicx.monitor.b.a(sVar);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (WeakReference<a> weakReference : this.f12216a) {
            if (weakReference != null && weakReference.get() != null) {
                String N_ = weakReference.get().N_();
                if (!StringUtils.isEmpty(N_)) {
                    sb.append(N_);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
