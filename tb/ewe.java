package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.basic.f;
import com.taobao.android.detail.sdk.event.basic.i;
import com.taobao.android.detail.sdk.event.basic.k;
import com.taobao.android.detail.sdk.event.basic.o;
import com.taobao.android.detail.sdk.event.basic.r;
import com.taobao.android.detail.sdk.event.basic.t;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.vmodel.main.TitleViewModel;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.b;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.d;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.q;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.z;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public class ewe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-982955605);
    }

    public ewe() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.DescEventFactory");
    }

    public Event a(ActionModel actionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("70d46a61", new Object[]{this, actionModel, jSONObject});
        }
        if (actionModel != null && !StringUtils.isEmpty(actionModel.type)) {
            if ("open_url".equals(actionModel.type)) {
                return new r(actionModel.params);
            }
            if (rrv.GO_BACK.equals(actionModel.type)) {
                return new f();
            }
            if ("share".equals(actionModel.type)) {
                return new evp(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT);
            }
            if (s.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new evg();
            }
            if ("user_track".equals(actionModel.type)) {
                return new t(actionModel.params, jSONObject);
            }
            if (b.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new evd();
            }
            if (com.taobao.android.detail.ttdetail.handler.bizhandlers.f.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new eve();
            }
            if (d.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new evj(actionModel.params);
            }
            if ("open_coupons".equals(actionModel.type)) {
                return new i(actionModel.params);
            }
            if (z.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new com.taobao.android.detail.sdk.event.basic.s(actionModel.params);
            }
            if ("open_sale_promotion".equals(actionModel.type)) {
                return new o(actionModel.params);
            }
            if ("ut_exposure".equals(actionModel.type)) {
                return new com.taobao.android.detail.sdk.event.basic.b(actionModel.params);
            }
            if (q.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new k(actionModel.params);
            }
        }
        return null;
    }
}
