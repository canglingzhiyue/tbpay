package com.taobao.downloader;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import java.lang.reflect.Method;
import java.util.ArrayList;
import tb.klk;
import tb.kll;
import tb.klm;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmr;
import tb.kmt;
import tb.kmv;
import tb.kmx;
import tb.kmz;
import tb.knb;
import tb.knf;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f17078a;
    private Class<?> b;

    private b() {
        Method declaredMethod;
        try {
            this.b = Class.forName("com.taobao.downloader.TbDownloader");
            if (this.b != null && (declaredMethod = this.b.getDeclaredMethod("initDownLoad", new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (a.j == null) {
            a.j = new klk();
        }
        if (a.i == null) {
            a.i = new klm();
        }
        if (a.h == null) {
            a.h = new kll();
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8a4b6c3e", new Object[0]);
        }
        if (f17078a == null) {
            synchronized (b.class) {
                if (f17078a == null) {
                    f17078a = new b();
                }
            }
        }
        return f17078a;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
            kmv.d(DXMonitorConstant.DX_MONITOR_DOWNLOADER, "init", "context is null");
        } else {
            a.c = context.getApplicationContext();
        }
    }

    public int a(kmm kmmVar, kml kmlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1f61986", new Object[]{this, kmmVar, kmlVar})).intValue() : a(kmmVar, kmlVar, (Handler) null);
    }

    public int a(kmm kmmVar, kml kmlVar, Handler handler) {
        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, "download", "start download");
        if (a.c == null) {
            try {
                a.c = ((Application) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            } catch (Exception unused) {
                return -100;
            }
        }
        if (kmmVar != null && TextUtils.isEmpty(kmmVar.b.h) && a.h != null) {
            kmmVar.b.h = a.h.a();
        }
        if (kmmVar == null || !kmmVar.a()) {
            if (kmlVar != null) {
                kmlVar.onFinish(false);
            }
            knb.a("add", "paramerror", null, null);
            return -100;
        }
        if (a.g != null) {
            int a2 = a.g.a(kmmVar.b);
            if (a2 >= 20) {
                a2 = Math.max(a2, a.g.a(kmmVar.f30166a));
            }
            if (a.r.contains(kmmVar.b.f30169a) && kmmVar.b.c == 41) {
                kmmVar.b.c = Math.max(a2, 41);
            } else {
                kmmVar.b.c = a2;
            }
        }
        kmt kmtVar = new kmt();
        kmtVar.b = kmz.a();
        kmv.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, "download", "assign taskId", Integer.valueOf(kmtVar.b));
        kmtVar.c = kmmVar.b;
        kmtVar.e = kmmVar.f30166a;
        kmtVar.d = new knf(kmmVar, kmlVar, handler);
        ArrayList arrayList = new ArrayList();
        for (kmo kmoVar : kmmVar.f30166a) {
            kmr kmrVar = new kmr();
            kmrVar.e = kmoVar;
            kmrVar.f = kmmVar.b;
            kmrVar.g = kmmVar.b.h;
            if (a.v) {
                kmrVar.i = a.u && a.r.contains(kmrVar.f.f30169a);
            } else {
                kmrVar.i = kmoVar.b >= a.t && a.u && a.r.contains(kmrVar.f.f30169a);
            }
            arrayList.add(kmrVar);
        }
        a.i.addTask(arrayList, kmtVar);
        return kmtVar.b;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a.i.modifyTask(i, 2);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            a.i.modifyTask(i, 1);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            a.i.modifyTask(i, 0);
        }
    }

    public int a(String str, String str2, kml kmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31d06055", new Object[]{this, str, str2, kmlVar})).intValue();
        }
        kmm kmmVar = a.l == null ? new kmm(str) : a.l.a(str);
        if (!TextUtils.isEmpty(str2)) {
            kmmVar.b.f30169a = str2;
        }
        return a(kmmVar, kmlVar);
    }

    public String a(String str, kmo kmoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("855d1f0b", new Object[]{this, str, kmoVar}) : kmx.a(str, kmoVar);
    }
}
