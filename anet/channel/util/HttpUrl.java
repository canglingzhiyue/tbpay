package anet.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.MalformedURLException;
import java.net.URL;
import tb.ado;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class HttpUrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String host;
    public volatile boolean isNoStrategy;
    private volatile boolean isSchemeLocked;
    private String path;
    private int port;
    private String scheme;
    private String simpleUrl;
    private String url;

    static {
        kge.a(479696569);
    }

    private HttpUrl() {
        this.isNoStrategy = false;
        this.isSchemeLocked = false;
    }

    public HttpUrl(HttpUrl httpUrl) {
        this.isNoStrategy = false;
        this.isSchemeLocked = false;
        this.scheme = httpUrl.scheme;
        this.host = httpUrl.host;
        this.path = httpUrl.path;
        this.url = httpUrl.url;
        this.simpleUrl = httpUrl.simpleUrl;
        this.isSchemeLocked = httpUrl.isSchemeLocked;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e1, code lost:
        if (r0.port > 65535) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static anet.channel.util.HttpUrl parse(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.HttpUrl.parse(java.lang.String):anet.channel.util.HttpUrl");
    }

    public String scheme() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7de6274", new Object[]{this}) : this.scheme;
    }

    public String host() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f877d251", new Object[]{this}) : this.host;
    }

    public String path() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4dd143f4", new Object[]{this}) : this.path;
    }

    public int getPort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue() : this.port;
    }

    public String urlString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aafe6899", new Object[]{this}) : this.url;
    }

    public String simpleUrlString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5d0a2eb", new Object[]{this}) : this.simpleUrl;
    }

    public URL toURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("1f7c0f7a", new Object[]{this});
        }
        try {
            return new URL(this.url);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public boolean containsNonDefaultPort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f685fdf", new Object[]{this})).booleanValue() : this.port != 0 && (("http".equals(this.scheme) && this.port != 80) || ("https".equals(this.scheme) && this.port != 443));
    }

    public void downgradeSchemeAndLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312a244f", new Object[]{this});
            return;
        }
        this.isSchemeLocked = true;
        if ("http".equals(this.scheme)) {
            return;
        }
        this.scheme = "http";
        String str = this.scheme;
        String str2 = this.url;
        this.url = StringUtils.concatString(str, ":", str2.substring(str2.indexOf(ado.URL_SEPARATOR)));
    }

    public boolean isSchemeLocked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68abe764", new Object[]{this})).booleanValue() : this.isSchemeLocked;
    }

    public void lockScheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e5c737", new Object[]{this});
        } else {
            this.isSchemeLocked = true;
        }
    }

    public void setScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef72bff8", new Object[]{this, str});
        } else if (this.isSchemeLocked || str.equalsIgnoreCase(this.scheme)) {
        } else {
            this.scheme = str;
            String str2 = this.url;
            this.url = StringUtils.concatString(str, ":", str2.substring(str2.indexOf(ado.URL_SEPARATOR)));
            this.simpleUrl = StringUtils.concatString(str, ":", this.simpleUrl.substring(this.url.indexOf(ado.URL_SEPARATOR)));
        }
    }

    public void replaceIpAndPort(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90653275", new Object[]{this, str, new Integer(i)});
        } else if (str == null) {
        } else {
            int indexOf = this.url.indexOf(ado.URL_SEPARATOR) + 2;
            while (indexOf < this.url.length() && this.url.charAt(indexOf) != '/') {
                indexOf++;
            }
            boolean isIPV6Address = anet.channel.strategy.utils.Utils.isIPV6Address(str);
            StringBuilder sb = new StringBuilder(this.url.length() + str.length());
            sb.append(this.scheme);
            sb.append(HttpConstant.SCHEME_SPLIT);
            if (isIPV6Address) {
                sb.append('[');
            }
            sb.append(str);
            if (isIPV6Address) {
                sb.append(']');
            }
            if (i != 0) {
                sb.append(riy.CONDITION_IF_MIDDLE);
                sb.append(i);
            } else if (this.port != 0) {
                sb.append(riy.CONDITION_IF_MIDDLE);
                sb.append(this.port);
            }
            sb.append(this.url.substring(indexOf));
            this.url = sb.toString();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.url;
    }
}
