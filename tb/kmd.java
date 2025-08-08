package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class kmd implements klz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HttpURLConnection f30156a;

    @Override // tb.klz
    public void a(URL url, kly klyVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7442a11f", new Object[]{this, url, klyVar});
            return;
        }
        if (url.getProtocol().equals("http") && !klyVar.c()) {
            url = new URL(a(url.toString(), klyVar.e()));
        }
        this.f30156a = (HttpURLConnection) url.openConnection();
        this.f30156a.setConnectTimeout(klyVar.a());
        this.f30156a.setReadTimeout(klyVar.b());
        this.f30156a.setInstanceFollowRedirects(kly.e);
    }

    @Override // tb.klz
    public void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30156a.connect();
        }
    }

    @Override // tb.klz
    public int b() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f30156a.getResponseCode();
    }

    @Override // tb.klz
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        String headerField = this.f30156a.getHeaderField("Content-Length");
        if (!StringUtils.isEmpty(headerField) && StringUtils.isDigitsOnly(headerField)) {
            return Long.valueOf(headerField).longValue();
        }
        return 0L;
    }

    @Override // tb.klz
    public kma c() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kma) ipChange.ipc$dispatch("1e6a387d", new Object[]{this}) : new kme(this.f30156a.getInputStream());
    }

    @Override // tb.klz
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f30156a.addRequestProperty(str, str2);
        }
    }

    @Override // tb.klz
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f30156a.disconnect();
        }
    }

    @Override // tb.klz
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (this.f30156a == null) {
            return "HttpResponse is empty!";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30156a.getResponseCode());
            sb.append("\n");
            sb.append(this.f30156a.getResponseMessage());
            sb.append("\n");
            Map<String, List<String>> headerFields = this.f30156a.getHeaderFields();
            for (String str : headerFields.keySet()) {
                sb.append((Object) str);
                sb.append(":");
                sb.append(headerFields.get(str));
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            kmv.a("hucCon", "getErrorMsg", th, new Object[0]);
            return "";
        }
    }

    private String a(String str, int i) {
        String str2;
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)});
        }
        if (a.k == null) {
            return str;
        }
        try {
            URL url = new URL(str);
            String host = url.getHost();
            int port = url.getPort();
            if (port == -1) {
                str2 = host;
            } else {
                str2 = host + ":" + port;
            }
            a2 = a.k.a(host);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (a2.isEmpty()) {
            return str;
        }
        String str3 = a2.get(i % a2.size());
        if (!StringUtils.isEmpty(str3)) {
            return str.replaceFirst(str2, str3);
        }
        return str;
    }
}
