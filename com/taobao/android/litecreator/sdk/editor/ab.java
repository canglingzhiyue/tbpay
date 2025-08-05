package com.taobao.android.litecreator.sdk.editor;

import com.taobao.android.litecreator.sdk.editor.data.Paster;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public interface ab extends v {

    /* renamed from: com.taobao.android.litecreator.sdk.editor.ab$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static List $default$d(ab abVar) {
            return new ArrayList();
        }
    }

    void a(Paster paster);

    void a(Paster paster, int i);

    void a(List<Paster> list);

    void b(Paster paster);

    @Deprecated
    List<Paster> c();

    List<Paster> d();
}
