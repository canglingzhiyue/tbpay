package tb;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.f;
import com.taobao.bootimage.linked.h;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.a;
import com.taobao.phenix.intf.event.e;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.NetWorkUtils;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kml;

/* loaded from: classes6.dex */
public class srt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(216816312);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : c(str);
    }

    public static /* synthetic */ void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            b(str, str2, str3);
        }
    }

    public static /* synthetic */ void a(Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{map, str});
        } else {
            b(map, str);
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c();
    }

    public static /* synthetic */ void c(List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6ffd65", new Object[]{list, str});
        } else {
            e(list, str);
        }
    }

    public static void a(final List<sru> list, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{list, str});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.srt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!srt.a()) {
                        kej.a("2ARCH_DownLoader", "downloadResource: 网络不允许");
                    } else {
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        for (sru sruVar : list) {
                            if (sruVar.e == 1) {
                                hashMap.put(sruVar.f30167a, Boolean.valueOf(sruVar.g));
                            }
                            String str2 = "";
                            if (sruVar.e == 0 && keu.a(sruVar.f30167a, keu.SUFFIX_MP4)) {
                                sruVar.c = TextUtils.isEmpty(sruVar.c) ? str2 : sruVar.c;
                                sruVar.d = TextUtils.isEmpty(sruVar.d) ? srt.a(sruVar.f30167a) : sruVar.d;
                                arrayList.add(sruVar);
                            }
                            if (sruVar.e == 2) {
                                if (!TextUtils.isEmpty(sruVar.c)) {
                                    str2 = sruVar.c;
                                }
                                sruVar.c = str2;
                                sruVar.d = TextUtils.isEmpty(sruVar.d) ? srt.a(sruVar.f30167a) : sruVar.d;
                                arrayList.add(sruVar);
                            }
                        }
                        srt.a(hashMap, str);
                        srt.c(arrayList, str);
                    }
                }
            });
        }
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || str.toLowerCase().endsWith(".gif")) {
            return str;
        }
        DisplayMetrics displayMetrics = f.b().getResources().getDisplayMetrics();
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels), null);
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (!NetWorkUtils.ConnectType.CONNECT_TYPE_WIFI.equals(NetWorkUtils.getConnectType(f.b()))) {
            return false;
        }
        NetWorkUtils.MobileNetworkType mobileNetworkType = NetWorkUtils.getMobileNetworkType(f.b());
        return !NetWorkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_3G.equals(mobileNetworkType) && !NetWorkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_4G.equals(mobileNetworkType);
    }

    private static void b(Map<String, Boolean> map, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39066b46", new Object[]{map, str});
        } else if (map != null && !map.isEmpty()) {
            kej.a("2ARCH_DownLoader", "downloadImageResource: " + map.size() + " ,businessCode: " + str);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                String key = entry.getKey();
                String b = (entry.getValue() == null || !entry.getValue().booleanValue()) ? key : b(key);
                arrayList.add(b);
                srn.a(str, key, b);
                kej.a("2ARCH_DownLoader", "suffixMaps key: " + key + ",item: " + b);
            }
            b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, arrayList).a(new a<e>() { // from class: tb.srt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(e eVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, eVar})).booleanValue() : a(eVar);
                }

                public boolean a(e eVar) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("fa9fe917", new Object[]{this, eVar})).booleanValue();
                    }
                    srn.a();
                    List<String> list = eVar.h;
                    srn.a(str, list);
                    if (list == null || list.isEmpty()) {
                        z = true;
                    }
                    srt.a(str, z ? keq.DOWNLOAD_SUCCESS : keq.DOWNLOAD_ERROR, z ? null : keq.CODE_DOWNLOAD_IMAGE_FAIL);
                    return true;
                }
            }).a();
        }
    }

    private static void e(List<sru> list, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6071ebe7", new Object[]{list, str});
        } else if (list == null || list.isEmpty()) {
            srn.c(str);
        } else {
            kej.a("2ARCH_DownLoader", "downloadVideoResource: " + list.size());
            NetWorkUtils.ConnectType connectType = NetWorkUtils.getConnectType(f.b());
            ArrayList<sru> arrayList = new ArrayList();
            for (sru sruVar : list) {
                if (TextUtils.isEmpty(ssf.a(str, sruVar.f30167a))) {
                    arrayList.add(sruVar);
                }
            }
            kej.a("2ARCH_DownLoader", "needVideoResource: " + arrayList.size());
            ArrayList arrayList2 = new ArrayList();
            if (NetWorkUtils.ConnectType.CONNECT_TYPE_WIFI.equals(connectType)) {
                arrayList2.addAll(arrayList);
            } else {
                for (sru sruVar2 : arrayList) {
                    if (sruVar2.f) {
                        arrayList2.add(sruVar2);
                    }
                }
            }
            kmm kmmVar = new kmm();
            kmmVar.f30166a = arrayList2;
            kmmVar.b = new kmq();
            kmmVar.b.f30169a = "TBBootImage";
            kmmVar.b.h = keo.d(str);
            kmmVar.b.j = false;
            com.taobao.downloader.b.a().a(kmmVar, new kml() { // from class: tb.srt.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kml
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // tb.kml
                public void onDownloadStateChange(String str2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str2, new Boolean(z)});
                    }
                }

                @Override // tb.kml
                public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                    }
                }

                @Override // tb.kml
                public void onDownloadError(String str2, int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str2, new Integer(i), str3});
                        return;
                    }
                    kej.a("2ARCH_DownLoader", "download error url：" + str2 + "，path" + str3);
                    srt.a(str, keq.DOWNLOAD_ERROR, keq.CODE_DOWNLOAD_VIDEO_FAIL);
                }

                @Override // tb.kml
                public void onDownloadFinish(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str2, str3});
                        return;
                    }
                    kej.a("2ARCH_DownLoader", "download finish url：" + str2 + "，path" + str3);
                    srt.a(str, keq.DOWNLOAD_SUCCESS, null);
                    srn.a(str3, str);
                }

                @Override // tb.kml
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    } else {
                        srn.e();
                    }
                }
            });
        }
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(url.getFile())) {
                return null;
            }
            String name = new File(url.getFile()).getName();
            kej.a("2ARCH_DownLoader", "get file name. url:" + str);
            return name;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            h.a("").h().a(str, "HotStart", str2, null, str3, null);
        }
    }
}
