package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.alibaba.android.split.PatchSplitFileInfo;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.split.diff.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class bhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<gox> f25901a = new ArrayList();

    static {
        kge.a(1213530942);
    }

    public abstract bgu a();

    public void a(gox goxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaabd448", new Object[]{this, goxVar});
            return;
        }
        synchronized (this.f25901a) {
            this.f25901a.add(goxVar);
        }
    }

    public List<String> a(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("84cdb4d6", new Object[]{this, context, list});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!bht.a(context).a(str)) {
                synchronized (this.f25901a) {
                    for (gox goxVar : this.f25901a) {
                        goxVar.a(str);
                    }
                }
            } else if (bht.a(context).a(str) && !p.a().a().contains(str)) {
                bgu a2 = a();
                a2.d("SplitInstallManager can use history feature:" + str, new Object[0]);
                if (bht.a(context).a(context, str, bht.a(context).b(str))) {
                    synchronized (this.f25901a) {
                        for (gox goxVar2 : this.f25901a) {
                            goxVar2.a(str, bht.a(context).b(str));
                        }
                    }
                    bgu a3 = a();
                    a3.d("SplitInstallManager", "install history feature:" + str + " success !");
                    arrayList.add(str);
                } else {
                    synchronized (this.f25901a) {
                        for (gox goxVar3 : this.f25901a) {
                            goxVar3.a(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public Map<String, Intent> a(Context context, List<String> list, int i, List<SplitFileInfo> list2) {
        File b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9a115b8", new Object[]{this, context, list, new Integer(i), list2});
        }
        new ArrayList();
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (list2 != null && list2.size() > 0) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                SplitFileInfo splitFileInfo = list2.get(i2);
                if (splitFileInfo instanceof PatchSplitFileInfo) {
                    PatchSplitFileInfo patchSplitFileInfo = (PatchSplitFileInfo) splitFileInfo;
                    if (patchSplitFileInfo.sameFile && (b = d.a().b(patchSplitFileInfo)) != null && b.exists()) {
                        Intent intent = new Intent();
                        intent.putExtra("split_id", splitFileInfo.splitName);
                        intent.setData(Uri.fromFile(b));
                        hashMap.put(splitFileInfo.splitName, intent);
                        bhm.a().b().a(splitFileInfo.splitName, 1);
                        arrayList.add(intent);
                    }
                }
            }
        }
        if (hashMap.keySet().containsAll(list)) {
            bundle.putInt("session_id", i);
            bundle.putInt("status", 3);
            bundle.putInt("error_code", 0);
            bundle.putLong("bytes_downloaded", 0L);
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putStringArrayList("module_names", new ArrayList<>(hashMap.keySet()));
            bundle.putParcelableArrayList("split_file_intents", arrayList);
            bgf.a(context, context.getPackageName(), bundle);
        }
        return hashMap;
    }

    public Map<String, Intent> a(Context context, List<String> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("58476687", new Object[]{this, context, list, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (bia.b(context, list.get(i2)) && bia.c(context, list.get(i2))) {
                    Intent intent = new Intent();
                    intent.putExtra("split_id", list.get(i2));
                    try {
                        File a2 = bia.a(context, list.get(i2));
                        if (a2 != null && a2.exists()) {
                            intent.setData(Uri.fromFile(a2));
                            hashMap.put(list.get(i2), intent);
                            arrayList2.add(intent);
                            bhm.a().b().a(list.get(i2), 1);
                        }
                    } catch (Exception e) {
                        arrayList.add(list.get(i2));
                        e.printStackTrace();
                    }
                } else {
                    arrayList.add(list.get(i2));
                }
            }
        }
        if (hashMap.keySet().containsAll(list)) {
            bundle.putInt("session_id", i);
            bundle.putInt("status", 3);
            bundle.putInt("error_code", 0);
            bundle.putLong("bytes_downloaded", 0L);
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putStringArrayList("module_names", new ArrayList<>(hashMap.keySet()));
            bundle.putParcelableArrayList("split_file_intents", arrayList2);
            bgf.a(context, context.getPackageName(), bundle);
        }
        return hashMap;
    }
}
