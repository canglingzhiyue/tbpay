package com.taobao.calendar.permission;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import tb.kge;

/* loaded from: classes6.dex */
public class LifePermissionFragment extends Fragment {
    private static final int CALENDAR_WRITE_CODE = 1000;
    public static final String TAG = "PermissionFragment";
    private boolean checkOnce = false;
    private a mPermissionLisener;

    static {
        kge.a(-2108493411);
    }

    private void checkPermission() {
        if (ContextCompat.checkSelfPermission(getContext(), "android.permission.WRITE_CALENDAR") != 0) {
            requestPermissions(new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}, 1000);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1000) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            a aVar = this.mPermissionLisener;
            if (aVar != null) {
                aVar.b();
            }
        } else {
            a aVar2 = this.mPermissionLisener;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
        if (!this.checkOnce) {
            return;
        }
        try {
            FragmentActivity activity = getActivity();
            if (!(activity instanceof FragmentActivity)) {
                return;
            }
            activity.getSupportFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        } catch (Throwable unused) {
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        checkPermission();
    }

    public void setCheckOnce(boolean z) {
        this.checkOnce = z;
    }

    public void setPermissionLisener(a aVar) {
        this.mPermissionLisener = aVar;
    }
}
