package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.tao.infoflow.multitab.e;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes4.dex */
public class egu extends egv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27299a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;

    static {
        kge.a(-1174997845);
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 188;
    }

    @Override // tb.egv, tb.epi, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.bottombar.BottomBarWaitForStartViewModel";
    }

    public egu(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        this.f27299a = WXExceptionConfig.EXCEPTION_JS_RUNTIME_ERROR;
        TradeNode e = eqb.e(bVar);
        ItemNode c = eqb.c(bVar);
        if (e.isWaitForStart) {
            this.b = e.startTime.longValue();
            long j = this.b;
            this.c = 3600000 + j;
            this.d = a(j);
            this.e = c.title;
            this.f = c.itemUrl;
        }
        this.g = componentModel.mapping.getBooleanValue("needHideTips");
        this.h = epw.a(componentModel.mapping.getString(e.KEY_BG_COLOR));
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

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.A;
    }

    public egu(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        this.f27299a = WXExceptionConfig.EXCEPTION_JS_RUNTIME_ERROR;
        TradeNode e = eqb.e(bVar);
        ItemNode c = eqb.c(bVar);
        if (e.isWaitForStart) {
            this.b = e.startTime.longValue();
            long j = this.b;
            this.c = 3600000 + j;
            this.d = a(j);
            this.e = c.title;
            this.f = c.itemUrl;
        }
        this.g = iDMComponent.getFields().getBooleanValue("needHideTips");
        this.h = epw.a(iDMComponent.getFields().getString(e.KEY_BG_COLOR));
    }
}
