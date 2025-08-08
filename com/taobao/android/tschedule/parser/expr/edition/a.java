package com.taobao.android.tschedule.parser.expr.edition;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jku;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public String c;

    static {
        kge.a(1139628485);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(com.taobao.android.tschedule.parser.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r15.equals("@edition.countryCode") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.parser.expr.edition.a.a(java.lang.String):int");
    }

    private a(String str) {
        this.c = str;
        this.b = a(str);
    }

    public static a b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("13c9e358", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@edition.")) {
            return null;
        }
        return new a(str);
    }

    public String b(com.taobao.android.tschedule.parser.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        EditionInfo g = aVar.g();
        int i = this.b;
        if (i <= 0 || g == null) {
            return null;
        }
        switch (i) {
            case 1:
                return g.getCountryCode();
            case 2:
                return g.getCountryName();
            case 3:
                return g.getCountryNumCode();
            case 4:
                return g.getLanguageCode();
            case 5:
                return g.getActualLanguageCode();
            case 6:
                return g.getCurrencyCode();
            case 7:
                return g.getHngCookie();
            case 8:
                return g.getCityName();
            case 9:
                return g.getCityId();
            case 10:
                return g.getArea();
            case 11:
                return g.getEditionCode();
            case 12:
                return g.getIsVillageUser();
            default:
                return null;
        }
    }
}
