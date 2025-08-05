package tb;

import android.app.job.JobInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.a;
import com.alibaba.android.split.b;
import com.alibaba.android.split.g;
import com.alibaba.android.split.h;
import com.alibaba.android.split.k;
import com.alibaba.android.split.p;
import com.alibaba.android.split.t;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.split.diff.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class bgs extends bhh implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f25885a;
    private final JobInfo b;
    private g c = new b();
    private bgu d = (bgu) a.b(bgu.class, "DefferInstallJob");

    static {
        kge.a(-896710472);
        kge.a(-1390502639);
    }

    public bgs(Context context, JobInfo jobInfo) {
        this.f25885a = context;
        this.b = jobInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            PersistableBundle extras = this.b.getExtras();
            String[] stringArray = extras.getStringArray("module_names");
            int i = extras.getInt("version_code", 0);
            int i2 = extras.getInt("sessionId", 0);
            ArrayList arrayList = new ArrayList(Arrays.asList(stringArray));
            this.d.d("onStartJob run......" + arrayList, new Object[0]);
            for (String str : stringArray) {
                if (this.c.g(str) != null) {
                    for (String str2 : this.c.g(str)) {
                        if (!arrayList.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
            if (k.b()) {
                k.a().a(this.f25885a, true, (String[]) arrayList.toArray(new String[0]));
            }
            if (p.a().a().containsAll(arrayList)) {
                return;
            }
            Map<String, Intent> a2 = a(this.f25885a, arrayList, i2);
            if (a2.keySet().containsAll(arrayList) || arrayList.size() <= 0 || !v.b(this.f25885a) || !v.d(this.f25885a)) {
                return;
            }
            bgi bgiVar = (bgi) a.a((Class<? extends Object>) bgi.class, this.f25885a);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String str3 : arrayList) {
                SplitFileInfo a3 = new f().a(str3);
                if (a3 != null && !a2.keySet().contains(str3)) {
                    arrayList2.add(a3);
                }
            }
            Map<String, Intent> a4 = a(this.f25885a, arrayList, i2, arrayList2);
            if (a4.keySet().containsAll(arrayList)) {
                return;
            }
            Iterator<SplitFileInfo> it = arrayList2.iterator();
            ArrayList<SplitFileInfo> arrayList3 = new ArrayList();
            while (it.hasNext()) {
                SplitFileInfo next = it.next();
                h a5 = t.a();
                if (bhm.a().a(next.splitName) > 0 && a5 != null && a5.a(next.splitName, "baseline").equals("baseline")) {
                    arrayList3.add(next);
                    it.remove();
                } else if (bhm.a().a(next.splitName) == -1) {
                    it.remove();
                } else if (p.a().a().contains(next.splitName) && a5 != null && a5.a(next.splitName, "baseline").equals("baseline")) {
                    arrayList3.add(next);
                    it.remove();
                } else if (a4.containsKey(next.splitName)) {
                    arrayList3.add(next);
                    it.remove();
                }
            }
            if (arrayList2.size() != 0) {
                if (bgiVar == null) {
                    return;
                }
                bhj.a(this.f25885a).b(arrayList).a(bgiVar).a(a2).b(a4).b(true).a(false).a(arrayList3).a().a(arrayList2, i2, i);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            bundle.putInt("status", 3);
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
            for (SplitFileInfo splitFileInfo : arrayList3) {
                if (!a4.keySet().contains(splitFileInfo.splitName)) {
                    arrayList4.add(splitFileInfo.splitName);
                    Intent intent = new Intent();
                    intent.putExtra("split_id", splitFileInfo.splitName);
                    arrayList5.add(intent);
                }
            }
            for (Map.Entry<String, Intent> entry : a2.entrySet()) {
                arrayList4.add(entry.getKey());
                arrayList5.add(entry.getValue());
            }
            for (Map.Entry<String, Intent> entry2 : a4.entrySet()) {
                arrayList4.add(entry2.getKey());
                arrayList5.add(entry2.getValue());
            }
            bundle.putStringArrayList("module_names", arrayList4);
            bundle.putParcelableArrayList("split_file_intents", arrayList5);
            bgf.a(this.f25885a, this.f25885a.getPackageName(), bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tb.bhh
    public bgu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("f02c24e", new Object[]{this}) : this.d;
    }
}
