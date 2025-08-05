package com.taobao.android.detail.sdk.structure;

import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class g {
    public static final int EMPTY_DATA_ERROR = 1;
    public static final int JSON_DATA_PARSE_ERROR = 2;
    public static final int SUCCESS = 0;
    public static final int TEMPLATE_DATA_NOT_FOUND_ERROR = 3;

    /* renamed from: a  reason: collision with root package name */
    public int f10335a;
    public String b;
    public boolean c;
    public MtopResponse d;
    public e e;
    public b f;

    static {
        kge.a(840521951);
    }

    public g(int i, String str) {
        this.f10335a = i;
        this.b = str;
        tpc.a("com.taobao.android.detail.sdk.structure.MainStructureResponse");
    }

    public g(e eVar) {
        this.e = eVar;
        tpc.a("com.taobao.android.detail.sdk.structure.MainStructureResponse");
    }

    public g(e eVar, b bVar) {
        this(eVar);
        this.f = bVar;
    }
}
