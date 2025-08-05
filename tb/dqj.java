package tb;

import tb.dqj;

/* loaded from: classes2.dex */
public interface dqj extends cqa {

    /* renamed from: tb.dqj$-CC */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ String a(dqj dqjVar, dqj dqjVar2, Object obj, String str, Object obj2) {
            return dqjVar.process(obj, dqjVar2.process(obj, str, obj2), obj2);
        }

        public static dqj a(final dqj dqjVar, final dqj dqjVar2) {
            return new dqj() { // from class: tb.-$$Lambda$dqj$j65pzpzlHC5df6NJz8GwoCfn_S4
                @Override // tb.dqj
                public final String process(Object obj, String str, Object obj2) {
                    return dqj.CC.lambda$j65pzpzlHC5df6NJz8GwoCfn_S4(dqj.this, dqjVar, obj, str, obj2);
                }
            };
        }

        public static /* synthetic */ String lambda$j65pzpzlHC5df6NJz8GwoCfn_S4(dqj dqjVar, dqj dqjVar2, Object obj, String str, Object obj2) {
            return a(dqjVar, dqjVar2, obj, str, obj2);
        }
    }

    String process(Object obj, String str, Object obj2);
}
