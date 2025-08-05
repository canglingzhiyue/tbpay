package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.debug.a;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.k;
import com.taobao.android.detail.core.performance.preload.c;
import com.taobao.android.detail.core.utils.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class feo implements fel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27864a;
    private String b;

    static {
        kge.a(966516908);
        kge.a(-178837752);
    }

    public feo() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.mainParams.impl.BizParamsAppender");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f27864a = z;
        }
    }

    @Override // tb.fel
    public Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{this, context});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        a(context, (Map<String, String>) hashMap);
        e(context, hashMap);
        f(context, hashMap);
        a(context, hashMap);
        return hashMap;
    }

    private void a(Context context, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
        } else if (!eip.K) {
        } else {
            hashMap.put("dynamicJsonData", "true");
        }
    }

    private void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        map.put("container_type", eaz.DINAMIC_MODULE_NAME);
        if (ecu.p && ecu.q) {
            map.put("ultron2", "true");
            if (ecu.r) {
                map.put("dinamic_v3", "true");
            }
        }
        b(context, map);
        d(context, map);
        c(context, map);
        g(context, map);
    }

    private void b(Context context, Map<String, String> map) {
        dya dyaVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{this, context, map});
            return;
        }
        if (!this.f27864a && (context instanceof DetailCoreActivity) && (dyaVar = ((DetailCoreActivity) context).b) != null) {
            z = dyaVar.v();
        }
        if (!epv.g || !z) {
            return;
        }
        map.put("supportV7", "true");
    }

    private void c(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c334b027", new Object[]{this, context, map});
            return;
        }
        map.put("supportIndustryMainPic", String.valueOf(eip.i));
        String str = "false";
        if (!this.f27864a && (context instanceof DetailCoreActivity)) {
            if (((DetailCoreActivity) context).J()) {
                str = "true";
            }
            map.put("industryMainPicDegrade", str);
            return;
        }
        map.put("industryMainPicDegrade", str);
    }

    private void d(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd572a8", new Object[]{this, context, map});
            return;
        }
        String str = "false";
        if (!eip.h) {
            map.put("finalUltron", str);
        } else if (jqm.a() && !a.k(context)) {
            map.put("finalUltron", str);
        } else {
            if (!this.f27864a && (context instanceof DetailCoreActivity)) {
                z = true ^ ((DetailCoreActivity) context).H();
            } else if (TextUtils.isEmpty(this.b)) {
                i.c(k.a("BizParamsAppender"), "没有预加载，finalUltron默认true");
            } else {
                if (!c.FINAL_ULTRON.equals(this.b) && !"industry".equals(this.b)) {
                    z = false;
                }
                String a2 = k.a("BizParamsAppender");
                i.c(a2, "预加载协议版本：" + this.b);
            }
            if (z) {
                str = "true";
            }
            map.put("finalUltron", str);
        }
    }

    private void e(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8763529", new Object[]{this, context, map});
        } else {
            map.put("liveAutoPlay", String.valueOf(com.taobao.android.detail.core.utils.a.a(context)));
        }
    }

    private void f(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9316f7aa", new Object[]{this, context, map});
            return;
        }
        String str = "";
        if (this.f27864a) {
            map.put("lastItemId", str);
            i.c(k.a("BizParamsAppender"), "预请求lastItemId为空");
        } else if (!(context instanceof DetailCoreActivity) || !TextUtils.isEmpty(this.b)) {
            map.put("lastItemId", str);
            i.c(k.a("BizParamsAppender"), "进入详情页，命中预加载的第一次主请求lastItemId为空");
        } else {
            com.taobao.android.detail.datasdk.model.datamodel.node.c C = ((DetailCoreActivity) context).C();
            if (C != null) {
                str = C.i();
            }
            map.put("lastItemId", str);
        }
    }

    private void g(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db7ba2b", new Object[]{this, context, map});
        } else {
            iyx.a(map);
        }
    }
}
