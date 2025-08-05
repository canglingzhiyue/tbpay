package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b;
import com.taobao.informationflowdataservice.dataservice.utils.environment.a;

/* loaded from: classes7.dex */
public class lxc implements lxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lxa f30964a;

    static {
        kge.a(529800802);
        kge.a(-940189207);
    }

    public lxc(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f30964a = new lxa(str, new a(), b());
        lxl.c("qinren", "DataSourceEngine use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
    }

    public lxc(String str, lxh lxhVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        lxm.a(lxhVar.a().getApplication());
        this.f30964a = new lxa(str, lxhVar, b());
        lxl.c("qinren", "DataSourceEngine use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
    }

    public lxc(String str, lxk lxkVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f30964a = new lxa(str, new a(), lxkVar);
        lxl.c("qinren", "DataSourceEngine use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
    }

    private lxk b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lxk) ipChange.ipc$dispatch("16b931fe", new Object[]{this}) : new lxk() { // from class: tb.lxc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lxk
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return false;
            }
        };
    }

    @Override // tb.lxb
    public boolean a(lwc lwcVar, lxg lxgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa4f43d9", new Object[]{this, lwcVar, lxgVar})).booleanValue() : this.f30964a.a(lwcVar, lxgVar);
    }

    @Override // tb.lxb
    public boolean a(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5a34ce7", new Object[]{this, str, strArr, jSONObject})).booleanValue() : this.f30964a.a(str, strArr, jSONObject);
    }

    @Override // tb.lxb
    public AwesomeGetContainerData a(lwc lwcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetContainerData) ipChange.ipc$dispatch("a4c1bc0c", new Object[]{this, lwcVar}) : this.f30964a.a(lwcVar);
    }

    @Override // tb.lxb
    public lwf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwf) ipChange.ipc$dispatch("f078843", new Object[]{this}) : this.f30964a.a();
    }

    @Override // tb.lxb
    public boolean a(lwc lwcVar, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("646e43bf", new Object[]{this, lwcVar, bVar})).booleanValue() : this.f30964a.a(lwcVar, bVar);
    }

    @Override // tb.lxb
    public BaseSectionModel<?> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("8d852056", new Object[]{this, jSONObject}) : new SectionModel(jSONObject);
    }
}
