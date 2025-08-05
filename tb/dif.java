package tb;

import com.ali.alidatabasees.ResultSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfsadapter.c;

/* loaded from: classes.dex */
public class dif extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.ali.alidatabasees.c f26783a;
    private final ResultSet b;

    public dif(com.ali.alidatabasees.c cVar, ResultSet resultSet) {
        this.f26783a = cVar;
        this.b = resultSet;
    }

    @Override // com.taobao.alivfsadapter.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ResultSet resultSet = this.b;
        if (resultSet != null) {
            resultSet.a();
        }
        com.ali.alidatabasees.c cVar = this.f26783a;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    @Override // com.taobao.alivfsadapter.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b.b();
    }

    @Override // com.taobao.alivfsadapter.c
    public long a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938f", new Object[]{this, new Integer(i)})).longValue() : this.b.c(i);
    }

    @Override // com.taobao.alivfsadapter.c
    public String b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)}) : this.b.a(i);
    }

    @Override // com.taobao.alivfsadapter.c
    public byte[] c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("c5dd5724", new Object[]{this, new Integer(i)}) : this.b.d(i);
    }
}
