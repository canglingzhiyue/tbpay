package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.utils.p;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class ffp implements j<enu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27902a;
    private String b;

    static {
        kge.a(-1120550605);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(enu enuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enuVar}) : a(enuVar);
    }

    public ffp(Context context, String str) {
        this.f27902a = context;
        this.b = str;
        emu.a("com.taobao.android.detail.wrapper.newdesc.event.OpenUrlSubscriber");
    }

    public i a(enu enuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("30ca8c43", new Object[]{this, enuVar});
        }
        if (TextUtils.isEmpty(enuVar.f27479a)) {
            return a.FAILURE;
        }
        if (!TextUtils.isEmpty(enuVar.d)) {
            eps.a(this.f27902a, enuVar.d, enuVar.c);
        }
        Application a2 = epo.a();
        if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(enuVar.f27479a)) {
            enuVar.f27479a = p.a(enuVar.f27479a, "pre_item_id", this.b);
        }
        if (enuVar.f27479a.contains("currentClickTime=")) {
            enuVar.f27479a = a(enuVar.f27479a, "currentClickTime", String.valueOf(System.currentTimeMillis()));
        }
        if (enuVar.b == null) {
            epq.a(a2, enuVar.f27479a);
        } else {
            epq.a(a2, enuVar.f27479a, enuVar.b);
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        if (str.contains("?")) {
            String[] split = str.split("\\?");
            String[] split2 = split[1].split("&");
            sb.append(split[0]);
            while (i < split2.length) {
                sb.append(i == 0 ? "?" : "&");
                String str4 = split2[i];
                if (str4.indexOf(str2) == 0) {
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                } else {
                    sb.append(str4);
                }
                i++;
            }
        } else {
            sb.append(str);
            sb.append("?");
            sb.append(str2);
            sb.append("=");
            sb.append(str3);
        }
        return sb.toString();
    }
}
