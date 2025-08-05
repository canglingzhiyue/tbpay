package android.taobao.windvane.jsbridge.api;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVPrefetch extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1099438492);
    }

    public static /* synthetic */ Object ipc$super(WVPrefetch wVPrefetch, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getData".equals(str)) {
            getData(str2, wVCallBackContext);
        } else if (!"requestData".equals(str)) {
            return false;
        } else {
            requestData(str2, wVCallBackContext);
        }
        return true;
    }

    public void getData(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d435db6e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview == null) {
                r rVar = new r();
                rVar.a("msg", "NO_WEBVIEW");
                wVCallBackContext.error(rVar);
                return;
            }
            final String url = webview.getUrl();
            final String string = parseObject.getString("externalKey");
            String string2 = parseObject.getString("url");
            if (TextUtils.isEmpty(string2)) {
                string2 = webview.getUrl();
            }
            final String str2 = string2;
            String matchingUrl = getMatchingUrl(str2);
            if (!TextUtils.isEmpty(string)) {
                matchingUrl = matchingUrl + "#" + string;
            }
            m.b(android.taobao.windvane.monitor.a.MONITOR_POINT_WV_PREFETCH, "getData: " + matchingUrl);
            com.taobao.weaver.prefetch.e.a().a(matchingUrl, new com.taobao.weaver.prefetch.a() { // from class: android.taobao.windvane.jsbridge.api.WVPrefetch.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weaver.prefetch.a
                public void a(com.taobao.weaver.prefetch.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f8da6300", new Object[]{this, cVar});
                        return;
                    }
                    try {
                        if (!TextUtils.isEmpty(cVar.e)) {
                            wVCallBackContext.success(cVar.e);
                            return;
                        }
                    } catch (Throwable unused) {
                    }
                    if (cVar.d instanceof JSONObject) {
                        wVCallBackContext.success(((JSONObject) cVar.d).toJSONString());
                    } else {
                        wVCallBackContext.success(new JSONObject(cVar.d).toJSONString());
                    }
                    android.taobao.windvane.monitor.a.commitWVPrefetchInfo(url, str2, string, "getData", null, null, true);
                }

                @Override // com.taobao.weaver.prefetch.a
                public void b(com.taobao.weaver.prefetch.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5fb322c1", new Object[]{this, cVar});
                        return;
                    }
                    r rVar2 = new r();
                    rVar2.a("msg", cVar.c.a().getMsg());
                    rVar2.a("code", cVar.c.a().getCode());
                    wVCallBackContext.error(rVar2);
                    android.taobao.windvane.monitor.a.commitWVPrefetchInfo(url, str2, string, "getData", cVar.c.a().getCode(), cVar.c.a().getMsg(), false);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            r rVar2 = new r();
            rVar2.a("msg", "exception");
            rVar2.a("code", "-1");
            wVCallBackContext.error(rVar2);
        }
    }

    public void requestData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5c5ee7", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error(r.RET_PARAM_ERR);
                return;
            }
            parseObject.put("userAgent", (Object) this.mWebView.getUserAgentString());
            m.b(android.taobao.windvane.monitor.a.MONITOR_POINT_WV_PREFETCH, "requestData: " + string + " with params: " + parseObject.toJSONString());
            com.taobao.weaver.prefetch.e.a().a(string, parseObject);
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview == null) {
                return;
            }
            android.taobao.windvane.monitor.a.commitWVPrefetchInfo(webview.getUrl(), string, "", "requestData", null, null, true);
        } catch (Throwable th) {
            th.printStackTrace();
            r rVar = new r();
            rVar.a("msg", "exception");
            rVar.a("code", "-1");
            wVCallBackContext.error(rVar);
        }
    }

    private String getMatchingUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e8dfb3", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }
}
