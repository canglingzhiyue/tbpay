package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.transport.ssl.ZSSLContextFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import java.io.PrintStream;
import java.net.Socket;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocketFactory;
import tb.riy;

/* loaded from: classes3.dex */
public class Link {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DIAGNOSE-LINK";

    /* renamed from: a  reason: collision with root package name */
    private Configuration.DetectInf f5663a;
    private Configuration.Address b;
    private Configuration.Address c;
    private DiagnoseStateManager d;
    private String e;
    public int errCode;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;

    public static /* synthetic */ long access$102(Link link, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e735b2f8", new Object[]{link, new Long(j)})).longValue();
        }
        link.m = j;
        return j;
    }

    public static /* synthetic */ long access$200(Link link) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b9c2f55", new Object[]{link})).longValue() : link.k;
    }

    public Link(Configuration.DetectInf detectInf, DiagnoseStateManager diagnoseStateManager, Configuration.Address address) {
        this.errCode = -1;
        this.f5663a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = "";
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.f5663a = detectInf;
        this.d = diagnoseStateManager;
        this.c = address;
        this.i = a();
    }

    private Link(String str, boolean z, DiagnoseStateManager diagnoseStateManager, Configuration.Address address) {
        this.errCode = -1;
        this.f5663a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = "";
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.h = false;
        this.g = z;
        this.d = diagnoseStateManager;
        this.c = address;
        this.i = a(str);
    }

    public static String diagnoseByLink(String str, boolean z, Configuration.Address address) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f295c2f6", new Object[]{str, new Boolean(z), address});
        }
        DftNetTest dftNetTest = new DftNetTest();
        if (str == null) {
            return null;
        }
        new Link(str, z, dftNetTest, address).start();
        return dftNetTest.getReport();
    }

    public boolean start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
        }
        if (!this.i) {
            this.errCode = 1;
            a(false, false);
            return false;
        } else if (!this.g) {
            Configuration.Address address = this.c;
            if (address == null) {
                return a(this.b.ip, this.b.port);
            }
            return b(address.ip, this.c.port);
        } else if (this.c == null) {
            return b();
        } else {
            return c();
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Configuration.DetectInf detectInf = this.f5663a;
        if (detectInf == null) {
            LogCatUtil.warn(TAG, "[initialize] input detectInf is null.");
            this.errCode = 1;
            return false;
        }
        this.i = true;
        this.g = 1 == detectInf.protocol;
        this.j = this.f5663a.protocol;
        this.b = NetworkDiagnoseUtil.parse(this.f5663a.ip == null ? this.f5663a.domain : this.f5663a.ip, this.g);
        if (this.b == null) {
            LogCatUtil.warn(TAG, "[initialize] server is null.");
            this.errCode = 1;
            return false;
        }
        if (this.f5663a.port != -1) {
            this.b.port = this.f5663a.port;
        }
        this.e = this.b.ip + ":" + this.b.port;
        if (this.c != null) {
            this.e += " through proxy-";
            this.e += this.c.ip + ":" + this.c.port;
            LogCatUtil.info(TAG, "[initialize] proxy. " + this.e);
        }
        this.h = true;
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            LogCatUtil.warn(TAG, "[initialize] domain is null.");
            this.errCode = 1;
            return false;
        }
        this.b = NetworkDiagnoseUtil.parse(str, this.g);
        Configuration.Address address = this.b;
        if (address == null || address.ip == null) {
            LogCatUtil.warn(TAG, "[initialize] server is null.");
            this.errCode = 1;
            return false;
        }
        this.e = this.b.ip + ":" + this.b.port;
        this.j = this.g ? 1 : 0;
        this.f5663a = new Configuration.DetectInf();
        if (this.c != null) {
            this.e += " through proxy-";
            this.e += this.c.ip + ":" + this.c.port;
            LogCatUtil.info(TAG, "[initialize] proxy. " + this.e);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.a(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.b(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.b():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.c():boolean");
    }

    private String a(Socket socket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9019afef", new Object[]{this, socket, str});
        }
        if (socket == null || !NetworkDiagnoseUtil.isSafety(str)) {
            LogCatUtil.warn(TAG, "[sendAndReceive] input is not available.");
            return null;
        }
        try {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            LogCatUtil.info(TAG, "[sendAndReceive] send:" + str);
            printStream.print(str);
            printStream.flush();
            byte[] bArr = new byte[512];
            int read = socket.getInputStream().read(bArr);
            if (read <= 0) {
                return null;
            }
            return new String(bArr, 0, read);
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[sendAndReceive]" + th.toString());
            return null;
        }
    }

    private boolean a(String str, String str2, boolean z) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        if (!NetworkDiagnoseUtil.isSafety(str) || !NetworkDiagnoseUtil.isSafety(str2)) {
            LogCatUtil.warn(TAG, "[checkData] input is not safety.");
            return false;
        }
        if (z) {
            str = str.trim();
            str2 = str2.trim();
        }
        int length = str.length() < str2.length() ? str.length() : str2.length();
        if (str.substring(0, length).equals(str2.substring(0, length)) || str2.startsWith(str)) {
            return true;
        }
        try {
            if (!str2.startsWith("HTTP/") || (substring = str2.substring(5)) == null) {
                return false;
            }
            String trim = substring.substring(substring.indexOf(" ")).trim();
            int parseInt = Integer.parseInt(trim.substring(0, trim.indexOf(" ")));
            if (parseInt >= 200 && parseInt < 300) {
                LogCatUtil.info(TAG, "[checkData] the http rsp state is 200-300.");
                return true;
            }
            if (302 == parseInt || 301 == parseInt) {
                LogCatUtil.info(TAG, "[checkData] the http rsp state is 302.");
                return b(trim);
            }
            return false;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[checkData] " + th.toString());
            return false;
        }
    }

    private boolean b(String str) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        this.f = "302 redirect";
        if (str == null) {
            LogCatUtil.warn(TAG, "[checkRedirect] input is not null.");
            return false;
        }
        try {
            String trim = str.substring(str.indexOf("Location:") + 9).trim();
            if (trim.startsWith(k.HTTP_PREFIX)) {
                substring = trim.substring(7);
            } else if (!trim.startsWith(k.HTTPS_PREFIX)) {
                return false;
            } else {
                substring = trim.substring(8);
            }
            String substring2 = substring.substring(0, substring.indexOf("/"));
            StringBuilder sb = new StringBuilder();
            sb.append("[checkData]redirect host:");
            sb.append(substring2 == null ? "host is null!" : substring2);
            LogCatUtil.info(TAG, sb.toString());
            this.f += ", host: " + substring2;
            if (substring2.equals(this.b.ip)) {
                LogCatUtil.info(TAG, "[checkRedirect] redirect sucess.");
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[checkRedirect]" + th.toString());
        }
        return false;
    }

    private void a(boolean z, boolean z2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DiagnoseStateManager diagnoseStateManager = this.d;
        if (diagnoseStateManager == null) {
            return;
        }
        if (!z) {
            diagnoseStateManager.report(false, false, false, null);
            return;
        }
        String str3 = !DftNetTest.class.isInstance(diagnoseStateManager) ? "out_diago:" : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        String str4 = "-;";
        if (this.b.ip == null) {
            str = str4;
        } else {
            str = this.b.ip + ";";
        }
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb.toString() + this.b.port + ";");
        sb2.append(z2 ? "y;" : "n;");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.toString() + riy.ARRAY_START_STR + this.e + "] ");
        String str5 = this.f;
        String str6 = "-";
        if (str5 == null) {
            str5 = str6;
        }
        sb3.append(str5);
        sb3.append(";");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(this.j == 1 ? "ssl;" : "tcp;");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb6);
        if (this.l < 0) {
            str2 = str4;
        } else {
            str2 = NetworkDiagnoseUtil.nsToMs(this.l) + ";";
        }
        sb7.append(str2);
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(sb8);
        if (this.m >= 0) {
            str4 = NetworkDiagnoseUtil.nsToMs(this.m) + ";";
        }
        sb9.append(str4);
        String sb10 = sb9.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(sb10);
        if (this.n >= 0) {
            str6 = String.valueOf(NetworkDiagnoseUtil.nsToMs(this.n) + ";");
        }
        sb11.append(str6);
        String str7 = sb11.toString() + String.valueOf(this.errCode);
        this.d.report(true, z2, false, str7);
        LogCatUtil.info(TAG, "[finish]" + str7);
    }

    /* loaded from: classes3.dex */
    public static class DftNetTest implements DiagnoseStateManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f5664a = null;

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void notify(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b32c451a", new Object[]{this, str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void report(boolean z, boolean z2, boolean z3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
            } else if (this.f5664a == null) {
                this.f5664a = str;
            } else {
                this.f5664a += "|" + str;
            }
        }

        public String getReport() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9733550f", new Object[]{this}) : this.f5664a;
        }
    }

    /* loaded from: classes3.dex */
    public class MyHandshakeListener implements HandshakeCompletedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private MyHandshakeListener() {
        }

        @Override // javax.net.ssl.HandshakeCompletedListener
        public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771e882e", new Object[]{this, handshakeCompletedEvent});
                return;
            }
            Link.access$102(Link.this, System.nanoTime() - Link.access$200(Link.this));
            LogCatUtil.info(Link.TAG, "[sslSocket]Handshake sucessfull. " + handshakeCompletedEvent.toString());
        }
    }

    private SSLSocketFactory d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("e8570a1", new Object[]{this});
        }
        try {
            return ZSSLContextFactory.createZSSLContext().getSocketFactory();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getSSLSocketFactory ex= " + th.toString());
            return null;
        }
    }
}
