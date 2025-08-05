package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.g;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class kpv implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f30220a;

    public static /* synthetic */ void a(kpv kpvVar, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf2c84f", new Object[]{kpvVar, soIndexData, soIndexAdvanced});
        } else {
            kpvVar.b(soIndexData, soIndexAdvanced);
        }
    }

    public kpv(ijd ijdVar) {
        this.f30220a = ijdVar;
    }

    @Override // com.taobao.android.remoteso.index.g
    public void a(final SoIndexData soIndexData, final SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cc4ef0", new Object[]{this, soIndexData, soIndexAdvanced});
        } else if (!this.f30220a.a("key_index_channel_opt_enabled", true) || !ikw.a((CharSequence) "com.taobao.taobao:channel", (CharSequence) LauncherRuntime.c)) {
        } else {
            RSoLog.c("TBChannelIndexHook,  cleanup  index data in channel process, start ...");
            ikq.a("cleanupIndexData.error", new Runnable() { // from class: tb.kpv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        kpv.a(kpv.this, soIndexData, soIndexAdvanced);
                    }
                }
            });
        }
    }

    private void b(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c32be31", new Object[]{this, soIndexData, soIndexAdvanced});
            return;
        }
        a(soIndexData.getAssets(), new kpq<String>() { // from class: tb.kpv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kpq
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str.startsWith("taopai/") || str.startsWith("dinamic/") || str.endsWith(".png") || str.endsWith(fxb.DX_MAIN_TEMPLATE_NAME) || str.contains(".msoac") || str.contains(".msoap") || str.startsWith("tixel/") || str.endsWith(".js");
            }
        });
        RSoLog.b("TBChannelIndexHook, after cleanup assets = " + soIndexData.getAssets());
        a(soIndexData.getEntries(), new kpq<String>() { // from class: tb.kpv.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kpq
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !str.equals("zstd");
            }
        });
        RSoLog.b("TBChannelIndexHook, after cleanup entries = " + soIndexData.getEntries());
        a(soIndexAdvanced.getInfoMap(), new kpq<String>() { // from class: tb.kpv.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kpq
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !str.startsWith("zstd|");
            }
        });
        RSoLog.b("TBChannelIndexHook, after cleanup info2Map = " + soIndexAdvanced.getInfoMap());
    }

    private static <T> void a(Map<String, T> map, kpq<String> kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914d4061", new Object[]{map, kpqVar});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (ikw.a((CharSequence) key)) {
                RSoLog.b("TBChannelIndexHook, cleanupIndexData found empty key !!!");
            } else if (!kpqVar.a(key)) {
                hashMap.put(key, entry.getValue());
            }
        }
        map.clear();
        map.putAll(hashMap);
    }
}
