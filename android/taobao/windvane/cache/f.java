package android.taobao.windvane.cache;

import android.taobao.windvane.util.MimeTypeEnum;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<String>> f1554a;
    public byte[] b;
    public String c;
    public long d;
    public long e;
    public long f;
    public String g;

    static {
        kge.a(-1027272481);
    }

    public f(String str, Map<String, List<String>> map, byte[] bArr, long j, long j2) {
        List<String> list;
        this.f1554a = null;
        this.b = null;
        this.f = 0L;
        this.g = MimeTypeEnum.HTML.getMimeType();
        this.c = str;
        this.d = j;
        this.b = bArr;
        this.f1554a = map;
        if (map != null && map.containsKey("Content-Type") && (list = map.get("Content-Type")) != null && list.size() > 0) {
            String str2 = list.get(0);
            if (!TextUtils.isEmpty(str2)) {
                this.g = str2.split(";")[0];
            }
        }
        this.f = System.currentTimeMillis();
        this.e = j2;
    }
}
