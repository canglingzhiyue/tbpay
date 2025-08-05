package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class fwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ggy f28167a;
    private ggy b;
    private Map<String, Object> c = new HashMap();
    private ggy d;

    static {
        kge.a(-1574926859);
    }

    public fwo(boolean z) {
        try {
            this.b = u.g().a().b();
        } catch (Exception unused) {
        }
        if (z) {
            this.d = new ivj();
        }
        this.f28167a = new fwm();
    }

    private DXWidgetNode b(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6ae5a84", new Object[]{this, dXTemplateItem, dXRuntimeContext, context});
        }
        byte[] a2 = a(dXTemplateItem, dXRuntimeContext);
        if (a2 == null) {
            fux.b(" loadNew bytes == null");
            return null;
        }
        return a(a2, dXRuntimeContext, dXTemplateItem, context);
    }

    public byte[] a(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext) {
        List<s.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2365e95b", new Object[]{this, dXTemplateItem, dXRuntimeContext});
        }
        String str = dXTemplateItem.g.f11934a;
        if (TextUtils.isEmpty(str)) {
            fux.b("loadBytes TextUtils.isEmpty(mainBinaryPath)");
            return null;
        }
        byte[] a2 = fwn.a().a(str, dXRuntimeContext);
        if (a2 != null && a2.length != 0) {
            return a2;
        }
        if (dXRuntimeContext != null && dXRuntimeContext.n() != null && (list = dXRuntimeContext.n().c) != null) {
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_TEMPLATE, DXMonitorConstant.DX_MONITOR_TEMPLATE_READ, s.DX_TEMPLATE_LOAD_ERROR);
            if (a2 == null) {
                aVar.e = "DXPackageManager load  bytes == null " + str;
            } else {
                aVar.e = "DXPackageManager load  bytes.len == 0 " + str;
            }
            list.add(aVar);
            fux.b(aVar.e);
        }
        fwj.a().c(dXRuntimeContext.A(), dXTemplateItem);
        StringBuilder sb = new StringBuilder();
        sb.append("removeTemplate ");
        sb.append(dXTemplateItem == null ? "null" : dXTemplateItem.b());
        fux.b(sb.toString());
        return null;
    }

    public DXWidgetNode a(byte[] bArr, DXRuntimeContext dXRuntimeContext, DXTemplateItem dXTemplateItem, Context context) {
        DXWidgetNode a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6f6e36fe", new Object[]{this, bArr, dXRuntimeContext, dXTemplateItem, context});
        }
        if (bArr == null || bArr.length == 0) {
            fux.b(" createTree  bytes == null || bytes.length == 0");
            return null;
        }
        Map<String, String> map = dXTemplateItem.g.b;
        byte b = bArr[5];
        if (b != 3) {
            a2 = b == 4 ? this.b.a(bArr, dXRuntimeContext, context, true) : null;
        } else if (dXTemplateItem.a(dXRuntimeContext != null ? dXRuntimeContext.A() : "")) {
            a2 = this.d.a(bArr, dXRuntimeContext, context, true);
        } else {
            a2 = this.f28167a.a(bArr, dXRuntimeContext, context, true);
        }
        if (a2 == null) {
            fux.b("createTree widgetTree == null!");
            return null;
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().contains(LoggingSPCache.STORAGE_LANGUAGE)) {
                    z = true;
                }
                if (this.c.containsKey(entry.getKey())) {
                    this.c.get(entry.getKey());
                    fwn.a();
                    entry.getValue();
                }
            }
            if (z) {
                ter.a(a2);
            }
        }
        if (a2 != null) {
            return a2;
        }
        fux.b("createTree loader子文件 widgetTree == null!");
        return null;
    }

    public DXWidgetNode a(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("8e123365", new Object[]{this, dXTemplateItem, dXRuntimeContext, context}) : b(dXTemplateItem, dXRuntimeContext, context);
    }
}
