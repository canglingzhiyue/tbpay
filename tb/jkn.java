package tb;

import mtopsdk.common.util.StringUtils;

/* loaded from: classes6.dex */
public class jkn {

    /* renamed from: a  reason: collision with root package name */
    public String f29607a;
    public String b;
    public String c;

    static {
        kge.a(391054204);
    }

    public jkn(String str, String str2, String str3) {
        if (str != null) {
            if (str2 == null) {
                throw new IllegalArgumentException("defaultTemplateId is null.");
            }
            if (StringUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("defaultTemplateAssetsName is null or empty.");
            }
            this.f29607a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        throw new IllegalArgumentException("templateId is null.");
    }
}
