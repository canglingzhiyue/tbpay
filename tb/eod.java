package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eod extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27488a;
    public String b;

    static {
        kge.a(-1931608332);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public eod(String str, String str2) {
        this.f27488a = "";
        this.b = "";
        if (!StringUtils.isEmpty(str)) {
            this.f27488a = str;
        }
        if (!StringUtils.isEmpty(str2)) {
            this.b = str2;
        }
        emu.a("com.taobao.android.detail.datasdk.event.sku.OpenAreaPickerWeexPageEvent");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f27488a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
