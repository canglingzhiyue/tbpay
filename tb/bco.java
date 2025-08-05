package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes2.dex */
public class bco extends bcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(57526581);
    }

    @Override // tb.bcj
    public void a(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e40d2", new Object[]{this, jnyVar, requestConfig});
        }
    }

    @Override // tb.bcj
    public void b(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2589f413", new Object[]{this, jnyVar, requestConfig});
        }
    }

    public bco(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // tb.bcj
    public void a(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b97d4c", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (iDMComponent == null || !"header".equals(iDMComponent.getTag())) {
        } else {
            iDMComponent.getFields().putAll((JSONObject) JSON.toJSON(this.f25799a.o().D()));
        }
    }
}
