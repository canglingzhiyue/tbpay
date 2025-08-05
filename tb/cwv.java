package tb;

import android.content.Context;
import com.huawei.agconnect.core.b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cwv {

    /* renamed from: a  reason: collision with root package name */
    private String f26574a;
    private InputStream c;
    private cwr b = cwr.UNKNOWN;
    private final Map<String, String> d = new HashMap();
    private final List<b> e = new ArrayList();

    public cwu a(Context context) {
        return new cxc(context, this.f26574a, this.b, this.c, this.d, this.e, null);
    }

    public cwv a(InputStream inputStream) {
        this.c = inputStream;
        return this;
    }
}
