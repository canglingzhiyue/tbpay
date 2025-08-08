package tb;

import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.presenter.d;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Boolean f27030a;
    private final DetailCoreActivity b;
    private b c;
    private com.taobao.android.detail.core.aura.wrapper.a d;
    private List<AURARenderComponent> e = new ArrayList();
    private final Map<String, a> f = new HashMap();
    private final d g;
    private dwp h;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27033a;
        public int b;

        static {
            kge.a(873801776);
        }

        public a(String str, int i) {
            this.f27033a = str;
            this.b = i;
        }
    }

    public static /* synthetic */ DetailCoreActivity a(dwj dwjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("b89dad0c", new Object[]{dwjVar}) : dwjVar.b;
    }

    public static /* synthetic */ dwp b(dwj dwjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dwp) ipChange.ipc$dispatch("481e09e7", new Object[]{dwjVar}) : dwjVar.h;
    }

    static {
        kge.a(-1333857596);
        f27030a = Boolean.valueOf(f.b());
    }

    public dwj(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        this.g = new d(this.b);
        if (f27030a.booleanValue()) {
            this.h = new dwp(this.b);
        }
        if (eip.R) {
            this.d = new com.taobao.android.detail.core.aura.wrapper.a(this.b);
        }
        emu.a("com.taobao.android.detail.core.aura.AliDetailAuraAdapter");
    }

    public void a(b bVar) {
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
        } else if (god.x && (bVar2 = this.c) != null && bVar2.l() != null && this.c.l().get("fliggyCacheSource") == null && bVar.l() != null && bVar.l().get("fliggyCacheSource") != null) {
        } else {
            this.c = bVar;
            if (eip.R) {
                com.taobao.android.detail.core.aura.wrapper.a aVar = this.d;
                if (aVar == null) {
                    return;
                }
                aVar.a(bVar);
                return;
            }
            this.d = new com.taobao.android.detail.core.aura.wrapper.a(this.b, bVar);
        }
    }

    public enh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("f04381f", new Object[]{this});
        }
        com.taobao.android.detail.core.aura.wrapper.a aVar = this.d;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public enh b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("fc9fe0e4", new Object[]{this, bVar});
        }
        com.taobao.android.detail.core.aura.wrapper.a aVar = this.d;
        if (aVar != null) {
            return aVar.b(bVar);
        }
        return null;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        com.taobao.android.detail.core.aura.wrapper.a aVar = this.d;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        com.taobao.android.detail.core.aura.wrapper.a aVar = this.d;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public TradeNode d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TradeNode) ipChange.ipc$dispatch("da30a361", new Object[]{this});
        }
        b bVar = this.c;
        if (bVar != null) {
            return (TradeNode) bVar.b("trade", TradeNode.class);
        }
        return null;
    }

    public Map<String, a> e() {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        if (bau.a(this.e)) {
            return this.f;
        }
        for (int i = 0; i < this.e.size(); i++) {
            AURARenderComponent aURARenderComponent = this.e.get(i);
            if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null && (map = aURARenderComponentData.fields) != null) {
                String str = (String) bbc.a(map, "locatorId", String.class, null);
                if (!StringUtils.isEmpty(str) && !this.f.containsKey(str)) {
                    this.f.put(str, new a(aURARenderComponent.key, i));
                }
            }
        }
        return this.f;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        a aVar = e().get(str);
        if (aVar == null) {
            return -1;
        }
        return aVar.b;
    }

    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }

    public dwn a(List<AURARenderComponent> list, boolean z) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dwn) ipChange.ipc$dispatch("9eca8eb0", new Object[]{this, list, new Boolean(z)});
        }
        if (list == null || (bVar = this.c) == null) {
            return dwn.a();
        }
        dwp dwpVar = this.h;
        if (dwpVar != null && !dwpVar.a(bVar, list, z)) {
            final dwn a2 = this.h.a();
            if (jqm.a()) {
                Log.e("ProtocolCompare", "协议对比失败，详情：" + this.h.a());
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.dwj.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(dwj.a(dwj.this));
                        builder.setMessage(a2.toString());
                        builder.setPositiveButton("复制", new DialogInterface.OnClickListener() { // from class: tb.dwj.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                } else {
                                    ((ClipboardManager) dwj.a(dwj.this).getSystemService("clipboard")).setText(dwj.b(dwj.this).a().toString());
                                }
                            }
                        });
                        builder.create().show();
                    }
                });
            }
            return a2;
        }
        return dwn.a();
    }

    public boolean f() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        dwp dwpVar = this.h;
        if (dwpVar != null && (bVar = this.c) != null) {
            return dwpVar.a(bVar);
        }
        return false;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.g.d();
        dwp dwpVar = this.h;
        if (dwpVar == null) {
            return;
        }
        dwpVar.b();
    }
}
