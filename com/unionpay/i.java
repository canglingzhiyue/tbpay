package com.unionpay;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import tb.rnl;
import tb.rnm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24024a;
    final /* synthetic */ h b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(h hVar, String str) {
        this.b = hVar;
        this.f24024a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        String str;
        Context b;
        String str2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        Handler handler8;
        Handler handler9;
        Handler handler10;
        Handler handler11;
        Handler handler12;
        Handler handler13;
        Handler handler14;
        try {
            handler4 = this.b.f24023a;
            if (handler4 != null) {
                handler14 = this.b.f24023a;
                handler14.sendEmptyMessageDelayed(1008, 5000L);
            }
            String str3 = this.f24024a;
            str = this.b.e;
            String format = String.format(str3, com.unionpay.utils.b.b(str));
            com.unionpay.utils.j.a("uppay", "merUrl: " + format);
            rnm rnmVar = new rnm(format);
            b = this.b.b();
            String a2 = com.unionpay.utils.b.a(b);
            rnl rnlVar = new rnl(rnmVar, a2);
            str2 = this.b.e;
            int a3 = TextUtils.isEmpty(str2) ? 22 : rnlVar.a();
            if (a3 == 0) {
                String b2 = rnlVar.b();
                handler12 = this.b.f24023a;
                if (handler12 != null) {
                    handler13 = this.b.f24023a;
                    handler13.removeMessages(1008);
                }
                h.a(this.b, b2);
            } else if (a3 != 22) {
                handler5 = this.b.f24023a;
                if (handler5 == null) {
                    return;
                }
                handler6 = this.b.f24023a;
                handler6.removeMessages(1008);
                handler7 = this.b.f24023a;
                handler7.sendEmptyMessage(1009);
            } else {
                String format2 = String.format(this.f24024a, "conf_mode_02");
                rnmVar.b(format2);
                com.unionpay.utils.j.a("uppay", "baseUrl: " + format2);
                rnl rnlVar2 = new rnl(rnmVar, a2);
                int a4 = rnlVar2.a();
                handler8 = this.b.f24023a;
                if (handler8 != null) {
                    handler11 = this.b.f24023a;
                    handler11.removeMessages(1008);
                }
                if (a4 == 0) {
                    h.a(this.b, rnlVar2.b());
                    return;
                }
                handler9 = this.b.f24023a;
                if (handler9 == null) {
                    return;
                }
                handler10 = this.b.f24023a;
                handler10.sendEmptyMessage(1009);
            }
        } catch (Exception unused) {
            handler = this.b.f24023a;
            if (handler == null) {
                return;
            }
            handler2 = this.b.f24023a;
            handler2.removeMessages(1008);
            handler3 = this.b.f24023a;
            handler3.sendEmptyMessage(1010);
        }
    }
}
