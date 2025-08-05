package android.taobao.windvane.extra.uc;

import android.net.Uri;
import android.os.Handler;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.prefetch.ResourcePrefetch;
import android.taobao.windvane.extra.uc.prefetch.ResourceRequest;
import android.taobao.windvane.extra.uc.prefetch.UCDefaultUserAgent;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.mtc;
import tb.mtd;
import tb.mtf;
import tb.mtj;
import tb.mtk;

/* loaded from: classes2.dex */
public class SSRPrerenderService implements mtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WindVane/NetworkSSRPrerender";
    private final mtd mService;

    static {
        kge.a(-240564688);
        kge.a(-1825485896);
    }

    public static /* synthetic */ void access$000(SSRPrerenderService sSRPrerenderService, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bdf98a", new Object[]{sSRPrerenderService, str, str2});
        } else {
            sSRPrerenderService.prefetchResourceList(str, str2);
        }
    }

    public SSRPrerenderService() {
        if (j.commonConfig.cK) {
            this.mService = new DowngradableSSRService();
        } else {
            this.mService = mtf.b();
        }
    }

    @Override // tb.mtd
    public boolean asyncSend(mtj mtjVar, final mtc mtcVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d571220", new Object[]{this, mtjVar, mtcVar, handler})).booleanValue();
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return this.mService.asyncSend(mtjVar, new mtc() { // from class: android.taobao.windvane.extra.uc.SSRPrerenderService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mtc
            public void onResponse(mtj mtjVar2, int i, Map<String, List<String>> map) {
                int parseInt;
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a35e9ad6", new Object[]{this, mtjVar2, new Integer(i), map});
                    return;
                }
                if (map != null) {
                    try {
                        List<String> list = map.get("x-s-prerender-assets-length");
                        if (list != null) {
                            String str = list.get(0);
                            if (!TextUtils.isEmpty(str) && (parseInt = Integer.parseInt(str)) >= 0) {
                                atomicInteger.set(parseInt);
                            }
                        }
                    } catch (Exception unused) {
                        e.a(RVLLevel.Error, SSRPrerenderService.TAG, "failed to parse x-s-prerender-assets-length");
                    }
                }
                if (atomicInteger.get() <= 0) {
                    z = false;
                }
                e.a(RVLLevel.Info, SSRPrerenderService.TAG).a(InputFrame3.TYPE_RESPONSE).a("preRenderAssetsLength", Integer.valueOf(atomicInteger.get())).a("isPrerenderRequest", Boolean.valueOf(z)).a();
                mtcVar.onResponse(mtjVar2, i, map);
            }

            @Override // tb.mtc
            public void onReceiveData(mtj mtjVar2, byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8d536689", new Object[]{this, mtjVar2, bArr});
                } else if (bArr == null) {
                } else {
                    if (atomicInteger.get() > 0 && !atomicBoolean.get()) {
                        try {
                            byteArrayOutputStream.write(bArr);
                        } catch (IOException unused) {
                            e.a(RVLLevel.Error, SSRPrerenderService.TAG, "failed to write bytes");
                        }
                        try {
                            String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            if (byteArrayOutputStream2.length() < atomicInteger.get()) {
                                return;
                            }
                            String substring = byteArrayOutputStream2.substring(0, atomicInteger.get());
                            SSRPrerenderService.access$000(SSRPrerenderService.this, mtjVar2.f31244a, substring);
                            byte[] bytes = substring.getBytes(StandardCharsets.UTF_8);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (bytes.length < byteArray.length) {
                                mtcVar.onReceiveData(mtjVar2, Arrays.copyOfRange(byteArray, bytes.length, byteArray.length));
                            }
                            atomicBoolean.set(true);
                            return;
                        } catch (Exception unused2) {
                            e.a(RVLLevel.Error, SSRPrerenderService.TAG, "failed to parse resource list.");
                            return;
                        }
                    }
                    mtcVar.onReceiveData(mtjVar2, bArr);
                }
            }

            @Override // tb.mtc
            public void onError(mtj mtjVar2, mtk mtkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab769ea9", new Object[]{this, mtjVar2, mtkVar});
                } else {
                    mtcVar.onError(mtjVar2, mtkVar);
                }
            }

            @Override // tb.mtc
            public void onFinish(mtj mtjVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cfd81c6", new Object[]{this, mtjVar2});
                } else {
                    mtcVar.onFinish(mtjVar2);
                }
            }
        }, handler);
    }

    @Override // tb.mtd
    public boolean cancel(mtj mtjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9299d0f2", new Object[]{this, mtjVar})).booleanValue() : this.mService.cancel(mtjVar);
    }

    private void prefetchResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6ee3f6", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ResourcePrefetch.getInstance().prefetch(new ResourceRequest.Builder().setUrl(str).setMethod("GET").setHeader(HttpConstant.USER_AGENT, UCDefaultUserAgent.VALUE).build());
        }
    }

    private void prefetchResourceList(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a7b07e", new Object[]{this, str, str2});
        } else if (str2 != null) {
            try {
                String[] split = str2.split(",");
                for (int i = 0; i < split.length && i < j.commonConfig.cE; i++) {
                    String str3 = split[i];
                    if (str3 != null) {
                        try {
                            Uri parse = Uri.parse(str3);
                            if (parse != null) {
                                if (TextUtils.isEmpty(parse.getScheme())) {
                                    prefetchResource(makeAbsoluteURL(str, str3));
                                } else {
                                    prefetchResource(str3);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static String makeAbsoluteURL(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70c517b", new Object[]{str, str2});
        }
        if (str2 == null) {
            return null;
        }
        Uri parse = Uri.parse(str2);
        if (!TextUtils.isEmpty(parse.getScheme())) {
            return str2;
        }
        if (str == null) {
            return null;
        }
        Uri parse2 = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getAuthority())) {
            return parse.buildUpon().scheme(parse2.getScheme()).toString();
        }
        if (str2.startsWith("/")) {
            return parse.buildUpon().scheme(parse2.getScheme()).encodedAuthority(parse2.getEncodedAuthority()).toString();
        }
        String encodedPath = parse2.getEncodedPath();
        if (encodedPath != null) {
            encodedPath = encodedPath.substring(0, encodedPath.lastIndexOf(47) + 1);
        }
        return parse.buildUpon().scheme(parse2.getScheme()).encodedAuthority(parse2.getEncodedAuthority()).encodedPath(encodedPath).appendEncodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).toString();
    }
}
