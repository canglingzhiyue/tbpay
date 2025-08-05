package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.homepage.request.SettingGetResult;

/* loaded from: classes7.dex */
public class kxn implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SettingGetResult f30382a;
    private final String b;

    static {
        kge.a(701975324);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 50041;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public kxn(SettingGetResult settingGetResult, String str) {
        this.f30382a = settingGetResult;
        this.b = str;
    }

    public SettingGetResult a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SettingGetResult) ipChange.ipc$dispatch("2120d4c", new Object[]{this}) : this.f30382a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
