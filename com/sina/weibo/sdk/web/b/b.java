package com.sina.weibo.sdk.web.b;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.web.WebData;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b {
    protected Context Z;
    protected WebData aC;
    protected String aD;

    /* loaded from: classes4.dex */
    public interface a {
        void onComplete();

        void onError(String str);
    }

    static {
        kge.a(1602311046);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
    }

    public b(AuthInfo authInfo, int i, String str, String str2) {
        this.aC = new WebData(authInfo, i, str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        this.aD = sb.toString();
    }

    protected abstract void a(Bundle bundle);

    public void a(a aVar) {
    }

    protected abstract void b(Bundle bundle);

    public abstract String getUrl();

    public final void readFromBundle(Bundle bundle) {
        this.aC = (WebData) bundle.getParcelable("web_data");
        this.aD = bundle.getString("_weibo_transaction");
        b(bundle);
    }

    public final void setContext(Context context) {
        this.Z = context;
    }

    public boolean t() {
        return false;
    }

    public final WebData u() {
        return this.aC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0 != 3) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle writeToBundle(android.os.Bundle r4) {
        /*
            r3 = this;
            com.sina.weibo.sdk.web.WebData r0 = r3.aC
            java.lang.String r1 = "web_data"
            r4.putParcelable(r1, r0)
            com.sina.weibo.sdk.web.WebData r0 = r3.aC
            int r0 = r0.getType()
            r1 = 1
            java.lang.String r2 = "web_type"
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto L1b
            goto L1e
        L1b:
            r4.putInt(r2, r1)
        L1e:
            java.lang.String r0 = r3.aD
            java.lang.String r1 = "_weibo_transaction"
            r4.putString(r1, r0)
            r3.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.web.b.b.writeToBundle(android.os.Bundle):android.os.Bundle");
    }
}
