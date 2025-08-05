package com.taobao.android.msoa;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.util.a;
import com.taobao.android.msoa.util.b;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import tb.hum;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "c";
    private static c d;

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<g> f14420a = new LinkedBlockingQueue();
    private Map<String, g> b = new ConcurrentHashMap();
    private Handler c = new Handler(Looper.getMainLooper());

    public static /* synthetic */ BlockingQueue a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("f3cb4707", new Object[]{cVar}) : cVar.f14420a;
    }

    public static /* synthetic */ void a(c cVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed423ea4", new Object[]{cVar, gVar});
        } else {
            cVar.a(gVar);
        }
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd0f1f9", new Object[]{cVar});
        } else {
            cVar.b();
        }
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8d4ed85a", new Object[0]);
        }
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    public void a(h hVar, MSOAServiceListener mSOAServiceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bf70d9", new Object[]{this, hVar, mSOAServiceListener});
        } else if (hVar == null) {
            if (mSOAServiceListener == null) {
                return;
            }
            mSOAServiceListener.onFail("msoa_error_invalid_param", "invalid parameter", false, null);
        } else {
            g a2 = hVar.a();
            if (a2 != null) {
                b.a(a2.b, a2.f);
                b.a(a2);
                b.a(a2.f, (JSONObject) null);
            }
            a(a2, mSOAServiceListener);
        }
    }

    public void a(g gVar, MSOAServiceListener mSOAServiceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d259ba", new Object[]{this, gVar, mSOAServiceListener});
        } else if (gVar == null || TextUtils.isEmpty(gVar.b) || TextUtils.isEmpty(gVar.c) || TextUtils.isEmpty(gVar.d)) {
            if (mSOAServiceListener == null) {
                return;
            }
            mSOAServiceListener.onFail("msoa_error_invalid_param", "invalid parameter", false, null);
        } else {
            b.a(gVar);
            b.a(gVar.f, (JSONObject) null);
            b.a(gVar.b, gVar.c);
            b.a(gVar.b, gVar.f);
            gVar.f14434a = com.taobao.android.msoa.util.d.a(gVar.b);
            gVar.h = System.currentTimeMillis();
            if (mSOAServiceListener != null) {
                mSOAServiceListener = (MSOAServiceListener) Proxy.newProxyInstance(mSOAServiceListener.getClass().getClassLoader(), new Class[]{MSOAServiceListener.class}, new k(mSOAServiceListener, gVar.f14434a));
            }
            gVar.j = mSOAServiceListener;
            com.taobao.android.msoa.util.d.a(gVar.b, gVar.c, gVar.d, gVar.e, gVar.f14434a, null, null, null, "MSOA_RequestService");
            String str = gVar.f14434a + " client requestService";
            if (this.f14420a.offer(gVar)) {
                this.b.put(gVar.f14434a, gVar);
                b();
            } else if (mSOAServiceListener == null) {
            } else {
                mSOAServiceListener.onFail("msoa_error_queue_full", "queue full", false, null);
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.android.msoa.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    g gVar = (g) c.a(c.this).poll();
                    if (gVar == null) {
                        return;
                    }
                    c.a(c.this, gVar);
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c.b(c.this);
                }
            });
        }
    }

    private void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a28396", new Object[]{this, gVar});
        } else if (gVar == null) {
        } else {
            try {
                String str = gVar.f14434a + " client real request";
                ((i) a.a("com.taobao.android.msoa", "com.taobao.android.msoa.MSOAServiceImpl")).requestService(gVar);
            } catch (Exception e) {
                e.printStackTrace();
                a(gVar.f14434a, "msoa_error_execute_fail", "execute service fail", false, null);
            }
        }
    }

    public void a(String str, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        String str2 = str + " client listener success ";
        final g gVar = this.b.get(str);
        if (gVar == null || gVar.j == null) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.taobao.android.msoa.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    gVar.j.onSuccess(map);
                }
            }
        });
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        g remove = this.b.remove(str);
        if (remove != null) {
            remove.i = System.currentTimeMillis();
            com.taobao.android.msoa.util.d.a(remove.b, remove.c, remove.d, remove.e, remove.f14434a, String.valueOf(remove.i - remove.h), null, null, "MSOA_RequestSuccess");
            if (com.taobao.android.msoa.util.c.a() && "2.0".equals(remove.q)) {
                hum.a(remove.d, remove.b, remove.c, remove.m, remove.n, remove.o, remove.p, remove.e, remove.q);
            }
            b(remove);
        }
        b(str);
    }

    public void a(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
        } else {
            a(str, str2, str3, true, map);
        }
    }

    public void b(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10af9e", new Object[]{this, str, str2, str3, map});
        } else {
            a(str, str2, str3, false, map);
        }
    }

    private void a(String str, final String str2, final String str3, final boolean z, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d02a77", new Object[]{this, str, str2, str3, new Boolean(z), map});
            return;
        }
        String str4 = str + " client listener fail " + str2 + " " + str3;
        final g gVar = this.b.get(str);
        if (gVar == null || gVar.j == null) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.taobao.android.msoa.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    gVar.j.onFail(str2, str3, z, map);
                }
            }
        });
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        g remove = this.b.remove(str);
        if (remove != null) {
            remove.i = System.currentTimeMillis();
            com.taobao.android.msoa.util.d.a(remove.b, remove.c, remove.d, remove.e, remove.f14434a, String.valueOf(remove.i - remove.h), str2, str3, "MSOA_RequestFailure");
            if (com.taobao.android.msoa.util.c.a() && "2.0".equals(remove.q)) {
                hum.a(remove.d, remove.b, remove.c, str2, str3, remove.m, remove.n, remove.o, remove.p, remove.e, remove.q);
            }
            b(remove);
        }
        b(str);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            ((i) a.a("com.taobao.android.msoa", "com.taobao.android.msoa.MSOAServiceImpl")).cancelTimeoutTask(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd2c375", new Object[]{this, gVar});
            return;
        }
        try {
            ((i) a.a("com.taobao.android.msoa", "com.taobao.android.msoa.MSOAServiceImpl")).tryUnbindService(gVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
