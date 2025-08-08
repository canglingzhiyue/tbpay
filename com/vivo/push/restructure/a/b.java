package com.vivo.push.restructure.a;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.u;
import com.vivo.push.util.v;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private Intent f24227a;
    private com.vivo.push.restructure.request.a.a c;
    private InsideNotificationItem e;
    private UnvarnishedMessage f;
    private String b = "";
    private String d = "";

    public b(Intent intent) {
        this.f24227a = intent;
    }

    private boolean m() {
        return j() == 4;
    }

    private boolean n() {
        return j() == 3;
    }

    private InsideNotificationItem o() {
        InsideNotificationItem insideNotificationItem = this.e;
        if (insideNotificationItem != null) {
            return insideNotificationItem;
        }
        InsideNotificationItem insideNotificationItem2 = null;
        Intent intent = this.f24227a;
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("notification_v1");
                if (stringExtra != null && (insideNotificationItem2 = v.a(stringExtra)) != null) {
                    insideNotificationItem2.setMsgId(Long.parseLong(a()));
                }
            } catch (Exception e) {
                u.a("ReceivedMessageImpl", "getNotificationMessage " + e.getMessage());
            }
        }
        this.e = insideNotificationItem2;
        return insideNotificationItem2;
    }

    private UnvarnishedMessage p() {
        UnvarnishedMessage unvarnishedMessage = this.f;
        if (unvarnishedMessage != null) {
            return unvarnishedMessage;
        }
        UnvarnishedMessage unvarnishedMessage2 = null;
        Intent intent = this.f24227a;
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("msg_v1");
                if (!StringUtils.isEmpty(stringExtra)) {
                    UnvarnishedMessage unvarnishedMessage3 = new UnvarnishedMessage(stringExtra);
                    try {
                        unvarnishedMessage3.setMsgId(Long.parseLong(a()));
                        unvarnishedMessage2 = unvarnishedMessage3;
                    } catch (Exception e) {
                        e = e;
                        unvarnishedMessage2 = unvarnishedMessage3;
                        u.a("ReceivedMessageImpl", "getTransmissionMessage " + e.getMessage());
                        this.f = unvarnishedMessage2;
                        return unvarnishedMessage2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        this.f = unvarnishedMessage2;
        return unvarnishedMessage2;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String a() {
        Bundle extras;
        Intent intent = this.f24227a;
        long j = (intent == null || (extras = intent.getExtras()) == null) ? 0L : extras.getLong("notify_id", 0L);
        return j != 0 ? String.valueOf(j) : "";
    }

    @Override // com.vivo.push.restructure.a.a
    public final Intent b() {
        return this.f24227a;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String c() {
        if (StringUtils.isEmpty(this.b)) {
            this.b = this.f24227a.getStringExtra("req_id");
        }
        return this.b;
    }

    @Override // com.vivo.push.restructure.a.a
    public final long d() {
        Intent intent = this.f24227a;
        if (intent != null) {
            return intent.getLongExtra("ipc_start_time", 0L);
        }
        return 0L;
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean e() {
        Intent intent = this.f24227a;
        if (intent != null) {
            return intent.getBooleanExtra("core_support_monitor", false);
        }
        return false;
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean f() {
        Bundle extras;
        Intent intent = this.f24227a;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return false;
        }
        return extras.getBoolean("client_collect_node", false);
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean g() {
        com.vivo.push.restructure.request.a.a h = h();
        return h != null && h.a() == 2018;
    }

    @Override // com.vivo.push.restructure.a.a
    public final com.vivo.push.restructure.request.a.a h() {
        String stringExtra;
        com.vivo.push.restructure.request.a.a.a aVar;
        if (this.c == null && (stringExtra = this.f24227a.getStringExtra("cf_content")) != null) {
            try {
                aVar = new com.vivo.push.restructure.request.a.a.a(stringExtra);
            } catch (JSONException unused) {
                aVar = null;
            }
            if (aVar != null) {
                this.c = com.vivo.push.restructure.request.a.a.f24233a.a(aVar);
            }
        }
        return this.c;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String i() {
        if (StringUtils.isEmpty(this.d)) {
            this.d = this.f24227a.getStringExtra("content");
        }
        return this.d;
    }

    @Override // com.vivo.push.restructure.a.a
    public final int j() {
        Intent intent = this.f24227a;
        if (intent != null) {
            int intExtra = intent.getIntExtra("command", -1);
            return intExtra < 0 ? this.f24227a.getIntExtra("method", -1) : intExtra;
        }
        return -1;
    }

    @Override // com.vivo.push.restructure.a.a
    public final int k() {
        if (this.f24227a == null) {
            return 0;
        }
        if (m() && o() != null) {
            return o().getTargetType();
        }
        if (n() && p() != null) {
            return p().getTargetType();
        }
        return 0;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String l() {
        return this.f24227a == null ? "" : (!m() || o() == null) ? (!n() || p() == null) ? "" : p().getTragetContent() : o().getTragetContent();
    }
}
