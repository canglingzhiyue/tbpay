package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;

/* loaded from: classes2.dex */
public class bcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final bcd f25792a;
    private String e;

    public static /* synthetic */ String a(bcd bcdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82b86c41", new Object[]{bcdVar, str});
        }
        bcdVar.e = str;
        return str;
    }

    static {
        kge.a(1947951172);
        f25792a = new bcd();
    }

    private bcd() {
        b.a(new b.a() { // from class: tb.bcd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("246661b", new Object[]{this, language, str});
                    return;
                }
                bcd.a(bcd.this, null);
                CheckHoldManager.a().a(2, null, null, false);
            }
        });
    }

    public static bcd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcd) ipChange.ipc$dispatch("f02b13b", new Object[0]) : f25792a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.e = str;
        }
    }
}
