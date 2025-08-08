package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class jls {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Object> c;

    static {
        kge.a(-1747610763);
    }

    public abstract int a();

    public abstract Object a(a aVar);

    public static jls a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jls) ipChange.ipc$dispatch("7c7120c3", new Object[]{str});
        }
        jls jlsVar = null;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(jlr.PREFIX)) {
            jlsVar = new jlr();
        } else if (str.startsWith(jlq.f29617a)) {
            jlsVar = new jlq();
        } else if (str.startsWith(jlp.PREFIX)) {
            jlsVar = new jlp();
        } else if (str.startsWith(jlt.f29618a)) {
            jlsVar = new jlt();
        } else if (str.startsWith(jlu.PREFIX)) {
            jlsVar = new jlu();
        }
        if (jlsVar != null && jlsVar.a() >= 0) {
            jlsVar.c = a(str, jlsVar.a());
        }
        return jlsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [tb.jku] */
    private static List<Object> a(String str, int i) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82a24116", new Object[]{str, new Integer(i)});
        }
        try {
            String substring = str.substring(i, str.length() - 1);
            if (!StringUtils.isEmpty(substring) && (split = substring.split(",")) != null && split.length != 0) {
                ArrayList arrayList = new ArrayList(split.length);
                for (String str2 : split) {
                    ?? a2 = jku.a(str2, new Object[0]);
                    if (a2 != 0) {
                        str2 = a2;
                    }
                    arrayList.add(str2);
                }
                return arrayList;
            }
            return null;
        } catch (Throwable th) {
            jkq.a("TS.Operator", "parSubExpresstions error", th);
            return null;
        }
    }
}
