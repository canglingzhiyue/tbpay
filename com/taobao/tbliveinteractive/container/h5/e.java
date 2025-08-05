package com.taobao.tbliveinteractive.container.h5;

import android.os.AsyncTask;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.pmd;
import tb.qne;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f22122a;
    private String b;
    private String c;
    private long d = System.nanoTime();

    static {
        kge.a(-664599369);
    }

    public static /* synthetic */ WVCallBackContext a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("2c39bda5", new Object[]{eVar}) : eVar.f22122a;
    }

    public e(String str, String str2, WVCallBackContext wVCallBackContext) {
        this.f22122a = wVCallBackContext;
        this.b = str;
        this.c = str2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        e.a(e.this).success();
                    }
                }
            });
        }
    }

    public void a(final r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec7f67e", new Object[]{this, rVar});
        } else {
            a(new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        e.a(e.this).success(rVar);
                    }
                }
            });
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        if (TextUtils.isEmpty(str)) {
                            e.a(e.this).success();
                            return;
                        }
                        r rVar = new r();
                        try {
                            rVar.a(new JSONObject(str));
                            e.a(e.this).success(rVar);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        e.a(e.this).error();
                    }
                }
            });
        }
    }

    public void b(final r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb68217f", new Object[]{this, rVar});
        } else {
            a(new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.e.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        e.a(e.this).error(rVar);
                    }
                }
            });
        }
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.e.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        if (TextUtils.isEmpty(str)) {
                            e.a(e.this).error();
                            return;
                        }
                        r rVar = new r();
                        try {
                            rVar.a(new JSONObject(str));
                            e.a(e.this).error(rVar);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null || pmd.a().u() == null || pmd.a().u().c() == null) {
        } else {
            if (qne.a(pmd.a().u().c())) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    AsyncTask.execute(runnable);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
            runnable.run();
        }
    }
}
