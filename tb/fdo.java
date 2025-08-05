package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.search.common.util.k;
import java.net.URLEncoder;

/* loaded from: classes5.dex */
public class fdo implements j<ens> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27841a;

    static {
        kge.a(89700603);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(ens ensVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, ensVar}) : a(ensVar);
    }

    public fdo(Activity activity) {
        this.f27841a = activity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.promotion.OpenPopLayerSubscriber");
    }

    public i a(ens ensVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("97ae541", new Object[]{this, ensVar});
        }
        String str = ensVar.f27476a;
        if (TextUtils.isEmpty(str)) {
            return i.FAILURE;
        }
        if (Uri.parse(str).getScheme() == null) {
            str = k.HTTPS_PREFIX + parse.getSchemeSpecificPart();
        }
        try {
            epj.f().navigateTo(this.f27841a, "poplayer://abcd?openType=directly&uuid=" + System.currentTimeMillis() + "&params=" + URLEncoder.encode(String.format("{\"url\":\"%s\"}", str), "UTF-8"), null);
        } catch (Throwable unused) {
        }
        com.taobao.android.detail.core.utils.i.b("Detail", str);
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
