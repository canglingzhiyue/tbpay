package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.b;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ai;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ezl;
import tb.sdc;

/* loaded from: classes3.dex */
public class ezl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ezo f27693a;
    private Context b;
    private eyx c;
    private Map<String, ezm> d = new ConcurrentHashMap();

    static {
        kge.a(1357365703);
    }

    public ezl(Context context, eyx eyxVar) {
        this.b = context;
        this.c = eyxVar;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f27693a = new ezn();
        }
    }

    public <F extends ezo> F a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (F) ipChange.ipc$dispatch("f046604", new Object[]{this}) : (F) this.f27693a;
    }

    public void a(String str, ezm ezmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c29b4a", new Object[]{this, str, ezmVar});
        } else if (str == null || ezmVar == null) {
        } else {
            this.d.put(str, ezmVar);
        }
    }

    public void a(a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeca8d3", new Object[]{this, aVar, runtimeAbilityParamArr});
        } else if (aVar == null || (a2 = aVar.a()) == null) {
        } else {
            ezm ezmVar = this.d.get(a2);
            if (ezmVar != null) {
                ezmVar.a(aVar, runtimeAbilityParamArr);
                if (TextUtils.equals(ai.EVENT_TYPE, a2)) {
                    return;
                }
                b.a(this.b, bq.a(com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr)), a2, a(ezmVar));
                return;
            }
            String str = "not found handler: " + a2;
            if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sAbilityNotFoundHandlerToast))) {
                Toast.makeText(this.b, str, 0).show();
            }
            ae.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.handler.AbilityCenter$1
                {
                    boolean z;
                    ezl ezlVar = ezl.this;
                    put("traceId", ezl.$ipChange.e().a("traceId"));
                    ezl ezlVar2 = ezl.this;
                    put("itemId", ezl.$ipChange.e().a("requestItemId"));
                    ezl ezlVar3 = ezl.this;
                    if (ezl.$ipChange instanceof sdc) {
                        ezl ezlVar4 = ezl.this;
                        if (((sdc) ezl.$ipChange).a()) {
                            z = true;
                            put("isTTDetail", String.valueOf(z));
                        }
                    }
                    z = false;
                    put("isTTDetail", String.valueOf(z));
                }
            }, -500007, str);
            i.a("AbilityCenter", str);
        }
    }

    private Map<String, String> a(ezm ezmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("679a97b5", new Object[]{this, ezmVar});
        }
        if (!(ezmVar instanceof xiy)) {
            return null;
        }
        return ((xiy) ezmVar).b();
    }

    public void a(List<a> list, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5834efdd", new Object[]{this, list, runtimeAbilityParamArr});
        } else if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    a(aVar, runtimeAbilityParamArr);
                }
            }
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
