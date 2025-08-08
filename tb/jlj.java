package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes6.dex */
public class jlj extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@timeContent";
    public static final int SUB_INDEX = 12;
    private static String b;
    public static final SimpleDateFormat sDateFormat;

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    static {
        kge.a(332860165);
        b = "TSTimeContentExpression";
        sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }

    private jlj(String str) {
        this.f29616a = str;
    }

    public static jlj b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlj) ipChange.ipc$dispatch("e2617f80", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith(PREFIX)) {
            return null;
        }
        return new jlj(str);
    }

    public TimeContent b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeContent) ipChange.ipc$dispatch("df8a0fd1", new Object[]{this, aVar});
        }
        List<TimeContent> h = aVar.h();
        TimeContent timeContent = null;
        if (h != null && !h.isEmpty()) {
            long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
            long j = -1;
            for (TimeContent timeContent2 : h) {
                if (!StringUtils.isEmpty(timeContent2.validTime)) {
                    try {
                        Date parse = sDateFormat.parse(timeContent2.validTime);
                        if (parse != null) {
                            long time = parse.getTime();
                            if (correctionTimeMillis > time) {
                                if (j == -1) {
                                    j = correctionTimeMillis - time;
                                    timeContent = timeContent2;
                                } else {
                                    long j2 = correctionTimeMillis - time;
                                    if (j > j2) {
                                        timeContent = timeContent2;
                                        j = j2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            jkq.a(b, "parsed timeContent params = " + timeContent);
            if (timeContent != null) {
                jkq.a(b, "parsed fully timeContent params: " + timeContent.stringify());
            }
        }
        return timeContent;
    }
}
