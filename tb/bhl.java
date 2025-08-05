package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.a;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.j;
import com.alibaba.android.split.k;
import com.alibaba.android.split.p;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.alibaba.android.split.t;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.split.diff.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bhl extends bhh implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f25909a;
    private final SplitInstallServiceImpl.a b;
    private final SplitInstallServiceImpl.b c;
    private bgu d = (bgu) a.b(bgu.class, "SplitInstallService");
    private j e = (j) a.a((Class<? extends Object>) j.class, new Object[0]);
    private List<String> f = new ArrayList();
    private List<Bundle> g;
    private final String h;
    private final int i;
    private Context j;
    private SplitInstallResultCallback k;
    private int l;
    private boolean m;
    private boolean n;

    static {
        kge.a(-359618592);
        kge.a(-1390502639);
    }

    public static /* synthetic */ Object ipc$super(bhl bhlVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean bR_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1604f3a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public bhl(Context context, int i, String str, List<Bundle> list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback, SplitInstallServiceImpl.a aVar, boolean z, SplitInstallServiceImpl.b bVar) {
        this.g = new ArrayList();
        this.h = str;
        this.j = context;
        this.f25909a = i;
        this.i = bundle.getInt("version_code", 0);
        this.n = bundle.getBoolean("silence", false);
        this.g = list;
        this.k = splitInstallResultCallback;
        this.b = aVar;
        this.m = z;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        List<Bundle> list = this.g;
        if (list != null && list.size() > 0) {
            this.f = a(this.g);
            d();
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (c()) {
                return;
            }
            this.d.d("install once:" + this.f, new Object[0]);
            k.a().a(this.j, true, (String[]) this.f.toArray(new String[this.f.size()]));
            this.d.d("install once done :" + this.f, new Object[0]);
            if (c()) {
                return;
            }
            Map<String, Intent> hashMap = new HashMap<>();
            if (bR_()) {
                this.d.d("install from local:" + this.f, new Object[0]);
                hashMap = a(this.j, this.f, this.f25909a);
                this.d.d("install from local done :" + hashMap.keySet(), new Object[0]);
            }
            if (hashMap.keySet().containsAll(this.f)) {
                return;
            }
            List<String> arrayList = new ArrayList<>();
            if (b()) {
                this.d.d("getHistoryInstallFeatures:" + Arrays.toString(this.f.toArray()), new Object[0]);
                arrayList = a(this.j, this.f);
            }
            if (p.a().a().containsAll(this.f)) {
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", this.f25909a);
                bundle.putInt("status", 5);
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                for (String str : this.f) {
                    arrayList2.add(str);
                    Intent intent = new Intent();
                    intent.putExtra("split_id", str);
                    arrayList3.add(intent);
                }
                bundle.putStringArrayList("module_names", arrayList2);
                bundle.putParcelableArrayList("split_file_intents", arrayList3);
                bgf.a(this.j, this.h, bundle);
                if (arrayList.containsAll(this.f)) {
                    this.f25909a += 10000;
                }
            }
            if (!v.b(this.j)) {
                return;
            }
            this.d.d("startInstall installing:" + Arrays.toString(this.f.toArray()), new Object[0]);
            a(hashMap);
            return;
        }
        a(-3);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!p.a().a().containsAll(this.f)) {
            return false;
        }
        String[] strArr = (String[]) this.f.toArray(new String[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", this.f25909a);
        bundle.putInt("status", 5);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        for (String str : strArr) {
            arrayList.add(str);
            Intent intent = new Intent();
            intent.putExtra("split_id", str);
            arrayList2.add(intent);
        }
        bundle.putStringArrayList("module_names", arrayList);
        bundle.putParcelableArrayList("split_file_intents", arrayList2);
        bgf.a(this.j, this.h, bundle);
        this.b.onDownloadStateChange(SplitInstallServiceImpl.b.a(5, 0, 0, "", 0, 0, this.f));
        return true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        try {
            this.k.onError(bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putInt("error_code", 0);
            this.k.onStartInstall(this.f25909a, bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void a(Map<String, Intent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        bgi bgiVar = (bgi) a.a((Class<? extends Object>) bgi.class, this.j);
        ArrayList arrayList = new ArrayList(this.f.size());
        ArrayList<SplitFileInfo> arrayList2 = new ArrayList();
        for (String str : this.f) {
            SplitFileInfo a2 = new f().a(str);
            if (a2 == null || !map.keySet().contains(str)) {
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        Map<String, Intent> a3 = a(this.j, this.f, this.f25909a, arrayList);
        bgu bguVar = this.d;
        bguVar.d("hisInstalSameFeatures features:" + a3.keySet(), new Object[0]);
        if (a3.keySet().containsAll(this.f)) {
            return;
        }
        Iterator<SplitFileInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            SplitFileInfo next = it.next();
            if (bhm.a().a(next.splitName) > 0 && t.a() != null && t.a().a(next.splitName, "baseline").equals("baseline")) {
                arrayList2.add(next);
                it.remove();
            } else if (bhm.a().a(next.splitName) == -1) {
                it.remove();
            } else if (p.a().a().contains(next.splitName) && t.a() != null && t.a().a(next.splitName, "baseline").equals("baseline")) {
                arrayList2.add(next);
                it.remove();
            } else if (a3.containsKey(next.splitName)) {
                arrayList2.add(next);
                it.remove();
            }
        }
        bgu bguVar2 = this.d;
        bguVar2.d("localInstall features:" + map, new Object[0]);
        bgu bguVar3 = this.d;
        bguVar3.d("downloaded features:" + arrayList2, new Object[0]);
        bgu bguVar4 = this.d;
        bguVar4.d("need download features:" + arrayList, new Object[0]);
        if (arrayList.size() != 0) {
            if (bgiVar == null) {
                return;
            }
            bhj a4 = bhj.a(this.j).a(bgiVar).b(this.n).b(this.f).a(arrayList2).a(this.b).a(map).b(a3).a(true).a();
            if (this.m) {
                this.l = this.c.b;
                a4.a(this.l);
                return;
            }
            a4.a(arrayList, this.f25909a, this.i);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", this.f25909a);
        bundle.putInt("status", 3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
        for (SplitFileInfo splitFileInfo : arrayList2) {
            if (!a3.keySet().contains(splitFileInfo.splitName)) {
                arrayList3.add(splitFileInfo.splitName);
                Intent intent = new Intent();
                intent.putExtra("split_id", splitFileInfo.splitName);
                arrayList4.add(intent);
            }
        }
        for (Map.Entry<String, Intent> entry : map.entrySet()) {
            arrayList3.add(entry.getKey());
            arrayList4.add(entry.getValue());
        }
        for (Map.Entry<String, Intent> entry2 : a3.entrySet()) {
            arrayList3.add(entry2.getKey());
            arrayList4.add(entry2.getValue());
        }
        bundle.putStringArrayList("module_names", arrayList3);
        bundle.putParcelableArrayList("split_file_intents", arrayList4);
        bgf.a(this.j, this.h, bundle);
        this.b.onDownloadStateChange(SplitInstallServiceImpl.b.a(3, this.l, 0, "", b(arrayList), b(arrayList), this.f));
    }

    private int b(List<SplitFileInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39e1ecd", new Object[]{this, list})).intValue();
        }
        long j = 0;
        for (SplitFileInfo splitFileInfo : list) {
            j += splitFileInfo.fileSize;
        }
        return (int) j;
    }

    public static List<String> a(List<Bundle> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).getString("module_name");
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    @Override // tb.bhh
    public bgu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("f02c24e", new Object[]{this}) : this.d;
    }
}
