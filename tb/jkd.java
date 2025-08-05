package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29593a;
    private List<jkd> b;
    private List<jkd> c;
    private Object d;

    public jkd(String str) {
        if (jkf.a(str)) {
            new IllegalArgumentException("locatorId is null");
        }
        this.f29593a = str;
    }

    public jkd a(jkd jkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkd) ipChange.ipc$dispatch("1de0f54e", new Object[]{this, jkdVar});
        }
        if (jkdVar != null && !jkf.a(jkdVar.f29593a)) {
            List<jkd> list = this.b;
            if (list == null || list.isEmpty()) {
                this.b = new ArrayList();
            }
            a(jkdVar, this.b);
        }
        return this;
    }

    public List<jkd> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public jkd b(jkd jkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkd) ipChange.ipc$dispatch("582cbad", new Object[]{this, jkdVar});
        }
        if (jkdVar != null && !jkf.a(jkdVar.f29593a)) {
            List<jkd> list = this.c;
            if (list == null || list.isEmpty()) {
                this.c = new ArrayList();
            }
            a(jkdVar, this.c);
        }
        return this;
    }

    private void a(jkd jkdVar, List<jkd> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c16ba6", new Object[]{this, jkdVar, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).c().equals(jkdVar.c())) {
                list.set(i, jkdVar);
                return;
            }
        }
        list.add(jkdVar);
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.d;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.d = obj;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f29593a;
    }
}
