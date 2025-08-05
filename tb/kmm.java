package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class kmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<kmo> f30166a = new ArrayList();
    public kmq b = new kmq();

    public kmm() {
    }

    public kmm(String str) {
        kmo kmoVar = new kmo();
        kmoVar.f30167a = str;
        this.f30166a.add(kmoVar);
    }

    public kmm(String... strArr) {
        for (String str : strArr) {
            kmo kmoVar = new kmo();
            kmoVar.f30167a = str;
            this.f30166a.add(kmoVar);
        }
    }

    public boolean a() {
        List<kmo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b == null || (list = this.f30166a) == null || list.isEmpty()) {
            kmv.c("DownloadRequest", "validate", "param is null");
            return false;
        } else if (TextUtils.isEmpty(this.b.h)) {
            kmv.c("DownloadRequest", "validate", "param fileStorePath is null");
            return false;
        } else {
            for (kmo kmoVar : this.f30166a) {
                if (TextUtils.isEmpty(kmoVar.f30167a)) {
                    kmv.c("DownloadRequest", "validate", "param url is null");
                    return false;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (kmo kmoVar2 : this.f30166a) {
                if (!arrayList.contains(kmoVar2)) {
                    arrayList.add(kmoVar2);
                }
            }
            this.f30166a = arrayList;
            return true;
        }
    }
}
