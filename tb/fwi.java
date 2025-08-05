package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class fwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f28154a;
    private Map<String, Integer> b = new HashMap();

    static {
        kge.a(-593599288);
    }

    public fwi(int i) {
        this.f28154a = i;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f28154a = i;
        }
    }

    public DXTemplateItem a(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("9df9f2a4", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (this.f28154a == 1) {
            return fwj.a().b(str, j, dXTemplateItem);
        }
        Integer num = this.b.get(dXTemplateItem.f11925a);
        if (num != null) {
            i = num.intValue();
        }
        if (i >= this.f28154a) {
            return fwj.a().b(str, j, dXTemplateItem);
        }
        return fwj.a().a(str, j, dXTemplateItem);
    }

    public DXTemplateItem c(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("11149626", new Object[]{this, str, new Long(j), dXTemplateItem}) : fwj.a().g(str, j, dXTemplateItem);
    }

    public void b(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3daa6f9a", new Object[]{this, str, new Long(j), dXTemplateItem});
            return;
        }
        Integer num = this.b.get(dXTemplateItem.f11925a);
        if (num != null) {
            i = num.intValue();
        }
        int d = fwj.a().d(str, j, dXTemplateItem);
        if (d == 1) {
            this.b.put(dXTemplateItem.f11925a, Integer.valueOf(i + 1));
        } else if (d != 2) {
        } else {
            this.b.put(dXTemplateItem.f11925a, Integer.valueOf(this.f28154a));
        }
    }
}
