package cn.wh.auth.server;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import cn.wh.auth.server.a;

/* loaded from: classes2.dex */
public class OnWHResultDispatcherFragment extends Fragment {
    public static final String TAG = "on_wh_local_result_dispatcher";

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<a.InterfaceC0030a> f1735a = new SparseArray<>();

    public void a(Intent intent, a.InterfaceC0030a interfaceC0030a) {
        this.f1735a.put(120, interfaceC0030a);
        startActivityForResult(intent, 111);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        a.InterfaceC0030a interfaceC0030a = this.f1735a.get(120);
        this.f1735a.remove(i);
        if (interfaceC0030a != null) {
            interfaceC0030a.a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
