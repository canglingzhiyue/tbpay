package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class bpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f26031a;
    private Map<DXTemplateItem, List<DXResult<DXRootView>>> d = new ConcurrentHashMap();
    private final Map<String, AtomicInteger> e;
    private final a f;
    private final bny g;

    /* loaded from: classes2.dex */
    public static class a {
        static {
            kge.a(-847886624);
        }
    }

    static {
        kge.a(1999703782);
        f26031a = new String[]{"buy_alihealth_shop", "buy_fliggy_check_box", "buy_fliggy_insurance_type", "buy_fliggy_panel_add", "buy_fliggy_panel_header", "buy_fliggy_select_component", "fliggy_coupon_tips_list"};
    }

    public bpb(bny bnyVar, a aVar) {
        this.g = bnyVar;
        this.f = aVar;
        UnifyLog.b("PerfOpt.Tmq", "PerfOpt ");
        this.e = new HashMap();
        this.e.put("buy_address", new AtomicInteger(1));
        this.e.put("buy_select", new AtomicInteger(5));
        this.e.put("buy_input", new AtomicInteger(1));
        this.e.put("buy_subtotal", new AtomicInteger(1));
        this.e.put("buy_image_text", new AtomicInteger(2));
        this.e.put("buy_item", new AtomicInteger(2));
    }

    public DXResult<DXRootView> a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("dc8d3870", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        synchronized (this) {
            List<DXResult<DXRootView>> list = this.d.get(dXTemplateItem);
            if (list != null && list.size() > 0) {
                int size = list.size() - 1;
                DXResult<DXRootView> dXResult = list.get(size);
                list.remove(size);
                return dXResult;
            }
            AtomicInteger atomicInteger = this.e.get(dXTemplateItem.f11925a);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
            return null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.clear();
        }
    }
}
