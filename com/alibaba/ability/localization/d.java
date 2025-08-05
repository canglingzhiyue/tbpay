package com.alibaba.ability.localization;

import com.alibaba.ability.localization.constants.Location;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_DATE = 7;
    public static final int FLAG_DATE_TIME = 31;
    public static final int FLAG_DAY = 4;
    public static final int FLAG_HOUR = 8;
    public static final int FLAG_MINUTE = 16;
    public static final int FLAG_MONTH = 2;
    public static final int FLAG_SECOND = 32;
    public static final int FLAG_TIME = 24;
    public static final int FLAG_YEAR = 1;
    public static final d INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1975a;
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    private static final Map<String, int[]> e;

    static {
        kge.a(-569862283);
        INSTANCE = new d();
        f1975a = new int[]{1, 2, 4, 8};
        b = new int[]{2, 4, 1, 8};
        c = new int[]{4, 2, 1, 8};
        d = b;
        e = ai.a(j.a(Location.GLOBAL.getCode(), d), j.a(Location.CN.getCode(), f1975a), j.a(Location.HK.getCode(), c), j.a(Location.MO.getCode(), c), j.a(Location.TW.getCode(), f1975a), j.a(Location.SG.getCode(), c), j.a(Location.MY.getCode(), c), j.a(Location.AU.getCode(), c), j.a(Location.NZ.getCode(), c), j.a(Location.CA.getCode(), c), j.a(Location.JP.getCode(), f1975a), j.a(Location.KR.getCode(), f1975a), j.a(Location.TH.getCode(), c), j.a(Location.VN.getCode(), c), j.a(Location.PH.getCode(), b), j.a(Location.KH.getCode(), c));
    }

    private d() {
    }

    @JvmStatic
    public static final String a(long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca488059", new Object[]{new Long(j), new Integer(i)}) : a(j, i, b.e());
    }

    @JvmStatic
    public static final String a(long j, int i, Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8fc3d8b", new Object[]{new Long(j), new Integer(i), location});
        }
        q.d(location, "location");
        if (i <= 0) {
            return "";
        }
        String format = new SimpleDateFormat(INSTANCE.a(i, location), new Locale(b.a().getLanguage())).format(new Date(j));
        q.b(format, "dataFormat.format(date)");
        return format;
    }

    private final String a(int i, Location location) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("487042ff", new Object[]{this, new Integer(i), location});
        }
        if (b.b()) {
            iArr = f1975a;
        } else {
            iArr = e.get(location.getCode());
            if (iArr == null) {
                iArr = d;
            }
        }
        StringBuilder sb = new StringBuilder();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == (i3 & i)) {
                if (sb.length() > 0) {
                    sb.append(i3 == 8 ? b() : a());
                }
                sb.append(a(i3));
                if (i3 == 8 && 16 == (i & 16)) {
                    sb.append(a(16));
                    if (32 == (i & 32)) {
                        sb.append(a(32));
                    }
                }
            }
        }
        String sb2 = sb.toString();
        q.b(sb2, "sb.toString()");
        return sb2;
    }

    private final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : b.b() ? "" : " ";
    }

    private final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b.b() ? " " : ", ";
    }

    private final String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? "" : ":ss" : ":mm" : "HH" : b.b() ? "d日" : Repeat.D : b.b() ? "M月" : "MMM" : b.b() ? "yyyy年" : "yyyy";
    }
}
