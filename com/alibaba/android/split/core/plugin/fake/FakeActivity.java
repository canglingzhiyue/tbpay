package com.alibaba.android.split.core.plugin.fake;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class FakeActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-553407716);
    }

    public static /* synthetic */ Object ipc$super(FakeActivity fakeActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }
}
