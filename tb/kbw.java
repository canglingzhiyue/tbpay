package tb;

import com.taobao.taobaoavsdk.e;
import com.taobao.taobaoavsdk.f;
import java.util.List;

/* loaded from: classes6.dex */
public interface kbw {
    int getHeight();

    int getWidth();

    List<f> hitTest(List<e> list);

    void refreshScreen();

    void setFov(float f, float f2, float f3);
}
