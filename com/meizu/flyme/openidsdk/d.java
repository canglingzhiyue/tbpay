package com.meizu.flyme.openidsdk;

import mtopsdk.common.util.StringUtils;
import tb.kge;

/* loaded from: classes4.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    String f8021a;
    Boolean b;

    static {
        kge.a(-236761714);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return StringUtils.equals(this.f8021a, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.f8021a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
