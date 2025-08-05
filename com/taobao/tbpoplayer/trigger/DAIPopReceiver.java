package com.taobao.tbpoplayer.trigger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.info.a;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class DAIPopReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_MODEL_NAME = "com.tmall.android.dai.intent.extra.MODEL_NAME";
    public static final String EXTRA_OUTPUT_DATA = "com.tmall.android.dai.intent.extra.OUTPUT_DATA";
    public static final String EXTRA_RESULT = "com.tmall.android.dai.intent.extra.RESULT";

    static {
        kge.a(-440258855);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if (!a.a().g()) {
                c.b("triggerEvent", "", "DAIPopReceiver.isDAITriggerSwitchOn=false.");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("com.tmall.android.dai.intent.extra.RESULT", false);
            String stringExtra = intent.getStringExtra("com.tmall.android.dai.intent.extra.MODEL_NAME");
            Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
            if (!(serializableExtra instanceof HashMap)) {
                c.a("triggerEvent", "", "DAIPopReceiver.onReceive.intent.getOutputData.fail.");
                return;
            }
            HashMap hashMap = (HashMap) serializableExtra;
            if (!booleanExtra) {
                c.b("triggerEvent", "", "DAIPopReceiver.invalid.result=false.modelName=" + stringExtra);
                return;
            }
            Object obj = hashMap.get("event");
            Object obj2 = hashMap.get("param");
            if ((obj instanceof String) && (obj2 instanceof String)) {
                Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent2.putExtra("event", (String) obj);
                intent2.putExtra("param", (String) obj2);
                intent2.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "dai");
                LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent2);
                c.a("DAIPopReceiver.msg=" + intent.getExtras(), new Object[0]);
                return;
            }
            c.a("triggerEvent", "", "DAIPopReceiver.onReceive.outputData.getParam.fail.");
        } catch (Throwable unused) {
            c.a("triggerEvent", "", "DAIPopReceiver.onReceive.fail.");
        }
    }
}
