package com.taobao.android.litecreator.sdk.editor;

import android.view.View;
import com.taobao.android.litecreator.sdk.editor.data.Media;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public interface z<T extends Media> extends v {

    /* renamed from: com.taobao.android.litecreator.sdk.editor.z$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static void $default$a(z zVar, Media media) {
        }

        public static List $default$v(z zVar) {
            return new ArrayList();
        }
    }

    void a(View view);

    void a(T t);

    <S> void a(com.taobao.android.litecreator.sdk.editor.data.base.d<S> dVar);

    <S> void b(com.taobao.android.litecreator.sdk.editor.data.base.d<S> dVar);

    AbsEditInfo r();

    T s();

    void u();

    List<T> v();
}
