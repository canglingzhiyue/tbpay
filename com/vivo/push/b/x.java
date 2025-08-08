package com.vivo.push.b;

import mtopsdk.common.util.StringUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes9.dex */
public final class x extends com.vivo.push.v {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f24171a;
    private long b;

    public x() {
        super(2012);
    }

    public x(long j) {
        this();
        this.b = j;
    }

    public final void a(HashMap<String, String> hashMap) {
        this.f24171a = hashMap;
    }

    @Override // com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        dVar.a("ReporterCommand.EXTRA_PARAMS", this.f24171a);
        dVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    public final void d() {
        String sb;
        if (this.f24171a == null) {
            sb = "reportParams is empty";
        } else {
            StringBuilder sb2 = new StringBuilder("report message reportType:");
            sb2.append(this.b);
            sb2.append(",msgId:");
            String str = this.f24171a.get("messageID");
            if (StringUtils.isEmpty(str)) {
                str = this.f24171a.get(Constant.PROP_MESSAGE_ID);
            }
            sb2.append(str);
            sb = sb2.toString();
        }
        com.vivo.push.util.u.d("ReporterCommand", sb);
    }

    @Override // com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        this.f24171a = (HashMap) dVar.d("ReporterCommand.EXTRA_PARAMS");
        this.b = dVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "ReporterCommand（" + this.b + riy.BRACKET_END_STR;
    }
}
