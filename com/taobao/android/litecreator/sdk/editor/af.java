package com.taobao.android.litecreator.sdk.editor;

import android.util.Size;
import com.taobao.android.litecreator.sdk.editor.data.Media;
import com.taobao.android.litecreator.sdk.editor.data.MediaClips;
import com.taobao.android.litecreator.sdk.editor.data.Video;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import java.util.List;

/* loaded from: classes5.dex */
public interface af extends aa, ab, ad, ah, r, s, u, w, y, z<Video> {

    /* renamed from: com.taobao.android.litecreator.sdk.editor.af$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
    }

    boolean A();

    boolean B();

    void a(float f);

    void a(int i, int i2);

    void a(MediaClips mediaClips);

    void a(boolean z);

    void a(boolean z, float f);

    void b(Media media);

    void b(List<Video> list);

    void b(boolean z);

    void c(Media media);

    void c(boolean z);

    void d(boolean z);

    Video g();

    VideoEditInfo h();

    VideoEditInfo o();

    List<Video> q();

    @Override // com.taobao.android.litecreator.sdk.editor.z
    /* synthetic */ AbsEditInfo r();

    Size w();

    long x();

    ag y();

    void z();
}
