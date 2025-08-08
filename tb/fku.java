package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class fku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private boolean c;
    private String d;
    private fkw f;
    private String g;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f28019a = new HashMap<>();
    private List<String> e = new ArrayList();
    private int h = 0;
    private boolean i = false;

    static {
        kge.a(-715143639);
    }

    public fku(fkw fkwVar) {
        this.f = fkwVar;
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ctu.a("NewDetailSPConfigInit");
        this.f28019a.put(a("item"), fky.a(Global.getApplication(), a("item")));
        this.f28019a.put(a(fhp.VIEWHOLDER_KEY), fky.a(Global.getApplication(), a(fhp.VIEWHOLDER_KEY)));
        this.b = "true".equals(fky.c(Global.getApplication()));
        this.c = "true".equals(fky.d(Global.getApplication()));
        this.d = fky.e(Global.getApplication());
        this.h = fky.i(Global.getApplication());
        this.i = fky.j(Global.getApplication());
        if (!StringUtils.isEmpty(this.d)) {
            Collections.addAll(this.e, this.d.split(","));
        }
        this.g = fky.b(Global.getApplication());
        ctu.a();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = "";
        if (StringUtils.isEmpty(str)) {
            str = str2;
        }
        fkw fkwVar = this.f;
        if (fkwVar != null && !StringUtils.isEmpty(fkwVar.F)) {
            str2 = this.f.F;
        }
        return str + str2;
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this}) : this.f28019a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public List<String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.e;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.h;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
    }
}
