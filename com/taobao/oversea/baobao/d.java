package com.taobao.oversea.baobao;

import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.baobao.view.BaobaoProgress;
import com.taobao.oversea.baobao.view.DXProgress;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static d f18627a;
    private static long c;
    private Map<String, WeakReference<BaobaoProgress>> b = new HashMap();

    public static /* synthetic */ void lambda$R1hPd5iqbphs8FuczhQ_9W6j4GM(d dVar, Map map) {
        dVar.b(map);
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("78faea3d", new Object[0]);
        }
        if (f18627a == null) {
            f18627a = new d();
        }
        return f18627a;
    }

    private d() {
    }

    public void a(String str, BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3d6ba0", new Object[]{this, str, baobaoProgress});
        } else {
            this.b.put(str, new WeakReference<>(baobaoProgress));
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b.remove(str);
        }
    }

    public void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            c.a().a(new Runnable() { // from class: com.taobao.oversea.baobao.-$$Lambda$d$R1hPd5iqbphs8FuczhQ_9W6j4GM
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$R1hPd5iqbphs8FuczhQ_9W6j4GM(d.this, map);
                }
            });
            Iterator<Map.Entry<String, WeakReference<IWVWebView>>> it = TMGBaobaoBridge.mWebViewMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<IWVWebView>> next = it.next();
                try {
                    if (next.getValue().get() != null) {
                        next.getValue().get().fireEvent("TMGBAOBAO", JSON.toJSONString(map));
                    } else {
                        it.remove();
                    }
                } catch (Exception e) {
                    String str = "update BaobaoProgress exception: " + e.toString();
                    it.remove();
                }
            }
        }
    }

    public /* synthetic */ void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        Iterator<Map.Entry<String, WeakReference<BaobaoProgress>>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<BaobaoProgress>> next = it.next();
            try {
                if (next.getValue().get() != null) {
                    if (DXProgress.class.getName().equals(next.getKey())) {
                        next.getValue().get().update(map);
                    }
                } else {
                    it.remove();
                }
            } catch (Exception e) {
                String str = "update BaobaoProgress exception: " + e.toString();
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (BaobaoManager.a().e() && !this.b.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c <= BaobaoManager.a().f()) {
                return false;
            }
            c = currentTimeMillis;
            for (WeakReference<BaobaoProgress> weakReference : this.b.values()) {
                if (weakReference.get() != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
