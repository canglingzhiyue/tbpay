package com.taobao.android.diagnose.snapshot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.DiagnoseType;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.logger.EventLogger;
import java.util.HashMap;
import tb.fmx;

/* loaded from: classes.dex */
public class ExceptionManager$1 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final /* synthetic */ a f11724a;

    public static /* synthetic */ void lambda$u2SxNXweUVio87TpeCiSlfVtP5Q(ExceptionManager$1 exceptionManager$1, Intent intent) {
        exceptionManager$1.a(intent);
    }

    public ExceptionManager$1(a aVar) {
        this.f11724a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else {
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.snapshot.-$$Lambda$ExceptionManager$1$u2SxNXweUVio87TpeCiSlfVtP5Q
                {
                    ExceptionManager$1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ExceptionManager$1.lambda$u2SxNXweUVio87TpeCiSlfVtP5Q(ExceptionManager$1.this, intent);
                }
            });
        }
    }

    public /* synthetic */ void a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        try {
            str = e.a();
        } catch (Exception e) {
            e = e;
            str = "";
        }
        try {
            v.a("ExceptionManager", String.format("User Feedback. snapshotID: %s", str));
            com.taobao.android.diagnose.common.b.a(str, DiagnoseType.Feedback.getIndex(), 1);
            String stringExtra = intent.getStringExtra("feedbackID");
            String stringExtra2 = intent.getStringExtra("title");
            HashMap hashMap = new HashMap();
            hashMap.put("feedbackID", stringExtra);
            hashMap.put("title", stringExtra2);
            a.b(this.f11724a).a(str, DiagnoseType.Feedback, a.a(this.f11724a), hashMap);
            EventLogger.builder(5).setData("type", String.valueOf(DiagnoseType.Feedback.getIndex())).setData("snapshotID", str).setData("feedbackID", stringExtra).setData("title", stringExtra2).log();
            if (!com.taobao.android.diagnose.scene.a.a("scene_feedback")) {
                return;
            }
            a aVar = this.f11724a;
            if (a.$ipChange == null) {
                return;
            }
            fmx fmxVar = new fmx();
            fmxVar.a("fact_feedback_id", stringExtra);
            fmxVar.a("fact_feedback_title", stringExtra2);
            a aVar2 = this.f11724a;
            a.$ipChange.a("scene_feedback", fmxVar);
        } catch (Exception e2) {
            e = e2;
            String format = String.format("%s-%s", e.getClass().getName(), e.getMessage());
            com.taobao.android.diagnose.common.b.a(str, DiagnoseType.Feedback.getIndex(), format);
            v.d("ExceptionManager", "Handle user feedback exception: " + format);
        }
    }
}
