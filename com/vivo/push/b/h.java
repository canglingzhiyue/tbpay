package com.vivo.push.b;

import mtopsdk.common.util.StringUtils;

/* loaded from: classes9.dex */
public final class h extends com.vivo.push.v {

    /* renamed from: a  reason: collision with root package name */
    private String f24157a;
    private String b;

    public h() {
        super(2013);
    }

    public h(String str) {
        this();
        this.f24157a = str;
    }

    public h(String str, String str2) {
        this(str);
        this.b = str2;
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a("MsgArriveCommand.MSG_TAG", this.f24157a);
        if (!StringUtils.isEmpty(this.b)) {
            dVar.a("MsgArriveCommand.NODE_INFO", this.b);
        }
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.f24157a = dVar.a("MsgArriveCommand.MSG_TAG");
        this.b = dVar.a("MsgArriveCommand.NODE_INFO");
    }
}
