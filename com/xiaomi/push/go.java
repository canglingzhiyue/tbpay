package com.xiaomi.push;

import java.text.SimpleDateFormat;
import java.util.Date;
import tb.riy;

/* loaded from: classes9.dex */
public class go implements hc {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24505a = false;

    /* renamed from: a  reason: collision with other field name */
    private gq f428a;

    /* renamed from: a  reason: collision with other field name */
    private SimpleDateFormat f431a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: a  reason: collision with other field name */
    private a f427a = null;
    private a b = null;

    /* renamed from: a  reason: collision with other field name */
    private gt f429a = null;

    /* renamed from: a  reason: collision with other field name */
    private final String f430a = "[Slim] ";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class a implements gv, hd {

        /* renamed from: a  reason: collision with other field name */
        String f432a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f433a;

        a(boolean z) {
            this.f433a = true;
            this.f433a = z;
            this.f432a = z ? " RCV " : " Sent ";
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        @Override // com.xiaomi.push.gv
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.xiaomi.push.gf r6) {
            /*
                Method dump skipped, instructions count: 357
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.go.a.a(com.xiaomi.push.gf):void");
        }

        @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
        /* renamed from: a */
        public void mo1982a(hh hhVar) {
            StringBuilder sb;
            String str;
            if (go.f24505a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(go.this.f431a.format(new Date()));
                sb.append(this.f432a);
                sb.append(" PKT ");
                str = hhVar.m2007a();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(go.this.f431a.format(new Date()));
                sb.append(this.f432a);
                sb.append(" PKT [");
                sb.append(hhVar.k());
                sb.append(",");
                sb.append(hhVar.j());
                str = riy.ARRAY_END_STR;
            }
            sb.append(str);
            com.xiaomi.channel.commonutils.logger.b.c(sb.toString());
        }

        @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo1982a(hh hhVar) {
            return true;
        }
    }

    public go(gq gqVar) {
        this.f428a = null;
        this.f428a = gqVar;
        a();
    }

    private void a() {
        this.f427a = new a(true);
        this.b = new a(false);
        gq gqVar = this.f428a;
        a aVar = this.f427a;
        gqVar.a(aVar, aVar);
        gq gqVar2 = this.f428a;
        a aVar2 = this.b;
        gqVar2.b(aVar2, aVar2);
        this.f429a = new gp(this);
    }
}
