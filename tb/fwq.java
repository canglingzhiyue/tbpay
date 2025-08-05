package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.template.download.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class fwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f28169a;
    private int b;
    private int c = 1;
    private int d = 2;
    private Map<String, DXWidgetNode> e = new HashMap();

    static {
        kge.a(-2104188575);
    }

    public Map<String, DXWidgetNode> a(fwr fwrVar, DXRuntimeContext dXRuntimeContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1e020e55", new Object[]{this, fwrVar, dXRuntimeContext, context});
        }
        int i = this.f28169a;
        if (i <= 0 || this.b <= 0) {
            return null;
        }
        if (!fwrVar.c(i)) {
            fuw.d(null, "DXChildTemplateLoader 解析子模版区失败 !codeReader.seek(childTemplateStartPos)");
        }
        int f = fwrVar.f();
        if (f <= 0) {
            return null;
        }
        DXTemplateItem c = dXRuntimeContext.c();
        for (int i2 = 0; i2 < f; i2++) {
            if (fwrVar.d() != this.c) {
                fuw.d(null, "DXChildTemplateLoader 解析子模版区失败 startTag != START_TAG)");
                return null;
            }
            short e = fwrVar.e();
            String str = new String(fwrVar.a(), fwrVar.b(), (int) e);
            fwrVar.b(e);
            short e2 = fwrVar.e();
            int f2 = fwrVar.f();
            byte[] bArr = new byte[f2];
            System.arraycopy(fwrVar.a(), fwrVar.b(), bArr, 0, f2);
            fwrVar.b(f2);
            if (fwrVar.d() != this.d) {
                fuw.d(null, "DXChildTemplateLoader 解析子模版区失败 endTag != END_TAG)");
                return null;
            }
            fwm fwmVar = new fwm();
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = str;
            dXTemplateItem.b = e2;
            f fVar = new f();
            fVar.f11934a = c.g.f11934a;
            fVar.b = c.g.b;
            dXTemplateItem.g = fVar;
            DXRuntimeContext a2 = dXRuntimeContext.a((DXWidgetNode) null);
            a2.a(dXTemplateItem);
            DXWidgetNode a3 = fwmVar.a(bArr, a2, context, false);
            Map<String, DXWidgetNode> map = this.e;
            map.put(str + "_" + ((int) e2), a3);
        }
        return this.e;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f28169a = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public DXWidgetNode a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("8fea1d51", new Object[]{this, str});
        }
        if (str != null) {
            return this.e.get(str);
        }
        return null;
    }
}
