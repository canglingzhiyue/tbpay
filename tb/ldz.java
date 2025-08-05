package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* loaded from: classes.dex */
public class ldz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30514a;
    private final JSONObject b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final boolean i;
    private DinamicTemplate j;
    private DXTemplateItem k;

    static {
        kge.a(808593747);
        f30514a = ldj.a("enableSetTemplateType", true);
    }

    public ldz(JSONObject jSONObject) {
        this.b = jSONObject;
        this.c = jSONObject.getString("name");
        this.d = jSONObject.getString("version");
        this.e = jSONObject.getString("url");
        this.f = jSONObject.getString("name_v2");
        this.g = jSONObject.getString("version_v2");
        this.h = jSONObject.getString("url_v2");
        this.i = a(this.e, this.c, this.d) || a(this.h, this.f, this.g);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b.containsKey("disableDinamicX3_client") && this.b.getBooleanValue("disableDinamicX3_client")) {
            return false;
        }
        return this.i;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (a()) {
            return f().f11925a;
        }
        return e().name;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (a()) {
            return String.valueOf(f().b);
        }
        return e().version;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (a()) {
            return f().c;
        }
        return e().templateUrl;
    }

    public DinamicTemplate e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("9135c634", new Object[]{this});
        }
        DinamicTemplate dinamicTemplate = this.j;
        if (dinamicTemplate != null) {
            return dinamicTemplate;
        }
        if (!a(this.e, this.c, this.d)) {
            this.j = new DinamicTemplate();
            DinamicTemplate dinamicTemplate2 = this.j;
            dinamicTemplate2.name = this.c;
            dinamicTemplate2.templateUrl = this.e;
            dinamicTemplate2.version = this.d;
            return dinamicTemplate2;
        }
        return new DinamicTemplate();
    }

    public DXTemplateItem f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("6a7242f2", new Object[]{this});
        }
        DXTemplateItem dXTemplateItem = this.k;
        if (dXTemplateItem != null) {
            return dXTemplateItem;
        }
        if (a(this.e, this.c, this.d)) {
            this.k = new DXTemplateItem();
            DXTemplateItem dXTemplateItem2 = this.k;
            dXTemplateItem2.f11925a = this.c;
            dXTemplateItem2.b = a(this.d);
            DXTemplateItem dXTemplateItem3 = this.k;
            dXTemplateItem3.c = this.e;
            a(dXTemplateItem3);
            return this.k;
        } else if (a(this.h, this.f, this.g)) {
            this.k = new DXTemplateItem();
            DXTemplateItem dXTemplateItem4 = this.k;
            dXTemplateItem4.f11925a = this.f;
            dXTemplateItem4.b = a(this.g);
            DXTemplateItem dXTemplateItem5 = this.k;
            dXTemplateItem5.c = this.h;
            a(dXTemplateItem5);
            return this.k;
        } else {
            return new DXTemplateItem();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.b.put("disableDinamicX3_client", (Object) true);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.put("needReCalculateViewType_client", (Object) Boolean.valueOf(z));
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.b.getBooleanValue("needReCalculateViewType_client");
    }

    private boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue() : !TextUtils.isEmpty(str) && str.endsWith(".zip") && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3);
    }

    private long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            ldf.a("CompatibleDinamicTemplate", "str2Num", th);
            return 0L;
        }
    }

    private void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
        } else if (!f30514a || dXTemplateItem == null) {
        } else {
            dXTemplateItem.c(1);
        }
    }
}
