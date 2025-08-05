package com.loc;

import com.taobao.avplayer.TBPlayerConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class db {
    private ef b;

    /* renamed from: a  reason: collision with root package name */
    private List<eg> f7745a = new ArrayList();
    private ArrayList<eg> c = new ArrayList<>();

    private static List<eg> a(List<eg> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            eg egVar = list.get(i);
            hashMap.put(Integer.valueOf(egVar.c), egVar);
        }
        arrayList.addAll(hashMap.values());
        return arrayList;
    }

    private boolean a(ef efVar) {
        float f = 10.0f;
        if (efVar.g > 10.0f) {
            f = 200.0f;
        } else if (efVar.g > 2.0f) {
            f = 50.0f;
        }
        return efVar.a(this.b) > ((double) f);
    }

    private static boolean a(ef efVar, long j, long j2) {
        return j > 0 && j2 - j < ((long) ((efVar.g > 10.0f ? 1 : (efVar.g == 10.0f ? 0 : -1)) >= 0 ? 2000 : TBPlayerConst.TBPlayerPropertyStringReadOnlyBorder));
    }

    private static boolean a(List<eg> list, List<eg> list2) {
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            int i = size + size2;
            if (size <= size2) {
                list2 = list;
                list = list2;
            }
            HashMap hashMap = new HashMap(list.size());
            for (eg egVar : list) {
                hashMap.put(Long.valueOf(egVar.f7758a), 1);
            }
            int i2 = 0;
            for (eg egVar2 : list2) {
                if (((Integer) hashMap.get(Long.valueOf(egVar2.f7758a))) != null) {
                    i2++;
                }
            }
            if (i2 * 2.0d >= i * 0.5d) {
                return true;
            }
        }
        return false;
    }

    private List<eg> b(List<eg> list) {
        Collections.sort(list, new Comparator<eg>() { // from class: com.loc.db.1
            private static int a(eg egVar, eg egVar2) {
                return egVar2.c - egVar.c;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(eg egVar, eg egVar2) {
                return a(egVar, egVar2);
            }
        });
        return list;
    }

    private void b(List<eg> list, List<eg> list2) {
        list.clear();
        if (list2 != null) {
            List<eg> b = b(a(list2));
            int size = b.size();
            if (size > 40) {
                size = 40;
            }
            for (int i = 0; i < size; i++) {
                list.add(b.get(i));
            }
        }
    }

    private boolean b(ef efVar, List<eg> list, boolean z, long j, long j2) {
        if (z && a(efVar, j, j2) && list != null && list.size() > 0) {
            if (this.b == null) {
                return true;
            }
            boolean a2 = a(efVar);
            return !a2 ? !a(list, this.f7745a) : a2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<eg> a(ef efVar, List<eg> list, boolean z, long j, long j2) {
        if (b(efVar, list, z, j, j2)) {
            b(this.c, list);
            this.f7745a.clear();
            this.f7745a.addAll(list);
            this.b = efVar;
            return this.c;
        }
        return null;
    }
}
