package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;

/* loaded from: classes.dex */
public class kvs extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETDATAFROMMODEL = 7444296532363656600L;

    static {
        kge.a(-2092940561);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            ope b = oqc.a().b();
            if (b != null) {
                for (SectionModel sectionModel : b.g(ksk.NEW_FACE_PARENT.f30287a)) {
                    if (TextUtils.equals(str, sectionModel.getString("sectionBizCode"))) {
                        return sectionModel.get(str2);
                    }
                }
            }
        }
        return null;
    }
}
