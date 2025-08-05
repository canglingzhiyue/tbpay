package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.android.split.a;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class bhi implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25902a;
    private final Context b;
    private final SplitInstallServiceImpl.b c;
    private bgu d = (bgu) a.b(bgu.class, "SplitInstallService");
    private final int e;
    private final int f;
    private final SplitInstallResultCallback g;

    static {
        kge.a(-812050170);
        kge.a(-1390502639);
    }

    public bhi(Context context, String str, int i, SplitInstallServiceImpl.b bVar, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) {
        this.f25902a = str;
        this.b = context;
        this.c = bVar;
        this.f = i;
        this.e = bundle.getInt("version_code", 0);
        this.g = splitInstallResultCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ((bgi) a.a((Class<? extends Object>) bgi.class, this.b)).b(this.c.b);
        this.c.f2505a = 8;
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", this.f);
        bundle.putInt("status", 8);
        bundle.putInt("error_code", this.c.c);
        bundle.putLong("bytes_downloaded", this.c.e);
        bundle.putLong("total_bytes_to_download", this.c.f);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        for (String str : this.c.g) {
            arrayList.add(str);
            Intent intent = new Intent();
            intent.putExtra("split_id", str);
            arrayList2.add(intent);
        }
        bundle.putStringArrayList("module_names", arrayList);
        bundle.putParcelableArrayList("split_file_intents", arrayList2);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("error_code", 0);
            this.g.onCancelInstall(this.f, bundle2);
            bgf.a(this.b, this.b.getPackageName(), bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
