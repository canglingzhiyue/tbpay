package tb;

import android.content.Context;
import android.view.View;
import com.taobao.android.weex.WeexInstance;
import java.util.Map;

/* loaded from: classes8.dex */
public interface nzo {

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str, String str2, Map<String, Object> map, String str3, int i, int i2);

        void d();
    }

    /* loaded from: classes8.dex */
    public interface b {
        void viewCreated(View view);

        void viewReady();

        void weexError(String str);
    }

    a a(Context context, b bVar);

    void a();

    void b();

    void c();

    WeexInstance f();
}
