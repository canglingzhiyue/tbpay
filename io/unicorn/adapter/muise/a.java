package io.unicorn.adapter.muise;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.u;
import io.unicorn.adapter.UnicornAdapterJNI;
import io.unicorn.embedding.engine.b;
import io.unicorn.embedding.engine.c;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class a implements u.b {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f24798a;
    private c b;
    private final Context c;
    private String d;
    private String[] e;
    private String[] f;

    static {
        kge.a(1683661344);
        kge.a(-2017282870);
        f24798a = new AtomicInteger(0);
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, String[] strArr) {
        this(context, strArr, null);
    }

    public a(Context context, String[] strArr, String[] strArr2) {
        this.c = context;
        a(strArr, strArr2);
        this.d = "dom_uni_engine_main" + f24798a.incrementAndGet();
        b(this.d, null);
    }

    private io.unicorn.embedding.engine.a a(String str, String[] strArr) {
        io.unicorn.embedding.engine.a a2 = b.a().a(str);
        return a2 == null ? b(str, strArr) : a2;
    }

    private void a(String[] strArr, String[] strArr2) {
        if (this.b != null) {
            return;
        }
        if (UnicornAdapterJNI.instance().libraryLoaded()) {
            this.b = new c(this.c, strArr, strArr2);
            return;
        }
        if (strArr != null) {
            this.e = strArr;
        }
        if (strArr2 == null) {
            return;
        }
        this.f = strArr2;
    }

    private io.unicorn.embedding.engine.a b(String str, String[] strArr) {
        if (!UnicornAdapterJNI.instance().libraryLoaded() || this.c == null) {
            return null;
        }
        a(this.e, this.f);
        c cVar = this.b;
        if (cVar == null) {
            return null;
        }
        io.unicorn.embedding.engine.a a2 = cVar.a(this.c, strArr);
        b.a().a(str, a2);
        return a2;
    }

    private String c(String str) {
        return "dom_uni_engine_" + str;
    }

    @Override // com.taobao.android.weex_framework.u.b
    public String a(MUSDKInstance mUSDKInstance, String[] strArr) {
        String c = c(String.valueOf(mUSDKInstance.getInstanceId()));
        if (a(c, strArr) != null) {
            return c;
        }
        return null;
    }

    @Override // com.taobao.android.weex_framework.u.b
    public void a() {
        io.unicorn.embedding.engine.a a2;
        if (StringUtils.isEmpty(this.d) || (a2 = a(this.d, (String[]) null)) == null) {
            return;
        }
        a2.a();
    }
}
