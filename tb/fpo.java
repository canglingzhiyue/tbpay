package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.d;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.expressionv2.h;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamic.l;
import com.taobao.android.dinamic.view.a;
import java.util.Map;

/* loaded from: classes5.dex */
public class fpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1520139926);
    }

    public void a(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb350c0", new Object[]{this, view, fpdVar});
            return;
        }
        fpq fpqVar = (fpq) view.getTag(j.PROPERTY_KEY);
        if (fpqVar == null) {
            return;
        }
        Map<String, String> map = fpqVar.d;
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (str2.startsWith("@")) {
                a(view, fpdVar, fpqVar, str, str2);
            } else {
                b(view, fpdVar, fpqVar, str, str2);
            }
        }
    }

    private void b(View view, final fpd fpdVar, final fpq fpqVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32cd2dc", new Object[]{this, view, fpdVar, fpqVar, str, str2});
            return;
        }
        Pair<String, String> a2 = l.a(str2);
        if (a2 == null) {
            fpdVar.c().b().a(a.ERROR_CODE_EVENT_HANDLER_NOT_FOUND, fpqVar.f28098a);
            if (!e.a()) {
                return;
            }
            fpa.b(e.TAG, String.format("事件表达式 %s=%s 解析出错", str, str2));
            return;
        }
        final d c = e.c((String) a2.first);
        if (c == null) {
            fpdVar.c().b().a(a.ERROR_CODE_EVENT_HANDLER_NOT_FOUND, fpqVar.f28098a);
            if (!e.a()) {
                return;
            }
            fpa.b(e.TAG, String.format("%s=%s，没有找到%s对应的DinamicEventHandler", str, str2, a2.first));
            return;
        }
        final Object a3 = fnk.a((String) a2.second, fpqVar.f28098a, fpdVar);
        if (StringUtils.equals(str, "onTap")) {
            view.setOnClickListener(new View.OnClickListener() { // from class: tb.fpo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    long nanoTime = System.nanoTime();
                    try {
                        c.a(view2, fpdVar.b(), a3, fpdVar.e(), fpdVar.d());
                        fpa.a(fpdVar.b(), fpqVar.f28098a, System.nanoTime() - nanoTime);
                    } catch (Throwable th) {
                        fpdVar.c().b().a(a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, fpqVar.f28098a);
                        fpa.b("DinamicEventHandler", th, "handle onclick event failed, handler=", c.getClass().getName());
                        fpa.a(fpdVar.b(), fpqVar.f28098a, System.nanoTime() - nanoTime);
                    }
                }
            });
            try {
                c.a(view, a3, fpdVar.e());
            } catch (Throwable th) {
                fpdVar.c().b().a(a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, fpqVar.f28098a);
                fpa.b("DinamicEventHandler", th, "handler prepareBindEvent failed, handler=", c.getClass().getName());
            }
        } else if (!StringUtils.equals(str, "onLongTap")) {
        } else {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.fpo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                    }
                    long nanoTime = System.nanoTime();
                    try {
                        c.a(view2, fpdVar.b(), a3, fpdVar.e(), fpdVar.d());
                        fpa.a(fpdVar.b(), fpqVar.f28098a, System.nanoTime() - nanoTime);
                    } catch (Throwable th2) {
                        fpdVar.c().b().a(a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, fpqVar.f28098a);
                        fpa.b("DinamicEventHandler", th2, "handle onlongclick event failed, handler=", c.getClass().getName());
                        fpa.a(fpdVar.b(), fpqVar.f28098a, System.nanoTime() - nanoTime);
                    }
                    return true;
                }
            });
            try {
                c.a(view, a3, fpdVar.e());
            } catch (Throwable th2) {
                fpdVar.c().b().a(a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, fpqVar.f28098a);
                fpa.b("DinamicEventHandler", th2, "handler prepareBindEvent failed, handler=", c.getClass().getName());
            }
        }
    }

    public void a(View view, fpd fpdVar, fpq fpqVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b115a57d", new Object[]{this, view, fpdVar, fpqVar, str, str2});
        } else if (StringUtils.equals(str, "onTap")) {
            view.setOnClickListener(new fpp(fpdVar, str2, fpqVar));
            h.a(view, str2, fpdVar, fpqVar);
        } else if (!StringUtils.equals(str, "onLongTap")) {
        } else {
            view.setOnLongClickListener(new fpp(fpdVar, str2, fpqVar));
            h.a(view, str2, fpdVar, fpqVar);
        }
    }

    public static void b(View view, fpd fpdVar, fpq fpqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58942992", new Object[]{view, fpdVar, fpqVar, str});
            return;
        }
        long nanoTime = System.nanoTime();
        try {
            fpdVar.a(view.getTag(j.SUBDATA));
            h.a(view, str, fpdVar);
            fpa.a(fpdVar.b(), fpqVar.f28098a, System.nanoTime() - nanoTime);
        } catch (Throwable unused) {
            fpdVar.c().b().a(a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, fpqVar.f28098a);
            fpa.a(fpdVar.b(), fpqVar.f28098a, System.nanoTime() - nanoTime);
        }
    }
}
