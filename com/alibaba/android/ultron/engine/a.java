package com.alibaba.android.ultron.engine;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine;
import com.alibaba.android.ultron.engine.logic.e;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import tb.bpk;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean k;

    /* renamed from: a  reason: collision with root package name */
    public Context f2544a;
    public com.alibaba.android.ultron.engine.logic.c b;
    public com.alibaba.android.ultron.engine.template.a c;
    public com.alibaba.android.ultron.vfw.dataloader.c d;
    public final String e;
    public final b f;
    public String g;
    private com.alibaba.android.ultron.engine.template.b h;
    private com.alibaba.android.ultron.vfw.instance.d i;
    private boolean j;
    private C0086a l;
    private com.alibaba.android.ultron.engine.logic.a m = new com.alibaba.android.ultron.engine.logic.a();

    /* loaded from: classes2.dex */
    public interface b {
        void a(UltronError ultronError);
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f2547a;
        public JSONObject b;

        static {
            kge.a(1012963481);
        }
    }

    static {
        kge.a(444445705);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df85036b", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public a(Context context, boolean z, com.alibaba.android.ultron.vfw.instance.d dVar, com.alibaba.android.ultron.vfw.dataloader.c cVar, String str, b bVar) {
        this.f2544a = context;
        this.i = dVar;
        this.e = str;
        this.j = z;
        this.f = bVar;
        this.d = cVar;
        this.g = str;
        a(context, cVar, str);
        this.c = new com.alibaba.android.ultron.engine.template.d(this.i, context, str);
        f();
    }

    public void a(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1a8084", new Object[]{this, iDMComponent, jSONObject});
        } else {
            this.c.a(iDMComponent, jSONObject);
        }
    }

    public void a(String str, String str2, com.alibaba.android.ultron.engine.logic.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24753347", new Object[]{this, str, str2, bVar});
        } else {
            this.m.a(str, str2, bVar);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.engine.template.b a2 = a(this.d.d());
        if (a2 != null && a2.f2568a) {
            UltronError ultronError = new UltronError("模板引擎init出错:" + a2.b.f2569a);
            ultronError.code = String.valueOf(a2.b.f2569a);
            ultronError.extraMsg = a2.b.b;
        }
        String e = this.d.e();
        String f = this.d.f();
        if (TextUtils.isEmpty(e)) {
            return;
        }
        a(e, f);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : (this.b instanceof UltronWebViewJsEngine) && Build.VERSION.SDK_INT < 19;
    }

    private void a(Context context, com.alibaba.android.ultron.vfw.dataloader.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d08cf18", new Object[]{this, context, cVar, str});
        } else if (!com.alibaba.android.ultron.vfw.dataloader.c.DATA_PARSER_TYPE_SCRIPT.equals(cVar.c())) {
        } else {
            UnifyLog.a(this.g, "UltronEngine", "use jsi engine", new String[0]);
            if (!k) {
                this.b = new e(context, this.i, str, this.m, new c(this.j, this.f));
            } else {
                this.b = new UltronWebViewJsEngine(context, this.i, str, this.m, this.f);
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b instanceof e;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b instanceof UltronWebViewJsEngine;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.engine.logic.c cVar = this.b;
        if (cVar instanceof UltronWebViewJsEngine) {
            return;
        }
        if (cVar != null) {
            cVar.a();
        }
        this.b = new UltronWebViewJsEngine(this.f2544a, this.i, this.g, this.m, this.f);
        a(this.d.e(), this.d.f());
        C0086a c0086a = this.l;
        if (c0086a == null) {
            return;
        }
        a(c0086a.a(), this.l.b(), this.l.c());
    }

    public com.alibaba.android.ultron.engine.template.b a(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.engine.template.b) ipChange.ipc$dispatch("5211e696", new Object[]{this, templateInfo});
        }
        this.h = this.c.a(templateInfo);
        return this.h;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    public com.alibaba.android.ultron.engine.template.b a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.engine.template.b) ipChange.ipc$dispatch("e443169a", new Object[]{this, dVar});
        }
        com.alibaba.android.ultron.engine.template.b bVar = this.h;
        if (bVar != null && bVar.f2568a) {
            return this.h;
        }
        return this.c.a(dVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        com.alibaba.android.ultron.engine.logic.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.a(str, str2);
    }

    public void a(String str, List<String> list, com.alibaba.android.ultron.engine.logic.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b9d1fe", new Object[]{this, str, list, dVar});
        } else if (this.b == null) {
        } else {
            this.l = new C0086a(str, list, dVar);
            this.b.a(str, list, dVar);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.engine.logic.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    /* loaded from: classes2.dex */
    public class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;
        private b c;

        static {
            kge.a(-2101775299);
            kge.a(888367656);
        }

        public c(boolean z, b bVar) {
            this.b = z;
            this.c = bVar;
        }

        @Override // com.alibaba.android.ultron.engine.a.b
        public void a(UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f64095d", new Object[]{this, ultronError});
            } else if (this.b && ultronError != null && (bpk.ERROR_ENGINE_JS_INIT_JSI.equalsIgnoreCase(ultronError.code) || bpk.ERROR_ENGINE_JS_ENGINE_JSI.equalsIgnoreCase(ultronError.code) || bpk.ERROR_ENGINE_JS_TIMEOUT_JSI.equalsIgnoreCase(ultronError.code) || bpk.ERROR_ENGINE_JS_FILE_ERROR_JSI.equalsIgnoreCase(ultronError.code) || bpk.ERROR_ENGINE_JS_INIT_DUOKAI_JSI.equalsIgnoreCase(ultronError.code))) {
                a.a(a.this);
            } else {
                b bVar = this.c;
                if (bVar == null) {
                    return;
                }
                bVar.a(ultronError);
            }
        }
    }

    /* renamed from: com.alibaba.android.ultron.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0086a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2545a;
        private List<String> b;
        private com.alibaba.android.ultron.engine.logic.d c;

        static {
            kge.a(1300436090);
        }

        public C0086a(String str, List<String> list, com.alibaba.android.ultron.engine.logic.d dVar) {
            this.f2545a = str;
            this.b = list;
            this.c = dVar;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2545a;
        }

        public List<String> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
        }

        public com.alibaba.android.ultron.engine.logic.d c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.android.ultron.engine.logic.d) ipChange.ipc$dispatch("439ae1b", new Object[]{this}) : this.c;
        }
    }
}
