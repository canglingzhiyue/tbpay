package com.alibaba.poplayer.trigger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class TriggerBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final h f3205a;

    static {
        kge.a(2096504349);
    }

    public static /* synthetic */ void lambda$E5S0fvcVTddZVZMo1FPgNsFsoOc(TriggerBroadcastReceiver triggerBroadcastReceiver, Intent intent) {
        triggerBroadcastReceiver.a(intent);
    }

    public TriggerBroadcastReceiver(h hVar) {
        this.f3205a = hVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$TriggerBroadcastReceiver$E5S0fvcVTddZVZMo1FPgNsFsoOc
                {
                    TriggerBroadcastReceiver.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TriggerBroadcastReceiver.lambda$E5S0fvcVTddZVZMo1FPgNsFsoOc(TriggerBroadcastReceiver.this, intent);
                }
            });
        }
    }

    public /* synthetic */ void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        try {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastReceiver.onReceive.action=." + action);
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1615375286) {
                if (hashCode != -1561576662) {
                    if (hashCode == -1294329896 && action.equals("com.alibaba.poplayer.PopLayer.action.POP")) {
                        c = 0;
                    }
                } else if (action.equals(PopLayer.ACTION_FRAGMENT_SWITCH)) {
                    c = 1;
                }
            } else if (action.equals(PopLayer.ACTION_PRE_DEAL_CUSTOM_TRIGGER)) {
                c = 2;
            }
            if (c == 0) {
                this.f3205a.a(intent.getStringExtra("event"), intent.getStringExtra("param"), intent.getStringExtra(PopLayer.EXTRA_KEY_EXTRA_PARAMS));
            } else if (c == 1) {
                this.f3205a.a(intent.getStringExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME), intent.getStringExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM), intent.getStringExtra(PopLayer.EXTRA_KEY_EXTRA_PARAMS), intent.getBooleanExtra(PopLayer.EXTRA_KEY_FRAGMENT_NEED_ACTIVITY_PARAM, false), true);
            } else if (c != 2) {
            } else {
                this.f3205a.a(intent.getStringExtra(h.KEY_URI_SET), intent.getStringExtra(h.KEY_INDEX_MAP), intent.getStringExtra(h.KEY_NO_ALG_FILTER_MAP), (JSONObject) intent.getSerializableExtra(h.KEY_TRACK_MAP), intent.getStringExtra("traceId"), intent.getLongExtra(h.KEY_DEAL_START_TIME, 0L), intent.getLongExtra(h.KEY_DEAL_END_TIME, 0L), intent.getLongExtra(h.KEY_SDK_WAIT_TIME, 0L), true);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TriggerBroadcastReceiver.onReceive.error", th);
        }
    }
}
