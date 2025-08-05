package tb;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.detail.core.debug.a;
import com.taobao.android.detail.core.detail.kit.utils.l;

/* loaded from: classes4.dex */
public class efi implements efh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27270a;
    private Context b;
    private String c;
    private String d;

    static {
        kge.a(17705007);
        kge.a(1880844890);
    }

    public efi(Context context, String str, String str2, String str3) {
        this.b = context;
        this.f27270a = str;
        this.c = str2;
        this.d = str3;
        emu.a("com.taobao.android.detail.core.event.subscriber.title.CopyAction");
    }

    @Override // tb.efh
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        l.a(this.b, this.f27270a);
        if (this.d == null || !ecu.I) {
            return;
        }
        if ("CopyTitle".equals(this.c)) {
            AlimamaAdvertising.instance().commitCpsInitiativeAction(this.d, "1", "1", null);
            if (!a.a(this.b)) {
                return;
            }
            Toast.makeText(this.b, "mama上报拷贝标题", 0).show();
        } else if (!"CopyLink".equals(this.c)) {
        } else {
            AlimamaAdvertising.instance().commitCpsInitiativeAction(this.d, "1", "2", null);
            if (!a.a(this.b)) {
                return;
            }
            Toast.makeText(this.b, "mama上报拷贝链接", 0).show();
        }
    }
}
