package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.popup.OpenCommonDialogEvent;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;

/* loaded from: classes4.dex */
public class eeo extends eei<OpenCommonDialogEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27239a;
    private String b;
    private String c;

    static {
        kge.a(1742458195);
    }

    public static /* synthetic */ Object ipc$super(eeo eeoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.event.subscriber.basic.OpenCommonDialogSubscriber";
    }

    public static /* synthetic */ String a(eeo eeoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b3b1b17", new Object[]{eeoVar}) : eeoVar.b;
    }

    public static /* synthetic */ DetailCoreActivity b(eeo eeoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("65608cb5", new Object[]{eeoVar}) : eeoVar.f27239a;
    }

    public static /* synthetic */ String c(eeo eeoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c947255", new Object[]{eeoVar}) : eeoVar.c;
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((OpenCommonDialogEvent) event);
    }

    public eeo(DetailCoreActivity detailCoreActivity) {
        this.f27239a = detailCoreActivity;
    }

    public i a(OpenCommonDialogEvent openCommonDialogEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f0474b8", new Object[]{this, openCommonDialogEvent});
        }
        com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.i.a("OpenCommonDialogSubscriber", BTags.CommonDlg), "handleEvent");
        String str = this.f27239a.f9411a.f27180a;
        String b = b(openCommonDialogEvent);
        if (!StringUtils.isEmpty(b)) {
            com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.i.a("OpenCommonDialogSubscriber", BTags.CommonDlg), b);
            eca.a(this.f27239a, "MegaFloat", this.b, str, this.c, b);
            return i.FAILURE;
        }
        eca.a(this.f27239a, "MegaFloat", this.b, str, this.c);
        return i.SUCCESS;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String b(com.taobao.android.detail.core.event.popup.OpenCommonDialogEvent r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eeo.b(com.taobao.android.detail.core.event.popup.OpenCommonDialogEvent):java.lang.String");
    }

    private JSONObject a(OpenCommonDialogEvent.DataModel dataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ebff3fc", new Object[]{this, dataModel});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("popId", (Object) dataModel.popId);
        jSONObject.put("bizId", (Object) "tbDetail");
        if (!StringUtils.isEmpty(dataModel.popConfig)) {
            jSONObject.put(c.KEY_POP_CONFIG, JSONObject.parse(dataModel.popConfig));
        }
        jSONObject.put("url", (Object) dataModel.url);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("token", (Object) this.f27239a.h);
        jSONObject2.put("itemId", (Object) this.f27239a.f9411a.f27180a);
        jSONObject2.put("bizId", (Object) "tbDetail");
        jSONObject2.put("popId", (Object) dataModel.popId);
        jSONObject.put("queryParams", (Object) jSONObject2);
        if (dataModel.exParams != null) {
            jSONObject.putAll(dataModel.exParams.getInnerMap());
        }
        return jSONObject;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
