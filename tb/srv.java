package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;

/* loaded from: classes6.dex */
public interface srv {
    void a(c cVar, int i);

    void a(BootImageInfo bootImageInfo, c cVar, int i);

    void a(List<JSONObject> list, int i);

    void b(List<JSONObject> list, int i);

    void onTerminate(int i, int i2, int i3);
}
