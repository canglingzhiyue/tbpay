package com.taobao.android.tschedule.protocol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jkq;
import tb.jmi;

/* loaded from: classes6.dex */
public class MultiProcessor$2 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        jkq.a("TS.MultiProcessor", "onReceive, action=" + action + ", process=" + jmi.a());
        char c = 65535;
        switch (action.hashCode()) {
            case -2123610111:
                if (action.equals(a.TYPE_CHANGE_WEBVIEW_PROTOCOL)) {
                    c = 0;
                    break;
                }
                break;
            case -955176800:
                if (action.equals(a.TYPE_CHANGE_TRIVER_PROTOCOL)) {
                    c = 1;
                    break;
                }
                break;
            case 1162156220:
                if (action.equals(a.TYPE_SCHEDULE_TASK)) {
                    c = 2;
                    break;
                }
                break;
            case 1171227503:
                if (action.equals(a.TYPE_SCHEDULE_TASK_WITH_CONFIGS)) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            b.a().c(intent.getStringExtra(a.KET_PROTOCOL_BIZ_CODE), intent.getStringExtra(a.KET_PROTOCOL_CLASS));
        } else if (c == 1) {
            b.a().d(intent.getStringExtra(a.KET_PROTOCOL_BIZ_CODE), intent.getStringExtra(a.KET_PROTOCOL_CLASS));
        } else if ((c != 2 && c != 3) || !TextUtils.equals(intent.getStringExtra(a.KET_TARGET_PROCESS), jmi.a())) {
        } else {
            String stringExtra = intent.getStringExtra(a.KET_TASK_URL);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            if (action == a.TYPE_SCHEDULE_TASK) {
                a.a(stringExtra, intent.getStringArrayListExtra(a.KET_TARGET_TASK));
            } else if (action != a.TYPE_SCHEDULE_TASK_WITH_CONFIGS) {
            } else {
                a.b(stringExtra, intent.getStringArrayListExtra(a.KET_TARGET_TASK_CONFIG));
            }
        }
    }
}
