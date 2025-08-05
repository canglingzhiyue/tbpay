package tb;

import android.content.Context;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.parse.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.duu;

/* loaded from: classes4.dex */
public class eun {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_CONFIG = "aura/aura_detail_inside_config.json";
    public static final String WORK_FLOW_RENDER = "aura.workflow.render";

    /* renamed from: a  reason: collision with root package name */
    private dus f27586a;
    private final Context b;

    public eun(Context context) {
        this.b = context;
    }

    public dus a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dus) ipChange.ipc$dispatch("f03df5c", new Object[]{this});
        }
        if (this.f27586a == null) {
            this.f27586a = new dus(this.b, new duu.a().a(AURA_CONFIG).a(c()).a());
        }
        return this.f27586a;
    }

    private IAURAPluginCenter[] c() {
        try {
            return new IAURAPluginCenter[]{(IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURATBDetailWrapperPluginCenter").newInstance(), (IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURATBDetailCorePluginCenter").newInstance()};
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public AURAParseIO a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAParseIO) ipChange.ipc$dispatch("3915cbbe", new Object[]{this, jSONObject});
        }
        a aVar = new a(jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        return new AURAParseIO(arrayList);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        dus dusVar = this.f27586a;
        if (dusVar == null) {
            return;
        }
        dusVar.a();
    }
}
