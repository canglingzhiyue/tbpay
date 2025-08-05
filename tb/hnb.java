package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class hnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28735a;
    public long b;
    @JSONField(serialize = false)
    public long c;

    static {
        kge.a(801782155);
    }

    public hnb(String str) {
        this.f28735a = str;
    }

    public hnb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hnb) ipChange.ipc$dispatch("f059482", new Object[]{this});
        }
        if (son.L()) {
            this.c = System.nanoTime();
        }
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!son.L()) {
        } else {
            this.b = (System.nanoTime() - this.c) / 100000;
            ihi.a(this);
        }
    }
}
