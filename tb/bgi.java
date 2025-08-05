package tb;

import android.os.Handler;
import com.alibaba.android.split.SplitFileInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface bgi<Param> {

    /* loaded from: classes2.dex */
    public interface a<Param> {
        void a(int i);

        void a(String str, int i, String str2);

        void a(String str, String str2);

        void a(boolean z);
    }

    /* loaded from: classes2.dex */
    public interface b<Param> extends a<Param> {
        void a(String str, Map<String, String> map);
    }

    int a(List<SplitFileInfo> list, Param param, Executor executor, Handler handler, b<Param> bVar);

    Param a();

    void a(int i);

    void b(int i);
}
