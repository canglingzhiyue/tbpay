package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class jnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fve f29644a;
    private DinamicXEngine b;
    private final Context c;
    private final jnk d;

    /* loaded from: classes6.dex */
    public static final class a implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ jnn b;

        public a(jnn jnnVar) {
            this.b = jnnVar;
        }

        @Override // tb.fve
        public final void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                return;
            }
            if (fvbVar.f28139a != null) {
                Iterator<DXTemplateItem> it = fvbVar.f28139a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DXTemplateItem item = it.next();
                    if (item.f11925a == jnl.a(jnl.this).a().f11925a && item.b == jnl.a(jnl.this).a().b) {
                        jnl jnlVar = jnl.this;
                        jnn jnnVar = this.b;
                        q.b(item, "item");
                        jnl.a(jnlVar, jnnVar, item);
                        z = true;
                        break;
                    }
                }
            }
            if (!z && fvbVar.b != null) {
                Iterator<DXTemplateItem> it2 = fvbVar.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DXTemplateItem next = it2.next();
                    if (next.f11925a == jnl.a(jnl.this).a().f11925a && next.b == jnl.a(jnl.this).a().b) {
                        jnn jnnVar2 = this.b;
                        if (jnnVar2 != null) {
                            jnnVar2.a("TplDownloadFail", null);
                        }
                        z = true;
                    }
                }
            }
            if (!z) {
                return;
            }
            jnl.b(jnl.this).c(jnl.c(jnl.this));
            jnl.a(jnl.this, (fve) null);
        }
    }

    static {
        kge.a(560945104);
    }

    public jnl(Context context, jnk jnkVar, String str, String str2) {
        this(context, jnkVar, str, str2, null, null, 48, null);
    }

    public jnl(Context context, jnk jnkVar, String str, String str2, DinamicXEngine dinamicXEngine) {
        this(context, jnkVar, str, str2, dinamicXEngine, null, 32, null);
    }

    public jnl(Context ctx, jnk dxConfig, String bizId, String str, DinamicXEngine dinamicXEngine, dkt dktVar) {
        q.d(ctx, "ctx");
        q.d(dxConfig, "dxConfig");
        q.d(bizId, "bizId");
        this.c = ctx;
        this.d = dxConfig;
        if (dinamicXEngine == null) {
            dinamicXEngine = new DinamicXEngine(new DXEngineConfig.a(bizId).a(bizId).b(this.d.d() ? 2 : 1).d(this.d.e()).a(false).a(dktVar).a());
        }
        this.b = dinamicXEngine;
        hvc.a(str, this.b);
    }

    public static final /* synthetic */ jnk a(jnl jnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnk) ipChange.ipc$dispatch("dc1b878f", new Object[]{jnlVar}) : jnlVar.d;
    }

    public static final /* synthetic */ void a(jnl jnlVar, fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedd1aeb", new Object[]{jnlVar, fveVar});
        } else {
            jnlVar.f29644a = fveVar;
        }
    }

    public static final /* synthetic */ void a(jnl jnlVar, jnn jnnVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d20dddf", new Object[]{jnlVar, jnnVar, dXTemplateItem});
        } else {
            jnlVar.a(jnnVar, dXTemplateItem);
        }
    }

    public static final /* synthetic */ DinamicXEngine b(jnl jnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("283082b6", new Object[]{jnlVar}) : jnlVar.b;
    }

    public static final /* synthetic */ fve c(jnl jnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fve) ipChange.ipc$dispatch("ab5d801f", new Object[]{jnlVar}) : jnlVar.f29644a;
    }

    public /* synthetic */ jnl(Context context, jnk jnkVar, String str, String str2, DinamicXEngine dinamicXEngine, dkt dktVar, int i, o oVar) {
        this(context, jnkVar, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : dinamicXEngine, (i & 32) != 0 ? null : dktVar);
    }

    public final void a(jnn cb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb7baee", new Object[]{this, cb});
            return;
        }
        q.d(cb, "cb");
        DXTemplateItem a2 = this.b.a(this.d.a());
        if (a2 != null && a2.b == this.d.a().b) {
            a(cb, a2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.d.a());
        this.b.a(arrayList);
        if (this.d.b()) {
            this.f29644a = new a(cb);
            this.b.b(this.f29644a);
        } else if (a2 != null) {
            a(cb, a2);
        } else {
            cb.a("TplNotFound", null);
        }
    }

    private final void a(jnn jnnVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7a2e17", new Object[]{this, jnnVar, dXTemplateItem});
            return;
        }
        DXResult<DXRootView> b = this.b.b(this.c, dXTemplateItem);
        s sVar = null;
        DXRootView dXRootView = b != null ? b.f11780a : null;
        if (dXRootView != null) {
            jnnVar.a(dXRootView);
            return;
        }
        if (b != null) {
            sVar = b.a();
        }
        jnnVar.a("NullDxRooView", sVar);
    }

    public final DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("4d3f629f", new Object[]{this}) : this.b;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        fve fveVar = this.f29644a;
        if (fveVar == null) {
            return;
        }
        this.b.c(fveVar);
    }
}
