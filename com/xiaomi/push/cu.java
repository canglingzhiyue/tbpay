package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
class cu extends co {

    /* renamed from: a  reason: collision with root package name */
    co f24408a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ cs f192a;
    final /* synthetic */ co b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(cs csVar, String str, co coVar) {
        super(str);
        this.f192a = csVar;
        this.b = coVar;
        this.f24408a = this.b;
        this.f178b = this.f178b;
        co coVar2 = this.b;
        if (coVar2 != null) {
            this.f = coVar2.f;
        }
    }

    @Override // com.xiaomi.push.co
    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        if (this.f24408a != null) {
            arrayList.addAll(this.f24408a.a(true));
        }
        synchronized (cs.b) {
            co coVar = cs.b.get(this.f178b);
            if (coVar != null) {
                Iterator<String> it = coVar.a(true).iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (arrayList.indexOf(next) == -1) {
                        arrayList.add(next);
                    }
                }
                arrayList.remove(this.f178b);
                arrayList.add(this.f178b);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.co
    public synchronized void a(String str, cn cnVar) {
        if (this.f24408a != null) {
            this.f24408a.a(str, cnVar);
        }
    }

    @Override // com.xiaomi.push.co
    public boolean b() {
        return false;
    }
}
