package com.unionpay;

import java.util.Comparator;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class g implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    String f24022a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str) {
        this.f24022a = "";
        this.f24022a = str;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = (((JSONObject) obj).optLong(this.f24022a) > ((JSONObject) obj2).optLong(this.f24022a) ? 1 : (((JSONObject) obj).optLong(this.f24022a) == ((JSONObject) obj2).optLong(this.f24022a) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }
}
