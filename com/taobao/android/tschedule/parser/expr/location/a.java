package com.taobao.android.tschedule.parser.expr.location;

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
        kge.a(-124632891);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(com.taobao.android.tschedule.parser.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (r18.equals("@location.provinceCode") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.parser.expr.location.a.a(java.lang.String):int");
    }

    private a(String str) {
        this.c = str;
        this.b = a(str);
    }

    public static a b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("35bd4c7", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@location.")) {
            return null;
        }
        return new a(str);
    }

    public String b(com.taobao.android.tschedule.parser.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        LocationInfo f = aVar.f();
        int i = this.b;
        if (i <= 0 || f == null) {
            return null;
        }
        switch (i) {
            case 1:
                return f.getProvinceCode();
            case 2:
                return f.getProvinceName();
            case 3:
                return f.getCityCode();
            case 4:
                return f.getCityName();
            case 5:
                return f.getAreaCode();
            case 6:
                return f.getAreaName();
            case 7:
                return f.getLongitude();
            case 8:
                return f.getLatitude();
            case 9:
                return f.getAltitude();
            case 10:
                return f.getAddress();
            case 11:
                return f.getTimeStamp();
            case 12:
                return f.getAccuracy();
            case 13:
                return f.getCountryCode();
            case 14:
                return f.getCountryName();
            case 15:
                return f.getGeohash();
            default:
                return null;
        }
    }
}
