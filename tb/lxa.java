package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b;

/* loaded from: classes7.dex */
public class lxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwd f30963a;
    private lwz b;
    private lxi c;
    private lwu d;

    static {
        kge.a(1801580184);
    }

    public lxa(String str, lxh lxhVar, lxk lxkVar) {
        lww.a("homepage_switch");
        this.f30963a = new lwd(lxhVar.a().getApplication(), str);
        lwe lweVar = new lwe();
        this.d = new lwu();
        this.b = new lwz(lxhVar, this.f30963a, this.d, lweVar);
        lweVar.a(this.b);
        this.c = new lxd(this.b, lxkVar);
        this.b.a(this.c);
    }

    public boolean a(lwc lwcVar, lxg lxgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa4f43d9", new Object[]{this, lwcVar, lxgVar})).booleanValue() : this.b.a(lwcVar, lxgVar);
    }

    public boolean a(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5a34ce7", new Object[]{this, str, strArr, jSONObject})).booleanValue() : this.c.a(str, strArr, jSONObject);
    }

    public AwesomeGetContainerData a(lwc lwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("a4c1bc0c", new Object[]{this, lwcVar});
        }
        if (lwcVar != null) {
            return this.f30963a.a(lwcVar.f30931a);
        }
        return null;
    }

    public lwf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwf) ipChange.ipc$dispatch("f078843", new Object[]{this}) : this.f30963a;
    }

    public boolean a(lwc lwcVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("646e43bf", new Object[]{this, lwcVar, bVar})).booleanValue();
        }
        if (lwcVar != null) {
            return this.b.a(lwcVar, bVar);
        }
        return false;
    }
}
