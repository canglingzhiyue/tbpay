package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d;
import com.taobao.mmad.data.BaseMmAdModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public class tjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final tiq f34142a;
    private xno b;

    static {
        kge.a(507358847);
    }

    public static /* synthetic */ xno a(tjb tjbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xno) ipChange.ipc$dispatch("3d8a9541", new Object[]{tjbVar}) : tjbVar.b;
    }

    public tjb(tiq tiqVar) {
        this.f34142a = tiqVar;
    }

    public void a(xno xnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c07ff", new Object[]{this, xnoVar});
        } else {
            this.b = xnoVar;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String c = keo.c(str);
        if (TextUtils.isEmpty(c)) {
            stv.a("DownloadManager", "downloadUrl: can not parse file name, url: " + str);
            return;
        }
        kmo kmoVar = new kmo();
        kmoVar.f30167a = str;
        kmoVar.d = c;
        kmm kmmVar = new kmm();
        kmmVar.f30166a = Collections.singletonList(kmoVar);
        kmmVar.b = new kmq();
        kmmVar.b.f30169a = tiq.BIZ_CODE;
        kmmVar.b.j = false;
        kmmVar.b.h = stu.a();
        b.a().a(kmmVar, new kmk() { // from class: tb.tjb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kmk, tb.kml
            public void onDownloadError(String str2, int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str2, new Integer(i), str3});
                    return;
                }
                stv.a("DownloadManager", "downloadUrl: download error, url: " + str2 + ", errorCode: " + i + ", msg: " + str3);
                if (tjb.a(tjb.this) == null) {
                    return;
                }
                tjb.a(tjb.this).a(str2, i, str3);
            }

            @Override // tb.kmk, tb.kml
            public void onDownloadFinish(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str2, str3});
                    return;
                }
                stv.a("DownloadManager", "downloadUrl: download finish, url: " + str2 + ", filePath: " + str3);
                if (tjb.a(tjb.this) == null) {
                    return;
                }
                tjb.a(tjb.this).a(str2, str3);
            }
        });
        stv.a("DownloadManager", "downloadUrl: start download, url: " + str + ", name: " + c);
    }

    public void a(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        this.f34142a.g().b().e();
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : list) {
            this.f34142a.g().b().a(jSONObject);
            JSONObject b = ssf.b(jSONObject);
            if (b != null) {
                boolean booleanValue = b.getBooleanValue("enable4G");
                a(b.getString("imgUrl"), 1, booleanValue, arrayList);
                a(b.getString(d.FIRST_FRAME_IMAGE_URL), 1, booleanValue, arrayList);
                a(b.getString("videoUrl"), 0, booleanValue, arrayList);
                if (!TextUtils.isEmpty(b.getString("animationLottie")) && "1".equals(b.getString("animationType"))) {
                    a(b.getString("animationLottie"), 2, booleanValue, arrayList);
                }
                if (!TextUtils.isEmpty(b.getString("gestureImage"))) {
                    a(b.getString("gestureImage"), 1, booleanValue, arrayList);
                }
                if (!TextUtils.isEmpty(b.getString("interactImage"))) {
                    a(b.getString("interactImage"), 1, booleanValue, arrayList);
                }
            }
        }
        if (arrayList.isEmpty()) {
            stv.a("DownloadManager", "downloadAdResource: list is empty.");
        } else {
            this.f34142a.a().a(arrayList, tiq.BIZ_CODE);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        BaseMmAdModel b = this.f34142a.d().b();
        if (!TextUtils.isEmpty(b.animationLottie) && !(z = stu.c(b.animationLottie))) {
            stv.a("DownloadManager", "isResourceReady: animationLottie not exist, url: " + b.animationLottie);
            return false;
        } else if (!TextUtils.isEmpty(b.gestureImage) && !(z = srn.a(b.gestureImage))) {
            stv.a("DownloadManager", "isResourceReady: gestureImage not exist, url: " + b.gestureImage);
            return false;
        } else if (TextUtils.isEmpty(b.interactImage) || (z = srn.a(b.interactImage))) {
            return z;
        } else {
            stv.a("DownloadManager", "isResourceReady: interactImage not exist, url: " + b.interactImage);
            return false;
        }
    }

    private void a(String str, int i, boolean z, List<sru> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b30ed4", new Object[]{this, str, new Integer(i), new Boolean(z), list});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            list.add(new sru(str, i, z));
        }
    }
}
