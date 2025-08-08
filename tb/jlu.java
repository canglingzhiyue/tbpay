package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public class jlu extends jls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@queryConcat(";
    public static final int SUB_INDEX = 13;

    static {
        kge.a(-452792497);
    }

    @Override // tb.jls
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 13;
    }

    @Override // tb.jls
    public Object a(a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar});
        }
        if (this.c != null && !this.c.isEmpty()) {
            try {
                TreeMap treeMap = new TreeMap();
                Object a2 = aVar.a(this.c.get(0));
                if ((a2 instanceof TimeContent) && jmh.a(jmg.TIME_CONTENT_FIX, true)) {
                    a2 = ((TimeContent) a2).content;
                }
                if (!(a2 instanceof String)) {
                    return null;
                }
                Uri parse = Uri.parse((String) a2);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null) {
                    queryParameterNames.isEmpty();
                }
                for (String str : queryParameterNames) {
                    String queryParameter = parse.getQueryParameter(str);
                    if (!StringUtils.isEmpty(queryParameter)) {
                        String encode = Uri.encode(queryParameter);
                        jkq.a("TS.Operator", "origin value = " + queryParameter + "; encode value = " + encode);
                        treeMap.put(str, encode);
                    }
                }
                Uri build = parse.buildUpon().clearQuery().build();
                jkq.a("TS.Operator", "parse queryConcat: originUrl = +" + a2.toString() + "baseUrl = " + build.toString());
                for (int i = 1; i < this.c.size(); i++) {
                    Object a3 = aVar.a(this.c.get(i));
                    if (a3 instanceof String) {
                        for (String str2 : ((String) a3).split("&")) {
                            String[] split = str2.split("=");
                            if (split.length == 2) {
                                treeMap.put(split[0], split[1]);
                            }
                        }
                    }
                    if (a3 instanceof Map) {
                        for (Map.Entry entry : ((Map) a3).entrySet()) {
                            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                                treeMap.put((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                    }
                }
                jkq.a("TS.Operator", "parse queryConcat: queryMap size = " + treeMap.size());
                if (treeMap.size() > 0) {
                    StringBuilder sb = new StringBuilder(build.toString());
                    sb.append("?");
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        if (z) {
                            sb.append((String) entry2.getKey());
                            sb.append("=");
                            sb.append((String) entry2.getValue());
                            z = false;
                        } else {
                            sb.append("&");
                            sb.append((String) entry2.getKey());
                            sb.append("=");
                            sb.append((String) entry2.getValue());
                        }
                    }
                    jkq.a("TS.Operator", "parse queryConcat: result = " + ((Object) sb));
                    return sb.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
                jkq.a("TS.Operator", "parse value error in queryConcat operator", e);
            }
        }
        return null;
    }
}
