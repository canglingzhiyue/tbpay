package com.taobao.avplayer.playercontrol.hiv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kge;

/* loaded from: classes6.dex */
public class OpenUrlSpecialForAlarmActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1979740994);
    }

    public static /* synthetic */ Object ipc$super(OpenUrlSpecialForAlarmActivity openUrlSpecialForAlarmActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_OpenUrlSpecialForAlarmActivity);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        } else if (!(intent.getExtras().get("dto") instanceof OpenUrlSpecialDTO)) {
            finish();
        } else {
            b bVar = OpenUrlSpecialDTO.callbackWeakReference.get();
            if (bVar == null) {
                finish();
                return;
            }
            try {
                bVar.a();
            } catch (Throwable unused) {
            }
            finish();
        }
    }
}
