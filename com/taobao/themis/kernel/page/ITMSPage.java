package com.taobao.themis.kernel.page;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.d;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.f;
import kotlin.Deprecated;
import tb.qpm;
import tb.qqa;
import tb.qqp;

/* loaded from: classes9.dex */
public interface ITMSPage extends d {

    /* loaded from: classes9.dex */
    public enum PageStatusEnum {
        INIT,
        ON_START,
        ON_RESUME,
        ON_VIEW_APPEAR,
        ON_VIEW_DISAPPEAR,
        ON_PAUSE,
        ON_STOP,
        DESTROYED
    }

    <T> T a(Class<T> cls);

    void a(int i, int i2, Intent intent);

    void a(g gVar);

    @Deprecated(message = "use sendEventToRender")
    void a(String str, JSON json);

    void a(String str, String str2);

    void a(String str, String str2, JSON json);

    void a(qpm qpmVar);

    void a(qqa.a aVar);

    void a(qqa.b bVar);

    void a(qqp qqpVar);

    void a(byte[] bArr, String str);

    f b();

    void b(g gVar);

    void b(String str, JSON json);

    void b(qqa.b bVar);

    com.taobao.themis.kernel.entity.a c();

    TMSJSAPIHandler d();

    String e();

    qpm f();

    View g();

    void h();

    void i();

    void j();

    void k();

    boolean l();

    Bitmap m();

    PageStatusEnum n();

    String o();

    void p();

    void q();

    void u();

    void v();
}
