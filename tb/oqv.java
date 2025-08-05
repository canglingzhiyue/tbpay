package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.themis.kernel.i;

/* loaded from: classes.dex */
public class oqv extends oqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(450688960);
    }

    public static /* synthetic */ Object ipc$super(oqv oqvVar, String str, Object... objArr) {
        if (str.hashCode() == 2023863228) {
            super.a((ope) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public oqv(String str) {
        super(str);
    }

    @Override // tb.oqs
    public void a(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a1b3bc", new Object[]{this, opeVar, jSONObject});
            return;
        }
        super.a(opeVar, jSONObject);
        laq c = laq.a().a("MTopRequest").b("dataProcess").c("MainLandSubContainerDataProcess;");
        c.a(i.CDN_REQUEST_TYPE, jSONObject.getString(i.CDN_REQUEST_TYPE));
        AwesomeGetContainerData b = opeVar.b(oqc.a().m());
        if (b == null) {
            c.a("containerData", "null").b();
            return;
        }
        if (b.base != null && b.base.ext != null && b.base.dataChange && b.base.isFirstPage) {
            b.base.infoFlowCardStartBizCode = b.base.ext.getString("feedsStartSectionBizCode");
            c.a("infoFlowCardStartBizCode", b.base.infoFlowCardStartBizCode);
            JSONObject jSONObject2 = b.base.ext.getJSONObject("ucpConfig");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            lar.g("addBizFeatures");
            UppProtocolImpl.getInstance().addBizFeatures(jSONObject2, "Page_Home_Sub");
            lar.h("addBizFeatures");
            c.a("ucpConfig content ", jSONObject2.toString());
        }
        lar.g("uploadEvent");
        c.b();
        lar.h("uploadEvent");
    }
}
