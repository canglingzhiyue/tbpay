package com.taobao.android.interactive_common.view;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.grr;

/* loaded from: classes5.dex */
public class LocalTBackFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LocalImageSaveFeature f12937a;

    public static /* synthetic */ Object ipc$super(LocalTBackFragment localTBackFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1257714799) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        grr.a(getActivity(), "LocalTBackFragment_onCreate", null);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        LocalImageSaveFeature localImageSaveFeature = this.f12937a;
        if (localImageSaveFeature == null) {
            return;
        }
        localImageSaveFeature.onActivityResult(i, i2, intent);
    }

    public void a(LocalImageSaveFeature localImageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a74a604", new Object[]{this, localImageSaveFeature});
        } else {
            this.f12937a = localImageSaveFeature;
        }
    }
}
