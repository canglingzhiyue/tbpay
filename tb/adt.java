package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private TemplateBean f25273a;
    private JSONObject b;
    private JSONObject c;

    static {
        kge.a(59627229);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-340225563);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final adt a(JSONObject jSONObject) {
            JSONObject b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (adt) ipChange.ipc$dispatch("28fe6f6d", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || (b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "template")) == null) {
                return null;
            }
            q.a((Object) b, "FastJsonParseUtil.optJSO…template\") ?: return null");
            TemplateBean templateBean = new TemplateBean();
            templateBean.url = com.taobao.android.searchbaseframe.util.a.a(b, "url", "");
            templateBean.md5 = com.taobao.android.searchbaseframe.util.a.a(b, "md5", "");
            templateBean.version = com.taobao.android.searchbaseframe.util.a.a(b, "version", "");
            templateBean.templateName = com.taobao.android.searchbaseframe.util.a.a(b, "templateName", "");
            if (TextUtils.isEmpty(templateBean.url)) {
                return null;
            }
            adt adtVar = new adt();
            adtVar.a(templateBean);
            adtVar.a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "data"));
            return adtVar;
        }
    }

    public final TemplateBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("92e64be8", new Object[]{this}) : this.f25273a;
    }

    public final void a(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d458d5e2", new Object[]{this, templateBean});
        } else {
            this.f25273a = templateBean;
        }
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
    }
}
