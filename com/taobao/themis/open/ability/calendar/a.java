package com.taobao.themis.open.ability.calendar;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/open/ability/calendar/DateUtils;", "", "()V", "CUSTOM_DATE_FORMATS", "", "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;", "NUM_PATTERN", "", "TIMEZONE", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "isNumeric", "", "str", "parseDate", "Ljava/util/Date;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final DateFormat[] f22641a;
    private static final TimeZone b;

    static {
        kge.a(220645894);
        INSTANCE = new a();
        b = TimeZone.getTimeZone(com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC);
        String[] strArr = {"yyyy-MM-dd HH:mm:ss", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyyMMddHHmmss"};
        int length = strArr.length;
        DateFormat[] dateFormatArr = new DateFormat[length];
        for (int i = 0; i < length; i++) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[i], Locale.ENGLISH);
            simpleDateFormat.setTimeZone(b);
            dateFormatArr[i] = simpleDateFormat;
        }
        f22641a = dateFormatArr;
    }

    private a() {
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
        if (kotlin.text.n.a((java.lang.CharSequence) r0, "-", 0, false, 6, (java.lang.Object) null) == 0) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.calendar.a.b(java.lang.String):java.util.Date");
    }
}
