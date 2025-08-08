package com.etao.feimagesearch.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f7019a;
    private static final SimpleDateFormat b;

    static {
        kge.a(-1889650907);
        INSTANCE = new b();
        f7019a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        b = new SimpleDateFormat(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18962), Locale.getDefault());
    }

    private b() {
    }

    @JvmStatic
    public static final String a(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f5ee44f", new Object[]{str, l});
        }
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        if (StringUtils.isEmpty(str)) {
            str = "yyyy-MM-dd HH:mm";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(l.longValue() * 1000));
    }

    @JvmStatic
    public static final boolean a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed6d4ab", new Object[]{l})).booleanValue();
        }
        if (l != null) {
            l.longValue();
            if (l.longValue() <= 0) {
                return false;
            }
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            kotlin.jvm.internal.q.a((Object) calendar, "calendar");
            calendar.setTimeInMillis(l.longValue());
            int i4 = calendar.get(1);
            int i5 = calendar.get(2);
            int i6 = calendar.get(5);
            if (i == i4 && i2 == i5 && i3 == i6) {
                return true;
            }
        }
        return false;
    }

    public final String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        Date date = new Date();
        Date date2 = new Date(j);
        if (kotlin.jvm.internal.q.a((Object) new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(date), (Object) new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(date2))) {
            String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18935);
            kotlin.jvm.internal.q.a((Object) a2, "Localization.localizedSt….taobao_app_1007_1_18935)");
            return a2;
        }
        String format = new SimpleDateFormat(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18962), Locale.getDefault()).format(date2);
        kotlin.jvm.internal.q.a((Object) format, "SimpleDateFormat(Localiz…ult()).format(targetDate)");
        return format;
    }
}
