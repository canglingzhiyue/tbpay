package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.config.RSoConfig;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* loaded from: classes.dex */
public final class iis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f29057a;
    private final iju b;
    private final iiq d;

    /* loaded from: classes6.dex */
    public interface a {
        void a(iir iirVar);
    }

    public static /* synthetic */ iir a(iis iisVar, String str, String str2, String str3, SoIndexData.SoFileInfo soFileInfo, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iir) ipChange.ipc$dispatch("713d3e31", new Object[]{iisVar, str, str2, str3, soFileInfo, new Boolean(z)}) : iisVar.a(str, str2, str3, soFileInfo, z);
    }

    public iis(Application application, iju ijuVar, iiq iiqVar) {
        this.f29057a = application;
        this.b = ijuVar;
        this.d = iiqVar;
    }

    public void a(final String str, final String str2, final String str3, final SoIndexData.SoFileInfo soFileInfo, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393980f4", new Object[]{this, str, str2, str3, soFileInfo, aVar});
        } else {
            ika.a(new Runnable() { // from class: tb.iis.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RSoLog.c("RSoExtractor, ready to extract " + str + ", callback=" + aVar);
                    iip iipVar = new iip(aVar);
                    iir iirVar = null;
                    try {
                        th = null;
                        iirVar = iis.a(iis.this, str, str2, str3, soFileInfo, false);
                    } catch (Throwable th) {
                        th = th;
                        ikq.a("extractAsync,error", str, th);
                    }
                    if (iirVar == null || !iirVar.g()) {
                        RSoLog.c("RSoExtractor, retry extract " + str + ", callback=" + aVar);
                        try {
                            iirVar = iis.a(iis.this, str, str2, str3, soFileInfo, true);
                        } catch (Throwable th2) {
                            th = th2;
                            ikq.a("extractAsync,error2", str, th);
                        }
                    }
                    if (iirVar == null) {
                        iirVar = new iir(str, "", "", ikr.EMPTY, RSoException.error(6094, th));
                    }
                    RSoLog.c("RSoExtractor, extract finish " + str + ", callback=" + aVar);
                    iipVar.a(iirVar);
                }
            });
        }
    }

    private iir a(String str, String str2, String str3, SoIndexData.SoFileInfo soFileInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iir) ipChange.ipc$dispatch("1a673af4", new Object[]{this, str, str2, str3, soFileInfo, new Boolean(z)});
        }
        ikr ikrVar = new ikr(rgg.ARG_EXTRAT);
        ikrVar.a("start");
        String str4 = str3 + File.separator + "extracted";
        b a2 = a(soFileInfo, str3 + File.separator + RSoConfig.TYPE_COMPRESSED);
        ikrVar.a("lib_ready", "start");
        Throwable th = null;
        try {
            if (z) {
                RSoLog.c("RSoExtractor,extractCore.extractPro " + a2);
                this.d.b(this.f29057a, b.a(a2), str4, false);
            } else {
                RSoLog.c("RSoExtractor,extractCore.extract " + a2);
                this.d.a(this.f29057a, b.a(a2), str4, false);
            }
        } catch (Throwable th2) {
            th = th2;
            ikq.a("extractAsync-inner-core-error", str, th);
        }
        if (b.b(a2)) {
            iky.a(new File(b.a(a2)));
        }
        ikrVar.a("stop", "start");
        if (th != null) {
            return new iir(str, b.a(a2), null, ikrVar, RSoException.error(6096, th));
        }
        String str5 = str4 + File.separator + str2;
        if (!this.b.a(soFileInfo.getMd5(), str5)) {
            return new iir(str, b.a(a2), null, ikrVar, RSoException.error(6095, ", extractedLibPath=" + str5 + ", param=" + a2));
        }
        String str6 = str3 + File.separator + str2;
        File file = new File(str6);
        iku.f(file);
        if (!new File(str5).renameTo(file)) {
            return new iir(str, b.a(a2), null, ikrVar, RSoException.error(6095, "rename dest failed, extractedLibPath=" + str5 + ", targetLibPath=" + str6));
        }
        return new iir(str, b.a(a2), str6, ikrVar, null);
    }

    private b a(SoIndexData.SoFileInfo soFileInfo, String str) {
        String uri;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4e1629d5", new Object[]{this, soFileInfo, str});
        }
        if (soFileInfo.isAssetsUri()) {
            String uri2 = soFileInfo.getUri();
            uri = str + File.separator + uri2.hashCode();
            RSoLog.d("extractor ->   libPathInAssets=" + uri2 + " compressedFilePath=" + uri + " copyCompressedSoFile = " + ikt.a(this.f29057a, uri2, new File(uri)));
        } else if (soFileInfo.isLibUri()) {
            uri = this.f29057a.getApplicationInfo().nativeLibraryDir + File.separator + soFileInfo.getUri();
            RSoLog.d("extractor ->   soLibDir=" + this.f29057a.getApplicationInfo().nativeLibraryDir + " compressedFilePath=" + uri);
            z = false;
        } else if ("Compressed-Remote".equalsIgnoreCase(soFileInfo.getFrom())) {
            uri = soFileInfo.getUri();
            RSoLog.d("extractor -> FROM_COMPRESSED_REMOTE, compressedFilePath = " + uri);
        } else {
            throw RSoException.error(2005, soFileInfo.getUri());
        }
        return new b(uri, z);
    }

    /* loaded from: classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f29059a;
        private final boolean d;

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c5e1599", new Object[]{bVar}) : bVar.f29059a;
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d18d742c", new Object[]{bVar})).booleanValue() : bVar.d;
        }

        private b(String str, boolean z) {
            this.f29059a = str;
            this.d = z;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ExtractParam{compressedFilePath='" + this.f29059a + "', deleteCompressedFile=" + this.d + '}';
        }
    }
}
