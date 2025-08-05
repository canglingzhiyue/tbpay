package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.dispatch.a;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.List;

/* loaded from: classes.dex */
public class oqo extends tcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f32303a;
    private final oqn b;
    private final oqm c;
    private final oqp d;

    static {
        kge.a(-756801175);
    }

    @Override // tb.oqa
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.oqa
    public void a(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca449304", new Object[]{this, jSONObject, awesomeGetContainerData});
        }
    }

    @Override // tb.oqa
    public void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
        }
    }

    @Override // tb.oqa
    public boolean a(List<SectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561f324", new Object[]{this, list, bVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ String a(oqo oqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("af6fd715", new Object[]{oqoVar}) : oqoVar.f32303a;
    }

    public static /* synthetic */ oqp b(oqo oqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oqp) ipChange.ipc$dispatch("4211d88c", new Object[]{oqoVar}) : oqoVar.d;
    }

    public oqo(String str) {
        this.f32303a = str;
        this.b = new oqn(str);
        this.c = new oqm(str);
        this.d = new oqp(str);
    }

    @Override // tb.oqa
    public AwesomeGetContainerParams a(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetContainerParams) ipChange.ipc$dispatch("ba4a9d42", new Object[]{this, opeVar, jSONObject}) : this.b.a(opeVar, jSONObject);
    }

    @Override // tb.tcq, tb.oqa
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            oql.a().o().a(jSONObject, this.f32303a);
        }
    }

    @Override // tb.oqa
    public void c(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb90cefa", new Object[]{this, opeVar, jSONObject});
            return;
        }
        this.c.a(opeVar, jSONObject);
        oql.a().o().b(jSONObject, opeVar.b(this.f32303a), this.f32303a);
    }

    @Override // tb.tcq, tb.oqa
    public void b(final ope opeVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3219415b", new Object[]{this, opeVar, jSONObject});
        } else {
            a.b().c(new Runnable() { // from class: tb.oqo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        oql.a().i().a(opeVar.b(oqo.a(oqo.this)), jSONObject, oqo.a(oqo.this));
                    }
                }
            });
        }
    }

    @Override // tb.oqa
    public void d(final ope opeVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5085c99", new Object[]{this, opeVar, jSONObject});
        } else {
            a.b().c(new Runnable() { // from class: tb.oqo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    oqo.b(oqo.this).a(opeVar, jSONObject);
                    oql.a().i().b(opeVar.b(oqo.a(oqo.this)), jSONObject, oqo.a(oqo.this));
                }
            });
        }
    }
}
