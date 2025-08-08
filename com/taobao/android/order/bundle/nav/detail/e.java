package com.taobao.android.order.bundle.nav.detail;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import tb.hxd;
import tb.hyk;
import tb.hyn;
import tb.hyq;
import tb.ibm;
import tb.kge;

/* loaded from: classes.dex */
public class e extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14562a = "V2ToV1ToH5Task";

    static {
        kge.a(714212600);
    }

    @Override // com.taobao.android.order.bundle.nav.b
    public /* synthetic */ boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue() : b((Intent) obj);
    }

    @Override // com.taobao.android.order.bundle.nav.a
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue() : "TBOrderDetailActivity".equals(hxd.c(intent));
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null) {
            String a2 = hxd.a(intent);
            String b = hxd.b(intent);
            String e = hyk.e();
            boolean isEmpty = StringUtils.isEmpty(a2);
            boolean isEmpty2 = StringUtils.isEmpty(e);
            if (isEmpty || isEmpty2) {
                a.a(13, intent, "orderId =" + isEmpty + "| degradeUlr empty =" + isEmpty2);
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CoreConstants.IN_PARAM_BIZ_ORDER_ID, (Object) a2);
            jSONObject.put(CoreConstants.IN_PARAM_ARCHIVE, (Object) b);
            Uri parse = Uri.parse(ibm.a(e, jSONObject));
            intent.setData(parse);
            String[] strArr = new String[1];
            strArr[0] = parse != null ? parse.toString() : "";
            hyn.a(CoreConstants.NAV_TAG, "ODV2ToV1ToH5Task", strArr);
            hyq.a("V2ToV1ToH5Task", "V2-downGrade-ODH5", "V2-downGrade-ODH5");
        }
        return true;
    }
}
