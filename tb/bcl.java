package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.ultron.trade.event.h;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bga;

/* loaded from: classes2.dex */
public class bcl extends bcj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HIDE_SWIPE_ITEM = "_hideSwipeItem";
    private List<IDMComponent> b;
    private List<IDMComponent> c;
    private List<IDMComponent> d;
    private List<IDMComponent> e;
    private List<IDMComponent> f;
    private Map<String, List<IDMComponent>> g;
    private Set<String> h;
    private Set<String> i;
    private RequestConfig j;
    private boolean k;
    private boolean l;
    private boolean m;
    private IDMComponent n;

    static {
        kge.a(-1661481385);
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : i == i2 - 1;
    }

    public static /* synthetic */ Object ipc$super(bcl bclVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public bcl(bcb bcbVar) {
        super(bcbVar);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new HashMap();
        this.h = new HashSet();
        this.i = new HashSet();
    }

    @Override // tb.bcj
    public void a(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b97d4c", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
            return;
        }
        a(iDMComponent);
        c(iDMComponent);
        d(iDMComponent);
        e(iDMComponent);
        d(iDMComponent, i, i2);
    }

    @Override // tb.bcj
    public void b(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bd48ab", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
            return;
        }
        b(iDMComponent);
        c(iDMComponent, i, i2);
        if (iDMComponent == null || !"tabCard".equals(iDMComponent.getTag())) {
            return;
        }
        this.f25799a.o().h("header".equals(iDMComponent.getPosition()));
    }

    @Override // tb.bcj
    public void a(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e40d2", new Object[]{this, jnyVar, requestConfig});
            return;
        }
        this.m = false;
        this.j = requestConfig;
        this.n = null;
        this.f25799a.b(jnyVar);
        this.b.clear();
        this.d.clear();
        this.c.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.i.clear();
        this.g.clear();
        bmi bmiVar = new bmi(this.b, this.d, this.c);
        bmiVar.a(this.e);
        bmiVar.b(this.f);
        this.f25799a.a(bmiVar);
        this.f25799a.a(this.g);
    }

    @Override // tb.bcj
    public void b(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2589f413", new Object[]{this, jnyVar, requestConfig});
            return;
        }
        if (this.k) {
            bga.a.a("iCart", "dataIntegrality", "NotFoundItem", "店铺商品组件为空");
        }
        if (this.l) {
            return;
        }
        bga.a.a("iCart", "dataIntegrality", "NotFoundSubmit", "未找到提交栏组件");
    }

    private void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        if (iDMComponent != null) {
            h.a(this.f25799a.n().m(), iDMComponent);
            String b = f.b(iDMComponent);
            if ("footer".equals(b)) {
                this.c.add(iDMComponent);
                return;
            } else if ("header".equals(b)) {
                this.b.add(iDMComponent);
                return;
            } else if ("stickyTop".equals(b)) {
                this.e.add(iDMComponent);
                return;
            } else if ("stickyBottom".equals(b)) {
                this.f.add(iDMComponent);
                return;
            }
        }
        if (iDMComponent == null) {
            return;
        }
        this.d.add(iDMComponent);
    }

    private void b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73527f0b", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null || BundleLineComponent.COMPONENT_TAG.equals(iDMComponent.getTag())) {
        } else {
            List<IDMComponent> list = this.g.get(iDMComponent.getTag());
            if (list == null) {
                list = new ArrayList<>();
                this.g.put(iDMComponent.getTag(), list);
            }
            list.add(iDMComponent);
        }
    }

    private void c(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec1140a", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (this.f25799a.t()) {
        } else {
            f(iDMComponent);
            if (!a(i, i2)) {
                return;
            }
            CheckHoldManager a2 = CheckHoldManager.a();
            Set<String> set = this.h;
            Set<String> set2 = this.i;
            if (this.f25799a.n().u() == null) {
                z = false;
            }
            a2.a(2, set, set2, z);
        }
    }

    private void c(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f962a", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null || !"item".equals(iDMComponent.getTag()) || (fields = iDMComponent.getFields()) == null || fields.containsKey(HIDE_SWIPE_ITEM)) {
        } else {
            fields.put(HIDE_SWIPE_ITEM, (Object) true);
        }
    }

    private void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2cad49", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null) {
        } else {
            if (!"shop".equals(iDMComponent.getTag()) && !"bundleHeader".equals(iDMComponent.getTag())) {
                return;
            }
            IDMComponent parent = iDMComponent.getParent();
            if (parent == null) {
                this.k = true;
                return;
            }
            List<IDMComponent> a2 = bek.a(parent);
            if (a2 == null) {
                this.k = true;
                return;
            }
            Iterator<IDMComponent> it = a2.iterator();
            while (true) {
                if (it.hasNext()) {
                    IDMComponent next = it.next();
                    if (next != null && "item".equals(next.getTag())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                return;
            }
            this.k = true;
        }
    }

    private void e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a19c468", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null || !"submit".equals(iDMComponent.getTag())) {
        } else {
            this.l = true;
        }
    }

    private void f(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a706db87", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null || (fields = iDMComponent.getFields()) == null || !"item".equals(iDMComponent.getTag()) || !bei.b(iDMComponent) || !bei.a(iDMComponent)) {
        } else {
            String string = fields.getString("cartId");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (fields.getBooleanValue("isRepeatBuy")) {
                this.i.add(string);
            } else {
                this.h.add(string);
            }
        }
    }

    private void d(IDMComponent iDMComponent, int i, int i2) {
        RequestConfig requestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c4df69", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (iDMComponent == null) {
        } else {
            if (this.n == null) {
                this.n = this.f25799a.e("submit");
            }
            if (!bei.b(this.n) || this.f25799a.o().i() || (requestConfig = this.j) == null || !requestConfig.j()) {
                return;
            }
            g(iDMComponent);
            if (!a(i, i2) || !bei.b(this.n) || !this.m) {
                return;
            }
            bei.a(this.n, false);
        }
    }

    private void g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f3f2a6", new Object[]{this, iDMComponent});
        } else if (this.m || !"item".equals(iDMComponent.getTag()) || !bei.a(iDMComponent) || bei.b(iDMComponent)) {
        } else {
            this.m = true;
        }
    }
}
