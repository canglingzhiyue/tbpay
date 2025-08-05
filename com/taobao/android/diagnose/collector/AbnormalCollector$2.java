package com.taobao.android.diagnose.collector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.AbnormalInfo;
import com.taobao.android.diagnose.v;
import tb.fmx;
import tb.jvw;

/* loaded from: classes.dex */
public class AbnormalCollector$2 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final /* synthetic */ b f11686a;

    public static /* synthetic */ void lambda$VRn13zSZARAI60EkdcX9a9gZSXg(AbnormalCollector$2 abnormalCollector$2, Intent intent) {
        abnormalCollector$2.a(intent);
    }

    public AbnormalCollector$2(b bVar) {
        this.f11686a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            this.f11686a.c.execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$AbnormalCollector$2$VRn13zSZARAI60EkdcX9a9gZSXg
                {
                    AbnormalCollector$2.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbnormalCollector$2.lambda$VRn13zSZARAI60EkdcX9a9gZSXg(AbnormalCollector$2.this, intent);
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
            AbnormalInfo abnormalInfo = new AbnormalInfo(15);
            String stringExtra = intent.getStringExtra("wxInteraction");
            String stringExtra2 = intent.getStringExtra(jvw.KEY_PAGE_STAGES_AREA_COVERAGE);
            String stringExtra3 = intent.getStringExtra("bundleUrl");
            if (stringExtra != null) {
                abnormalInfo.addInfo("wxInteraction", stringExtra);
            }
            if (stringExtra2 != null) {
                abnormalInfo.addInfo(jvw.KEY_PAGE_STAGES_AREA_COVERAGE, stringExtra2);
            }
            if (stringExtra3 != null) {
                abnormalInfo.addInfo("bundleUrl", stringExtra3);
            }
            b.a(this.f11686a, abnormalInfo);
            v.a("AbnormalCollector", "Weex White Page Event: " + abnormalInfo.info.toString());
            if (this.f11686a.b.i().isInner) {
                com.taobao.android.diagnose.common.b.a(abnormalInfo.type);
            }
            if (b.a(this.f11686a) == null) {
                return;
            }
            b.a(this.f11686a).a("scene_white_weex", (fmx) null);
        } catch (Exception e) {
            v.a("AbnormalCollector", "Weex White Page Event Exception", e);
        }
    }
}
