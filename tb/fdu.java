package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.net.URLEncoder;

/* loaded from: classes5.dex */
public class fdu implements j<fcr> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27847a;

    static {
        kge.a(19891631);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fcr fcrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fcrVar}) : a(fcrVar);
    }

    public fdu(Activity activity) {
        this.f27847a = activity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.tmall.OpenTmallAppSubscriber");
    }

    public i a(fcr fcrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("90474e2c", new Object[]{this, fcrVar});
        }
        if (StringUtils.isEmpty(fcrVar.f27810a)) {
            return a.FAILURE;
        }
        try {
            epq.a(this.f27847a, String.format("tbout://m.taobao.com/out.htm?url=%s&linkKey=tmall&degradeH5Url=%s&visa=8038aae9c566568b&meanwhile=true", URLEncoder.encode(a(fcrVar.f27810a), "UTF-8"), URLEncoder.encode(fcrVar.f27810a, "UTF-8")));
        } catch (Throwable unused) {
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("dl_redirect");
            return queryParameter == null ? "" : queryParameter;
        } catch (Throwable unused) {
            return "";
        }
    }
}
