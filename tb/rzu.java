package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.network.domain.b;
import mtopsdk.ssrcore.c;
import mtopsdk.ssrcore.callback.SsrCallbackImpl;
import mtopsdk.ssrcore.d;
import tb.mtk;
import tb.ryn;

/* loaded from: classes9.dex */
public class rzu implements ryp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f33440a;
    public rzl b;
    private boolean c = false;
    private boolean d = false;

    @Override // tb.ryp
    public void onCancel(ryn rynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7900349", new Object[]{this, rynVar});
        }
    }

    @Override // tb.ryp
    public void onFailure(ryn rynVar, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbccbab", new Object[]{this, rynVar, exc});
        }
    }

    public static /* synthetic */ boolean a(rzu rzuVar, int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bbd9fa6", new Object[]{rzuVar, new Integer(i), str})).booleanValue() : rzuVar.a(i, str);
    }

    public static /* synthetic */ boolean a(rzu rzuVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a310599", new Object[]{rzuVar, str})).booleanValue() : rzuVar.a(str);
    }

    public static /* synthetic */ void b(rzu rzuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af19cdd6", new Object[]{rzuVar, str});
        } else {
            rzuVar.b(str);
        }
    }

    public rzu(c cVar) {
        this.f33440a = cVar;
        if (cVar != null) {
            ryi ryiVar = cVar.j.getMtopConfig().mFilterManager;
            if (!(ryiVar instanceof rzl)) {
                return;
            }
            this.b = (rzl) ryiVar;
        }
    }

    public void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e92aa2", new Object[]{this, bVar});
            return;
        }
        this.f33440a.d.y = this.f33440a.d.a();
        mtopsdk.ssrcore.util.b.a(this.f33440a.f25036a.handler, new Runnable() { // from class: tb.rzu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(bVar.d, HttpHeaderConstant.X_RETCODE);
                    String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(bVar.d, "x-sec-reason");
                    String singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(bVar.d, HttpConstant.LOCATION);
                    if (rzu.a(rzu.this, singleHeaderFieldByKey) || rzu.a(rzu.this, singleHeaderFieldByKey2) || !rzu.a(rzu.this, bVar.b, singleHeaderFieldByKey3)) {
                        rzu.this.f33440a.d.z = rzu.this.f33440a.d.a();
                        d.c(rzu.this.f33440a.d);
                        rzu.this.f33440a.d.H = bVar.f;
                        rzu.this.f33440a.f = new mtk.a().a(bVar.b).a(singleHeaderFieldByKey).a(bVar.d).b(bVar.c).a();
                        rzu.this.b.b(null, rzu.this.f33440a);
                        return;
                    }
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                        String str = rzu.this.f33440a.b;
                        TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", str, "redirect location=" + singleHeaderFieldByKey3);
                    }
                    rzu.b(rzu.this, singleHeaderFieldByKey3);
                } catch (Throwable th) {
                    TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", rzu.this.f33440a.b, "onFinish failed.", th);
                }
            }
        }, this.f33440a.b.hashCode());
    }

    public void a(final int i, final Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            return;
        }
        a(map);
        this.c = a(map, i);
        if (this.c) {
            return;
        }
        this.f33440a.d.p = this.f33440a.d.a();
        mtopsdk.ssrcore.util.b.a(this.f33440a.f25036a.handler, new Runnable() { // from class: tb.rzu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopListener mtopListener = rzu.this.f33440a.k;
                if (!(mtopListener instanceof SsrCallbackImpl)) {
                    return;
                }
                String str = rzu.this.f33440a.b;
                TBSdkLog.d("ssr.SsrNetworkCallbackAdapter", str, "onResponse code" + i);
                ((SsrCallbackImpl) mtopListener).onResponse(rzu.this.f33440a.g, i, map);
            }
        }, this.f33440a.b.hashCode());
    }

    private void a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.X_SERVICE_DOMAIN);
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.X_SSR_TOKEN_VALIDATION);
            if (!StringUtils.isEmpty(singleHeaderFieldByKey2)) {
                this.f33440a.d.T = singleHeaderFieldByKey2;
            }
            if (StringUtils.isEmpty(singleHeaderFieldByKey)) {
                return;
            }
            this.f33440a.d.X = singleHeaderFieldByKey;
            mtopsdk.ssrcore.util.c.a(this.f33440a.j.getMtopConfig().context, Uri.parse(this.f33440a.g.f31244a).getHost(), singleHeaderFieldByKey);
        } catch (Throwable th) {
            TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", this.f33440a.b, "ssr domain parse error", th);
        }
    }

    public void a(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (this.c) {
        } else {
            if (!this.d) {
                this.f33440a.d.ae = this.f33440a.d.a();
                this.f33440a.d.ac = System.currentTimeMillis();
                this.f33440a.d.ad = bArr != null ? bArr.length : 0L;
                this.d = true;
            }
            mtopsdk.ssrcore.util.b.a(this.f33440a.f25036a.handler, new Runnable() { // from class: tb.rzu.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MtopListener mtopListener = rzu.this.f33440a.k;
                    if (!(mtopListener instanceof SsrCallbackImpl)) {
                        return;
                    }
                    TBSdkLog.d("ssr.SsrNetworkCallbackAdapter", rzu.this.f33440a.b, "onReceiveData");
                    ((SsrCallbackImpl) mtopListener).onReceiveData(rzu.this.f33440a.g, bArr);
                }
            }, this.f33440a.b.hashCode());
        }
    }

    @Override // tb.ryp
    public void onResponse(ryn rynVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b906f0a", new Object[]{this, rynVar, bVar});
        } else {
            a(bVar);
        }
    }

    public boolean a(Map<String, List<String>> map, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee00a48a", new Object[]{this, map, new Integer(i)})).booleanValue();
        }
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.X_RETCODE);
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "x-sec-reason");
            boolean a2 = a(i, HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.LOCATION));
            if (!a(singleHeaderFieldByKey)) {
                if (!a(singleHeaderFieldByKey2)) {
                    z = false;
                    return !z || a2;
                }
            }
            z = true;
            if (!z) {
            }
        } catch (Throwable th) {
            TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", this.f33440a.b, "shouldInterruptedCallback.", th);
            return false;
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ErrorConstant.isSessionInvalid(str) && this.f33440a.h.g() == 0 && !StringUtils.equals(this.f33440a.h.i(), "none");
    }

    private boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue() : !StringUtils.isEmpty(str) && mtopsdk.ssrcore.util.b.a(this.f33440a.h.e, i);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ryn.a aVar = this.f33440a.j.getMtopConfig().callFactory;
        c cVar = this.f33440a;
        cVar.e = cVar.e.a().a(str).a();
        aVar.a(this.f33440a.e).a(new rzu(this.f33440a));
        this.f33440a.h.e++;
    }
}
