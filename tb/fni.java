package tb;

import android.content.Context;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.d;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes5.dex */
public class fni implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<DinamicTemplate> f28074a;
    public String b;
    public Context c;

    static {
        kge.a(167339978);
        kge.a(-1390502639);
    }

    public fni(Context context, String str, List<DinamicTemplate> list) {
        this.f28074a = list;
        this.b = str;
        this.c = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
            a(new fpz(this.c));
        } catch (Throwable th) {
            b.a("dinamicx", null, DXMonitorConstant.DX_MONITOR_ASYNC_RENDER, DXMonitorConstant.PRE_RENDER_2_0_CRASH, s.V2_PRE_RENDER_CRASH, a.a(th));
        }
    }

    private void a(fpz fpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e905fbe8", new Object[]{this, fpzVar});
            return;
        }
        List<DinamicTemplate> list = this.f28074a;
        if (list == null) {
            return;
        }
        for (DinamicTemplate dinamicTemplate : list) {
            DXTemplateItem dXTemplateItem = null;
            com.taobao.android.dinamic.view.b a2 = d.a(this.b).a(fpzVar, (ViewGroup) null, dinamicTemplate);
            if (a2.c()) {
                fux.a("DinamicX", "DinamicX", "asyncCreateTemplateView success:" + dinamicTemplate.name);
                fpy.a().a(a2, dinamicTemplate, this.b);
            } else {
                String b = a2.b().b();
                fux.a("DinamicX", "DinamicX", "asyncCreateTemplateView fail:\n" + b);
                if (StringUtils.isEmpty(b) || (!b.contains(com.taobao.android.dinamic.view.a.ERROR_CODE_TEMPLATE_FILE_LOST) && !b.contains(com.taobao.android.dinamic.view.a.ERROR_CODE_TEMPLATE_NOT_FOUND))) {
                    if (dinamicTemplate != null) {
                        dXTemplateItem = a(dinamicTemplate);
                    }
                    String str = this.b;
                    b.a(str, dXTemplateItem, DXMonitorConstant.DX_MONITOR_ASYNC_RENDER, DXMonitorConstant.PRE_RENDER_2_0_FAIL, s.V2_PRE_RENDER_FAIL, "asyncCreateTemplateView fail" + a2.b().b());
                }
            }
        }
    }

    private DXTemplateItem a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("2dc74c8d", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        try {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = dinamicTemplate.name;
            if (!StringUtils.isEmpty(dinamicTemplate.version)) {
                dXTemplateItem.b = Long.parseLong(dinamicTemplate.version);
            } else {
                dXTemplateItem.b = -1L;
            }
            dXTemplateItem.c = dinamicTemplate.templateUrl;
            return dXTemplateItem;
        } catch (Throwable unused) {
            return null;
        }
    }
}
