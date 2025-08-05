package com.taobao.themis.open.permission.sendmtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 U2\u00020\u0001:\u0001UB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004J\u0016\u0010N\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004J\u0016\u0010O\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004J\u0016\u0010P\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004J\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013J\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013J\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013J\u001c\u0010T\u001a\u00020K2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR\u001a\u0010>\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\u001a\u0010D\u001a\u00020EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006V"}, d2 = {"Lcom/taobao/themis/open/permission/sendmtop/SendMtopParams;", "Ljava/io/Serializable;", "()V", MtopJSBridge.MtopJSParam.ACCOUNT_SITE, "", "getAccountSite", "()Ljava/lang/String;", "setAccountSite", "(Ljava/lang/String;)V", "api", "getApi", "setApi", "dataMap", "", "dataType", "getDataType", "setDataType", "extraData", "extraDataMap", "", "getExtraDataMap", "()Ljava/util/Map;", "forceLogin", "", "getForceLogin", "()Z", "setForceLogin", "(Z)V", "headers", "isAddISVHeader", "setAddISVHeader", "method", "getMethod", "setMethod", MtopJSBridge.MtopJSParam.MP_HOST, "getMpHost", "setMpHost", "needLogin", "getNeedLogin", "setNeedLogin", "pageUrl", "getPageUrl", "setPageUrl", "parameterMap", "post", "getPost", "setPost", MtopJSBridge.MtopJSParam.SESSION_OPTION, "getSessionOption", "setSessionOption", "timer", "", "getTimer", "()J", "setTimer", "(J)V", "ttid", "getTtid", "setTtid", MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, "getUseCache", "setUseCache", "userAgent", "getUserAgent", "setUserAgent", "v", "getV", "setV", "wuaFlag", "", "getWuaFlag", "()I", "setWuaFlag", "(I)V", "addData", "", "key", "value", "addExtraDara", "addHeader", "addParameterMap", "getDataMap", "getHeaders", "getParameterMap", "setHeaders", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class SendMtopParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final long serialVersionUID = -33061885727159462L;
    private boolean forceLogin;
    private boolean isAddISVHeader;
    private String method;
    private boolean needLogin;
    private boolean post;
    private long timer;
    private boolean useCache;
    private String api = "";
    private String v = "";
    private String dataType = "originaljson";
    private int wuaFlag = -1;
    private String ttid = "";
    private String mpHost = "";
    private String userAgent = "";
    private String pageUrl = "";
    private String sessionOption = "";
    private String accountSite = "";
    private final Map<String, String> dataMap = new HashMap();
    private final Map<String, String> parameterMap = new HashMap();
    private final Map<String, String> headers = new HashMap();
    private final Map<String, String> extraData = new HashMap();

    static {
        kge.a(-1806297180);
        kge.a(1028243835);
        Companion = new a(null);
    }

    public final String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.api;
    }

    public final void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.api = str;
    }

    public final String getV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this}) : this.v;
    }

    public final void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.v = str;
    }

    public final boolean getNeedLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e9333c8", new Object[]{this})).booleanValue() : this.needLogin;
    }

    public final void setNeedLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bca5f9c", new Object[]{this, new Boolean(z)});
        } else {
            this.needLogin = z;
        }
    }

    public final boolean getForceLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb3211bf", new Object[]{this})).booleanValue() : this.forceLogin;
    }

    public final void setForceLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e771ed", new Object[]{this, new Boolean(z)});
        } else {
            this.forceLogin = z;
        }
    }

    public final String getDataType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this}) : this.dataType;
    }

    public final void setDataType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3e1e97", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.dataType = str;
    }

    public final String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.method;
    }

    public final void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.method = str;
        }
    }

    public final int getWuaFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("479e7313", new Object[]{this})).intValue() : this.wuaFlag;
    }

    public final void setWuaFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2795eef", new Object[]{this, new Integer(i)});
        } else {
            this.wuaFlag = i;
        }
    }

    public final String getTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this}) : this.ttid;
    }

    public final void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.ttid = str;
    }

    public final long getTimer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("287d28a", new Object[]{this})).longValue() : this.timer;
    }

    public final void setTimer(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9744fa", new Object[]{this, new Long(j)});
        } else {
            this.timer = j;
        }
    }

    public final String getMpHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f9a24b8", new Object[]{this}) : this.mpHost;
    }

    public final void setMpHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63545fbe", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.mpHost = str;
    }

    public final String getUserAgent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c888a235", new Object[]{this}) : this.userAgent;
    }

    public final void setUserAgent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac96049", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.userAgent = str;
    }

    public final boolean getPost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8e70aa1", new Object[]{this})).booleanValue() : this.post;
    }

    public final void setPost(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04ebc4b", new Object[]{this, new Boolean(z)});
        } else {
            this.post = z;
        }
    }

    public final String getPageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this}) : this.pageUrl;
    }

    public final void setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.pageUrl = str;
    }

    public final String getSessionOption() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("85801f24", new Object[]{this}) : this.sessionOption;
    }

    public final void setSessionOption(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f23a73a", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.sessionOption = str;
    }

    public final String getAccountSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("82d9dfdb", new Object[]{this}) : this.accountSite;
    }

    public final void setAccountSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0194a63", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.accountSite = str;
    }

    public final boolean getUseCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f39d7bc", new Object[]{this})).booleanValue() : this.useCache;
    }

    public final void setUseCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad83890", new Object[]{this, new Boolean(z)});
        } else {
            this.useCache = z;
        }
    }

    public final boolean isAddISVHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9edcc6d", new Object[]{this})).booleanValue() : this.isAddISVHeader;
    }

    public final void setAddISVHeader(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef681b53", new Object[]{this, new Boolean(z)});
        } else {
            this.isAddISVHeader = z;
        }
    }

    public final Map<String, String> getDataMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c3847098", new Object[]{this}) : this.dataMap;
    }

    public final Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : this.headers;
    }

    public final Map<String, String> getParameterMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3226f5a5", new Object[]{this}) : this.parameterMap;
    }

    public final Map<String, String> getExtraDataMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("266c7214", new Object[]{this}) : this.extraData;
    }

    public final void addParameterMap(String key, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae4e4f", new Object[]{this, key, value});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        this.parameterMap.put(key, value);
    }

    public final void addData(String key, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, key, value});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        this.dataMap.put(key, value);
    }

    public final void addHeader(String key, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, key, value});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        this.headers.put(key, value);
    }

    public final void addExtraDara(String key, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5121a716", new Object[]{this, key, value});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        this.extraData.put(key, value);
    }

    public final void setHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
            return;
        }
        Map<String, String> map2 = this.headers;
        q.a(map);
        map2.putAll(map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/permission/sendmtop/SendMtopParams$Companion;", "", "()V", "serialVersionUID", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(217564652);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
