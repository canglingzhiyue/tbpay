package tb;

import com.alibaba.fastjson2.JSONWriter;

/* loaded from: classes2.dex */
public abstract class aeq implements cqa {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<JSONWriter> f25293a;

    static {
        kge.a(1434195340);
        kge.a(686256365);
        f25293a = new ThreadLocal<>();
    }

    public void a(JSONWriter jSONWriter, Object obj) {
        f25293a.set(jSONWriter);
        f25293a.set(f25293a.get());
    }
}
