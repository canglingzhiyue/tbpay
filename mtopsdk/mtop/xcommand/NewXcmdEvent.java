package mtopsdk.mtop.xcommand;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class NewXcmdEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String value;

    static {
        kge.a(-1039514934);
    }

    public NewXcmdEvent(String str) {
        this.value = str;
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this}) : this.value;
    }

    public void setValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
        } else {
            this.value = str;
        }
    }
}
