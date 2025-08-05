package com.airbnb.lottie;

import android.support.v4.util.ArraySet;
import android.support.v4.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.akj;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1795a = false;
    private final Set<Object> b = new ArraySet();
    private final Map<String, akj> c = new HashMap();
    private final Comparator<Pair<String, Float>> d = new Comparator<Pair<String, Float>>() { // from class: com.airbnb.lottie.q.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    public void a(String str, float f) {
        if (!this.f1795a) {
            return;
        }
        akj akjVar = this.c.get(str);
        if (akjVar == null) {
            akjVar = new akj();
            this.c.put(str, akjVar);
        }
        akjVar.a(f);
        if (!str.equals("__container")) {
            return;
        }
        Iterator<Object> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f1795a = z;
    }
}
