package com.taobao.phenix.compat.mtop;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.phenix.compat.g;
import com.taobao.phenix.loader.network.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.esr;
import tb.niw;

/* loaded from: classes.dex */
public class b implements com.taobao.phenix.loader.network.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTOP_EXTRA_CDN_IP_PORT = "mtop_extra_ip_port";
    public static final String MTOP_EXTRA_CONNECT_TYPE = "mtop_extra_connect_type";
    public static final String MTOP_EXTRA_FIRST_DATA = "mtop_extra_first_data";
    public static final String MTOP_EXTRA_HIT_CDN_CACHE = "mtop_extra_hit_cdn_cache";
    public static final String MTOP_EXTRA_RESPONSE_CODE = "mtop_extra_response_code";
    public static final String MTOP_EXTRA_SEND_BEFORE = "mtop_extra_send_before";
    public static final String MTOP_EXTRA_SERVER_RT = "mtop_extra_server_rt";
    public static final String MTOP_PREFIX = "MtopHttpLoader";

    /* renamed from: a  reason: collision with root package name */
    private final Context f18908a;
    private int b;
    private int c;
    private String d;

    public b(Context context) {
        this.f18908a = context;
    }

    @Override // com.taobao.phenix.loader.network.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // com.taobao.phenix.loader.network.b
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // com.taobao.phenix.loader.network.b
    public Future<?> a(String str, Map<String, String> map, b.a aVar) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a90ab1ca", new Object[]{this, str, map, aVar});
        }
        niw.a(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, str, "%s async download image", MTOP_PREFIX);
        RequestImpl requestImpl = new RequestImpl(a(str, map));
        requestImpl.setCookieEnabled(false);
        requestImpl.setFollowRedirects(true);
        requestImpl.setConnectTimeout(this.b);
        requestImpl.setReadTimeout(this.c);
        requestImpl.addHeader("f-refer", "picture");
        if ((!com.taobao.phenix.intf.b.h().H() || SceneIdentifier.getDeviceLevel() != 3) && com.taobao.phenix.intf.b.h().A() && !com.taobao.phenix.intf.b.h().y()) {
            if (!(map != null && Boolean.parseBoolean(map.get("retry_request"))) && !StringUtils.isEmpty(str) && (str.contains("/O1CN") || a.b(str))) {
                Object[] objArr = new Object[1];
                objArr[0] = com.taobao.phenix.intf.b.h().B() ? ",image/heia" : "";
                requestImpl.addHeader(HttpRequest.HEADER_ACCEPT, String.format("image/heic%s,image/webp,image/*;q=0.9,*/*;q=0.8", objArr));
            }
        }
        if (map != null) {
            str2 = map.get(RequestConstant.KEY_TRACE_ID);
            if (str2 != null) {
                requestImpl.setExtProperty(RequestConstant.KEY_TRACE_ID, str2);
            }
        } else {
            str2 = null;
        }
        if (map != null && (str4 = map.get("open_trace_context")) != null) {
            requestImpl.setTraceContext(a(str4));
        }
        if (!StringUtils.isEmpty(str2) && g.c()) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("TBAndroid/Native");
            sb.append(" ");
            if (com.taobao.phenix.intf.b.h().I() && SceneIdentifier.getDeviceLevel() == 3) {
                sb.append("nowebp_lowdevicedemote");
                sb.append(" ");
            }
            sb.append(this.f18908a.getPackageName());
            sb.append(" ");
            sb.append(a(this.f18908a));
            sb.append(" ");
            sb.append("Android");
            sb.append(Build.VERSION.RELEASE);
            sb.append(" ");
            sb.append(str2);
            if (com.taobao.phenix.intf.b.h().J()) {
                sb.append(" ");
                sb.append(f.a(SceneIdentifier.getDeviceLevel()));
            }
            requestImpl.addHeader(HttpConstant.USER_AGENT, sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("TBAndroid/Native");
            sb2.append(" ");
            if (com.taobao.phenix.intf.b.h().I() && SceneIdentifier.getDeviceLevel() == 3) {
                sb2.append("nowebp_lowdevicedemote");
                sb2.append(" ");
            }
            sb2.append(this.f18908a.getPackageName());
            sb2.append(" ");
            sb2.append(a(this.f18908a));
            sb2.append(" ");
            sb2.append("Android");
            sb2.append(Build.VERSION.RELEASE);
            if (com.taobao.phenix.intf.b.h().J()) {
                sb2.append(" ");
                sb2.append(f.a(SceneIdentifier.getDeviceLevel()));
            }
            requestImpl.addHeader(HttpConstant.USER_AGENT, sb2.toString());
        }
        if (map != null && map.containsKey("Image-Gray-Traffic")) {
            requestImpl.addHeader("Image-Gray-Traffic", com.taobao.android.weex_framework.util.a.ATOM_EXT_gray);
        }
        if (map != null && (str3 = map.get(esr.BUNDLE_BIZ_CODE)) != null) {
            try {
                requestImpl.setBizId(Integer.parseInt(str3));
            } catch (NumberFormatException e) {
                niw.a(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, str, "%s get biz code from extras error=%s", MTOP_PREFIX, e);
            }
        }
        return new DegradableNetwork(this.f18908a).asyncSend(requestImpl, null, null, g.b() ? new c(aVar, map) : new e(aVar, map));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (java.lang.Boolean.parseBoolean(r1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.phenix.compat.mtop.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 3
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            java.lang.String r6 = "4dcf7ed"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L1b:
            com.taobao.phenix.intf.b r0 = com.taobao.phenix.intf.b.h()
            boolean r0 = r0.H()
            if (r0 != 0) goto L2f
            com.taobao.phenix.intf.b r0 = com.taobao.phenix.intf.b.h()
            boolean r0 = r0.I()
            if (r0 == 0) goto L36
        L2f:
            int r0 = com.taobao.analysis.scene.SceneIdentifier.getDeviceLevel()
            if (r0 != r4) goto L36
            return r6
        L36:
            r0 = 0
            if (r7 == 0) goto L4f
            java.lang.String r1 = "retry_request"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = android.text.StringUtils.isEmpty(r1)
            if (r4 != 0) goto L4f
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 == 0) goto L4f
            goto L50
        L4f:
            r2 = 0
        L50:
            com.taobao.phenix.intf.b r1 = com.taobao.phenix.intf.b.h()
            boolean r1 = r1.A()
            java.lang.String r3 = "heicCodecReady"
            if (r1 == 0) goto L7e
            if (r2 != 0) goto L7e
            android.util.Pair r0 = com.taobao.phenix.compat.mtop.a.a(r6)
            if (r7 == 0) goto L8f
            java.lang.Object r1 = r0.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8f
            java.lang.String r1 = "convert_format"
            java.lang.String r2 = "jpeg"
            r7.put(r1, r2)
            java.lang.String r1 = "true"
            r7.put(r3, r1)
            goto L8f
        L7e:
            if (r7 == 0) goto L8f
            com.taobao.phenix.intf.b r1 = com.taobao.phenix.intf.b.h()
            boolean r1 = r1.A()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.put(r3, r1)
        L8f:
            if (r0 == 0) goto L95
            java.lang.Object r6 = r0.first
            java.lang.String r6 = (java.lang.String) r6
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.compat.mtop.b.a(java.lang.String, java.util.Map):java.lang.String");
    }

    private Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String[] split2 = str2.split(":");
            if (split2.length == 2) {
                hashMap.put(split2[0].trim(), split2[1]);
            } else {
                hashMap.put(split2[0].trim(), "");
            }
        }
        return hashMap;
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (!StringUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (context != null) {
            try {
                this.d = context.getPackageManager().getPackageInfo(this.f18908a.getPackageName(), 0).versionName;
            } catch (Throwable th) {
                niw.d(MTOP_PREFIX, "getVersionName error=%s", th);
            }
        }
        return this.d;
    }
}
