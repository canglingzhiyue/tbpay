package com.loc;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes4.dex */
public final class cl extends co {
    private Context b;
    private boolean d;
    private int e;
    private int f;

    /* renamed from: a  reason: collision with root package name */
    private String f7723a = "iKey";
    private int g = 0;

    public cl(Context context, boolean z, int i, int i2, String str) {
        a(context, z, i, i2, str, 0);
    }

    public cl(Context context, boolean z, int i, int i2, String str, int i3) {
        a(context, z, i, i2, str, i3);
    }

    private void a(Context context, boolean z, int i, int i2, String str, int i3) {
        this.b = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.f7723a = str;
        this.g = i3;
    }

    @Override // com.loc.co
    public final void a(int i) {
        if (o.j(this.b) == 1) {
            return;
        }
        String a2 = x.a(System.currentTimeMillis(), "yyyyMMdd");
        String a3 = at.a(this.b, this.f7723a);
        if (!StringUtils.isEmpty(a3)) {
            String[] split = a3.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            if (split == null || split.length < 2) {
                at.b(this.b, this.f7723a);
            } else if (a2.equals(split[0])) {
                i += Integer.parseInt(split[1]);
            }
        }
        Context context = this.b;
        String str = this.f7723a;
        at.a(context, str, a2 + "|" + i);
    }

    @Override // com.loc.co
    protected final boolean a() {
        if (o.j(this.b) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String a2 = at.a(this.b, this.f7723a);
        if (StringUtils.isEmpty(a2)) {
            return true;
        }
        String[] split = a2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        if (split != null && split.length >= 2) {
            return !x.a(System.currentTimeMillis(), "yyyyMMdd").equals(split[0]) || Integer.parseInt(split[1]) < this.f;
        }
        at.b(this.b, this.f7723a);
        return true;
    }

    @Override // com.loc.co
    public final int b() {
        int i;
        if ((o.j(this.b) == 1 || (i = this.e) <= 0) && ((i = this.g) <= 0 || i >= Integer.MAX_VALUE)) {
            i = Integer.MAX_VALUE;
        }
        return this.c != null ? Math.max(i, this.c.b()) : i;
    }
}
