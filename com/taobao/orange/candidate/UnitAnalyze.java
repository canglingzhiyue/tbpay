package com.taobao.orange.candidate;

import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.aidl.OrangeCandidateCompareStub;
import com.taobao.orange.aidl.ParcelableCandidateCompare;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes.dex */
public class UnitAnalyze {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Pattern BASE_FORMAT;
    private static final Map<String, UnitAnalyze> CACHE_UNIT_ANALYZE_MAP;
    private static final String CANDIDATE_HASH_BUCKET = "did_hash";
    private static final Map<String, OPERATOR> OPERATOR_SYMBOL_MAP;
    private static final String TAG = "UnitAnalyze";
    public String key;
    private OPERATOR opr;
    private String val;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum OPERATOR {
        EQUALS("="),
        GREATER_EQUALS(">="),
        LESS_EQUALS("<="),
        GREATER(">"),
        LESS("<"),
        NOT_EQUALS("!="),
        FUZZY("~="),
        NOT_FUZZY("!~");
        
        private String symbol;

        OPERATOR(String str) {
            this.symbol = str;
        }

        public String getSymbol() {
            return this.symbol;
        }
    }

    static {
        OPERATOR[] values;
        kge.a(342251278);
        OPERATOR_SYMBOL_MAP = new HashMap();
        CACHE_UNIT_ANALYZE_MAP = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        for (OPERATOR operator : OPERATOR.values()) {
            OPERATOR_SYMBOL_MAP.put(operator.getSymbol(), operator);
            arrayList.add(operator.getSymbol());
        }
        BASE_FORMAT = Pattern.compile(String.format("^\\s*(\\w+)\\s*(%s)\\s*(.+)\\s*$", f.a(arrayList)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.orange.candidate.UnitAnalyze complie(java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.orange.candidate.UnitAnalyze.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r8
            java.lang.String r8 = "710d01cd"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            com.taobao.orange.candidate.UnitAnalyze r8 = (com.taobao.orange.candidate.UnitAnalyze) r8
            return r8
        L15:
            long r0 = java.lang.System.nanoTime()
            boolean r4 = com.taobao.orange.a.F
            if (r4 == 0) goto L35
            java.util.Map<java.lang.String, com.taobao.orange.candidate.UnitAnalyze> r4 = com.taobao.orange.candidate.UnitAnalyze.CACHE_UNIT_ANALYZE_MAP
            java.lang.Object r4 = r4.get(r8)
            com.taobao.orange.candidate.UnitAnalyze r4 = (com.taobao.orange.candidate.UnitAnalyze) r4
            if (r4 != 0) goto L32
            com.taobao.orange.candidate.UnitAnalyze r4 = new com.taobao.orange.candidate.UnitAnalyze
            r4.<init>(r8)
            java.util.Map<java.lang.String, com.taobao.orange.candidate.UnitAnalyze> r5 = com.taobao.orange.candidate.UnitAnalyze.CACHE_UNIT_ANALYZE_MAP
            r5.put(r8, r4)
            goto L3a
        L32:
            r5 = r4
            r4 = 1
            goto L3c
        L35:
            com.taobao.orange.candidate.UnitAnalyze r4 = new com.taobao.orange.candidate.UnitAnalyze
            r4.<init>(r8)
        L3a:
            r5 = r4
            r4 = 0
        L3c:
            boolean r6 = com.taobao.orange.util.OLog.isPrintLog(r3)
            if (r6 == 0) goto L77
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "candidate"
            r6[r2] = r7
            r6[r3] = r8
            r8 = 2
            java.lang.String r2 = "type"
            r6[r8] = r2
            r8 = 3
            if (r4 == 0) goto L57
            java.lang.String r2 = "cache-hit"
            goto L5a
        L57:
            java.lang.String r2 = "new-instance"
        L5a:
            r6[r8] = r2
            r8 = 4
            java.lang.String r2 = "cost"
            r6[r8] = r2
            r8 = 5
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6[r8] = r0
            java.lang.String r8 = "UnitAnalyze"
            java.lang.String r0 = "[compile]"
            com.taobao.orange.util.OLog.d(r8, r0, r6)
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.candidate.UnitAnalyze.complie(java.lang.String):com.taobao.orange.candidate.UnitAnalyze");
    }

    private UnitAnalyze(String str) {
        Matcher matcher = BASE_FORMAT.matcher(str);
        if (matcher.find()) {
            this.key = matcher.group(1);
            this.opr = OPERATOR_SYMBOL_MAP.get(matcher.group(2));
            this.val = matcher.group(3);
            if (this.key.equals("did_hash") && this.opr != OPERATOR.EQUALS) {
                throw new IllegalArgumentException(String.format("invalid hash candidate:%s", str));
            }
            return;
        }
        throw new IllegalArgumentException(String.format("fail parse candidate:%s", str));
    }

    public boolean match(String str, ParcelableCandidateCompare parcelableCandidateCompare) throws RemoteException {
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5637f999", new Object[]{this, str, parcelableCandidateCompare})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            if (OLog.isPrintLog(1)) {
                OLog.d(TAG, "match no clientVal", "key", this.key);
            }
            return false;
        } else if (parcelableCandidateCompare == null) {
            if (OLog.isPrintLog(1)) {
                OLog.d(TAG, "match no compare", "key", this.key);
            }
            return false;
        } else {
            if (OLog.isPrintLog(0)) {
                String str2 = null;
                if (parcelableCandidateCompare instanceof OrangeCandidateCompareStub) {
                    str2 = ((OrangeCandidateCompareStub) parcelableCandidateCompare).getName();
                }
                OLog.v(TAG, "match start", "key", this.key, "clientVal", str, "opr", this.opr.getSymbol(), "serverVal", this.val, "compare", str2);
            }
            switch (this.opr) {
                case EQUALS:
                    equals = parcelableCandidateCompare.equals(str, this.val);
                    break;
                case NOT_EQUALS:
                    equals = parcelableCandidateCompare.equalsNot(str, this.val);
                    break;
                case GREATER:
                    equals = parcelableCandidateCompare.greater(str, this.val);
                    break;
                case GREATER_EQUALS:
                    equals = parcelableCandidateCompare.greaterEquals(str, this.val);
                    break;
                case LESS:
                    equals = parcelableCandidateCompare.less(str, this.val);
                    break;
                case LESS_EQUALS:
                    equals = parcelableCandidateCompare.lessEquals(str, this.val);
                    break;
                case FUZZY:
                    equals = parcelableCandidateCompare.fuzzy(str, this.val);
                    break;
                case NOT_FUZZY:
                    equals = parcelableCandidateCompare.fuzzyNot(str, this.val);
                    break;
                default:
                    equals = false;
                    break;
            }
            if (!equals && OLog.isPrintLog(1)) {
                OLog.d(TAG, "match fail", "key", this.key);
            }
            return equals;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.key + this.opr.getSymbol() + this.val;
    }
}
