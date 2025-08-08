package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.wrapper.ext.event.subscriber.sku.a;
import com.taobao.android.trade.event.Event;

/* loaded from: classes5.dex */
public class fdy implements eon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1930239480);
        kge.a(1453338762);
    }

    public fdy() {
        emu.a("com.taobao.android.detail.wrapper.ext.factory.TBEventFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0146, code lost:
        if (r12.equals("open_endorsement") != false) goto L15;
     */
    @Override // tb.eon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.trade.event.Event a(com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel r9, com.taobao.android.detail.datasdk.model.datamodel.node.b r10, com.alibaba.fastjson.JSONObject r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fdy.a(com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel, com.taobao.android.detail.datasdk.model.datamodel.node.b, com.alibaba.fastjson.JSONObject, java.util.Map):com.taobao.android.trade.event.Event");
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("80833941", new Object[]{this, str});
        }
        a a2 = a();
        a2.a(str);
        return a2;
    }

    private a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c88297a0", new Object[]{this, str});
        }
        a a2 = a();
        a2.b(str);
        return a2;
    }

    private a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("779ca4cb", new Object[]{this});
        }
        a aVar = new a();
        aVar.a(true);
        return aVar;
    }

    private Event a(ActionModel actionModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("96c09beb", new Object[]{this, actionModel, bVar});
        }
        JSONObject jSONObject = actionModel.params;
        if (jSONObject.containsKey("iconType") && !StringUtils.isEmpty(jSONObject.getString("iconType"))) {
            int parseInt = Integer.parseInt(jSONObject.getString("iconType"));
            if (parseInt == 1) {
                return new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, actionModel.params);
            }
            if (parseInt == 2) {
                return new eoi(TitleViewModel.ShareType.SHARE_TYPE_PRESENT);
            }
            if (parseInt == 3) {
                return new eoi(TitleViewModel.ShareType.SHARE_TYPE_GIFT);
            }
            if (parseInt == 4) {
                return new eoi(TitleViewModel.ShareType.SHARE_TYPE_AWARD);
            }
            return new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, actionModel.params);
        }
        return new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT, actionModel.params);
    }
}
