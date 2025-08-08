package com.taobao.taobaoavsdk.cache.library;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import tb.kge;
import tb.oyw;
import tb.oyz;

/* loaded from: classes8.dex */
public class h extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k f21320a;
    private final a d;
    private b e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;

    static {
        kge.a(44117064);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public h(k kVar, a aVar, i iVar) {
        super(kVar, aVar, iVar);
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.k = 0L;
        this.l = 0L;
        this.d = aVar;
        this.f21320a = kVar;
        this.i = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enReadSourcerOnce", "true"));
        this.j = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enReadSourcerOncePreload", "true"));
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ae6f41", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82afcc5e", new Object[]{this, eVar});
        } else {
            this.b = eVar;
        }
    }

    public void a(f fVar, Socket socket) throws IOException, ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7767fb12", new Object[]{this, fVar, socket});
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        this.k = System.currentTimeMillis();
        String b = b(fVar, false);
        bufferedOutputStream.write(b.getBytes("UTF-8"));
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "response " + b);
        long j = fVar.b;
        if (a(fVar)) {
            a(bufferedOutputStream, j, fVar, (j < this.d.a() || j - this.d.a() <= ((long) (this.f21320a.h() / 2))) ? this.i : false);
        } else {
            a(bufferedOutputStream, j, fVar);
        }
    }

    private void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35889b7", new Object[]{this, fVar, new Boolean(z)});
            return;
        }
        try {
            String str = System.currentTimeMillis() + "_" + new Random().nextInt(1000);
            String[] strArr = new String[12];
            StringBuilder sb = new StringBuilder();
            sb.append("errorcode=");
            sb.append(z ? -99 : 0);
            strArr[0] = sb.toString();
            strArr[1] = "downloaded_bytes=" + this.h;
            strArr[2] = "download_time=" + this.g;
            strArr[3] = "request_bytes=" + fVar.i;
            strArr[4] = "video_id=" + fVar.p;
            strArr[5] = "video_url=" + fVar.f21319a;
            strArr[6] = "cache_download_bytes=" + (this.h - this.f);
            strArr[7] = "cache_hit_bytes=" + this.f;
            strArr[8] = "play_token=" + str;
            strArr[9] = "from=" + fVar.n;
            strArr[10] = "videoPlayScenes=" + fVar.o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("is_tbnet=");
            if (!fVar.e) {
                i = 0;
            }
            sb2.append(i);
            strArr[11] = sb2.toString();
            TBS.Ext.commitEvent("Page_Video", 19997, "Page_Video_Button-TBPlayerPrecache", "", "", strArr);
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "commitPreloadStat error " + e.toString());
        }
    }

    public void a(f fVar, boolean z, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eea0029", new Object[]{this, fVar, new Boolean(z), iVar});
        } else if (this.d == null || fVar == null || iVar == null || !com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enablePreLoadStat", "true"))) {
        } else {
            a(fVar, z);
            if (this.h <= 0) {
                return;
            }
            iVar.l(fVar.f21319a);
        }
    }

    public void b(f fVar, Socket socket) throws IOException, ProxyCacheException {
        long j;
        int i;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba66ab1", new Object[]{this, fVar, socket});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String queryParameter = Uri.parse(fVar.f21319a).getQueryParameter(oyw.VIDEO_CACHE_ID);
        if (StringUtils.isEmpty(queryParameter)) {
            queryParameter = p.e(fVar.f21319a);
        }
        String str = queryParameter;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(b(fVar, true).getBytes("UTF-8"));
        long j2 = fVar.b;
        long j3 = fVar.i;
        a aVar = this.d;
        if (aVar != null && aVar.d()) {
            this.h = this.d.a();
            this.g = System.currentTimeMillis() - currentTimeMillis;
            com.taobao.mediaplay.m.a().a(str, (int) this.d.a());
            return;
        }
        this.f = this.d.a();
        if (j2 >= j3 || this.f21320a.a() == -1) {
            return;
        }
        byte[] bArr = new byte[8192];
        long currentTimeMillis2 = System.currentTimeMillis();
        boolean z2 = this.j;
        if (j3 - j2 > this.f21320a.h() || j2 > 0) {
            j = currentTimeMillis2;
            i = 0;
            z = false;
        } else {
            z = z2;
            j = currentTimeMillis2;
            i = 0;
        }
        long j4 = j2;
        while (true) {
            int a2 = a(bArr, j4, bArr.length, z);
            if (a2 == -1 || j4 > j3) {
                break;
            }
            j4 += a2;
            int i2 = i + a2;
            long currentTimeMillis3 = System.currentTimeMillis();
            if (currentTimeMillis3 - j >= 100) {
                com.taobao.mediaplay.m.a().b(str, i2);
                j = currentTimeMillis3;
            }
            i = i2;
        }
        bufferedOutputStream.flush();
        this.h = this.d.a();
        this.g = System.currentTimeMillis() - currentTimeMillis;
        com.taobao.mediaplay.m.a().a(str, (int) this.d.a());
    }

    private boolean a(f fVar) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82b040c1", new Object[]{this, fVar})).booleanValue();
        }
        a aVar = this.d;
        if (aVar != null && aVar.d()) {
            return true;
        }
        long b = this.f21320a.b();
        if (b != -1) {
            return !((b > 0L ? 1 : (b == 0L ? 0 : -1)) > 0) || !fVar.c || ((float) fVar.b) <= ((float) this.d.a()) + (((float) b) * 0.2f);
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "isUseCache return false because of sourceLength=-1");
        return false;
    }

    private String b(f fVar, boolean z) throws ProxyCacheException {
        String str;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1abcb40a", new Object[]{this, fVar, new Boolean(z)});
        }
        boolean z2 = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "disableHeadReq", "true")) && !z;
        String m = z2 ? this.f21320a.m() : this.f21320a.f();
        boolean z3 = !StringUtils.isEmpty(m);
        long b = z2 ? this.f21320a.b() : this.f21320a.a();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "source.rawLength() :" + this.f21320a.b() + " + length :" + this.f21320a.a());
        if (b < 0 && z2) {
            b = this.f21320a.a();
        }
        if (this.d.d() && this.d.a() > fVar.b) {
            b = this.d.a();
        }
        boolean z4 = b >= 0;
        if (fVar.c) {
            str = com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE;
            j = b - fVar.b;
        } else {
            str = com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE;
            j = b;
        }
        long a2 = fVar.c ? this.d.a() - fVar.b : this.d.a();
        boolean z5 = z4 && fVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        String str2 = "";
        sb.append(z4 ? String.format("Content-Length: %d\n", Long.valueOf(j)) : str2);
        sb.append(z5 ? String.format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(fVar.b), Long.valueOf(b - 1), Long.valueOf(b)) : str2);
        sb.append(z3 ? String.format("Content-Type: %s\n", m) : str2);
        if (z4) {
            Object[] objArr = new Object[1];
            if (a2 <= 0) {
                a2 = 0;
            }
            objArr[0] = Long.valueOf(a2);
            str2 = String.format("X-CACHE-CACHED-BYTES: %d\n", objArr);
        }
        sb.append(str2);
        sb.append("\n");
        String sb2 = sb.toString();
        AVSDKLog.e(str, "headers = " + sb2 + "source.rawLength()" + b);
        return sb2;
    }

    private void a(OutputStream outputStream, long j, f fVar, boolean z) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211572b5", new Object[]{this, outputStream, new Long(j), fVar, new Boolean(z)});
            return;
        }
        byte[] bArr = new byte[8192];
        long a2 = this.d.a();
        long j2 = j;
        int i = 0;
        while (true) {
            int i2 = i;
            int a3 = a(bArr, j2, bArr.length, z);
            if (a3 != -1) {
                int i3 = (int) (a2 - j2);
                if (i3 < 0) {
                    i3 = 0;
                } else if (i3 > a3) {
                    i3 = a3;
                }
                a(a3, i3, true);
                outputStream.write(bArr, 0, a3);
                i = i2 + a3;
                j2 += a3;
            } else {
                outputStream.flush();
                this.l = System.currentTimeMillis();
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mResponseWithCacheTimeStamp is " + this.l + " from mGetRequestTimeStamp is " + (this.l - this.k));
                StringBuilder sb = new StringBuilder();
                sb.append("responseWithCache ");
                sb.append(i2);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
                return;
            }
        }
    }

    private void a(OutputStream outputStream, long j, f fVar) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9533fff", new Object[]{this, outputStream, new Long(j), fVar});
            return;
        }
        k kVar = new k(this.f21320a);
        try {
            kVar.a((int) j, true);
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int a2 = kVar.a(bArr);
                if (a2 != -1) {
                    outputStream.write(bArr, 0, a2);
                    a(a2, 0, false);
                    i += a2;
                } else {
                    outputStream.flush();
                    this.l = System.currentTimeMillis();
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mResponseWithoutCacheTimeStamp is " + this.l + " from mGetRequestTimeStamp is " + (this.l - this.k));
                    StringBuilder sb = new StringBuilder();
                    sb.append("responseWithoutCache ");
                    sb.append(i);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
                    return;
                }
            }
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "responseWithoutCache error " + e.toString());
        } finally {
            kVar.c();
        }
    }

    private void a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.b == null) {
        } else {
            this.b.a(i, i2, z);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.o
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.a(((oyz) this.d).f32502a, this.f21320a.b, i);
    }
}
