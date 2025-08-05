package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.f;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mzx implements naa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HttpURLConnection f31350a;
    private Map<String, String> b;

    static {
        kge.a(728035571);
        kge.a(482126489);
    }

    @Override // tb.naa
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.naa
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.naa
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    @Override // tb.naa
    public void a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String a2 = f.a(this.b, "utf-8");
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(a2)) {
            sb.append(riy.CONDITION_IF);
            sb.append(a2);
        }
        this.f31350a = (HttpURLConnection) new URL(sb.toString()).openConnection();
        this.f31350a.setConnectTimeout(5000);
        this.f31350a.setReadTimeout(5000);
        this.f31350a.setUseCaches(false);
        this.f31350a.setDoInput(true);
    }

    @Override // tb.naa
    public void b(String str) throws ProtocolException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f31350a.setRequestMethod(str);
            if (!"POST".equalsIgnoreCase(str)) {
                return;
            }
            this.f31350a.setDoOutput(true);
        }
    }

    @Override // tb.naa
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    @Override // tb.naa
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f31350a.addRequestProperty(str, str2);
        }
    }

    @Override // tb.naa
    public void a(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(this.f31350a.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        f.a(dataOutputStream);
    }

    @Override // tb.naa
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HttpURLConnection httpURLConnection = this.f31350a;
        if (httpURLConnection != null) {
            return httpURLConnection.getHeaderFields();
        }
        return null;
    }

    @Override // tb.naa
    public int b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        HttpURLConnection httpURLConnection = this.f31350a;
        if (httpURLConnection != null) {
            return httpURLConnection.getResponseCode();
        }
        return 0;
    }

    @Override // tb.naa
    public String c() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        HttpURLConnection httpURLConnection = this.f31350a;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                f.a(inputStream);
                                f.a(byteArrayOutputStream);
                                return str;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        f.a(inputStream);
                        f.a(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e) {
                    throw e;
                }
            } catch (IOException e2) {
                throw e2;
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
                f.a(inputStream);
                f.a(byteArrayOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            byteArrayOutputStream = null;
            inputStream = null;
            throw e3;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }

    @Override // tb.naa
    public void d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f31350a.connect();
        }
    }

    @Override // tb.naa
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HttpURLConnection httpURLConnection = this.f31350a;
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.disconnect();
    }
}
