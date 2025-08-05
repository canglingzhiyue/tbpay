package com.vivo.push.f;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class l extends aa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.b.t tVar = (com.vivo.push.b.t) vVar;
        ArrayList<String> d = tVar.d();
        List<String> e = tVar.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = tVar.i();
        com.vivo.push.util.u.c("OnDelTagsTask", "doTask,删除成功的标签 = " + d + " 删除失败的= " + e + " 错误码= " + i);
        String h = tVar.h();
        if (d != null) {
            for (String str : d) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (e != null) {
            for (String str2 : e) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            com.vivo.push.util.u.c("OnDelTagsTask", "doTask1,删除成功的别名 = " + arrayList + " 删除失败的别名= " + arrayList3 + " 错误码= " + i);
            if (arrayList.size() > 0) {
                com.vivo.push.m.a();
                com.vivo.push.m.b(arrayList);
            }
            com.vivo.push.m.a().a(tVar.h(), i);
            com.vivo.push.t.b(new m(this, i, arrayList, arrayList3, h));
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            com.vivo.push.util.u.c("OnDelTagsTask", "doTask1,删除成功的标签 = " + arrayList + " 删除失败的标签= " + arrayList3 + " 错误码= " + i);
            if (arrayList2.size() > 0) {
                com.vivo.push.m.a().c(arrayList2);
            }
            com.vivo.push.m.a().a(tVar.h(), i);
            com.vivo.push.t.b(new n(this, i, arrayList2, arrayList4, h));
        }
    }
}
