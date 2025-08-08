package com.taobao.umipublish.extension.windvane.abilities;

import mtopsdk.common.util.StringUtils;
import android.webkit.MimeTypeMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.ado;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.ogz;
import tb.tek;

/* loaded from: classes9.dex */
public class DownloadFilesAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DownloadFilesAbility";
    private static final String TYPE_PICTURE = "pic";
    private static final String TYPE_VIDEO = "video";

    /* renamed from: a  reason: collision with root package name */
    private final List<DownloadItem> f23329a = new ArrayList();

    /* loaded from: classes9.dex */
    public static class DownloadItem implements Serializable {
        public String md5;
        public boolean needBlockDomain;
        public boolean optional;
        public String path;
        public int progress;
        public int state;
        public String suffix;
        public String tag;
        public String type;
        public String url;
        public float weight;

        static {
            kge.a(407924870);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(262140441);
    }

    public static /* synthetic */ Object ipc$super(DownloadFilesAbility downloadFilesAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(DownloadFilesAbility downloadFilesAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffd7ea0", new Object[]{downloadFilesAbility});
        } else {
            downloadFilesAbility.b();
        }
    }

    public static /* synthetic */ void b(DownloadFilesAbility downloadFilesAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fed03f", new Object[]{downloadFilesAbility});
        } else {
            downloadFilesAbility.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("3001", "EMPTY_PARAMS");
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("downloadList");
            if (jSONArray == null || jSONArray.size() == 0) {
                errorCallback("3001", "EMPTY_DATA");
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                this.f23329a.add(JSONObject.toJavaObject(jSONArray.getJSONObject(i), DownloadItem.class));
            }
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int size = this.f23329a.size();
        for (int i = 0; i < size; i++) {
            final DownloadItem downloadItem = this.f23329a.get(i);
            b.a().a(a(downloadItem), new kml() { // from class: com.taobao.umipublish.extension.windvane.abilities.DownloadFilesAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kml
                public void onDownloadStateChange(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                    }
                }

                @Override // tb.kml
                public void onNetworkLimit(int i2, kmq kmqVar, kml.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i2), kmqVar, aVar});
                    }
                }

                @Override // tb.kml
                public void onDownloadProgress(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    downloadItem.progress = i2;
                    DownloadFilesAbility.a(DownloadFilesAbility.this);
                }

                @Override // tb.kml
                public void onDownloadError(String str, int i2, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i2), str2});
                        return;
                    }
                    downloadItem.state = 1;
                    UmiPublishMonitor.a().b("3001", i2 + "|" + str2, "download_file_error", str);
                }

                @Override // tb.kml
                public void onDownloadFinish(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                        return;
                    }
                    DownloadItem downloadItem2 = downloadItem;
                    downloadItem2.state = 1;
                    downloadItem2.progress = 100;
                    DownloadFilesAbility.a(DownloadFilesAbility.this);
                    if (!StringUtils.equals(downloadItem.url, str)) {
                        return;
                    }
                    downloadItem.path = str2;
                }

                @Override // tb.kml
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    } else {
                        DownloadFilesAbility.b(DownloadFilesAbility.this);
                    }
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f23329a.size() != 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f23329a.size(); i2++) {
                DownloadItem downloadItem = this.f23329a.get(i2);
                i = (int) (i + ((downloadItem.weight > 0.0f ? downloadItem.weight : 1.0f / this.f23329a.size()) * downloadItem.progress));
            }
            progressCallback(i);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ArrayList<DownloadItem> arrayList = new ArrayList();
        boolean z = false;
        for (int i = 0; i < this.f23329a.size(); i++) {
            DownloadItem downloadItem = this.f23329a.get(i);
            if (downloadItem.state == 0) {
                return;
            }
            if (StringUtils.isEmpty(downloadItem.path) && !downloadItem.optional) {
                z = true;
            } else if (!StringUtils.isEmpty(downloadItem.path)) {
                arrayList.add(downloadItem);
            }
        }
        if (z) {
            errorCallback("3001", "FILE_DOWNLOAD_ERROR");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (DownloadItem downloadItem2 : arrayList) {
            jSONArray.add(JSON.toJSON(downloadItem2));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileList", (Object) jSONArray);
        successCallback(jSONObject);
    }

    private kmm a(DownloadItem downloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmm) ipChange.ipc$dispatch("8c460bea", new Object[]{this, downloadItem});
        }
        String str = downloadItem.url;
        String str2 = downloadItem.md5;
        String a2 = !StringUtils.isEmpty(downloadItem.suffix) ? downloadItem.suffix : a(str);
        if (StringUtils.isEmpty(a2)) {
            a2 = "";
        } else if (!a2.startsWith(".")) {
            a2 = "." + a2;
        }
        if ("pic".equals(downloadItem.type) && downloadItem.needBlockDomain) {
            str = a(tek.h(), null, str);
            downloadItem.url = str;
        }
        kmo kmoVar = new kmo();
        kmoVar.f30167a = str;
        kmoVar.c = str2;
        kmoVar.d = ogz.a(str) + a2;
        kmm kmmVar = new kmm();
        kmmVar.b.h = UmiResourceDownloadBridge.getDownloadStoreDir(this.mContext);
        kmmVar.b.f30169a = "guangguang";
        kmmVar.f30166a.add(kmoVar);
        return kmmVar;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!StringUtils.isEmpty(fileExtensionFromUrl)) {
            return fileExtensionFromUrl;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf < 0 || lastIndexOf >= str.length() - 1) ? "" : str.substring(lastIndexOf);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isEmpty(str3) || !str3.contains(ado.URL_SEPARATOR)) {
            return str3;
        }
        String[] split = str3.split(ado.URL_SEPARATOR);
        sb.append(split[0]);
        sb.append(ado.URL_SEPARATOR);
        if (StringUtils.isEmpty(str2)) {
            sb.append(str);
        } else {
            sb.append(str);
            sb.append(":");
            sb.append(str2);
        }
        if (split[1].contains("/")) {
            String[] split2 = split[1].split("/");
            if (split2.length > 1) {
                for (int i = 1; i < split2.length; i++) {
                    sb.append("/");
                    sb.append(split2[i]);
                }
            }
        }
        return sb.toString();
    }
}
