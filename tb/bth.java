package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class bth extends aof implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("mp")

    /* renamed from: a  reason: collision with root package name */
    public String f26128a;
    @Column("module")
    public String b;
    @Column("offline")
    public String d;
    @Column(StatisticRecord.ET_CP)
    private int e;
    @Ingore
    private HashMap<String, bth> f;

    static {
        kge.a(1760225316);
        kge.a(-723128125);
    }

    public static /* synthetic */ Object ipc$super(bth bthVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean a(int i, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8ec607a", new Object[]{this, new Integer(i), str, str2, map})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return a(i, arrayList);
    }

    private boolean a(int i, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c2ce4f3", new Object[]{this, new Integer(i), arrayList})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return a(i);
        }
        String remove = arrayList.remove(0);
        if (a(remove)) {
            return this.f.get(remove).a(i, arrayList);
        }
        return a(i);
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        apr.a("AMConifg", "sampling module", this.b, "monitorPoint", this.f26128a, "samplingSeed", Integer.valueOf(i), "sampling", Integer.valueOf(this.e));
        return i < this.e;
    }

    public synchronized void a(String str, bth bthVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224d3e8c", new Object[]{this, str, bthVar});
            return;
        }
        if (this.f == null) {
            this.f = new HashMap<>();
        }
        if (a(str)) {
            bth bthVar2 = this.f.get(str);
            if (bthVar2 != null && bthVar2.f != null && bthVar.f != null) {
                bthVar.f.putAll(bthVar2.f);
            }
            apr.c("config object order errror", "config:", bthVar + "");
        }
        this.f.put(str, bthVar);
    }

    public synchronized boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        } else if (this.f == null) {
            return false;
        } else {
            return this.f.containsKey(str);
        }
    }

    public synchronized bth b(String str) {
        bth bthVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bth) ipChange.ipc$dispatch("7d1a461d", new Object[]{this, str});
        }
        bth c = c(str);
        if (c == null) {
            try {
                bthVar = (bth) clone();
            } catch (CloneNotSupportedException e) {
                e = e;
            }
            try {
                bthVar.b = str;
                c = bthVar;
            } catch (CloneNotSupportedException e2) {
                e = e2;
                c = bthVar;
                e.printStackTrace();
                this.f.put(str, c);
                return c;
            }
        }
        this.f.put(str, c);
        return c;
    }

    public synchronized bth c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bth) ipChange.ipc$dispatch("7dc6f1bc", new Object[]{this, str});
        }
        if (this.f == null) {
            this.f = new HashMap<>();
        }
        return this.f.get(str);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return a(arrayList);
    }

    private boolean a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfaf7e46", new Object[]{this, arrayList})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return a();
        }
        String remove = arrayList.remove(0);
        if (a(remove)) {
            return this.f.get(remove).a(arrayList);
        }
        return a();
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "1".equalsIgnoreCase(this.d);
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }
}
