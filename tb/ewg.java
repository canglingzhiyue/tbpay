package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.basic.a;
import com.taobao.android.detail.sdk.event.basic.f;
import com.taobao.android.detail.sdk.event.basic.g;
import com.taobao.android.detail.sdk.event.basic.h;
import com.taobao.android.detail.sdk.event.basic.i;
import com.taobao.android.detail.sdk.event.basic.j;
import com.taobao.android.detail.sdk.event.basic.k;
import com.taobao.android.detail.sdk.event.basic.l;
import com.taobao.android.detail.sdk.event.basic.m;
import com.taobao.android.detail.sdk.event.basic.n;
import com.taobao.android.detail.sdk.event.basic.o;
import com.taobao.android.detail.sdk.event.basic.p;
import com.taobao.android.detail.sdk.event.basic.r;
import com.taobao.android.detail.sdk.event.basic.t;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.vmodel.main.TitleViewModel;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.b;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.d;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.q;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.y;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.z;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public class ewg implements evy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1298894202);
        kge.a(-1918188576);
    }

    public ewg() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.EventFactory");
    }

    @Override // tb.evy
    public Event a(ActionModel actionModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("f5d82f3b", new Object[]{this, actionModel, nodeBundle});
        }
        if (actionModel != null && !StringUtils.isEmpty(actionModel.type)) {
            if ("open_url".equals(actionModel.type)) {
                return new r(actionModel.params);
            }
            if (rrv.GO_BACK.equals(actionModel.type)) {
                return new f();
            }
            if ("share".equals(actionModel.type)) {
                return b(actionModel, nodeBundle);
            }
            if ("open_inter_sizing_chart".equals(actionModel.type)) {
                return new evn(nodeBundle);
            }
            if ("open_sizing_chart".equals(actionModel.type)) {
                return new evo(nodeBundle);
            }
            if (s.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new evg();
            }
            if ("user_track".equals(actionModel.type)) {
                return new t(actionModel.params, nodeBundle.root);
            }
            if (b.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new evd();
            }
            if (com.taobao.android.detail.ttdetail.handler.bizhandlers.f.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new eve(actionModel.params);
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
            if ("open_sale_promotion2".equals(actionModel.type)) {
                return new o(nodeBundle);
            }
            if ("open_endorsement".equals(actionModel.type)) {
                return new evh();
            }
            if ("ut_exposure".equals(actionModel.type)) {
                return new com.taobao.android.detail.sdk.event.basic.b(actionModel.params);
            }
            if ("open_purchase_limit".equals(actionModel.type)) {
                return new m(actionModel.params);
            }
            if ("open_jhs_marketing".equals(actionModel.type)) {
                return new evi(nodeBundle);
            }
            if ("open_services".equals(actionModel.type)) {
                return new evm(actionModel.params);
            }
            if ("open_tax_desc".equals(actionModel.type)) {
                return new p(nodeBundle);
            }
            if ("locator".equals(actionModel.type)) {
                return new a(actionModel.params);
            }
            if (com.taobao.android.detail.ttdetail.handler.bizhandlers.r.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new l(nodeBundle, actionModel.params);
            }
            if (com.taobao.android.detail.ttdetail.handler.bizhandlers.i.EVENT_TYPE.equals(actionModel.type)) {
                return new evf();
            }
            if (q.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new k(actionModel.params);
            }
            if (y.EVENT_TYPE_ALTERNATIVE.equals(actionModel.type)) {
                return new com.taobao.android.detail.sdk.event.basic.q(actionModel.params);
            }
            if ("open_coupon_info".equals(actionModel.type)) {
                return new h(nodeBundle);
            }
            if ("open_guarantee".equals(actionModel.type)) {
                return new j(nodeBundle);
            }
            if ("open_redpacket".equals(actionModel.type)) {
                return new n(actionModel.params, nodeBundle);
            }
            if (com.taobao.android.detail.ttdetail.handler.bizhandlers.n.EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE.equals(actionModel.type)) {
                return new g(actionModel.params);
            }
        }
        return null;
    }

    private Event b(ActionModel actionModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("cbf76c3c", new Object[]{this, actionModel, nodeBundle});
        }
        JSONObject jSONObject = actionModel.params;
        if (jSONObject.containsKey("iconType") && !StringUtils.isEmpty(jSONObject.getString("iconType"))) {
            int parseInt = Integer.parseInt(jSONObject.getString("iconType"));
            if (parseInt == 1) {
                return new evp(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, actionModel.params);
            }
            if (parseInt == 2) {
                return new evp(TitleViewModel.ShareType.SHARE_TYPE_PRESENT);
            }
            if (parseInt == 3) {
                return new evp(TitleViewModel.ShareType.SHARE_TYPE_GIFT);
            }
            if (parseInt == 4) {
                return new evp(TitleViewModel.ShareType.SHARE_TYPE_AWARD);
            }
            return new evp(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, actionModel.params);
        }
        return new evp(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, actionModel.params);
    }
}
