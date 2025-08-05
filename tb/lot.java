package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import java.util.Map;

/* loaded from: classes7.dex */
public class lot implements lom {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f30781a;
    private String b = "首页";
    private IMulticlassTabService.a c;
    private boolean d;
    private final lou e;

    static {
        kge.a(-736442789);
        kge.a(-809002471);
    }

    public lot(Context context, String str) {
        this.f30781a = str;
        this.e = new lou(context);
    }

    @Override // tb.lom
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30781a;
    }

    @Override // tb.lom
    public llm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llm) ipChange.ipc$dispatch("16b90530", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.b)) {
            return new lol(this.b);
        }
        return null;
    }

    @Override // tb.lom
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d();
        this.e.a();
    }

    @Override // tb.lom
    public void a(IMulticlassTabService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4571916c", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // tb.lom
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e.b();
        a(false);
        a(new lol("首页"));
    }

    @Override // tb.lom
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : f();
    }

    @Override // tb.lom
    public ViewGroup a(llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bd86aa7", new Object[]{this, lljVar});
        }
        ViewGroup a2 = this.e.a(lljVar);
        a(true);
        this.b = b(lljVar);
        a(new lol(this.b));
        return a2;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.d;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    private void a(llm llmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
            return;
        }
        IMulticlassTabService.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a(llmVar);
    }

    private String b(llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ee4651", new Object[]{this, lljVar});
        }
        Map<String, Object> innerMap = lljVar.c().b().getInnerMap();
        return !(innerMap.get("title") instanceof String) ? "首页" : (String) innerMap.get("title");
    }
}
