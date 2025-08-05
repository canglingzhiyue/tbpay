package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.tao.infoflow.multitab.e;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes4.dex */
public class exj extends exk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27627a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;

    static {
        kge.a(-1120720367);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public int getMiniWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13b808f3", new Object[]{this})).intValue();
        }
        return 188;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_BOTTOM_BAR_WAIT_FOR_SATRT;
    }

    public exj(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.f27627a = WXExceptionConfig.EXCEPTION_JS_RUNTIME_ERROR;
        tpc.a("com.taobao.android.detail.sdk.vmodel.bottombar.BottomBarWaitForStartViewModel");
        if (nodeBundle.tradeNode.isWaitForStart) {
            this.b = nodeBundle.tradeNode.startTime.longValue();
            long j = this.b;
            this.c = 3600000 + j;
            this.d = a(j);
            this.e = nodeBundle.itemNode.title;
            this.f = nodeBundle.itemNode.itemUrl;
        }
        this.g = componentModel.mapping.getBooleanValue("needHideTips");
        this.h = c.a(componentModel.mapping.getString(e.KEY_BG_COLOR));
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM.dd HH:mm");
        return simpleDateFormat.format(date) + "开售";
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public double getWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue() : this.A;
    }
}
