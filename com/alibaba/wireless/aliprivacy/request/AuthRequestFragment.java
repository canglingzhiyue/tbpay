package com.alibaba.wireless.aliprivacy.request;

import android.app.Fragment;
import com.alibaba.wireless.aliprivacy.b;
import com.alibaba.wireless.aliprivacy.d;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class AuthRequestFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int PERMISSION_REQ_CODE = 0;

    /* renamed from: a  reason: collision with root package name */
    private d f4235a;

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i == 0 && this.f4235a != null) {
            HashMap hashMap = new HashMap(2);
            for (String str : strArr) {
                hashMap.put(str, b.a(getActivity(), new String[]{str}));
            }
        }
    }
}
