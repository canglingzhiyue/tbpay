package tb;

import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.s;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public interface pos extends ppm {

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onSwitchNewDefinitionError(s sVar, int i);

        void onSwitchNewDefinitionSuccess(s sVar, int i);
    }

    /* loaded from: classes8.dex */
    public interface c {
        void onUpdateUrlListError(List<s> list);

        void onUpdateUrlListSuccess(List<s> list);
    }

    void a();

    void a(int i);

    void a(int i, String str);

    void a(IMediaPlayer iMediaPlayer, boolean z);

    void a(Object obj);

    void a(String str);

    void a(String str, c cVar);

    void a(a aVar);

    void a(b bVar);

    void a(c cVar);

    void b();

    void b(String str);

    void b(b bVar);

    int c();

    void c(String str);

    boolean d();

    HashMap<String, String> e();
}
