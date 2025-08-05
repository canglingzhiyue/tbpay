package tb;

import android.os.Vibrator;
import com.alibaba.ability.b;
import com.alibaba.ability.e;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class dlu implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CANCEL = "cancel";
    public static final String API_IMPACT_HEAVY = "impactHeavy";
    public static final String API_IMPACT_LIGHT = "impactLight";
    public static final String API_IMPACT_MEDIUM = "impactMedium";
    public static final String API_IMPACT_RIGID = "impactRigid";
    public static final String API_IMPACT_SOFT = "impactSoft";
    public static final String API_NOTIFICATION_ERROR = "notificationError";
    public static final String API_NOTIFICATION_SUCCESS = "notificationSuccess";
    public static final String API_NOTIFICATION_WARNING = "notificationWarning";
    public static final String API_SELECTION_CHANGE = "selectionChange";
    public static final String API_VIBRATE = "vibrate";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private Vibrator f26839a;

    static {
        kge.a(-1725927445);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(102871411);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f5, code lost:
        if (r7.equals(tb.dlu.API_IMPACT_SOFT) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
        r7 = android.os.VibrationEffect.createOneShot(20, 1);
        r8 = r6.f26839a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0201, code lost:
        if (r8 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0203, code lost:
        r8.vibrate(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0207, code lost:
        r7 = r6.f26839a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0209, code lost:
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x020b, code lost:
        r7.vibrate(20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
        if (r7.equals(tb.dlu.API_IMPACT_RIGID) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
        if (r7.equals(tb.dlu.API_IMPACT_LIGHT) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a9, code lost:
        if (r7.equals(tb.dlu.API_IMPACT_HEAVY) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ad, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01af, code lost:
        r7 = android.os.VibrationEffect.createOneShot(20, 255);
        r8 = r6.f26839a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b7, code lost:
        if (r8 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
        r8.vibrate(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bd, code lost:
        r7 = r6.f26839a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bf, code lost:
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c1, code lost:
        r7.vibrate(20);
     */
    @Override // com.alibaba.ability.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r7, tb.als r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, tb.aln r10) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dlu.execute(java.lang.String, tb.als, java.util.Map, tb.aln):com.alibaba.ability.result.ExecuteResult");
    }

    private final FinishResult a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FinishResult) ipChange.ipc$dispatch("c71644dd", new Object[]{this}) : new FinishResult(new JSONObject(ai.b(j.a("result", true))), null, 2, null);
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Vibrator vibrator = this.f26839a;
        if (vibrator == null) {
            return;
        }
        vibrator.cancel();
    }

    private final void a(List<? extends Object> list, List<Long> list2, List<Integer> list3) {
        IpChange ipChange = $ipChange;
        int i = 1;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f509d3b", new Object[]{this, list, list2, list3});
            return;
        }
        List<? extends Object> list4 = list;
        ArrayList<Map> arrayList = new ArrayList(p.a((Iterable) list4, 10));
        for (Object obj : list4) {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            arrayList.add((Map) obj);
        }
        long j = 0;
        for (Map map : arrayList) {
            String a2 = e.a(map, "type", "transient");
            Float a3 = e.a(map, "relativeTime", Float.valueOf(0.0f));
            float floatValue = a3 != null ? a3.floatValue() : 0.0f;
            Float a4 = e.a(map, "intensity", Float.valueOf(0.0f));
            float floatValue2 = a4 != null ? a4.floatValue() : 0.0f;
            Float a5 = e.a(map, "duration", Float.valueOf(0.0f));
            float floatValue3 = a5 != null ? a5.floatValue() : 0.0f;
            float f = i2;
            if (floatValue < f) {
                floatValue = 0.0f;
            }
            if (floatValue3 < f) {
                floatValue3 = 0.0f;
            }
            if (floatValue2 < f) {
                floatValue2 = 0.0f;
            } else if (floatValue2 > i) {
                floatValue2 = 1.0f;
            }
            float f2 = 1000;
            long j2 = floatValue * f2;
            long j3 = floatValue3 * f2;
            if (q.a((Object) "transient", (Object) a2)) {
                j3 = 15;
            }
            long j4 = j2 - j;
            if (j4 >= 0) {
                list2.add(Long.valueOf(j4));
            } else {
                long j5 = (j2 + j3) - j;
                j3 = j5 <= 0 ? 0L : j5;
                list2.add(1L);
                j2 = j;
            }
            list3.add(0);
            list2.add(Long.valueOf(j3));
            list3.add(Integer.valueOf((int) (Math.sqrt(floatValue2) * 255)));
            j = j2 + j3;
            i = 1;
            i2 = 0;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        b();
        this.f26839a = null;
    }
}
