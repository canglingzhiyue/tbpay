package tb;

import tb.dqv;

/* loaded from: classes2.dex */
public interface dqv extends cqa {

    /* renamed from: tb.dqv$-CC */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object a(dqv dqvVar, dqv dqvVar2, Object obj, String str, Object obj2) {
            return dqvVar.apply(obj, str, dqvVar2.apply(obj, str, obj2));
        }

        public static dqv a(final dqv dqvVar, final dqv dqvVar2) {
            return new dqv() { // from class: tb.-$$Lambda$dqv$ihMXkzluJktYzhLSByDQTlW7NhA
                @Override // tb.dqv
                public final Object apply(Object obj, String str, Object obj2) {
                    return dqv.CC.lambda$ihMXkzluJktYzhLSByDQTlW7NhA(dqv.this, dqvVar, obj, str, obj2);
                }
            };
        }

        public static /* synthetic */ Object lambda$ihMXkzluJktYzhLSByDQTlW7NhA(dqv dqvVar, dqv dqvVar2, Object obj, String str, Object obj2) {
            return a(dqvVar, dqvVar2, obj, str, obj2);
        }
    }

    Object apply(Object obj, String str, Object obj2);
}
